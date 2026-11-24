package defpackage;
public final class lu5 {
    public static final lu5 d = new lu5();
    public final xl3 a = new xl3((byte) 13);
    public final cff b = rcd.a;
    public final i4d c = new i4d((byte) 27);

    public final Object a(cv5 cv5Var, String str) {
        byte b;
        cv5Var.getClass();
        cyb cybVar = new cyb(str);
        Object l = new igf(this, uyc.c, cybVar, cv5Var.d()).l(cv5Var);
        String str2 = (String) cybVar.f;
        int i = cybVar.b;
        while (i != -1 && i < str2.length()) {
            int i2 = i + 1;
            char charAt = str2.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                cybVar.b = i2;
                b = ukd.a(charAt);
                break;
            }
            i = i2;
        }
        cybVar.b = str2.length();
        b = 10;
        if (b == 10) {
            return l;
        }
        cyb.m(cybVar, "Expected EOF after parsing, but had " + str.charAt(cybVar.b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(cv5 cv5Var, Object obj) {
        char[] cArr;
        Object removeLast;
        cv5Var.getClass();
        nj1 nj1Var = new nj1((byte) 1);
        mj1 mj1Var = mj1.c;
        synchronized (mj1Var) {
            ks ksVar = mj1Var.a;
            cArr = null;
            if (ksVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = ksVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                mj1Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        nj1Var.b = cArr;
        try {
            new c30(new e31(nj1Var, (byte) 3), this, uyc.c, new c30[uyc.n.h()]).j(cv5Var, obj);
            return nj1Var.toString();
        } finally {
            nj1Var.b();
        }
    }
}
