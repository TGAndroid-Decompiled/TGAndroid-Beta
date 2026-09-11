package m4;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.gs;
import v7.l8;
public final class t0 implements e1, n2.l, d9.e, a2, rv0, Utilities.Callback2Return, ih.i, yk0, fv0, gv0, LanguageDetector.ExceptionCallback {
    public final int f16090a;

    public t0(int i10) {
        this.f16090a = i10;
    }

    public static ActionMode.Callback2 d(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.f46774b, new t0.a(4)));
    }

    @Override
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        switch (this.f16090a) {
            case 22:
                gsVar.f36762b = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 23:
            case 25:
            default:
                gsVar.f36764e = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 24:
                gsVar.f36763c = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
            case 26:
                gsVar.d = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f16090a) {
            case 11:
                b2Var.dismiss();
                return;
            case 16:
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
        switch (this.f16090a) {
            case 21:
                return gsVar.f36762b;
            case 22:
            case 24:
            default:
                return gsVar.f36764e;
            case 23:
                return gsVar.f36763c;
            case 25:
                return gsVar.d;
        }
    }

    @Override
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.f16090a) {
            case 0:
                a0Var.getClass();
                throw new ClassCastException();
            case 1:
                a0Var.getClass();
                throw new ClassCastException();
            case 2:
                a0Var.getClass();
                throw new ClassCastException();
            case 3:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                ob.a aVar = a0Var.f15829e;
                a0Var.s(rVar);
                aVar.getClass();
                return l8.b(new p1(-6));
        }
    }

    @Override
    public void i(int i10) {
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
    public void k(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    public t0(Object obj, int i10) {
        this.f16090a = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.f16090a) {
            case 14:
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

    public t0(String str, int i10, int i11, n nVar) {
        this.f16090a = 0;
    }

    public t0(String str, n nVar, int i10) {
        this.f16090a = i10;
    }

    @Override
    public void l() {
    }

    @Override
    public void release() {
    }
}
