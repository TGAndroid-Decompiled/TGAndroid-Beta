package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class rk7 extends FrameLayout {
    public final mm a;
    public final Paint b;
    public final Path c;
    public float d;
    public final tk7 e;

    public rk7(tk7 tk7Var, Context context) {
        super(context);
        this.e = tk7Var;
        this.a = new mm(250L, this, k43.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(aob.v0(aob.h5, tk7Var.J0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v0;
        float f;
        tk7 tk7Var = this.e;
        Integer num = tk7Var.p1;
        if (num != null) {
            v0 = num.intValue();
        } else {
            v0 = aob.v0(aob.h5, tk7Var.J0);
        }
        Paint paint = this.b;
        paint.setColor(v0);
        View[] viewPages = tk7Var.l1.getViewPages();
        float f2 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f3 = this.d;
                if (view instanceof sk7) {
                    sk7 sk7Var = (sk7) view;
                    f = Math.max(0.0f, sk7Var.getHeight() - sk7Var.a.getMeasuredHeight());
                } else {
                    f = 0.0f;
                }
                this.d = (f * i) + f3;
                view.getVisibility();
            }
        }
        if (this.d <= hl.m) {
            f2 = 1.0f;
        }
        float e = this.a.e(false, f2);
        float max = Math.max(hl.m, this.d) - (hl.m * e);
        this.d = max;
        RectF rectF = hl.P;
        rectF.set(tk7Var.u0, max, getWidth() - tk7Var.u0, hl.L(8.0f) + getHeight());
        float U1 = hl.U1(e, hl.L(14.0f), 0);
        canvas.drawRoundRect(rectF, U1, U1, paint);
        if (tk7Var.F != null) {
            tk7Var.F.setTranslationY(Math.max((tk7Var.b.getY() + this.d) + tk7Var.t0, tk7Var.F.getHeight() + (hl.L(56.0f) + hl.m)) - tk7Var.F.getBottom());
        }
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        tk7 tk7Var = this.e;
        FrameLayout frameLayout = tk7Var.o1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            i3 = tk7Var.o1.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        tk7Var.l1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i3), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
