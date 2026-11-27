package defpackage;
public final class yo3 extends ap3 implements wx2, zw2 {
    public static final long n = fx.a.objectFieldOffset(yo3.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile Object _reusableCancellableContinuation$volatile;
    public final px2 d;
    public final ax2 e;
    public Object f;
    public final Object h;

    public yo3(px2 px2Var, ax2 ax2Var) {
        super(-1);
        this.d = px2Var;
        this.e = ax2Var;
        this.f = q7c.a;
        this.h = xhd.b(ax2Var.getContext());
    }

    @Override
    public final wx2 getCallerFrame() {
        return this.e;
    }

    @Override
    public final mx2 getContext() {
        return this.e.getContext();
    }

    @Override
    public final Object i() {
        Object obj = this.f;
        this.f = q7c.a;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object yp2Var;
        Throwable a = he9.a(obj);
        if (a == null) {
            yp2Var = obj;
        } else {
            yp2Var = new yp2(a, false);
        }
        ax2 ax2Var = this.e;
        mx2 context = ax2Var.getContext();
        px2 px2Var = this.d;
        if (px2Var.d(context)) {
            this.f = yp2Var;
            this.c = 0;
            px2Var.c(ax2Var.getContext(), this);
            return;
        }
        z44 a2 = crb.a();
        if (a2.c >= 4294967296L) {
            this.f = yp2Var;
            this.c = 0;
            ls lsVar = a2.e;
            if (lsVar == null) {
                lsVar = new ls();
                a2.e = lsVar;
            }
            lsVar.addLast(this);
            return;
        }
        a2.g(true);
        try {
            mx2 context2 = ax2Var.getContext();
            Object c = xhd.c(context2, this.h);
            ax2Var.resumeWith(obj);
            xhd.a(context2, c);
            do {
            } while (a2.i());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + l93.d(this.e) + ']';
    }

    @Override
    public final zw2 d() {
        return this;
    }
}
