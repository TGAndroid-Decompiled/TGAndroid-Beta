package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class z7 extends rg.a {
    public int f15822c;
    public Drawable d;
    public CharSequence f15823e;
    public CharSequence f15824f;
    public TLRPC.User f15825g;
    public TLRPC.Chat h;
    public int f15826i;
    public int f15827j;
    public boolean f15828k;
    public boolean f15829l;
    public boolean f15830m;
    public boolean f15831n;
    public int f15832o;
    public int f15833p;
    public int f15834q;

    public z7(int i7, boolean z10) {
        super(i7, z10);
        this.f15833p = -1;
    }

    public static z7 b(String str, CharSequence charSequence, int i7) {
        z7 z7Var = new z7(9, false);
        z7Var.f15823e = str;
        z7Var.f15824f = charSequence;
        z7Var.f15834q = i7;
        return z7Var;
    }

    public static z7 c() {
        return new z7(0, false);
    }

    public static z7 d() {
        z7 z7Var = new z7(-1, false);
        z7Var.f15832o = -1;
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
        z7Var.f15823e = charSequence;
        return z7Var;
    }

    public static z7 h(int i7, int i10, boolean z10) {
        z7 z7Var = new z7(3, false);
        z7Var.f15826i = i7;
        z7Var.f15828k = z10;
        z7Var.f15827j = i10;
        return z7Var;
    }

    public static z7 i(TLRPC.User user, boolean z10, boolean z11) {
        z7 z7Var = new z7(3, true);
        z7Var.f15825g = user;
        z7Var.f15828k = z10;
        z7Var.f15829l = z11;
        return z7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z7.class == obj.getClass()) {
                z7 z7Var = (z7) obj;
                int i7 = this.f56589a;
                if (i7 == z7Var.f56589a) {
                    if (i7 != -1 || (this.f15832o == z7Var.f15832o && this.f15833p == z7Var.f15833p)) {
                        if (i7 != 3 || (this.f15825g == z7Var.f15825g && this.h == z7Var.h && this.f15826i == z7Var.f15826i && this.f15827j == z7Var.f15827j && this.f15828k == z7Var.f15828k && this.f15830m == z7Var.f15830m && this.f15831n == z7Var.f15831n)) {
                            if (i7 != 0 || this.f15822c == z7Var.f15822c) {
                                if (i7 != 2 || TextUtils.equals(this.f15823e, z7Var.f15823e)) {
                                    if (this.f56589a != 8 || TextUtils.equals(this.f15823e, z7Var.f15823e)) {
                                        int i10 = this.f56589a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f15823e, z7Var.f15823e) && TextUtils.equals(this.f15824f, z7Var.f15824f))) {
                                            if (this.f56589a != 6 || (TextUtils.equals(this.f15823e, z7Var.f15823e) && this.f15822c == z7Var.f15822c)) {
                                                if (this.f56589a != 7 || (this.f15822c == z7Var.f15822c && TextUtils.equals(this.f15823e, z7Var.f15823e) && this.f15828k == z7Var.f15828k)) {
                                                    if (this.f56589a != 9 || (this.f15834q == z7Var.f15834q && this.d == z7Var.d && TextUtils.equals(this.f15823e, z7Var.f15823e) && TextUtils.equals(this.f15824f, z7Var.f15824f))) {
                                                        if (this.f56589a != 10 || this.f15834q == z7Var.f15834q) {
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
