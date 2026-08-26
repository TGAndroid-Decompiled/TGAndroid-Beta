package org.telegram.messenger.ringtone;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;

public final class RingtoneDataStore {
    public static volatile long lastReloadTimeMs;
    public static volatile long queryHash;
    public static final HashSet ringtoneSupportedMimeType = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long clientUserId;
    public final int currentAccount;
    public boolean loaded;
    public int localIds;
    public String prefName = null;
    public final ArrayList userRingtones = new ArrayList();

    public final class CachedTone {
        public TLRPC.Document document;
        public int localId;
        public String localUri;
        public boolean uploading;
    }

    public RingtoneDataStore(int i) {
        this.currentAccount = i;
        this.clientUserId = UserConfig.getInstance(i).clientUserId;
        SharedPreferences sharedPreferences = getSharedPreferences();
        try {
            queryHash = sharedPreferences.getLong("hash", 0L);
            lastReloadTimeMs = sharedPreferences.getLong("lastReload", 0L);
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new RingtoneDataStore$$ExternalSyntheticLambda1(this, 0));
    }

    public final void checkRingtoneSoundsLoaded() {
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        Utilities.globalQueue.postRunnable(new ClickHelper$$ExternalSyntheticLambda0(7, this, new ArrayList(this.userRingtones)));
    }

    public final TLRPC.Document getDocument(long j) {
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.userRingtones;
            try {
                if (i >= arrayList.size()) {
                    return null;
                }
                if (arrayList.get(i) != null && ((CachedTone) arrayList.get(i)).document != null && ((CachedTone) arrayList.get(i)).document.id == j) {
                    return ((CachedTone) arrayList.get(i)).document;
                }
                i++;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
    }

    public final SharedPreferences getSharedPreferences() {
        if (this.prefName == null) {
            this.prefName = "ringtones_pref_" + this.clientUserId;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.prefName, 0);
    }

    public final String getSoundPath(long j) {
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.userRingtones;
            if (i >= arrayList.size()) {
                return "NoSound";
            }
            if (((CachedTone) arrayList.get(i)).document != null && ((CachedTone) arrayList.get(i)).document.id == j) {
                return !TextUtils.isEmpty(((CachedTone) arrayList.get(i)).localUri) ? ((CachedTone) arrayList.get(i)).localUri : FileLoader.getInstance(this.currentAccount).getPathToAttach(((CachedTone) arrayList.get(i)).document).toString();
            }
            i++;
        }
    }

    public final void loadFromPrefs(boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        int i = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = this.userRingtones;
        arrayList.clear();
        for (int i2 = 0; i2 < i; i2++) {
            String string = sharedPreferences.getString("tone_document" + i2, "");
            String string2 = sharedPreferences.getString("tone_local_path" + i2, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document documentTLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                CachedTone cachedTone = new CachedTone();
                cachedTone.document = documentTLdeserialize;
                cachedTone.localUri = string2;
                int i3 = this.localIds;
                this.localIds = i3 + 1;
                cachedTone.localId = i3;
                arrayList.add(cachedTone);
            } catch (Throwable th) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw th;
                }
                FileLog.e(th);
            }
        }
        if (z) {
            AndroidUtilities.runOnUIThread(new RingtoneDataStore$$ExternalSyntheticLambda1(this, 1));
        }
    }

    public final void loadUserRingtones(boolean z) {
        boolean z2 = z || System.currentTimeMillis() - lastReloadTimeMs > 86400000;
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = queryHash;
        if (z2) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getsavedringtones, new CallLogActivity$$ExternalSyntheticLambda1(this, 1));
            return;
        }
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        checkRingtoneSoundsLoaded();
    }

    public final void saveTones() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.userRingtones;
            if (i >= arrayList.size()) {
                editorEdit.putInt("count", i2);
                editorEdit.apply();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
            if (!((CachedTone) arrayList.get(i)).uploading) {
                i2++;
                TLRPC.Document document = ((CachedTone) arrayList.get(i)).document;
                String str = ((CachedTone) arrayList.get(i)).localUri;
                SerializedData serializedData = new SerializedData(document.getObjectSize());
                document.serializeToStream(serializedData);
                editorEdit.putString("tone_document" + i, Utilities.bytesToHex(serializedData.toByteArray()));
                if (str != null) {
                    editorEdit.putString("tone_local_path" + i, str);
                }
            }
            i++;
        }
    }
}
