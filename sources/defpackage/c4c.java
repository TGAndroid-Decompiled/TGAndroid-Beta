package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class c4c extends ja {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public p8c D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public p8c G;
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
    public fm2 l;
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

    public c4c(int i) {
        super(i, false);
        this.g = true;
        this.v = -1;
        this.J = true;
    }

    public static c4c A(String str, CharSequence charSequence, int i) {
        c4c c4cVar = new c4c(41);
        c4cVar.d = i;
        c4cVar.m = charSequence;
        c4cVar.p = str;
        return c4cVar;
    }

    public static c4c B(int i, CharSequence charSequence) {
        c4c c4cVar = new c4c(7);
        c4cVar.d = i;
        c4cVar.m = charSequence;
        return c4cVar;
    }

    public static c4c C(CharSequence charSequence) {
        c4c c4cVar = new c4c(7);
        c4cVar.m = charSequence;
        return c4cVar;
    }

    public static c4c D(int i) {
        c4c c4cVar = new c4c(28);
        c4cVar.A = i;
        return c4cVar;
    }

    public static c4c E(int i, int i2) {
        c4c c4cVar = new c4c(28);
        c4cVar.d = i;
        c4cVar.A = i2;
        return c4cVar;
    }

    public static c4c F(int i, String str) {
        c4c c4cVar = new c4c(39);
        c4cVar.d = i;
        c4cVar.m = str;
        c4cVar.A = 1;
        return c4cVar;
    }

    public static b4c G(int i) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (b4c) longSparseArray.get(i);
    }

    public static c4c K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        b4c b4cVar = (b4c) M.get(cls);
        if (b4cVar != null) {
            return new c4c(b4cVar.a);
        }
        fyb.h(cls, "UItemFactory was not setuped: ");
        return null;
    }

    public static c4c b(String str) {
        c4c c4cVar = new c4c(1);
        c4cVar.m = str;
        return c4cVar;
    }

    public static c4c c(int i, int i2, String str) {
        c4c c4cVar = new c4c(3);
        c4cVar.d = i;
        c4cVar.k = i2;
        c4cVar.m = str;
        return c4cVar;
    }

    public static c4c d(int i, int i2, String str, String str2) {
        c4c c4cVar = new c4c(3);
        c4cVar.d = i;
        c4cVar.k = i2;
        c4cVar.m = str;
        c4cVar.o = str2;
        return c4cVar;
    }

    public static c4c e(int i, String str) {
        c4c c4cVar = new c4c(3);
        c4cVar.d = i;
        c4cVar.m = str;
        return c4cVar;
    }

    public static c4c f(String str, CharSequence charSequence, int i) {
        c4c c4cVar = new c4c(3);
        c4cVar.d = i;
        c4cVar.m = str;
        c4cVar.o = charSequence;
        return c4cVar;
    }

    public static c4c g(CharSequence charSequence) {
        c4c c4cVar = new c4c(7);
        c4cVar.m = charSequence;
        c4cVar.r = true;
        return c4cVar;
    }

    public static c4c h(int i, int i2, gxa gxaVar) {
        c4c c4cVar = new c4c(i + 18);
        c4cVar.A = i2;
        c4cVar.H = gxaVar;
        return c4cVar;
    }

    public static c4c i(int i, CharSequence charSequence) {
        c4c c4cVar = new c4c(4);
        c4cVar.d = i;
        c4cVar.m = charSequence;
        return c4cVar;
    }

    public static c4c j(int i, View view) {
        c4c c4cVar = new c4c(-1);
        c4cVar.d = i;
        c4cVar.c = view;
        c4cVar.A = -1;
        return c4cVar;
    }

    public static c4c k(View view) {
        c4c c4cVar = new c4c(-1);
        c4cVar.c = view;
        c4cVar.A = -1;
        return c4cVar;
    }

    public static c4c l(int i, View view) {
        c4c c4cVar = new c4c(-4);
        c4cVar.d = i;
        c4cVar.c = view;
        c4cVar.A = -1;
        return c4cVar;
    }

    public static c4c m(View view) {
        c4c c4cVar = new c4c(-4);
        c4cVar.c = view;
        c4cVar.A = -1;
        return c4cVar;
    }

    public static c4c n(View view, int i) {
        c4c c4cVar = new c4c(-4);
        c4cVar.c = view;
        c4cVar.A = i;
        return c4cVar;
    }

    public static c4c o(int i, String str, String str2) {
        c4c c4cVar = new c4c(40);
        c4cVar.d = i;
        c4cVar.m = str;
        c4cVar.p = str2;
        return c4cVar;
    }

    public static c4c p(int i) {
        c4c c4cVar = new c4c(34);
        c4cVar.A = i;
        return c4cVar;
    }

    public static c4c q(int i, int i2) {
        c4c c4cVar = new c4c(34);
        c4cVar.d = i;
        c4cVar.A = i2;
        return c4cVar;
    }

    public static c4c r(String str) {
        c4c c4cVar = new c4c(31);
        c4cVar.m = str;
        return c4cVar;
    }

    public static c4c s(String str, String str2, View.OnClickListener onClickListener) {
        c4c c4cVar = new c4c(31);
        c4cVar.m = str;
        c4cVar.n = str2;
        c4cVar.E = onClickListener;
        return c4cVar;
    }

    public static c4c t(int i, String str) {
        c4c c4cVar = new c4c(0);
        c4cVar.d = i;
        c4cVar.m = str;
        return c4cVar;
    }

    public static c4c u(String str) {
        c4c c4cVar = new c4c(0);
        c4cVar.m = str;
        return c4cVar;
    }

    public static c4c v(wi1 wi1Var) {
        c4c c4cVar = new c4c(24);
        c4cVar.H = wi1Var;
        return c4cVar;
    }

    public static c4c w(TLObject tLObject) {
        c4c c4cVar = new c4c(32);
        c4cVar.H = tLObject;
        return c4cVar;
    }

    public static c4c x(int i, String str) {
        c4c c4cVar = new c4c(10);
        c4cVar.d = i;
        c4cVar.m = str;
        return c4cVar;
    }

    public static c4c y(int i, String str, String str2) {
        c4c c4cVar = new c4c(44);
        c4cVar.d = i;
        c4cVar.m = str;
        c4cVar.o = str2;
        return c4cVar;
    }

    public static c4c z(int i, CharSequence charSequence) {
        c4c c4cVar = new c4c(35);
        c4cVar.d = i;
        c4cVar.m = charSequence;
        return c4cVar;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        b4c b4cVar;
        if (this.a >= 10000 && (hashMap = M) != null && (b4cVar = (b4c) hashMap.get(cls)) != null && b4cVar.a == this.a) {
            return true;
        }
        return false;
    }

    public final boolean I(defpackage.c4c r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4c.I(c4c):boolean");
    }

    public final boolean J(c4c c4cVar) {
        if (this.d == c4cVar.d && this.i == c4cVar.i && this.y == c4cVar.y && this.k == c4cVar.k && this.j == c4cVar.j && this.t == c4cVar.t && this.s == c4cVar.s && this.u == c4cVar.u && this.r == c4cVar.r && this.c == c4cVar.c && TextUtils.equals(this.m, c4cVar.m) && TextUtils.equals(this.n, c4cVar.n) && TextUtils.equals(this.o, c4cVar.o) && this.c == c4cVar.c && this.A == c4cVar.A && Math.abs(this.B - c4cVar.B) < 0.01f && this.C == c4cVar.C && this.l == c4cVar.l && Objects.equals(this.H, c4cVar.H) && Objects.equals(this.I, c4cVar.I)) {
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
        b4c G;
        if (this != jaVar) {
            if (c4c.class == jaVar.getClass()) {
                c4c c4cVar = (c4c) jaVar;
                int i = this.a;
                if (i == c4cVar.a) {
                    if (i == 31) {
                        if (TextUtils.equals(this.m, c4cVar.m) && TextUtils.equals(this.n, c4cVar.n)) {
                            return true;
                        }
                        return false;
                    } else if (i == 28) {
                        if (this.A == c4cVar.A) {
                            return true;
                        }
                        return false;
                    } else if (i != 35 && i != 37) {
                        if (i >= 10000 && (G = G(i)) != null) {
                            return G.c(this, c4cVar);
                        }
                        return I(c4cVar);
                    } else if (this.d == c4cVar.d && TextUtils.equals(this.m, c4cVar.m) && this.e == c4cVar.e) {
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
        b4c G;
        if (this != obj) {
            if (obj != null && c4c.class == obj.getClass()) {
                c4c c4cVar = (c4c) obj;
                int i = this.a;
                if (i == c4cVar.a) {
                    if (i != 36 && i != 35) {
                        if (i == 28) {
                            if (this.d == c4cVar.d) {
                                return true;
                            }
                            return false;
                        } else if (i == 31) {
                            return TextUtils.equals(this.m, c4cVar.m);
                        } else {
                            if (i >= 10000 && (G = G(i)) != null) {
                                return G.e(this, c4cVar);
                            }
                            return J(c4cVar);
                        }
                    } else if (this.d == c4cVar.d) {
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
