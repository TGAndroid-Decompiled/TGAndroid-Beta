package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class a3 extends TouchDelegate {
    public final View f13442a;
    public final Rect f13443b;
    public final Rect f13444c;
    public final Rect d;
    public final int e;
    public boolean f13445f;

    public a3(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f13443b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f13444c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f13442a = view;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z10 = this.f13445f;
                    this.f13445f = false;
                }
                z4 = true;
                z11 = false;
            } else {
                z10 = this.f13445f;
                if (z10 && !this.d.contains(x10, y10)) {
                    z11 = z10;
                    z4 = false;
                }
            }
            z11 = z10;
            z4 = true;
        } else {
            if (this.f13443b.contains(x10, y10)) {
                this.f13445f = true;
                z4 = true;
            }
            z4 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f13444c;
        View view = this.f13442a;
        if (z4 && !rect.contains(x10, y10)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
