package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.n6;
import org.telegram.messenger.AndroidUtilities;
public abstract class d extends FrameLayout {
    public boolean f4439a;
    public final c f4440b;
    public boolean f4441c;
    public float d;
    public float e;
    public boolean f4442f;

    public d(Context context, c cVar) {
        super(context);
        this.f4440b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f4439a && (view instanceof a3)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view instanceof b4) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f4440b;
        j b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f4441c = false;
                b10.f4594n = false;
                b10.f4595r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f4442f = false;
                return true;
            }
            if (!this.f4442f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (this.f4441c || n6.a(x10, y10, this.d, this.e) > AndroidUtilities.touchSlop) {
                    this.f4441c = true;
                    b10.f4594n = true;
                    b10.e(x10 - this.d, y10 - this.e);
                    this.d = x10;
                    this.e = y10;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f4594n = false;
                b10.f4595r = true;
                if (!this.f4441c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f4594n = false;
        b10.f4595r = true;
        this.f4441c = false;
        this.f4442f = true;
        invalidate();
        return true;
    }
}
