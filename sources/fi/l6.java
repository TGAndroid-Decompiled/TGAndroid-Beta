package fi;

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
import org.telegram.messenger.p10;
import org.telegram.ui.Components.xq;
public abstract class l6 extends FrameLayout {
    public ValueAnimator D;
    public float E;
    public final k6 f12326a;
    public final File f12327b;
    public long f12328c;
    public long d;
    public final Paint f12329e;
    public final Paint f12330f;
    public final h6 h;
    public di.b0 f12331n;
    public n f12332r;
    public float f12333s;
    public tg.r1 f12334w;
    public ValueAnimator f12335x;
    public boolean f12336y;

    public l6(Context context) {
        super(context);
        this.f12328c = -1L;
        this.d = -1L;
        this.f12329e = new Paint(1);
        Paint paint = new Paint(1);
        this.f12330f = paint;
        this.h = new h6(this, 0);
        this.f12333s = 1.0f;
        this.f12336y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f12327b = e7.x(p10.f24459s0, true);
        k6 k6Var = new k6(this, context);
        this.f12326a = k6Var;
        k6Var.setScaleX(0.0f);
        k6Var.setScaleY(0.0f);
        addView(k6Var);
        k6Var.setDelegate(new i6(this));
        k6Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z9) {
        n nVar = this.f12332r;
        if (nVar != null) {
            nVar.run();
            this.f12332r = null;
        }
        org.telegram.messenger.g0.r(this.h);
        this.f12326a.destroy(true, null);
        try {
            this.f12327b.delete();
        } catch (Exception unused) {
        }
        if (z9) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 3));
        this.D.addListener(new bi.t5(this, 23));
        this.D.setInterpolator(xq.h);
        this.D.setDuration(280L);
        this.D.start();
    }

    public final long b() {
        if (this.f12328c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f12328c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        k6 k6Var = this.f12326a;
        rectF.set(((1.0f - k6Var.getScaleX()) * (k6Var.getWidth() / 2.0f)) + k6Var.getX(), ((1.0f - k6Var.getScaleY()) * (k6Var.getHeight() / 2.0f)) + k6Var.getY(), (k6Var.getX() + k6Var.getWidth()) - ((1.0f - k6Var.getScaleX()) * (k6Var.getWidth() / 2.0f)), (k6Var.getY() + k6Var.getHeight()) - ((1.0f - k6Var.getScaleY()) * (k6Var.getHeight() / 2.0f)));
        int r12 = org.telegram.ui.ActionBar.k6.r1(this.f12333s, 536870912);
        Paint paint = this.f12329e;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint.setAlpha((int) (this.f12333s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        tg.r1 r1Var = this.f12334w;
        if (r1Var != null && r1Var.getWidth() > 0 && this.f12334w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.f12334w.getWidth(), rectF.height() / this.f12334w.getHeight());
            float alpha = this.f12334w.getAlpha();
            this.f12334w.setDraw(true);
            this.f12334w.setAlpha(1.0f - this.f12333s);
            this.f12334w.draw(canvas);
            this.f12334w.setAlpha(alpha);
            this.f12334w.setDraw(false);
            canvas.restore();
        }
        if (this.f12328c > 0) {
            float i7 = Utilities.i(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f12330f;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.k6.r1(this.f12333s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.33f), org.telegram.ui.ActionBar.k6.r1(this.f12333s, 536870912));
            rectF.inset(-org.telegram.messenger.g0.L(7.665f), -org.telegram.messenger.g0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i7 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        k6 k6Var = this.f12326a;
        int measuredWidth = ((i11 - i7) - k6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(72.0f);
        k6Var.layout(measuredWidth, L, k6Var.getMeasuredWidth() + measuredWidth, k6Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f12326a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
