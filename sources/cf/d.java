package cf;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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

public final class d {

    public static volatile long f2579g;
    public static volatile long h;

    public static final HashSet f2580i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));

    public final long f2581a;

    public final int f2583c;
    public int d;

    public boolean f2585f;

    public String f2582b = null;

    public final ArrayList f2584e = new ArrayList();

    public d(int i10) {
        this.f2583c = i10;
        this.f2581a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences sharedPreferencesD = d();
        try {
            f2579g = sharedPreferencesD.getLong("hash", 0L);
            h = sharedPreferencesD.getLong("lastReload", 0L);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AndroidUtilities.runOnUIThread(new b(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f22386id) != null) {
            return;
        }
        c cVar = new c();
        cVar.f2576a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        cVar.f2578c = i10;
        cVar.d = false;
        this.f2584e.add(cVar);
        h();
    }

    public final void b() {
        if (!this.f2585f) {
            f(true);
            this.f2585f = true;
        }
        Utilities.globalQueue.postRunnable(new a1.e(17, this, new ArrayList(this.f2584e)));
    }

    public final TLRPC.Document c(long j10) {
        ArrayList arrayList = this.f2584e;
        if (!this.f2585f) {
            f(true);
            this.f2585f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((c) arrayList.get(i10)).f2576a != null && ((c) arrayList.get(i10)).f2576a.f22386id == j10) {
                    return ((c) arrayList.get(i10)).f2576a;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f2582b == null) {
            this.f2582b = "ringtones_pref_" + this.f2581a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f2582b, 0);
    }

    public final String e(long j10) {
        if (!this.f2585f) {
            f(true);
            this.f2585f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2584e;
            if (i10 >= arrayList.size()) {
                return "NoSound";
            }
            if (((c) arrayList.get(i10)).f2576a != null && ((c) arrayList.get(i10)).f2576a.f22386id == j10) {
                return !TextUtils.isEmpty(((c) arrayList.get(i10)).f2577b) ? ((c) arrayList.get(i10)).f2577b : FileLoader.getInstance(this.f2583c).getPathToAttach(((c) arrayList.get(i10)).f2576a).toString();
            }
            i10++;
        }
    }

    public final void f(boolean z10) {
        SharedPreferences sharedPreferencesD = d();
        int i10 = sharedPreferencesD.getInt("count", 0);
        ArrayList arrayList = this.f2584e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = sharedPreferencesD.getString("tone_document" + i11, "");
            String string2 = sharedPreferencesD.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document documentTLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                c cVar = new c();
                cVar.f2576a = documentTLdeserialize;
                cVar.f2577b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                cVar.f2578c = i12;
                arrayList.add(cVar);
            } catch (Throwable th) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw th;
                }
                FileLog.e(th);
            }
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new b(this, 1));
        }
    }

    public final void g(boolean z10) {
        boolean z11 = z10 || System.currentTimeMillis() - h > 86400000;
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = f2579g;
        if (z11) {
            ConnectionsManager.getInstance(this.f2583c).sendRequest(getsavedringtones, new a(this, 0));
            return;
        }
        if (!this.f2585f) {
            f(true);
            this.f2585f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences sharedPreferencesD = d();
        sharedPreferencesD.edit().clear().apply();
        SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f2584e;
            if (i10 >= arrayList.size()) {
                editorEdit.putInt("count", i11);
                editorEdit.apply();
                NotificationCenter.getInstance(this.f2583c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
            if (!((c) arrayList.get(i10)).d) {
                i11++;
                TLRPC.Document document = ((c) arrayList.get(i10)).f2576a;
                String str = ((c) arrayList.get(i10)).f2577b;
                SerializedData serializedData = new SerializedData(document.getObjectSize());
                document.serializeToStream(serializedData);
                editorEdit.putString("tone_document" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
                if (str != null) {
                    editorEdit.putString("tone_local_path" + i10, str);
                }
            }
            i10++;
        }
    }
}
