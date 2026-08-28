package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class a3 extends TouchDelegate {
    public final View f16893a;
    public final Rect f16894b;
    public final Rect f16895c;
    public final Rect d;
    public final int f16896e;
    public boolean f16897f;

    public a3(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f16896e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f16894b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f16895c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i9 = -scaledTouchSlop;
        rect4.inset(i9, i9);
        rect5.set(rect2);
        this.f16893a = view;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f16897f;
                    this.f16897f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f16897f;
                if (z11 && !this.d.contains(x10, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f16894b.contains(x10, y10)) {
                this.f16897f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f16895c;
        View view = this.f16893a;
        if (z10 && !rect.contains(x10, y10)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
