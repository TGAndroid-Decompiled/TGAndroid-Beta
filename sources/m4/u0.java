package m4;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.is;
import v7.l8;
public final class u0 implements e1, f1, n2.l, d9.e, g2.g, b2, tv0, Utilities.Callback2Return, hh.i, zk0, hv0, iv0 {
    public final int f14715a;

    public u0(int i10) {
        this.f14715a = i10;
    }

    public static ActionMode.Callback2 e(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public void a(k1 k1Var, r rVar, List list) {
        k1Var.v0(list);
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.f43486b, new t0.a(10)));
    }

    @Override
    public void b(Object obj, float f7) {
        is isVar = (is) obj;
        switch (this.f14715a) {
            case 25:
                isVar.f34671b = f7;
                if (isVar.getParent() != null) {
                    ((View) isVar.getParent()).invalidate();
                    return;
                }
                return;
            case 26:
            default:
                isVar.d = f7;
                if (isVar.getParent() != null) {
                    ((View) isVar.getParent()).invalidate();
                    return;
                }
                return;
            case 27:
                isVar.f34672c = f7;
                if (isVar.getParent() != null) {
                    ((View) isVar.getParent()).invalidate();
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
    public void f(c2 c2Var, int i10) {
        switch (this.f14715a) {
            case 14:
                c2Var.dismiss();
                return;
            case 19:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
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
    public float get(Object obj) {
        is isVar = (is) obj;
        switch (this.f14715a) {
            case 24:
                return isVar.f34671b;
            case 25:
            default:
                return isVar.d;
            case 26:
                return isVar.f34672c;
        }
    }

    @Override
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f14715a) {
            case 1:
                a0Var.getClass();
                throw new ClassCastException();
            case 2:
                a0Var.getClass();
                throw new ClassCastException();
            case 3:
                a0Var.getClass();
                throw new ClassCastException();
            case 4:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new q1(-6));
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
        switch (this.f14715a) {
            case 17:
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

    public u0(Object obj, int i10) {
        this.f14715a = i10;
    }

    public u0(String str, int i10, int i11, n nVar) {
        this.f14715a = 1;
    }

    public u0(String str, n nVar, int i10) {
        this.f14715a = i10;
    }

    @Override
    public void l() {
    }

    @Override
    public void release() {
    }
}
