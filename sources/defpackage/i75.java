package defpackage;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class i75 extends View {
    public final g95 a;

    public i75(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = g95Var;
    }

    @Override
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.a.I0();
        }
    }
}
