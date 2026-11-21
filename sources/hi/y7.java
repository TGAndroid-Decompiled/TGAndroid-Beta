package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class y7 extends rg.a {
    public int f15797c;
    public Drawable d;
    public CharSequence f15798e;
    public CharSequence f15799f;
    public TLRPC.User f15800g;
    public TLRPC.Chat h;
    public int f15801i;
    public int f15802j;
    public boolean f15803k;
    public boolean f15804l;
    public boolean f15805m;
    public boolean f15806n;
    public int f15807o;
    public int f15808p;
    public int f15809q;

    public y7(int i7, boolean z10) {
        super(i7, z10);
        this.f15808p = -1;
    }

    public static y7 b(String str, CharSequence charSequence, int i7) {
        y7 y7Var = new y7(9, false);
        y7Var.f15798e = str;
        y7Var.f15799f = charSequence;
        y7Var.f15809q = i7;
        return y7Var;
    }

    public static y7 c() {
        return new y7(0, false);
    }

    public static y7 d() {
        y7 y7Var = new y7(-1, false);
        y7Var.f15807o = -1;
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
        y7Var.f15798e = charSequence;
        return y7Var;
    }

    public static y7 h(int i7, int i10, boolean z10) {
        y7 y7Var = new y7(3, false);
        y7Var.f15801i = i7;
        y7Var.f15803k = z10;
        y7Var.f15802j = i10;
        return y7Var;
    }

    public static y7 i(TLRPC.User user, boolean z10, boolean z11) {
        y7 y7Var = new y7(3, true);
        y7Var.f15800g = user;
        y7Var.f15803k = z10;
        y7Var.f15804l = z11;
        return y7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y7.class == obj.getClass()) {
                y7 y7Var = (y7) obj;
                int i7 = this.f56630a;
                if (i7 == y7Var.f56630a) {
                    if (i7 != -1 || (this.f15807o == y7Var.f15807o && this.f15808p == y7Var.f15808p)) {
                        if (i7 != 3 || (this.f15800g == y7Var.f15800g && this.h == y7Var.h && this.f15801i == y7Var.f15801i && this.f15802j == y7Var.f15802j && this.f15803k == y7Var.f15803k && this.f15805m == y7Var.f15805m && this.f15806n == y7Var.f15806n)) {
                            if (i7 != 0 || this.f15797c == y7Var.f15797c) {
                                if (i7 != 2 || TextUtils.equals(this.f15798e, y7Var.f15798e)) {
                                    if (this.f56630a != 8 || TextUtils.equals(this.f15798e, y7Var.f15798e)) {
                                        int i10 = this.f56630a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f15798e, y7Var.f15798e) && TextUtils.equals(this.f15799f, y7Var.f15799f))) {
                                            if (this.f56630a != 6 || (TextUtils.equals(this.f15798e, y7Var.f15798e) && this.f15797c == y7Var.f15797c)) {
                                                if (this.f56630a != 7 || (this.f15797c == y7Var.f15797c && TextUtils.equals(this.f15798e, y7Var.f15798e) && this.f15803k == y7Var.f15803k)) {
                                                    if (this.f56630a != 9 || (this.f15809q == y7Var.f15809q && this.d == y7Var.d && TextUtils.equals(this.f15798e, y7Var.f15798e) && TextUtils.equals(this.f15799f, y7Var.f15799f))) {
                                                        if (this.f56630a != 10 || this.f15809q == y7Var.f15809q) {
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
