package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
public final class dn2 extends View {
    public final Paint a;
    public final Paint b;
    public float c;
    public final ln2 d;

    public dn2(ln2 ln2Var, Context context) {
        super(context);
        this.d = ln2Var;
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gm.L(3.0f));
    }

    public final void a() {
        this.a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, this.d.p1}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f) {
        float L = gm.L(6.0f);
        float a = pqe.a(((f - L) + (gm.L(13.0f) - (this.b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        this.c = a;
        ln2 ln2Var = this.d;
        ln2Var.D0(on2.p(ln2Var.p1, (int) (a * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = gm.L(6.0f);
        RectF rectF = gm.P;
        float f = height - L;
        float f2 = height + L;
        rectF.set(L, f, getWidth() - L, f2);
        canvas.save();
        ln2 ln2Var = this.d;
        Path path = ln2Var.o1;
        path.rewind();
        path.addRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), Path.Direction.CW);
        canvas.clipPath(path);
        bu7.z1(canvas, rectF, gm.L(6.0f));
        canvas.restore();
        rectF.set(L, f, getWidth() - L, f2);
        canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), this.a);
        float L2 = gm.L(13.0f);
        Paint paint = this.b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * this.c) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        bu7.A1(max, height, strokeWidth, on2.p(ln2Var.p1, (int) (this.c * 255.0f)), canvas);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
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
