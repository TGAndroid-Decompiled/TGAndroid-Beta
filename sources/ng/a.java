package ng;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import nh.b3;
import nh.d4;
import nh.y3;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.ru0;
import org.telegram.ui.Components.su0;
import qg.h;

public final class a implements mg.c, qu0, ru0, GenericProvider, a2, cv0, Utilities.Callback2Return, h, ok0 {

    public final int f18521a;

    public a(int i10) {
        this.f18521a = i10;
    }

    public static ActionMode.Callback2 d(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f18521a) {
            case 14:
                b3 b3Var = (b3) obj;
                b3Var.f18570b = f10;
                b3Var.f18575e.invalidate();
                b3Var.S.setAlpha(f10);
                b3Var.E();
                b3Var.C();
                break;
            case 15:
            default:
                ((d4) obj).setSwipeOffsetY(f10);
                break;
            case 16:
                ((y3) obj).setLoadProgress(f10);
                break;
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f18521a) {
            case 21:
                b2Var.dismiss();
                break;
            case 26:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public void g(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public float get(Object obj) {
        switch (this.f18521a) {
            case 13:
                return ((b3) obj).f18570b;
            case 14:
            default:
                return ((d4) obj).getSwipeOffsetY();
            case 15:
                return ((y3) obj).f19061c;
        }
    }

    @Override
    public int i(c6 c6Var, boolean z10) {
        switch (this.f18521a) {
            case 0:
                if (!LiteMode.isEnabled(256)) {
                    return g6.w0(null, g6.G8, false);
                }
                return g6.l1(z10 ? 0.85f : 0.825f, g6.w0(null, g6.G8, false));
            case 1:
                return c.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.f23053d6, c6Var), g6.v0(g6.Zk, c6Var));
            case 2:
                return g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.Fi, c6Var));
            case 3:
                return 855638016;
            case 4:
                return 1073741824;
            case 5:
                return g6.l1(0.075f, -16777216);
            case 6:
                return g6.l1(z10 ? 0.85f : 0.825f, g6.w0(null, g6.G8, false));
            case 7:
                return c.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.f23053d6, c6Var), g6.v0(g6.Yk, c6Var));
            case 8:
                return g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.f23053d6, c6Var));
            case 9:
                return g6.l1(0.78f, g6.v0(g6.f23124h5, c6Var));
            case 10:
                return g6.l1(0.7f, g6.v0(g6.f23053d6, c6Var));
            case 11:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.f23053d6, c6Var));
        }
    }

    @Override
    public void j(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override
    public Object provide(Object obj) {
        su0 su0Var = d4.U;
        return Boolean.FALSE;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return LocaleController.formatPluralString("MaximumReactionsValue", num.intValue(), new Object[0]);
        }
        return "" + num;
    }

    @Override
    public void m() {
    }
}
