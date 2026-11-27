package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class b8c extends ka {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public pcc D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public pcc G;
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
    public zm2 l;
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

    public b8c(int i) {
        super(i, false);
        this.g = true;
        this.v = -1;
        this.J = true;
    }

    public static b8c A(String str, CharSequence charSequence, int i) {
        b8c b8cVar = new b8c(41);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        b8cVar.p = str;
        return b8cVar;
    }

    public static b8c B(int i, CharSequence charSequence) {
        b8c b8cVar = new b8c(7);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public static b8c C(CharSequence charSequence) {
        b8c b8cVar = new b8c(7);
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public static b8c D(int i) {
        b8c b8cVar = new b8c(28);
        b8cVar.A = i;
        return b8cVar;
    }

    public static b8c E(int i, int i2) {
        b8c b8cVar = new b8c(28);
        b8cVar.d = i;
        b8cVar.A = i2;
        return b8cVar;
    }

    public static b8c F(int i, String str) {
        b8c b8cVar = new b8c(39);
        b8cVar.d = i;
        b8cVar.m = str;
        b8cVar.A = 1;
        return b8cVar;
    }

    public static a8c G(int i) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (a8c) longSparseArray.get(i);
    }

    public static b8c K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        a8c a8cVar = (a8c) M.get(cls);
        if (a8cVar != null) {
            return new b8c(a8cVar.a);
        }
        grb.h(cls, "UItemFactory was not setuped: ");
        return null;
    }

    public static b8c b(String str) {
        b8c b8cVar = new b8c(1);
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c c(int i, int i2, String str) {
        b8c b8cVar = new b8c(3);
        b8cVar.d = i;
        b8cVar.k = i2;
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c d(int i, int i2, String str, String str2) {
        b8c b8cVar = new b8c(3);
        b8cVar.d = i;
        b8cVar.k = i2;
        b8cVar.m = str;
        b8cVar.o = str2;
        return b8cVar;
    }

    public static b8c e(int i, String str) {
        b8c b8cVar = new b8c(3);
        b8cVar.d = i;
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c f(String str, CharSequence charSequence, int i) {
        b8c b8cVar = new b8c(3);
        b8cVar.d = i;
        b8cVar.m = str;
        b8cVar.o = charSequence;
        return b8cVar;
    }

    public static b8c g(CharSequence charSequence) {
        b8c b8cVar = new b8c(7);
        b8cVar.m = charSequence;
        b8cVar.r = true;
        return b8cVar;
    }

    public static b8c h(int i, int i2, i1b i1bVar) {
        b8c b8cVar = new b8c(i + 18);
        b8cVar.A = i2;
        b8cVar.H = i1bVar;
        return b8cVar;
    }

    public static b8c i(int i, CharSequence charSequence) {
        b8c b8cVar = new b8c(4);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public static b8c j(int i, View view) {
        b8c b8cVar = new b8c(-1);
        b8cVar.d = i;
        b8cVar.c = view;
        b8cVar.A = -1;
        return b8cVar;
    }

    public static b8c k(View view) {
        b8c b8cVar = new b8c(-1);
        b8cVar.c = view;
        b8cVar.A = -1;
        return b8cVar;
    }

    public static b8c l(int i, View view) {
        b8c b8cVar = new b8c(-4);
        b8cVar.d = i;
        b8cVar.c = view;
        b8cVar.A = -1;
        return b8cVar;
    }

    public static b8c m(View view) {
        b8c b8cVar = new b8c(-4);
        b8cVar.c = view;
        b8cVar.A = -1;
        return b8cVar;
    }

    public static b8c n(View view, int i) {
        b8c b8cVar = new b8c(-4);
        b8cVar.c = view;
        b8cVar.A = i;
        return b8cVar;
    }

    public static b8c o(int i, String str, String str2) {
        b8c b8cVar = new b8c(40);
        b8cVar.d = i;
        b8cVar.m = str;
        b8cVar.p = str2;
        return b8cVar;
    }

    public static b8c p(int i) {
        b8c b8cVar = new b8c(34);
        b8cVar.A = i;
        return b8cVar;
    }

    public static b8c q(int i, int i2) {
        b8c b8cVar = new b8c(34);
        b8cVar.d = i;
        b8cVar.A = i2;
        return b8cVar;
    }

    public static b8c r(String str) {
        b8c b8cVar = new b8c(31);
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c s(String str, String str2, View.OnClickListener onClickListener) {
        b8c b8cVar = new b8c(31);
        b8cVar.m = str;
        b8cVar.n = str2;
        b8cVar.E = onClickListener;
        return b8cVar;
    }

    public static b8c t(int i, String str) {
        b8c b8cVar = new b8c(0);
        b8cVar.d = i;
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c u(String str) {
        b8c b8cVar = new b8c(0);
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c v(fj1 fj1Var) {
        b8c b8cVar = new b8c(24);
        b8cVar.H = fj1Var;
        return b8cVar;
    }

    public static b8c w(TLObject tLObject) {
        b8c b8cVar = new b8c(32);
        b8cVar.H = tLObject;
        return b8cVar;
    }

    public static b8c x(int i, CharSequence charSequence) {
        b8c b8cVar = new b8c(10);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public static b8c y(int i, String str, String str2) {
        b8c b8cVar = new b8c(44);
        b8cVar.d = i;
        b8cVar.m = str;
        b8cVar.o = str2;
        return b8cVar;
    }

    public static b8c z(int i, CharSequence charSequence) {
        b8c b8cVar = new b8c(35);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        a8c a8cVar;
        if (this.a >= 10000 && (hashMap = M) != null && (a8cVar = (a8c) hashMap.get(cls)) != null && a8cVar.a == this.a) {
            return true;
        }
        return false;
    }

    public final boolean I(defpackage.b8c r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8c.I(b8c):boolean");
    }

    public final boolean J(b8c b8cVar) {
        if (this.d == b8cVar.d && this.i == b8cVar.i && this.y == b8cVar.y && this.k == b8cVar.k && this.j == b8cVar.j && this.t == b8cVar.t && this.s == b8cVar.s && this.u == b8cVar.u && this.r == b8cVar.r && this.c == b8cVar.c && TextUtils.equals(this.m, b8cVar.m) && TextUtils.equals(this.n, b8cVar.n) && TextUtils.equals(this.o, b8cVar.o) && this.c == b8cVar.c && this.A == b8cVar.A && Math.abs(this.B - b8cVar.B) < 0.01f && this.C == b8cVar.C && this.l == b8cVar.l && Objects.equals(this.H, b8cVar.H) && Objects.equals(this.I, b8cVar.I)) {
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
    public final boolean a(ka kaVar) {
        a8c G;
        if (this != kaVar) {
            if (b8c.class == kaVar.getClass()) {
                b8c b8cVar = (b8c) kaVar;
                int i = this.a;
                if (i == b8cVar.a) {
                    if (i == 31) {
                        if (TextUtils.equals(this.m, b8cVar.m) && TextUtils.equals(this.n, b8cVar.n)) {
                            return true;
                        }
                        return false;
                    } else if (i == 28) {
                        if (this.A == b8cVar.A) {
                            return true;
                        }
                        return false;
                    } else if (i != 35 && i != 37) {
                        if (i >= 10000 && (G = G(i)) != null) {
                            return G.c(this, b8cVar);
                        }
                        return I(b8cVar);
                    } else if (this.d == b8cVar.d && TextUtils.equals(this.m, b8cVar.m) && this.e == b8cVar.e) {
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
        a8c G;
        if (this != obj) {
            if (obj != null && b8c.class == obj.getClass()) {
                b8c b8cVar = (b8c) obj;
                int i = this.a;
                if (i == b8cVar.a) {
                    if (i != 36 && i != 35) {
                        if (i == 28) {
                            if (this.d == b8cVar.d) {
                                return true;
                            }
                            return false;
                        } else if (i == 31) {
                            return TextUtils.equals(this.m, b8cVar.m);
                        } else {
                            if (i >= 10000 && (G = G(i)) != null) {
                                return G.e(this, b8cVar);
                            }
                            return J(b8cVar);
                        }
                    } else if (this.d == b8cVar.d) {
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
