package j2;

import b2.k0;
import e2.m;
import e9.i0;
import m4.a0;
import m4.a1;
import m4.b0;
import m4.f1;
import m4.n;
import m4.q;
import m4.r;
public final class e implements m, d9.e, i5.g, a0, a1, e2.h {
    public final int f13689a;

    public e(int i10) {
        this.f13689a = i10;
    }

    @Override
    public void accept(Object obj) {
        f1 f1Var = (f1) obj;
        switch (this.f13689a) {
            case 22:
                f1Var.e();
                return;
            case 23:
                f1Var.e0();
                return;
            case 24:
                f1Var.z0();
                return;
            case 25:
                f1Var.G0();
                return;
            case 26:
            default:
                f1Var.F();
                return;
            case 27:
                f1Var.V();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).f49059a));
    }

    @Override
    public void d(q qVar, int i10) {
        switch (this.f13689a) {
            case 17:
                qVar.getClass();
                return;
            case 18:
                qVar.b(i10);
                return;
            default:
                qVar.getClass();
                return;
        }
    }

    @Override
    public Object h(b0 b0Var, r rVar, int i10) {
        switch (this.f13689a) {
            case 20:
                b0Var.getClass();
                throw new ClassCastException();
            case 21:
                b0Var.getClass();
                throw new ClassCastException();
            case 26:
                return b0Var.n(rVar);
            default:
                b0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f13689a) {
            case 0:
                bVar.getClass();
                return;
            case 1:
                bVar.getClass();
                return;
            case 2:
                bVar.getClass();
                return;
            case 3:
                bVar.getClass();
                return;
            case 4:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public e(int i10, Object obj, Object obj2) {
        this.f13689a = i10;
    }

    public e(a aVar, float f7) {
        this.f13689a = 5;
    }

    public e(a aVar, int i10) {
        this.f13689a = 3;
    }

    public e(a aVar, k0 k0Var, int i10) {
        this.f13689a = 4;
    }

    public e(a aVar, boolean z10) {
        this.f13689a = 1;
    }

    public e(Object obj, int i10) {
        this.f13689a = i10;
    }

    public e(String str, int i10, int i11, n nVar) {
        this.f13689a = 21;
    }

    @Override
    public void a(Exception exc) {
    }
}
