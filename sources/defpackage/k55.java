package defpackage;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class k55 extends View {
    public final h75 a;

    public k55(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = h75Var;
    }

    @Override
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.a.I0();
        }
    }
}
