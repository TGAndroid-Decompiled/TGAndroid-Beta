package n2;

import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.View;
import e9.i0;
import og.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.hs;
public final class l implements m, d9.e, g2.g, k0, c2, dw0, Utilities.Callback2Return, gh.i, il0, qv0, rv0 {
    public final int f13737a;

    public l(int i10) {
        this.f13737a = i10;
    }

    public static ActionMode.Callback2 g(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public Typeface a() {
        switch (this.f13737a) {
            case 5:
                return AndroidUtilities.getTypeface("fonts/rmedium.ttf");
            case 6:
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            case 7:
                return Typeface.create("serif", 1);
            case 8:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 9:
                return AndroidUtilities.getTypeface("fonts/rmono.ttf");
            default:
                return AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return i0.v(e9.q.w(qVar.Y.f42437b, new u2.c(2)));
    }

    @Override
    public void b(Object obj, float f7) {
        hs hsVar = (hs) obj;
        switch (this.f13737a) {
            case 23:
                hsVar.f33445b = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 24:
            case 26:
            default:
                hsVar.e = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 25:
                hsVar.f33446c = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 27:
                hsVar.d = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
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
    public void e(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f13737a) {
            case 12:
                d2Var.dismiss();
                return;
            case 17:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        hs hsVar = (hs) obj;
        switch (this.f13737a) {
            case 22:
                return hsVar.f33445b;
            case 23:
            case 25:
            default:
                return hsVar.e;
            case 24:
                return hsVar.f33446c;
            case 26:
                return hsVar.d;
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
        switch (this.f13737a) {
            case 15:
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
    public void l() {
    }

    @Override
    public void release() {
    }
}
