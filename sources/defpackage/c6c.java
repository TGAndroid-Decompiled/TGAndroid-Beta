package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class c6c extends ja {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public qac D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public qac G;
    public Object H;
    public Object I;
    public boolean J;
    public View c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public sn2 l;
    public CharSequence m;
    public CharSequence n;
    public CharSequence o;
    public CharSequence p;
    public String[] q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public boolean x;
    public long y;
    public int z;

    public c6c(int i) {
        super(i, false);
        this.g = true;
        this.v = -1;
        this.J = true;
    }

    public static c6c A(String str, CharSequence charSequence, int i) {
        c6c c6cVar = new c6c(41);
        c6cVar.d = i;
        c6cVar.m = charSequence;
        c6cVar.p = str;
        return c6cVar;
    }

    public static c6c B(int i, CharSequence charSequence) {
        c6c c6cVar = new c6c(7);
        c6cVar.d = i;
        c6cVar.m = charSequence;
        return c6cVar;
    }

    public static c6c C(CharSequence charSequence) {
        c6c c6cVar = new c6c(7);
        c6cVar.m = charSequence;
        return c6cVar;
    }

    public static c6c D(int i) {
        c6c c6cVar = new c6c(28);
        c6cVar.A = i;
        return c6cVar;
    }

    public static c6c E(int i, int i2) {
        c6c c6cVar = new c6c(28);
        c6cVar.d = i;
        c6cVar.A = i2;
        return c6cVar;
    }

    public static c6c F(int i, String str) {
        c6c c6cVar = new c6c(39);
        c6cVar.d = i;
        c6cVar.m = str;
        c6cVar.A = 1;
        return c6cVar;
    }

    public static b6c G(int i) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (b6c) longSparseArray.get(i);
    }

    public static c6c K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        b6c b6cVar = (b6c) M.get(cls);
        if (b6cVar != null) {
            return new c6c(b6cVar.a);
        }
        rjb.i(cls, "UItemFactory was not setuped: ");
        return null;
    }

    public static c6c b(String str) {
        c6c c6cVar = new c6c(1);
        c6cVar.m = str;
        return c6cVar;
    }

    public static c6c c(int i, int i2, String str) {
        c6c c6cVar = new c6c(3);
        c6cVar.d = i;
        c6cVar.k = i2;
        c6cVar.m = str;
        return c6cVar;
    }

    public static c6c d(int i, int i2, String str, String str2) {
        c6c c6cVar = new c6c(3);
        c6cVar.d = i;
        c6cVar.k = i2;
        c6cVar.m = str;
        c6cVar.o = str2;
        return c6cVar;
    }

    public static c6c e(int i, String str) {
        c6c c6cVar = new c6c(3);
        c6cVar.d = i;
        c6cVar.m = str;
        return c6cVar;
    }

    public static c6c f(String str, CharSequence charSequence, int i) {
        c6c c6cVar = new c6c(3);
        c6cVar.d = i;
        c6cVar.m = str;
        c6cVar.o = charSequence;
        return c6cVar;
    }

    public static c6c g(CharSequence charSequence) {
        c6c c6cVar = new c6c(7);
        c6cVar.m = charSequence;
        c6cVar.r = true;
        return c6cVar;
    }

    public static c6c h(int i, int i2, jza jzaVar) {
        c6c c6cVar = new c6c(i + 18);
        c6cVar.A = i2;
        c6cVar.H = jzaVar;
        return c6cVar;
    }

    public static c6c i(int i, CharSequence charSequence) {
        c6c c6cVar = new c6c(4);
        c6cVar.d = i;
        c6cVar.m = charSequence;
        return c6cVar;
    }

    public static c6c j(int i, View view) {
        c6c c6cVar = new c6c(-1);
        c6cVar.d = i;
        c6cVar.c = view;
        c6cVar.A = -1;
        return c6cVar;
    }

    public static c6c k(View view) {
        c6c c6cVar = new c6c(-1);
        c6cVar.c = view;
        c6cVar.A = -1;
        return c6cVar;
    }

    public static c6c l(int i, View view) {
        c6c c6cVar = new c6c(-4);
        c6cVar.d = i;
        c6cVar.c = view;
        c6cVar.A = -1;
        return c6cVar;
    }

    public static c6c m(View view) {
        c6c c6cVar = new c6c(-4);
        c6cVar.c = view;
        c6cVar.A = -1;
        return c6cVar;
    }

    public static c6c n(View view, int i) {
        c6c c6cVar = new c6c(-4);
        c6cVar.c = view;
        c6cVar.A = i;
        return c6cVar;
    }

    public static c6c o(int i, String str, String str2) {
        c6c c6cVar = new c6c(40);
        c6cVar.d = i;
        c6cVar.m = str;
        c6cVar.p = str2;
        return c6cVar;
    }

    public static c6c p(int i) {
        c6c c6cVar = new c6c(34);
        c6cVar.A = i;
        return c6cVar;
    }

    public static c6c q(int i, int i2) {
        c6c c6cVar = new c6c(34);
        c6cVar.d = i;
        c6cVar.A = i2;
        return c6cVar;
    }

    public static c6c r(String str) {
        c6c c6cVar = new c6c(31);
        c6cVar.m = str;
        return c6cVar;
    }

    public static c6c s(String str, String str2, View.OnClickListener onClickListener) {
        c6c c6cVar = new c6c(31);
        c6cVar.m = str;
        c6cVar.n = str2;
        c6cVar.E = onClickListener;
        return c6cVar;
    }

    public static c6c t(int i, String str) {
        c6c c6cVar = new c6c(0);
        c6cVar.d = i;
        c6cVar.m = str;
        return c6cVar;
    }

    public static c6c u(String str) {
        c6c c6cVar = new c6c(0);
        c6cVar.m = str;
        return c6cVar;
    }

    public static c6c v(fk1 fk1Var) {
        c6c c6cVar = new c6c(24);
        c6cVar.H = fk1Var;
        return c6cVar;
    }

    public static c6c w(TLObject tLObject) {
        c6c c6cVar = new c6c(32);
        c6cVar.H = tLObject;
        return c6cVar;
    }

    public static c6c x(int i, String str) {
        c6c c6cVar = new c6c(10);
        c6cVar.d = i;
        c6cVar.m = str;
        return c6cVar;
    }

    public static c6c y(int i, String str, String str2) {
        c6c c6cVar = new c6c(44);
        c6cVar.d = i;
        c6cVar.m = str;
        c6cVar.o = str2;
        return c6cVar;
    }

    public static c6c z(int i, CharSequence charSequence) {
        c6c c6cVar = new c6c(35);
        c6cVar.d = i;
        c6cVar.m = charSequence;
        return c6cVar;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        b6c b6cVar;
        if (this.a >= 10000 && (hashMap = M) != null && (b6cVar = (b6c) hashMap.get(cls)) != null && b6cVar.a == this.a) {
            return true;
        }
        return false;
    }

    public final boolean I(defpackage.c6c r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6c.I(c6c):boolean");
    }

    public final boolean J(c6c c6cVar) {
        if (this.d == c6cVar.d && this.i == c6cVar.i && this.y == c6cVar.y && this.k == c6cVar.k && this.j == c6cVar.j && this.t == c6cVar.t && this.s == c6cVar.s && this.u == c6cVar.u && this.r == c6cVar.r && this.c == c6cVar.c && TextUtils.equals(this.m, c6cVar.m) && TextUtils.equals(this.n, c6cVar.n) && TextUtils.equals(this.o, c6cVar.o) && this.c == c6cVar.c && this.A == c6cVar.A && Math.abs(this.B - c6cVar.B) < 0.01f && this.C == c6cVar.C && this.l == c6cVar.l && Objects.equals(this.H, c6cVar.H) && Objects.equals(this.I, c6cVar.I)) {
            return true;
        }
        return false;
    }

    public final void L(boolean z) {
        this.e = z;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override
    public final boolean a(ja jaVar) {
        b6c G;
        if (this != jaVar) {
            if (c6c.class == jaVar.getClass()) {
                c6c c6cVar = (c6c) jaVar;
                int i = this.a;
                if (i == c6cVar.a) {
                    if (i == 31) {
                        if (TextUtils.equals(this.m, c6cVar.m) && TextUtils.equals(this.n, c6cVar.n)) {
                            return true;
                        }
                        return false;
                    } else if (i == 28) {
                        if (this.A == c6cVar.A) {
                            return true;
                        }
                        return false;
                    } else if (i != 35 && i != 37) {
                        if (i >= 10000 && (G = G(i)) != null) {
                            return G.c(this, c6cVar);
                        }
                        return I(c6cVar);
                    } else if (this.d == c6cVar.d && TextUtils.equals(this.m, c6cVar.m) && this.e == c6cVar.e) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        b6c G;
        if (this != obj) {
            if (obj != null && c6c.class == obj.getClass()) {
                c6c c6cVar = (c6c) obj;
                int i = this.a;
                if (i == c6cVar.a) {
                    if (i != 36 && i != 35) {
                        if (i == 28) {
                            if (this.d == c6cVar.d) {
                                return true;
                            }
                            return false;
                        } else if (i == 31) {
                            return TextUtils.equals(this.m, c6cVar.m);
                        } else {
                            if (i >= 10000 && (G = G(i)) != null) {
                                return G.e(this, c6cVar);
                            }
                            return J(c6cVar);
                        }
                    } else if (this.d == c6cVar.d) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
