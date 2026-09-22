package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class n9 extends og.a {
    public int f5076c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f5077f;
    public TLRPC.User f5078g;
    public TLRPC.Chat h;
    public int f5079i;
    public int f5080j;
    public boolean f5081k;
    public boolean f5082l;
    public boolean f5083m;
    public boolean f5084n;
    public int f5085o;
    public int f5086p;
    public int f5087q;

    public n9(int i10, boolean z10) {
        super(i10, z10);
        this.f5086p = -1;
    }

    public static n9 b(String str, CharSequence charSequence, int i10) {
        n9 n9Var = new n9(9, false);
        n9Var.e = str;
        n9Var.f5077f = charSequence;
        n9Var.f5087q = i10;
        return n9Var;
    }

    public static n9 c() {
        return new n9(0, false);
    }

    public static n9 d() {
        n9 n9Var = new n9(-1, false);
        n9Var.f5085o = -1;
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
        n9Var.f5079i = i10;
        n9Var.f5081k = z10;
        n9Var.f5080j = i11;
        return n9Var;
    }

    public static n9 i(TLRPC.User user, boolean z10, boolean z11) {
        n9 n9Var = new n9(3, true);
        n9Var.f5078g = user;
        n9Var.f5081k = z10;
        n9Var.f5082l = z11;
        return n9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n9.class == obj.getClass()) {
                n9 n9Var = (n9) obj;
                int i10 = this.f15531a;
                if (i10 == n9Var.f15531a) {
                    if (i10 != -1 || (this.f5085o == n9Var.f5085o && this.f5086p == n9Var.f5086p)) {
                        if (i10 != 3 || (this.f5078g == n9Var.f5078g && this.h == n9Var.h && this.f5079i == n9Var.f5079i && this.f5080j == n9Var.f5080j && this.f5081k == n9Var.f5081k && this.f5083m == n9Var.f5083m && this.f5084n == n9Var.f5084n)) {
                            if (i10 != 0 || this.f5076c == n9Var.f5076c) {
                                if (i10 != 2 || TextUtils.equals(this.e, n9Var.e)) {
                                    if (this.f15531a != 8 || TextUtils.equals(this.e, n9Var.e)) {
                                        int i11 = this.f15531a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f5077f, n9Var.f5077f))) {
                                            if (this.f15531a != 6 || (TextUtils.equals(this.e, n9Var.e) && this.f5076c == n9Var.f5076c)) {
                                                if (this.f15531a != 7 || (this.f5076c == n9Var.f5076c && TextUtils.equals(this.e, n9Var.e) && this.f5081k == n9Var.f5081k)) {
                                                    if (this.f15531a != 9 || (this.f5087q == n9Var.f5087q && this.d == n9Var.d && TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f5077f, n9Var.f5077f))) {
                                                        if (this.f15531a != 10 || this.f5087q == n9Var.f5087q) {
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
