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
import org.telegram.ui.Components.pr;
public abstract class q7 extends FrameLayout {
    public float E;
    public final p7 f8002a;
    public final File f8003b;
    public long f8004c;
    public long d;
    public final Paint f8005e;
    public final Paint f8006f;
    public final m7 h;
    public bi.j0 f8007n;
    public n f8008r;
    public float f8009s;
    public rg.d2 v;
    public ValueAnimator f8010w;
    public boolean f8011x;
    public ValueAnimator f8012y;

    public q7(Context context) {
        super(context);
        this.f8004c = -1L;
        this.d = -1L;
        this.f8005e = new Paint(1);
        Paint paint = new Paint(1);
        this.f8006f = paint;
        this.h = new m7(this, 0);
        this.f8009s = 1.0f;
        this.f8011x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f8003b = o8.x(UserConfig.selectedAccount, true);
        p7 p7Var = new p7(this, context);
        this.f8002a = p7Var;
        p7Var.setScaleX(0.0f);
        p7Var.setScaleY(0.0f);
        addView(p7Var);
        p7Var.setDelegate(new n7(this));
        p7Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f8008r;
        if (nVar != null) {
            nVar.run();
            this.f8008r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f8002a.destroy(true, null);
        try {
            this.f8003b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f8012y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.f8012y = ofFloat;
        ofFloat.addUpdateListener(new ah.d0(this, 24));
        this.f8012y.addListener(new ah.b(this, 20));
        this.f8012y.setInterpolator(pr.h);
        this.f8012y.setDuration(280L);
        this.f8012y.start();
    }

    public final long b() {
        if (this.f8004c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f8004c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        p7 p7Var = this.f8002a;
        rectF.set(((1.0f - p7Var.getScaleX()) * (p7Var.getWidth() / 2.0f)) + p7Var.getX(), ((1.0f - p7Var.getScaleY()) * (p7Var.getHeight() / 2.0f)) + p7Var.getY(), (p7Var.getX() + p7Var.getWidth()) - ((1.0f - p7Var.getScaleX()) * (p7Var.getWidth() / 2.0f)), (p7Var.getY() + p7Var.getHeight()) - ((1.0f - p7Var.getScaleY()) * (p7Var.getHeight() / 2.0f)));
        int l1 = org.telegram.ui.ActionBar.j6.l1(this.f8009s, 536870912);
        Paint paint = this.f8005e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint.setAlpha((int) (this.f8009s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        rg.d2 d2Var = this.v;
        if (d2Var != null && d2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f8009s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f8004c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f8006f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f8009s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.j6.l1(this.f8009s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p7 p7Var = this.f8002a;
        int measuredWidth = ((i12 - i10) - p7Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        p7Var.layout(measuredWidth, dp, p7Var.getMeasuredWidth() + measuredWidth, p7Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f8002a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
