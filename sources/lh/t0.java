package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;

public final class t0 extends View {
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
    public s0 L;
    public Runnable M;

    public final Paint f16831a;

    public final TextPaint f16832b;

    public final TextPaint f16833c;
    public final Paint d;

    public final Paint f16834e;

    public final Paint f16835f;
    public final org.telegram.ui.Components.nc h;

    public oi0 f16836n;

    public final StaticLayout f16837r;

    public final float f16838s;
    public final float v;

    public StaticLayout f16839w;

    public float f16840x;

    public float f16841y;

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
        oi0 oi0Var = this.f16836n;
        if (oi0Var != null) {
            oi0Var.setCallback(null);
            this.f16836n.A(true);
        }
        oi0 oi0Var2 = new oi0(i10, AndroidUtilities.dp(36.0f), i0.a.k(i10, ""), AndroidUtilities.dp(36.0f));
        this.f16836n = oi0Var2;
        oi0Var2.setCallback(this);
        this.f16836n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f16833c, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f16839w = staticLayout;
        this.f16840x = staticLayout.getLineCount() > 0 ? this.f16839w.getLineWidth(0) : 0.0f;
        this.f16841y = this.f16839w.getLineCount() > 0 ? this.f16839w.getLineLeft(0) : 0.0f;
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
        float f10;
        RectF rectF;
        float f11;
        int saveCount = canvas.getSaveCount();
        float fD = this.B.d(this.A ? 1.0f : 0.0f, false);
        float fD2 = this.E.d(this.C ? 0.0f : 1.0f, false);
        float f12 = 1.0f - fD2;
        Paint paint = this.f16831a;
        paint.setAlpha((int) (90.0f * f12 * fD));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float fMax = Math.max(this.f16838s, AndroidUtilities.dp(54.0f)) + AndroidUtilities.dp(42.0f);
        int iDp = AndroidUtilities.dp(111.0f);
        StaticLayout staticLayout = this.f16837r;
        float height = staticLayout.getHeight() + iDp;
        float width = (getWidth() - fMax) / 2.0f;
        float height2 = (getHeight() - height) / 2.0f;
        float width2 = (getWidth() + fMax) / 2.0f;
        float height3 = (getHeight() + height) / 2.0f;
        RectF rectF2 = this.G;
        rectF2.set(width, height2, width2, height3);
        float fDp = AndroidUtilities.dp(74.0f) + this.f16840x;
        float fDp2 = AndroidUtilities.dp(48.0f);
        float width3 = (getWidth() - fDp) / 2.0f;
        float height4 = (getHeight() - fDp2) / 2.0f;
        float width4 = (getWidth() + fDp) / 2.0f;
        float height5 = (getHeight() + fDp2) / 2.0f;
        RectF rectF3 = this.H;
        rectF3.set(width3, height4, width4, height5);
        RectF rectF4 = this.I;
        AndroidUtilities.lerp(rectF2, rectF3, fD2, rectF4);
        if (fD >= 1.0f || !this.C) {
            f10 = 42.0f;
        } else {
            float width5 = getWidth() / 2.0f;
            float height6 = getHeight() / 2.0f;
            f10 = 42.0f;
            float width6 = getWidth() / 2.0f;
            float height7 = getHeight() / 2.0f;
            RectF rectF5 = this.J;
            rectF5.set(width5, height6, width6, height7);
            AndroidUtilities.lerp(rectF5, rectF4, fD, rectF4);
        }
        if (fD < 1.0f && !this.C) {
            canvas2.scale(AndroidUtilities.lerp(0.8f, 1.0f, fD), AndroidUtilities.lerp(0.8f, 1.0f, fD), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * fD));
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (fD2 < 1.0f) {
            float f13 = f12 * fD;
            float fD3 = this.F.d(this.D, false);
            float fCenterX = rectF2.centerX();
            float fDp3 = rectF2.top + AndroidUtilities.dp(48.0f);
            float fDp4 = AndroidUtilities.dp(25.0f);
            Paint paint3 = this.f16835f;
            paint3.setAlpha((int) (51.0f * f13));
            canvas2.drawCircle(fCenterX, fDp3, fDp4, paint3);
            RectF rectF6 = AndroidUtilities.rectTmp;
            f11 = 255.0f;
            rectF6.set(fCenterX - fDp4, fDp3 - fDp4, fCenterX + fDp4, fDp4 + fDp3);
            int i10 = (int) (f13 * 255.0f);
            Paint paint4 = this.f16834e;
            paint4.setAlpha(i10);
            paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * fD3, false, paint4);
            float fA = this.h.a(0.15f);
            canvas.save();
            canvas.scale(fA, fA, fCenterX, fDp3);
            paint4.setStrokeWidth(AndroidUtilities.dp(3.4f));
            canvas.drawLine(fCenterX - AndroidUtilities.dp(7.0f), fDp3 - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f) + fCenterX, AndroidUtilities.dp(7.0f) + fDp3, paint4);
            canvas2 = canvas;
            canvas2.drawLine(fCenterX - AndroidUtilities.dp(7.0f), fDp3 + AndroidUtilities.dp(7.0f), fCenterX + AndroidUtilities.dp(7.0f), fDp3 - AndroidUtilities.dp(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(21.0f)) - this.v, (rectF2.bottom - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight());
            this.f16832b.setAlpha(i10);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f11 = 255.0f;
        }
        if (fD2 > 0.0f) {
            float f14 = fD2 * fD;
            oi0 oi0Var = this.f16836n;
            if (oi0Var != null) {
                oi0Var.setAlpha((int) (f14 * f11));
                this.f16836n.setBounds((int) (rectF.left + AndroidUtilities.dp(9.0f)), (int) (rectF.top + AndroidUtilities.dp(6.0f)), (int) (rectF.left + AndroidUtilities.dp(45.0f)), (int) (rectF.top + AndroidUtilities.dp(f10)));
                this.f16836n.draw(canvas2);
            }
            if (this.f16839w != null) {
                canvas2.save();
                canvas2.translate((rectF.left + AndroidUtilities.dp(52.0f)) - this.f16841y, rectF.centerY() - (this.f16839w.getHeight() / 2.0f));
                this.f16833c.setAlpha((int) (f14 * f11));
                this.f16839w.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (fD > 0.0f || this.A || this.K) {
            return;
        }
        this.K = true;
        post(new s0(this, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains = this.I.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.nc ncVar = this.h;
        if (action == 0 && (this.C || zContains)) {
            ncVar.c(zContains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (ncVar.h) {
                if (zContains) {
                    if (this.C) {
                        Runnable runnable = this.M;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                ncVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            ncVar.c(false);
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
        return drawable == this.f16836n || super.verifyDrawable(drawable);
    }

    public t0(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f16831a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f16832b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f16833c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f16834e = paint3;
        Paint paint4 = new Paint(1);
        this.f16835f = paint4;
        this.h = new org.telegram.ui.Components.nc(this);
        this.A = false;
        this.B = new org.telegram.ui.Components.y5(0.0f, this, 0L, 350L, er.h);
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
        this.f16837r = staticLayout;
        this.f16838s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.v = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.A = true;
        invalidate();
    }
}
