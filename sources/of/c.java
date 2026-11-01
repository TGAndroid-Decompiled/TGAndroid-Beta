package of;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import mh.k;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.v2;
import org.telegram.messenger.w0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class c {
    public static volatile long f14157g;
    public static volatile long h;
    public static final HashSet f14158i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f14159a;
    public final int f14161c;
    public int d;
    public boolean f14162f;
    public String f14160b = null;
    public final ArrayList e = new ArrayList();

    public c(int i10) {
        this.f14161c = i10;
        this.f14159a = e20.i(i10).f15524n;
        SharedPreferences d = d();
        try {
            f14157g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e) {
            f8.g(e, true);
        }
        i0.g3(new a(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f19800id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f14154a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        obj.f14156c = i10;
        obj.d = false;
        this.e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f14162f) {
            f(true);
            this.f14162f = true;
        }
        Utilities.e.c(new k(4, this, new ArrayList(this.e)));
    }

    public final TLRPC.Document c(long j10) {
        ArrayList arrayList = this.e;
        if (!this.f14162f) {
            f(true);
            this.f14162f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((b) arrayList.get(i10)).f14154a != null && ((b) arrayList.get(i10)).f14154a.f19800id == j10) {
                    return ((b) arrayList.get(i10)).f14154a;
                }
            } catch (Exception e) {
                f8.g(e, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f14160b == null) {
            this.f14160b = "ringtones_pref_" + this.f14159a;
        }
        return w0.f18945b.getSharedPreferences(this.f14160b, 0);
    }

    public final String e(long j10) {
        if (!this.f14162f) {
            f(true);
            this.f14162f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                if (((b) arrayList.get(i10)).f14154a != null && ((b) arrayList.get(i10)).f14154a.f19800id == j10) {
                    if (!TextUtils.isEmpty(((b) arrayList.get(i10)).f14155b)) {
                        return ((b) arrayList.get(i10)).f14155b;
                    }
                    b8.G(this.f14161c);
                    return b8.I(((b) arrayList.get(i10)).f14154a).toString();
                }
                i10++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z10) {
        SharedPreferences d = d();
        int i10 = d.getInt("count", 0);
        ArrayList arrayList = this.e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f14154a = TLdeserialize;
                obj.f14155b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                obj.f14156c = i12;
                arrayList.add(obj);
            } catch (Throwable th2) {
                boolean z11 = v2.f18578a;
                f8.g(th2, true);
            }
        }
        if (z10) {
            i0.g3(new a(this, 1));
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
        getsavedringtones.hash = f14157g;
        if (z11) {
            ConnectionsManager.getInstance(this.f14161c).sendRequest(getsavedringtones, new ag.c(this, 11));
            return;
        }
        if (!this.f14162f) {
            f(true);
            this.f14162f = true;
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
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                if (!((b) arrayList.get(i10)).d) {
                    i11++;
                    TLRPC.Document document = ((b) arrayList.get(i10)).f14154a;
                    String str = ((b) arrayList.get(i10)).f14155b;
                    SerializedData serializedData = new SerializedData(document.getObjectSize());
                    document.serializeToStream(serializedData);
                    edit.putString("tone_document" + i10, Utilities.f(serializedData.toByteArray()));
                    if (str != null) {
                        edit.putString("tone_local_path" + i10, str);
                    }
                }
                i10++;
            } else {
                edit.putInt("count", i11);
                edit.apply();
                at.f(this.f14161c).k(at.f14703e5, new Object[0]);
                return;
            }
        }
    }
}
