package defpackage;
public final class hm0 implements hx5 {
    public static final hm0 a = new Object();
    public static final om8 b = new om8("kotlin.Boolean", nm8.b);

    @Override
    public final void b(d30 d30Var, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (d30Var.a) {
            d30Var.k(String.valueOf(booleanValue));
        } else {
            ((wj1) ((n31) d30Var.b).c).c(String.valueOf(booleanValue));
        }
    }

    @Override
    public final Object c(ykf ykfVar) {
        boolean z;
        boolean z2;
        d2c d2cVar = (d2c) ykfVar.d;
        int t = d2cVar.t();
        String str = (String) d2cVar.f;
        if (t != str.length()) {
            if (str.charAt(t) == '\"') {
                t++;
                z = true;
            } else {
                z = false;
            }
            int r = d2cVar.r(t);
            if (r < str.length() && r != -1) {
                int i = r + 1;
                int charAt = str.charAt(r) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        d2cVar.f(i, "rue");
                        z2 = true;
                    } else {
                        d2c.m(d2cVar, "Expected valid boolean literal prefix, but had '" + d2cVar.k() + '\'', 0, 6);
                        throw null;
                    }
                } else {
                    d2cVar.f(i, "alse");
                    z2 = false;
                }
                if (z) {
                    if (d2cVar.b != str.length()) {
                        if (str.charAt(d2cVar.b) == '\"') {
                            d2cVar.b++;
                        } else {
                            d2c.m(d2cVar, "Expected closing quotation mark", 0, 6);
                            throw null;
                        }
                    } else {
                        d2c.m(d2cVar, "EOF", 0, 6);
                        throw null;
                    }
                }
                return Boolean.valueOf(z2);
            }
            d2c.m(d2cVar, "EOF", 0, 6);
            throw null;
        }
        d2c.m(d2cVar, "EOF", 0, 6);
        throw null;
    }

    @Override
    public final o8a d() {
        return b;
    }
}
