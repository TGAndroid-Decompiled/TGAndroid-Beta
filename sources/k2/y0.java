package k2;

import android.os.Bundle;
import java.util.List;
import m4.g1;
import m4.h1;
import m4.n1;
import m4.p1;
import m4.t1;
import v7.q8;
public final class y0 implements d9.k, i5.g, m4.e0, h1, e2.j, g1 {
    public final int f14059a;

    public y0(int i10) {
        this.f14059a = i10;
    }

    @Override
    public void a(n1 n1Var, m4.w wVar, List list) {
        switch (this.f14059a) {
            case 27:
                n1Var.x0(list);
                return;
            default:
                n1Var.x0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.f14059a) {
            case 14:
                n1Var.B0();
                return;
            case 15:
                n1Var.e();
                return;
            case 16:
                n1Var.f0();
                return;
            case 17:
            case 22:
            default:
                n1Var.K();
                return;
            case 18:
                n1Var.C0();
                return;
            case 19:
                n1Var.J0();
                return;
            case 20:
                n1Var.V();
                return;
            case 21:
                n1Var.E();
                return;
            case 23:
                n1Var.I0();
                return;
            case 24:
                n1Var.H0();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).f46507a));
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.f14059a) {
            case 12:
                f0Var.getClass();
                throw new ClassCastException();
            case 13:
                f0Var.getClass();
                throw new ClassCastException();
            case 17:
                return f0Var.n(wVar);
            case 22:
                f0Var.getClass();
                throw new ClassCastException();
            case 25:
                pb.a aVar = f0Var.e;
                f0Var.s(wVar);
                aVar.getClass();
                return q8.b(new t1(-6));
            default:
                f0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void d(m4.v vVar, int i10) {
        switch (this.f14059a) {
            case 9:
                vVar.getClass();
                return;
            case 10:
                vVar.b(i10);
                return;
            default:
                vVar.getClass();
                return;
        }
    }

    public y0(Object obj, int i10) {
        this.f14059a = i10;
    }

    public y0(String str, int i10, int i11, m4.r rVar, int i12) {
        this.f14059a = i12;
    }

    public y0(String str, b2.h1 h1Var) {
        this.f14059a = 25;
    }

    public y0(boolean z10, p1 p1Var, Bundle bundle) {
        this.f14059a = 17;
    }

    @Override
    public void b(Exception exc) {
    }
}
