package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class e1b extends View implements gk7 {
    public int E;
    public ValueAnimator F;
    public v61 G;
    public float H;
    public ValueAnimator I;
    public RectF a;
    public f15[] b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float f;
    public ImageReceiver h;
    public Long n;
    public gn r;
    public gn s;
    public CharSequence w;
    public TextPaint x;
    public StaticLayout y;

    public final long a() {
        if (this.b == null) {
            return 0L;
        }
        long j = 0;
        for (int i = 0; i < this.b.length; i++) {
            long f = this.G.f(i);
            f15 f15Var = this.b[i];
            if (f15Var != null && (f15Var.b || f > 0)) {
                if (f <= 0) {
                    f = f15Var.d;
                }
                j += f;
            }
        }
        return j;
    }

    public abstract void b();

    public final void c(boolean z) {
        boolean z2;
        f15[] f15VarArr = this.b;
        if (f15VarArr == null) {
            return;
        }
        long j = 0;
        for (int i = 0; i < f15VarArr.length; i++) {
            long f = this.G.f(i);
            f15 f15Var = f15VarArr[i];
            if (f15Var != null && (f15Var.b || f > 0)) {
                if (f <= 0) {
                    f = f15Var.d;
                }
                j += f;
            }
        }
        this.E = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < f15VarArr.length; i2++) {
            long f4 = this.G.f(i2);
            f15 f15Var2 = f15VarArr[i2];
            if (f15Var2 != null && (f15Var2.b || f4 > 0)) {
                this.E++;
            }
            if (f15Var2 != null && ((z2 = f15Var2.b) || f4 > 0)) {
                int i3 = (f4 > 0L ? 1 : (f4 == 0L ? 0 : -1));
                if (i3 <= 0) {
                    f4 = f15Var2.d;
                }
                float f5 = ((float) f4) / ((float) j);
                if (f5 < 0.02777f) {
                    f5 = 0.02777f;
                }
                f2 += f5;
                if (f5 > f3 && (z2 || i3 > 0)) {
                    f3 = f5;
                }
                this.d[i2] = f5;
            } else {
                this.d[i2] = 0.0f;
            }
        }
        if (f2 > 1.0f) {
            float f6 = 1.0f / f2;
            for (int i4 = 0; i4 < f15VarArr.length; i4++) {
                if (f15VarArr[i4] != null) {
                    float[] fArr = this.d;
                    fArr[i4] = fArr[i4] * f6;
                }
            }
        }
        if (!z) {
            System.arraycopy(this.d, 0, this.c, 0, f15VarArr.length);
            return;
        }
        System.arraycopy(this.c, 0, this.e, 0, f15VarArr.length);
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.F.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new pk(this, f15VarArr, (byte) 27));
        this.F.addListener(new ng9(f15VarArr, (byte) 24));
        this.F.setDuration(450L);
        this.F.setInterpolator(new c84());
        this.F.start();
    }

    public final long d() {
        String str;
        long a = a();
        String str2 = " ";
        String[] split = gl.i0(a, false, false).split(" ");
        if (split.length > 1) {
            gn gnVar = this.r;
            int i = (a > 0L ? 1 : (a == 0L ? 0 : -1));
            if (i == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            gnVar.t(str, true, false);
            gn gnVar2 = this.s;
            if (i != 0) {
                str2 = split[1];
            }
            gnVar2.t(str2, true, false);
        }
        return a;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        kk7.e().b(this, kk7.k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        kk7.e().n(this, kk7.k4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        int i3;
        gn gnVar = this.s;
        ImageReceiver imageReceiver = this.h;
        gn gnVar2 = this.r;
        RectF rectF = this.a;
        if (this.b != null) {
            float f5 = 1.0f;
            float f6 = 0.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f7 = this.H;
                    if (f7 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / gl.r) / 100.0f) + f7;
                        this.H = min;
                        this.H = Utilities.i(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float A = tb4.A(1.0f, this.H, 0.15f, 0.85f);
                canvas.scale(A, A, imageReceiver.r(), imageReceiver.s());
            }
            int i4 = this.E;
            float f8 = this.f;
            if (i4 > 1) {
                if (f8 > 0.0f) {
                    float f9 = (float) (f8 - 0.04d);
                    this.f = f9;
                    if (f9 < 0.0f) {
                        this.f = 0.0f;
                    }
                }
            } else if (f8 < 1.0f) {
                float f10 = (float) (f8 + 0.04d);
                this.f = f10;
                if (f10 > 1.0f) {
                    this.f = 1.0f;
                }
            }
            boolean z = false;
            float f11 = 0.0f;
            int i5 = 0;
            while (true) {
                f15[] f15VarArr = this.b;
                i = 255;
                f = 10.0f;
                f2 = f6;
                if (i5 >= f15VarArr.length) {
                    break;
                }
                f15 f15Var = f15VarArr[i5];
                if (f15Var != null) {
                    float f12 = this.c[i5];
                    if (f12 != f2) {
                        if (f15Var.c) {
                            float A2 = tb4.A(1.0f, this.f, 10.0f, f12 * (-360.0f));
                            if (A2 > f2) {
                                A2 = f2;
                            }
                            ((Paint) f15Var.e).setColor(bkb.w0(null, f15Var.a, z));
                            ((Paint) this.b[i5].e).setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i3 = i5;
                            if (Math.abs((float) (A2 * ((3.141592653589793d * width) / 180.0d))) <= 1.0f) {
                                double d = (-90.0f) - (360.0f * f11);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), (Paint) this.b[i3].e);
                            } else {
                                ((Paint) this.b[i3].e).setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f11), A2, false, (Paint) this.b[i3].e);
                            }
                        } else {
                            i3 = i5;
                        }
                        f11 += f12;
                        i5 = i3 + 1;
                        f6 = f2;
                        z = false;
                    }
                }
                i3 = i5;
                i5 = i3 + 1;
                f6 = f2;
                z = false;
            }
            float f13 = f2;
            int i6 = 0;
            while (true) {
                f15[] f15VarArr2 = this.b;
                if (i6 >= f15VarArr2.length) {
                    break;
                }
                f15 f15Var2 = f15VarArr2[i6];
                if (f15Var2 != null) {
                    float f14 = this.c[i6];
                    if (f14 != f2) {
                        if (!f15Var2.c) {
                            float A3 = tb4.A(f5, this.f, f, f14 * (-360.0f));
                            if (A3 > f2) {
                                A3 = f2;
                            }
                            ((Paint) f15Var2.e).setColor(bkb.w0(null, f15Var2.a, false));
                            ((Paint) this.b[i6].e).setAlpha(i);
                            double width2 = rectF.width() / 2.0f;
                            f4 = f5;
                            if (Math.abs((float) (A3 * ((width2 * 3.141592653589793d) / 180.0d))) <= f4) {
                                double d2 = (-90.0f) - (f13 * 360.0f);
                                RectF rectF2 = rectF;
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d2)) * width2)), rectF2.centerY() + ((float) (Math.sin(Math.toRadians(d2)) * width2)), (Paint) this.b[i6].e);
                                rectF = rectF2;
                                f3 = 10.0f;
                                i2 = 255;
                            } else {
                                ((Paint) this.b[i6].e).setStyle(Paint.Style.STROKE);
                                rectF = rectF;
                                f3 = 10.0f;
                                i2 = 255;
                                canvas.drawArc(rectF, (-90.0f) - (f13 * 360.0f), A3, false, (Paint) this.b[i6].e);
                            }
                        } else {
                            i2 = i;
                            f3 = f;
                            f4 = f5;
                        }
                        f13 += f14;
                        i6++;
                        f = f3;
                        i = i2;
                        f5 = f4;
                    }
                }
                i2 = i;
                f3 = f;
                f4 = f5;
                i6++;
                f = f3;
                i = i2;
                f5 = f4;
            }
            if (imageReceiver != null) {
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (gnVar2 != null) {
                int i7 = bkb.i5;
                gnVar2.u(bkb.w0(null, i7, false));
                gnVar.u(bkb.w0(null, i7, false));
                if (this.n != null) {
                    float c = gnVar.c() + gnVar2.c() + gl.L(4.0f);
                    float width3 = (getWidth() - c) / 2.0f;
                    gnVar2.setBounds(0, gl.L(115.0f), (int) (gnVar2.c() + width3), gl.L(145.0f));
                    gnVar.setBounds((int) ((width3 + c) - gnVar.c()), gl.L(118.0f), getWidth(), gl.L(148.0f));
                }
                gnVar2.draw(canvas);
                gnVar.draw(canvas);
            }
            if (this.y != null) {
                canvas.save();
                de9.n(this.y.getHeight() - gl.L(13.0f), 2.0f, gl.L(148.0f), gl.L(30.0f), canvas);
                this.x.setColor(bkb.w0(null, bkb.i5, false));
                this.y.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        CharSequence charSequence = this.w;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.a;
        gn gnVar = this.s;
        gn gnVar2 = this.r;
        Long l = this.n;
        if (l != null) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(166.0f), 1073741824));
            i3 = ug8.D(110.0f, View.MeasureSpec.getSize(i), 2);
            rectF.set(gl.L(3.0f) + i3, gl.L(3.0f), gl.L(107.0f) + i3, gl.L(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(110.0f), 1073741824));
            rectF.set(gl.L(3.0f), gl.L(3.0f), gl.L(107.0f), gl.L(107.0f));
            i3 = 0;
        }
        s33 s33Var = s33.h;
        gnVar2.n(0.18f, 300L, s33Var);
        gnVar2.w(gl.L(24.0f));
        gnVar2.x(gl.o());
        gnVar.n(0.18f, 300L, s33Var);
        if (l != null) {
            gnVar.w(gl.L(16.0f));
            gnVar2.b = 5;
            gnVar.b = 3;
        } else {
            gnVar.w(gl.L(13.0f));
            int textSize = (int) gnVar2.a.getTextSize();
            int textSize2 = (int) gnVar.a.getTextSize();
            int L = ((gl.L(110.0f) - textSize) - textSize2) / 2;
            int i4 = textSize + L;
            gnVar2.setBounds(0, L, getMeasuredWidth(), i4);
            gnVar.setBounds(0, gl.L(2.0f) + i4, getMeasuredWidth(), gl.L(2.0f) + i4 + textSize2);
            gnVar2.b = 17;
            gnVar.b = 17;
        }
        if (charSequence != null) {
            TextPaint textPaint = this.x;
            if (textPaint == null) {
                textPaint = new TextPaint(1);
                this.x = textPaint;
            }
            textPaint.setTextSize(gl.L(13.0f));
            int size = View.MeasureSpec.getSize(i) - gl.L(60.0f);
            TextPaint textPaint2 = this.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.y = lwa.d(charSequence, textPaint2, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.i0(gl.L(10.0f) + i3, gl.L(10.0f), gl.L(90.0f), gl.L(90.0f));
            imageReceiver.q0(gl.L(45.0f));
        }
        d();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Long l;
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null && (l = this.n) != null && l.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.L0 && motionEvent.getX() <= imageReceiver.w() && motionEvent.getY() > imageReceiver.M0 && motionEvent.getY() <= imageReceiver.x()) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 0) {
            if (z) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z && motionEvent.getAction() != 3) {
                gl.e3(new kya(this, (byte) 3), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(v61 v61Var) {
        this.G = v61Var;
    }

    @Override
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (!z) {
                float f = this.H;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.I = ofFloat;
                    ofFloat.addUpdateListener(new gja(this, (byte) 12));
                    this.I.addListener(new ng9(this, (byte) 25));
                    b00.n(2.0f, this.I);
                    this.I.setDuration(350L);
                    this.I.start();
                }
            }
        }
    }
}
