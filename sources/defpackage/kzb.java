package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class kzb extends FrameLayout implements tjb {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final rzb d;

    public kzb(rzb rzbVar, Context context) {
        super(context);
        this.d = rzbVar;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(bkb.v0(bkb.g5, rzbVar.J0));
        bkb.m(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int v;
        rzb rzbVar = this.d;
        boolean z2 = true;
        float F0 = rzbVar.F0(true);
        float U1 = gl.U1(moe.a(F0 / gl.N(24.0f), 0.0f, 1.0f), 0, gl.L(12.0f));
        rzbVar.w1.setTranslationY(Math.max(gl.m, F0));
        if (F0 <= gl.m / 2.0f) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            this.c = Boolean.valueOf(z);
            Window window = rzbVar.getWindow();
            if (z) {
                v = bkb.v0(bkb.g5, rzbVar.J0);
            } else {
                v = bkb.v(bkb.v0(bkb.r8, rzbVar.J0), 855638016);
            }
            if (gl.B(v) <= 0.721f) {
                z2 = false;
            }
            gl.n3(window, z2);
        }
        FrameLayout frameLayout = rzbVar.F;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - rzbVar.F.getHeight());
        int i = gl.m;
        frameLayout.setTranslationY(Math.max(rzbVar.F.getHeight() + gl.L(56.0f) + i, F0) + translationY);
        Path path = this.a;
        path.rewind();
        RectF rectF = gl.P;
        rectF.set(0.0f, F0, getWidth(), getHeight() + U1);
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rzb rzbVar = this.d;
        qib qibVar = rzbVar.J1;
        fib fibVar = rzbVar.I1;
        if (fibVar != null && qibVar != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + fibVar.w());
            }
            if (fibVar.w() && qibVar.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b = qibVar.b(motionEvent);
            if (motionEvent.getAction() == 1) {
                Log.d("TA2", "checkOnTap=" + b);
            }
            if (b) {
                motionEvent.setAction(3);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new oy((byte) 16));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        rzb rzbVar = this.d;
        FrameLayout frameLayout = rzbVar.F;
        frameLayout.setTranslationY(Math.max(rzbVar.F.getHeight() + gl.L(56.0f) + gl.m, rzbVar.F0(true)) + ((-frameLayout.getTop()) - rzbVar.F.getHeight()) + f);
    }

    @Override
    public final void updateColors() {
        try {
            this.b.setColor(bkb.v0(bkb.g5, this.d.J0));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
