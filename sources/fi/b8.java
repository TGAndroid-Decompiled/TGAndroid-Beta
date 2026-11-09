package fi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class b8 extends rg.a {
    public int f11691c;
    public Drawable d;
    public CharSequence f11692e;
    public CharSequence f11693f;
    public TLRPC.User f11694g;
    public TLRPC.Chat h;
    public int f11695i;
    public int f11696j;
    public boolean f11697k;
    public boolean f11698l;
    public boolean f11699m;
    public boolean f11700n;
    public int f11701o;
    public int f11702p;
    public int f11703q;

    public b8(int i7, boolean z9) {
        super(i7, z9);
        this.f11702p = -1;
    }

    public static b8 b(String str, CharSequence charSequence, int i7) {
        b8 b8Var = new b8(9, false);
        b8Var.f11692e = str;
        b8Var.f11693f = charSequence;
        b8Var.f11703q = i7;
        return b8Var;
    }

    public static b8 c() {
        return new b8(0, false);
    }

    public static b8 d() {
        b8 b8Var = new b8(-1, false);
        b8Var.f11701o = -1;
        return b8Var;
    }

    public static b8 e() {
        return new b8(1, false);
    }

    public static b8 f() {
        return new b8(2, false);
    }

    public static b8 g(CharSequence charSequence) {
        b8 b8Var = new b8(6, false);
        b8Var.f11692e = charSequence;
        return b8Var;
    }

    public static b8 h(int i7, int i10, boolean z9) {
        b8 b8Var = new b8(3, false);
        b8Var.f11695i = i7;
        b8Var.f11697k = z9;
        b8Var.f11696j = i10;
        return b8Var;
    }

    public static b8 i(TLRPC.User user, boolean z9, boolean z10) {
        b8 b8Var = new b8(3, true);
        b8Var.f11694g = user;
        b8Var.f11697k = z9;
        b8Var.f11698l = z10;
        return b8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b8.class == obj.getClass()) {
                b8 b8Var = (b8) obj;
                int i7 = this.f54544a;
                if (i7 == b8Var.f54544a) {
                    if (i7 != -1 || (this.f11701o == b8Var.f11701o && this.f11702p == b8Var.f11702p)) {
                        if (i7 != 3 || (this.f11694g == b8Var.f11694g && this.h == b8Var.h && this.f11695i == b8Var.f11695i && this.f11696j == b8Var.f11696j && this.f11697k == b8Var.f11697k && this.f11699m == b8Var.f11699m && this.f11700n == b8Var.f11700n)) {
                            if (i7 != 0 || this.f11691c == b8Var.f11691c) {
                                if (i7 != 2 || TextUtils.equals(this.f11692e, b8Var.f11692e)) {
                                    if (this.f54544a != 8 || TextUtils.equals(this.f11692e, b8Var.f11692e)) {
                                        int i10 = this.f54544a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f11692e, b8Var.f11692e) && TextUtils.equals(this.f11693f, b8Var.f11693f))) {
                                            if (this.f54544a != 6 || (TextUtils.equals(this.f11692e, b8Var.f11692e) && this.f11691c == b8Var.f11691c)) {
                                                if (this.f54544a != 7 || (this.f11691c == b8Var.f11691c && TextUtils.equals(this.f11692e, b8Var.f11692e) && this.f11697k == b8Var.f11697k)) {
                                                    if (this.f54544a != 9 || (this.f11703q == b8Var.f11703q && this.d == b8Var.d && TextUtils.equals(this.f11692e, b8Var.f11692e) && TextUtils.equals(this.f11693f, b8Var.f11693f))) {
                                                        if (this.f54544a != 10 || this.f11703q == b8Var.f11703q) {
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
