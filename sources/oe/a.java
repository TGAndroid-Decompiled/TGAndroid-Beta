package oe;
public final class a implements ke.a {
    public static final a f21424a = new Object();
    public static final n f21425b = new n("kotlin.Boolean", me.b.f20604b);

    @Override
    public final void a(qe.h hVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (hVar.f55543a) {
            hVar.j(String.valueOf(booleanValue));
        } else {
            ((mc.a) ((ca.i) hVar.f55544b).f4841c).c(String.valueOf(booleanValue));
        }
    }

    @Override
    public final Object b(h2.c decoder) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.j.e(decoder, "decoder");
        a4.k kVar = (a4.k) decoder.d;
        int t6 = kVar.t();
        String str = (String) kVar.f194f;
        if (t6 != str.length()) {
            if (str.charAt(t6) == '\"') {
                t6++;
                z10 = true;
            } else {
                z10 = false;
            }
            int q10 = kVar.q(t6);
            if (q10 < str.length() && q10 != -1) {
                int i7 = q10 + 1;
                int charAt = str.charAt(q10) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        kVar.f(i7, "rue");
                        z11 = true;
                    } else {
                        a4.k.n(kVar, "Expected valid boolean literal prefix, but had '" + kVar.k() + '\'', 0, 6);
                        throw null;
                    }
                } else {
                    kVar.f(i7, "alse");
                    z11 = false;
                }
                if (z10) {
                    if (kVar.f191b != str.length()) {
                        if (str.charAt(kVar.f191b) == '\"') {
                            kVar.f191b++;
                        } else {
                            a4.k.n(kVar, "Expected closing quotation mark", 0, 6);
                            throw null;
                        }
                    } else {
                        a4.k.n(kVar, "EOF", 0, 6);
                        throw null;
                    }
                }
                return Boolean.valueOf(z11);
            }
            a4.k.n(kVar, "EOF", 0, 6);
            throw null;
        }
        a4.k.n(kVar, "EOF", 0, 6);
        throw null;
    }

    @Override
    public final me.d d() {
        return f21425b;
    }
}
