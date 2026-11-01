package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class ew extends dw {
    public int d;

    public static void c(ew ewVar, String str, SharedPreferences sharedPreferences) {
        ewVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), ewVar.f15447a).putBoolean(str.concat("_save_gallery_video"), ewVar.f15448b).putLong(str.concat("_save_gallery_limitVideo"), ewVar.f15449c).apply();
    }

    public static ew d(String str, SharedPreferences sharedPreferences) {
        ?? dwVar = new dw();
        dwVar.f15447a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        dwVar.f15448b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        dwVar.f15449c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return dwVar;
    }

    @Override
    public final void b() {
        super.b();
        ks.n(this.d);
    }

    public final CharSequence e(int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.f15447a) {
                sb2.append(dd.L0(2131745937, null));
            }
            if (this.f15448b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(dd.L0(2131745930, null));
                long j10 = this.f15449c;
                if (j10 > 0 && j10 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(i0.i0(this.f15449c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(dd.L0(2131745938, null));
        }
        LongSparseArray m10 = e20.i(i10).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(dd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
