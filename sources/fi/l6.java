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
import org.telegram.ui.Components.wq;
public abstract class l6 extends FrameLayout {
    public ValueAnimator D;
    public float E;
    public final k6 f12328a;
    public final File f12329b;
    public long f12330c;
    public long d;
    public final Paint f12331e;
    public final Paint f12332f;
    public final h6 h;
    public di.b0 f12333n;
    public n f12334r;
    public float f12335s;
    public tg.r1 f12336w;
    public ValueAnimator f12337x;
    public boolean f12338y;

    public l6(Context context) {
        super(context);
        this.f12330c = -1L;
        this.d = -1L;
        this.f12331e = new Paint(1);
        Paint paint = new Paint(1);
        this.f12332f = paint;
        this.h = new h6(this, 0);
        this.f12335s = 1.0f;
        this.f12338y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f12329b = e7.x(p10.f24474s0, true);
        k6 k6Var = new k6(this, context);
        this.f12328a = k6Var;
        k6Var.setScaleX(0.0f);
        k6Var.setScaleY(0.0f);
        addView(k6Var);
        k6Var.setDelegate(new i6(this));
        k6Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z9) {
        n nVar = this.f12334r;
        if (nVar != null) {
            nVar.run();
            this.f12334r = null;
        }
        org.telegram.messenger.g0.r(this.h);
        this.f12328a.destroy(true, null);
        try {
            this.f12329b.delete();
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
        this.D.setInterpolator(wq.h);
        this.D.setDuration(280L);
        this.D.start();
    }

    public final long b() {
        if (this.f12330c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f12330c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        k6 k6Var = this.f12328a;
        rectF.set(((1.0f - k6Var.getScaleX()) * (k6Var.getWidth() / 2.0f)) + k6Var.getX(), ((1.0f - k6Var.getScaleY()) * (k6Var.getHeight() / 2.0f)) + k6Var.getY(), (k6Var.getX() + k6Var.getWidth()) - ((1.0f - k6Var.getScaleX()) * (k6Var.getWidth() / 2.0f)), (k6Var.getY() + k6Var.getHeight()) - ((1.0f - k6Var.getScaleY()) * (k6Var.getHeight() / 2.0f)));
        int r12 = org.telegram.ui.ActionBar.m6.r1(this.f12335s, 536870912);
        Paint paint = this.f12331e;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint.setAlpha((int) (this.f12335s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        tg.r1 r1Var = this.f12336w;
        if (r1Var != null && r1Var.getWidth() > 0 && this.f12336w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.f12336w.getWidth(), rectF.height() / this.f12336w.getHeight());
            float alpha = this.f12336w.getAlpha();
            this.f12336w.setDraw(true);
            this.f12336w.setAlpha(1.0f - this.f12335s);
            this.f12336w.draw(canvas);
            this.f12336w.setAlpha(alpha);
            this.f12336w.setDraw(false);
            canvas.restore();
        }
        if (this.f12330c > 0) {
            float i7 = Utilities.i(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f12332f;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.m6.r1(this.f12335s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.33f), org.telegram.ui.ActionBar.m6.r1(this.f12335s, 536870912));
            rectF.inset(-org.telegram.messenger.g0.L(7.665f), -org.telegram.messenger.g0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i7 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        k6 k6Var = this.f12328a;
        int measuredWidth = ((i11 - i7) - k6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(72.0f);
        k6Var.layout(measuredWidth, L, k6Var.getMeasuredWidth() + measuredWidth, k6Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f12328a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
