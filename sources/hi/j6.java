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
import org.telegram.ui.Components.lr;
public abstract class j6 extends FrameLayout {
    public ValueAnimator E;
    public float F;
    public final i6 f14810a;
    public final File f14811b;
    public long f14812c;
    public long d;
    public final Paint f14813e;
    public final Paint f14814f;
    public final f6 h;
    public fi.b0 f14815n;
    public o f14816r;
    public float f14817s;
    public tg.r1 f14818w;
    public ValueAnimator f14819x;
    public boolean f14820y;

    public j6(Context context) {
        super(context);
        this.f14812c = -1L;
        this.d = -1L;
        this.f14813e = new Paint(1);
        Paint paint = new Paint(1);
        this.f14814f = paint;
        this.h = new f6(this, 0);
        this.f14817s = 1.0f;
        this.f14820y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f14811b = d7.x(j10.f24770t0, true);
        i6 i6Var = new i6(this, context);
        this.f14810a = i6Var;
        i6Var.setScaleX(0.0f);
        i6Var.setScaleY(0.0f);
        addView(i6Var);
        i6Var.setDelegate(new g6(this));
        i6Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        o oVar = this.f14816r;
        if (oVar != null) {
            oVar.run();
            this.f14816r = null;
        }
        org.telegram.messenger.g0.r(this.h);
        this.f14810a.destroy(true, null);
        try {
            this.f14811b.delete();
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
        ofFloat.addUpdateListener(new k3(this, 4));
        this.E.addListener(new ai.j0(this, 25));
        this.E.setInterpolator(lr.h);
        this.E.setDuration(280L);
        this.E.start();
    }

    public final long b() {
        if (this.f14812c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f14812c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        i6 i6Var = this.f14810a;
        rectF.set(((1.0f - i6Var.getScaleX()) * (i6Var.getWidth() / 2.0f)) + i6Var.getX(), ((1.0f - i6Var.getScaleY()) * (i6Var.getHeight() / 2.0f)) + i6Var.getY(), (i6Var.getX() + i6Var.getWidth()) - ((1.0f - i6Var.getScaleX()) * (i6Var.getWidth() / 2.0f)), (i6Var.getY() + i6Var.getHeight()) - ((1.0f - i6Var.getScaleY()) * (i6Var.getHeight() / 2.0f)));
        int r12 = org.telegram.ui.ActionBar.n6.r1(this.f14817s, 536870912);
        Paint paint = this.f14813e;
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint.setAlpha((int) (this.f14817s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        tg.r1 r1Var = this.f14818w;
        if (r1Var != null && r1Var.getWidth() > 0 && this.f14818w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.f14818w.getWidth(), rectF.height() / this.f14818w.getHeight());
            float alpha = this.f14818w.getAlpha();
            this.f14818w.setDraw(true);
            this.f14818w.setAlpha(1.0f - this.f14817s);
            this.f14818w.draw(canvas);
            this.f14818w.setAlpha(alpha);
            this.f14818w.setDraw(false);
            canvas.restore();
        }
        if (this.f14812c > 0) {
            float i7 = Utilities.i(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f14814f;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.n6.r1(this.f14817s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.33f), org.telegram.ui.ActionBar.n6.r1(this.f14817s, 536870912));
            rectF.inset(-org.telegram.messenger.g0.L(7.665f), -org.telegram.messenger.g0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i7 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        i6 i6Var = this.f14810a;
        int measuredWidth = ((i11 - i7) - i6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(72.0f);
        i6Var.layout(measuredWidth, L, i6Var.getMeasuredWidth() + measuredWidth, i6Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f14810a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
