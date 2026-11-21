package hi;

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
import org.telegram.messenger.j10;
import org.telegram.ui.Components.nr;
public abstract class i6 extends FrameLayout {
    public ValueAnimator E;
    public float F;
    public final h6 f14788a;
    public final File f14789b;
    public long f14790c;
    public long d;
    public final Paint f14791e;
    public final Paint f14792f;
    public final e6 h;
    public fi.b0 f14793n;
    public p f14794r;
    public float f14795s;
    public tg.t1 f14796w;
    public ValueAnimator f14797x;
    public boolean f14798y;

    public i6(Context context) {
        super(context);
        this.f14790c = -1L;
        this.d = -1L;
        this.f14791e = new Paint(1);
        Paint paint = new Paint(1);
        this.f14792f = paint;
        this.h = new e6(this, 0);
        this.f14795s = 1.0f;
        this.f14798y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f14789b = c7.x(j10.f24798t0, true);
        h6 h6Var = new h6(this, context);
        this.f14788a = h6Var;
        h6Var.setScaleX(0.0f);
        h6Var.setScaleY(0.0f);
        addView(h6Var);
        h6Var.setDelegate(new f6(this));
        h6Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        p pVar = this.f14794r;
        if (pVar != null) {
            pVar.run();
            this.f14794r = null;
        }
        org.telegram.messenger.g0.r(this.h);
        this.f14788a.destroy(true, null);
        try {
            this.f14789b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
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
        ofFloat.addUpdateListener(new j3(this, 4));
        this.E.addListener(new ai.k0(this, 25));
        this.E.setInterpolator(nr.h);
        this.E.setDuration(280L);
        this.E.start();
    }

    public final long b() {
        if (this.f14790c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f14790c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        h6 h6Var = this.f14788a;
        rectF.set(((1.0f - h6Var.getScaleX()) * (h6Var.getWidth() / 2.0f)) + h6Var.getX(), ((1.0f - h6Var.getScaleY()) * (h6Var.getHeight() / 2.0f)) + h6Var.getY(), (h6Var.getX() + h6Var.getWidth()) - ((1.0f - h6Var.getScaleX()) * (h6Var.getWidth() / 2.0f)), (h6Var.getY() + h6Var.getHeight()) - ((1.0f - h6Var.getScaleY()) * (h6Var.getHeight() / 2.0f)));
        int r12 = org.telegram.ui.ActionBar.m6.r1(this.f14795s, 536870912);
        Paint paint = this.f14791e;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint.setAlpha((int) (this.f14795s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        tg.t1 t1Var = this.f14796w;
        if (t1Var != null && t1Var.getWidth() > 0 && this.f14796w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.f14796w.getWidth(), rectF.height() / this.f14796w.getHeight());
            float alpha = this.f14796w.getAlpha();
            this.f14796w.setDraw(true);
            this.f14796w.setAlpha(1.0f - this.f14795s);
            this.f14796w.draw(canvas);
            this.f14796w.setAlpha(alpha);
            this.f14796w.setDraw(false);
            canvas.restore();
        }
        if (this.f14790c > 0) {
            float i7 = Utilities.i(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f14792f;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.m6.r1(this.f14795s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.33f), org.telegram.ui.ActionBar.m6.r1(this.f14795s, 536870912));
            rectF.inset(-org.telegram.messenger.g0.L(7.665f), -org.telegram.messenger.g0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i7 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        h6 h6Var = this.f14788a;
        int measuredWidth = ((i11 - i7) - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(72.0f);
        h6Var.layout(measuredWidth, L, h6Var.getMeasuredWidth() + measuredWidth, h6Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f14788a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
