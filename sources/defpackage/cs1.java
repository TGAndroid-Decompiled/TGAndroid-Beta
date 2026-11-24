package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class cs1 extends awb {
    public final yv1 e;

    public cs1(yv1 yv1Var, Context context, int i, ylb ylbVar) {
        super(i, ylbVar, context);
        this.e = yv1Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() != 0.0f) {
            yv1 yv1Var = this.e;
            aVar = ((d) yv1Var).actionBar;
            if (!aVar.y() && !yv1Var.c8()) {
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
