package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class czb extends o39 {
    public final rzb f3;

    public czb(rzb rzbVar, Context context) {
        super(context, null);
        this.f3 = rzbVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            rzb rzbVar = this.f3;
            if (y < rzbVar.F0(true) - getTop()) {
                rzbVar.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
    }
}
