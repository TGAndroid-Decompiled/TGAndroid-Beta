package defpackage;
public abstract class ord {
    public static final Object a(rd3[] rd3VarArr, yfb yfbVar) {
        if (rd3VarArr.length == 0) {
            return x24.a;
        }
        yc0 yc0Var = new yc0(rd3VarArr);
        va1 va1Var = new va1(1, xpe.a(yfbVar));
        va1Var.s();
        int length = rd3VarArr.length;
        wc0[] wc0VarArr = new wc0[length];
        for (int i = 0; i < length; i++) {
            rd3 rd3Var = rd3VarArr[i];
            rd3Var.start();
            wc0 wc0Var = new wc0(yc0Var, va1Var);
            wc0Var.f = gqe.c(rd3Var, true, wc0Var);
            wc0VarArr[i] = wc0Var;
        }
        xc0 xc0Var = new xc0(wc0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            wc0 wc0Var2 = wc0VarArr[i2];
            wc0Var2.getClass();
            fx.a.putObjectVolatile(wc0Var2, wc0.n, xc0Var);
        }
        if (!(va1Var.r() instanceof sm7)) {
            xc0Var.b();
        } else {
            va1Var.v(xc0Var);
        }
        return va1Var.q();
    }

    public static final java.lang.Object b(java.util.Collection r4, defpackage.ax2 r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ord.b(java.util.Collection, ax2):java.lang.Object");
    }

    public static final java.lang.Object c(defpackage.ev5[] r6, defpackage.ax2 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ord.c(ev5[], ax2):java.lang.Object");
    }
}
