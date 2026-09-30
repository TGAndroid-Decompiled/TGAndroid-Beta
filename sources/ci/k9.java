package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class k9 extends og.a {
    public int f4911c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f4912f;
    public TLRPC.User f4913g;
    public TLRPC.Chat h;
    public int f4914i;
    public int f4915j;
    public boolean f4916k;
    public boolean f4917l;
    public boolean f4918m;
    public boolean f4919n;
    public int f4920o;
    public int f4921p;
    public int f4922q;

    public k9(int i10, boolean z10) {
        super(i10, z10);
        this.f4921p = -1;
    }

    public static k9 b(String str, CharSequence charSequence, int i10) {
        k9 k9Var = new k9(9, false);
        k9Var.e = str;
        k9Var.f4912f = charSequence;
        k9Var.f4922q = i10;
        return k9Var;
    }

    public static k9 c() {
        return new k9(0, false);
    }

    public static k9 d() {
        k9 k9Var = new k9(-1, false);
        k9Var.f4920o = -1;
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
        k9Var.e = charSequence;
        return k9Var;
    }

    public static k9 h(int i10, int i11, boolean z10) {
        k9 k9Var = new k9(3, false);
        k9Var.f4914i = i10;
        k9Var.f4916k = z10;
        k9Var.f4915j = i11;
        return k9Var;
    }

    public static k9 i(TLRPC.User user, boolean z10, boolean z11) {
        k9 k9Var = new k9(3, true);
        k9Var.f4913g = user;
        k9Var.f4916k = z10;
        k9Var.f4917l = z11;
        return k9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k9.class == obj.getClass()) {
                k9 k9Var = (k9) obj;
                int i10 = this.f15731a;
                if (i10 == k9Var.f15731a) {
                    if (i10 != -1 || (this.f4920o == k9Var.f4920o && this.f4921p == k9Var.f4921p)) {
                        if (i10 != 3 || (this.f4913g == k9Var.f4913g && this.h == k9Var.h && this.f4914i == k9Var.f4914i && this.f4915j == k9Var.f4915j && this.f4916k == k9Var.f4916k && this.f4918m == k9Var.f4918m && this.f4919n == k9Var.f4919n)) {
                            if (i10 != 0 || this.f4911c == k9Var.f4911c) {
                                if (i10 != 2 || TextUtils.equals(this.e, k9Var.e)) {
                                    if (this.f15731a != 8 || TextUtils.equals(this.e, k9Var.e)) {
                                        int i11 = this.f15731a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.e, k9Var.e) && TextUtils.equals(this.f4912f, k9Var.f4912f))) {
                                            if (this.f15731a != 6 || (TextUtils.equals(this.e, k9Var.e) && this.f4911c == k9Var.f4911c)) {
                                                if (this.f15731a != 7 || (this.f4911c == k9Var.f4911c && TextUtils.equals(this.e, k9Var.e) && this.f4916k == k9Var.f4916k)) {
                                                    if (this.f15731a != 9 || (this.f4922q == k9Var.f4922q && this.d == k9Var.d && TextUtils.equals(this.e, k9Var.e) && TextUtils.equals(this.f4912f, k9Var.f4912f))) {
                                                        if (this.f15731a != 10 || this.f4922q == k9Var.f4922q) {
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
