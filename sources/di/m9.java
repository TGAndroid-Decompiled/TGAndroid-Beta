package di;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class m9 extends pg.a {
    public int f7647c;
    public Drawable d;
    public CharSequence f7648e;
    public CharSequence f7649f;
    public TLRPC.User f7650g;
    public TLRPC.Chat h;
    public int f7651i;
    public int f7652j;
    public boolean f7653k;
    public boolean f7654l;
    public boolean f7655m;
    public boolean f7656n;
    public int f7657o;
    public int f7658p;
    public int f7659q;

    public m9(int i10, boolean z10) {
        super(i10, z10);
        this.f7658p = -1;
    }

    public static m9 b(String str, CharSequence charSequence, int i10) {
        m9 m9Var = new m9(9, false);
        m9Var.f7648e = str;
        m9Var.f7649f = charSequence;
        m9Var.f7659q = i10;
        return m9Var;
    }

    public static m9 c() {
        return new m9(0, false);
    }

    public static m9 d() {
        m9 m9Var = new m9(-1, false);
        m9Var.f7657o = -1;
        return m9Var;
    }

    public static m9 e() {
        return new m9(1, false);
    }

    public static m9 f() {
        return new m9(2, false);
    }

    public static m9 g(CharSequence charSequence) {
        m9 m9Var = new m9(6, false);
        m9Var.f7648e = charSequence;
        return m9Var;
    }

    public static m9 h(int i10, int i11, boolean z10) {
        m9 m9Var = new m9(3, false);
        m9Var.f7651i = i10;
        m9Var.f7653k = z10;
        m9Var.f7652j = i11;
        return m9Var;
    }

    public static m9 i(TLRPC.User user, boolean z10, boolean z11) {
        m9 m9Var = new m9(3, true);
        m9Var.f7650g = user;
        m9Var.f7653k = z10;
        m9Var.f7654l = z11;
        return m9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m9.class == obj.getClass()) {
                m9 m9Var = (m9) obj;
                int i10 = this.f44071a;
                if (i10 == m9Var.f44071a) {
                    if (i10 != -1 || (this.f7657o == m9Var.f7657o && this.f7658p == m9Var.f7658p)) {
                        if (i10 != 3 || (this.f7650g == m9Var.f7650g && this.h == m9Var.h && this.f7651i == m9Var.f7651i && this.f7652j == m9Var.f7652j && this.f7653k == m9Var.f7653k && this.f7655m == m9Var.f7655m && this.f7656n == m9Var.f7656n)) {
                            if (i10 != 0 || this.f7647c == m9Var.f7647c) {
                                if (i10 != 2 || TextUtils.equals(this.f7648e, m9Var.f7648e)) {
                                    if (this.f44071a != 8 || TextUtils.equals(this.f7648e, m9Var.f7648e)) {
                                        int i11 = this.f44071a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f7648e, m9Var.f7648e) && TextUtils.equals(this.f7649f, m9Var.f7649f))) {
                                            if (this.f44071a != 6 || (TextUtils.equals(this.f7648e, m9Var.f7648e) && this.f7647c == m9Var.f7647c)) {
                                                if (this.f44071a != 7 || (this.f7647c == m9Var.f7647c && TextUtils.equals(this.f7648e, m9Var.f7648e) && this.f7653k == m9Var.f7653k)) {
                                                    if (this.f44071a != 9 || (this.f7659q == m9Var.f7659q && this.d == m9Var.d && TextUtils.equals(this.f7648e, m9Var.f7648e) && TextUtils.equals(this.f7649f, m9Var.f7649f))) {
                                                        if (this.f44071a != 10 || this.f7659q == m9Var.f7659q) {
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
