package a3;

import android.content.Context;
import b2.v0;
import i2.q1;
import i2.s0;
public final class q implements s0 {
    public boolean f180a;
    public boolean f181b;
    public final Object f182c;
    public final Object d;
    public Object e;
    public Object f183f;

    public q(i2.o0 o0Var, e2.x xVar) {
        this.d = o0Var;
        this.f182c = new q1(xVar);
        this.f180a = true;
    }

    @Override
    public long a() {
        if (this.f180a) {
            return ((q1) this.f182c).a();
        }
        s0 s0Var = (s0) this.f183f;
        s0Var.getClass();
        return s0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f180a) {
            ((q1) this.f182c).getClass();
            return false;
        }
        s0 s0Var = (s0) this.f183f;
        s0Var.getClass();
        return s0Var.b();
    }

    public void c(i2.f fVar) {
        s0 s0Var;
        s0 i10 = fVar.i();
        if (i10 != null && i10 != (s0Var = (s0) this.f183f)) {
            if (s0Var == null) {
                this.f183f = i10;
                this.e = fVar;
                i10.f((v0) ((q1) this.f182c).e);
                return;
            }
            throw new i2.n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public void f(v0 v0Var) {
        s0 s0Var = (s0) this.f183f;
        if (s0Var != null) {
            s0Var.f(v0Var);
            v0Var = ((s0) this.f183f).h();
        }
        ((q1) this.f182c).f(v0Var);
    }

    @Override
    public v0 h() {
        s0 s0Var = (s0) this.f183f;
        if (s0Var != null) {
            return s0Var.h();
        }
        return (v0) ((q1) this.f182c).e;
    }

    public q(Context context, a0 a0Var) {
        this.f182c = context.getApplicationContext();
        this.d = a0Var;
        this.f183f = e2.x.f7939a;
    }
}
