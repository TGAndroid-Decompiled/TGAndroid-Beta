package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class sv extends rv {
    public int d;

    public static void c(sv svVar, String str, SharedPreferences sharedPreferences) {
        svVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), svVar.f25345a).putBoolean(str.concat("_save_gallery_video"), svVar.f25346b).putLong(str.concat("_save_gallery_limitVideo"), svVar.f25347c).apply();
    }

    public static sv d(String str, SharedPreferences sharedPreferences) {
        ?? rvVar = new rv();
        rvVar.f25345a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        rvVar.f25346b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        rvVar.f25347c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return rvVar;
    }

    @Override
    public final void b() {
        super.b();
        b6.m(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.f25345a) {
                sb2.append(id.M0(2131745923, null));
            }
            if (this.f25346b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(id.M0(2131745916, null));
                long j3 = this.f25347c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.f25347c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(id.M0(2131745924, null));
        }
        LongSparseArray m10 = p10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(id.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
