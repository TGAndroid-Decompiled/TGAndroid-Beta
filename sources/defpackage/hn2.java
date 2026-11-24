package defpackage;

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
public final class hn2 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public final Drawable f;
    public final float[] h;
    public final ln2 n;

    public hn2(ln2 ln2Var, Context context) {
        super(context);
        this.n = ln2Var;
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.h = new float[3];
        setPadding(gm.L(14.0f), gm.L(3.0f), gm.L(14.0f), gm.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gm.L(3.0f));
        this.f = context.getDrawable(2131231604);
    }

    public final void a(MotionEvent motionEvent) {
        float f;
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.e = y;
        float[] fArr = this.h;
        fArr[0] = y * 360.0f;
        float f2 = this.d;
        float f3 = 1.0f;
        if (f2 > 0.22f) {
            if (f2 >= 0.78f) {
                f = (f2 - 0.78f) / 0.22000003f;
            } else {
                fArr[1] = 1.0f;
                fArr[2] = 1.0f;
                int HSVToColor = Color.HSVToColor(fArr);
                ln2 ln2Var = this.n;
                ln2Var.p1 = HSVToColor;
                ln2Var.D0(HSVToColor, 0);
                invalidate();
            }
        } else {
            f = 1.0f - (f2 / 0.22f);
        }
        fArr[1] = gm.R1(1.0f, 0.0f, f);
        float f4 = this.d;
        if (f4 > 0.22f) {
            f3 = gm.R1(1.0f, 0.0f, (f4 - 0.78f) / 0.22000003f);
        }
        fArr[2] = f3;
        int HSVToColor2 = Color.HSVToColor(fArr);
        ln2 ln2Var2 = this.n;
        ln2Var2.p1 = HSVToColor2;
        ln2Var2.D0(HSVToColor2, 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = gm.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), this.a);
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), this.b);
        float L = gm.L(13.0f);
        Paint paint = this.c;
        float L2 = gm.L(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f = width;
        float a = pqe.a(this.d * f, L2, f - L2) + getPaddingLeft();
        float f2 = height;
        float a2 = pqe.a(this.e * f2, L2, f2 - L2) + getPaddingTop();
        Rect rect = gm.Q;
        Drawable drawable = this.f;
        drawable.getPadding(rect);
        float f3 = rect.bottom;
        drawable.setBounds((int) ((a - L) - rect.left), (int) ((a2 - L) - rect.top), (int) (a + L + f3), (int) (a2 + L + f3));
        drawable.draw(canvas);
        canvas.drawCircle(a, a2, L, paint);
        bu7.A1(a, a2, L - (paint.getStrokeWidth() / 2.0f), on2.p(this.n.p1, 255), canvas);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i2 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
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
