package kh;

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
import org.telegram.ui.Components.gr;
public abstract class e7 extends FrameLayout {
    public float A;
    public final d7 f15153a;
    public final File f15154b;
    public long f15155c;
    public long d;
    public final Paint f15156e;
    public final Paint f15157f;
    public final a7 h;
    public ih.b0 f15158n;
    public n f15159r;
    public float f15160s;
    public yf.b2 v;
    public ValueAnimator f15161w;
    public boolean f15162x;
    public ValueAnimator f15163y;

    public e7(Context context) {
        super(context);
        this.f15155c = -1L;
        this.d = -1L;
        this.f15156e = new Paint(1);
        Paint paint = new Paint(1);
        this.f15157f = paint;
        this.h = new a7(this, 0);
        this.f15160s = 1.0f;
        this.f15162x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f15154b = a8.x(UserConfig.selectedAccount, true);
        d7 d7Var = new d7(this, context);
        this.f15153a = d7Var;
        d7Var.setScaleX(0.0f);
        d7Var.setScaleY(0.0f);
        addView(d7Var);
        d7Var.setDelegate(new b7(this));
        d7Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f15159r;
        if (nVar != null) {
            nVar.run();
            this.f15159r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f15153a.destroy(true, null);
        try {
            this.f15154b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f15163y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, 1.0f);
        this.f15163y = ofFloat;
        ofFloat.addUpdateListener(new g4(this, 3));
        this.f15163y.addListener(new ag.e(this, 26));
        this.f15163y.setInterpolator(gr.h);
        this.f15163y.setDuration(280L);
        this.f15163y.start();
    }

    public final long b() {
        if (this.f15155c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.f15155c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        d7 d7Var = this.f15153a;
        rectF.set(((1.0f - d7Var.getScaleX()) * (d7Var.getWidth() / 2.0f)) + d7Var.getX(), ((1.0f - d7Var.getScaleY()) * (d7Var.getHeight() / 2.0f)) + d7Var.getY(), (d7Var.getX() + d7Var.getWidth()) - ((1.0f - d7Var.getScaleX()) * (d7Var.getWidth() / 2.0f)), (d7Var.getY() + d7Var.getHeight()) - ((1.0f - d7Var.getScaleY()) * (d7Var.getHeight() / 2.0f)));
        int l1 = org.telegram.ui.ActionBar.f6.l1(this.f15160s, 536870912);
        Paint paint = this.f15156e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint.setAlpha((int) (this.f15160s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        yf.b2 b2Var = this.v;
        if (b2Var != null && b2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f15160s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f15155c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f15157f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.f6.l1(this.f15160s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.f6.l1(this.f15160s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        d7 d7Var = this.f15153a;
        int measuredWidth = ((i11 - i9) - d7Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        d7Var.layout(measuredWidth, dp, d7Var.getMeasuredWidth() + measuredWidth, d7Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f15153a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
