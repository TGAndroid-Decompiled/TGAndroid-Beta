package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class t8 extends rg.a {
    public int f15443c;
    public Drawable d;
    public CharSequence f15444e;
    public CharSequence f15445f;
    public TLRPC.User f15446g;
    public TLRPC.Chat h;
    public int f15447i;
    public int f15448j;
    public boolean f15449k;
    public boolean f15450l;
    public boolean f15451m;
    public boolean f15452n;
    public int f15453o;
    public int f15454p;
    public int f15455q;

    public t8(int i7, boolean z10) {
        super(i7, z10);
        this.f15454p = -1;
    }

    public static t8 b(String str, CharSequence charSequence, int i7) {
        t8 t8Var = new t8(9, false);
        t8Var.f15444e = str;
        t8Var.f15445f = charSequence;
        t8Var.f15455q = i7;
        return t8Var;
    }

    public static t8 c() {
        return new t8(0, false);
    }

    public static t8 d() {
        t8 t8Var = new t8(-1, false);
        t8Var.f15453o = -1;
        return t8Var;
    }

    public static t8 e() {
        return new t8(1, false);
    }

    public static t8 f() {
        return new t8(2, false);
    }

    public static t8 g(CharSequence charSequence) {
        t8 t8Var = new t8(6, false);
        t8Var.f15444e = charSequence;
        return t8Var;
    }

    public static t8 h(int i7, int i10, boolean z10) {
        t8 t8Var = new t8(3, false);
        t8Var.f15447i = i7;
        t8Var.f15449k = z10;
        t8Var.f15448j = i10;
        return t8Var;
    }

    public static t8 i(TLRPC.User user, boolean z10, boolean z11) {
        t8 t8Var = new t8(3, true);
        t8Var.f15446g = user;
        t8Var.f15449k = z10;
        t8Var.f15450l = z11;
        return t8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t8.class == obj.getClass()) {
                t8 t8Var = (t8) obj;
                int i7 = this.f56712a;
                if (i7 == t8Var.f56712a) {
                    if (i7 != -1 || (this.f15453o == t8Var.f15453o && this.f15454p == t8Var.f15454p)) {
                        if (i7 != 3 || (this.f15446g == t8Var.f15446g && this.h == t8Var.h && this.f15447i == t8Var.f15447i && this.f15448j == t8Var.f15448j && this.f15449k == t8Var.f15449k && this.f15451m == t8Var.f15451m && this.f15452n == t8Var.f15452n)) {
                            if (i7 != 0 || this.f15443c == t8Var.f15443c) {
                                if (i7 != 2 || TextUtils.equals(this.f15444e, t8Var.f15444e)) {
                                    if (this.f56712a != 8 || TextUtils.equals(this.f15444e, t8Var.f15444e)) {
                                        int i10 = this.f56712a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f15444e, t8Var.f15444e) && TextUtils.equals(this.f15445f, t8Var.f15445f))) {
                                            if (this.f56712a != 6 || (TextUtils.equals(this.f15444e, t8Var.f15444e) && this.f15443c == t8Var.f15443c)) {
                                                if (this.f56712a != 7 || (this.f15443c == t8Var.f15443c && TextUtils.equals(this.f15444e, t8Var.f15444e) && this.f15449k == t8Var.f15449k)) {
                                                    if (this.f56712a != 9 || (this.f15455q == t8Var.f15455q && this.d == t8Var.d && TextUtils.equals(this.f15444e, t8Var.f15444e) && TextUtils.equals(this.f15445f, t8Var.f15445f))) {
                                                        if (this.f56712a != 10 || this.f15455q == t8Var.f15455q) {
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
