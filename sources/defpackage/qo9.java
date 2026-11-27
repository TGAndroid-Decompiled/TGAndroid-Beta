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
public abstract class qo9 extends FrameLayout {
    public ValueAnimator E;
    public float F;
    public final oo9 a;
    public final File b;
    public long c;
    public long d;
    public final Paint e;
    public final Paint f;
    public final mo9 h;
    public qo0 n;
    public vb1 r;
    public float s;
    public pp9 w;
    public ValueAnimator x;
    public boolean y;

    public qo9(Context context) {
        super(context);
        this.c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new mo9(this, (byte) 0);
        this.s = 1.0f;
        this.y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.b = c8b.w(yac.t0, "mp4");
        oo9 oo9Var = new oo9(this, context);
        this.a = oo9Var;
        oo9Var.setScaleX(0.0f);
        oo9Var.setScaleY(0.0f);
        addView(oo9Var);
        oo9Var.setDelegate(new no9(this));
        oo9Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z) {
        vb1 vb1Var = this.r;
        if (vb1Var != null) {
            vb1Var.run();
            this.r = null;
        }
        hl.r(this.h);
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
        ofFloat.addUpdateListener(new b49(this, (byte) 7));
        this.E.addListener(new po9(this, (byte) 0));
        this.E.setInterpolator(k43.h);
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
        RectF rectF = hl.P;
        oo9 oo9Var = this.a;
        rectF.set(((1.0f - oo9Var.getScaleX()) * (oo9Var.getWidth() / 2.0f)) + oo9Var.getX(), ((1.0f - oo9Var.getScaleY()) * (oo9Var.getHeight() / 2.0f)) + oo9Var.getY(), (oo9Var.getX() + oo9Var.getWidth()) - ((1.0f - oo9Var.getScaleX()) * (oo9Var.getWidth() / 2.0f)), (oo9Var.getY() + oo9Var.getHeight()) - ((1.0f - oo9Var.getScaleY()) * (oo9Var.getHeight() / 2.0f)));
        int p1 = aob.p1(this.s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(hl.L(2.0f), 0.0f, hl.L(0.66f), p1);
        paint.setAlpha((int) (this.s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        pp9 pp9Var = this.w;
        if (pp9Var != null && pp9Var.getWidth() > 0 && this.w.getHeight() > 0) {
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
            paint2.setStrokeWidth(hl.L(3.33f));
            paint2.setColor(aob.p1(this.s, -1090519041));
            paint2.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(0.33f), aob.p1(this.s, 536870912));
            rectF.inset(-hl.L(7.665f), -hl.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo9 oo9Var = this.a;
        int measuredWidth = ((i3 - i) - oo9Var.getMeasuredWidth()) - hl.L(16.0f);
        int L = hl.L(72.0f);
        oo9Var.layout(measuredWidth, L, oo9Var.getMeasuredWidth() + measuredWidth, oo9Var.getMeasuredHeight() + L);
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
