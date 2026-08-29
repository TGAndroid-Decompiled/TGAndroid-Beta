package nh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class m8 extends zf.a {
    public int f18137c;
    public Drawable d;
    public CharSequence f18138e;
    public CharSequence f18139f;
    public TLRPC.User f18140g;
    public TLRPC.Chat h;
    public int f18141i;
    public int f18142j;
    public boolean f18143k;
    public boolean f18144l;
    public boolean f18145m;
    public boolean f18146n;
    public int f18147o;
    public int f18148p;
    public int f18149q;

    public m8(int i10, boolean z10) {
        super(i10, z10);
        this.f18148p = -1;
    }

    public static m8 b(String str, CharSequence charSequence, int i10) {
        m8 m8Var = new m8(9, false);
        m8Var.f18138e = str;
        m8Var.f18139f = charSequence;
        m8Var.f18149q = i10;
        return m8Var;
    }

    public static m8 c() {
        return new m8(0, false);
    }

    public static m8 d() {
        m8 m8Var = new m8(-1, false);
        m8Var.f18147o = -1;
        return m8Var;
    }

    public static m8 e() {
        return new m8(1, false);
    }

    public static m8 f() {
        return new m8(2, false);
    }

    public static m8 g(CharSequence charSequence) {
        m8 m8Var = new m8(6, false);
        m8Var.f18138e = charSequence;
        return m8Var;
    }

    public static m8 h(int i10, int i11, boolean z10) {
        m8 m8Var = new m8(3, false);
        m8Var.f18141i = i10;
        m8Var.f18143k = z10;
        m8Var.f18142j = i11;
        return m8Var;
    }

    public static m8 i(TLRPC.User user, boolean z10, boolean z11) {
        m8 m8Var = new m8(3, true);
        m8Var.f18140g = user;
        m8Var.f18143k = z10;
        m8Var.f18144l = z11;
        return m8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m8.class == obj.getClass()) {
                m8 m8Var = (m8) obj;
                int i10 = this.f50845a;
                if (i10 == m8Var.f50845a) {
                    if (i10 != -1 || (this.f18147o == m8Var.f18147o && this.f18148p == m8Var.f18148p)) {
                        if (i10 != 3 || (this.f18140g == m8Var.f18140g && this.h == m8Var.h && this.f18141i == m8Var.f18141i && this.f18142j == m8Var.f18142j && this.f18143k == m8Var.f18143k && this.f18145m == m8Var.f18145m && this.f18146n == m8Var.f18146n)) {
                            if (i10 != 0 || this.f18137c == m8Var.f18137c) {
                                if (i10 != 2 || TextUtils.equals(this.f18138e, m8Var.f18138e)) {
                                    if (this.f50845a != 8 || TextUtils.equals(this.f18138e, m8Var.f18138e)) {
                                        int i11 = this.f50845a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f18138e, m8Var.f18138e) && TextUtils.equals(this.f18139f, m8Var.f18139f))) {
                                            if (this.f50845a != 6 || (TextUtils.equals(this.f18138e, m8Var.f18138e) && this.f18137c == m8Var.f18137c)) {
                                                if (this.f50845a != 7 || (this.f18137c == m8Var.f18137c && TextUtils.equals(this.f18138e, m8Var.f18138e) && this.f18143k == m8Var.f18143k)) {
                                                    if (this.f50845a != 9 || (this.f18149q == m8Var.f18149q && this.d == m8Var.d && TextUtils.equals(this.f18138e, m8Var.f18138e) && TextUtils.equals(this.f18139f, m8Var.f18139f))) {
                                                        if (this.f50845a != 10 || this.f18149q == m8Var.f18149q) {
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
