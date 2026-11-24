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
public class mla extends View {
    public final ho E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final Path J;
    public final ln K;
    public final ln L;
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
    public final ln f;
    public qac h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final ho y;

    public mla(Context context, int i) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        d53 d53Var = d53.h;
        this.f = new ln(this, 0L, 320L, d53Var);
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
        ho hoVar = new ho(false, true, true);
        this.y = hoVar;
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new Path();
        this.K = new ln(this, 0L, 350L, d53Var);
        this.L = new ln(this, 0L, 350L, d53Var);
        this.R = new TextPaint(1);
        this.a = i;
        hoVar.x(gm.o());
        hoVar.n(0.3f, 40L, d53Var);
        hoVar.setCallback(this);
        hoVar.u(-1);
        Point point = gm.q;
        hoVar.N = point.x;
        if (i == 0) {
            hoVar.w(gm.L(15.0f));
            this.E = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            hoVar.w(gm.L(14.0f));
            hoVar.b = 5;
            ho hoVar2 = new ho(false, true, true);
            this.E = hoVar2;
            hoVar2.N = point.x;
            hoVar2.w(gm.L(14.0f));
            hoVar2.x(gm.o());
            hoVar2.n(0.3f, 40L, d53Var);
            hoVar2.setCallback(this);
            hoVar2.u(-1);
            if (i == 1) {
                hoVar2.t(jb6.M0(2131750623, null), true, true);
            } else if (i == 2) {
                hoVar2.t(jb6.M0(2131750624, null), true, true);
            } else if (i == 3) {
                hoVar2.t(jb6.M0(2131742617, null), true, true);
            }
        }
        hoVar.t("", true, true);
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
        ho hoVar = this.y;
        if (!TextUtils.equals(hoVar.i, str)) {
            hoVar.a();
            if (this.e) {
                j = 320;
            } else {
                j = 40;
            }
            hoVar.n(0.3f, j, d53.h);
            hoVar.t(str, true, true);
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
        RectF rectF = gm.P;
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
        ho hoVar = this.y;
        if (b == 0) {
            hoVar.setBounds(gm.L(42.0f), -gm.L(1.0f), this.P, this.Q - gm.L(1.0f));
            hoVar.draw(canvas);
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
            canvas.translate((1.0f - d2) * (-gm.N(0.33f)), 0.0f);
            Paint paint = this.w;
            paint.setAlpha((int) (d2 * 255.0f));
            canvas.drawPath(this.I, paint);
            canvas.restore();
            if (d > 0.5d) {
                z2 = true;
            }
            float d3 = this.L.d(z2);
            canvas.save();
            canvas.translate((1.0f - d3) * (-gm.N(0.66f)), 0.0f);
            Paint paint2 = this.x;
            paint2.setAlpha((int) (d3 * 255.0f));
            canvas.drawPath(this.J, paint2);
            canvas.restore();
        } else {
            int c = (this.P - ((int) hoVar.c())) - gm.L(6.0f);
            int L = this.Q - gm.L(1.0f);
            ho hoVar2 = this.E;
            hoVar2.setBounds(gm.L(12.33f), -gm.L(1.0f), c, L);
            hoVar2.draw(canvas);
            hoVar.setBounds(this.P - gm.L(111.0f), -gm.L(1.0f), this.P - gm.L(11.0f), this.Q - gm.L(1.0f));
            hoVar.draw(canvas);
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
                f = td4.A(f2, f3, this.d, f3);
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
                f4 = td4.A(f5, f6, i, f6);
            }
            if (z) {
                if ((f4 <= f6 && f > f4) || (f4 >= f5 && f < f4)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f * 5.0f) != Math.floor(5.0f * f4)) {
                    gm.W3(this);
                }
            }
            d(f4);
            qac qacVar = this.h;
            if (qacVar != null) {
                qacVar.a(Float.valueOf(f4));
            }
        }
        this.M = x;
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        this.O = gm.L(12.0f);
        TextPaint textPaint = this.R;
        textPaint.setTextSize(gm.L(16.0f));
        this.y.w(gm.L(15.0f));
        int i3 = this.S;
        byte b = this.a;
        if (i3 > 0) {
            this.P = i3;
            L = gm.L(48.0f);
            this.Q = L;
        } else if (b == 0) {
            this.P = (int) Math.min(textPaint.measureText(jb6.M0(2131744409, null)) + gm.L(88.0f), View.MeasureSpec.getSize(i));
            L = gm.L(48.0f);
            this.Q = L;
        } else {
            this.P = gm.L(190.0f);
            L = gm.L(44.0f);
            this.Q = L;
        }
        setMeasuredDimension(this.P, L);
        if (b == 0) {
            float L2 = gm.L(25.0f);
            float f = this.Q / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(gm.N(1.33f)));
            Path path = this.G;
            path.rewind();
            path.moveTo(L2 - gm.N(8.66f), f - gm.N(2.9f));
            path.lineTo(L2 - gm.N(3.0f), f - gm.N(2.9f));
            path.lineTo(L2 - gm.N(3.0f), gm.N(2.9f) + f);
            path.lineTo(L2 - gm.N(8.66f), gm.N(2.9f) + f);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(gm.N(2.66f)));
            Path path2 = this.H;
            path2.rewind();
            path2.moveTo(L2 - gm.N(7.5f), f);
            path2.lineTo(L2, f - gm.N(7.33f));
            path2.lineTo(L2, gm.N(7.33f) + f);
            path2.close();
            Path path3 = this.I;
            path3.rewind();
            RectF rectF = gm.P;
            rectF.set((L2 - gm.N(0.33f)) - gm.L(4.33f), f - gm.L(4.33f), (L2 - gm.N(0.33f)) + gm.L(4.33f), gm.L(4.33f) + f);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.x;
            paint.setStyle(style);
            paint.setStrokeWidth(gm.L(2.0f));
            Path path4 = this.J;
            path4.rewind();
            rectF.set((L2 - gm.N(0.33f)) - gm.L(8.0f), f - gm.L(8.0f), (L2 - gm.N(0.33f)) + gm.L(8.0f), f + gm.L(8.0f));
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
