package gf;

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
public final class e {
    public static volatile long f7036g;
    public static volatile long h;
    public static final HashSet f7037i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f7038a;
    public final int f7040c;
    public int d;
    public boolean f7042f;
    public String f7039b = null;
    public final ArrayList f7041e = new ArrayList();

    public e(int i10) {
        this.f7040c = i10;
        this.f7038a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences d = d();
        try {
            f7036g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        AndroidUtilities.runOnUIThread(new b(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f20849id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f7033a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        obj.f7035c = i10;
        obj.d = false;
        this.f7041e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f7042f) {
            f(true);
            this.f7042f = true;
        }
        Utilities.globalQueue.postRunnable(new c(0, this, new ArrayList(this.f7041e)));
    }

    public final TLRPC.Document c(long j10) {
        ArrayList arrayList = this.f7041e;
        if (!this.f7042f) {
            f(true);
            this.f7042f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((d) arrayList.get(i10)).f7033a != null && ((d) arrayList.get(i10)).f7033a.f20849id == j10) {
                    return ((d) arrayList.get(i10)).f7033a;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f7039b == null) {
            this.f7039b = "ringtones_pref_" + this.f7038a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f7039b, 0);
    }

    public final String e(long j10) {
        if (!this.f7042f) {
            f(true);
            this.f7042f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f7041e;
            if (i10 < arrayList.size()) {
                if (((d) arrayList.get(i10)).f7033a != null && ((d) arrayList.get(i10)).f7033a.f20849id == j10) {
                    if (!TextUtils.isEmpty(((d) arrayList.get(i10)).f7034b)) {
                        return ((d) arrayList.get(i10)).f7034b;
                    }
                    return FileLoader.getInstance(this.f7040c).getPathToAttach(((d) arrayList.get(i10)).f7033a).toString();
                }
                i10++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z4) {
        boolean z10;
        SharedPreferences d = d();
        int i10 = d.getInt("count", 0);
        ArrayList arrayList = this.f7041e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f7033a = TLdeserialize;
                obj.f7034b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                obj.f7035c = i12;
                arrayList.add(obj);
            } finally {
                if (!z10) {
                }
            }
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new b(this, 1));
        }
    }

    public final void g(boolean z4) {
        boolean z10;
        if (!z4 && System.currentTimeMillis() - h <= 86400000) {
            z10 = false;
        } else {
            z10 = true;
        }
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = f7036g;
        if (z10) {
            ConnectionsManager.getInstance(this.f7040c).sendRequest(getsavedringtones, new a(this, 0));
            return;
        }
        if (!this.f7042f) {
            f(true);
            this.f7042f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f7041e;
            if (i10 < arrayList.size()) {
                if (!((d) arrayList.get(i10)).d) {
                    i11++;
                    TLRPC.Document document = ((d) arrayList.get(i10)).f7033a;
                    String str = ((d) arrayList.get(i10)).f7034b;
                    SerializedData serializedData = new SerializedData(document.getObjectSize());
                    document.serializeToStream(serializedData);
                    edit.putString("tone_document" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
                    if (str != null) {
                        edit.putString("tone_local_path" + i10, str);
                    }
                }
                i10++;
            } else {
                edit.putInt("count", i11);
                edit.apply();
                NotificationCenter.getInstance(this.f7040c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
        }
    }
}
