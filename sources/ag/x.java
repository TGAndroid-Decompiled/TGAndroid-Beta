package ag;

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
public final class x extends View {
    public final Paint f704a;
    public final Paint f705b;
    public final Paint f706c;
    public float d;
    public float f707e;
    public final Drawable f708f;
    public final float[] h;
    public final f0 f709n;

    public x(f0 f0Var, Context context) {
        super(context);
        this.f709n = f0Var;
        this.f704a = new Paint(1);
        this.f705b = new Paint(1);
        Paint paint = new Paint(1);
        this.f706c = paint;
        this.h = new float[3];
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.f708f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        float f9;
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y8 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.f707e = y8;
        float[] fArr = this.h;
        fArr[0] = y8 * 360.0f;
        float f10 = this.d;
        float f11 = 1.0f;
        int i10 = (f10 > 0.22f ? 1 : (f10 == 0.22f ? 0 : -1));
        if (i10 > 0 && f10 < 0.78f) {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        } else {
            if (i10 <= 0) {
                f9 = 1.0f - (f10 / 0.22f);
            } else {
                f9 = (f10 - 0.78f) / 0.22000003f;
            }
            fArr[1] = AndroidUtilities.lerp(1.0f, 0.0f, f9);
            float f12 = this.d;
            if (f12 > 0.22f) {
                f11 = AndroidUtilities.lerp(1.0f, 0.0f, (f12 - 0.78f) / 0.22000003f);
            }
            fArr[2] = f11;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        f0 f0Var = this.f709n;
        f0Var.f466f = HSVToColor;
        f0Var.m(HSVToColor, 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f704a);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f705b);
        float dp = AndroidUtilities.dp(13.0f);
        Paint paint = this.f706c;
        float dp2 = AndroidUtilities.dp(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f9 = width;
        float a2 = i7.w.a(this.d * f9, dp2, f9 - dp2) + getPaddingLeft();
        float f10 = height;
        float a10 = i7.w.a(this.f707e * f10, dp2, f10 - dp2) + getPaddingTop();
        Rect rect = AndroidUtilities.rectTmp2;
        Drawable drawable = this.f708f;
        drawable.getPadding(rect);
        int i10 = rect.bottom;
        drawable.setBounds((int) ((a2 - dp) - rect.left), (int) ((a10 - dp) - rect.top), (int) (a2 + dp + i10), (int) (a10 + dp + i10));
        drawable.draw(canvas);
        canvas.drawCircle(a2, a10, dp, paint);
        bg.h2.x1(a2, a10, dp - (paint.getStrokeWidth() / 2.0f), i0.a.k(this.f709n.f466f, 255), canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f704a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i11 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.f705b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i10 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
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
