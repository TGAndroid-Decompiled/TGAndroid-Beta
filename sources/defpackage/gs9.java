package defpackage;
public final class gs9 extends ax2 implements nm4 {
    public final nm4 a;
    public final mx2 b;
    public final int c;
    public mx2 d;
    public zw2 e;

    public gs9(nm4 nm4Var, mx2 mx2Var) {
        super(xp2.c, u24.a);
        this.a = nm4Var;
        this.b = mx2Var;
        this.c = ((Number) mx2Var.fold(0, new xm2((byte) 5))).intValue();
    }

    @Override
    public final Object c(Object obj, zw2 zw2Var) {
        try {
            Object d = d(zw2Var, obj);
            if (d == vx2.a) {
                return d;
            }
            return g9c.a;
        } catch (Throwable th) {
            this.d = new uq3(zw2Var.getContext(), th);
            throw th;
        }
    }

    public final java.lang.Object d(defpackage.zw2 r14, java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs9.d(zw2, java.lang.Object):java.lang.Object");
    }

    @Override
    public final wx2 getCallerFrame() {
        zw2 zw2Var = this.e;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }

    @Override
    public final mx2 getContext() {
        mx2 mx2Var = this.d;
        if (mx2Var == null) {
            return u24.a;
        }
        return mx2Var;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a = he9.a(obj);
        if (a != null) {
            this.d = new uq3(getContext(), a);
        }
        zw2 zw2Var = this.e;
        if (zw2Var != null) {
            zw2Var.resumeWith(obj);
        }
        return vx2.a;
    }
}
