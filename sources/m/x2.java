package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class x2 extends TouchDelegate {
    public final View f12592a;
    public final Rect f12593b;
    public final Rect f12594c;
    public final Rect d;
    public final int e;
    public boolean f12595f;

    public x2(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f12593b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f12594c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f12592a = view;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f12595f;
                    this.f12595f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f12595f;
                if (z11 && !this.d.contains(x10, y3)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f12593b.contains(x10, y3)) {
                this.f12595f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f12594c;
        View view = this.f12592a;
        if (z10 && !rect.contains(x10, y3)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y3 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
