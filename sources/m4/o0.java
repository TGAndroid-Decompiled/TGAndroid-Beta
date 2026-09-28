package m4;

import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import u2.o1;
import v7.m8;
public final class o0 implements e2.h, z0, y0, n2.m, d9.e, g2.g, z1 {
    public final int f14907a;

    public o0(int i10) {
        this.f14907a = i10;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        switch (this.f14907a) {
            case 8:
                e1Var.v0(list);
                return;
            default:
                e1Var.v0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f14907a) {
            case 0:
                ((e1) obj).G0();
                return;
            case 1:
            case 4:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 16:
            default:
                ((n2.k) obj).a();
                return;
            case 2:
                ((e1) obj).V();
                return;
            case 3:
                ((e1) obj).F();
                return;
            case 5:
                ((e1) obj).F0();
                return;
            case 6:
                ((e1) obj).E0();
                return;
            case 9:
                ((e1) obj).L();
                return;
            case 12:
                ((e1) obj).stop();
                return;
            case 14:
                ((e1) obj).b();
                return;
            case 15:
                ((e1) obj).H();
                return;
            case 17:
                ((e1) obj).v();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.f43751b, new o1(0)));
    }

    @Override
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override
    public void f(a2 a2Var, int i10) {
        a2Var.dismiss();
    }

    @Override
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f14907a) {
            case 1:
                return a0Var.n(rVar);
            case 4:
                a0Var.getClass();
                throw new ClassCastException();
            case 7:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return m8.b(new k1(-6));
            case 11:
                a0Var.getClass();
                throw new ClassCastException();
            case 13:
                a0Var.getClass();
                throw new ClassCastException();
            case 16:
                a0Var.getClass();
                throw new ClassCastException();
            case 18:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = a0Var.e;
                a0Var.s(rVar);
                dVar2.getClass();
                return m8.b(new k1(-6));
        }
    }

    public o0(int i10, Object obj, Object obj2) {
        this.f14907a = i10;
    }

    public o0(Object obj, int i10) {
        this.f14907a = i10;
    }

    public o0(String str, int i10, int i11, n nVar) {
        this.f14907a = 11;
    }

    @Override
    public void release() {
    }
}
