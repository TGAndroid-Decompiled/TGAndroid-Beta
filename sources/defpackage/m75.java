package defpackage;

import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class m75 extends View {
    public final j95 a;

    public m75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = j95Var;
    }

    @Override
    public final void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            this.a.J0();
        }
    }
}
