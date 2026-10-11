package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class k9 extends og.a {
    public int f5324c;
    public Drawable d;
    public CharSequence f5325e;
    public CharSequence f5326f;
    public TLRPC.User f5327g;
    public TLRPC.Chat h;
    public int f5328i;
    public int f5329j;
    public boolean f5330k;
    public boolean f5331l;
    public boolean f5332m;
    public boolean f5333n;
    public int f5334o;
    public int f5335p;
    public int f5336q;

    public k9(int i10, boolean z10) {
        super(i10, z10);
        this.f5335p = -1;
    }

    public static k9 b(String str, CharSequence charSequence, int i10) {
        k9 k9Var = new k9(9, false);
        k9Var.f5325e = str;
        k9Var.f5326f = charSequence;
        k9Var.f5336q = i10;
        return k9Var;
    }

    public static k9 c() {
        return new k9(0, false);
    }

    public static k9 d() {
        k9 k9Var = new k9(-1, false);
        k9Var.f5334o = -1;
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
        k9Var.f5325e = charSequence;
        return k9Var;
    }

    public static k9 h(int i10, int i11, boolean z10) {
        k9 k9Var = new k9(3, false);
        k9Var.f5328i = i10;
        k9Var.f5330k = z10;
        k9Var.f5329j = i11;
        return k9Var;
    }

    public static k9 i(TLRPC.User user, boolean z10, boolean z11) {
        k9 k9Var = new k9(3, true);
        k9Var.f5327g = user;
        k9Var.f5330k = z10;
        k9Var.f5331l = z11;
        return k9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k9.class == obj.getClass()) {
                k9 k9Var = (k9) obj;
                int i10 = this.f17211a;
                if (i10 == k9Var.f17211a) {
                    if (i10 != -1 || (this.f5334o == k9Var.f5334o && this.f5335p == k9Var.f5335p)) {
                        if (i10 != 3 || (this.f5327g == k9Var.f5327g && this.h == k9Var.h && this.f5328i == k9Var.f5328i && this.f5329j == k9Var.f5329j && this.f5330k == k9Var.f5330k && this.f5332m == k9Var.f5332m && this.f5333n == k9Var.f5333n)) {
                            if (i10 != 0 || this.f5324c == k9Var.f5324c) {
                                if (i10 != 2 || TextUtils.equals(this.f5325e, k9Var.f5325e)) {
                                    if (this.f17211a != 8 || TextUtils.equals(this.f5325e, k9Var.f5325e)) {
                                        int i11 = this.f17211a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f5325e, k9Var.f5325e) && TextUtils.equals(this.f5326f, k9Var.f5326f))) {
                                            if (this.f17211a != 6 || (TextUtils.equals(this.f5325e, k9Var.f5325e) && this.f5324c == k9Var.f5324c)) {
                                                if (this.f17211a != 7 || (this.f5324c == k9Var.f5324c && TextUtils.equals(this.f5325e, k9Var.f5325e) && this.f5330k == k9Var.f5330k)) {
                                                    if (this.f17211a != 9 || (this.f5336q == k9Var.f5336q && this.d == k9Var.d && TextUtils.equals(this.f5325e, k9Var.f5325e) && TextUtils.equals(this.f5326f, k9Var.f5326f))) {
                                                        if (this.f17211a != 10 || this.f5336q == k9Var.f5336q) {
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
