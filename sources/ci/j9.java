package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class j9 extends og.a {
    public int f4867c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f4868f;
    public TLRPC.User f4869g;
    public TLRPC.Chat h;
    public int f4870i;
    public int f4871j;
    public boolean f4872k;
    public boolean f4873l;
    public boolean f4874m;
    public boolean f4875n;
    public int f4876o;
    public int f4877p;
    public int f4878q;

    public j9(int i10, boolean z10) {
        super(i10, z10);
        this.f4877p = -1;
    }

    public static j9 b(String str, CharSequence charSequence, int i10) {
        j9 j9Var = new j9(9, false);
        j9Var.e = str;
        j9Var.f4868f = charSequence;
        j9Var.f4878q = i10;
        return j9Var;
    }

    public static j9 c() {
        return new j9(0, false);
    }

    public static j9 d() {
        j9 j9Var = new j9(-1, false);
        j9Var.f4876o = -1;
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
        j9Var.f4870i = i10;
        j9Var.f4872k = z10;
        j9Var.f4871j = i11;
        return j9Var;
    }

    public static j9 i(TLRPC.User user, boolean z10, boolean z11) {
        j9 j9Var = new j9(3, true);
        j9Var.f4869g = user;
        j9Var.f4872k = z10;
        j9Var.f4873l = z11;
        return j9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j9.class == obj.getClass()) {
                j9 j9Var = (j9) obj;
                int i10 = this.f15754a;
                if (i10 == j9Var.f15754a) {
                    if (i10 != -1 || (this.f4876o == j9Var.f4876o && this.f4877p == j9Var.f4877p)) {
                        if (i10 != 3 || (this.f4869g == j9Var.f4869g && this.h == j9Var.h && this.f4870i == j9Var.f4870i && this.f4871j == j9Var.f4871j && this.f4872k == j9Var.f4872k && this.f4874m == j9Var.f4874m && this.f4875n == j9Var.f4875n)) {
                            if (i10 != 0 || this.f4867c == j9Var.f4867c) {
                                if (i10 != 2 || TextUtils.equals(this.e, j9Var.e)) {
                                    if (this.f15754a != 8 || TextUtils.equals(this.e, j9Var.e)) {
                                        int i11 = this.f15754a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, j9Var.e) && TextUtils.equals(this.f4868f, j9Var.f4868f))) {
                                            if (this.f15754a != 6 || (TextUtils.equals(this.e, j9Var.e) && this.f4867c == j9Var.f4867c)) {
                                                if (this.f15754a != 7 || (this.f4867c == j9Var.f4867c && TextUtils.equals(this.e, j9Var.e) && this.f4872k == j9Var.f4872k)) {
                                                    if (this.f15754a != 9 || (this.f4878q == j9Var.f4878q && this.d == j9Var.d && TextUtils.equals(this.e, j9Var.e) && TextUtils.equals(this.f4868f, j9Var.f4868f))) {
                                                        if (this.f15754a != 10 || this.f4878q == j9Var.f4878q) {
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
