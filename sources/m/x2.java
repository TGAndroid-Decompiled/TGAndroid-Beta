package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class x2 extends TouchDelegate {
    public final View f15712a;
    public final Rect f15713b;
    public final Rect f15714c;
    public final Rect d;
    public final int f15715e;
    public boolean f15716f;

    public x2(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f15715e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f15713b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f15714c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f15712a = view;
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
                    z11 = this.f15716f;
                    this.f15716f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f15716f;
                if (z11 && !this.d.contains(x10, y3)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f15713b.contains(x10, y3)) {
                this.f15716f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f15714c;
        View view = this.f15712a;
        if (z10 && !rect.contains(x10, y3)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y3 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
