package bf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d {
    public static volatile long f1675g;
    public static volatile long h;
    public static final HashSet f1676i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f1677a;
    public final int f1679c;
    public int d;
    public boolean f1681f;
    public String f1678b = null;
    public final ArrayList f1680e = new ArrayList();

    public d(int i9) {
        this.f1679c = i9;
        this.f1677a = UserConfig.getInstance(i9).clientUserId;
        SharedPreferences d = d();
        try {
            f1675g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new b(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f22386id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f1672a = document;
        int i9 = this.d;
        this.d = i9 + 1;
        obj.f1674c = i9;
        obj.d = false;
        this.f1680e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f1681f) {
            f(true);
            this.f1681f = true;
        }
        Utilities.globalQueue.postRunnable(new a1.e(7, this, new ArrayList(this.f1680e)));
    }

    public final TLRPC.Document c(long j10) {
        ArrayList arrayList = this.f1680e;
        if (!this.f1681f) {
            f(true);
            this.f1681f = true;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                if (arrayList.get(i9) != null && ((c) arrayList.get(i9)).f1672a != null && ((c) arrayList.get(i9)).f1672a.f22386id == j10) {
                    return ((c) arrayList.get(i9)).f1672a;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f1678b == null) {
            this.f1678b = "ringtones_pref_" + this.f1677a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f1678b, 0);
    }

    public final String e(long j10) {
        if (!this.f1681f) {
            f(true);
            this.f1681f = true;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f1680e;
            if (i9 < arrayList.size()) {
                if (((c) arrayList.get(i9)).f1672a != null && ((c) arrayList.get(i9)).f1672a.f22386id == j10) {
                    if (!TextUtils.isEmpty(((c) arrayList.get(i9)).f1673b)) {
                        return ((c) arrayList.get(i9)).f1673b;
                    }
                    return FileLoader.getInstance(this.f1679c).getPathToAttach(((c) arrayList.get(i9)).f1672a).toString();
                }
                i9++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z10) {
        boolean z11;
        SharedPreferences d = d();
        int i9 = d.getInt("count", 0);
        ArrayList arrayList = this.f1680e;
        arrayList.clear();
        for (int i10 = 0; i10 < i9; i10++) {
            String string = d.getString("tone_document" + i10, "");
            String string2 = d.getString("tone_local_path" + i10, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f1672a = TLdeserialize;
                obj.f1673b = string2;
                int i11 = this.d;
                this.d = i11 + 1;
                obj.f1674c = i11;
                arrayList.add(obj);
            } finally {
                if (!z11) {
                }
            }
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new b(this, 1));
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        if (!z10 && System.currentTimeMillis() - h <= 86400000) {
            z11 = false;
        } else {
            z11 = true;
        }
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = f1675g;
        if (z11) {
            ConnectionsManager.getInstance(this.f1679c).sendRequest(getsavedringtones, new a(this, 0));
            return;
        }
        if (!this.f1681f) {
            f(true);
            this.f1681f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1680e;
            if (i9 < arrayList.size()) {
                if (!((c) arrayList.get(i9)).d) {
                    i10++;
                    TLRPC.Document document = ((c) arrayList.get(i9)).f1672a;
                    String str = ((c) arrayList.get(i9)).f1673b;
                    SerializedData serializedData = new SerializedData(document.getObjectSize());
                    document.serializeToStream(serializedData);
                    edit.putString("tone_document" + i9, Utilities.bytesToHex(serializedData.toByteArray()));
                    if (str != null) {
                        edit.putString("tone_local_path" + i9, str);
                    }
                }
                i9++;
            } else {
                edit.putInt("count", i10);
                edit.apply();
                NotificationCenter.getInstance(this.f1679c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
        }
    }
}
