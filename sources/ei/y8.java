package ei;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class y8 extends pg.a {
    public int f10136c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f10137f;
    public TLRPC.User f10138g;
    public TLRPC.Chat h;
    public int f10139i;
    public int f10140j;
    public boolean f10141k;
    public boolean f10142l;
    public boolean f10143m;
    public boolean f10144n;
    public int f10145o;
    public int f10146p;
    public int f10147q;

    public y8(int i10, boolean z10) {
        super(i10, z10);
        this.f10146p = -1;
    }

    public static y8 b(String str, CharSequence charSequence, int i10) {
        y8 y8Var = new y8(9, false);
        y8Var.e = str;
        y8Var.f10137f = charSequence;
        y8Var.f10147q = i10;
        return y8Var;
    }

    public static y8 c() {
        return new y8(0, false);
    }

    public static y8 d() {
        y8 y8Var = new y8(-1, false);
        y8Var.f10145o = -1;
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
        y8Var.f10139i = i10;
        y8Var.f10141k = z10;
        y8Var.f10140j = i11;
        return y8Var;
    }

    public static y8 i(TLRPC.User user, boolean z10, boolean z11) {
        y8 y8Var = new y8(3, true);
        y8Var.f10138g = user;
        y8Var.f10141k = z10;
        y8Var.f10142l = z11;
        return y8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y8.class == obj.getClass()) {
                y8 y8Var = (y8) obj;
                int i10 = this.f44291a;
                if (i10 == y8Var.f44291a) {
                    if (i10 != -1 || (this.f10145o == y8Var.f10145o && this.f10146p == y8Var.f10146p)) {
                        if (i10 != 3 || (this.f10138g == y8Var.f10138g && this.h == y8Var.h && this.f10139i == y8Var.f10139i && this.f10140j == y8Var.f10140j && this.f10141k == y8Var.f10141k && this.f10143m == y8Var.f10143m && this.f10144n == y8Var.f10144n)) {
                            if (i10 != 0 || this.f10136c == y8Var.f10136c) {
                                if (i10 != 2 || TextUtils.equals(this.e, y8Var.e)) {
                                    if (this.f44291a != 8 || TextUtils.equals(this.e, y8Var.e)) {
                                        int i11 = this.f44291a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10137f, y8Var.f10137f))) {
                                            if (this.f44291a != 6 || (TextUtils.equals(this.e, y8Var.e) && this.f10136c == y8Var.f10136c)) {
                                                if (this.f44291a != 7 || (this.f10136c == y8Var.f10136c && TextUtils.equals(this.e, y8Var.e) && this.f10141k == y8Var.f10141k)) {
                                                    if (this.f44291a != 9 || (this.f10147q == y8Var.f10147q && this.d == y8Var.d && TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10137f, y8Var.f10137f))) {
                                                        if (this.f44291a != 10 || this.f10147q == y8Var.f10147q) {
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
