package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v extends View {
    public final Paint f4688a;
    public final Paint f4689b;
    public int f4690c;
    public int d;
    public final e0 f4691e;

    public v(e0 e0Var, Context context) {
        super(context);
        this.f4691e = e0Var;
        this.f4688a = new Paint(1);
        Paint paint = new Paint(1);
        this.f4689b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }

    public final void a() {
        int argb;
        int argb2;
        int i10 = this.f4690c;
        e0 e0Var = this.f4691e;
        if (i10 != 1) {
            if (i10 != 2) {
                argb = Color.argb(255, 0, Color.green(e0Var.f4505f), Color.blue(e0Var.f4505f));
                argb2 = Color.argb(255, 255, Color.green(e0Var.f4505f), Color.blue(e0Var.f4505f));
            } else {
                argb = Color.argb(255, Color.red(e0Var.f4505f), Color.green(e0Var.f4505f), 0);
                argb2 = Color.argb(255, Color.red(e0Var.f4505f), Color.green(e0Var.f4505f), 255);
            }
        } else {
            argb = Color.argb(255, Color.red(e0Var.f4505f), 0, Color.blue(e0Var.f4505f));
            argb2 = Color.argb(255, Color.red(e0Var.f4505f), 255, Color.blue(e0Var.f4505f));
        }
        this.f4688a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f10) {
        int argb;
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = k7.o.a(((f10 - dp) + (AndroidUtilities.dp(13.0f) - (this.f4689b.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        int i10 = this.f4690c;
        e0 e0Var = this.f4691e;
        if (i10 != 1) {
            if (i10 != 2) {
                argb = Color.argb(255, (int) (a2 * 255.0f), Color.green(e0Var.f4505f), Color.blue(e0Var.f4505f));
            } else {
                argb = Color.argb(255, Color.red(e0Var.f4505f), Color.green(e0Var.f4505f), (int) (a2 * 255.0f));
            }
        } else {
            argb = Color.argb(255, Color.red(e0Var.f4505f), (int) (a2 * 255.0f), Color.blue(e0Var.f4505f));
        }
        e0Var.m(i0.a.k(argb, Color.alpha(e0Var.f4505f)), 4);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int green;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, height - dp, getWidth() - dp, height + dp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f4688a);
        int i10 = this.f4690c;
        e0 e0Var = this.f4691e;
        if (i10 != 1) {
            if (i10 != 2) {
                green = Color.red(e0Var.f4505f);
            } else {
                green = Color.blue(e0Var.f4505f);
            }
        } else {
            green = Color.green(e0Var.f4505f);
        }
        float f10 = green / 255.0f;
        float dp2 = AndroidUtilities.dp(13.0f);
        Paint paint = this.f4689b;
        float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * f10) + dp) - strokeWidth);
        canvas.drawCircle(max, height, dp2, paint);
        eg.c2.x1(max, height, strokeWidth, this.d, canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
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
    }
}
