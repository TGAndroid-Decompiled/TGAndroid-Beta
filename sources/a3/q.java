package a3;

import android.content.Context;
import b2.v0;
import i2.p1;
import i2.r0;
public final class q implements r0 {
    public boolean f178a;
    public boolean f179b;
    public final Object f180c;
    public final Object d;
    public Object e;
    public Object f181f;

    public q(i2.n0 n0Var, e2.x xVar) {
        this.d = n0Var;
        this.f180c = new p1(xVar);
        this.f178a = true;
    }

    @Override
    public long a() {
        if (this.f178a) {
            return ((p1) this.f180c).a();
        }
        r0 r0Var = (r0) this.f181f;
        r0Var.getClass();
        return r0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f178a) {
            ((p1) this.f180c).getClass();
            return false;
        }
        r0 r0Var = (r0) this.f181f;
        r0Var.getClass();
        return r0Var.b();
    }

    public void c(i2.f fVar) {
        r0 r0Var;
        r0 i10 = fVar.i();
        if (i10 != null && i10 != (r0Var = (r0) this.f181f)) {
            if (r0Var == null) {
                this.f181f = i10;
                this.e = fVar;
                i10.f((v0) ((p1) this.f180c).e);
                return;
            }
            throw new i2.n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public void f(v0 v0Var) {
        r0 r0Var = (r0) this.f181f;
        if (r0Var != null) {
            r0Var.f(v0Var);
            v0Var = ((r0) this.f181f).h();
        }
        ((p1) this.f180c).f(v0Var);
    }

    @Override
    public v0 h() {
        r0 r0Var = (r0) this.f181f;
        if (r0Var != null) {
            return r0Var.h();
        }
        return (v0) ((p1) this.f180c).e;
    }

    public q(Context context, a0 a0Var) {
        this.f180c = context.getApplicationContext();
        this.d = a0Var;
        this.f181f = e2.x.f7240a;
    }
}
