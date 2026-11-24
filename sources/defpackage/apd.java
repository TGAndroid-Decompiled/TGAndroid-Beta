package defpackage;
public abstract class apd {
    public static final Object a(le3[] le3VarArr, eeb eebVar) {
        if (le3VarArr.length == 0) {
            return n34.a;
        }
        wd0 wd0Var = new wd0(le3VarArr);
        vb1 vb1Var = new vb1(1, fne.a(eebVar));
        vb1Var.s();
        int length = le3VarArr.length;
        ud0[] ud0VarArr = new ud0[length];
        for (int i = 0; i < length; i++) {
            le3 le3Var = le3VarArr[i];
            le3Var.start();
            ud0 ud0Var = new ud0(wd0Var, vb1Var);
            ud0Var.f = pne.c(le3Var, true, ud0Var);
            ud0VarArr[i] = ud0Var;
        }
        vd0 vd0Var = new vd0(ud0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ud0 ud0Var2 = ud0VarArr[i2];
            ud0Var2.getClass();
            fy.a.putObjectVolatile(ud0Var2, ud0.n, vd0Var);
        }
        if (!(vb1Var.r() instanceof wl7)) {
            vd0Var.b();
        } else {
            vb1Var.v(vd0Var);
        }
        return vb1Var.q();
    }

    public static final java.lang.Object b(java.util.Collection r4, defpackage.qx2 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apd.b(java.util.Collection, qx2):java.lang.Object");
    }

    public static final java.lang.Object c(defpackage.av5[] r6, defpackage.qx2 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apd.c(av5[], qx2):java.lang.Object");
    }
}
