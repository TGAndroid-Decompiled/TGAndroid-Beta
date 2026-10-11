package m4;

import android.graphics.RectF;
import android.view.View;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.ww0;
import v7.j8;
public final class p0 implements e2.h, b1, a1, n2.l, d9.e, z1, ww0, Utilities.Callback2Return, hh.h {
    public final int f16274a;

    public p0(int i10) {
        this.f16274a = i10;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        switch (this.f16274a) {
            case 5:
                g1Var.v0(list);
                return;
            default:
                g1Var.v0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f16274a) {
            case 0:
                ((g1) obj).F();
                return;
            case 1:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 13:
            default:
                ((n2.j) obj).a();
                return;
            case 2:
                ((g1) obj).F0();
                return;
            case 3:
                ((g1) obj).E0();
                return;
            case 6:
                ((g1) obj).L();
                return;
            case 9:
                ((g1) obj).stop();
                return;
            case 11:
                ((g1) obj).b();
                return;
            case 12:
                ((g1) obj).H();
                return;
            case 14:
                ((g1) obj).v();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.f48773b, new s0.b(19)));
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f16274a) {
            case 24:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
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
    public Object h(b0 b0Var, r rVar, int i10) {
        switch (this.f16274a) {
            case 1:
                b0Var.getClass();
                throw new ClassCastException();
            case 4:
                na.d dVar = b0Var.f16044e;
                b0Var.s(rVar);
                dVar.getClass();
                return j8.b(new m1(-6));
            case 8:
                b0Var.getClass();
                throw new ClassCastException();
            case 10:
                b0Var.getClass();
                throw new ClassCastException();
            case 13:
                b0Var.getClass();
                throw new ClassCastException();
            case 15:
                b0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = b0Var.f16044e;
                b0Var.s(rVar);
                dVar2.getClass();
                return j8.b(new m1(-6));
        }
    }

    @Override
    public void j(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return LocaleController.formatPluralString("MaximumReactionsValue", num.intValue(), new Object[0]);
        }
        return "" + num;
    }

    public p0(Object obj, int i10) {
        this.f16274a = i10;
    }

    public p0(String str, int i10, int i11, n nVar) {
        this.f16274a = 8;
    }

    public p0(String str, int i10, Object obj) {
        this.f16274a = i10;
    }

    @Override
    public void l() {
    }

    @Override
    public void release() {
    }
}
