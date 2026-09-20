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
import org.telegram.ui.Components.qr;
public abstract class q7 extends FrameLayout {
    public float E;
    public final p7 f5350a;
    public final File f5351b;
    public long f5352c;
    public long d;
    public final Paint e;
    public final Paint f5353f;
    public final m7 h;
    public ai.q0 f5354n;
    public n f5355r;
    public float f5356s;
    public qg.c2 v;
    public ValueAnimator f5357w;
    public boolean f5358x;
    public ValueAnimator f5359y;

    public q7(Context context) {
        super(context);
        this.f5352c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f5353f = paint;
        this.h = new m7(this, 0);
        this.f5356s = 1.0f;
        this.f5358x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f5351b = o8.x(UserConfig.selectedAccount, true);
        p7 p7Var = new p7(this, context);
        this.f5350a = p7Var;
        p7Var.setScaleX(0.0f);
        p7Var.setScaleY(0.0f);
        addView(p7Var);
        p7Var.setDelegate(new n7(this));
        p7Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f5355r;
        if (nVar != null) {
            nVar.run();
            this.f5355r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f5350a.destroy(true, null);
        try {
            this.f5351b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f5359y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.f5359y = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 23));
        this.f5359y.addListener(new ai.b(this, 17));
        this.f5359y.setInterpolator(qr.h);
        this.f5359y.setDuration(280L);
        this.f5359y.start();
    }

    public final long b() {
        if (this.f5352c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f5352c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        p7 p7Var = this.f5350a;
        rectF.set(((1.0f - p7Var.getScaleX()) * (p7Var.getWidth() / 2.0f)) + p7Var.getX(), ((1.0f - p7Var.getScaleY()) * (p7Var.getHeight() / 2.0f)) + p7Var.getY(), (p7Var.getX() + p7Var.getWidth()) - ((1.0f - p7Var.getScaleX()) * (p7Var.getWidth() / 2.0f)), (p7Var.getY() + p7Var.getHeight()) - ((1.0f - p7Var.getScaleY()) * (p7Var.getHeight() / 2.0f)));
        int l1 = org.telegram.ui.ActionBar.j6.l1(this.f5356s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint.setAlpha((int) (this.f5356s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        qg.c2 c2Var = this.v;
        if (c2Var != null && c2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f5356s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f5352c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f5353f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f5356s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.j6.l1(this.f5356s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p7 p7Var = this.f5350a;
        int measuredWidth = ((i12 - i10) - p7Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        p7Var.layout(measuredWidth, dp, p7Var.getMeasuredWidth() + measuredWidth, p7Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f5350a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
