package defpackage;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public final class kt1 extends UndoView {
    public final byte k0 = 1;
    public final Object l0;

    public kt1(yv1 yv1Var, Activity activity, yv1 yv1Var2, ylb ylbVar) {
        super(activity, yv1Var2, true, ylbVar);
        this.l0 = yv1Var;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((yv1) this.l0).m6(characterStyle, false, null, null);
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
                ((c75) this.l0).invalidate();
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
                gs1 gs1Var = ((yv1) this.l0).m2;
                if (gs1Var != null && (((i2 = gs1Var.U) == 1 || i2 == 3) && gs1Var.T)) {
                    f = gm.L(gs1Var.getStyleHeight());
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

    public kt1(c75 c75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.l0 = c75Var;
    }
}
