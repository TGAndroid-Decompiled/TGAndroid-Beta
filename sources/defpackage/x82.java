package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class x82 extends tu9 {
    public final f92 O;

    public x82(f92 f92Var, Context context, t1 t1Var, wjb wjbVar) {
        super(context, t1Var, wjbVar, false);
        this.O = f92Var;
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
        rect.bottom = gl.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z);
    }
}
