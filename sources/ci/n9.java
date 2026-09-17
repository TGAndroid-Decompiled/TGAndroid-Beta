package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n9 extends og.a {
    public int f5079c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f5080f;
    public TLRPC.User f5081g;
    public TLRPC.Chat h;
    public int f5082i;
    public int f5083j;
    public boolean f5084k;
    public boolean f5085l;
    public boolean f5086m;
    public boolean f5087n;
    public int f5088o;
    public int f5089p;
    public int f5090q;

    public n9(int i10, boolean z10) {
        super(i10, z10);
        this.f5089p = -1;
    }

    public static n9 b(String str, CharSequence charSequence, int i10) {
        n9 n9Var = new n9(9, false);
        n9Var.e = str;
        n9Var.f5080f = charSequence;
        n9Var.f5090q = i10;
        return n9Var;
    }

    public static n9 c() {
        return new n9(0, false);
    }

    public static n9 d() {
        n9 n9Var = new n9(-1, false);
        n9Var.f5088o = -1;
        return n9Var;
    }

    public static n9 e() {
        return new n9(1, false);
    }

    public static n9 f() {
        return new n9(2, false);
    }

    public static n9 g(CharSequence charSequence) {
        n9 n9Var = new n9(6, false);
        n9Var.e = charSequence;
        return n9Var;
    }

    public static n9 h(int i10, int i11, boolean z10) {
        n9 n9Var = new n9(3, false);
        n9Var.f5082i = i10;
        n9Var.f5084k = z10;
        n9Var.f5083j = i11;
        return n9Var;
    }

    public static n9 i(TLRPC.User user, boolean z10, boolean z11) {
        n9 n9Var = new n9(3, true);
        n9Var.f5081g = user;
        n9Var.f5084k = z10;
        n9Var.f5085l = z11;
        return n9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n9.class == obj.getClass()) {
                n9 n9Var = (n9) obj;
                int i10 = this.f15543a;
                if (i10 == n9Var.f15543a) {
                    if (i10 != -1 || (this.f5088o == n9Var.f5088o && this.f5089p == n9Var.f5089p)) {
                        if (i10 != 3 || (this.f5081g == n9Var.f5081g && this.h == n9Var.h && this.f5082i == n9Var.f5082i && this.f5083j == n9Var.f5083j && this.f5084k == n9Var.f5084k && this.f5086m == n9Var.f5086m && this.f5087n == n9Var.f5087n)) {
                            if (i10 != 0 || this.f5079c == n9Var.f5079c) {
                                if (i10 != 2 || TextUtils.equals(this.e, n9Var.e)) {
                                    if (this.f15543a != 8 || TextUtils.equals(this.e, n9Var.e)) {
                                        int i11 = this.f15543a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f5080f, n9Var.f5080f))) {
                                            if (this.f15543a != 6 || (TextUtils.equals(this.e, n9Var.e) && this.f5079c == n9Var.f5079c)) {
                                                if (this.f15543a != 7 || (this.f5079c == n9Var.f5079c && TextUtils.equals(this.e, n9Var.e) && this.f5084k == n9Var.f5084k)) {
                                                    if (this.f15543a != 9 || (this.f5090q == n9Var.f5090q && this.d == n9Var.d && TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f5080f, n9Var.f5080f))) {
                                                        if (this.f15543a != 10 || this.f5090q == n9Var.f5090q) {
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
