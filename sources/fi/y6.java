package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.Components.wq;
import org.telegram.ui.n61;
public class y6 extends View {
    public final org.telegram.ui.Components.h6 D;
    public final Path E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final org.telegram.ui.Components.v5 J;
    public final org.telegram.ui.Components.v5 K;
    public float L;
    public long M;
    public float N;
    public int O;
    public int P;
    public final TextPaint Q;
    public int R;
    public final int f13200a;
    public float f13201b;
    public float f13202c;
    public float d;
    public boolean f13203e;
    public final org.telegram.ui.Components.v5 f13204f;
    public c20 h;
    public final Paint f13205n;
    public final Paint f13206r;
    public final Paint f13207s;
    public final Paint f13208w;
    public final Paint f13209x;
    public final org.telegram.ui.Components.h6 f13210y;

    public y6(Context context, int i7) {
        super(context);
        this.f13201b = 0.0f;
        this.f13202c = 1.0f;
        wq wqVar = wq.h;
        this.f13204f = new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar);
        Paint paint = new Paint(1);
        this.f13205n = paint;
        Paint paint2 = new Paint(1);
        this.f13206r = paint2;
        Paint paint3 = new Paint(1);
        this.f13207s = paint3;
        Paint paint4 = new Paint(1);
        this.f13208w = paint4;
        Paint paint5 = new Paint(1);
        this.f13209x = paint5;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(false, true, true);
        this.f13210y = h6Var;
        this.E = new Path();
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new org.telegram.ui.Components.v5(this, 0L, 350L, wqVar);
        this.K = new org.telegram.ui.Components.v5(this, 0L, 350L, wqVar);
        this.Q = new TextPaint(1);
        this.f13200a = i7;
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.n(0.3f, 40L, wqVar);
        h6Var.setCallback(this);
        h6Var.u(-1);
        Point point = org.telegram.messenger.g0.f22567q;
        h6Var.M = point.x;
        if (i7 == 0) {
            h6Var.w(org.telegram.messenger.g0.L(15.0f));
            this.D = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            h6Var.w(org.telegram.messenger.g0.L(14.0f));
            h6Var.f34187b = 5;
            org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(false, true, true);
            this.D = h6Var2;
            h6Var2.M = point.x;
            h6Var2.w(org.telegram.messenger.g0.L(14.0f));
            h6Var2.x(org.telegram.messenger.g0.o());
            h6Var2.n(0.3f, 40L, wqVar);
            h6Var2.setCallback(this);
            h6Var2.u(-1);
            if (i7 == 1) {
                h6Var2.t(id.M0(2131750691, null), true, true);
            } else if (i7 == 2) {
                h6Var2.t(id.M0(2131750692, null), true, true);
            } else if (i7 == 3) {
                h6Var2.t(id.M0(2131742954, null), true, true);
            }
        }
        h6Var.t("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f10) {
        this.f13203e = true;
        float f11 = this.f13201b;
        this.d = (f10 - f11) / (this.f13202c - f11);
        e(f10);
    }

    public final void b() {
        this.f13201b = 0.0f;
        this.f13202c = 0.9f;
    }

    public final void c(n61 n61Var) {
        this.h = n61Var;
    }

    public final void d(float f10) {
        float f11 = this.f13201b;
        float f12 = (f10 - f11) / (this.f13202c - f11);
        this.d = f12;
        this.f13204f.e(true, f12);
        e(f10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z9;
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.O, this.P);
        Path path = this.E;
        path.rewind();
        float f12 = this.N;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z10 = false;
        if (this.f13203e) {
            f10 = this.f13204f.e(false, this.d);
        } else {
            f10 = this.d;
        }
        float f13 = f10;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.O, this.P, 255, 31);
        int i7 = this.f13200a;
        org.telegram.ui.Components.h6 h6Var = this.f13210y;
        if (i7 == 0) {
            h6Var.setBounds(org.telegram.messenger.g0.L(42.0f), -org.telegram.messenger.g0.L(1.0f), this.O, this.P - org.telegram.messenger.g0.L(1.0f));
            h6Var.draw(canvas);
        } else {
            int c10 = (this.O - ((int) h6Var.c())) - org.telegram.messenger.g0.L(6.0f);
            int L = this.P - org.telegram.messenger.g0.L(1.0f);
            org.telegram.ui.Components.h6 h6Var2 = this.D;
            h6Var2.setBounds(org.telegram.messenger.g0.L(12.33f), -org.telegram.messenger.g0.L(1.0f), c10, L);
            h6Var2.draw(canvas);
            h6Var.setBounds(this.O - org.telegram.messenger.g0.L(111.0f), -org.telegram.messenger.g0.L(1.0f), this.O - org.telegram.messenger.g0.L(11.0f), this.P - org.telegram.messenger.g0.L(1.0f));
            h6Var.draw(canvas);
        }
        if (i7 == 0) {
            canvas.drawPath(this.F, this.f13206r);
            canvas.drawPath(this.G, this.f13207s);
            float f14 = this.f13202c;
            float f15 = this.f13201b;
            float f16 = f14 - f15;
            if (f16 != 0.0f) {
                f11 = (f16 * this.d) + f15;
            } else {
                f11 = 0.0f;
            }
            double d = f11;
            if (d > 0.25d) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d2 = this.J.d(z9);
            canvas.save();
            canvas.translate((1.0f - d2) * (-org.telegram.messenger.g0.N(0.33f)), 0.0f);
            Paint paint = this.f13208w;
            paint.setAlpha((int) (d2 * 255.0f));
            canvas.drawPath(this.H, paint);
            canvas.restore();
            if (d > 0.5d) {
                z10 = true;
            }
            float d10 = this.K.d(z10);
            canvas.save();
            canvas.translate((1.0f - d10) * (-org.telegram.messenger.g0.N(0.66f)), 0.0f);
            Paint paint2 = this.f13209x;
            paint2.setAlpha((int) (d10 * 255.0f));
            canvas.drawPath(this.I, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.O * f13, this.P, this.f13205n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z9 = false;
        if (this.O <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.M = System.currentTimeMillis();
            this.f13203e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f11 = this.f13202c;
            float f12 = this.f13201b;
            float f13 = 0.0f;
            if (f11 - f12 != 0.0f) {
                f10 = com.google.android.recaptcha.internal.a.z(f11, f12, this.d, f12);
            } else {
                f10 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.M < ViewConfiguration.getTapTimeout()) {
                this.f13204f.e(true, this.d);
                this.d = x10 / this.O;
                this.f13203e = true;
            } else {
                this.d = Utilities.i(((x10 - this.L) / this.O) + this.d, 1.0f, 0.0f);
                this.f13203e = false;
                z9 = true;
            }
            float f14 = this.f13202c;
            float f15 = this.f13201b;
            if (f14 - f15 != 0.0f) {
                f13 = com.google.android.recaptcha.internal.a.z(f14, f15, this.d, f15);
            }
            if (z9) {
                if ((f13 <= f15 && f10 > f13) || (f13 >= f14 && f10 < f13)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f10 * 5.0f) != Math.floor(5.0f * f13)) {
                    org.telegram.messenger.g0.c4(this);
                }
            }
            e(f13);
            c20 c20Var = this.h;
            if (c20Var != null) {
                c20Var.a(Float.valueOf(f13));
            }
        }
        this.L = x10;
        return true;
    }

    public final void e(float f10) {
        long j3;
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.h6 h6Var = this.f13210y;
        if (!TextUtils.equals(h6Var.f34193i, str)) {
            h6Var.a();
            if (this.f13203e) {
                j3 = 320;
            } else {
                j3 = 40;
            }
            h6Var.n(0.3f, j3, wq.h);
            h6Var.t(str, true, true);
        }
        if (this.f13200a == 1) {
            this.f13205n.setColor(p2.f(f10));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.N = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.Q;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        this.f13210y.w(org.telegram.messenger.g0.L(15.0f));
        int i11 = this.R;
        int i12 = this.f13200a;
        if (i11 > 0) {
            this.O = i11;
            this.P = org.telegram.messenger.g0.L(48.0f);
        } else if (i12 == 0) {
            this.O = (int) Math.min(textPaint.measureText(id.M0(2131744720, null)) + org.telegram.messenger.g0.L(88.0f), View.MeasureSpec.getSize(i7));
            this.P = org.telegram.messenger.g0.L(48.0f);
        } else {
            this.O = org.telegram.messenger.g0.L(190.0f);
            this.P = org.telegram.messenger.g0.L(44.0f);
        }
        setMeasuredDimension(this.O, this.P);
        if (i12 == 0) {
            float L = org.telegram.messenger.g0.L(25.0f);
            float f10 = this.P / 2.0f;
            this.f13206r.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(1.33f)));
            Path path = this.F;
            path.rewind();
            path.moveTo(L - org.telegram.messenger.g0.N(8.66f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L - org.telegram.messenger.g0.N(3.0f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L - org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.lineTo(L - org.telegram.messenger.g0.N(8.66f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.close();
            this.f13207s.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(2.66f)));
            Path path2 = this.G;
            path2.rewind();
            path2.moveTo(L - org.telegram.messenger.g0.N(7.5f), f10);
            path2.lineTo(L, f10 - org.telegram.messenger.g0.N(7.33f));
            path2.lineTo(L, org.telegram.messenger.g0.N(7.33f) + f10);
            path2.close();
            Path path3 = this.H;
            path3.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((L - org.telegram.messenger.g0.N(0.33f)) - org.telegram.messenger.g0.L(4.33f), f10 - org.telegram.messenger.g0.L(4.33f), (L - org.telegram.messenger.g0.N(0.33f)) + org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f) + f10);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.f13209x;
            paint.setStyle(style);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            Path path4 = this.I;
            path4.rewind();
            rectF.set((L - org.telegram.messenger.g0.N(0.33f)) - org.telegram.messenger.g0.L(8.0f), f10 - org.telegram.messenger.g0.L(8.0f), (L - org.telegram.messenger.g0.N(0.33f)) + org.telegram.messenger.g0.L(8.0f), f10 + org.telegram.messenger.g0.L(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f13210y && drawable != this.D && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
