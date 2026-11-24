package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class qq1 extends ztb {
    public final mu1 e;

    public qq1(mu1 mu1Var, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context);
        this.e = mu1Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() != 0.0f) {
            mu1 mu1Var = this.e;
            aVar = ((d) mu1Var).actionBar;
            if (!aVar.y() && !mu1Var.R7()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
