package defpackage;
public final class hn0 implements cx5 {
    public static final hn0 a = new Object();
    public static final el8 b = new el8("kotlin.Boolean", dl8.b);

    @Override
    public final void b(c40 c40Var, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (c40Var.a) {
            c40Var.k(String.valueOf(booleanValue));
        } else {
            ((vk1) ((m41) c40Var.b).c).c(String.valueOf(booleanValue));
        }
    }

    @Override
    public final Object c(jif jifVar) {
        boolean z;
        boolean z2;
        e0c e0cVar = (e0c) jifVar.d;
        int t = e0cVar.t();
        String str = (String) e0cVar.f;
        if (t != str.length()) {
            if (str.charAt(t) == '\"') {
                t++;
                z = true;
            } else {
                z = false;
            }
            int r = e0cVar.r(t);
            if (r < str.length() && r != -1) {
                int i = r + 1;
                int charAt = str.charAt(r) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        e0cVar.f(i, "rue");
                        z2 = true;
                    } else {
                        e0c.m(e0cVar, "Expected valid boolean literal prefix, but had '" + e0cVar.k() + '\'', 0, 6);
                        throw null;
                    }
                } else {
                    e0cVar.f(i, "alse");
                    z2 = false;
                }
                if (z) {
                    if (e0cVar.b != str.length()) {
                        if (str.charAt(e0cVar.b) == '\"') {
                            e0cVar.b++;
                        } else {
                            e0c.m(e0cVar, "Expected closing quotation mark", 0, 6);
                            throw null;
                        }
                    } else {
                        e0c.m(e0cVar, "EOF", 0, 6);
                        throw null;
                    }
                }
                return Boolean.valueOf(z2);
            }
            e0c.m(e0cVar, "EOF", 0, 6);
            throw null;
        }
        e0c.m(e0cVar, "EOF", 0, 6);
        throw null;
    }

    @Override
    public final y6a d() {
        return b;
    }
}
