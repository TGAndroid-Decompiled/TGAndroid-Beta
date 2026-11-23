package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class nv extends mv {
    public int d;

    public static void c(nv nvVar, String str, SharedPreferences sharedPreferences) {
        nvVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), nvVar.f25646a).putBoolean(str.concat("_save_gallery_video"), nvVar.f25647b).putLong(str.concat("_save_gallery_limitVideo"), nvVar.f25648c).apply();
    }

    public static nv d(String str, SharedPreferences sharedPreferences) {
        ?? mvVar = new mv();
        mvVar.f25646a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        mvVar.f25647b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        mvVar.f25648c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return mvVar;
    }

    @Override
    public final void b() {
        super.b();
        c6.o(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.f25646a) {
                sb2.append(hd.N0(2131745724, null));
            }
            if (this.f25647b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.N0(2131745717, null));
                long j3 = this.f25648c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.f25648c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(hd.N0(2131745725, null));
        }
        LongSparseArray m10 = k10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(hd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
