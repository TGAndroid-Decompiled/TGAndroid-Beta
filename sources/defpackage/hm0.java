package defpackage;
public final class hm0 implements cv5 {
    public static final hm0 a = new Object();
    public static final bj8 b = new bj8("kotlin.Boolean", aj8.b);

    @Override
    public final void b(c30 c30Var, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (c30Var.a) {
            c30Var.k(String.valueOf(booleanValue));
        } else {
            ((nj1) ((e31) c30Var.b).c).c(String.valueOf(booleanValue));
        }
    }

    @Override
    public final Object c(igf igfVar) {
        boolean z;
        boolean z2;
        cyb cybVar = (cyb) igfVar.d;
        int t = cybVar.t();
        String str = (String) cybVar.f;
        if (t != str.length()) {
            if (str.charAt(t) == '\"') {
                t++;
                z = true;
            } else {
                z = false;
            }
            int r = cybVar.r(t);
            if (r < str.length() && r != -1) {
                int i = r + 1;
                int charAt = str.charAt(r) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        cybVar.f(i, "rue");
                        z2 = true;
                    } else {
                        cyb.m(cybVar, "Expected valid boolean literal prefix, but had '" + cybVar.k() + '\'', 0, 6);
                        throw null;
                    }
                } else {
                    cybVar.f(i, "alse");
                    z2 = false;
                }
                if (z) {
                    if (cybVar.b != str.length()) {
                        if (str.charAt(cybVar.b) == '\"') {
                            cybVar.b++;
                        } else {
                            cyb.m(cybVar, "Expected closing quotation mark", 0, 6);
                            throw null;
                        }
                    } else {
                        cyb.m(cybVar, "EOF", 0, 6);
                        throw null;
                    }
                }
                return Boolean.valueOf(z2);
            }
            cyb.m(cybVar, "EOF", 0, 6);
            throw null;
        }
        cyb.m(cybVar, "EOF", 0, 6);
        throw null;
    }

    @Override
    public final w4a d() {
        return b;
    }
}
