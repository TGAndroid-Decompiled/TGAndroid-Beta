package gi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class a8 extends sg.a {
    public int f12396c;
    public Drawable d;
    public CharSequence f12397e;
    public CharSequence f12398f;
    public TLRPC.User f12399g;
    public TLRPC.Chat h;
    public int f12400i;
    public int f12401j;
    public boolean f12402k;
    public boolean f12403l;
    public boolean f12404m;
    public boolean f12405n;
    public int f12406o;
    public int f12407p;
    public int f12408q;

    public a8(int i3, boolean z10) {
        super(i3, z10);
        this.f12407p = -1;
    }

    public static a8 b(String str, CharSequence charSequence, int i3) {
        a8 a8Var = new a8(9, false);
        a8Var.f12397e = str;
        a8Var.f12398f = charSequence;
        a8Var.f12408q = i3;
        return a8Var;
    }

    public static a8 c() {
        return new a8(0, false);
    }

    public static a8 d() {
        a8 a8Var = new a8(-1, false);
        a8Var.f12406o = -1;
        return a8Var;
    }

    public static a8 e() {
        return new a8(1, false);
    }

    public static a8 f() {
        return new a8(2, false);
    }

    public static a8 g(CharSequence charSequence) {
        a8 a8Var = new a8(6, false);
        a8Var.f12397e = charSequence;
        return a8Var;
    }

    public static a8 h(int i3, int i10, boolean z10) {
        a8 a8Var = new a8(3, false);
        a8Var.f12400i = i3;
        a8Var.f12402k = z10;
        a8Var.f12401j = i10;
        return a8Var;
    }

    public static a8 i(TLRPC.User user, boolean z10, boolean z11) {
        a8 a8Var = new a8(3, true);
        a8Var.f12399g = user;
        a8Var.f12402k = z10;
        a8Var.f12403l = z11;
        return a8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a8.class == obj.getClass()) {
                a8 a8Var = (a8) obj;
                int i3 = this.f54715a;
                if (i3 == a8Var.f54715a) {
                    if (i3 != -1 || (this.f12406o == a8Var.f12406o && this.f12407p == a8Var.f12407p)) {
                        if (i3 != 3 || (this.f12399g == a8Var.f12399g && this.h == a8Var.h && this.f12400i == a8Var.f12400i && this.f12401j == a8Var.f12401j && this.f12402k == a8Var.f12402k && this.f12404m == a8Var.f12404m && this.f12405n == a8Var.f12405n)) {
                            if (i3 != 0 || this.f12396c == a8Var.f12396c) {
                                if (i3 != 2 || TextUtils.equals(this.f12397e, a8Var.f12397e)) {
                                    if (this.f54715a != 8 || TextUtils.equals(this.f12397e, a8Var.f12397e)) {
                                        int i10 = this.f54715a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f12397e, a8Var.f12397e) && TextUtils.equals(this.f12398f, a8Var.f12398f))) {
                                            if (this.f54715a != 6 || (TextUtils.equals(this.f12397e, a8Var.f12397e) && this.f12396c == a8Var.f12396c)) {
                                                if (this.f54715a != 7 || (this.f12396c == a8Var.f12396c && TextUtils.equals(this.f12397e, a8Var.f12397e) && this.f12402k == a8Var.f12402k)) {
                                                    if (this.f54715a != 9 || (this.f12408q == a8Var.f12408q && this.d == a8Var.d && TextUtils.equals(this.f12397e, a8Var.f12397e) && TextUtils.equals(this.f12398f, a8Var.f12398f))) {
                                                        if (this.f54715a != 10 || this.f12408q == a8Var.f12408q) {
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
