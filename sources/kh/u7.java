package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
public class u7 extends View {
    public final Path A;
    public final Path B;
    public final Path C;
    public final Path D;
    public final Path E;
    public final org.telegram.ui.Components.y5 F;
    public final org.telegram.ui.Components.y5 G;
    public float H;
    public long I;
    public float J;
    public int K;
    public int L;
    public final TextPaint M;
    public int N;
    public final int f16154a;
    public float f16155b;
    public float f16156c;
    public float d;
    public boolean f16157e;
    public final org.telegram.ui.Components.y5 f16158f;
    public Utilities.Callback h;
    public final Paint f16159n;
    public final Paint f16160r;
    public final Paint f16161s;
    public final Paint v;
    public final Paint f16162w;
    public final org.telegram.ui.Components.i6 f16163x;
    public final org.telegram.ui.Components.i6 f16164y;

    public u7(Context context, int i9) {
        super(context);
        this.f16155b = 0.0f;
        this.f16156c = 1.0f;
        gr grVar = gr.h;
        this.f16158f = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        Paint paint = new Paint(1);
        this.f16159n = paint;
        Paint paint2 = new Paint(1);
        this.f16160r = paint2;
        Paint paint3 = new Paint(1);
        this.f16161s = paint3;
        Paint paint4 = new Paint(1);
        this.v = paint4;
        Paint paint5 = new Paint(1);
        this.f16162w = paint5;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.f16163x = i6Var;
        this.A = new Path();
        this.B = new Path();
        this.C = new Path();
        this.D = new Path();
        this.E = new Path();
        this.F = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.G = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.M = new TextPaint(1);
        this.f16154a = i9;
        i6Var.u(AndroidUtilities.bold());
        i6Var.k(0.3f, 40L, grVar);
        i6Var.setCallback(this);
        i6Var.r(-1);
        i6Var.G = AndroidUtilities.displaySize.x;
        if (i9 == 0) {
            i6Var.t(AndroidUtilities.dp(15.0f));
            this.f16164y = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            i6Var.t(AndroidUtilities.dp(14.0f));
            i6Var.f29333b = 5;
            org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true, false);
            this.f16164y = i6Var2;
            i6Var2.G = AndroidUtilities.displaySize.x;
            i6Var2.t(AndroidUtilities.dp(14.0f));
            i6Var2.u(AndroidUtilities.bold());
            i6Var2.k(0.3f, 40L, grVar);
            i6Var2.setCallback(this);
            i6Var2.r(-1);
            if (i9 == 1) {
                i6Var2.q(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i9 == 2) {
                i6Var2.q(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i9 == 3) {
                i6Var2.q(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        i6Var.q("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f10) {
        this.f16157e = true;
        float f11 = this.f16155b;
        this.d = (f10 - f11) / (this.f16156c - f11);
        e(f10);
    }

    public final void b() {
        this.f16155b = 0.0f;
        this.f16156c = 0.9f;
    }

    public final void c(org.telegram.ui.w3 w3Var) {
        this.h = w3Var;
    }

    public final void d(float f10) {
        float f11 = this.f16155b;
        float f12 = (f10 - f11) / (this.f16156c - f11);
        this.d = f12;
        this.f16158f.d(f12, true);
        e(f10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.K, this.L);
        Path path = this.A;
        path.rewind();
        float f12 = this.J;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z11 = false;
        if (this.f16157e) {
            f10 = this.f16158f.d(this.d, false);
        } else {
            f10 = this.d;
        }
        float f13 = f10;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.K, this.L, 255, 31);
        int i9 = this.f16154a;
        org.telegram.ui.Components.i6 i6Var = this.f16163x;
        if (i9 == 0) {
            i6Var.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.K, this.L - AndroidUtilities.dp(1.0f));
            i6Var.draw(canvas);
        } else {
            int d = (this.K - ((int) i6Var.d())) - AndroidUtilities.dp(6.0f);
            int dp = this.L - AndroidUtilities.dp(1.0f);
            org.telegram.ui.Components.i6 i6Var2 = this.f16164y;
            i6Var2.setBounds(AndroidUtilities.dp(12.33f), -AndroidUtilities.dp(1.0f), d, dp);
            i6Var2.draw(canvas);
            i6Var.setBounds(this.K - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.K - AndroidUtilities.dp(11.0f), this.L - AndroidUtilities.dp(1.0f));
            i6Var.draw(canvas);
        }
        if (i9 == 0) {
            canvas.drawPath(this.B, this.f16160r);
            canvas.drawPath(this.C, this.f16161s);
            float f14 = this.f16156c;
            float f15 = this.f16155b;
            float f16 = f14 - f15;
            if (f16 != 0.0f) {
                f11 = (f16 * this.d) + f15;
            } else {
                f11 = 0.0f;
            }
            double d9 = f11;
            if (d9 > 0.25d) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = this.F.e(z10);
            canvas.save();
            canvas.translate((1.0f - e10) * (-AndroidUtilities.dpf2(0.33f)), 0.0f);
            Paint paint = this.v;
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawPath(this.D, paint);
            canvas.restore();
            if (d9 > 0.5d) {
                z11 = true;
            }
            float e11 = this.G.e(z11);
            canvas.save();
            canvas.translate((1.0f - e11) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.f16162w;
            paint2.setAlpha((int) (e11 * 255.0f));
            canvas.drawPath(this.E, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.K * f13, this.L, this.f16159n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10 = false;
        if (this.K <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.I = System.currentTimeMillis();
            this.f16157e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f11 = this.f16156c;
            float f12 = this.f16155b;
            float f13 = 0.0f;
            if (f11 - f12 != 0.0f) {
                f10 = e2.c.z(f11, f12, this.d, f12);
            } else {
                f10 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.I < ViewConfiguration.getTapTimeout()) {
                this.f16158f.d(this.d, true);
                this.d = x10 / this.K;
                this.f16157e = true;
            } else {
                this.d = Utilities.clamp(((x10 - this.H) / this.K) + this.d, 1.0f, 0.0f);
                this.f16157e = false;
                z10 = true;
            }
            float f14 = this.f16156c;
            float f15 = this.f16155b;
            if (f14 - f15 != 0.0f) {
                f13 = e2.c.z(f14, f15, this.d, f15);
            }
            if (z10) {
                if ((f13 <= f15 && f10 > f13) || (f13 >= f14 && f10 < f13)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f10 * 5.0f) != Math.floor(5.0f * f13)) {
                    AndroidUtilities.vibrateCursor(this);
                }
            }
            e(f13);
            Utilities.Callback callback = this.h;
            if (callback != null) {
                callback.run(Float.valueOf(f13));
            }
        }
        this.H = x10;
        return true;
    }

    public final void e(float f10) {
        long j10;
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.i6 i6Var = this.f16163x;
        if (!TextUtils.equals(i6Var.f29337g, str)) {
            i6Var.b();
            if (this.f16157e) {
                j10 = 320;
            } else {
                j10 = 40;
            }
            i6Var.k(0.3f, j10, gr.h);
            i6Var.q(str, true, true);
        }
        if (this.f16154a == 1) {
            this.f16159n.setColor(s2.f(f10));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.J = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.M;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.f16163x.t(AndroidUtilities.dp(15.0f));
        int i11 = this.N;
        int i12 = this.f16154a;
        if (i11 > 0) {
            this.K = i11;
            this.L = AndroidUtilities.dp(48.0f);
        } else if (i12 == 0) {
            this.K = (int) Math.min(textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i9));
            this.L = AndroidUtilities.dp(48.0f);
        } else {
            this.K = AndroidUtilities.dp(190.0f);
            this.L = AndroidUtilities.dp(44.0f);
        }
        setMeasuredDimension(this.K, this.L);
        if (i12 == 0) {
            float dp = AndroidUtilities.dp(25.0f);
            float f10 = this.L / 2.0f;
            this.f16160r.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.B;
            path.rewind();
            path.moveTo(dp - AndroidUtilities.dpf2(8.66f), f10 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), f10 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f10);
            path.lineTo(dp - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f10);
            path.close();
            this.f16161s.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
            Path path2 = this.C;
            path2.rewind();
            path2.moveTo(dp - AndroidUtilities.dpf2(7.5f), f10);
            path2.lineTo(dp, f10 - AndroidUtilities.dpf2(7.33f));
            path2.lineTo(dp, AndroidUtilities.dpf2(7.33f) + f10);
            path2.close();
            Path path3 = this.D;
            path3.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((dp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f10 - AndroidUtilities.dp(4.33f), (dp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f10);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.f16162w;
            paint.setStyle(style);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Path path4 = this.E;
            path4.rewind();
            rectF.set((dp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f10 - AndroidUtilities.dp(8.0f), (dp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f10 + AndroidUtilities.dp(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f16163x && drawable != this.f16164y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
