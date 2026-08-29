package nh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xi0;
public final class t0 extends View {
    public boolean A;
    public final org.telegram.ui.Components.d6 B;
    public boolean C;
    public float D;
    public final org.telegram.ui.Components.d6 E;
    public final org.telegram.ui.Components.d6 F;
    public final RectF G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public boolean K;
    public s0 L;
    public Runnable M;
    public final Paint f18568a;
    public final TextPaint f18569b;
    public final TextPaint f18570c;
    public final Paint d;
    public final Paint f18571e;
    public final Paint f18572f;
    public final uc h;
    public xi0 f18573n;
    public final StaticLayout f18574r;
    public final float f18575s;
    public final float v;
    public StaticLayout f18576w;
    public float f18577x;
    public float f18578y;

    public t0(Context context) {
        this(context, LocaleController.getString(R.string.PreparingVideo));
    }

    public final void a() {
        s0 s0Var = this.L;
        if (s0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(s0Var);
            this.L = null;
        }
        this.A = false;
        invalidate();
    }

    public final void b(int i10, int i11, CharSequence charSequence) {
        float f9;
        xi0 xi0Var = this.f18573n;
        if (xi0Var != null) {
            xi0Var.setCallback(null);
            this.f18573n.A(true);
        }
        xi0 xi0Var2 = new xi0(i10, AndroidUtilities.dp(36.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(36.0f));
        this.f18573n = xi0Var2;
        xi0Var2.setCallback(this);
        this.f18573n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f18570c, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f18576w = staticLayout;
        float f10 = 0.0f;
        if (staticLayout.getLineCount() > 0) {
            f9 = this.f18576w.getLineWidth(0);
        } else {
            f9 = 0.0f;
        }
        this.f18577x = f9;
        if (this.f18576w.getLineCount() > 0) {
            f10 = this.f18576w.getLineLeft(0);
        }
        this.f18578y = f10;
        this.C = false;
        invalidate();
        s0 s0Var = this.L;
        if (s0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(s0Var);
        }
        s0 s0Var2 = new s0(this, 1);
        this.L = s0Var2;
        AndroidUtilities.runOnUIThread(s0Var2, i11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int saveCount = canvas.getSaveCount();
        if (this.A) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = this.B.d(f9, false);
        if (this.C) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float d10 = this.E.d(f10, false);
        float f13 = 1.0f - d10;
        Paint paint = this.f18568a;
        paint.setAlpha((int) (90.0f * f13 * d));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.f18575s, AndroidUtilities.dp(54.0f)) + AndroidUtilities.dp(42.0f);
        int dp = AndroidUtilities.dp(111.0f);
        StaticLayout staticLayout = this.f18574r;
        float height = staticLayout.getHeight() + dp;
        RectF rectF2 = this.G;
        rectF2.set((getWidth() - max) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + height) / 2.0f);
        float dp2 = AndroidUtilities.dp(74.0f) + this.f18577x;
        float dp3 = AndroidUtilities.dp(48.0f);
        RectF rectF3 = this.H;
        rectF3.set((getWidth() - dp2) / 2.0f, (getHeight() - dp3) / 2.0f, (getWidth() + dp2) / 2.0f, (getHeight() + dp3) / 2.0f);
        RectF rectF4 = this.I;
        AndroidUtilities.lerp(rectF2, rectF3, d10, rectF4);
        int i10 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i10 < 0 && this.C) {
            f11 = 42.0f;
            RectF rectF5 = this.J;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            AndroidUtilities.lerp(rectF5, rectF4, d, rectF4);
        } else {
            f11 = 42.0f;
        }
        if (i10 < 0 && !this.C) {
            canvas2.scale(AndroidUtilities.lerp(0.8f, 1.0f, d), AndroidUtilities.lerp(0.8f, 1.0f, d), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * d));
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (d10 < 1.0f) {
            float f14 = f13 * d;
            float d11 = this.F.d(this.D, false);
            float centerX = rectF2.centerX();
            float dp4 = rectF2.top + AndroidUtilities.dp(48.0f);
            float dp5 = AndroidUtilities.dp(25.0f);
            Paint paint3 = this.f18572f;
            paint3.setAlpha((int) (51.0f * f14));
            canvas2.drawCircle(centerX, dp4, dp5, paint3);
            RectF rectF6 = AndroidUtilities.rectTmp;
            f12 = 255.0f;
            rectF6.set(centerX - dp5, dp4 - dp5, centerX + dp5, dp5 + dp4);
            int i11 = (int) (f14 * 255.0f);
            Paint paint4 = this.f18571e;
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
            this.f18569b.setAlpha(i11);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f12 = 255.0f;
        }
        if (d10 > 0.0f) {
            float f15 = d10 * d;
            xi0 xi0Var = this.f18573n;
            if (xi0Var != null) {
                xi0Var.setAlpha((int) (f15 * f12));
                this.f18573n.setBounds((int) (rectF.left + AndroidUtilities.dp(9.0f)), (int) (rectF.top + AndroidUtilities.dp(6.0f)), (int) (rectF.left + AndroidUtilities.dp(45.0f)), (int) (rectF.top + AndroidUtilities.dp(f11)));
                this.f18573n.draw(canvas2);
            }
            if (this.f18576w != null) {
                canvas2.save();
                canvas2.translate((rectF.left + AndroidUtilities.dp(52.0f)) - this.f18578y, rectF.centerY() - (this.f18576w.getHeight() / 2.0f));
                this.f18570c.setAlpha((int) (f15 * f12));
                this.f18576w.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (d <= 0.0f && !this.A && !this.K) {
            this.K = true;
            post(new s0(this, 0));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        uc ucVar = this.h;
        if (action == 0 && (this.C || contains)) {
            ucVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (ucVar.h) {
                if (contains) {
                    if (this.C) {
                        Runnable runnable = this.M;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                ucVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.M = runnable;
    }

    public void setProgress(float f9) {
        this.D = f9;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f18573n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public t0(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f18568a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f18569b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f18570c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f18571e = paint3;
        Paint paint4 = new Paint(1);
        this.f18572f = paint4;
        this.h = new uc(this);
        this.A = false;
        this.B = new org.telegram.ui.Components.d6(0.0f, this, 0L, 350L, jr.h);
        this.C = true;
        this.D = 0.0f;
        this.E = new org.telegram.ui.Components.d6(this);
        this.F = new org.telegram.ui.Components.d6(this);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
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
        this.f18574r = staticLayout;
        this.f18575s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.v = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.A = true;
        invalidate();
    }
}
