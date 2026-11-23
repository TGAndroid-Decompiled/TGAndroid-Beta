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
import org.telegram.messenger.i10;
import org.telegram.ui.Components.kr;
public abstract class s6 extends FrameLayout {
    public ValueAnimator E;
    public float F;
    public final r6 f15386a;
    public final File f15387b;
    public long f15388c;
    public long d;
    public final Paint f15389e;
    public final Paint f15390f;
    public final o6 h;
    public fi.b0 f15391n;
    public o f15392r;
    public float f15393s;
    public tg.w1 f15394w;
    public ValueAnimator f15395x;
    public boolean f15396y;

    public s6(Context context) {
        super(context);
        this.f15388c = -1L;
        this.d = -1L;
        this.f15389e = new Paint(1);
        Paint paint = new Paint(1);
        this.f15390f = paint;
        this.h = new o6(this, 0);
        this.f15393s = 1.0f;
        this.f15396y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f15387b = x7.x(i10.f24637t0, true);
        r6 r6Var = new r6(this, context);
        this.f15386a = r6Var;
        r6Var.setScaleX(0.0f);
        r6Var.setScaleY(0.0f);
        addView(r6Var);
        r6Var.setDelegate(new p6(this));
        r6Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        o oVar = this.f15392r;
        if (oVar != null) {
            oVar.run();
            this.f15392r = null;
        }
        org.telegram.messenger.g0.r(this.h);
        this.f15386a.destroy(true, null);
        try {
            this.f15387b.delete();
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
        ofFloat.addUpdateListener(new s3(this, 4));
        this.E.addListener(new ai.g0(this, 25));
        this.E.setInterpolator(kr.h);
        this.E.setDuration(280L);
        this.E.start();
    }

    public final long b() {
        if (this.f15388c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f15388c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        r6 r6Var = this.f15386a;
        rectF.set(((1.0f - r6Var.getScaleX()) * (r6Var.getWidth() / 2.0f)) + r6Var.getX(), ((1.0f - r6Var.getScaleY()) * (r6Var.getHeight() / 2.0f)) + r6Var.getY(), (r6Var.getX() + r6Var.getWidth()) - ((1.0f - r6Var.getScaleX()) * (r6Var.getWidth() / 2.0f)), (r6Var.getY() + r6Var.getHeight()) - ((1.0f - r6Var.getScaleY()) * (r6Var.getHeight() / 2.0f)));
        int r12 = org.telegram.ui.ActionBar.n6.r1(this.f15393s, 536870912);
        Paint paint = this.f15389e;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint.setAlpha((int) (this.f15393s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        tg.w1 w1Var = this.f15394w;
        if (w1Var != null && w1Var.getWidth() > 0 && this.f15394w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.f15394w.getWidth(), rectF.height() / this.f15394w.getHeight());
            float alpha = this.f15394w.getAlpha();
            this.f15394w.setDraw(true);
            this.f15394w.setAlpha(1.0f - this.f15393s);
            this.f15394w.draw(canvas);
            this.f15394w.setAlpha(alpha);
            this.f15394w.setDraw(false);
            canvas.restore();
        }
        if (this.f15388c > 0) {
            float i7 = Utilities.i(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f15390f;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.n6.r1(this.f15393s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.33f), org.telegram.ui.ActionBar.n6.r1(this.f15393s, 536870912));
            rectF.inset(-org.telegram.messenger.g0.L(7.665f), -org.telegram.messenger.g0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i7 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        r6 r6Var = this.f15386a;
        int measuredWidth = ((i11 - i7) - r6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(72.0f);
        r6Var.layout(measuredWidth, L, r6Var.getMeasuredWidth() + measuredWidth, r6Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f15386a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
