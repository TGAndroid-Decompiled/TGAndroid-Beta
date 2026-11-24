package defpackage;
public final class pq9 extends qx2 implements jm4 {
    public final jm4 a;
    public final cy2 b;
    public final int c;
    public cy2 d;
    public px2 e;

    public pq9(jm4 jm4Var, cy2 cy2Var) {
        super(pq2.c, k34.a);
        this.a = jm4Var;
        this.b = cy2Var;
        this.c = ((Number) cy2Var.fold(0, new qn2((byte) 5))).intValue();
    }

    @Override
    public final Object c(Object obj, px2 px2Var) {
        try {
            Object d = d(px2Var, obj);
            if (d == ly2.a) {
                return d;
            }
            return g7c.a;
        } catch (Throwable th) {
            this.d = new nr3(px2Var.getContext(), th);
            throw th;
        }
    }

    public final java.lang.Object d(defpackage.px2 r14, java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq9.d(px2, java.lang.Object):java.lang.Object");
    }

    @Override
    public final my2 getCallerFrame() {
        px2 px2Var = this.e;
        if (px2Var instanceof my2) {
            return (my2) px2Var;
        }
        return null;
    }

    @Override
    public final cy2 getContext() {
        cy2 cy2Var = this.d;
        if (cy2Var == null) {
            return k34.a;
        }
        return cy2Var;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a = tc9.a(obj);
        if (a != null) {
            this.d = new nr3(getContext(), a);
        }
        px2 px2Var = this.e;
        if (px2Var != null) {
            px2Var.resumeWith(obj);
        }
        return ly2.a;
    }
}
