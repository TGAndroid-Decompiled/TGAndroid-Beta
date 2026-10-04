package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class j9 extends og.a {
    public int f5253c;
    public Drawable d;
    public CharSequence f5254e;
    public CharSequence f5255f;
    public TLRPC.User f5256g;
    public TLRPC.Chat h;
    public int f5257i;
    public int f5258j;
    public boolean f5259k;
    public boolean f5260l;
    public boolean f5261m;
    public boolean f5262n;
    public int f5263o;
    public int f5264p;
    public int f5265q;

    public j9(int i10, boolean z10) {
        super(i10, z10);
        this.f5264p = -1;
    }

    public static j9 b(String str, CharSequence charSequence, int i10) {
        j9 j9Var = new j9(9, false);
        j9Var.f5254e = str;
        j9Var.f5255f = charSequence;
        j9Var.f5265q = i10;
        return j9Var;
    }

    public static j9 c() {
        return new j9(0, false);
    }

    public static j9 d() {
        j9 j9Var = new j9(-1, false);
        j9Var.f5263o = -1;
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
        j9Var.f5254e = charSequence;
        return j9Var;
    }

    public static j9 h(int i10, int i11, boolean z10) {
        j9 j9Var = new j9(3, false);
        j9Var.f5257i = i10;
        j9Var.f5259k = z10;
        j9Var.f5258j = i11;
        return j9Var;
    }

    public static j9 i(TLRPC.User user, boolean z10, boolean z11) {
        j9 j9Var = new j9(3, true);
        j9Var.f5256g = user;
        j9Var.f5259k = z10;
        j9Var.f5260l = z11;
        return j9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j9.class == obj.getClass()) {
                j9 j9Var = (j9) obj;
                int i10 = this.f17182a;
                if (i10 == j9Var.f17182a) {
                    if (i10 != -1 || (this.f5263o == j9Var.f5263o && this.f5264p == j9Var.f5264p)) {
                        if (i10 != 3 || (this.f5256g == j9Var.f5256g && this.h == j9Var.h && this.f5257i == j9Var.f5257i && this.f5258j == j9Var.f5258j && this.f5259k == j9Var.f5259k && this.f5261m == j9Var.f5261m && this.f5262n == j9Var.f5262n)) {
                            if (i10 != 0 || this.f5253c == j9Var.f5253c) {
                                if (i10 != 2 || TextUtils.equals(this.f5254e, j9Var.f5254e)) {
                                    if (this.f17182a != 8 || TextUtils.equals(this.f5254e, j9Var.f5254e)) {
                                        int i11 = this.f17182a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f5254e, j9Var.f5254e) && TextUtils.equals(this.f5255f, j9Var.f5255f))) {
                                            if (this.f17182a != 6 || (TextUtils.equals(this.f5254e, j9Var.f5254e) && this.f5253c == j9Var.f5253c)) {
                                                if (this.f17182a != 7 || (this.f5253c == j9Var.f5253c && TextUtils.equals(this.f5254e, j9Var.f5254e) && this.f5259k == j9Var.f5259k)) {
                                                    if (this.f17182a != 9 || (this.f5265q == j9Var.f5265q && this.d == j9Var.d && TextUtils.equals(this.f5254e, j9Var.f5254e) && TextUtils.equals(this.f5255f, j9Var.f5255f))) {
                                                        if (this.f17182a != 10 || this.f5265q == j9Var.f5265q) {
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
