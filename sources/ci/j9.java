package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class j9 extends og.a {
    public int f5254c;
    public Drawable d;
    public CharSequence f5255e;
    public CharSequence f5256f;
    public TLRPC.User f5257g;
    public TLRPC.Chat h;
    public int f5258i;
    public int f5259j;
    public boolean f5260k;
    public boolean f5261l;
    public boolean f5262m;
    public boolean f5263n;
    public int f5264o;
    public int f5265p;
    public int f5266q;

    public j9(int i10, boolean z10) {
        super(i10, z10);
        this.f5265p = -1;
    }

    public static j9 b(String str, CharSequence charSequence, int i10) {
        j9 j9Var = new j9(9, false);
        j9Var.f5255e = str;
        j9Var.f5256f = charSequence;
        j9Var.f5266q = i10;
        return j9Var;
    }

    public static j9 c() {
        return new j9(0, false);
    }

    public static j9 d() {
        j9 j9Var = new j9(-1, false);
        j9Var.f5264o = -1;
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
        j9Var.f5255e = charSequence;
        return j9Var;
    }

    public static j9 h(int i10, int i11, boolean z10) {
        j9 j9Var = new j9(3, false);
        j9Var.f5258i = i10;
        j9Var.f5260k = z10;
        j9Var.f5259j = i11;
        return j9Var;
    }

    public static j9 i(TLRPC.User user, boolean z10, boolean z11) {
        j9 j9Var = new j9(3, true);
        j9Var.f5257g = user;
        j9Var.f5260k = z10;
        j9Var.f5261l = z11;
        return j9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j9.class == obj.getClass()) {
                j9 j9Var = (j9) obj;
                int i10 = this.f17187a;
                if (i10 == j9Var.f17187a) {
                    if (i10 != -1 || (this.f5264o == j9Var.f5264o && this.f5265p == j9Var.f5265p)) {
                        if (i10 != 3 || (this.f5257g == j9Var.f5257g && this.h == j9Var.h && this.f5258i == j9Var.f5258i && this.f5259j == j9Var.f5259j && this.f5260k == j9Var.f5260k && this.f5262m == j9Var.f5262m && this.f5263n == j9Var.f5263n)) {
                            if (i10 != 0 || this.f5254c == j9Var.f5254c) {
                                if (i10 != 2 || TextUtils.equals(this.f5255e, j9Var.f5255e)) {
                                    if (this.f17187a != 8 || TextUtils.equals(this.f5255e, j9Var.f5255e)) {
                                        int i11 = this.f17187a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f5255e, j9Var.f5255e) && TextUtils.equals(this.f5256f, j9Var.f5256f))) {
                                            if (this.f17187a != 6 || (TextUtils.equals(this.f5255e, j9Var.f5255e) && this.f5254c == j9Var.f5254c)) {
                                                if (this.f17187a != 7 || (this.f5254c == j9Var.f5254c && TextUtils.equals(this.f5255e, j9Var.f5255e) && this.f5260k == j9Var.f5260k)) {
                                                    if (this.f17187a != 9 || (this.f5266q == j9Var.f5266q && this.d == j9Var.d && TextUtils.equals(this.f5255e, j9Var.f5255e) && TextUtils.equals(this.f5256f, j9Var.f5256f))) {
                                                        if (this.f17187a != 10 || this.f5266q == j9Var.f5266q) {
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
