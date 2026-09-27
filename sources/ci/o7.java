package ci;

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
import org.telegram.ui.Components.sr;
public abstract class o7 extends FrameLayout {
    public float E;
    public final n7 f5253a;
    public final File f5254b;
    public long f5255c;
    public long d;
    public final Paint e;
    public final Paint f5256f;
    public final k7 h;
    public ai.q0 f5257n;
    public n f5258r;
    public float f5259s;
    public qg.b2 v;
    public ValueAnimator f5260w;
    public boolean f5261x;
    public ValueAnimator f5262y;

    public o7(Context context) {
        super(context);
        this.f5255c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f5256f = paint;
        this.h = new k7(this, 0);
        this.f5259s = 1.0f;
        this.f5261x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f5254b = k8.x(UserConfig.selectedAccount, true);
        n7 n7Var = new n7(this, context);
        this.f5253a = n7Var;
        n7Var.setScaleX(0.0f);
        n7Var.setScaleY(0.0f);
        addView(n7Var);
        n7Var.setDelegate(new l7(this));
        n7Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f5258r;
        if (nVar != null) {
            nVar.run();
            this.f5258r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f5253a.destroy(true, null);
        try {
            this.f5254b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f5262y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.f5262y = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 23));
        this.f5262y.addListener(new ai.b(this, 17));
        this.f5262y.setInterpolator(sr.h);
        this.f5262y.setDuration(280L);
        this.f5262y.start();
    }

    public final long b() {
        if (this.f5255c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f5255c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        n7 n7Var = this.f5253a;
        rectF.set(((1.0f - n7Var.getScaleX()) * (n7Var.getWidth() / 2.0f)) + n7Var.getX(), ((1.0f - n7Var.getScaleY()) * (n7Var.getHeight() / 2.0f)) + n7Var.getY(), (n7Var.getX() + n7Var.getWidth()) - ((1.0f - n7Var.getScaleX()) * (n7Var.getWidth() / 2.0f)), (n7Var.getY() + n7Var.getHeight()) - ((1.0f - n7Var.getScaleY()) * (n7Var.getHeight() / 2.0f)));
        int l1 = org.telegram.ui.ActionBar.i6.l1(this.f5259s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint.setAlpha((int) (this.f5259s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        qg.b2 b2Var = this.v;
        if (b2Var != null && b2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f5259s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f5255c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f5256f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.i6.l1(this.f5259s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.i6.l1(this.f5259s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n7 n7Var = this.f5253a;
        int measuredWidth = ((i12 - i10) - n7Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        n7Var.layout(measuredWidth, dp, n7Var.getMeasuredWidth() + measuredWidth, n7Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f5253a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
