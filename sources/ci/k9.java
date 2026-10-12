package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class k9 extends og.a {
    public int f5323c;
    public Drawable d;
    public CharSequence f5324e;
    public CharSequence f5325f;
    public TLRPC.User f5326g;
    public TLRPC.Chat h;
    public int f5327i;
    public int f5328j;
    public boolean f5329k;
    public boolean f5330l;
    public boolean f5331m;
    public boolean f5332n;
    public int f5333o;
    public int f5334p;
    public int f5335q;

    public k9(int i10, boolean z10) {
        super(i10, z10);
        this.f5334p = -1;
    }

    public static k9 b(String str, CharSequence charSequence, int i10) {
        k9 k9Var = new k9(9, false);
        k9Var.f5324e = str;
        k9Var.f5325f = charSequence;
        k9Var.f5335q = i10;
        return k9Var;
    }

    public static k9 c() {
        return new k9(0, false);
    }

    public static k9 d() {
        k9 k9Var = new k9(-1, false);
        k9Var.f5333o = -1;
        return k9Var;
    }

    public static k9 e() {
        return new k9(1, false);
    }

    public static k9 f() {
        return new k9(2, false);
    }

    public static k9 g(CharSequence charSequence) {
        k9 k9Var = new k9(6, false);
        k9Var.f5324e = charSequence;
        return k9Var;
    }

    public static k9 h(int i10, int i11, boolean z10) {
        k9 k9Var = new k9(3, false);
        k9Var.f5327i = i10;
        k9Var.f5329k = z10;
        k9Var.f5328j = i11;
        return k9Var;
    }

    public static k9 i(TLRPC.User user, boolean z10, boolean z11) {
        k9 k9Var = new k9(3, true);
        k9Var.f5326g = user;
        k9Var.f5329k = z10;
        k9Var.f5330l = z11;
        return k9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k9.class == obj.getClass()) {
                k9 k9Var = (k9) obj;
                int i10 = this.f16876a;
                if (i10 == k9Var.f16876a) {
                    if (i10 != -1 || (this.f5333o == k9Var.f5333o && this.f5334p == k9Var.f5334p)) {
                        if (i10 != 3 || (this.f5326g == k9Var.f5326g && this.h == k9Var.h && this.f5327i == k9Var.f5327i && this.f5328j == k9Var.f5328j && this.f5329k == k9Var.f5329k && this.f5331m == k9Var.f5331m && this.f5332n == k9Var.f5332n)) {
                            if (i10 != 0 || this.f5323c == k9Var.f5323c) {
                                if (i10 != 2 || TextUtils.equals(this.f5324e, k9Var.f5324e)) {
                                    if (this.f16876a != 8 || TextUtils.equals(this.f5324e, k9Var.f5324e)) {
                                        int i11 = this.f16876a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f5324e, k9Var.f5324e) && TextUtils.equals(this.f5325f, k9Var.f5325f))) {
                                            if (this.f16876a != 6 || (TextUtils.equals(this.f5324e, k9Var.f5324e) && this.f5323c == k9Var.f5323c)) {
                                                if (this.f16876a != 7 || (this.f5323c == k9Var.f5323c && TextUtils.equals(this.f5324e, k9Var.f5324e) && this.f5329k == k9Var.f5329k)) {
                                                    if (this.f16876a != 9 || (this.f5335q == k9Var.f5335q && this.d == k9Var.d && TextUtils.equals(this.f5324e, k9Var.f5324e) && TextUtils.equals(this.f5325f, k9Var.f5325f))) {
                                                        if (this.f16876a != 10 || this.f5335q == k9Var.f5335q) {
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
