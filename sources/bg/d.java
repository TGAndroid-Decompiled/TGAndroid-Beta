package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.z5;
import org.telegram.messenger.AndroidUtilities;
public abstract class d extends FrameLayout {
    public boolean f2137a;
    public final c f2138b;
    public boolean f2139c;
    public float d;
    public float f2140e;
    public boolean f2141f;

    public d(Context context, c cVar) {
        super(context);
        this.f2138b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f2137a && (view instanceof e3)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view instanceof f4) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f2138b;
        k b10 = cVar.b();
        if (b10 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f2139c = false;
                b10.f2359n = false;
                b10.f2360r = false;
                this.d = motionEvent.getX();
                this.f2140e = motionEvent.getY();
                this.f2141f = false;
                return true;
            }
            if (!this.f2141f && actionMasked == 2) {
                float x4 = motionEvent.getX();
                float y8 = motionEvent.getY();
                if (this.f2139c || z5.a(x4, y8, this.d, this.f2140e) > AndroidUtilities.touchSlop) {
                    this.f2139c = true;
                    b10.f2359n = true;
                    b10.e(x4 - this.d, y8 - this.f2140e);
                    this.d = x4;
                    this.f2140e = y8;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                b10.f2359n = false;
                b10.f2360r = true;
                if (!this.f2139c) {
                    cVar.a();
                }
                invalidate();
                return false;
            }
            return true;
        }
        b10.f2359n = false;
        b10.f2360r = true;
        this.f2139c = false;
        this.f2141f = true;
        invalidate();
        return true;
    }
}
