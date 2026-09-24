package a3;

import android.content.Context;
import b2.v0;
import i2.p0;
import i2.r1;
import i2.t0;
public final class q implements t0 {
    public boolean f180a;
    public boolean f181b;
    public final Object f182c;
    public final Object d;
    public Object e;
    public Object f183f;

    public q(p0 p0Var, e2.x xVar) {
        this.d = p0Var;
        this.f182c = new r1(xVar);
        this.f180a = true;
    }

    @Override
    public long a() {
        if (this.f180a) {
            return ((r1) this.f182c).a();
        }
        t0 t0Var = (t0) this.f183f;
        t0Var.getClass();
        return t0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f180a) {
            ((r1) this.f182c).getClass();
            return false;
        }
        t0 t0Var = (t0) this.f183f;
        t0Var.getClass();
        return t0Var.b();
    }

    public void c(i2.f fVar) {
        t0 t0Var;
        t0 i10 = fVar.i();
        if (i10 != null && i10 != (t0Var = (t0) this.f183f)) {
            if (t0Var == null) {
                this.f183f = i10;
                this.e = fVar;
                i10.f((v0) ((r1) this.f182c).e);
                return;
            }
            throw new i2.n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public void f(v0 v0Var) {
        t0 t0Var = (t0) this.f183f;
        if (t0Var != null) {
            t0Var.f(v0Var);
            v0Var = ((t0) this.f183f).h();
        }
        ((r1) this.f182c).f(v0Var);
    }

    @Override
    public v0 h() {
        t0 t0Var = (t0) this.f183f;
        if (t0Var != null) {
            return t0Var.h();
        }
        return (v0) ((r1) this.f182c).e;
    }

    public q(Context context, a0 a0Var) {
        this.f182c = context.getApplicationContext();
        this.d = a0Var;
        this.f183f = e2.x.f7922a;
    }
}
