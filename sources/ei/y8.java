package ei;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class y8 extends pg.a {
    public int f10152c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f10153f;
    public TLRPC.User f10154g;
    public TLRPC.Chat h;
    public int f10155i;
    public int f10156j;
    public boolean f10157k;
    public boolean f10158l;
    public boolean f10159m;
    public boolean f10160n;
    public int f10161o;
    public int f10162p;
    public int f10163q;

    public y8(int i10, boolean z10) {
        super(i10, z10);
        this.f10162p = -1;
    }

    public static y8 b(String str, CharSequence charSequence, int i10) {
        y8 y8Var = new y8(9, false);
        y8Var.e = str;
        y8Var.f10153f = charSequence;
        y8Var.f10163q = i10;
        return y8Var;
    }

    public static y8 c() {
        return new y8(0, false);
    }

    public static y8 d() {
        y8 y8Var = new y8(-1, false);
        y8Var.f10161o = -1;
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
        y8Var.f10155i = i10;
        y8Var.f10157k = z10;
        y8Var.f10156j = i11;
        return y8Var;
    }

    public static y8 i(TLRPC.User user, boolean z10, boolean z11) {
        y8 y8Var = new y8(3, true);
        y8Var.f10154g = user;
        y8Var.f10157k = z10;
        y8Var.f10158l = z11;
        return y8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y8.class == obj.getClass()) {
                y8 y8Var = (y8) obj;
                int i10 = this.f44712a;
                if (i10 == y8Var.f44712a) {
                    if (i10 != -1 || (this.f10161o == y8Var.f10161o && this.f10162p == y8Var.f10162p)) {
                        if (i10 != 3 || (this.f10154g == y8Var.f10154g && this.h == y8Var.h && this.f10155i == y8Var.f10155i && this.f10156j == y8Var.f10156j && this.f10157k == y8Var.f10157k && this.f10159m == y8Var.f10159m && this.f10160n == y8Var.f10160n)) {
                            if (i10 != 0 || this.f10152c == y8Var.f10152c) {
                                if (i10 != 2 || TextUtils.equals(this.e, y8Var.e)) {
                                    if (this.f44712a != 8 || TextUtils.equals(this.e, y8Var.e)) {
                                        int i11 = this.f44712a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10153f, y8Var.f10153f))) {
                                            if (this.f44712a != 6 || (TextUtils.equals(this.e, y8Var.e) && this.f10152c == y8Var.f10152c)) {
                                                if (this.f44712a != 7 || (this.f10152c == y8Var.f10152c && TextUtils.equals(this.e, y8Var.e) && this.f10157k == y8Var.f10157k)) {
                                                    if (this.f44712a != 9 || (this.f10163q == y8Var.f10163q && this.d == y8Var.d && TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10153f, y8Var.f10153f))) {
                                                        if (this.f44712a != 10 || this.f10163q == y8Var.f10163q) {
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
