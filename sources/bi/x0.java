package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.wr;
public final class x0 extends View {
    public boolean E;
    public final org.telegram.ui.Components.d6 F;
    public boolean G;
    public float H;
    public final org.telegram.ui.Components.d6 I;
    public final org.telegram.ui.Components.d6 J;
    public final RectF K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public boolean O;
    public w0 P;
    public Runnable Q;
    public final Paint f3855a;
    public final TextPaint f3856b;
    public final TextPaint f3857c;
    public final Paint d;
    public final Paint e;
    public final Paint f3858f;
    public final org.telegram.ui.Components.xc h;
    public hj0 f3859n;
    public final StaticLayout f3860r;
    public final float f3861s;
    public final float v;
    public StaticLayout f3862w;
    public float f3863x;
    public float f3864y;

    public x0(Context context) {
        this(context, LocaleController.getString(R.string.PreparingVideo));
    }

    public final void a() {
        w0 w0Var = this.P;
        if (w0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w0Var);
            this.P = null;
        }
        this.E = false;
        invalidate();
    }

    public final void b(int i10, int i11, CharSequence charSequence) {
        float f7;
        hj0 hj0Var = this.f3859n;
        if (hj0Var != null) {
            hj0Var.setCallback(null);
            this.f3859n.C(true);
        }
        hj0 hj0Var2 = new hj0(i10, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        this.f3859n = hj0Var2;
        hj0Var2.setCallback(this);
        this.f3859n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f3857c, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3862w = staticLayout;
        float f10 = 0.0f;
        if (staticLayout.getLineCount() > 0) {
            f7 = this.f3862w.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f3863x = f7;
        if (this.f3862w.getLineCount() > 0) {
            f10 = this.f3862w.getLineLeft(0);
        }
        this.f3864y = f10;
        this.G = false;
        invalidate();
        w0 w0Var = this.P;
        if (w0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w0Var);
        }
        w0 w0Var2 = new w0(this, 1);
        this.P = w0Var2;
        AndroidUtilities.runOnUIThread(w0Var2, i11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int saveCount = canvas.getSaveCount();
        if (this.E) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.F.d(f7, false);
        if (this.G) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float d10 = this.I.d(f10, false);
        float f13 = 1.0f - d10;
        Paint paint = this.f3855a;
        paint.setAlpha((int) (90.0f * f13 * d));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.f3861s, AndroidUtilities.dp(54.0f)) + AndroidUtilities.dp(42.0f);
        int dp = AndroidUtilities.dp(111.0f);
        StaticLayout staticLayout = this.f3860r;
        float height = staticLayout.getHeight() + dp;
        RectF rectF2 = this.K;
        rectF2.set((getWidth() - max) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + height) / 2.0f);
        float dp2 = AndroidUtilities.dp(74.0f) + this.f3863x;
        float dp3 = AndroidUtilities.dp(48.0f);
        RectF rectF3 = this.L;
        rectF3.set((getWidth() - dp2) / 2.0f, (getHeight() - dp3) / 2.0f, (getWidth() + dp2) / 2.0f, (getHeight() + dp3) / 2.0f);
        RectF rectF4 = this.M;
        AndroidUtilities.lerp(rectF2, rectF3, d10, rectF4);
        int i10 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i10 < 0 && this.G) {
            f11 = 42.0f;
            RectF rectF5 = this.N;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            AndroidUtilities.lerp(rectF5, rectF4, d, rectF4);
        } else {
            f11 = 42.0f;
        }
        if (i10 < 0 && !this.G) {
            canvas2.scale(AndroidUtilities.lerp(0.8f, 1.0f, d), AndroidUtilities.lerp(0.8f, 1.0f, d), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * d));
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (d10 < 1.0f) {
            float f14 = f13 * d;
            float d11 = this.J.d(this.H, false);
            float centerX = rectF2.centerX();
            float dp4 = rectF2.top + AndroidUtilities.dp(48.0f);
            float dp5 = AndroidUtilities.dp(25.0f);
            Paint paint3 = this.f3858f;
            paint3.setAlpha((int) (51.0f * f14));
            canvas2.drawCircle(centerX, dp4, dp5, paint3);
            RectF rectF6 = AndroidUtilities.rectTmp;
            f12 = 255.0f;
            rectF6.set(centerX - dp5, dp4 - dp5, centerX + dp5, dp5 + dp4);
            int i11 = (int) (f14 * 255.0f);
            Paint paint4 = this.e;
            paint4.setAlpha(i11);
            paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * d11, false, paint4);
            float a2 = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a2, a2, centerX, dp4);
            paint4.setStrokeWidth(AndroidUtilities.dp(3.4f));
            canvas.drawLine(centerX - AndroidUtilities.dp(7.0f), dp4 - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f) + centerX, AndroidUtilities.dp(7.0f) + dp4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - AndroidUtilities.dp(7.0f), dp4 + AndroidUtilities.dp(7.0f), centerX + AndroidUtilities.dp(7.0f), dp4 - AndroidUtilities.dp(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(21.0f)) - this.v, (rectF2.bottom - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight());
            this.f3856b.setAlpha(i11);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f12 = 255.0f;
        }
        if (d10 > 0.0f) {
            float f15 = d10 * d;
            hj0 hj0Var = this.f3859n;
            if (hj0Var != null) {
                hj0Var.setAlpha((int) (f15 * f12));
                this.f3859n.setBounds((int) (rectF.left + AndroidUtilities.dp(9.0f)), (int) (rectF.top + AndroidUtilities.dp(6.0f)), (int) (rectF.left + AndroidUtilities.dp(45.0f)), (int) (rectF.top + AndroidUtilities.dp(f11)));
                this.f3859n.draw(canvas2);
            }
            if (this.f3862w != null) {
                canvas2.save();
                canvas2.translate((rectF.left + AndroidUtilities.dp(52.0f)) - this.f3864y, rectF.centerY() - (this.f3862w.getHeight() / 2.0f));
                this.f3857c.setAlpha((int) (f15 * f12));
                this.f3862w.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (d <= 0.0f && !this.E && !this.O) {
            this.O = true;
            post(new w0(this, 0));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.M.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.xc xcVar = this.h;
        if (action == 0 && (this.G || contains)) {
            xcVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (xcVar.h) {
                if (contains) {
                    if (this.G) {
                        Runnable runnable = this.Q;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                xcVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            xcVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.Q = runnable;
    }

    public void setProgress(float f7) {
        this.H = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f3859n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public x0(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f3855a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f3856b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f3857c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        Paint paint4 = new Paint(1);
        this.f3858f = paint4;
        this.h = new org.telegram.ui.Components.xc(this);
        this.E = false;
        this.F = new org.telegram.ui.Components.d6(0.0f, this, 0L, 350L, wr.h);
        this.G = true;
        this.H = 0.0f;
        this.I = new org.telegram.ui.Components.d6(this);
        this.J = new org.telegram.ui.Components.d6(this);
        this.K = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        paint.setColor(1509949440);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        paint2.setColor(-869783512);
        paint3.setColor(-1);
        paint4.setColor(872415231);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dpf2(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f3860r = staticLayout;
        this.f3861s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.v = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.E = true;
        invalidate();
    }
}
