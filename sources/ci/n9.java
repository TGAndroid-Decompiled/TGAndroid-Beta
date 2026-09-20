package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n9 extends og.a {
    public int f5080c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f5081f;
    public TLRPC.User f5082g;
    public TLRPC.Chat h;
    public int f5083i;
    public int f5084j;
    public boolean f5085k;
    public boolean f5086l;
    public boolean f5087m;
    public boolean f5088n;
    public int f5089o;
    public int f5090p;
    public int f5091q;

    public n9(int i10, boolean z10) {
        super(i10, z10);
        this.f5090p = -1;
    }

    public static n9 b(String str, CharSequence charSequence, int i10) {
        n9 n9Var = new n9(9, false);
        n9Var.e = str;
        n9Var.f5081f = charSequence;
        n9Var.f5091q = i10;
        return n9Var;
    }

    public static n9 c() {
        return new n9(0, false);
    }

    public static n9 d() {
        n9 n9Var = new n9(-1, false);
        n9Var.f5089o = -1;
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
        n9Var.f5083i = i10;
        n9Var.f5085k = z10;
        n9Var.f5084j = i11;
        return n9Var;
    }

    public static n9 i(TLRPC.User user, boolean z10, boolean z11) {
        n9 n9Var = new n9(3, true);
        n9Var.f5082g = user;
        n9Var.f5085k = z10;
        n9Var.f5086l = z11;
        return n9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n9.class == obj.getClass()) {
                n9 n9Var = (n9) obj;
                int i10 = this.f15704a;
                if (i10 == n9Var.f15704a) {
                    if (i10 != -1 || (this.f5089o == n9Var.f5089o && this.f5090p == n9Var.f5090p)) {
                        if (i10 != 3 || (this.f5082g == n9Var.f5082g && this.h == n9Var.h && this.f5083i == n9Var.f5083i && this.f5084j == n9Var.f5084j && this.f5085k == n9Var.f5085k && this.f5087m == n9Var.f5087m && this.f5088n == n9Var.f5088n)) {
                            if (i10 != 0 || this.f5080c == n9Var.f5080c) {
                                if (i10 != 2 || TextUtils.equals(this.e, n9Var.e)) {
                                    if (this.f15704a != 8 || TextUtils.equals(this.e, n9Var.e)) {
                                        int i11 = this.f15704a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f5081f, n9Var.f5081f))) {
                                            if (this.f15704a != 6 || (TextUtils.equals(this.e, n9Var.e) && this.f5080c == n9Var.f5080c)) {
                                                if (this.f15704a != 7 || (this.f5080c == n9Var.f5080c && TextUtils.equals(this.e, n9Var.e) && this.f5085k == n9Var.f5085k)) {
                                                    if (this.f15704a != 9 || (this.f5091q == n9Var.f5091q && this.d == n9Var.d && TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f5081f, n9Var.f5081f))) {
                                                        if (this.f15704a != 10 || this.f5091q == n9Var.f5091q) {
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
