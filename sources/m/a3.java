package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class a3 extends TouchDelegate {
    public final View f16492a;
    public final Rect f16493b;
    public final Rect f16494c;
    public final Rect d;
    public final int f16495e;
    public boolean f16496f;

    public a3(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f16495e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f16493b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f16494c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f16492a = view;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x4 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f16496f;
                    this.f16496f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f16496f;
                if (z11 && !this.d.contains(x4, y8)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f16493b.contains(x4, y8)) {
                this.f16496f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f16494c;
        View view = this.f16492a;
        if (z10 && !rect.contains(x4, y8)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x4 - rect.left, y8 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
