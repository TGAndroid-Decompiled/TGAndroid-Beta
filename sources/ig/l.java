package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
public final class l extends View {
    public final Paint f8354a;
    public final Paint f8355b;
    public float f8356c;
    public final u d;

    public l(u uVar, Context context) {
        super(context);
        this.d = uVar;
        this.f8354a = new Paint(1);
        Paint paint = new Paint(1);
        this.f8355b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
    }

    public final void a() {
        this.f8354a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, this.d.f8476m1}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f7) {
        float L = org.telegram.messenger.i0.L(6.0f);
        float a2 = w7.u.a(((f7 - L) + (org.telegram.messenger.i0.L(13.0f) - (this.f8355b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        this.f8356c = a2;
        u uVar = this.d;
        uVar.I0(i0.b.o(uVar.f8476m1, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = org.telegram.messenger.i0.L(6.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        float f7 = height - L;
        float f10 = height + L;
        rectF.set(L, f7, getWidth() - L, f10);
        canvas.save();
        u uVar = this.d;
        uVar.l1.rewind();
        uVar.l1.addRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), Path.Direction.CW);
        canvas.clipPath(uVar.l1);
        jg.n1.z1(canvas, rectF, org.telegram.messenger.i0.L(6.0f));
        canvas.restore();
        rectF.set(L, f7, getWidth() - L, f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), this.f8354a);
        float L2 = org.telegram.messenger.i0.L(13.0f);
        Paint paint = this.f8355b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * this.f8356c) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        jg.n1.A1(max, height, strokeWidth, i0.b.o(uVar.f8476m1, (int) (this.f8356c * 255.0f)), canvas);
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
