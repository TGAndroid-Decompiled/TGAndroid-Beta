package a3;

import android.content.Context;
import b2.v0;
import i2.o0;
import i2.q1;
import i2.s0;
public final class p implements s0 {
    public boolean f169a;
    public boolean f170b;
    public final Object f171c;
    public final Object d;
    public Object f172e;
    public Object f173f;

    public p(o0 o0Var, e2.x xVar) {
        this.d = o0Var;
        this.f171c = new q1(xVar);
        this.f169a = true;
    }

    @Override
    public long a() {
        if (this.f169a) {
            return ((q1) this.f171c).a();
        }
        s0 s0Var = (s0) this.f173f;
        s0Var.getClass();
        return s0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f169a) {
            ((q1) this.f171c).getClass();
            return false;
        }
        s0 s0Var = (s0) this.f173f;
        s0Var.getClass();
        return s0Var.b();
    }

    public void c(i2.f fVar) {
        s0 s0Var;
        s0 i10 = fVar.i();
        if (i10 != null && i10 != (s0Var = (s0) this.f173f)) {
            if (s0Var == null) {
                this.f173f = i10;
                this.f172e = fVar;
                i10.f((v0) ((q1) this.f171c).f11725e);
                return;
            }
            throw new i2.o(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public void f(v0 v0Var) {
        s0 s0Var = (s0) this.f173f;
        if (s0Var != null) {
            s0Var.f(v0Var);
            v0Var = ((s0) this.f173f).h();
        }
        ((q1) this.f171c).f(v0Var);
    }

    @Override
    public v0 h() {
        s0 s0Var = (s0) this.f173f;
        if (s0Var != null) {
            return s0Var.h();
        }
        return (v0) ((q1) this.f171c).f11725e;
    }

    public p(Context context, z zVar) {
        this.f171c = context.getApplicationContext();
        this.d = zVar;
        this.f173f = e2.x.f8795a;
    }
}
