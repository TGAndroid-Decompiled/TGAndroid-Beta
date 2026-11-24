package defpackage;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public final class xr1 extends UndoView {
    public final byte k0 = 1;
    public final Object l0;

    public xr1(mu1 mu1Var, Activity activity, mu1 mu1Var2, wjb wjbVar) {
        super(activity, mu1Var2, true, wjbVar);
        this.l0 = mu1Var;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((mu1) this.l0).d6(characterStyle, false, null, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.k0) {
            case 1:
                super.invalidate();
                ((e55) this.l0).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f;
        int i2;
        switch (this.k0) {
            case 0:
                uq1 uq1Var = ((mu1) this.l0).m2;
                if (uq1Var != null && (((i2 = uq1Var.U) == 1 || i2 == 3) && uq1Var.T)) {
                    f = gl.L(uq1Var.getStyleHeight());
                } else {
                    f = 0.0f;
                }
                setAdditionalTranslationY(f);
                super.k(j, i, obj, obj2, runnable, runnable2);
                return;
            default:
                super.k(j, i, obj, obj2, runnable, runnable2);
                return;
        }
    }

    public xr1(e55 e55Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.l0 = e55Var;
    }
}
