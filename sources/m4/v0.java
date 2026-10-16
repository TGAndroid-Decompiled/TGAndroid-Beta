package m4;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ks;
import v7.q8;
public final class v0 implements e2.j, g1, n2.l, d9.k, z1, rw0, Utilities.Callback2Return, ih.h, zl0, fw0, gw0 {
    public final int f15403a;

    public v0(int i10) {
        this.f15403a = i10;
    }

    @Override
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.f15403a) {
            case 0:
                m1Var.stop();
                return;
            case 1:
                m1Var.c0();
                return;
            case 2:
                m1Var.G();
                return;
            case 3:
            default:
                m1Var.u();
                return;
            case 4:
                m1Var.b();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.n0.u(e9.s.x(qVar.Y.f46034b, new t0.a(6)));
    }

    @Override
    public void b(Object obj, float f7) {
        ks ksVar = (ks) obj;
        switch (this.f15403a) {
            case 25:
                ksVar.f37500b = f7;
                if (ksVar.getParent() != null) {
                    ((View) ksVar.getParent()).invalidate();
                    return;
                }
                return;
            case 26:
            default:
                ksVar.d = f7;
                if (ksVar.getParent() != null) {
                    ((View) ksVar.getParent()).invalidate();
                    return;
                }
                return;
            case 27:
                ksVar.f37501c = f7;
                if (ksVar.getParent() != null) {
                    ((View) ksVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public Object c(e0 e0Var, v vVar, int i10) {
        switch (this.f15403a) {
            case 3:
                e0Var.getClass();
                throw new ClassCastException();
            case 4:
            case 6:
            default:
                pb.a aVar = e0Var.e;
                e0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
            case 5:
                e0Var.getClass();
                throw new ClassCastException();
            case 7:
                e0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void f(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void g(a2 a2Var, int i10) {
        switch (this.f15403a) {
            case 15:
                a2Var.dismiss();
                return;
            case 19:
                a2Var.dismiss();
                return;
            default:
                a2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        ks ksVar = (ks) obj;
        switch (this.f15403a) {
            case 24:
                return ksVar.f37500b;
            case 25:
            default:
                return ksVar.d;
            case 26:
                return ksVar.f37501c;
        }
    }

    @Override
    public void h(int i10) {
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
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f15403a) {
            case 18:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    public v0(Object obj, int i10) {
        this.f15403a = i10;
    }

    public v0(String str, q qVar, int i10) {
        this.f15403a = i10;
    }

    @Override
    public void m() {
    }

    @Override
    public void release() {
    }
}
