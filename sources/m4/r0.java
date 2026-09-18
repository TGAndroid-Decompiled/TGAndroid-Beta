package m4;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.gs;
import v7.l8;
public final class r0 implements e1, d1, n2.m, d9.e, g2.g, a2, ew0, Utilities.Callback2Return, hh.i, jl0, sv0, tv0 {
    public final int f14855a;

    public r0(int i10) {
        this.f14855a = i10;
    }

    public static ActionMode.Callback2 e(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public void a(j1 j1Var, r rVar, List list) {
        switch (this.f14855a) {
            case 1:
                j1Var.v0(list);
                return;
            default:
                j1Var.v0(list);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.f43713b, new s9.b(12)));
    }

    @Override
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        switch (this.f14855a) {
            case 27:
                gsVar.f33920b = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                gsVar.f33921c = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f14855a) {
            case 16:
                b2Var.dismiss();
                return;
            case 21:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        gs gsVar = (gs) obj;
        switch (this.f14855a) {
            case 26:
                return gsVar.f33920b;
            default:
                return gsVar.f33921c;
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
    public Object i(a0 a0Var, r rVar, int i10) {
        switch (this.f14855a) {
            case 0:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new p1(-6));
            case 1:
            case 2:
            default:
                na.d dVar2 = a0Var.e;
                a0Var.s(rVar);
                dVar2.getClass();
                return l8.b(new p1(-6));
            case 3:
                a0Var.getClass();
                throw new ClassCastException();
            case 4:
                a0Var.getClass();
                throw new ClassCastException();
            case 5:
                a0Var.getClass();
                throw new ClassCastException();
            case 6:
                a0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void j(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f14855a) {
            case 19:
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

    public r0(Object obj, int i10) {
        this.f14855a = i10;
    }

    public r0(String str, int i10, int i11, n nVar) {
        this.f14855a = 3;
    }

    public r0(String str, int i10, Object obj) {
        this.f14855a = i10;
    }

    @Override
    public void n() {
    }

    @Override
    public void release() {
    }
}
