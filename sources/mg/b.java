package mg;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import mh.a4;
import mh.c3;
import mh.f4;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.vr;
import pg.g;
import t2.f;
import y8.d;
public final class b implements lg.c, nu0, ou0, GenericProvider, d, b2, av0, Utilities.Callback2Return, g, lk0 {
    public final int f17687a;

    public b(int i9) {
        this.f17687a = i9;
    }

    public static ActionMode.Callback2 d(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public Object H1(b3.b bVar) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(bVar);
        return lambda$getComponents$0;
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f17687a) {
            case 7:
                c3 c3Var = (c3) obj;
                c3Var.f17749b = f10;
                c3Var.f17754e.invalidate();
                c3Var.S.setAlpha(f10);
                c3Var.E();
                c3Var.C();
                return;
            case 9:
                ((a4) obj).setLoadProgress(f10);
                return;
            case 11:
                ((f4) obj).setSwipeOffsetY(f10);
                return;
            case 27:
                vr vrVar = (vr) obj;
                vrVar.f43565b = f10;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                vr vrVar2 = (vr) obj;
                vrVar2.f43566c = f10;
                if (vrVar2.getParent() != null) {
                    ((View) vrVar2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f17687a) {
            case 16:
                c2Var.dismiss();
                return;
            case 21:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public int g(b6 b6Var, boolean z10) {
        float f10;
        float f11;
        float f12;
        switch (this.f17687a) {
            case 0:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return c.l(f10, f6.v0(f6.f23001d6, b6Var), f6.v0(f6.Yk, b6Var));
            case 1:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return f6.l1(f11, f6.v0(f6.f23001d6, b6Var));
            case 2:
                return f6.l1(0.78f, f6.v0(f6.f23072h5, b6Var));
            case 3:
                return f6.l1(0.7f, f6.v0(f6.f23001d6, b6Var));
            case 4:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return f6.l1(f12, f6.v0(f6.f23001d6, b6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f17687a) {
            case 6:
                return ((c3) obj).f17749b;
            case 8:
                return ((a4) obj).f17702c;
            case 10:
                return ((f4) obj).getSwipeOffsetY();
            case 26:
                return ((vr) obj).f43565b;
            default:
                return ((vr) obj).f43566c;
        }
    }

    @Override
    public void h(int i9) {
        if (i9 == 0) {
            SharedConfig.setKeepMedia(3);
        } else if (i9 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i9 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i9 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public void i(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        pu0 pu0Var = f4.U;
        return Boolean.FALSE;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f17687a) {
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

    @Override
    public void m() {
    }
}
