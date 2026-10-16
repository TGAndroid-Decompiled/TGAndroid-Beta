package di;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class j9 extends pg.a {
    public int f7126c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f7127f;
    public TLRPC.User f7128g;
    public TLRPC.Chat h;
    public int f7129i;
    public int f7130j;
    public boolean f7131k;
    public boolean f7132l;
    public boolean f7133m;
    public boolean f7134n;
    public int f7135o;
    public int f7136p;
    public int f7137q;

    public j9(int i10, boolean z10) {
        super(i10, z10);
        this.f7136p = -1;
    }

    public static j9 b(String str, CharSequence charSequence, int i10) {
        j9 j9Var = new j9(9, false);
        j9Var.e = str;
        j9Var.f7127f = charSequence;
        j9Var.f7137q = i10;
        return j9Var;
    }

    public static j9 c() {
        return new j9(0, false);
    }

    public static j9 d() {
        j9 j9Var = new j9(-1, false);
        j9Var.f7135o = -1;
        return j9Var;
    }

    public static j9 e() {
        return new j9(1, false);
    }

    public static j9 f() {
        return new j9(2, false);
    }

    public static j9 g(CharSequence charSequence) {
        j9 j9Var = new j9(6, false);
        j9Var.e = charSequence;
        return j9Var;
    }

    public static j9 h(int i10, int i11, boolean z10) {
        j9 j9Var = new j9(3, false);
        j9Var.f7129i = i10;
        j9Var.f7131k = z10;
        j9Var.f7130j = i11;
        return j9Var;
    }

    public static j9 i(TLRPC.User user, boolean z10, boolean z11) {
        j9 j9Var = new j9(3, true);
        j9Var.f7128g = user;
        j9Var.f7131k = z10;
        j9Var.f7132l = z11;
        return j9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j9.class == obj.getClass()) {
                j9 j9Var = (j9) obj;
                int i10 = this.f42904a;
                if (i10 == j9Var.f42904a) {
                    if (i10 != -1 || (this.f7135o == j9Var.f7135o && this.f7136p == j9Var.f7136p)) {
                        if (i10 != 3 || (this.f7128g == j9Var.f7128g && this.h == j9Var.h && this.f7129i == j9Var.f7129i && this.f7130j == j9Var.f7130j && this.f7131k == j9Var.f7131k && this.f7133m == j9Var.f7133m && this.f7134n == j9Var.f7134n)) {
                            if (i10 != 0 || this.f7126c == j9Var.f7126c) {
                                if (i10 != 2 || TextUtils.equals(this.e, j9Var.e)) {
                                    if (this.f42904a != 8 || TextUtils.equals(this.e, j9Var.e)) {
                                        int i11 = this.f42904a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, j9Var.e) && TextUtils.equals(this.f7127f, j9Var.f7127f))) {
                                            if (this.f42904a != 6 || (TextUtils.equals(this.e, j9Var.e) && this.f7126c == j9Var.f7126c)) {
                                                if (this.f42904a != 7 || (this.f7126c == j9Var.f7126c && TextUtils.equals(this.e, j9Var.e) && this.f7131k == j9Var.f7131k)) {
                                                    if (this.f42904a != 9 || (this.f7137q == j9Var.f7137q && this.d == j9Var.d && TextUtils.equals(this.e, j9Var.e) && TextUtils.equals(this.f7127f, j9Var.f7127f))) {
                                                        if (this.f42904a != 10 || this.f7137q == j9Var.f7137q) {
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
