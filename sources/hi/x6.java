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
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lr;
import org.telegram.ui.m61;
public class x6 extends View {
    public final org.telegram.ui.Components.m6 E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final Path J;
    public final org.telegram.ui.Components.c6 K;
    public final org.telegram.ui.Components.c6 L;
    public float M;
    public long N;
    public float O;
    public int P;
    public int Q;
    public final TextPaint R;
    public int S;
    public final int f15728a;
    public float f15729b;
    public float f15730c;
    public float d;
    public boolean f15731e;
    public final org.telegram.ui.Components.c6 f15732f;
    public x10 h;
    public final Paint f15733n;
    public final Paint f15734r;
    public final Paint f15735s;
    public final Paint f15736w;
    public final Paint f15737x;
    public final org.telegram.ui.Components.m6 f15738y;

    public x6(Context context, int i7) {
        super(context);
        this.f15729b = 0.0f;
        this.f15730c = 1.0f;
        lr lrVar = lr.h;
        this.f15732f = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        Paint paint = new Paint(1);
        this.f15733n = paint;
        Paint paint2 = new Paint(1);
        this.f15734r = paint2;
        Paint paint3 = new Paint(1);
        this.f15735s = paint3;
        Paint paint4 = new Paint(1);
        this.f15736w = paint4;
        Paint paint5 = new Paint(1);
        this.f15737x = paint5;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f15738y = m6Var;
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new Path();
        this.K = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.L = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.R = new TextPaint(1);
        this.f15728a = i7;
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.n(0.3f, 40L, lrVar);
        m6Var.setCallback(this);
        m6Var.u(-1);
        Point point = org.telegram.messenger.g0.f24118q;
        m6Var.N = point.x;
        if (i7 == 0) {
            m6Var.w(org.telegram.messenger.g0.L(15.0f));
            this.E = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            m6Var.w(org.telegram.messenger.g0.L(14.0f));
            m6Var.f37377b = 5;
            org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(false, true, true);
            this.E = m6Var2;
            m6Var2.N = point.x;
            m6Var2.w(org.telegram.messenger.g0.L(14.0f));
            m6Var2.x(org.telegram.messenger.g0.o());
            m6Var2.n(0.3f, 40L, lrVar);
            m6Var2.setCallback(this);
            m6Var2.u(-1);
            if (i7 == 1) {
                m6Var2.t(gd.M0(2131750675, null), true, true);
            } else if (i7 == 2) {
                m6Var2.t(gd.M0(2131750676, null), true, true);
            } else if (i7 == 3) {
                m6Var2.t(gd.M0(2131742696, null), true, true);
            }
        }
        m6Var.t("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f10) {
        this.f15731e = true;
        float f11 = this.f15729b;
        this.d = (f10 - f11) / (this.f15730c - f11);
        e(f10);
    }

    public final void b() {
        this.f15729b = 0.0f;
        this.f15730c = 0.9f;
    }

    public final void c(m61 m61Var) {
        this.h = m61Var;
    }

    public final void d(float f10) {
        float f11 = this.f15729b;
        float f12 = (f10 - f11) / (this.f15730c - f11);
        this.d = f12;
        this.f15732f.e(true, f12);
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
        if (this.f15731e) {
            f10 = this.f15732f.e(false, this.d);
        } else {
            f10 = this.d;
        }
        float f13 = f10;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.P, this.Q, 255, 31);
        int i7 = this.f15728a;
        org.telegram.ui.Components.m6 m6Var = this.f15738y;
        if (i7 == 0) {
            m6Var.setBounds(org.telegram.messenger.g0.L(42.0f), -org.telegram.messenger.g0.L(1.0f), this.P, this.Q - org.telegram.messenger.g0.L(1.0f));
            m6Var.draw(canvas);
        } else {
            int c10 = (this.P - ((int) m6Var.c())) - org.telegram.messenger.g0.L(6.0f);
            int L = this.Q - org.telegram.messenger.g0.L(1.0f);
            org.telegram.ui.Components.m6 m6Var2 = this.E;
            m6Var2.setBounds(org.telegram.messenger.g0.L(12.33f), -org.telegram.messenger.g0.L(1.0f), c10, L);
            m6Var2.draw(canvas);
            m6Var.setBounds(this.P - org.telegram.messenger.g0.L(111.0f), -org.telegram.messenger.g0.L(1.0f), this.P - org.telegram.messenger.g0.L(11.0f), this.Q - org.telegram.messenger.g0.L(1.0f));
            m6Var.draw(canvas);
        }
        if (i7 == 0) {
            canvas.drawPath(this.G, this.f15734r);
            canvas.drawPath(this.H, this.f15735s);
            float f14 = this.f15730c;
            float f15 = this.f15729b;
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
            Paint paint = this.f15736w;
            paint.setAlpha((int) (d2 * 255.0f));
            canvas.drawPath(this.I, paint);
            canvas.restore();
            if (d > 0.5d) {
                z11 = true;
            }
            float d10 = this.L.d(z11);
            canvas.save();
            canvas.translate((1.0f - d10) * (-org.telegram.messenger.g0.N(0.66f)), 0.0f);
            Paint paint2 = this.f15737x;
            paint2.setAlpha((int) (d10 * 255.0f));
            canvas.drawPath(this.J, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.P * f13, this.Q, this.f15733n);
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
            this.f15731e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f11 = this.f15730c;
            float f12 = this.f15729b;
            float f13 = 0.0f;
            if (f11 - f12 != 0.0f) {
                f10 = com.google.android.gms.internal.vision.e2.z(f11, f12, this.d, f12);
            } else {
                f10 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.N < ViewConfiguration.getTapTimeout()) {
                this.f15732f.e(true, this.d);
                this.d = x10 / this.P;
                this.f15731e = true;
            } else {
                this.d = Utilities.i(((x10 - this.M) / this.P) + this.d, 1.0f, 0.0f);
                this.f15731e = false;
                z10 = true;
            }
            float f14 = this.f15730c;
            float f15 = this.f15729b;
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
                    org.telegram.messenger.g0.a4(this);
                }
            }
            e(f13);
            x10 x10Var = this.h;
            if (x10Var != null) {
                x10Var.a(Float.valueOf(f13));
            }
        }
        this.M = x10;
        return true;
    }

    public final void e(float f10) {
        long j3;
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.m6 m6Var = this.f15738y;
        if (!TextUtils.equals(m6Var.f37384i, str)) {
            m6Var.a();
            if (this.f15731e) {
                j3 = 320;
            } else {
                j3 = 40;
            }
            m6Var.n(0.3f, j3, lr.h);
            m6Var.t(str, true, true);
        }
        if (this.f15728a == 1) {
            this.f15733n.setColor(o2.f(f10));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.O = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.R;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        this.f15738y.w(org.telegram.messenger.g0.L(15.0f));
        int i11 = this.S;
        int i12 = this.f15728a;
        if (i11 > 0) {
            this.P = i11;
            this.Q = org.telegram.messenger.g0.L(48.0f);
        } else if (i12 == 0) {
            this.P = (int) Math.min(textPaint.measureText(gd.M0(2131744485, null)) + org.telegram.messenger.g0.L(88.0f), View.MeasureSpec.getSize(i7));
            this.Q = org.telegram.messenger.g0.L(48.0f);
        } else {
            this.P = org.telegram.messenger.g0.L(190.0f);
            this.Q = org.telegram.messenger.g0.L(44.0f);
        }
        setMeasuredDimension(this.P, this.Q);
        if (i12 == 0) {
            float L = org.telegram.messenger.g0.L(25.0f);
            float f10 = this.Q / 2.0f;
            this.f15734r.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(1.33f)));
            Path path = this.G;
            path.rewind();
            path.moveTo(L - org.telegram.messenger.g0.N(8.66f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L - org.telegram.messenger.g0.N(3.0f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L - org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.lineTo(L - org.telegram.messenger.g0.N(8.66f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.close();
            this.f15735s.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(2.66f)));
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
            Paint paint = this.f15737x;
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
        if (drawable != this.f15738y && drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
