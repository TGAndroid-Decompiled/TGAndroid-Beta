package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class or1 extends lv1 {
    public final zu1 d;

    public or1(zu1 zu1Var, Context context) {
        super(context);
        this.d = zu1Var;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        zu1 zu1Var = this.d;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            nr1Var.invalidate();
        }
        if (getVisibility() != 8) {
            zu1Var.H7(true);
            FrameLayout frameLayout = zu1Var.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f);
            }
            zu1Var.O7();
            zu1Var.Q7();
            View view = zu1Var.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i) {
        FrameLayout frameLayout;
        super.setVisibility(i);
        if (i == 8 && (frameLayout = this.d.R) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
