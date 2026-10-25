package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class y2 extends TouchDelegate {
    public final View f17906a;
    public final Rect f17907b;
    public final Rect f17908c;
    public final Rect d;
    public final int e;
    public boolean f17909f;

    public y2(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f17907b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f17908c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f17906a = view;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x9 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f17909f;
                    this.f17909f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f17909f;
                if (z11 && !this.d.contains(x9, y3)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f17907b.contains(x9, y3)) {
                this.f17909f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f17908c;
        View view = this.f17906a;
        if (z10 && !rect.contains(x9, y3)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x9 - rect.left, y3 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
