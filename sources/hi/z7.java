package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class z7 extends rg.a {
    public int f15819c;
    public Drawable d;
    public CharSequence f15820e;
    public CharSequence f15821f;
    public TLRPC.User f15822g;
    public TLRPC.Chat h;
    public int f15823i;
    public int f15824j;
    public boolean f15825k;
    public boolean f15826l;
    public boolean f15827m;
    public boolean f15828n;
    public int f15829o;
    public int f15830p;
    public int f15831q;

    public z7(int i7, boolean z10) {
        super(i7, z10);
        this.f15830p = -1;
    }

    public static z7 b(String str, CharSequence charSequence, int i7) {
        z7 z7Var = new z7(9, false);
        z7Var.f15820e = str;
        z7Var.f15821f = charSequence;
        z7Var.f15831q = i7;
        return z7Var;
    }

    public static z7 c() {
        return new z7(0, false);
    }

    public static z7 d() {
        z7 z7Var = new z7(-1, false);
        z7Var.f15829o = -1;
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
        z7Var.f15820e = charSequence;
        return z7Var;
    }

    public static z7 h(int i7, int i10, boolean z10) {
        z7 z7Var = new z7(3, false);
        z7Var.f15823i = i7;
        z7Var.f15825k = z10;
        z7Var.f15824j = i10;
        return z7Var;
    }

    public static z7 i(TLRPC.User user, boolean z10, boolean z11) {
        z7 z7Var = new z7(3, true);
        z7Var.f15822g = user;
        z7Var.f15825k = z10;
        z7Var.f15826l = z11;
        return z7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z7.class == obj.getClass()) {
                z7 z7Var = (z7) obj;
                int i7 = this.f56589a;
                if (i7 == z7Var.f56589a) {
                    if (i7 != -1 || (this.f15829o == z7Var.f15829o && this.f15830p == z7Var.f15830p)) {
                        if (i7 != 3 || (this.f15822g == z7Var.f15822g && this.h == z7Var.h && this.f15823i == z7Var.f15823i && this.f15824j == z7Var.f15824j && this.f15825k == z7Var.f15825k && this.f15827m == z7Var.f15827m && this.f15828n == z7Var.f15828n)) {
                            if (i7 != 0 || this.f15819c == z7Var.f15819c) {
                                if (i7 != 2 || TextUtils.equals(this.f15820e, z7Var.f15820e)) {
                                    if (this.f56589a != 8 || TextUtils.equals(this.f15820e, z7Var.f15820e)) {
                                        int i10 = this.f56589a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f15820e, z7Var.f15820e) && TextUtils.equals(this.f15821f, z7Var.f15821f))) {
                                            if (this.f56589a != 6 || (TextUtils.equals(this.f15820e, z7Var.f15820e) && this.f15819c == z7Var.f15819c)) {
                                                if (this.f56589a != 7 || (this.f15819c == z7Var.f15819c && TextUtils.equals(this.f15820e, z7Var.f15820e) && this.f15825k == z7Var.f15825k)) {
                                                    if (this.f56589a != 9 || (this.f15831q == z7Var.f15831q && this.d == z7Var.d && TextUtils.equals(this.f15820e, z7Var.f15820e) && TextUtils.equals(this.f15821f, z7Var.f15821f))) {
                                                        if (this.f56589a != 10 || this.f15831q == z7Var.f15831q) {
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
