package ig;

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
public final class p extends View {
    public final Paint f8384a;
    public final Paint f8385b;
    public final Paint f8386c;
    public float d;
    public float e;
    public final Drawable f8387f;
    public final float[] h;
    public final u f8388n;

    public p(u uVar, Context context) {
        super(context);
        this.f8388n = uVar;
        this.f8384a = new Paint(1);
        this.f8385b = new Paint(1);
        Paint paint = new Paint(1);
        this.f8386c = paint;
        this.h = new float[3];
        setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        this.f8387f = context.getDrawable(2131231600);
    }

    public final void a(MotionEvent motionEvent) {
        float f7;
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y3 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.e = y3;
        float[] fArr = this.h;
        fArr[0] = y3 * 360.0f;
        float f10 = this.d;
        int i10 = (f10 > 0.22f ? 1 : (f10 == 0.22f ? 0 : -1));
        float f11 = 1.0f;
        if (i10 > 0 && f10 < 0.78f) {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        } else {
            if (i10 <= 0) {
                f7 = 1.0f - (f10 / 0.22f);
            } else {
                f7 = (f10 - 0.78f) / 0.22000003f;
            }
            fArr[1] = org.telegram.messenger.i0.T1(1.0f, 0.0f, f7);
            float f12 = this.d;
            if (f12 > 0.22f) {
                f11 = org.telegram.messenger.i0.T1(1.0f, 0.0f, (f12 - 0.78f) / 0.22000003f);
            }
            fArr[2] = f11;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        u uVar = this.f8388n;
        uVar.f8476m1 = HSVToColor;
        uVar.I0(HSVToColor, 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.f8384a);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.f8385b);
        float L = org.telegram.messenger.i0.L(13.0f);
        Paint paint = this.f8386c;
        float L2 = org.telegram.messenger.i0.L(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f7 = width;
        float a2 = w7.u.a(this.d * f7, L2, f7 - L2) + getPaddingLeft();
        float f10 = height;
        float a10 = w7.u.a(this.e * f10, L2, f10 - L2) + getPaddingTop();
        Rect rect = org.telegram.messenger.i0.Q;
        Drawable drawable = this.f8387f;
        drawable.getPadding(rect);
        int i10 = rect.bottom;
        drawable.setBounds((int) ((a2 - L) - rect.left), (int) ((a10 - L) - rect.top), (int) (a2 + L + i10), (int) (a10 + L + i10));
        drawable.draw(canvas);
        canvas.drawCircle(a2, a10, L, paint);
        jg.n1.A1(a2, a10, L - (paint.getStrokeWidth() / 2.0f), i0.b.o(this.f8388n.f8476m1, 255), canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f8384a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i11 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.f8385b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i10 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
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
