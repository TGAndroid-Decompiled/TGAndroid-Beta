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
import org.telegram.messenger.m10;
import org.telegram.ui.Components.er;
public abstract class k6 extends FrameLayout {
    public ValueAnimator E;
    public float F;
    public final j6 f14504a;
    public final File f14505b;
    public long f14506c;
    public long d;
    public final Paint f14507e;
    public final Paint f14508f;
    public final g6 h;
    public fi.b0 f14509n;
    public n f14510r;
    public float f14511s;
    public tg.r1 f14512w;
    public ValueAnimator f14513x;
    public boolean f14514y;

    public k6(Context context) {
        super(context);
        this.f14506c = -1L;
        this.d = -1L;
        this.f14507e = new Paint(1);
        Paint paint = new Paint(1);
        this.f14508f = paint;
        this.h = new g6(this, 0);
        this.f14511s = 1.0f;
        this.f14514y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f14505b = d7.x(m10.f24940t0, true);
        j6 j6Var = new j6(this, context);
        this.f14504a = j6Var;
        j6Var.setScaleX(0.0f);
        j6Var.setScaleY(0.0f);
        addView(j6Var);
        j6Var.setDelegate(new h6(this));
        j6Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f14510r;
        if (nVar != null) {
            nVar.run();
            this.f14510r = null;
        }
        org.telegram.messenger.g0.r(this.h);
        this.f14504a.destroy(true, null);
        try {
            this.f14505b.delete();
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
        this.E.addListener(new ai.j0(this, 25));
        this.E.setInterpolator(er.h);
        this.E.setDuration(280L);
        this.E.start();
    }

    public final long b() {
        if (this.f14506c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f14506c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        j6 j6Var = this.f14504a;
        rectF.set(((1.0f - j6Var.getScaleX()) * (j6Var.getWidth() / 2.0f)) + j6Var.getX(), ((1.0f - j6Var.getScaleY()) * (j6Var.getHeight() / 2.0f)) + j6Var.getY(), (j6Var.getX() + j6Var.getWidth()) - ((1.0f - j6Var.getScaleX()) * (j6Var.getWidth() / 2.0f)), (j6Var.getY() + j6Var.getHeight()) - ((1.0f - j6Var.getScaleY()) * (j6Var.getHeight() / 2.0f)));
        int r12 = org.telegram.ui.ActionBar.j6.r1(this.f14511s, 536870912);
        Paint paint = this.f14507e;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint.setAlpha((int) (this.f14511s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        tg.r1 r1Var = this.f14512w;
        if (r1Var != null && r1Var.getWidth() > 0 && this.f14512w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.f14512w.getWidth(), rectF.height() / this.f14512w.getHeight());
            float alpha = this.f14512w.getAlpha();
            this.f14512w.setDraw(true);
            this.f14512w.setAlpha(1.0f - this.f14511s);
            this.f14512w.draw(canvas);
            this.f14512w.setAlpha(alpha);
            this.f14512w.setDraw(false);
            canvas.restore();
        }
        if (this.f14506c > 0) {
            float i7 = Utilities.i(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f14508f;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.r1(this.f14511s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.33f), org.telegram.ui.ActionBar.j6.r1(this.f14511s, 536870912));
            rectF.inset(-org.telegram.messenger.g0.L(7.665f), -org.telegram.messenger.g0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i7 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        j6 j6Var = this.f14504a;
        int measuredWidth = ((i11 - i7) - j6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(72.0f);
        j6Var.layout(measuredWidth, L, j6Var.getMeasuredWidth() + measuredWidth, j6Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f14504a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
