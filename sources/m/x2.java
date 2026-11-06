package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class x2 extends TouchDelegate {
    public final View f19301a;
    public final Rect f19302b;
    public final Rect f19303c;
    public final Rect d;
    public final int f19304e;
    public boolean f19305f;

    public x2(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f19304e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f19302b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f19303c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i7 = -scaledTouchSlop;
        rect4.inset(i7, i7);
        rect5.set(rect2);
        this.f19301a = view;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z10 = this.f19305f;
                    this.f19305f = false;
                }
                z9 = true;
                z11 = false;
            } else {
                z10 = this.f19305f;
                if (z10 && !this.d.contains(x10, y10)) {
                    z11 = z10;
                    z9 = false;
                }
            }
            z11 = z10;
            z9 = true;
        } else {
            if (this.f19302b.contains(x10, y10)) {
                this.f19305f = true;
                z9 = true;
            }
            z9 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f19303c;
        View view = this.f19301a;
        if (z9 && !rect.contains(x10, y10)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
