package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class mv extends lv {
    public int d;

    public static void c(mv mvVar, String str, SharedPreferences sharedPreferences) {
        mvVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), mvVar.f25559a).putBoolean(str.concat("_save_gallery_video"), mvVar.f25560b).putLong(str.concat("_save_gallery_limitVideo"), mvVar.f25561c).apply();
    }

    public static mv d(String str, SharedPreferences sharedPreferences) {
        ?? lvVar = new lv();
        lvVar.f25559a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        lvVar.f25560b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        lvVar.f25561c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return lvVar;
    }

    @Override
    public final void b() {
        super.b();
        c6.o(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.f25559a) {
                sb2.append(gd.N0(2131745724, null));
            }
            if (this.f25560b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(gd.N0(2131745717, null));
                long j3 = this.f25561c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.f25561c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(gd.N0(2131745725, null));
        }
        LongSparseArray m10 = i10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(gd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
