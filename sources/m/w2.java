package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
public final class w2 extends TouchDelegate {
    public final View f20279a;
    public final Rect f20280b;
    public final Rect f20281c;
    public final Rect d;
    public final int f20282e;
    public boolean f20283f;

    public w2(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f20282e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f20280b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f20281c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i7 = -scaledTouchSlop;
        rect4.inset(i7, i7);
        rect5.set(rect2);
        this.f20279a = view;
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
                    z11 = this.f20283f;
                    this.f20283f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f20283f;
                if (z11 && !this.d.contains(x10, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f20280b.contains(x10, y10)) {
                this.f20283f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f20281c;
        View view = this.f20279a;
        if (z10 && !rect.contains(x10, y10)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
