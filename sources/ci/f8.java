package ci;

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
import org.telegram.ui.Components.is;
import org.telegram.ui.nc1;
public class f8 extends View {
    public final Path E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final org.telegram.ui.Components.g6 J;
    public final org.telegram.ui.Components.g6 K;
    public float L;
    public long M;
    public float N;
    public int O;
    public int P;
    public final TextPaint Q;
    public int R;
    public final int f5076a;
    public float f5077b;
    public float f5078c;
    public float d;
    public boolean f5079e;
    public final org.telegram.ui.Components.g6 f5080f;
    public Utilities.Callback h;
    public final Paint f5081n;
    public final Paint f5082r;
    public final Paint f5083s;
    public final Paint v;
    public final Paint f5084w;
    public final org.telegram.ui.Components.q6 f5085x;
    public final org.telegram.ui.Components.q6 f5086y;

    public f8(Context context, int i10) {
        super(context);
        this.f5077b = 0.0f;
        this.f5078c = 1.0f;
        is isVar = is.h;
        this.f5080f = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        Paint paint = new Paint(1);
        this.f5081n = paint;
        Paint paint2 = new Paint(1);
        this.f5082r = paint2;
        Paint paint3 = new Paint(1);
        this.f5083s = paint3;
        Paint paint4 = new Paint(1);
        this.v = paint4;
        Paint paint5 = new Paint(1);
        this.f5084w = paint5;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.f5085x = q6Var;
        this.E = new Path();
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new org.telegram.ui.Components.g6(this, 0L, 350L, isVar);
        this.K = new org.telegram.ui.Components.g6(this, 0L, 350L, isVar);
        this.Q = new TextPaint(1);
        this.f5076a = i10;
        q6Var.x(AndroidUtilities.bold());
        q6Var.n(0.3f, 40L, isVar);
        q6Var.setCallback(this);
        q6Var.u(-1);
        q6Var.M = AndroidUtilities.displaySize.x;
        if (i10 == 0) {
            q6Var.w(AndroidUtilities.dp(15.0f));
            this.f5086y = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            q6Var.w(AndroidUtilities.dp(14.0f));
            q6Var.f30031b = 5;
            org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(false, true, true);
            this.f5086y = q6Var2;
            q6Var2.M = AndroidUtilities.displaySize.x;
            q6Var2.w(AndroidUtilities.dp(14.0f));
            q6Var2.x(AndroidUtilities.bold());
            q6Var2.n(0.3f, 40L, isVar);
            q6Var2.setCallback(this);
            q6Var2.u(-1);
            if (i10 == 1) {
                q6Var2.t(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i10 == 2) {
                q6Var2.t(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i10 == 3) {
                q6Var2.t(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        q6Var.t("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f7) {
        this.f5079e = true;
        float f10 = this.f5077b;
        this.d = (f7 - f10) / (this.f5078c - f10);
        e(f7);
    }

    public final void b() {
        this.f5077b = 0.0f;
        this.f5078c = 0.9f;
    }

    public final void c(nc1 nc1Var) {
        this.h = nc1Var;
    }

    public final void d(float f7) {
        float f10 = this.f5077b;
        float f11 = (f7 - f10) / (this.f5078c - f10);
        this.d = f11;
        this.f5080f.d(f11, true);
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
        if (this.f5079e) {
            f7 = this.f5080f.d(this.d, false);
        } else {
            f7 = this.d;
        }
        float f12 = f7;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.O, this.P, 255, 31);
        int i10 = this.f5076a;
        org.telegram.ui.Components.q6 q6Var = this.f5085x;
        if (i10 == 0) {
            q6Var.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.O, this.P - AndroidUtilities.dp(1.0f));
            q6Var.draw(canvas);
        } else {
            int c10 = (this.O - ((int) q6Var.c())) - AndroidUtilities.dp(6.0f);
            int dp = this.P - AndroidUtilities.dp(1.0f);
            org.telegram.ui.Components.q6 q6Var2 = this.f5086y;
            q6Var2.setBounds(AndroidUtilities.dp(12.33f), -AndroidUtilities.dp(1.0f), c10, dp);
            q6Var2.draw(canvas);
            q6Var.setBounds(this.O - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.O - AndroidUtilities.dp(11.0f), this.P - AndroidUtilities.dp(1.0f));
            q6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.F, this.f5082r);
            canvas.drawPath(this.G, this.f5083s);
            float f13 = this.f5078c;
            float f14 = this.f5077b;
            float f15 = f13 - f14;
            if (f15 != 0.0f) {
                f10 = (f15 * this.d) + f14;
            } else {
                f10 = 0.0f;
            }
            double d = f10;
            if (d > 0.25d) {
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
            if (d > 0.5d) {
                z11 = true;
            }
            float e10 = this.K.e(z11);
            canvas.save();
            canvas.translate((1.0f - e10) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.f5084w;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawPath(this.I, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.O * f12, this.P, this.f5081n);
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
            this.f5079e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f10 = this.f5078c;
            float f11 = this.f5077b;
            float f12 = 0.0f;
            if (f10 - f11 != 0.0f) {
                f7 = com.google.android.gms.internal.vision.e2.y(f10, f11, this.d, f11);
            } else {
                f7 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.M < ViewConfiguration.getTapTimeout()) {
                this.f5080f.d(this.d, true);
                this.d = x10 / this.O;
                this.f5079e = true;
            } else {
                this.d = Utilities.clamp(((x10 - this.L) / this.O) + this.d, 1.0f, 0.0f);
                this.f5079e = false;
                z10 = true;
            }
            float f13 = this.f5078c;
            float f14 = this.f5077b;
            if (f13 - f14 != 0.0f) {
                f12 = com.google.android.gms.internal.vision.e2.y(f13, f14, this.d, f14);
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
        org.telegram.ui.Components.q6 q6Var = this.f5085x;
        if (!TextUtils.equals(q6Var.f30037i, str)) {
            q6Var.a();
            if (this.f5079e) {
                j3 = 320;
            } else {
                j3 = 40;
            }
            q6Var.n(0.3f, j3, is.h);
            q6Var.t(str, true, true);
        }
        if (this.f5076a == 1) {
            this.f5081n.setColor(w2.f(f7));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.N = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.Q;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.f5085x.w(AndroidUtilities.dp(15.0f));
        int i12 = this.R;
        int i13 = this.f5076a;
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
            this.f5082r.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.F;
            path.rewind();
            path.moveTo(dp - AndroidUtilities.dpf2(8.66f), f7 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), f7 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f7);
            path.lineTo(dp - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f7);
            path.close();
            this.f5083s.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
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
            Paint paint = this.f5084w;
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
        if (drawable != this.f5085x && drawable != this.f5086y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
