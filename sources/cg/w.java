package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class w extends View {
    public final Paint f2535a;
    public final Paint f2536b;
    public final Paint f2537c;
    public float d;
    public float e;
    public final Drawable f2538f;
    public final float[] h;
    public final e0 f2539n;

    public w(e0 e0Var, Context context) {
        super(context);
        this.f2539n = e0Var;
        this.f2535a = new Paint(1);
        this.f2536b = new Paint(1);
        Paint paint = new Paint(1);
        this.f2537c = paint;
        this.h = new float[3];
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.f2538f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        float f10;
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y10 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.e = y10;
        float[] fArr = this.h;
        fArr[0] = y10 * 360.0f;
        float f11 = this.d;
        float f12 = 1.0f;
        int i10 = (f11 > 0.22f ? 1 : (f11 == 0.22f ? 0 : -1));
        if (i10 > 0 && f11 < 0.78f) {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        } else {
            if (i10 <= 0) {
                f10 = 1.0f - (f11 / 0.22f);
            } else {
                f10 = (f11 - 0.78f) / 0.22000003f;
            }
            fArr[1] = AndroidUtilities.lerp(1.0f, 0.0f, f10);
            float f13 = this.d;
            if (f13 > 0.22f) {
                f12 = AndroidUtilities.lerp(1.0f, 0.0f, (f13 - 0.78f) / 0.22000003f);
            }
            fArr[2] = f12;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        e0 e0Var = this.f2539n;
        e0Var.f2345f = HSVToColor;
        e0Var.m(HSVToColor, 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f2535a);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f2536b);
        float dp = AndroidUtilities.dp(13.0f);
        Paint paint = this.f2537c;
        float dp2 = AndroidUtilities.dp(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f10 = width;
        float a2 = k7.n.a(this.d * f10, dp2, f10 - dp2) + getPaddingLeft();
        float f11 = height;
        float a10 = k7.n.a(this.e * f11, dp2, f11 - dp2) + getPaddingTop();
        Rect rect = AndroidUtilities.rectTmp2;
        Drawable drawable = this.f2538f;
        drawable.getPadding(rect);
        int i10 = rect.bottom;
        drawable.setBounds((int) ((a2 - dp) - rect.left), (int) ((a10 - dp) - rect.top), (int) (a2 + dp + i10), (int) (a10 + dp + i10));
        drawable.draw(canvas);
        canvas.drawCircle(a2, a10, dp, paint);
        dg.e2.w1(a2, a10, dp - (paint.getStrokeWidth() / 2.0f), i0.a.k(this.f2539n.f2345f, 255), canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f2535a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i11 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.f2536b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i10 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    a(motionEvent);
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                a(motionEvent);
            }
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            a(motionEvent);
        }
        return true;
    }
}
