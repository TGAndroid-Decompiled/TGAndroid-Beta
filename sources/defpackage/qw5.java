package defpackage;
public final class qw5 {
    public static final qw5 d = new qw5();
    public final pm3 a = new pm3((byte) 13);
    public final sjf b = khd.a;
    public final zm9 c = new zm9((byte) 27);

    public final Object a(hx5 hx5Var, String str) {
        byte b;
        hx5Var.getClass();
        d2c d2cVar = new d2c(str);
        Object l = new ykf(this, k3d.c, d2cVar, hx5Var.d()).l(hx5Var);
        String str2 = (String) d2cVar.f;
        int i = d2cVar.b;
        while (i != -1 && i < str2.length()) {
            int i2 = i + 1;
            char charAt = str2.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                d2cVar.b = i2;
                b = lpd.a(charAt);
                break;
            }
            i = i2;
        }
        d2cVar.b = str2.length();
        b = 10;
        if (b == 10) {
            return l;
        }
        d2c.m(d2cVar, "Expected EOF after parsing, but had " + str.charAt(d2cVar.b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(hx5 hx5Var, Object obj) {
        char[] cArr;
        Object removeLast;
        hx5Var.getClass();
        wj1 wj1Var = new wj1((byte) 1);
        vj1 vj1Var = vj1.c;
        synchronized (vj1Var) {
            ls lsVar = vj1Var.a;
            cArr = null;
            if (lsVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = lsVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                vj1Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        wj1Var.b = cArr;
        try {
            new d30(new n31(wj1Var, (byte) 3), this, k3d.c, new d30[k3d.n.h()]).j(hx5Var, obj);
            return wj1Var.toString();
        } finally {
            wj1Var.b();
        }
    }
}
