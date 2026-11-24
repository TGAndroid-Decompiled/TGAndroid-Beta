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
public class lja extends View {
    public final gn E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final Path J;
    public final lm K;
    public final lm L;
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
    public final lm f;
    public p8c h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final gn y;

    public lja(Context context, int i) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        s33 s33Var = s33.h;
        this.f = new lm(this, 0L, 320L, s33Var);
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
        gn gnVar = new gn(false, true, true);
        this.y = gnVar;
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new Path();
        this.K = new lm(this, 0L, 350L, s33Var);
        this.L = new lm(this, 0L, 350L, s33Var);
        this.R = new TextPaint(1);
        this.a = i;
        gnVar.x(gl.o());
        gnVar.n(0.3f, 40L, s33Var);
        gnVar.setCallback(this);
        gnVar.u(-1);
        Point point = gl.q;
        gnVar.N = point.x;
        if (i == 0) {
            gnVar.w(gl.L(15.0f));
            this.E = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            gnVar.w(gl.L(14.0f));
            gnVar.b = 5;
            gn gnVar2 = new gn(false, true, true);
            this.E = gnVar2;
            gnVar2.N = point.x;
            gnVar2.w(gl.L(14.0f));
            gnVar2.x(gl.o());
            gnVar2.n(0.3f, 40L, s33Var);
            gnVar2.setCallback(this);
            gnVar2.u(-1);
            if (i == 1) {
                gnVar2.t(k96.M0(2131750674, null), true, true);
            } else if (i == 2) {
                gnVar2.t(k96.M0(2131750675, null), true, true);
            } else if (i == 3) {
                gnVar2.t(k96.M0(2131742691, null), true, true);
            }
        }
        gnVar.t("", true, true);
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
        gn gnVar = this.y;
        if (!TextUtils.equals(gnVar.i, str)) {
            gnVar.a();
            if (this.e) {
                j = 320;
            } else {
                j = 40;
            }
            gnVar.n(0.3f, j, s33.h);
            gnVar.t(str, true, true);
        }
        if (this.a == 1) {
            this.n.setColor(mi4.f(f));
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
        RectF rectF = gl.P;
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
        gn gnVar = this.y;
        if (b == 0) {
            gnVar.setBounds(gl.L(42.0f), -gl.L(1.0f), this.P, this.Q - gl.L(1.0f));
            gnVar.draw(canvas);
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
            canvas.translate((1.0f - d2) * (-gl.N(0.33f)), 0.0f);
            Paint paint = this.w;
            paint.setAlpha((int) (d2 * 255.0f));
            canvas.drawPath(this.I, paint);
            canvas.restore();
            if (d > 0.5d) {
                z2 = true;
            }
            float d3 = this.L.d(z2);
            canvas.save();
            canvas.translate((1.0f - d3) * (-gl.N(0.66f)), 0.0f);
            Paint paint2 = this.x;
            paint2.setAlpha((int) (d3 * 255.0f));
            canvas.drawPath(this.J, paint2);
            canvas.restore();
        } else {
            int c = (this.P - ((int) gnVar.c())) - gl.L(6.0f);
            int L = this.Q - gl.L(1.0f);
            gn gnVar2 = this.E;
            gnVar2.setBounds(gl.L(12.33f), -gl.L(1.0f), c, L);
            gnVar2.draw(canvas);
            gnVar.setBounds(this.P - gl.L(111.0f), -gl.L(1.0f), this.P - gl.L(11.0f), this.Q - gl.L(1.0f));
            gnVar.draw(canvas);
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
                f = tb4.A(f2, f3, this.d, f3);
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
                f4 = tb4.A(f5, f6, i, f6);
            }
            if (z) {
                if ((f4 <= f6 && f > f4) || (f4 >= f5 && f < f4)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f * 5.0f) != Math.floor(5.0f * f4)) {
                    gl.W3(this);
                }
            }
            d(f4);
            p8c p8cVar = this.h;
            if (p8cVar != null) {
                p8cVar.a(Float.valueOf(f4));
            }
        }
        this.M = x;
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        this.O = gl.L(12.0f);
        TextPaint textPaint = this.R;
        textPaint.setTextSize(gl.L(16.0f));
        this.y.w(gl.L(15.0f));
        int i3 = this.S;
        byte b = this.a;
        if (i3 > 0) {
            this.P = i3;
            L = gl.L(48.0f);
            this.Q = L;
        } else if (b == 0) {
            this.P = (int) Math.min(textPaint.measureText(k96.M0(2131744483, null)) + gl.L(88.0f), View.MeasureSpec.getSize(i));
            L = gl.L(48.0f);
            this.Q = L;
        } else {
            this.P = gl.L(190.0f);
            L = gl.L(44.0f);
            this.Q = L;
        }
        setMeasuredDimension(this.P, L);
        if (b == 0) {
            float L2 = gl.L(25.0f);
            float f = this.Q / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(gl.N(1.33f)));
            Path path = this.G;
            path.rewind();
            path.moveTo(L2 - gl.N(8.66f), f - gl.N(2.9f));
            path.lineTo(L2 - gl.N(3.0f), f - gl.N(2.9f));
            path.lineTo(L2 - gl.N(3.0f), gl.N(2.9f) + f);
            path.lineTo(L2 - gl.N(8.66f), gl.N(2.9f) + f);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(gl.N(2.66f)));
            Path path2 = this.H;
            path2.rewind();
            path2.moveTo(L2 - gl.N(7.5f), f);
            path2.lineTo(L2, f - gl.N(7.33f));
            path2.lineTo(L2, gl.N(7.33f) + f);
            path2.close();
            Path path3 = this.I;
            path3.rewind();
            RectF rectF = gl.P;
            rectF.set((L2 - gl.N(0.33f)) - gl.L(4.33f), f - gl.L(4.33f), (L2 - gl.N(0.33f)) + gl.L(4.33f), gl.L(4.33f) + f);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.x;
            paint.setStyle(style);
            paint.setStrokeWidth(gl.L(2.0f));
            Path path4 = this.J;
            path4.rewind();
            rectF.set((L2 - gl.N(0.33f)) - gl.L(8.0f), f - gl.L(8.0f), (L2 - gl.N(0.33f)) + gl.L(8.0f), f + gl.L(8.0f));
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
