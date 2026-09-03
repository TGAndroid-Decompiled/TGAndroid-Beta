package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.z5;
public final class r extends View {
    public final int f4644a = 1;
    public Paint f4645b;
    public Paint f4646c;
    public float d;
    public Object f4647e;

    public r(Context context) {
        super(context);
    }

    public void a() {
        this.f4645b.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((e0) this.f4647e).f4505f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void b(float f10) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = k7.o.a(((f10 - dp) + (AndroidUtilities.dp(13.0f) - (this.f4646c.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        this.d = a2;
        e0 e0Var = (e0) this.f4647e;
        e0Var.m(i0.a.k(e0Var.f4505f, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f4644a) {
            case 0:
                super.onDraw(canvas);
                float height = getHeight() / 2.0f;
                float dp = AndroidUtilities.dp(6.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = height - dp;
                float f11 = height + dp;
                rectF.set(dp, f10, getWidth() - dp, f11);
                canvas.save();
                e0 e0Var = (e0) this.f4647e;
                e0Var.f4504e.rewind();
                e0Var.f4504e.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.clipPath(e0Var.f4504e);
                eg.c2.v1(canvas, rectF, AndroidUtilities.dp(6.0f));
                canvas.restore();
                rectF.set(dp, f10, getWidth() - dp, f11);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f4645b);
                float dp2 = AndroidUtilities.dp(13.0f);
                Paint paint = this.f4646c;
                float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
                float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * this.d) + dp) - strokeWidth);
                canvas.drawCircle(max, height, dp2, paint);
                eg.c2.w1(max, height, strokeWidth, i0.a.k(e0Var.f4505f, (int) (this.d * 255.0f)), canvas);
                return;
            default:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f4646c);
                rectF2.set(0.0f, 0.0f, ((z5) this.f4647e).d(this.d, false) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f4645b);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f4644a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                a();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f4644a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    } else {
                        b(motionEvent.getX());
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    return true;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                b(motionEvent.getX());
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public r(e0 e0Var, Context context) {
        super(context);
        this.f4647e = e0Var;
        this.f4645b = new Paint(1);
        Paint paint = new Paint(1);
        this.f4646c = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }
}
