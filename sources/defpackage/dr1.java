package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class dr1 extends ayb {
    public final zu1 e;

    public dr1(zu1 zu1Var, Context context, int i, vnb vnbVar) {
        super(i, vnbVar, context);
        this.e = zu1Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (getAlpha() != 0.0f) {
            zu1 zu1Var = this.e;
            aVar = ((e) zu1Var).actionBar;
            if (!aVar.z() && !zu1Var.c8()) {
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
