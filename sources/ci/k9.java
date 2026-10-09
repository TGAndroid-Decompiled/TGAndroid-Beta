package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class k9 extends og.a {
    public int f5325c;
    public Drawable d;
    public CharSequence f5326e;
    public CharSequence f5327f;
    public TLRPC.User f5328g;
    public TLRPC.Chat h;
    public int f5329i;
    public int f5330j;
    public boolean f5331k;
    public boolean f5332l;
    public boolean f5333m;
    public boolean f5334n;
    public int f5335o;
    public int f5336p;
    public int f5337q;

    public k9(int i10, boolean z10) {
        super(i10, z10);
        this.f5336p = -1;
    }

    public static k9 b(String str, CharSequence charSequence, int i10) {
        k9 k9Var = new k9(9, false);
        k9Var.f5326e = str;
        k9Var.f5327f = charSequence;
        k9Var.f5337q = i10;
        return k9Var;
    }

    public static k9 c() {
        return new k9(0, false);
    }

    public static k9 d() {
        k9 k9Var = new k9(-1, false);
        k9Var.f5335o = -1;
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
        k9Var.f5326e = charSequence;
        return k9Var;
    }

    public static k9 h(int i10, int i11, boolean z10) {
        k9 k9Var = new k9(3, false);
        k9Var.f5329i = i10;
        k9Var.f5331k = z10;
        k9Var.f5330j = i11;
        return k9Var;
    }

    public static k9 i(TLRPC.User user, boolean z10, boolean z11) {
        k9 k9Var = new k9(3, true);
        k9Var.f5328g = user;
        k9Var.f5331k = z10;
        k9Var.f5332l = z11;
        return k9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k9.class == obj.getClass()) {
                k9 k9Var = (k9) obj;
                int i10 = this.f17125a;
                if (i10 == k9Var.f17125a) {
                    if (i10 != -1 || (this.f5335o == k9Var.f5335o && this.f5336p == k9Var.f5336p)) {
                        if (i10 != 3 || (this.f5328g == k9Var.f5328g && this.h == k9Var.h && this.f5329i == k9Var.f5329i && this.f5330j == k9Var.f5330j && this.f5331k == k9Var.f5331k && this.f5333m == k9Var.f5333m && this.f5334n == k9Var.f5334n)) {
                            if (i10 != 0 || this.f5325c == k9Var.f5325c) {
                                if (i10 != 2 || TextUtils.equals(this.f5326e, k9Var.f5326e)) {
                                    if (this.f17125a != 8 || TextUtils.equals(this.f5326e, k9Var.f5326e)) {
                                        int i11 = this.f17125a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f5326e, k9Var.f5326e) && TextUtils.equals(this.f5327f, k9Var.f5327f))) {
                                            if (this.f17125a != 6 || (TextUtils.equals(this.f5326e, k9Var.f5326e) && this.f5325c == k9Var.f5325c)) {
                                                if (this.f17125a != 7 || (this.f5325c == k9Var.f5325c && TextUtils.equals(this.f5326e, k9Var.f5326e) && this.f5331k == k9Var.f5331k)) {
                                                    if (this.f17125a != 9 || (this.f5337q == k9Var.f5337q && this.d == k9Var.d && TextUtils.equals(this.f5326e, k9Var.f5326e) && TextUtils.equals(this.f5327f, k9Var.f5327f))) {
                                                        if (this.f17125a != 10 || this.f5337q == k9Var.f5337q) {
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
