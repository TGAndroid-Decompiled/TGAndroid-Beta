package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class w2 extends TouchDelegate {
    public final View f18772a;
    public final Rect f18773b;
    public final Rect f18774c;
    public final Rect d;
    public final int f18775e;
    public boolean f18776f;

    public w2(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f18775e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f18773b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f18774c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f18772a = view;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f18776f;
                    this.f18776f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f18776f;
                if (z11 && !this.d.contains(x10, y9)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f18773b.contains(x10, y9)) {
                this.f18776f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f18774c;
        View view = this.f18772a;
        if (z10 && !rect.contains(x10, y9)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y9 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
