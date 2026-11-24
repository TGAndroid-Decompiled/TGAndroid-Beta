package defpackage;
public final class lw5 {
    public static final lw5 d = new lw5();
    public final in3 a = new in3((byte) 13);
    public final dhf b = ted.a;
    public final nl9 c = new nl9((byte) 27);

    public final Object a(cx5 cx5Var, String str) {
        byte b;
        cx5Var.getClass();
        e0c e0cVar = new e0c(str);
        Object l = new jif(this, v0d.c, e0cVar, cx5Var.d()).l(cx5Var);
        String str2 = (String) e0cVar.f;
        int i = e0cVar.b;
        while (i != -1 && i < str2.length()) {
            int i2 = i + 1;
            char charAt = str2.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                e0cVar.b = i2;
                b = wmd.a(charAt);
                break;
            }
            i = i2;
        }
        e0cVar.b = str2.length();
        b = 10;
        if (b == 10) {
            return l;
        }
        e0c.m(e0cVar, "Expected EOF after parsing, but had " + str.charAt(e0cVar.b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(cx5 cx5Var, Object obj) {
        char[] cArr;
        Object removeLast;
        cx5Var.getClass();
        vk1 vk1Var = new vk1((byte) 1);
        uk1 uk1Var = uk1.c;
        synchronized (uk1Var) {
            lt ltVar = uk1Var.a;
            cArr = null;
            if (ltVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = ltVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                uk1Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        vk1Var.b = cArr;
        try {
            new c40(new m41(vk1Var, (byte) 3), this, v0d.c, new c40[v0d.n.h()]).j(cx5Var, obj);
            return vk1Var.toString();
        } finally {
            vk1Var.b();
        }
    }
}
