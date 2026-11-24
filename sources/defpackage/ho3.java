package defpackage;
public final class ho3 extends jo3 implements cx2, fw2 {
    public static final long n = ex.a.objectFieldOffset(ho3.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile Object _reusableCancellableContinuation$volatile;
    public final vw2 d;
    public final gw2 e;
    public Object f;
    public final Object h;

    public ho3(vw2 vw2Var, gw2 gw2Var) {
        super(-1);
        this.d = vw2Var;
        this.e = gw2Var;
        this.f = r3c.a;
        this.h = edd.b(gw2Var.getContext());
    }

    @Override
    public final cx2 getCallerFrame() {
        return this.e;
    }

    @Override
    public final sw2 getContext() {
        return this.e.getContext();
    }

    @Override
    public final Object i() {
        Object obj = this.f;
        this.f = r3c.a;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object fp2Var;
        Throwable a = ta9.a(obj);
        if (a == null) {
            fp2Var = obj;
        } else {
            fp2Var = new fp2(a, false);
        }
        gw2 gw2Var = this.e;
        sw2 context = gw2Var.getContext();
        vw2 vw2Var = this.d;
        if (vw2Var.d(context)) {
            this.f = fp2Var;
            this.c = 0;
            vw2Var.c(gw2Var.getContext(), this);
            return;
        }
        d44 a2 = dnb.a();
        if (a2.c >= 4294967296L) {
            this.f = fp2Var;
            this.c = 0;
            ks ksVar = a2.e;
            if (ksVar == null) {
                ksVar = new ks();
                a2.e = ksVar;
            }
            ksVar.addLast(this);
            return;
        }
        a2.g(true);
        try {
            sw2 context2 = gw2Var.getContext();
            Object c = edd.c(context2, this.h);
            gw2Var.resumeWith(obj);
            edd.a(context2, c);
            do {
            } while (a2.i());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + s83.d(this.e) + ']';
    }

    @Override
    public final fw2 d() {
        return this;
    }
}
