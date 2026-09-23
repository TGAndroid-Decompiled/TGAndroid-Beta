package m4;

import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.sv0;
import v7.l8;
public final class p0 implements e2.h, a1, z0, n2.l, d9.e, g2.g, a2, sv0 {
    public final int f14661a;

    public p0(int i10) {
        this.f14661a = i10;
    }

    @Override
    public void a(f1 f1Var, r rVar, List list) {
        switch (this.f14661a) {
            case 6:
                f1Var.v0(list);
                return;
            default:
                f1Var.v0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f14661a) {
            case 0:
                ((f1) obj).V();
                return;
            case 1:
                ((f1) obj).F();
                return;
            case 2:
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            case 14:
            default:
                ((n2.j) obj).a();
                return;
            case 3:
                ((f1) obj).F0();
                return;
            case 4:
                ((f1) obj).E0();
                return;
            case 7:
                ((f1) obj).L();
                return;
            case 10:
                ((f1) obj).stop();
                return;
            case 12:
                ((f1) obj).b();
                return;
            case 13:
                ((f1) obj).H();
                return;
            case 15:
                ((f1) obj).v();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.f43381b, new s0.b(24)));
    }

    @Override
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        b2Var.dismiss();
    }

    @Override
    public void g(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
        } else if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f14661a) {
            case 2:
                a0Var.getClass();
                throw new ClassCastException();
            case 5:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new l1(-6));
            case 9:
                a0Var.getClass();
                throw new ClassCastException();
            case 11:
                a0Var.getClass();
                throw new ClassCastException();
            case 14:
                a0Var.getClass();
                throw new ClassCastException();
            case 16:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = a0Var.e;
                a0Var.s(rVar);
                dVar2.getClass();
                return l8.b(new l1(-6));
        }
    }

    public p0(Object obj, int i10) {
        this.f14661a = i10;
    }

    public p0(String str, int i10, int i11, n nVar) {
        this.f14661a = 9;
    }

    public p0(String str, int i10, Object obj) {
        this.f14661a = i10;
    }

    @Override
    public void l() {
    }

    @Override
    public void release() {
    }
}
