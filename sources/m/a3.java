package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class a3 extends TouchDelegate {

    public final View f17268a;

    public final Rect f17269b;

    public final Rect f17270c;
    public final Rect d;

    public final int f17271e;

    public boolean f17272f;

    public a3(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f17271e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f17269b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.f17270c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f17268a = view;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z11 = this.f17272f;
                if (z11 && !this.d.contains(x8, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            } else if (action != 3) {
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f17272f;
                this.f17272f = false;
            }
            z12 = z11;
            z10 = true;
        } else if (this.f17269b.contains(x8, y10)) {
            this.f17272f = true;
            z10 = true;
        } else {
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f17270c;
        View view = this.f17268a;
        if (!z10 || rect.contains(x8, y10)) {
            motionEvent.setLocation(x8 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
