package oe;
public final class a implements ke.a {
    public static final a f20898a = new Object();
    public static final n f20899b = new n("kotlin.Boolean", me.b.f20004b);

    @Override
    public final void a(qe.h hVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (hVar.f53979a) {
            hVar.j(String.valueOf(booleanValue));
        } else {
            ((mc.a) ((ca.i) hVar.f53980b).f6016c).c(String.valueOf(booleanValue));
        }
    }

    @Override
    public final Object b(h2.c decoder) {
        boolean z9;
        boolean z10;
        kotlin.jvm.internal.j.e(decoder, "decoder");
        a4.k kVar = (a4.k) decoder.d;
        int u10 = kVar.u();
        String str = (String) kVar.f194f;
        if (u10 != str.length()) {
            if (str.charAt(u10) == '\"') {
                u10++;
                z9 = true;
            } else {
                z9 = false;
            }
            int r10 = kVar.r(u10);
            if (r10 < str.length() && r10 != -1) {
                int i7 = r10 + 1;
                int charAt = str.charAt(r10) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        kVar.f(i7, "rue");
                        z10 = true;
                    } else {
                        a4.k.n(kVar, "Expected valid boolean literal prefix, but had '" + kVar.k() + '\'', 0, 6);
                        throw null;
                    }
                } else {
                    kVar.f(i7, "alse");
                    z10 = false;
                }
                if (z9) {
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
                return Boolean.valueOf(z10);
            }
            a4.k.n(kVar, "EOF", 0, 6);
            throw null;
        }
        a4.k.n(kVar, "EOF", 0, 6);
        throw null;
    }

    @Override
    public final me.d d() {
        return f20899b;
    }
}
