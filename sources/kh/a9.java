package kh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class a9 extends wf.a {
    public int f14954c;
    public Drawable d;
    public CharSequence f14955e;
    public CharSequence f14956f;
    public TLRPC.User f14957g;
    public TLRPC.Chat h;
    public int f14958i;
    public int f14959j;
    public boolean f14960k;
    public boolean f14961l;
    public boolean f14962m;
    public boolean f14963n;
    public int f14964o;
    public int f14965p;
    public int f14966q;

    public a9(int i9, boolean z10) {
        super(i9, z10);
        this.f14965p = -1;
    }

    public static a9 b(String str, CharSequence charSequence, int i9) {
        a9 a9Var = new a9(9, false);
        a9Var.f14955e = str;
        a9Var.f14956f = charSequence;
        a9Var.f14966q = i9;
        return a9Var;
    }

    public static a9 c() {
        return new a9(0, false);
    }

    public static a9 d() {
        a9 a9Var = new a9(-1, false);
        a9Var.f14964o = -1;
        return a9Var;
    }

    public static a9 e() {
        return new a9(1, false);
    }

    public static a9 f() {
        return new a9(2, false);
    }

    public static a9 g(CharSequence charSequence) {
        a9 a9Var = new a9(6, false);
        a9Var.f14955e = charSequence;
        return a9Var;
    }

    public static a9 h(int i9, int i10, boolean z10) {
        a9 a9Var = new a9(3, false);
        a9Var.f14958i = i9;
        a9Var.f14960k = z10;
        a9Var.f14959j = i10;
        return a9Var;
    }

    public static a9 i(TLRPC.User user, boolean z10, boolean z11) {
        a9 a9Var = new a9(3, true);
        a9Var.f14957g = user;
        a9Var.f14960k = z10;
        a9Var.f14961l = z11;
        return a9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a9.class == obj.getClass()) {
                a9 a9Var = (a9) obj;
                int i9 = this.f48814a;
                if (i9 == a9Var.f48814a) {
                    if (i9 != -1 || (this.f14964o == a9Var.f14964o && this.f14965p == a9Var.f14965p)) {
                        if (i9 != 3 || (this.f14957g == a9Var.f14957g && this.h == a9Var.h && this.f14958i == a9Var.f14958i && this.f14959j == a9Var.f14959j && this.f14960k == a9Var.f14960k && this.f14962m == a9Var.f14962m && this.f14963n == a9Var.f14963n)) {
                            if (i9 != 0 || this.f14954c == a9Var.f14954c) {
                                if (i9 != 2 || TextUtils.equals(this.f14955e, a9Var.f14955e)) {
                                    if (this.f48814a != 8 || TextUtils.equals(this.f14955e, a9Var.f14955e)) {
                                        int i10 = this.f48814a;
                                        if ((i10 != 4 && i10 != 11) || (TextUtils.equals(this.f14955e, a9Var.f14955e) && TextUtils.equals(this.f14956f, a9Var.f14956f))) {
                                            if (this.f48814a != 6 || (TextUtils.equals(this.f14955e, a9Var.f14955e) && this.f14954c == a9Var.f14954c)) {
                                                if (this.f48814a != 7 || (this.f14954c == a9Var.f14954c && TextUtils.equals(this.f14955e, a9Var.f14955e) && this.f14960k == a9Var.f14960k)) {
                                                    if (this.f48814a != 9 || (this.f14966q == a9Var.f14966q && this.d == a9Var.d && TextUtils.equals(this.f14955e, a9Var.f14955e) && TextUtils.equals(this.f14956f, a9Var.f14956f))) {
                                                        if (this.f48814a != 10 || this.f14966q == a9Var.f14966q) {
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
