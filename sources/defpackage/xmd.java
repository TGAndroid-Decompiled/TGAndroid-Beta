package defpackage;
public abstract class xmd {
    public static final Object a(zc3[] zc3VarArr, ccb ccbVar) {
        if (zc3VarArr.length == 0) {
            return c24.a;
        }
        wc0 wc0Var = new wc0(zc3VarArr);
        na1 na1Var = new na1(1, dle.a(ccbVar));
        na1Var.s();
        int length = zc3VarArr.length;
        uc0[] uc0VarArr = new uc0[length];
        for (int i = 0; i < length; i++) {
            zc3 zc3Var = zc3VarArr[i];
            zc3Var.start();
            uc0 uc0Var = new uc0(wc0Var, na1Var);
            uc0Var.f = nle.c(zc3Var, true, uc0Var);
            uc0VarArr[i] = uc0Var;
        }
        vc0 vc0Var = new vc0(uc0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            uc0 uc0Var2 = uc0VarArr[i2];
            uc0Var2.getClass();
            ex.a.putObjectVolatile(uc0Var2, uc0.n, vc0Var);
        }
        if (!(na1Var.r() instanceof tj7)) {
            vc0Var.b();
        } else {
            na1Var.v(vc0Var);
        }
        return na1Var.q();
    }

    public static final java.lang.Object b(java.util.Collection r4, defpackage.gw2 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmd.b(java.util.Collection, gw2):java.lang.Object");
    }

    public static final java.lang.Object c(defpackage.bt5[] r6, defpackage.gw2 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmd.c(bt5[], gw2):java.lang.Object");
    }
}
