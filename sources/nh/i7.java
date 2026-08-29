package nh;

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
import org.telegram.ui.Components.jr;
public class i7 extends View {
    public final Path A;
    public final Path B;
    public final Path C;
    public final Path D;
    public final Path E;
    public final org.telegram.ui.Components.d6 F;
    public final org.telegram.ui.Components.d6 G;
    public float H;
    public long I;
    public float J;
    public int K;
    public int L;
    public final TextPaint M;
    public int N;
    public final int f17893a;
    public float f17894b;
    public float f17895c;
    public float d;
    public boolean f17896e;
    public final org.telegram.ui.Components.d6 f17897f;
    public Utilities.Callback h;
    public final Paint f17898n;
    public final Paint f17899r;
    public final Paint f17900s;
    public final Paint v;
    public final Paint f17901w;
    public final org.telegram.ui.Components.n6 f17902x;
    public final org.telegram.ui.Components.n6 f17903y;

    public i7(Context context, int i10) {
        super(context);
        this.f17894b = 0.0f;
        this.f17895c = 1.0f;
        jr jrVar = jr.h;
        this.f17897f = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        Paint paint = new Paint(1);
        this.f17898n = paint;
        Paint paint2 = new Paint(1);
        this.f17899r = paint2;
        Paint paint3 = new Paint(1);
        this.f17900s = paint3;
        Paint paint4 = new Paint(1);
        this.v = paint4;
        Paint paint5 = new Paint(1);
        this.f17901w = paint5;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.f17902x = n6Var;
        this.A = new Path();
        this.B = new Path();
        this.C = new Path();
        this.D = new Path();
        this.E = new Path();
        this.F = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.G = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.M = new TextPaint(1);
        this.f17893a = i10;
        n6Var.u(AndroidUtilities.bold());
        n6Var.k(0.3f, 40L, jrVar);
        n6Var.setCallback(this);
        n6Var.r(-1);
        n6Var.G = AndroidUtilities.displaySize.x;
        if (i10 == 0) {
            n6Var.t(AndroidUtilities.dp(15.0f));
            this.f17903y = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            n6Var.t(AndroidUtilities.dp(14.0f));
            n6Var.f30862b = 5;
            org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, true, true, false);
            this.f17903y = n6Var2;
            n6Var2.G = AndroidUtilities.displaySize.x;
            n6Var2.t(AndroidUtilities.dp(14.0f));
            n6Var2.u(AndroidUtilities.bold());
            n6Var2.k(0.3f, 40L, jrVar);
            n6Var2.setCallback(this);
            n6Var2.r(-1);
            if (i10 == 1) {
                n6Var2.q(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i10 == 2) {
                n6Var2.q(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i10 == 3) {
                n6Var2.q(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        n6Var.q("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f9) {
        this.f17896e = true;
        float f10 = this.f17894b;
        this.d = (f9 - f10) / (this.f17895c - f10);
        e(f9);
    }

    public final void b() {
        this.f17894b = 0.0f;
        this.f17895c = 0.9f;
    }

    public final void c(org.telegram.ui.x3 x3Var) {
        this.h = x3Var;
    }

    public final void d(float f9) {
        float f10 = this.f17894b;
        float f11 = (f9 - f10) / (this.f17895c - f10);
        this.d = f11;
        this.f17897f.d(f11, true);
        e(f9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        boolean z10;
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.K, this.L);
        Path path = this.A;
        path.rewind();
        float f11 = this.J;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z11 = false;
        if (this.f17896e) {
            f9 = this.f17897f.d(this.d, false);
        } else {
            f9 = this.d;
        }
        float f12 = f9;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.K, this.L, 255, 31);
        int i10 = this.f17893a;
        org.telegram.ui.Components.n6 n6Var = this.f17902x;
        if (i10 == 0) {
            n6Var.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.K, this.L - AndroidUtilities.dp(1.0f));
            n6Var.draw(canvas);
        } else {
            int d = (this.K - ((int) n6Var.d())) - AndroidUtilities.dp(6.0f);
            int dp = this.L - AndroidUtilities.dp(1.0f);
            org.telegram.ui.Components.n6 n6Var2 = this.f17903y;
            n6Var2.setBounds(AndroidUtilities.dp(12.33f), -AndroidUtilities.dp(1.0f), d, dp);
            n6Var2.draw(canvas);
            n6Var.setBounds(this.K - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.K - AndroidUtilities.dp(11.0f), this.L - AndroidUtilities.dp(1.0f));
            n6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.B, this.f17899r);
            canvas.drawPath(this.C, this.f17900s);
            float f13 = this.f17895c;
            float f14 = this.f17894b;
            float f15 = f13 - f14;
            if (f15 != 0.0f) {
                f10 = (f15 * this.d) + f14;
            } else {
                f10 = 0.0f;
            }
            double d10 = f10;
            if (d10 > 0.25d) {
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
            if (d10 > 0.5d) {
                z11 = true;
            }
            float e11 = this.G.e(z11);
            canvas.save();
            canvas.translate((1.0f - e11) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.f17901w;
            paint2.setAlpha((int) (e11 * 255.0f));
            canvas.drawPath(this.E, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.K * f12, this.L, this.f17898n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f9;
        boolean z10 = false;
        if (this.K <= 0) {
            return false;
        }
        float x4 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.I = System.currentTimeMillis();
            this.f17896e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f10 = this.f17895c;
            float f11 = this.f17894b;
            float f12 = 0.0f;
            if (f10 - f11 != 0.0f) {
                f9 = com.google.android.recaptcha.internal.a.z(f10, f11, this.d, f11);
            } else {
                f9 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.I < ViewConfiguration.getTapTimeout()) {
                this.f17897f.d(this.d, true);
                this.d = x4 / this.K;
                this.f17896e = true;
            } else {
                this.d = Utilities.clamp(((x4 - this.H) / this.K) + this.d, 1.0f, 0.0f);
                this.f17896e = false;
                z10 = true;
            }
            float f13 = this.f17895c;
            float f14 = this.f17894b;
            if (f13 - f14 != 0.0f) {
                f12 = com.google.android.recaptcha.internal.a.z(f13, f14, this.d, f14);
            }
            if (z10) {
                if ((f12 <= f14 && f9 > f12) || (f12 >= f13 && f9 < f12)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f9 * 5.0f) != Math.floor(5.0f * f12)) {
                    AndroidUtilities.vibrateCursor(this);
                }
            }
            e(f12);
            Utilities.Callback callback = this.h;
            if (callback != null) {
                callback.run(Float.valueOf(f12));
            }
        }
        this.H = x4;
        return true;
    }

    public final void e(float f9) {
        long j10;
        String str = Math.round(100.0f * f9) + "%";
        org.telegram.ui.Components.n6 n6Var = this.f17902x;
        if (!TextUtils.equals(n6Var.f30866g, str)) {
            n6Var.b();
            if (this.f17896e) {
                j10 = 320;
            } else {
                j10 = 40;
            }
            n6Var.k(0.3f, j10, jr.h);
            n6Var.q(str, true, true);
        }
        if (this.f17893a == 1) {
            this.f17898n.setColor(p2.f(f9));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.J = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.M;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.f17902x.t(AndroidUtilities.dp(15.0f));
        int i12 = this.N;
        int i13 = this.f17893a;
        if (i12 > 0) {
            this.K = i12;
            this.L = AndroidUtilities.dp(48.0f);
        } else if (i13 == 0) {
            this.K = (int) Math.min(textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i10));
            this.L = AndroidUtilities.dp(48.0f);
        } else {
            this.K = AndroidUtilities.dp(190.0f);
            this.L = AndroidUtilities.dp(44.0f);
        }
        setMeasuredDimension(this.K, this.L);
        if (i13 == 0) {
            float dp = AndroidUtilities.dp(25.0f);
            float f9 = this.L / 2.0f;
            this.f17899r.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.B;
            path.rewind();
            path.moveTo(dp - AndroidUtilities.dpf2(8.66f), f9 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), f9 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f9);
            path.lineTo(dp - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f9);
            path.close();
            this.f17900s.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
            Path path2 = this.C;
            path2.rewind();
            path2.moveTo(dp - AndroidUtilities.dpf2(7.5f), f9);
            path2.lineTo(dp, f9 - AndroidUtilities.dpf2(7.33f));
            path2.lineTo(dp, AndroidUtilities.dpf2(7.33f) + f9);
            path2.close();
            Path path3 = this.D;
            path3.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((dp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f9 - AndroidUtilities.dp(4.33f), (dp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f9);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.f17901w;
            paint.setStyle(style);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Path path4 = this.E;
            path4.rewind();
            rectF.set((dp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f9 - AndroidUtilities.dp(8.0f), (dp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f9 + AndroidUtilities.dp(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f17902x && drawable != this.f17903y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
