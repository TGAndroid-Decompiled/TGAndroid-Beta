package m4;

import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import v7.l8;
public final class o0 implements e2.h, z0, y0, n2.m, d9.e, g2.g {
    public final int f16266a;

    public o0(int i10) {
        this.f16266a = i10;
    }

    @Override
    public void a(e1 e1Var, r rVar, List list) {
        switch (this.f16266a) {
            case 9:
                e1Var.v0(list);
                return;
            default:
                e1Var.v0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f16266a) {
            case 0:
                ((e1) obj).z0();
                return;
            case 1:
                ((e1) obj).G0();
                return;
            case 2:
            case 5:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 17:
            default:
                ((n2.k) obj).a();
                return;
            case 3:
                ((e1) obj).V();
                return;
            case 4:
                ((e1) obj).F();
                return;
            case 6:
                ((e1) obj).F0();
                return;
            case 7:
                ((e1) obj).E0();
                return;
            case 10:
                ((e1) obj).L();
                return;
            case 13:
                ((e1) obj).stop();
                return;
            case 15:
                ((e1) obj).b();
                return;
            case 16:
                ((e1) obj).H();
                return;
            case 18:
                ((e1) obj).v();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.f47371b, new u2.l0(2)));
    }

    @Override
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f16266a) {
            case 2:
                return a0Var.n(rVar);
            case 5:
                a0Var.getClass();
                throw new ClassCastException();
            case 8:
                na.d dVar = a0Var.f16038e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new k1(-6));
            case 12:
                a0Var.getClass();
                throw new ClassCastException();
            case 14:
                a0Var.getClass();
                throw new ClassCastException();
            case 17:
                a0Var.getClass();
                throw new ClassCastException();
            case 19:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = a0Var.f16038e;
                a0Var.s(rVar);
                dVar2.getClass();
                return l8.b(new k1(-6));
        }
    }

    public o0(int i10, Object obj, Object obj2) {
        this.f16266a = i10;
    }

    public o0(Object obj, int i10) {
        this.f16266a = i10;
    }

    public o0(String str, int i10, int i11, n nVar) {
        this.f16266a = 12;
    }

    @Override
    public void release() {
    }
}
