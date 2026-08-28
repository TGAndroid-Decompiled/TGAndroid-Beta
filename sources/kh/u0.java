package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
public final class u0 extends View {
    public boolean A;
    public final org.telegram.ui.Components.y5 B;
    public boolean C;
    public float D;
    public final org.telegram.ui.Components.y5 E;
    public final org.telegram.ui.Components.y5 F;
    public final RectF G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public boolean K;
    public t0 L;
    public Runnable M;
    public final Paint f16119a;
    public final TextPaint f16120b;
    public final TextPaint f16121c;
    public final Paint d;
    public final Paint f16122e;
    public final Paint f16123f;
    public final org.telegram.ui.Components.pc h;
    public mi0 f16124n;
    public final StaticLayout f16125r;
    public final float f16126s;
    public final float v;
    public StaticLayout f16127w;
    public float f16128x;
    public float f16129y;

    public u0(Context context) {
        this(context, LocaleController.getString(R.string.PreparingVideo));
    }

    public final void a() {
        t0 t0Var = this.L;
        if (t0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t0Var);
            this.L = null;
        }
        this.A = false;
        invalidate();
    }

    public final void b(int i9, int i10, CharSequence charSequence) {
        float f10;
        mi0 mi0Var = this.f16124n;
        if (mi0Var != null) {
            mi0Var.setCallback(null);
            this.f16124n.A(true);
        }
        mi0 mi0Var2 = new mi0(i9, AndroidUtilities.dp(36.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(36.0f));
        this.f16124n = mi0Var2;
        mi0Var2.setCallback(this);
        this.f16124n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f16121c, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f16127w = staticLayout;
        float f11 = 0.0f;
        if (staticLayout.getLineCount() > 0) {
            f10 = this.f16127w.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.f16128x = f10;
        if (this.f16127w.getLineCount() > 0) {
            f11 = this.f16127w.getLineLeft(0);
        }
        this.f16129y = f11;
        this.C = false;
        invalidate();
        t0 t0Var = this.L;
        if (t0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t0Var);
        }
        t0 t0Var2 = new t0(this, 1);
        this.L = t0Var2;
        AndroidUtilities.runOnUIThread(t0Var2, i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int saveCount = canvas.getSaveCount();
        if (this.A) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.B.d(f10, false);
        if (this.C) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float d9 = this.E.d(f11, false);
        float f14 = 1.0f - d9;
        Paint paint = this.f16119a;
        paint.setAlpha((int) (90.0f * f14 * d));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.f16126s, AndroidUtilities.dp(54.0f)) + AndroidUtilities.dp(42.0f);
        int dp = AndroidUtilities.dp(111.0f);
        StaticLayout staticLayout = this.f16125r;
        float height = staticLayout.getHeight() + dp;
        RectF rectF2 = this.G;
        rectF2.set((getWidth() - max) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + height) / 2.0f);
        float dp2 = AndroidUtilities.dp(74.0f) + this.f16128x;
        float dp3 = AndroidUtilities.dp(48.0f);
        RectF rectF3 = this.H;
        rectF3.set((getWidth() - dp2) / 2.0f, (getHeight() - dp3) / 2.0f, (getWidth() + dp2) / 2.0f, (getHeight() + dp3) / 2.0f);
        RectF rectF4 = this.I;
        AndroidUtilities.lerp(rectF2, rectF3, d9, rectF4);
        int i9 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i9 < 0 && this.C) {
            f12 = 42.0f;
            RectF rectF5 = this.J;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            AndroidUtilities.lerp(rectF5, rectF4, d, rectF4);
        } else {
            f12 = 42.0f;
        }
        if (i9 < 0 && !this.C) {
            canvas2.scale(AndroidUtilities.lerp(0.8f, 1.0f, d), AndroidUtilities.lerp(0.8f, 1.0f, d), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * d));
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (d9 < 1.0f) {
            float f15 = f14 * d;
            float d10 = this.F.d(this.D, false);
            float centerX = rectF2.centerX();
            float dp4 = rectF2.top + AndroidUtilities.dp(48.0f);
            float dp5 = AndroidUtilities.dp(25.0f);
            Paint paint3 = this.f16123f;
            paint3.setAlpha((int) (51.0f * f15));
            canvas2.drawCircle(centerX, dp4, dp5, paint3);
            RectF rectF6 = AndroidUtilities.rectTmp;
            f13 = 255.0f;
            rectF6.set(centerX - dp5, dp4 - dp5, centerX + dp5, dp5 + dp4);
            int i10 = (int) (f15 * 255.0f);
            Paint paint4 = this.f16122e;
            paint4.setAlpha(i10);
            paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * d10, false, paint4);
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
            this.f16120b.setAlpha(i10);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f13 = 255.0f;
        }
        if (d9 > 0.0f) {
            float f16 = d9 * d;
            mi0 mi0Var = this.f16124n;
            if (mi0Var != null) {
                mi0Var.setAlpha((int) (f16 * f13));
                this.f16124n.setBounds((int) (rectF.left + AndroidUtilities.dp(9.0f)), (int) (rectF.top + AndroidUtilities.dp(6.0f)), (int) (rectF.left + AndroidUtilities.dp(45.0f)), (int) (rectF.top + AndroidUtilities.dp(f12)));
                this.f16124n.draw(canvas2);
            }
            if (this.f16127w != null) {
                canvas2.save();
                canvas2.translate((rectF.left + AndroidUtilities.dp(52.0f)) - this.f16129y, rectF.centerY() - (this.f16127w.getHeight() / 2.0f));
                this.f16121c.setAlpha((int) (f16 * f13));
                this.f16127w.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (d <= 0.0f && !this.A && !this.K) {
            this.K = true;
            post(new t0(this, 0));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.pc pcVar = this.h;
        if (action == 0 && (this.C || contains)) {
            pcVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (pcVar.h) {
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
                pcVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            pcVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.M = runnable;
    }

    public void setProgress(float f10) {
        this.D = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f16124n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public u0(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f16119a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f16120b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f16121c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f16122e = paint3;
        Paint paint4 = new Paint(1);
        this.f16123f = paint4;
        this.h = new org.telegram.ui.Components.pc(this);
        this.A = false;
        this.B = new org.telegram.ui.Components.y5(0.0f, this, 0L, 350L, gr.h);
        this.C = true;
        this.D = 0.0f;
        this.E = new org.telegram.ui.Components.y5(this);
        this.F = new org.telegram.ui.Components.y5(this);
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
        this.f16125r = staticLayout;
        this.f16126s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.v = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.A = true;
        invalidate();
    }
}
