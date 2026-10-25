package fi;

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
import org.telegram.ui.Components.ds;
public abstract class b7 extends FrameLayout {
    public float E;
    public final a7 f10566a;
    public final File f10567b;
    public long f10568c;
    public long d;
    public final Paint e;
    public final Paint f10569f;
    public final x6 h;
    public di.c0 f10570n;
    public n f10571r;
    public float f10572s;
    public sg.d2 v;
    public ValueAnimator f10573w;
    public boolean f10574x;
    public ValueAnimator f10575y;

    public b7(Context context) {
        super(context);
        this.f10568c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f10569f = paint;
        this.h = new x6(this, 0);
        this.f10572s = 1.0f;
        this.f10574x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f10567b = w7.x(UserConfig.selectedAccount, true);
        a7 a7Var = new a7(this, context);
        this.f10566a = a7Var;
        a7Var.setScaleX(0.0f);
        a7Var.setScaleY(0.0f);
        addView(a7Var);
        a7Var.setDelegate(new y6(this));
        a7Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.f10571r;
        if (nVar != null) {
            nVar.run();
            this.f10571r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f10566a.destroy(true, null);
        try {
            this.f10567b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f10575y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.f10575y = ofFloat;
        ofFloat.addUpdateListener(new e4(this, 3));
        this.f10575y.addListener(new bh.b(this, 23));
        this.f10575y.setInterpolator(ds.h);
        this.f10575y.setDuration(280L);
        this.f10575y.start();
    }

    public final long b() {
        if (this.f10568c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.f10568c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        a7 a7Var = this.f10566a;
        rectF.set(((1.0f - a7Var.getScaleX()) * (a7Var.getWidth() / 2.0f)) + a7Var.getX(), ((1.0f - a7Var.getScaleY()) * (a7Var.getHeight() / 2.0f)) + a7Var.getY(), (a7Var.getX() + a7Var.getWidth()) - ((1.0f - a7Var.getScaleX()) * (a7Var.getWidth() / 2.0f)), (a7Var.getY() + a7Var.getHeight()) - ((1.0f - a7Var.getScaleY()) * (a7Var.getHeight() / 2.0f)));
        int o12 = org.telegram.ui.ActionBar.y6.o1(this.f10572s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), o12);
        paint.setAlpha((int) (this.f10572s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        sg.d2 d2Var = this.v;
        if (d2Var != null && d2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f10572s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f10568c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f10569f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.y6.o1(this.f10572s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.y6.o1(this.f10572s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a7 a7Var = this.f10566a;
        int measuredWidth = ((i12 - i10) - a7Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        a7Var.layout(measuredWidth, dp, a7Var.getMeasuredWidth() + measuredWidth, a7Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f10566a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
