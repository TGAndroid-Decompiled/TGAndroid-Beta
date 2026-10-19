package ei;

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
import org.telegram.ui.Components.bs;
public abstract class e7 extends FrameLayout {
    public float E;
    public final d7 f8961a;
    public final File f8962b;
    public long f8963c;
    public long d;
    public final Paint e;
    public final Paint f8964f;
    public final a7 h;
    public ci.c0 f8965n;
    public n f8966r;
    public float f8967s;
    public rg.c2 v;
    public ValueAnimator f8968w;
    public boolean f8969x;
    public ValueAnimator f8970y;

    public e7(Context context) {
        super(context);
        this.f8963c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f8964f = paint;
        this.h = new a7(this, 0);
        this.f8967s = 1.0f;
        this.f8969x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f8962b = a8.x(UserConfig.selectedAccount, true);
        d7 d7Var = new d7(this, context);
        this.f8961a = d7Var;
        d7Var.setScaleX(0.0f);
        d7Var.setScaleY(0.0f);
        addView(d7Var);
        d7Var.setDelegate(new b7(this));
        d7Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f8966r;
        if (nVar != null) {
            nVar.run();
            this.f8966r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f8961a.destroy(true, null);
        try {
            this.f8962b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f8970y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.f8970y = ofFloat;
        ofFloat.addUpdateListener(new i6(this, 1));
        this.f8970y.addListener(new ah.b(this, 22));
        this.f8970y.setInterpolator(bs.h);
        this.f8970y.setDuration(280L);
        this.f8970y.start();
    }

    public final long b() {
        if (this.f8963c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.f8963c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        d7 d7Var = this.f8961a;
        rectF.set(((1.0f - d7Var.getScaleX()) * (d7Var.getWidth() / 2.0f)) + d7Var.getX(), ((1.0f - d7Var.getScaleY()) * (d7Var.getHeight() / 2.0f)) + d7Var.getY(), (d7Var.getX() + d7Var.getWidth()) - ((1.0f - d7Var.getScaleX()) * (d7Var.getWidth() / 2.0f)), (d7Var.getY() + d7Var.getHeight()) - ((1.0f - d7Var.getScaleY()) * (d7Var.getHeight() / 2.0f)));
        int m12 = org.telegram.ui.ActionBar.h6.m1(this.f8967s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), m12);
        paint.setAlpha((int) (this.f8967s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        rg.c2 c2Var = this.v;
        if (c2Var != null && c2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f8967s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f8963c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f8964f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.h6.m1(this.f8967s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.h6.m1(this.f8967s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        d7 d7Var = this.f8961a;
        int measuredWidth = ((i12 - i10) - d7Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        d7Var.layout(measuredWidth, dp, d7Var.getMeasuredWidth() + measuredWidth, d7Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f8961a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
