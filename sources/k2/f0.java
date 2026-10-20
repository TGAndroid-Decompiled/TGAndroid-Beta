package k2;

import android.os.Bundle;
import java.util.List;
import m4.f1;
import m4.g1;
import m4.m1;
import m4.o1;
import m4.s1;
import v7.q8;
public final class f0 implements e2.o, d9.k, i5.g, m4.e0, g1, e2.j, f1 {
    public final int f14682a;

    public f0(int i10) {
        this.f14682a = i10;
    }

    @Override
    public void a(m1 m1Var, m4.v vVar, List list) {
        switch (this.f14682a) {
            case 27:
                m1Var.x0(list);
                return;
            default:
                m1Var.x0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.f14682a) {
            case 14:
                m1Var.B0();
                return;
            case 15:
                m1Var.e();
                return;
            case 16:
                m1Var.f0();
                return;
            case 17:
            case 22:
            default:
                m1Var.K();
                return;
            case 18:
                m1Var.C0();
                return;
            case 19:
                m1Var.J0();
                return;
            case 20:
                m1Var.V();
                return;
            case 21:
                m1Var.E();
                return;
            case 23:
                m1Var.I0();
                return;
            case 24:
                m1Var.H0();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).f47900a));
    }

    @Override
    public void b(m4.u uVar, int i10) {
        switch (this.f14682a) {
            case 9:
                uVar.getClass();
                return;
            case 10:
                uVar.b(i10);
                return;
            default:
                uVar.getClass();
                return;
        }
    }

    @Override
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.f14682a) {
            case 12:
                f0Var.getClass();
                throw new ClassCastException();
            case 13:
                f0Var.getClass();
                throw new ClassCastException();
            case 17:
                return f0Var.n(vVar);
            case 22:
                f0Var.getClass();
                throw new ClassCastException();
            case 25:
                pb.a aVar = f0Var.e;
                f0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
            default:
                f0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f14682a) {
            case 0:
                p0 p0Var = (p0) obj;
                t0 t0Var = p0Var.f14776b;
                if (p0Var.equals(t0Var.f14808j) && t0Var.M) {
                    t0Var.N = true;
                    return;
                }
                return;
            default:
                x xVar = ((o0) obj).f14774a.f14812n;
                if (xVar != null) {
                    xVar.B();
                    return;
                }
                return;
        }
    }

    public f0(Object obj, int i10) {
        this.f14682a = i10;
    }

    public f0(String str, int i10, int i11, m4.q qVar, int i12) {
        this.f14682a = i12;
    }

    public f0(String str, b2.g1 g1Var) {
        this.f14682a = 25;
    }

    public f0(boolean z10, o1 o1Var, Bundle bundle) {
        this.f14682a = 17;
    }

    @Override
    public void c(Exception exc) {
    }
}
