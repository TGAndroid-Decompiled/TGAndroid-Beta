package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class z7 extends rg.a {
    public int f15508c;
    public Drawable d;
    public CharSequence f15509e;
    public CharSequence f15510f;
    public TLRPC.User f15511g;
    public TLRPC.Chat h;
    public int f15512i;
    public int f15513j;
    public boolean f15514k;
    public boolean f15515l;
    public boolean f15516m;
    public boolean f15517n;
    public int f15518o;
    public int f15519p;
    public int f15520q;

    public z7(int i7, boolean z10) {
        super(i7, z10);
        this.f15519p = -1;
    }

    public static z7 b(String str, CharSequence charSequence, int i7) {
        z7 z7Var = new z7(9, false);
        z7Var.f15509e = str;
        z7Var.f15510f = charSequence;
        z7Var.f15520q = i7;
        return z7Var;
    }

    public static z7 c() {
        return new z7(0, false);
    }

    public static z7 d() {
        z7 z7Var = new z7(-1, false);
        z7Var.f15518o = -1;
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
        z7Var.f15509e = charSequence;
        return z7Var;
    }

    public static z7 h(int i7, int i10, boolean z10) {
        z7 z7Var = new z7(3, false);
        z7Var.f15512i = i7;
        z7Var.f15514k = z10;
        z7Var.f15513j = i10;
        return z7Var;
    }

    public static z7 i(TLRPC.User user, boolean z10, boolean z11) {
        z7 z7Var = new z7(3, true);
        z7Var.f15511g = user;
        z7Var.f15514k = z10;
        z7Var.f15515l = z11;
        return z7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z7.class == obj.getClass()) {
                z7 z7Var = (z7) obj;
                int i7 = this.f56015a;
                if (i7 == z7Var.f56015a) {
                    if (i7 != -1 || (this.f15518o == z7Var.f15518o && this.f15519p == z7Var.f15519p)) {
                        if (i7 != 3 || (this.f15511g == z7Var.f15511g && this.h == z7Var.h && this.f15512i == z7Var.f15512i && this.f15513j == z7Var.f15513j && this.f15514k == z7Var.f15514k && this.f15516m == z7Var.f15516m && this.f15517n == z7Var.f15517n)) {
                            if (i7 != 0 || this.f15508c == z7Var.f15508c) {
                                if (i7 != 2 || TextUtils.equals(this.f15509e, z7Var.f15509e)) {
                                    if (this.f56015a != 8 || TextUtils.equals(this.f15509e, z7Var.f15509e)) {
                                        int i10 = this.f56015a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f15509e, z7Var.f15509e) && TextUtils.equals(this.f15510f, z7Var.f15510f))) {
                                            if (this.f56015a != 6 || (TextUtils.equals(this.f15509e, z7Var.f15509e) && this.f15508c == z7Var.f15508c)) {
                                                if (this.f56015a != 7 || (this.f15508c == z7Var.f15508c && TextUtils.equals(this.f15509e, z7Var.f15509e) && this.f15514k == z7Var.f15514k)) {
                                                    if (this.f56015a != 9 || (this.f15520q == z7Var.f15520q && this.d == z7Var.d && TextUtils.equals(this.f15509e, z7Var.f15509e) && TextUtils.equals(this.f15510f, z7Var.f15510f))) {
                                                        if (this.f56015a != 10 || this.f15520q == z7Var.f15520q) {
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
