package di;

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
import org.telegram.ui.Components.pr;
public class i8 extends View {
    public final Path E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final org.telegram.ui.Components.e6 J;
    public final org.telegram.ui.Components.e6 K;
    public float L;
    public long M;
    public float N;
    public int O;
    public int P;
    public final TextPaint Q;
    public int R;
    public final int f7373a;
    public float f7374b;
    public float f7375c;
    public float d;
    public boolean f7376e;
    public final org.telegram.ui.Components.e6 f7377f;
    public Utilities.Callback h;
    public final Paint f7378n;
    public final Paint f7379r;
    public final Paint f7380s;
    public final Paint v;
    public final Paint f7381w;
    public final org.telegram.ui.Components.p6 f7382x;
    public final org.telegram.ui.Components.p6 f7383y;

    public i8(Context context, int i10) {
        super(context);
        this.f7374b = 0.0f;
        this.f7375c = 1.0f;
        pr prVar = pr.h;
        this.f7377f = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        Paint paint = new Paint(1);
        this.f7378n = paint;
        Paint paint2 = new Paint(1);
        this.f7379r = paint2;
        Paint paint3 = new Paint(1);
        this.f7380s = paint3;
        Paint paint4 = new Paint(1);
        this.v = paint4;
        Paint paint5 = new Paint(1);
        this.f7381w = paint5;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.f7382x = p6Var;
        this.E = new Path();
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.K = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.Q = new TextPaint(1);
        this.f7373a = i10;
        p6Var.u(AndroidUtilities.bold());
        p6Var.k(0.3f, 40L, prVar);
        p6Var.setCallback(this);
        p6Var.r(-1);
        p6Var.G = AndroidUtilities.displaySize.x;
        if (i10 == 0) {
            p6Var.t(AndroidUtilities.dp(15.0f));
            this.f7383y = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            p6Var.t(AndroidUtilities.dp(14.0f));
            p6Var.f29285b = 5;
            org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, true, true, false);
            this.f7383y = p6Var2;
            p6Var2.G = AndroidUtilities.displaySize.x;
            p6Var2.t(AndroidUtilities.dp(14.0f));
            p6Var2.u(AndroidUtilities.bold());
            p6Var2.k(0.3f, 40L, prVar);
            p6Var2.setCallback(this);
            p6Var2.r(-1);
            if (i10 == 1) {
                p6Var2.q(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i10 == 2) {
                p6Var2.q(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i10 == 3) {
                p6Var2.q(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        p6Var.q("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f7) {
        this.f7376e = true;
        float f10 = this.f7374b;
        this.d = (f7 - f10) / (this.f7375c - f10);
        e(f7);
    }

    public final void b() {
        this.f7374b = 0.0f;
        this.f7375c = 0.9f;
    }

    public final void c(org.telegram.ui.t3 t3Var) {
        this.h = t3Var;
    }

    public final void d(float f7) {
        float f10 = this.f7374b;
        float f11 = (f7 - f10) / (this.f7375c - f10);
        this.d = f11;
        this.f7377f.d(f11, true);
        e(f7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.O, this.P);
        Path path = this.E;
        path.rewind();
        float f11 = this.N;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z11 = false;
        if (this.f7376e) {
            f7 = this.f7377f.d(this.d, false);
        } else {
            f7 = this.d;
        }
        float f12 = f7;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.O, this.P, 255, 31);
        int i10 = this.f7373a;
        org.telegram.ui.Components.p6 p6Var = this.f7382x;
        if (i10 == 0) {
            p6Var.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.O, this.P - AndroidUtilities.dp(1.0f));
            p6Var.draw(canvas);
        } else {
            int d = (this.O - ((int) p6Var.d())) - AndroidUtilities.dp(6.0f);
            int dp = this.P - AndroidUtilities.dp(1.0f);
            org.telegram.ui.Components.p6 p6Var2 = this.f7383y;
            p6Var2.setBounds(AndroidUtilities.dp(12.33f), -AndroidUtilities.dp(1.0f), d, dp);
            p6Var2.draw(canvas);
            p6Var.setBounds(this.O - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.O - AndroidUtilities.dp(11.0f), this.P - AndroidUtilities.dp(1.0f));
            p6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.F, this.f7379r);
            canvas.drawPath(this.G, this.f7380s);
            float f13 = this.f7375c;
            float f14 = this.f7374b;
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
            float e7 = this.J.e(z10);
            canvas.save();
            canvas.translate((1.0f - e7) * (-AndroidUtilities.dpf2(0.33f)), 0.0f);
            Paint paint = this.v;
            paint.setAlpha((int) (e7 * 255.0f));
            canvas.drawPath(this.H, paint);
            canvas.restore();
            if (d10 > 0.5d) {
                z11 = true;
            }
            float e10 = this.K.e(z11);
            canvas.save();
            canvas.translate((1.0f - e10) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.f7381w;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawPath(this.I, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.O * f12, this.P, this.f7378n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        boolean z10 = false;
        if (this.O <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.M = System.currentTimeMillis();
            this.f7376e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f10 = this.f7375c;
            float f11 = this.f7374b;
            float f12 = 0.0f;
            if (f10 - f11 != 0.0f) {
                f7 = com.google.android.gms.internal.vision.e2.z(f10, f11, this.d, f11);
            } else {
                f7 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.M < ViewConfiguration.getTapTimeout()) {
                this.f7377f.d(this.d, true);
                this.d = x10 / this.O;
                this.f7376e = true;
            } else {
                this.d = Utilities.clamp(((x10 - this.L) / this.O) + this.d, 1.0f, 0.0f);
                this.f7376e = false;
                z10 = true;
            }
            float f13 = this.f7375c;
            float f14 = this.f7374b;
            if (f13 - f14 != 0.0f) {
                f12 = com.google.android.gms.internal.vision.e2.z(f13, f14, this.d, f14);
            }
            if (z10) {
                if ((f12 <= f14 && f7 > f12) || (f12 >= f13 && f7 < f12)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f7 * 5.0f) != Math.floor(5.0f * f12)) {
                    AndroidUtilities.vibrateCursor(this);
                }
            }
            e(f12);
            Utilities.Callback callback = this.h;
            if (callback != null) {
                callback.run(Float.valueOf(f12));
            }
        }
        this.L = x10;
        return true;
    }

    public final void e(float f7) {
        long j3;
        String str = Math.round(100.0f * f7) + "%";
        org.telegram.ui.Components.p6 p6Var = this.f7382x;
        if (!TextUtils.equals(p6Var.f29289g, str)) {
            p6Var.b();
            if (this.f7376e) {
                j3 = 320;
            } else {
                j3 = 40;
            }
            p6Var.k(0.3f, j3, pr.h);
            p6Var.q(str, true, true);
        }
        if (this.f7373a == 1) {
            this.f7378n.setColor(y2.f(f7));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.N = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.Q;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.f7382x.t(AndroidUtilities.dp(15.0f));
        int i12 = this.R;
        int i13 = this.f7373a;
        if (i12 > 0) {
            this.O = i12;
            this.P = AndroidUtilities.dp(48.0f);
        } else if (i13 == 0) {
            this.O = (int) Math.min(textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i10));
            this.P = AndroidUtilities.dp(48.0f);
        } else {
            this.O = AndroidUtilities.dp(190.0f);
            this.P = AndroidUtilities.dp(44.0f);
        }
        setMeasuredDimension(this.O, this.P);
        if (i13 == 0) {
            float dp = AndroidUtilities.dp(25.0f);
            float f7 = this.P / 2.0f;
            this.f7379r.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.F;
            path.rewind();
            path.moveTo(dp - AndroidUtilities.dpf2(8.66f), f7 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), f7 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f7);
            path.lineTo(dp - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f7);
            path.close();
            this.f7380s.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
            Path path2 = this.G;
            path2.rewind();
            path2.moveTo(dp - AndroidUtilities.dpf2(7.5f), f7);
            path2.lineTo(dp, f7 - AndroidUtilities.dpf2(7.33f));
            path2.lineTo(dp, AndroidUtilities.dpf2(7.33f) + f7);
            path2.close();
            Path path3 = this.H;
            path3.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((dp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f7 - AndroidUtilities.dp(4.33f), (dp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f7);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.f7381w;
            paint.setStyle(style);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Path path4 = this.I;
            path4.rewind();
            rectF.set((dp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f7 - AndroidUtilities.dp(8.0f), (dp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f7 + AndroidUtilities.dp(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f7382x && drawable != this.f7383y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
