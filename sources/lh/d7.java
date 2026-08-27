package lh;

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
import org.telegram.ui.Components.er;

public abstract class d7 extends FrameLayout {
    public float A;

    public final c7 f15860a;

    public final File f15861b;

    public long f15862c;
    public long d;

    public final Paint f15863e;

    public final Paint f15864f;
    public final z6 h;

    public jh.z f15865n;

    public n f15866r;

    public float f15867s;
    public zf.c2 v;

    public ValueAnimator f15868w;

    public boolean f15869x;

    public ValueAnimator f15870y;

    public d7(Context context) {
        super(context);
        this.f15862c = -1L;
        this.d = -1L;
        this.f15863e = new Paint(1);
        Paint paint = new Paint(1);
        this.f15864f = paint;
        this.h = new z6(this, 0);
        this.f15867s = 1.0f;
        this.f15869x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f15861b = z7.x(UserConfig.selectedAccount, true);
        c7 c7Var = new c7(this, context);
        this.f15860a = c7Var;
        c7Var.setScaleX(0.0f);
        c7Var.setScaleY(0.0f);
        addView(c7Var);
        c7Var.setDelegate(new a7(this));
        c7Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f15866r;
        if (nVar != null) {
            nVar.run();
            this.f15866r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f15860a.destroy(true, null);
        try {
            this.f15861b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f15870y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.A, 1.0f);
        this.f15870y = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new m2(this, 6));
        this.f15870y.addListener(new ag.r1(this, 28));
        this.f15870y.setInterpolator(er.h);
        this.f15870y.setDuration(280L);
        this.f15870y.start();
    }

    public final long b() {
        if (this.f15862c < 0) {
            return 0L;
        }
        long jCurrentTimeMillis = this.d;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        return Math.min(59500L, jCurrentTimeMillis - this.f15862c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        c7 c7Var = this.f15860a;
        rectF.set(((1.0f - c7Var.getScaleX()) * (c7Var.getWidth() / 2.0f)) + c7Var.getX(), ((1.0f - c7Var.getScaleY()) * (c7Var.getHeight() / 2.0f)) + c7Var.getY(), (c7Var.getX() + c7Var.getWidth()) - ((1.0f - c7Var.getScaleX()) * (c7Var.getWidth() / 2.0f)), (c7Var.getY() + c7Var.getHeight()) - ((1.0f - c7Var.getScaleY()) * (c7Var.getHeight() / 2.0f)));
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(0.66f);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(this.f15867s, 536870912);
        Paint paint = this.f15863e;
        paint.setShadowLayer(fDp, 0.0f, fDp2, iL1);
        paint.setAlpha((int) (this.f15867s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        zf.c2 c2Var = this.v;
        if (c2Var != null && c2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f15867s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f15862c > 0) {
            float fClamp = Utilities.clamp(b() / 59500.0f, 1.0f, 0.0f);
            float fDp3 = AndroidUtilities.dp(3.33f);
            Paint paint2 = this.f15864f;
            paint2.setStrokeWidth(fDp3);
            paint2.setColor(org.telegram.ui.ActionBar.g6.l1(this.f15867s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.g6.l1(this.f15867s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, fClamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c7 c7Var = this.f15860a;
        int measuredWidth = ((i12 - i10) - c7Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int iDp = AndroidUtilities.dp(72.0f);
        c7Var.layout(measuredWidth, iDp, c7Var.getMeasuredWidth() + measuredWidth, c7Var.getMeasuredHeight() + iDp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int iMin = (int) (Math.min(size, size2) * 0.43f);
        this.f15860a.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
