package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class i9 extends FrameLayout {
    public final int f7384a = 2;
    public Object f7385b;
    public float f7386c;
    public Path d;
    public Object f7387e;

    public i9(Context context) {
        super(context);
    }

    public void a(float f7, float f10) {
        float[] fArr = (float[]) this.f7387e;
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: di.i9.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f7384a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f7386c) {
                    ((ia) this.f7387e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f7386c) {
                    ((gi.k0) this.f7387e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f7384a) {
            case 2:
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                Path path = this.d;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.f7386c), getMeasuredHeight());
                a(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.f7386c));
                float[] fArr = (float[]) this.f7387e;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                Paint paint = (Paint) this.f7385b;
                canvas.drawPath(path, paint);
                path.rewind();
                rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.f7386c), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a(AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.f7386c), AndroidUtilities.dp(8.0f));
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
        switch (this.f7384a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public i9(gi.k0 k0Var, Context context) {
        super(context);
        this.f7387e = k0Var;
        this.f7385b = new org.telegram.ui.Components.e6(this, 250L, pr.h);
        this.d = new Path();
    }

    public i9(ia iaVar, Context context) {
        super(context);
        this.f7387e = iaVar;
        this.f7385b = new org.telegram.ui.Components.e6(this, 250L, pr.h);
        this.d = new Path();
    }
}
