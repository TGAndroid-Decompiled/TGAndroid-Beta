package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import w7.z8;
public abstract class d extends FrameLayout {
    public boolean f9912a;
    public final c f9913b;
    public boolean f9914c;
    public float d;
    public float e;
    public boolean f9915f;

    public d(Context context, c cVar) {
        super(context);
        this.f9913b = cVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f9912a && (view instanceof h2)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view instanceof g3) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f9913b;
        j g02 = cVar.g0();
        if (g02 == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f9914c = false;
                g02.f10048n = false;
                g02.f10051r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f9915f = false;
                return true;
            }
            if (!this.f9915f && actionMasked == 2) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (this.f9914c || z8.a(x10, y3, this.d, this.e) > org.telegram.messenger.i0.e) {
                    this.f9914c = true;
                    g02.f10048n = true;
                    g02.e(x10 - this.d, y3 - this.e);
                    this.d = x10;
                    this.e = y3;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                g02.f10048n = false;
                g02.f10051r = true;
                if (!this.f9914c) {
                    cVar.s();
                }
                invalidate();
                return false;
            }
            return true;
        }
        g02.f10048n = false;
        g02.f10051r = true;
        this.f9914c = false;
        this.f9915f = true;
        invalidate();
        return true;
    }
}
