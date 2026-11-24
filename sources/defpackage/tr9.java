package defpackage;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class tr9 extends sr9 {
    public byte d;

    public static tr9 d(String str, SharedPreferences sharedPreferences) {
        ?? sr9Var = new sr9();
        sr9Var.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        sr9Var.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        sr9Var.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return sr9Var;
    }

    @Override
    public final void b() {
        super.b();
        pve.f(this.d);
    }

    public final CharSequence c(int i) {
        StringBuilder sb = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb.append(jb6.M0(2131745654, null));
            }
            if (this.b) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745647, null));
                long j = this.c;
                if (j > 0 && j < 4194304000L) {
                    sb.append(" (");
                    sb.append(gm.i0(this.c, true, false));
                    sb.append(")");
                }
            }
        } else {
            sb.append(jb6.M0(2131745655, null));
        }
        LongSparseArray l = z8c.h(i).l(this.d);
        if (l.size() != 0) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(jb6.G(l.size(), "Exception", Integer.valueOf(l.size())));
        }
        return sb;
    }

    public final void e(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), this.a).putBoolean(str.concat("_save_gallery_video"), this.b).putLong(str.concat("_save_gallery_limitVideo"), this.c).apply();
    }
}
