package m4;

import android.graphics.RectF;
import android.view.View;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.jm0;
import v7.j8;
public final class r0 implements e2.h, b1, a1, n2.l, d9.e, z1, bx0, Utilities.Callback2Return, hh.h, jm0 {
    public final int f15969a;

    public r0(int i10) {
        this.f15969a = i10;
    }

    @Override
    public void a(g1 g1Var, r rVar, List list) {
        switch (this.f15969a) {
            case 3:
                g1Var.v0(list);
                return;
            default:
                g1Var.v0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f15969a) {
            case 0:
                ((g1) obj).F0();
                return;
            case 1:
                ((g1) obj).E0();
                return;
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            default:
                ((n2.j) obj).a();
                return;
            case 4:
                ((g1) obj).L();
                return;
            case 7:
                ((g1) obj).stop();
                return;
            case 9:
                ((g1) obj).b();
                return;
            case 10:
                ((g1) obj).H();
                return;
            case 12:
                ((g1) obj).v();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.f48880b, new s0.b(19)));
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f15969a) {
            case 22:
                a2Var.dismiss();
                return;
            case 26:
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
    public Object h(c0 c0Var, r rVar, int i10) {
        switch (this.f15969a) {
            case 2:
                na.d dVar = c0Var.f15734e;
                c0Var.s(rVar);
                dVar.getClass();
                return j8.b(new m1(-6));
            case 6:
                c0Var.getClass();
                throw new ClassCastException();
            case 8:
                c0Var.getClass();
                throw new ClassCastException();
            case 11:
                c0Var.getClass();
                throw new ClassCastException();
            case 13:
                c0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = c0Var.f15734e;
                c0Var.s(rVar);
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

    public r0(Object obj, int i10) {
        this.f15969a = i10;
    }

    public r0(String str, int i10, int i11, n nVar) {
        this.f15969a = 6;
    }

    public r0(String str, int i10, Object obj) {
        this.f15969a = i10;
    }

    @Override
    public void l() {
    }

    @Override
    public void release() {
    }
}
