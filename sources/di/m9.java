package di;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class m9 extends pg.a {
    public int f7675c;
    public Drawable d;
    public CharSequence f7676e;
    public CharSequence f7677f;
    public TLRPC.User f7678g;
    public TLRPC.Chat h;
    public int f7679i;
    public int f7680j;
    public boolean f7681k;
    public boolean f7682l;
    public boolean f7683m;
    public boolean f7684n;
    public int f7685o;
    public int f7686p;
    public int f7687q;

    public m9(int i10, boolean z10) {
        super(i10, z10);
        this.f7686p = -1;
    }

    public static m9 b(String str, CharSequence charSequence, int i10) {
        m9 m9Var = new m9(9, false);
        m9Var.f7676e = str;
        m9Var.f7677f = charSequence;
        m9Var.f7687q = i10;
        return m9Var;
    }

    public static m9 c() {
        return new m9(0, false);
    }

    public static m9 d() {
        m9 m9Var = new m9(-1, false);
        m9Var.f7685o = -1;
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
        m9Var.f7676e = charSequence;
        return m9Var;
    }

    public static m9 h(int i10, int i11, boolean z10) {
        m9 m9Var = new m9(3, false);
        m9Var.f7679i = i10;
        m9Var.f7681k = z10;
        m9Var.f7680j = i11;
        return m9Var;
    }

    public static m9 i(TLRPC.User user, boolean z10, boolean z11) {
        m9 m9Var = new m9(3, true);
        m9Var.f7678g = user;
        m9Var.f7681k = z10;
        m9Var.f7682l = z11;
        return m9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m9.class == obj.getClass()) {
                m9 m9Var = (m9) obj;
                int i10 = this.f44098a;
                if (i10 == m9Var.f44098a) {
                    if (i10 != -1 || (this.f7685o == m9Var.f7685o && this.f7686p == m9Var.f7686p)) {
                        if (i10 != 3 || (this.f7678g == m9Var.f7678g && this.h == m9Var.h && this.f7679i == m9Var.f7679i && this.f7680j == m9Var.f7680j && this.f7681k == m9Var.f7681k && this.f7683m == m9Var.f7683m && this.f7684n == m9Var.f7684n)) {
                            if (i10 != 0 || this.f7675c == m9Var.f7675c) {
                                if (i10 != 2 || TextUtils.equals(this.f7676e, m9Var.f7676e)) {
                                    if (this.f44098a != 8 || TextUtils.equals(this.f7676e, m9Var.f7676e)) {
                                        int i11 = this.f44098a;
                                        if ((i11 != 4 && i11 != 11) || (TextUtils.equals(this.f7676e, m9Var.f7676e) && TextUtils.equals(this.f7677f, m9Var.f7677f))) {
                                            if (this.f44098a != 6 || (TextUtils.equals(this.f7676e, m9Var.f7676e) && this.f7675c == m9Var.f7675c)) {
                                                if (this.f44098a != 7 || (this.f7675c == m9Var.f7675c && TextUtils.equals(this.f7676e, m9Var.f7676e) && this.f7681k == m9Var.f7681k)) {
                                                    if (this.f44098a != 9 || (this.f7687q == m9Var.f7687q && this.d == m9Var.d && TextUtils.equals(this.f7676e, m9Var.f7676e) && TextUtils.equals(this.f7677f, m9Var.f7677f))) {
                                                        if (this.f44098a != 10 || this.f7687q == m9Var.f7687q) {
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
