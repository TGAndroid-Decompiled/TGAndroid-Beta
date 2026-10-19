package ei;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class y8 extends pg.a {
    public int f10137c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f10138f;
    public TLRPC.User f10139g;
    public TLRPC.Chat h;
    public int f10140i;
    public int f10141j;
    public boolean f10142k;
    public boolean f10143l;
    public boolean f10144m;
    public boolean f10145n;
    public int f10146o;
    public int f10147p;
    public int f10148q;

    public y8(int i10, boolean z10) {
        super(i10, z10);
        this.f10147p = -1;
    }

    public static y8 b(String str, CharSequence charSequence, int i10) {
        y8 y8Var = new y8(9, false);
        y8Var.e = str;
        y8Var.f10138f = charSequence;
        y8Var.f10148q = i10;
        return y8Var;
    }

    public static y8 c() {
        return new y8(0, false);
    }

    public static y8 d() {
        y8 y8Var = new y8(-1, false);
        y8Var.f10146o = -1;
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
        y8Var.f10140i = i10;
        y8Var.f10142k = z10;
        y8Var.f10141j = i11;
        return y8Var;
    }

    public static y8 i(TLRPC.User user, boolean z10, boolean z11) {
        y8 y8Var = new y8(3, true);
        y8Var.f10139g = user;
        y8Var.f10142k = z10;
        y8Var.f10143l = z11;
        return y8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y8.class == obj.getClass()) {
                y8 y8Var = (y8) obj;
                int i10 = this.f44286a;
                if (i10 == y8Var.f44286a) {
                    if (i10 != -1 || (this.f10146o == y8Var.f10146o && this.f10147p == y8Var.f10147p)) {
                        if (i10 != 3 || (this.f10139g == y8Var.f10139g && this.h == y8Var.h && this.f10140i == y8Var.f10140i && this.f10141j == y8Var.f10141j && this.f10142k == y8Var.f10142k && this.f10144m == y8Var.f10144m && this.f10145n == y8Var.f10145n)) {
                            if (i10 != 0 || this.f10137c == y8Var.f10137c) {
                                if (i10 != 2 || TextUtils.equals(this.e, y8Var.e)) {
                                    if (this.f44286a != 8 || TextUtils.equals(this.e, y8Var.e)) {
                                        int i11 = this.f44286a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10138f, y8Var.f10138f))) {
                                            if (this.f44286a != 6 || (TextUtils.equals(this.e, y8Var.e) && this.f10137c == y8Var.f10137c)) {
                                                if (this.f44286a != 7 || (this.f10137c == y8Var.f10137c && TextUtils.equals(this.e, y8Var.e) && this.f10142k == y8Var.f10142k)) {
                                                    if (this.f44286a != 9 || (this.f10148q == y8Var.f10148q && this.d == y8Var.d && TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10138f, y8Var.f10138f))) {
                                                        if (this.f44286a != 10 || this.f10148q == y8Var.f10148q) {
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
