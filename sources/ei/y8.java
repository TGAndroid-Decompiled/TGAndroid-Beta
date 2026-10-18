package ei;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class y8 extends pg.a {
    public int f10138c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f10139f;
    public TLRPC.User f10140g;
    public TLRPC.Chat h;
    public int f10141i;
    public int f10142j;
    public boolean f10143k;
    public boolean f10144l;
    public boolean f10145m;
    public boolean f10146n;
    public int f10147o;
    public int f10148p;
    public int f10149q;

    public y8(int i10, boolean z10) {
        super(i10, z10);
        this.f10148p = -1;
    }

    public static y8 b(String str, CharSequence charSequence, int i10) {
        y8 y8Var = new y8(9, false);
        y8Var.e = str;
        y8Var.f10139f = charSequence;
        y8Var.f10149q = i10;
        return y8Var;
    }

    public static y8 c() {
        return new y8(0, false);
    }

    public static y8 d() {
        y8 y8Var = new y8(-1, false);
        y8Var.f10147o = -1;
        return y8Var;
    }

    public static y8 e() {
        return new y8(1, false);
    }

    public static y8 f() {
        return new y8(2, false);
    }

    public static y8 g(CharSequence charSequence) {
        y8 y8Var = new y8(6, false);
        y8Var.e = charSequence;
        return y8Var;
    }

    public static y8 h(int i10, int i11, boolean z10) {
        y8 y8Var = new y8(3, false);
        y8Var.f10141i = i10;
        y8Var.f10143k = z10;
        y8Var.f10142j = i11;
        return y8Var;
    }

    public static y8 i(TLRPC.User user, boolean z10, boolean z11) {
        y8 y8Var = new y8(3, true);
        y8Var.f10140g = user;
        y8Var.f10143k = z10;
        y8Var.f10144l = z11;
        return y8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y8.class == obj.getClass()) {
                y8 y8Var = (y8) obj;
                int i10 = this.f44334a;
                if (i10 == y8Var.f44334a) {
                    if (i10 != -1 || (this.f10147o == y8Var.f10147o && this.f10148p == y8Var.f10148p)) {
                        if (i10 != 3 || (this.f10140g == y8Var.f10140g && this.h == y8Var.h && this.f10141i == y8Var.f10141i && this.f10142j == y8Var.f10142j && this.f10143k == y8Var.f10143k && this.f10145m == y8Var.f10145m && this.f10146n == y8Var.f10146n)) {
                            if (i10 != 0 || this.f10138c == y8Var.f10138c) {
                                if (i10 != 2 || TextUtils.equals(this.e, y8Var.e)) {
                                    if (this.f44334a != 8 || TextUtils.equals(this.e, y8Var.e)) {
                                        int i11 = this.f44334a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10139f, y8Var.f10139f))) {
                                            if (this.f44334a != 6 || (TextUtils.equals(this.e, y8Var.e) && this.f10138c == y8Var.f10138c)) {
                                                if (this.f44334a != 7 || (this.f10138c == y8Var.f10138c && TextUtils.equals(this.e, y8Var.e) && this.f10143k == y8Var.f10143k)) {
                                                    if (this.f44334a != 9 || (this.f10149q == y8Var.f10149q && this.d == y8Var.d && TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10139f, y8Var.f10139f))) {
                                                        if (this.f44334a != 10 || this.f10149q == y8Var.f10149q) {
                                                            return true;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
