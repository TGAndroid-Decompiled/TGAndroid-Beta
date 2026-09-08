package a3;

import android.content.Context;
import b2.v0;
import i2.q1;
import i2.s0;
public final class q implements s0 {
    public boolean f193a;
    public boolean f194b;
    public final Object f195c;
    public final Object d;
    public Object f196e;
    public Object f197f;

    public q(i2.o0 o0Var, e2.x xVar) {
        this.d = o0Var;
        this.f195c = new q1(xVar);
        this.f193a = true;
    }

    @Override
    public long a() {
        if (this.f193a) {
            return ((q1) this.f195c).a();
        }
        s0 s0Var = (s0) this.f197f;
        s0Var.getClass();
        return s0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f193a) {
            ((q1) this.f195c).getClass();
            return false;
        }
        s0 s0Var = (s0) this.f197f;
        s0Var.getClass();
        return s0Var.b();
    }

    public void c(i2.f fVar) {
        s0 s0Var;
        s0 i10 = fVar.i();
        if (i10 != null && i10 != (s0Var = (s0) this.f197f)) {
            if (s0Var == null) {
                this.f197f = i10;
                this.f196e = fVar;
                i10.f((v0) ((q1) this.f195c).f11751e);
                return;
            }
            throw new i2.o(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public void f(v0 v0Var) {
        s0 s0Var = (s0) this.f197f;
        if (s0Var != null) {
            s0Var.f(v0Var);
            v0Var = ((s0) this.f197f).h();
        }
        ((q1) this.f195c).f(v0Var);
    }

    @Override
    public v0 h() {
        s0 s0Var = (s0) this.f197f;
        if (s0Var != null) {
            return s0Var.h();
        }
        return (v0) ((q1) this.f195c).f11751e;
    }

    public q(Context context, a0 a0Var) {
        this.f195c = context.getApplicationContext();
        this.d = a0Var;
        this.f197f = e2.x.f8823a;
    }
}
