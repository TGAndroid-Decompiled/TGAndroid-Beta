package k2;

import android.os.Bundle;
import b2.g1;
import m4.h1;
import m4.n1;
import m4.p1;
import m4.t1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import v7.p8;
public final class k0 implements e2.o, u1, d9.k, i5.g, m4.e0, h1, e2.j {
    public final int f10693a;

    public k0(int i10) {
        this.f10693a = i10;
    }

    @Override
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.f10693a) {
            case 17:
                n1Var.B0();
                return;
            case 18:
                n1Var.e();
                return;
            case 19:
                n1Var.e0();
                return;
            case 20:
            case 25:
            default:
                n1Var.K();
                return;
            case 21:
                n1Var.C0();
                return;
            case 22:
                n1Var.J0();
                return;
            case 23:
                n1Var.T();
                return;
            case 24:
                n1Var.E();
                return;
            case 26:
                n1Var.I0();
                return;
            case 27:
                n1Var.H0();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).f50314a));
    }

    @Override
    public void e(m4.v vVar, int i10) {
        switch (this.f10693a) {
            case 12:
                vVar.getClass();
                return;
            case 13:
                vVar.b(i10);
                return;
            default:
                vVar.getClass();
                return;
        }
    }

    @Override
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.f10693a) {
            case 15:
                f0Var.getClass();
                throw new ClassCastException();
            case 16:
                f0Var.getClass();
                throw new ClassCastException();
            case 20:
                return f0Var.n(wVar);
            case 25:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                oa.d dVar = f0Var.e;
                f0Var.s(wVar);
                dVar.getClass();
                return p8.b(new t1(-6));
        }
    }

    @Override
    public void h(x1 x1Var, int i10) {
        switch (this.f10693a) {
            case 2:
                x1Var.dismiss();
                return;
            default:
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        z zVar = ((r0) obj).f10757a.f10796n;
        if (zVar != null) {
            zVar.H();
        }
    }

    public k0(Object obj, int i10) {
        this.f10693a = i10;
    }

    public k0(String str, int i10, int i11, m4.r rVar) {
        this.f10693a = 16;
    }

    public k0(String str, g1 g1Var) {
        this.f10693a = 28;
    }

    public k0(boolean z10, p1 p1Var, Bundle bundle) {
        this.f10693a = 20;
    }

    @Override
    public void c(Exception exc) {
    }
}
