package defpackage;
public final class oo9 extends gw2 implements ik4 {
    public final ik4 a;
    public final sw2 b;
    public final int c;
    public sw2 d;
    public fw2 e;

    public oo9(ik4 ik4Var, sw2 sw2Var) {
        super(ep2.c, z14.a);
        this.a = ik4Var;
        this.b = sw2Var;
        this.c = ((Number) sw2Var.fold(0, new dm2((byte) 5))).intValue();
    }

    @Override
    public final Object c(Object obj, fw2 fw2Var) {
        try {
            Object d = d(fw2Var, obj);
            if (d == bx2.a) {
                return d;
            }
            return g5c.a;
        } catch (Throwable th) {
            this.d = new dq3(fw2Var.getContext(), th);
            throw th;
        }
    }

    public final java.lang.Object d(defpackage.fw2 r14, java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo9.d(fw2, java.lang.Object):java.lang.Object");
    }

    @Override
    public final cx2 getCallerFrame() {
        fw2 fw2Var = this.e;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }

    @Override
    public final sw2 getContext() {
        sw2 sw2Var = this.d;
        if (sw2Var == null) {
            return z14.a;
        }
        return sw2Var;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a = ta9.a(obj);
        if (a != null) {
            this.d = new dq3(getContext(), a);
        }
        fw2 fw2Var = this.e;
        if (fw2Var != null) {
            fw2Var.resumeWith(obj);
        }
        return bx2.a;
    }
}
