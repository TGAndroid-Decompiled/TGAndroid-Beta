package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
public final class o extends View {
    public final Paint f8375a;
    public final Paint f8376b;
    public int f8377c;
    public int d;
    public final u e;

    public o(u uVar, Context context) {
        super(context);
        this.e = uVar;
        this.f8375a = new Paint(1);
        Paint paint = new Paint(1);
        this.f8376b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
    }

    public final void a() {
        int argb;
        int argb2;
        int i10 = this.f8377c;
        u uVar = this.e;
        if (i10 != 1) {
            if (i10 != 2) {
                argb = Color.argb(255, 0, Color.green(uVar.f8477m1), Color.blue(uVar.f8477m1));
                argb2 = Color.argb(255, 255, Color.green(uVar.f8477m1), Color.blue(uVar.f8477m1));
            } else {
                argb = Color.argb(255, Color.red(uVar.f8477m1), Color.green(uVar.f8477m1), 0);
                argb2 = Color.argb(255, Color.red(uVar.f8477m1), Color.green(uVar.f8477m1), 255);
            }
        } else {
            argb = Color.argb(255, Color.red(uVar.f8477m1), 0, Color.blue(uVar.f8477m1));
            argb2 = Color.argb(255, Color.red(uVar.f8477m1), 255, Color.blue(uVar.f8477m1));
        }
        this.f8375a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f7) {
        int argb;
        float L = org.telegram.messenger.i0.L(6.0f);
        float a2 = w7.u.a(((f7 - L) + (org.telegram.messenger.i0.L(13.0f) - (this.f8376b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        int i10 = this.f8377c;
        u uVar = this.e;
        if (i10 != 1) {
            if (i10 != 2) {
                argb = Color.argb(255, (int) (a2 * 255.0f), Color.green(uVar.f8477m1), Color.blue(uVar.f8477m1));
            } else {
                argb = Color.argb(255, Color.red(uVar.f8477m1), Color.green(uVar.f8477m1), (int) (a2 * 255.0f));
            }
        } else {
            argb = Color.argb(255, Color.red(uVar.f8477m1), (int) (a2 * 255.0f), Color.blue(uVar.f8477m1));
        }
        uVar.I0(i0.b.o(argb, Color.alpha(uVar.f8477m1)), 4);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int green;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = org.telegram.messenger.i0.L(6.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(L, height - L, getWidth() - L, height + L);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), this.f8375a);
        int i10 = this.f8377c;
        u uVar = this.e;
        if (i10 != 1) {
            if (i10 != 2) {
                green = Color.red(uVar.f8477m1);
            } else {
                green = Color.blue(uVar.f8477m1);
            }
        } else {
            green = Color.green(uVar.f8477m1);
        }
        float f7 = green / 255.0f;
        float L2 = org.telegram.messenger.i0.L(13.0f);
        Paint paint = this.f8376b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * f7) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        jg.n1.A1(max, height, strokeWidth, this.d, canvas);
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
