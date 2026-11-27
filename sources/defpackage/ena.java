package defpackage;

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
public class ena extends View {
    public final hn E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final Path J;
    public final mm K;
    public final mm L;
    public float M;
    public long N;
    public float O;
    public int P;
    public int Q;
    public final TextPaint R;
    public int S;
    public final byte a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final mm f;
    public pcc h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final hn y;

    public ena(Context context, int i) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        k43 k43Var = k43.h;
        this.f = new mm(this, 0L, 320L, k43Var);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        Paint paint3 = new Paint(1);
        this.s = paint3;
        Paint paint4 = new Paint(1);
        this.w = paint4;
        Paint paint5 = new Paint(1);
        this.x = paint5;
        hn hnVar = new hn(false, true, true);
        this.y = hnVar;
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new Path();
        this.K = new mm(this, 0L, 350L, k43Var);
        this.L = new mm(this, 0L, 350L, k43Var);
        this.R = new TextPaint(1);
        this.a = i;
        hnVar.x(hl.o());
        hnVar.n(0.3f, 40L, k43Var);
        hnVar.setCallback(this);
        hnVar.u(-1);
        Point point = hl.q;
        hnVar.N = point.x;
        if (i == 0) {
            hnVar.w(hl.L(15.0f));
            this.E = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            hnVar.w(hl.L(14.0f));
            hnVar.b = 5;
            hn hnVar2 = new hn(false, true, true);
            this.E = hnVar2;
            hnVar2.N = point.x;
            hnVar2.w(hl.L(14.0f));
            hnVar2.x(hl.o());
            hnVar2.n(0.3f, 40L, k43Var);
            hnVar2.setCallback(this);
            hnVar2.u(-1);
            if (i == 1) {
                hnVar2.t(ob6.M0(2131750651, null), true, true);
            } else if (i == 2) {
                hnVar2.t(ob6.M0(2131750652, null), true, true);
            } else if (i == 3) {
                hnVar2.t(ob6.M0(2131742585, null), true, true);
            }
        }
        hnVar.t("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f) {
        this.e = true;
        float f2 = this.b;
        this.d = (f - f2) / (this.c - f2);
        d(f);
    }

    public final void b() {
        this.b = 0.0f;
        this.c = 0.9f;
    }

    public final void c(float f) {
        float f2 = this.b;
        float f3 = (f - f2) / (this.c - f2);
        this.d = f3;
        this.f.e(true, f3);
        d(f);
    }

    public final void d(float f) {
        long j;
        String str = Math.round(100.0f * f) + "%";
        hn hnVar = this.y;
        if (!TextUtils.equals(hnVar.i, str)) {
            hnVar.a();
            if (this.e) {
                j = 320;
            } else {
                j = 40;
            }
            hnVar.n(0.3f, j, k43.h);
            hnVar.t(str, true, true);
        }
        if (this.a == 1) {
            this.n.setColor(rk4.f(f));
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, this.P, this.Q);
        Path path = this.F;
        path.rewind();
        float f3 = this.O;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z2 = false;
        if (this.e) {
            f = this.f.e(false, this.d);
        } else {
            f = this.d;
        }
        float f4 = f;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.P, this.Q, 255, 31);
        byte b = this.a;
        hn hnVar = this.y;
        if (b == 0) {
            hnVar.setBounds(hl.L(42.0f), -hl.L(1.0f), this.P, this.Q - hl.L(1.0f));
            hnVar.draw(canvas);
            canvas.drawPath(this.G, this.r);
            canvas.drawPath(this.H, this.s);
            float f5 = this.c;
            float f6 = this.b;
            float f7 = f5 - f6;
            if (f7 != 0.0f) {
                f2 = (f7 * this.d) + f6;
            } else {
                f2 = 0.0f;
            }
            double d = f2;
            if (d > 0.25d) {
                z = true;
            } else {
                z = false;
            }
            float d2 = this.K.d(z);
            canvas.save();
            canvas.translate((1.0f - d2) * (-hl.N(0.33f)), 0.0f);
            Paint paint = this.w;
            paint.setAlpha((int) (d2 * 255.0f));
            canvas.drawPath(this.I, paint);
            canvas.restore();
            if (d > 0.5d) {
                z2 = true;
            }
            float d3 = this.L.d(z2);
            canvas.save();
            canvas.translate((1.0f - d3) * (-hl.N(0.66f)), 0.0f);
            Paint paint2 = this.x;
            paint2.setAlpha((int) (d3 * 255.0f));
            canvas.drawPath(this.J, paint2);
            canvas.restore();
        } else {
            int c = (this.P - ((int) hnVar.c())) - hl.L(6.0f);
            int L = this.Q - hl.L(1.0f);
            hn hnVar2 = this.E;
            hnVar2.setBounds(hl.L(12.33f), -hl.L(1.0f), c, L);
            hnVar2.draw(canvas);
            hnVar.setBounds(this.P - hl.L(111.0f), -hl.L(1.0f), this.P - hl.L(11.0f), this.Q - hl.L(1.0f));
            hnVar.draw(canvas);
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.P * f4, this.Q, this.n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        float i;
        boolean z = false;
        if (this.P <= 0) {
            return false;
        }
        float x = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.N = System.currentTimeMillis();
            this.e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f2 = this.c;
            float f3 = this.b;
            float f4 = 0.0f;
            if (f2 - f3 != 0.0f) {
                f = qd4.A(f2, f3, this.d, f3);
            } else {
                f = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.N < ViewConfiguration.getTapTimeout()) {
                this.f.e(true, this.d);
                i = x / this.P;
                this.d = i;
                this.e = true;
            } else {
                i = Utilities.i(((x - this.M) / this.P) + this.d, 1.0f, 0.0f);
                this.d = i;
                this.e = false;
                z = true;
            }
            float f5 = this.c;
            float f6 = this.b;
            if (f5 - f6 != 0.0f) {
                f4 = qd4.A(f5, f6, i, f6);
            }
            if (z) {
                if ((f4 <= f6 && f > f4) || (f4 >= f5 && f < f4)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f * 5.0f) != Math.floor(5.0f * f4)) {
                    hl.W3(this);
                }
            }
            d(f4);
            pcc pccVar = this.h;
            if (pccVar != null) {
                pccVar.a(Float.valueOf(f4));
            }
        }
        this.M = x;
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        this.O = hl.L(12.0f);
        TextPaint textPaint = this.R;
        textPaint.setTextSize(hl.L(16.0f));
        this.y.w(hl.L(15.0f));
        int i3 = this.S;
        byte b = this.a;
        if (i3 > 0) {
            this.P = i3;
            L = hl.L(48.0f);
            this.Q = L;
        } else if (b == 0) {
            this.P = (int) Math.min(textPaint.measureText(ob6.M0(2131744377, null)) + hl.L(88.0f), View.MeasureSpec.getSize(i));
            L = hl.L(48.0f);
            this.Q = L;
        } else {
            this.P = hl.L(190.0f);
            L = hl.L(44.0f);
            this.Q = L;
        }
        setMeasuredDimension(this.P, L);
        if (b == 0) {
            float L2 = hl.L(25.0f);
            float f = this.Q / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(hl.N(1.33f)));
            Path path = this.G;
            path.rewind();
            path.moveTo(L2 - hl.N(8.66f), f - hl.N(2.9f));
            path.lineTo(L2 - hl.N(3.0f), f - hl.N(2.9f));
            path.lineTo(L2 - hl.N(3.0f), hl.N(2.9f) + f);
            path.lineTo(L2 - hl.N(8.66f), hl.N(2.9f) + f);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(hl.N(2.66f)));
            Path path2 = this.H;
            path2.rewind();
            path2.moveTo(L2 - hl.N(7.5f), f);
            path2.lineTo(L2, f - hl.N(7.33f));
            path2.lineTo(L2, hl.N(7.33f) + f);
            path2.close();
            Path path3 = this.I;
            path3.rewind();
            RectF rectF = hl.P;
            rectF.set((L2 - hl.N(0.33f)) - hl.L(4.33f), f - hl.L(4.33f), (L2 - hl.N(0.33f)) + hl.L(4.33f), hl.L(4.33f) + f);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.x;
            paint.setStyle(style);
            paint.setStrokeWidth(hl.L(2.0f));
            Path path4 = this.J;
            path4.rewind();
            rectF.set((L2 - hl.N(0.33f)) - hl.L(8.0f), f - hl.L(8.0f), (L2 - hl.N(0.33f)) + hl.L(8.0f), f + hl.L(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.y && drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
