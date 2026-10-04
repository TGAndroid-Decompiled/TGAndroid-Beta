package a3;

import android.content.Context;
import b2.v0;
import i2.p0;
import i2.r1;
import i2.t0;
public final class q implements t0 {
    public boolean f195a;
    public boolean f196b;
    public final Object f197c;
    public final Object d;
    public Object f198e;
    public Object f199f;

    public q(p0 p0Var, e2.x xVar) {
        this.d = p0Var;
        this.f197c = new r1(xVar);
        this.f195a = true;
    }

    @Override
    public long a() {
        if (this.f195a) {
            return ((r1) this.f197c).a();
        }
        t0 t0Var = (t0) this.f199f;
        t0Var.getClass();
        return t0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f195a) {
            ((r1) this.f197c).getClass();
            return false;
        }
        t0 t0Var = (t0) this.f199f;
        t0Var.getClass();
        return t0Var.b();
    }

    public void c(i2.f fVar) {
        t0 t0Var;
        t0 i10 = fVar.i();
        if (i10 != null && i10 != (t0Var = (t0) this.f199f)) {
            if (t0Var == null) {
                this.f199f = i10;
                this.f198e = fVar;
                i10.f((v0) ((r1) this.f197c).f11831e);
                return;
            }
            throw new i2.n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public void f(v0 v0Var) {
        t0 t0Var = (t0) this.f199f;
        if (t0Var != null) {
            t0Var.f(v0Var);
            v0Var = ((t0) this.f199f).h();
        }
        ((r1) this.f197c).f(v0Var);
    }

    @Override
    public v0 h() {
        t0 t0Var = (t0) this.f199f;
        if (t0Var != null) {
            return t0Var.h();
        }
        return (v0) ((r1) this.f197c).f11831e;
    }

    public q(Context context, a0 a0Var) {
        this.f197c = context.getApplicationContext();
        this.d = a0Var;
        this.f199f = e2.x.f8595a;
    }
}
