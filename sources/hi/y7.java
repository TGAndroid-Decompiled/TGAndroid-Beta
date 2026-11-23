package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class y7 extends rg.a {
    public int f15800c;
    public Drawable d;
    public CharSequence f15801e;
    public CharSequence f15802f;
    public TLRPC.User f15803g;
    public TLRPC.Chat h;
    public int f15804i;
    public int f15805j;
    public boolean f15806k;
    public boolean f15807l;
    public boolean f15808m;
    public boolean f15809n;
    public int f15810o;
    public int f15811p;
    public int f15812q;

    public y7(int i7, boolean z10) {
        super(i7, z10);
        this.f15811p = -1;
    }

    public static y7 b(String str, CharSequence charSequence, int i7) {
        y7 y7Var = new y7(9, false);
        y7Var.f15801e = str;
        y7Var.f15802f = charSequence;
        y7Var.f15812q = i7;
        return y7Var;
    }

    public static y7 c() {
        return new y7(0, false);
    }

    public static y7 d() {
        y7 y7Var = new y7(-1, false);
        y7Var.f15810o = -1;
        return y7Var;
    }

    public static y7 e() {
        return new y7(1, false);
    }

    public static y7 f() {
        return new y7(2, false);
    }

    public static y7 g(CharSequence charSequence) {
        y7 y7Var = new y7(6, false);
        y7Var.f15801e = charSequence;
        return y7Var;
    }

    public static y7 h(int i7, int i10, boolean z10) {
        y7 y7Var = new y7(3, false);
        y7Var.f15804i = i7;
        y7Var.f15806k = z10;
        y7Var.f15805j = i10;
        return y7Var;
    }

    public static y7 i(TLRPC.User user, boolean z10, boolean z11) {
        y7 y7Var = new y7(3, true);
        y7Var.f15803g = user;
        y7Var.f15806k = z10;
        y7Var.f15807l = z11;
        return y7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y7.class == obj.getClass()) {
                y7 y7Var = (y7) obj;
                int i7 = this.f56634a;
                if (i7 == y7Var.f56634a) {
                    if (i7 != -1 || (this.f15810o == y7Var.f15810o && this.f15811p == y7Var.f15811p)) {
                        if (i7 != 3 || (this.f15803g == y7Var.f15803g && this.h == y7Var.h && this.f15804i == y7Var.f15804i && this.f15805j == y7Var.f15805j && this.f15806k == y7Var.f15806k && this.f15808m == y7Var.f15808m && this.f15809n == y7Var.f15809n)) {
                            if (i7 != 0 || this.f15800c == y7Var.f15800c) {
                                if (i7 != 2 || TextUtils.equals(this.f15801e, y7Var.f15801e)) {
                                    if (this.f56634a != 8 || TextUtils.equals(this.f15801e, y7Var.f15801e)) {
                                        int i10 = this.f56634a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f15801e, y7Var.f15801e) && TextUtils.equals(this.f15802f, y7Var.f15802f))) {
                                            if (this.f56634a != 6 || (TextUtils.equals(this.f15801e, y7Var.f15801e) && this.f15800c == y7Var.f15800c)) {
                                                if (this.f56634a != 7 || (this.f15800c == y7Var.f15800c && TextUtils.equals(this.f15801e, y7Var.f15801e) && this.f15806k == y7Var.f15806k)) {
                                                    if (this.f56634a != 9 || (this.f15812q == y7Var.f15812q && this.d == y7Var.d && TextUtils.equals(this.f15801e, y7Var.f15801e) && TextUtils.equals(this.f15802f, y7Var.f15802f))) {
                                                        if (this.f56634a != 10 || this.f15812q == y7Var.f15812q) {
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
