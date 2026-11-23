package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class z7 extends rg.a {
    public int f15813c;
    public Drawable d;
    public CharSequence f15814e;
    public CharSequence f15815f;
    public TLRPC.User f15816g;
    public TLRPC.Chat h;
    public int f15817i;
    public int f15818j;
    public boolean f15819k;
    public boolean f15820l;
    public boolean f15821m;
    public boolean f15822n;
    public int f15823o;
    public int f15824p;
    public int f15825q;

    public z7(int i7, boolean z10) {
        super(i7, z10);
        this.f15824p = -1;
    }

    public static z7 b(String str, CharSequence charSequence, int i7) {
        z7 z7Var = new z7(9, false);
        z7Var.f15814e = str;
        z7Var.f15815f = charSequence;
        z7Var.f15825q = i7;
        return z7Var;
    }

    public static z7 c() {
        return new z7(0, false);
    }

    public static z7 d() {
        z7 z7Var = new z7(-1, false);
        z7Var.f15823o = -1;
        return z7Var;
    }

    public static z7 e() {
        return new z7(1, false);
    }

    public static z7 f() {
        return new z7(2, false);
    }

    public static z7 g(CharSequence charSequence) {
        z7 z7Var = new z7(6, false);
        z7Var.f15814e = charSequence;
        return z7Var;
    }

    public static z7 h(int i7, int i10, boolean z10) {
        z7 z7Var = new z7(3, false);
        z7Var.f15817i = i7;
        z7Var.f15819k = z10;
        z7Var.f15818j = i10;
        return z7Var;
    }

    public static z7 i(TLRPC.User user, boolean z10, boolean z11) {
        z7 z7Var = new z7(3, true);
        z7Var.f15816g = user;
        z7Var.f15819k = z10;
        z7Var.f15820l = z11;
        return z7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z7.class == obj.getClass()) {
                z7 z7Var = (z7) obj;
                int i7 = this.f56599a;
                if (i7 == z7Var.f56599a) {
                    if (i7 != -1 || (this.f15823o == z7Var.f15823o && this.f15824p == z7Var.f15824p)) {
                        if (i7 != 3 || (this.f15816g == z7Var.f15816g && this.h == z7Var.h && this.f15817i == z7Var.f15817i && this.f15818j == z7Var.f15818j && this.f15819k == z7Var.f15819k && this.f15821m == z7Var.f15821m && this.f15822n == z7Var.f15822n)) {
                            if (i7 != 0 || this.f15813c == z7Var.f15813c) {
                                if (i7 != 2 || TextUtils.equals(this.f15814e, z7Var.f15814e)) {
                                    if (this.f56599a != 8 || TextUtils.equals(this.f15814e, z7Var.f15814e)) {
                                        int i10 = this.f56599a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f15814e, z7Var.f15814e) && TextUtils.equals(this.f15815f, z7Var.f15815f))) {
                                            if (this.f56599a != 6 || (TextUtils.equals(this.f15814e, z7Var.f15814e) && this.f15813c == z7Var.f15813c)) {
                                                if (this.f56599a != 7 || (this.f15813c == z7Var.f15813c && TextUtils.equals(this.f15814e, z7Var.f15814e) && this.f15819k == z7Var.f15819k)) {
                                                    if (this.f56599a != 9 || (this.f15825q == z7Var.f15825q && this.d == z7Var.d && TextUtils.equals(this.f15814e, z7Var.f15814e) && TextUtils.equals(this.f15815f, z7Var.f15815f))) {
                                                        if (this.f56599a != 10 || this.f15825q == z7Var.f15825q) {
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
