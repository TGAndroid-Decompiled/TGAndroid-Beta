package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n9 extends og.a {
    public int f5074c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f5075f;
    public TLRPC.User f5076g;
    public TLRPC.Chat h;
    public int f5077i;
    public int f5078j;
    public boolean f5079k;
    public boolean f5080l;
    public boolean f5081m;
    public boolean f5082n;
    public int f5083o;
    public int f5084p;
    public int f5085q;

    public n9(int i10, boolean z10) {
        super(i10, z10);
        this.f5084p = -1;
    }

    public static n9 b(String str, CharSequence charSequence, int i10) {
        n9 n9Var = new n9(9, false);
        n9Var.e = str;
        n9Var.f5075f = charSequence;
        n9Var.f5085q = i10;
        return n9Var;
    }

    public static n9 c() {
        return new n9(0, false);
    }

    public static n9 d() {
        n9 n9Var = new n9(-1, false);
        n9Var.f5083o = -1;
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
        n9Var.f5077i = i10;
        n9Var.f5079k = z10;
        n9Var.f5078j = i11;
        return n9Var;
    }

    public static n9 i(TLRPC.User user, boolean z10, boolean z11) {
        n9 n9Var = new n9(3, true);
        n9Var.f5076g = user;
        n9Var.f5079k = z10;
        n9Var.f5080l = z11;
        return n9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n9.class == obj.getClass()) {
                n9 n9Var = (n9) obj;
                int i10 = this.f15533a;
                if (i10 == n9Var.f15533a) {
                    if (i10 != -1 || (this.f5083o == n9Var.f5083o && this.f5084p == n9Var.f5084p)) {
                        if (i10 != 3 || (this.f5076g == n9Var.f5076g && this.h == n9Var.h && this.f5077i == n9Var.f5077i && this.f5078j == n9Var.f5078j && this.f5079k == n9Var.f5079k && this.f5081m == n9Var.f5081m && this.f5082n == n9Var.f5082n)) {
                            if (i10 != 0 || this.f5074c == n9Var.f5074c) {
                                if (i10 != 2 || TextUtils.equals(this.e, n9Var.e)) {
                                    if (this.f15533a != 8 || TextUtils.equals(this.e, n9Var.e)) {
                                        int i11 = this.f15533a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f5075f, n9Var.f5075f))) {
                                            if (this.f15533a != 6 || (TextUtils.equals(this.e, n9Var.e) && this.f5074c == n9Var.f5074c)) {
                                                if (this.f15533a != 7 || (this.f5074c == n9Var.f5074c && TextUtils.equals(this.e, n9Var.e) && this.f5079k == n9Var.f5079k)) {
                                                    if (this.f15533a != 9 || (this.f5085q == n9Var.f5085q && this.d == n9Var.d && TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f5075f, n9Var.f5075f))) {
                                                        if (this.f15533a != 10 || this.f5085q == n9Var.f5085q) {
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
