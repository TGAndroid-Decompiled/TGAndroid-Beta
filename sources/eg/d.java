package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.o6;
import org.telegram.messenger.AndroidUtilities;
public abstract class d extends FrameLayout {
    public boolean f5143a;
    public final c f5144b;
    public boolean f5145c;
    public float d;
    public float f5146e;
    public boolean f5147f;

    public d(Context context, c cVar) {
        super(context);
        this.f5144b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f5143a && (view instanceof y2)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view instanceof z3) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f5144b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f5145c = false;
                b10.f5285n = false;
                b10.f5286r = false;
                this.d = motionEvent.getX();
                this.f5146e = motionEvent.getY();
                this.f5147f = false;
                return true;
            }
            if (!this.f5147f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f5145c || o6.a(x10, y10, this.d, this.f5146e) > AndroidUtilities.touchSlop) {
                    this.f5145c = true;
                    b10.f5285n = true;
                    b10.e(x10 - this.d, y10 - this.f5146e);
                    this.d = x10;
                    this.f5146e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f5285n = false;
                b10.f5286r = true;
                if (!this.f5145c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f5285n = false;
        b10.f5286r = true;
        this.f5145c = false;
        this.f5147f = true;
        invalidate();
        return true;
    }
}
