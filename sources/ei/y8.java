package ei;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class y8 extends pg.a {
    public int f10135c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f10136f;
    public TLRPC.User f10137g;
    public TLRPC.Chat h;
    public int f10138i;
    public int f10139j;
    public boolean f10140k;
    public boolean f10141l;
    public boolean f10142m;
    public boolean f10143n;
    public int f10144o;
    public int f10145p;
    public int f10146q;

    public y8(int i10, boolean z10) {
        super(i10, z10);
        this.f10145p = -1;
    }

    public static y8 b(String str, CharSequence charSequence, int i10) {
        y8 y8Var = new y8(9, false);
        y8Var.e = str;
        y8Var.f10136f = charSequence;
        y8Var.f10146q = i10;
        return y8Var;
    }

    public static y8 c() {
        return new y8(0, false);
    }

    public static y8 d() {
        y8 y8Var = new y8(-1, false);
        y8Var.f10144o = -1;
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
        y8Var.f10138i = i10;
        y8Var.f10140k = z10;
        y8Var.f10139j = i11;
        return y8Var;
    }

    public static y8 i(TLRPC.User user, boolean z10, boolean z11) {
        y8 y8Var = new y8(3, true);
        y8Var.f10137g = user;
        y8Var.f10140k = z10;
        y8Var.f10141l = z11;
        return y8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y8.class == obj.getClass()) {
                y8 y8Var = (y8) obj;
                int i10 = this.f44288a;
                if (i10 == y8Var.f44288a) {
                    if (i10 != -1 || (this.f10144o == y8Var.f10144o && this.f10145p == y8Var.f10145p)) {
                        if (i10 != 3 || (this.f10137g == y8Var.f10137g && this.h == y8Var.h && this.f10138i == y8Var.f10138i && this.f10139j == y8Var.f10139j && this.f10140k == y8Var.f10140k && this.f10142m == y8Var.f10142m && this.f10143n == y8Var.f10143n)) {
                            if (i10 != 0 || this.f10135c == y8Var.f10135c) {
                                if (i10 != 2 || TextUtils.equals(this.e, y8Var.e)) {
                                    if (this.f44288a != 8 || TextUtils.equals(this.e, y8Var.e)) {
                                        int i11 = this.f44288a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10136f, y8Var.f10136f))) {
                                            if (this.f44288a != 6 || (TextUtils.equals(this.e, y8Var.e) && this.f10135c == y8Var.f10135c)) {
                                                if (this.f44288a != 7 || (this.f10135c == y8Var.f10135c && TextUtils.equals(this.e, y8Var.e) && this.f10140k == y8Var.f10140k)) {
                                                    if (this.f44288a != 9 || (this.f10146q == y8Var.f10146q && this.d == y8Var.d && TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f10136f, y8Var.f10136f))) {
                                                        if (this.f44288a != 10 || this.f10146q == y8Var.f10146q) {
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
