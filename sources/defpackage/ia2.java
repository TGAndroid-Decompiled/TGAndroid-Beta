package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class ia2 extends ww9 {
    public final qa2 O;

    public ia2(qa2 qa2Var, Context context, t1 t1Var, ylb ylbVar) {
        super(context, t1Var, ylbVar, false);
        this.O = qa2Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.O.M && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.O.M && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.bottom = gm.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z);
    }
}
