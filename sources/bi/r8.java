package bi;

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
import org.telegram.ui.Components.wr;
public abstract class r8 extends FrameLayout {
    public float E;
    public final q8 f3549a;
    public final File f3550b;
    public long f3551c;
    public long d;
    public final Paint e;
    public final Paint f3552f;
    public final n8 h;
    public od f3553n;
    public p f3554r;
    public float f3555s;
    public pg.b2 v;
    public ValueAnimator f3556w;
    public boolean f3557x;
    public ValueAnimator f3558y;

    public r8(Context context) {
        super(context);
        this.f3551c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f3552f = paint;
        this.h = new n8(this, 0);
        this.f3555s = 1.0f;
        this.f3557x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f3550b = r9.x(UserConfig.selectedAccount, true);
        q8 q8Var = new q8(this, context);
        this.f3549a = q8Var;
        q8Var.setScaleX(0.0f);
        q8Var.setScaleY(0.0f);
        addView(q8Var);
        q8Var.setDelegate(new o8(this));
        q8Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        p pVar = this.f3554r;
        if (pVar != null) {
            pVar.run();
            this.f3554r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f3549a.destroy(true, null);
        try {
            this.f3550b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f3558y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.f3558y = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 9));
        this.f3558y.addListener(new h(this, 6));
        this.f3558y.setInterpolator(wr.h);
        this.f3558y.setDuration(280L);
        this.f3558y.start();
    }

    public final long b() {
        if (this.f3551c < 0) {
            return 0L;
        }
        long j3 = this.d;
        if (j3 < 0) {
            j3 = System.currentTimeMillis();
        }
        return Math.min(59500L, j3 - this.f3551c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        q8 q8Var = this.f3549a;
        rectF.set(((1.0f - q8Var.getScaleX()) * (q8Var.getWidth() / 2.0f)) + q8Var.getX(), ((1.0f - q8Var.getScaleY()) * (q8Var.getHeight() / 2.0f)) + q8Var.getY(), (q8Var.getX() + q8Var.getWidth()) - ((1.0f - q8Var.getScaleX()) * (q8Var.getWidth() / 2.0f)), (q8Var.getY() + q8Var.getHeight()) - ((1.0f - q8Var.getScaleY()) * (q8Var.getHeight() / 2.0f)));
        int l1 = org.telegram.ui.ActionBar.j6.l1(this.f3555s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint.setAlpha((int) (this.f3555s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        pg.b2 b2Var = this.v;
        if (b2Var != null && b2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f3555s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f3551c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f3552f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f3555s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.j6.l1(this.f3555s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        q8 q8Var = this.f3549a;
        int measuredWidth = ((i12 - i10) - q8Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        q8Var.layout(measuredWidth, dp, q8Var.getMeasuredWidth() + measuredWidth, q8Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f3549a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
