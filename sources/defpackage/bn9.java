package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.Utilities;
public abstract class bn9 extends FrameLayout {
    public ValueAnimator E;
    public float F;
    public final an9 a;
    public final File b;
    public long c;
    public long d;
    public final Paint e;
    public final Paint f;
    public final ym9 h;
    public qp0 n;
    public uc1 r;
    public float s;
    public ao9 w;
    public ValueAnimator x;
    public boolean y;

    public bn9(Context context) {
        super(context);
        this.c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new ym9(this, (byte) 0);
        this.s = 1.0f;
        this.y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.b = g6b.w(z8c.t0, "mp4");
        an9 an9Var = new an9(this, context);
        this.a = an9Var;
        an9Var.setScaleX(0.0f);
        an9Var.setScaleY(0.0f);
        addView(an9Var);
        an9Var.setDelegate(new zm9(this));
        an9Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z) {
        uc1 uc1Var = this.r;
        if (uc1Var != null) {
            uc1Var.run();
            this.r = null;
        }
        gm.r(this.h);
        this.a.destroy(true, null);
        try {
            this.b.delete();
        } catch (Exception unused) {
        }
        if (z) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new p29(this, (byte) 7));
        this.E.addListener(new c39(this, (byte) 3));
        this.E.setInterpolator(d53.h);
        this.E.setDuration(280L);
        this.E.start();
    }

    public final long b() {
        if (this.c < 0) {
            return 0L;
        }
        long j = this.d;
        if (j < 0) {
            j = System.currentTimeMillis();
        }
        return Math.min(59500L, j - this.c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = gm.P;
        an9 an9Var = this.a;
        rectF.set(((1.0f - an9Var.getScaleX()) * (an9Var.getWidth() / 2.0f)) + an9Var.getX(), ((1.0f - an9Var.getScaleY()) * (an9Var.getHeight() / 2.0f)) + an9Var.getY(), (an9Var.getX() + an9Var.getWidth()) - ((1.0f - an9Var.getScaleX()) * (an9Var.getWidth() / 2.0f)), (an9Var.getY() + an9Var.getHeight()) - ((1.0f - an9Var.getScaleY()) * (an9Var.getHeight() / 2.0f)));
        int p1 = cmb.p1(this.s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(gm.L(2.0f), 0.0f, gm.L(0.66f), p1);
        paint.setAlpha((int) (this.s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        ao9 ao9Var = this.w;
        if (ao9Var != null && ao9Var.getWidth() > 0 && this.w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.w.getWidth(), rectF.height() / this.w.getHeight());
            float alpha = this.w.getAlpha();
            this.w.setDraw(true);
            this.w.setAlpha(1.0f - this.s);
            this.w.draw(canvas);
            this.w.setAlpha(alpha);
            this.w.setDraw(false);
            canvas.restore();
        }
        if (this.c > 0) {
            float i = Utilities.i(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f;
            paint2.setStrokeWidth(gm.L(3.33f));
            paint2.setColor(cmb.p1(this.s, -1090519041));
            paint2.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(0.33f), cmb.p1(this.s, 536870912));
            rectF.inset(-gm.L(7.665f), -gm.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        an9 an9Var = this.a;
        int measuredWidth = ((i3 - i) - an9Var.getMeasuredWidth()) - gm.L(16.0f);
        int L = gm.L(72.0f);
        an9Var.layout(measuredWidth, L, an9Var.getMeasuredWidth() + measuredWidth, an9Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
