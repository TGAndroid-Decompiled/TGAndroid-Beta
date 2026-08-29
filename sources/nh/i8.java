package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class i8 extends FrameLayout {
    public final int f17904a = 1;
    public Path f17905b;
    public float f17906c;
    public Object d;
    public Object f17907e;

    public i8(Context context) {
        super(context);
    }

    public void a(float f9, float f10) {
        float[] fArr = (float[]) this.f17907e;
        fArr[7] = f9;
        fArr[6] = f9;
        fArr[1] = f9;
        fArr[0] = f9;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: nh.i8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f17904a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f17906c) {
                    ((e9) this.f17907e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f17906c) {
                    ((qh.i0) this.f17907e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f17904a) {
            case 1:
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                Path path = this.f17905b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.f17906c), getMeasuredHeight());
                a(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.f17906c));
                float[] fArr = (float[]) this.f17907e;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                Paint paint = (Paint) this.d;
                canvas.drawPath(path, paint);
                path.rewind();
                rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.f17906c), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a(AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.f17906c), AndroidUtilities.dp(8.0f));
                path.addRoundRect(rectF, fArr, direction);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f17904a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 1:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
        }
    }

    public i8(qh.i0 i0Var, Context context) {
        super(context);
        this.f17907e = i0Var;
        this.d = new org.telegram.ui.Components.d6(this, 250L, jr.h);
        this.f17905b = new Path();
    }

    public i8(e9 e9Var, Context context) {
        super(context);
        this.f17907e = e9Var;
        this.d = new org.telegram.ui.Components.d6(this, 250L, jr.h);
        this.f17905b = new Path();
    }
}
