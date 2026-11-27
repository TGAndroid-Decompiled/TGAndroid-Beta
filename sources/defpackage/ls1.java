package defpackage;

import android.app.Activity;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
public final class ls1 extends UndoView {
    public final byte k0 = 1;
    public final Object l0;

    public ls1(zu1 zu1Var, Activity activity, zu1 zu1Var2, vnb vnbVar) {
        super(activity, zu1Var2, true, vnbVar);
        this.l0 = zu1Var;
    }

    @Override
    public final void b(CharacterStyle characterStyle) {
        switch (this.k0) {
            case 0:
                ((zu1) this.l0).m6(characterStyle, false, null, null);
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
                ((g75) this.l0).invalidate();
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
                hr1 hr1Var = ((zu1) this.l0).m2;
                if (hr1Var != null && (((i2 = hr1Var.U) == 1 || i2 == 3) && hr1Var.T)) {
                    f = hl.L(hr1Var.getStyleHeight());
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

    public ls1(g75 g75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.l0 = g75Var;
    }
}
