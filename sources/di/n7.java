package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.es;
public abstract class n7 extends FrameLayout {
    public float E;
    public final m7 f7462a;
    public final File f7463b;
    public long f7464c;
    public long d;
    public final Paint e;
    public final Paint f7465f;
    public final j7 h;
    public bi.j0 f7466n;
    public n f7467r;
    public float f7468s;
    public rg.d2 v;
    public ValueAnimator f7469w;
    public boolean f7470x;
    public ValueAnimator f7471y;

    public n7(Context context) {
        super(context);
        this.f7464c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f7465f = paint;
        this.h = new j7(this, 0);
        this.f7468s = 1.0f;
        this.f7470x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f7463b = k8.x(UserConfig.selectedAccount, true);
        m7 m7Var = new m7(this, context);
        this.f7462a = m7Var;
        m7Var.setScaleX(0.0f);
        m7Var.setScaleY(0.0f);
        addView(m7Var);
        m7Var.setDelegate(new k7(this));
        m7Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f7467r;
        if (nVar != null) {
            nVar.run();
            this.f7467r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f7462a.destroy(true, null);
        try {
            this.f7463b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f7471y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.f7471y = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 24));
        this.f7471y.addListener(new ah.b(this, 20));
        this.f7471y.setInterpolator(es.h);
        this.f7471y.setDuration(280L);
        this.f7471y.start();
    }

    public final long b() {
        if (this.f7464c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.f7464c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        m7 m7Var = this.f7462a;
        rectF.set(((1.0f - m7Var.getScaleX()) * (m7Var.getWidth() / 2.0f)) + m7Var.getX(), ((1.0f - m7Var.getScaleY()) * (m7Var.getHeight() / 2.0f)) + m7Var.getY(), (m7Var.getX() + m7Var.getWidth()) - ((1.0f - m7Var.getScaleX()) * (m7Var.getWidth() / 2.0f)), (m7Var.getY() + m7Var.getHeight()) - ((1.0f - m7Var.getScaleY()) * (m7Var.getHeight() / 2.0f)));
        int m12 = org.telegram.ui.ActionBar.g6.m1(this.f7468s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), m12);
        paint.setAlpha((int) (this.f7468s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        rg.d2 d2Var = this.v;
        if (d2Var != null && d2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f7468s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f7464c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f7465f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.g6.m1(this.f7468s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.g6.m1(this.f7468s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m7 m7Var = this.f7462a;
        int measuredWidth = ((i12 - i10) - m7Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        m7Var.layout(measuredWidth, dp, m7Var.getMeasuredWidth() + measuredWidth, m7Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f7462a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
