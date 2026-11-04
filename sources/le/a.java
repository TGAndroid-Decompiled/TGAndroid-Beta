package le;

import e0.e0;
public final class a implements he.a {
    public static final a f18179a = new Object();
    public static final n f18180b = new n("kotlin.Boolean", je.b.f16239b);

    @Override
    public final Object a(g2.d decoder) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.j.e(decoder, "decoder");
        e0 e0Var = (e0) decoder.d;
        int u10 = e0Var.u();
        String str = (String) e0Var.f9228f;
        if (u10 != str.length()) {
            if (str.charAt(u10) == '\"') {
                u10++;
                z10 = true;
            } else {
                z10 = false;
            }
            int r5 = e0Var.r(u10);
            if (r5 < str.length() && r5 != -1) {
                int i3 = r5 + 1;
                int charAt = str.charAt(r5) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        e0Var.f(i3, "rue");
                        z11 = true;
                    } else {
                        e0.n(e0Var, "Expected valid boolean literal prefix, but had '" + e0Var.k() + '\'', 0, 6);
                        throw null;
                    }
                } else {
                    e0Var.f(i3, "alse");
                    z11 = false;
                }
                if (z10) {
                    if (e0Var.f9225b != str.length()) {
                        if (str.charAt(e0Var.f9225b) == '\"') {
                            e0Var.f9225b++;
                        } else {
                            e0.n(e0Var, "Expected closing quotation mark", 0, 6);
                            throw null;
                        }
                    } else {
                        e0.n(e0Var, "EOF", 0, 6);
                        throw null;
                    }
                }
                return Boolean.valueOf(z11);
            }
            e0.n(e0Var, "EOF", 0, 6);
            throw null;
        }
        e0.n(e0Var, "EOF", 0, 6);
        throw null;
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (hVar.f20352a) {
            hVar.j(String.valueOf(booleanValue));
        } else {
            ((jc.a) ((ba.i) hVar.f20353b).f3187c).c(String.valueOf(booleanValue));
        }
    }

    @Override
    public final je.d d() {
        return f18180b;
    }
}
