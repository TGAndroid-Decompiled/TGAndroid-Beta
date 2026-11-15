package hi;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
import org.telegram.ui.i61;
public class x6 extends View {
    public final org.telegram.ui.Components.g6 E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final Path J;
    public final org.telegram.ui.Components.u5 K;
    public final org.telegram.ui.Components.u5 L;
    public float M;
    public long N;
    public float O;
    public int P;
    public int Q;
    public final TextPaint R;
    public int S;
    public final int f15374a;
    public float f15375b;
    public float f15376c;
    public float d;
    public boolean f15377e;
    public final org.telegram.ui.Components.u5 f15378f;
    public z10 h;
    public final Paint f15379n;
    public final Paint f15380r;
    public final Paint f15381s;
    public final Paint f15382w;
    public final Paint f15383x;
    public final org.telegram.ui.Components.g6 f15384y;

    public x6(Context context, int i7) {
        super(context);
        this.f15375b = 0.0f;
        this.f15376c = 1.0f;
        er erVar = er.h;
        this.f15378f = new org.telegram.ui.Components.u5(this, 0L, 320L, erVar);
        Paint paint = new Paint(1);
        this.f15379n = paint;
        Paint paint2 = new Paint(1);
        this.f15380r = paint2;
        Paint paint3 = new Paint(1);
        this.f15381s = paint3;
        Paint paint4 = new Paint(1);
        this.f15382w = paint4;
        Paint paint5 = new Paint(1);
        this.f15383x = paint5;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f15384y = g6Var;
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new Path();
        this.K = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.L = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.R = new TextPaint(1);
        this.f15374a = i7;
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.n(0.3f, 40L, erVar);
        g6Var.setCallback(this);
        g6Var.u(-1);
        Point point = org.telegram.messenger.g0.f23609q;
        g6Var.N = point.x;
        if (i7 == 0) {
            g6Var.w(org.telegram.messenger.g0.L(15.0f));
            this.E = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            g6Var.w(org.telegram.messenger.g0.L(14.0f));
            g6Var.f34829b = 5;
            org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, true);
            this.E = g6Var2;
            g6Var2.N = point.x;
            g6Var2.w(org.telegram.messenger.g0.L(14.0f));
            g6Var2.x(org.telegram.messenger.g0.o());
            g6Var2.n(0.3f, 40L, erVar);
            g6Var2.setCallback(this);
            g6Var2.u(-1);
            if (i7 == 1) {
                g6Var2.t(hd.M0(2131750691, null), true, true);
            } else if (i7 == 2) {
                g6Var2.t(hd.M0(2131750692, null), true, true);
            } else if (i7 == 3) {
                g6Var2.t(hd.M0(2131742954, null), true, true);
            }
        }
        g6Var.t("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f10) {
        this.f15377e = true;
        float f11 = this.f15375b;
        this.d = (f10 - f11) / (this.f15376c - f11);
        e(f10);
    }

    public final void b() {
        this.f15375b = 0.0f;
        this.f15376c = 0.9f;
    }

    public final void c(i61 i61Var) {
        this.h = i61Var;
    }

    public final void d(float f10) {
        float f11 = this.f15375b;
        float f12 = (f10 - f11) / (this.f15376c - f11);
        this.d = f12;
        this.f15378f.e(true, f12);
        e(f10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.P, this.Q);
        Path path = this.F;
        path.rewind();
        float f12 = this.O;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z11 = false;
        if (this.f15377e) {
            f10 = this.f15378f.e(false, this.d);
        } else {
            f10 = this.d;
        }
        float f13 = f10;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.P, this.Q, 255, 31);
        int i7 = this.f15374a;
        org.telegram.ui.Components.g6 g6Var = this.f15384y;
        if (i7 == 0) {
            g6Var.setBounds(org.telegram.messenger.g0.L(42.0f), -org.telegram.messenger.g0.L(1.0f), this.P, this.Q - org.telegram.messenger.g0.L(1.0f));
            g6Var.draw(canvas);
        } else {
            int c10 = (this.P - ((int) g6Var.c())) - org.telegram.messenger.g0.L(6.0f);
            int L = this.Q - org.telegram.messenger.g0.L(1.0f);
            org.telegram.ui.Components.g6 g6Var2 = this.E;
            g6Var2.setBounds(org.telegram.messenger.g0.L(12.33f), -org.telegram.messenger.g0.L(1.0f), c10, L);
            g6Var2.draw(canvas);
            g6Var.setBounds(this.P - org.telegram.messenger.g0.L(111.0f), -org.telegram.messenger.g0.L(1.0f), this.P - org.telegram.messenger.g0.L(11.0f), this.Q - org.telegram.messenger.g0.L(1.0f));
            g6Var.draw(canvas);
        }
        if (i7 == 0) {
            canvas.drawPath(this.G, this.f15380r);
            canvas.drawPath(this.H, this.f15381s);
            float f14 = this.f15376c;
            float f15 = this.f15375b;
            float f16 = f14 - f15;
            if (f16 != 0.0f) {
                f11 = (f16 * this.d) + f15;
            } else {
                f11 = 0.0f;
            }
            double d = f11;
            if (d > 0.25d) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d2 = this.K.d(z10);
            canvas.save();
            canvas.translate((1.0f - d2) * (-org.telegram.messenger.g0.N(0.33f)), 0.0f);
            Paint paint = this.f15382w;
            paint.setAlpha((int) (d2 * 255.0f));
            canvas.drawPath(this.I, paint);
            canvas.restore();
            if (d > 0.5d) {
                z11 = true;
            }
            float d10 = this.L.d(z11);
            canvas.save();
            canvas.translate((1.0f - d10) * (-org.telegram.messenger.g0.N(0.66f)), 0.0f);
            Paint paint2 = this.f15383x;
            paint2.setAlpha((int) (d10 * 255.0f));
            canvas.drawPath(this.J, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.P * f13, this.Q, this.f15379n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10 = false;
        if (this.P <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.N = System.currentTimeMillis();
            this.f15377e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f11 = this.f15376c;
            float f12 = this.f15375b;
            float f13 = 0.0f;
            if (f11 - f12 != 0.0f) {
                f10 = com.google.android.gms.internal.vision.e2.z(f11, f12, this.d, f12);
            } else {
                f10 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.N < ViewConfiguration.getTapTimeout()) {
                this.f15378f.e(true, this.d);
                this.d = x10 / this.P;
                this.f15377e = true;
            } else {
                this.d = Utilities.i(((x10 - this.M) / this.P) + this.d, 1.0f, 0.0f);
                this.f15377e = false;
                z10 = true;
            }
            float f14 = this.f15376c;
            float f15 = this.f15375b;
            if (f14 - f15 != 0.0f) {
                f13 = com.google.android.gms.internal.vision.e2.z(f14, f15, this.d, f15);
            }
            if (z10) {
                if ((f13 <= f15 && f10 > f13) || (f13 >= f14 && f10 < f13)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f10 * 5.0f) != Math.floor(5.0f * f13)) {
                    org.telegram.messenger.g0.b4(this);
                }
            }
            e(f13);
            z10 z10Var = this.h;
            if (z10Var != null) {
                z10Var.a(Float.valueOf(f13));
            }
        }
        this.M = x10;
        return true;
    }

    public final void e(float f10) {
        long j3;
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.g6 g6Var = this.f15384y;
        if (!TextUtils.equals(g6Var.f34836i, str)) {
            g6Var.a();
            if (this.f15377e) {
                j3 = 320;
            } else {
                j3 = 40;
            }
            g6Var.n(0.3f, j3, er.h);
            g6Var.t(str, true, true);
        }
        if (this.f15374a == 1) {
            this.f15379n.setColor(n2.f(f10));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.O = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.R;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        this.f15384y.w(org.telegram.messenger.g0.L(15.0f));
        int i11 = this.S;
        int i12 = this.f15374a;
        if (i11 > 0) {
            this.P = i11;
            this.Q = org.telegram.messenger.g0.L(48.0f);
        } else if (i12 == 0) {
            this.P = (int) Math.min(textPaint.measureText(hd.M0(2131744720, null)) + org.telegram.messenger.g0.L(88.0f), View.MeasureSpec.getSize(i7));
            this.Q = org.telegram.messenger.g0.L(48.0f);
        } else {
            this.P = org.telegram.messenger.g0.L(190.0f);
            this.Q = org.telegram.messenger.g0.L(44.0f);
        }
        setMeasuredDimension(this.P, this.Q);
        if (i12 == 0) {
            float L = org.telegram.messenger.g0.L(25.0f);
            float f10 = this.Q / 2.0f;
            this.f15380r.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(1.33f)));
            Path path = this.G;
            path.rewind();
            path.moveTo(L - org.telegram.messenger.g0.N(8.66f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L - org.telegram.messenger.g0.N(3.0f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L - org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.lineTo(L - org.telegram.messenger.g0.N(8.66f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.close();
            this.f15381s.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(2.66f)));
            Path path2 = this.H;
            path2.rewind();
            path2.moveTo(L - org.telegram.messenger.g0.N(7.5f), f10);
            path2.lineTo(L, f10 - org.telegram.messenger.g0.N(7.33f));
            path2.lineTo(L, org.telegram.messenger.g0.N(7.33f) + f10);
            path2.close();
            Path path3 = this.I;
            path3.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((L - org.telegram.messenger.g0.N(0.33f)) - org.telegram.messenger.g0.L(4.33f), f10 - org.telegram.messenger.g0.L(4.33f), (L - org.telegram.messenger.g0.N(0.33f)) + org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f) + f10);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.f15383x;
            paint.setStyle(style);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            Path path4 = this.J;
            path4.rewind();
            rectF.set((L - org.telegram.messenger.g0.N(0.33f)) - org.telegram.messenger.g0.L(8.0f), f10 - org.telegram.messenger.g0.L(8.0f), (L - org.telegram.messenger.g0.N(0.33f)) + org.telegram.messenger.g0.L(8.0f), f10 + org.telegram.messenger.g0.L(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f15384y && drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
