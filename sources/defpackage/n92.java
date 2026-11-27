package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class n92 extends ny9 {
    public final v92 O;

    public n92(v92 v92Var, Context context, u1 u1Var, vnb vnbVar) {
        super(context, u1Var, vnbVar, false);
        this.O = v92Var;
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
        rect.bottom = hl.L(60.0f) + rect.bottom;
        return super.requestChildRectangleOnScreen(view, rect, z);
    }
}
