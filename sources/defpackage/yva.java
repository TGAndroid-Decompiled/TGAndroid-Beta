package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
public abstract class yva extends View {
    public LinearGradient E;
    public final Matrix F;
    public boolean G;
    public final Drawable H;
    public final gn I;
    public final gn J;
    public final cm2[] K;
    public final Paint L;
    public final tgb M;
    public final lm N;
    public final lm O;
    public boolean P;
    public long Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final RectF U;
    public final Path V;
    public final Path W;
    public final wjb a;
    public final Path a0;
    public final Paint b;
    public final RectF b0;
    public final Paint c;
    public final Path c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public float e0;
    public final Paint f;
    public int[] f0;
    public final fm0 g0;
    public final vva h;
    public float h0;
    public float i0;
    public long j0;
    public int k0;
    public boolean l0;
    public ValueAnimator m0;
    public final vva n;
    public int r;
    public int s;
    public ValueAnimator w;
    public int x;
    public int y;

    public yva(Context context, wjb wjbVar) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.h = new vva(0, 300);
        this.n = new vva(2, 30);
        this.r = -1135603;
        this.s = -404714;
        this.x = -1135603;
        this.y = -404714;
        this.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = new Matrix();
        this.G = true;
        gn gnVar = new gn(false, true, true);
        this.I = gnVar;
        gn gnVar2 = new gn(false, true, true);
        this.J = gnVar2;
        this.K = new cm2[1];
        Paint paint = new Paint(1);
        this.L = paint;
        this.M = new tgb(k96.M0(2131744800, null), 14.0f, gl.n1("fonts/rcondensedbold.ttf"));
        s33 s33Var = s33.h;
        this.N = new lm(this, 0L, 320L, s33Var);
        this.O = new lm(this, 0L, 320L, s33Var);
        this.Q = -1L;
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new RectF();
        this.V = new Path();
        this.W = new Path();
        this.a0 = new Path();
        this.b0 = new RectF();
        this.c0 = new Path();
        this.d0 = 0.0f;
        this.g0 = new fm0(320L, this, s33Var);
        this.a = wjbVar;
        Drawable d = b00.d(context, 2131232312);
        this.H = d;
        d.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        gnVar.u(-1);
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.w(gl.L(21.0f));
        gnVar.setCallback(this);
        Point point = gl.q;
        gnVar.N = point.x;
        gnVar.b = 17;
        gnVar2.u(-570425345);
        gnVar2.w(gl.L(11.0f));
        gnVar2.setCallback(this);
        gnVar2.N = point.x;
        gnVar2.b = 17;
        paint.setColor(bkb.v0(bkb.g5, wjbVar));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(1.0f));
    }

    public final void a(float f) {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, f);
        this.m0 = ofFloat;
        ofFloat.addUpdateListener(new gja(this, (byte) 7));
        int value = getValue();
        this.m0.addListener(new ee4(this, f, value));
        this.m0.setDuration(320L);
        this.m0.setInterpolator(s33.h);
        this.m0.start();
        if (c(f) != value) {
            e(c(f));
        }
        gn gnVar = this.I;
        gnVar.a();
        gnVar.t(jva.Y0(false, k96.E(c(f), ','), this.K), true, true);
    }

    public final float b(int i) {
        int i2;
        int i3 = 1;
        while (true) {
            int[] iArr = this.f0;
            if (i3 < iArr.length) {
                if (i <= iArr[i3]) {
                    int i4 = i3 - 1;
                    int i5 = iArr[i4];
                    return (i4 + ((i - i5) / (i2 - i5))) / (iArr.length - 1);
                }
                i3++;
            } else {
                return 1.0f;
            }
        }
    }

    public final int c(float f) {
        int i;
        if (f <= 0.0f) {
            return this.f0[0];
        }
        int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        int[] iArr = this.f0;
        if (i2 >= 0) {
            return iArr[iArr.length - 1];
        }
        float length = f * (iArr.length - 1);
        int i3 = (int) length;
        float f2 = length - i3;
        float f3 = iArr[i3];
        int i4 = i3 + 1;
        if (i4 < iArr.length) {
            i3 = i4;
        }
        return Math.round((f2 * (iArr[i3] - i)) + f3);
    }

    public boolean d(float f) {
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f;
        lm lmVar;
        int i;
        Path path;
        Paint paint2;
        RectF rectF;
        Canvas canvas2;
        int i2;
        float f2;
        float f3;
        float f4;
        boolean z;
        boolean z2;
        float f5;
        boolean z3;
        boolean z4;
        float f6;
        super.dispatchDraw(canvas);
        Matrix matrix = this.F;
        matrix.reset();
        RectF rectF2 = this.R;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.E.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.E;
        Paint paint3 = this.c;
        paint3.setShader(linearGradient);
        int f7 = bm2.f(this.d0, this.r, this.s);
        Path path2 = this.V;
        path2.rewind();
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, gl.L(12.0f), gl.L(12.0f), direction);
        int p1 = bkb.p1(0.15f, this.r);
        Paint paint4 = this.b;
        paint4.setColor(p1);
        canvas.drawPath(path2, paint4);
        RectF rectF3 = this.S;
        rectF3.set(rectF2);
        float b = b(getValue());
        rectF3.right = gl.R1(rectF3.left + gl.L(24.0f), rectF3.right, b);
        Path path3 = this.W;
        path3.rewind();
        path3.addRoundRect(rectF3, gl.L(12.0f), gl.L(12.0f), direction);
        vva vvaVar = this.h;
        vvaVar.g(rectF2);
        float f8 = this.d0;
        vvaVar.h = (f8 * 15.0f) + 1.0f;
        vvaVar.j = (int) (vvaVar.b.size() * ((f8 * 0.85f) + 0.15f));
        vvaVar.d();
        canvas.save();
        canvas.clipPath(path2);
        vvaVar.a(canvas, f7);
        long j = this.Q;
        int i3 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        lm lmVar2 = this.O;
        lm lmVar3 = this.N;
        tgb tgbVar = this.M;
        Paint paint5 = this.L;
        if (i3 != 0 && b((int) j) < 1.0f && b((int) this.Q) > 0.0f) {
            float L = rectF2.left + gl.L(12.0f) + (Utilities.l(b((int) this.Q)) * (rectF2.width() - gl.L(24.0f)));
            if (Math.abs((rectF3.right - gl.L(10.0f)) - L) < gl.L(14.0f)) {
                z3 = true;
            } else {
                z3 = false;
            }
            float d = lmVar3.d(z3);
            int L2 = gl.L(9.0f);
            int L3 = gl.L(16.0f);
            if (Math.abs((rectF3.right - gl.L(10.0f)) - L) < gl.L(12.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            float U1 = gl.U1(lmVar2.d(z4), L2, L3);
            if (L + tgbVar.c + (gl.L(16.0f) << 1) > rectF2.right) {
                f6 = (L - U1) - tgbVar.c;
            } else {
                f6 = L + U1;
            }
            float f9 = f6;
            paint5.setStrokeWidth(gl.L(1.0f));
            paint5.setColor(bkb.p1(0.6f, f7));
            paint = paint4;
            f = b;
            lmVar = lmVar2;
            i = f7;
            rectF = rectF3;
            canvas.drawLine(L, gl.R1(rectF2.top, rectF2.centerY(), d), L, gl.R1(rectF2.bottom, rectF2.centerY(), d), paint5);
            path = path3;
            paint2 = paint5;
            this.M.c(f9, rectF2.centerY(), 0.6f, i, canvas);
            canvas2 = canvas;
        } else {
            paint = paint4;
            f = b;
            lmVar = lmVar2;
            i = f7;
            path = path3;
            paint2 = paint5;
            rectF = rectF3;
            canvas2 = canvas;
        }
        Path path4 = path;
        canvas2.drawPath(path4, paint3);
        canvas2.clipPath(path4);
        vvaVar.a(canvas2, -1);
        long j2 = this.Q;
        if (j2 != -1 && b((int) j2) < 1.0f && b((int) this.Q) > 0.0f) {
            float L4 = rectF2.left + gl.L(12.0f) + (Utilities.l(b((int) this.Q)) * (rectF2.width() - gl.L(24.0f)));
            if (Math.abs((rectF.right - gl.L(10.0f)) - L4) < gl.L(14.0f)) {
                z = true;
            } else {
                z = false;
            }
            float d2 = lmVar3.d(z);
            int L5 = gl.L(9.0f);
            int L6 = gl.L(16.0f);
            if (Math.abs((rectF.right - gl.L(10.0f)) - L4) < gl.L(12.0f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            float U12 = gl.U1(lmVar.d(z2), L5, L6);
            if (tgbVar.c + L4 + (gl.L(16.0f) << 1) > rectF2.right) {
                f5 = (L4 - U12) - tgbVar.c;
            } else {
                f5 = U12 + L4;
            }
            float f10 = f5;
            paint2.setStrokeWidth(gl.L(1.0f));
            paint2.setColor(bkb.p1(0.4f, bkb.v0(bkb.g5, this.a)));
            i2 = i;
            canvas2.drawLine(L4, gl.R1(rectF2.top, rectF2.centerY(), d2), L4, gl.R1(rectF2.bottom, rectF2.centerY(), d2), paint2);
            this.M.c(f10, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i2 = i;
        }
        canvas2.restore();
        invalidate();
        if (this.P) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int f11 = bm2.f(0.5f, paint.getColor(), this.s);
            Paint paint6 = this.d;
            paint6.setColor(f11);
            Path path5 = this.a0;
            path5.rewind();
            f2 = 0.5f;
            f3 = 2.0f;
            f4 = 0.15f;
            path5.addRoundRect(height - gl.L(1.0f), centerY - gl.L(6.0f), gl.L(1.0f) + height, centerY + gl.L(6.0f), gl.L(1.0f), gl.L(1.0f), direction);
            path5.addRoundRect(height - gl.L(6.0f), centerY - gl.L(1.0f), height + gl.L(6.0f), centerY + gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), direction);
            canvas2.drawPath(path5, paint6);
        } else {
            f2 = 0.5f;
            f3 = 2.0f;
            f4 = 0.15f;
        }
        float L7 = (rectF.right - gl.L(16.0f)) - gl.L(4.0f);
        float centerY2 = rectF.centerY() - (gl.L(16.0f) / f3);
        float L8 = rectF.right - gl.L(4.0f);
        float L9 = (gl.L(16.0f) / f3) + rectF.centerY();
        RectF rectF4 = this.T;
        rectF4.set(L7, centerY2, L8, L9);
        canvas2.drawRoundRect(rectF4, gl.L(12.0f), gl.L(12.0f), this.e);
        float L10 = gl.L(9.0f) / rectF2.width();
        float R1 = gl.R1(gl.R1(rectF4.left, rectF4.right, f), gl.R1(rectF4.left + gl.L(9.0f), rectF4.right - gl.L(9.0f), f), Math.min(Utilities.l(f / L10), Utilities.l((1.0f - f) / L10)));
        gn gnVar = this.J;
        float c = gnVar.c() + gl.L(20.0f);
        gn gnVar2 = this.I;
        float max = Math.max(c, gnVar2.c() + gl.L(50.0f));
        float i4 = Utilities.i(R1 - (max / f3), (rectF2.right - max) - gl.L(4.0f), rectF2.left + gl.L(4.0f));
        float L11 = rectF2.top - gl.L(21.0f);
        float L12 = rectF2.top - gl.L(21.0f);
        RectF rectF5 = this.b0;
        rectF5.set(i4, L11 - gl.L(44.0f), max + i4, L12);
        float height2 = rectF5.height();
        float f12 = height2 / f3;
        float i5 = Utilities.i(R1, rectF5.right, rectF5.left);
        float i6 = Utilities.i(i5 - gl.L(9.0f), rectF5.right, rectF5.left);
        float i7 = Utilities.i(gl.L(9.0f) + i5, rectF5.right, rectF5.left);
        float i8 = Utilities.i(this.d0 - this.e0, 1.0f, -1.0f) * 60.0f;
        float f13 = f4;
        float L13 = rectF5.bottom + gl.L(8.0f);
        Path path6 = this.c0;
        path6.rewind();
        float f14 = rectF5.left;
        float f15 = rectF5.top;
        RectF rectF6 = this.U;
        rectF6.set(f14, f15, f14 + height2, f15 + height2);
        path6.arcTo(rectF6, -180.0f, 90.0f);
        float f16 = rectF5.right;
        float f17 = rectF5.top;
        rectF6.set(f16 - height2, f17, f16, f17 + height2);
        path6.arcTo(rectF6, -90.0f, 90.0f);
        float f18 = rectF5.right;
        float f19 = rectF5.bottom;
        rectF6.set(f18 - height2, f19 - height2, f18, f19);
        int i9 = i2;
        path6.arcTo(rectF6, 0.0f, (float) Utilities.h(((Math.acos(Utilities.l((i7 - rectF6.centerX()) / f12)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d));
        float f20 = 0.7f * height2;
        if (i6 < rectF5.right - f20) {
            path6.lineTo(i7, rectF5.bottom);
            path6.lineTo(i5 + f3, rectF5.bottom + gl.L(8.0f));
        }
        path6.lineTo(i5, rectF5.bottom + gl.L(8.0f) + 1.0f);
        if (i7 > rectF5.left + f20) {
            path6.lineTo(i5 - f3, rectF5.bottom + gl.L(8.0f));
            path6.lineTo(i6, rectF5.bottom);
        }
        float f21 = rectF5.left;
        float f22 = rectF5.bottom;
        rectF6.set(f21, f22 - height2, f21 + height2, f22);
        float h = ((float) Utilities.h(((Math.acos(Utilities.l((i6 - rectF6.left) / f12)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d)) + 90.0f;
        path6.arcTo(rectF6, h, 180.0f - h);
        path6.lineTo(rectF5.left, rectF5.bottom);
        path6.close();
        RectF rectF7 = gl.P;
        rectF7.set(rectF5);
        rectF7.inset(-gl.L(12.0f), -gl.L(12.0f));
        vva vvaVar2 = this.n;
        vvaVar2.g(rectF7);
        vvaVar2.h = (this.d0 * 15.0f) + 1.0f;
        vvaVar2.d();
        canvas2.save();
        vvaVar2.a(canvas2, i9);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(i8, i5, L13);
        if (Math.abs(this.d0 - this.e0) > 0.001f) {
            this.e0 = gl.R1(this.e0, this.d0, 0.1f);
            invalidate();
        }
        LinearGradient linearGradient2 = this.E;
        Paint paint7 = this.f;
        paint7.setShader(linearGradient2);
        canvas2.drawPath(path6, paint7);
        canvas2.save();
        canvas2.clipPath(path6);
        canvas2.rotate(-i8, i5, L13);
        vvaVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        fm0 fm0Var = this.g0;
        float f23 = 1.0f - (fm0Var.e * f13);
        canvas2.scale(f23, f23, rectF5.centerX(), rectF5.top - (rectF5.height() * f2));
        Drawable drawable = this.H;
        drawable.setBounds((int) ((rectF5.centerX() - (gnVar2.c() / f3)) + gl.L(-12.0f)), (int) (rectF5.centerY() - gl.L(10.0f)), (int) ((rectF5.centerX() - (gnVar2.c() / f3)) + gl.L(8.0f)), (int) (rectF5.centerY() + gl.L(10.0f)));
        if (this.G) {
            drawable.draw(canvas2);
        }
        gnVar2.o(rectF5.left + gl.L(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        gnVar2.draw(canvas2);
        canvas2.restore();
        gnVar.o(rectF5.left, rectF5.top + gl.L(10.0f), rectF5.right, rectF5.bottom + gl.L(10.0f));
        gnVar.C = (int) (fm0Var.e * 255.0f);
        gnVar.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h0 = motionEvent.getX();
            this.i0 = motionEvent.getY();
            this.k0 = motionEvent.getPointerId(0);
            this.j0 = System.currentTimeMillis();
            this.l0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.k0) {
            float x = motionEvent.getX() - this.h0;
            float y = motionEvent.getY() - this.i0;
            if (!this.l0 && Math.abs(x) > Math.abs(y * 1.5f) && Math.abs(x) > gl.e) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.l0 = true;
                ValueAnimator valueAnimator = this.m0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.l0) {
                int value = getValue();
                this.d0 = Utilities.l((x / (getWidth() * 1.0f)) + this.d0);
                if (getValue() != value) {
                    e(getValue());
                    gn gnVar = this.I;
                    gnVar.a();
                    gnVar.t(jva.Y0(false, k96.E(getValue(), ','), this.K), true, true);
                }
                this.h0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.l0 && motionEvent.getPointerId(0) == this.k0 && loe.a(this.h0, this.i0, motionEvent.getX(), motionEvent.getY()) < gl.e && ((float) (System.currentTimeMillis() - this.j0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x2 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x2)) {
                    float x3 = motionEvent.getX();
                    RectF rectF = this.R;
                    float l = Utilities.l((x3 - rectF.left) / rectF.width());
                    long j = this.Q;
                    if (j > 0 && Math.abs(b((int) j) - l) < 0.035f) {
                        l = Utilities.l(b((int) this.Q));
                    }
                    a(l);
                }
            }
            this.l0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i);

    public final void f(int i, int i2, boolean z) {
        if (this.x == i && this.y == i2) {
            return;
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w = null;
        }
        if (z) {
            int i3 = this.r;
            int i4 = this.s;
            this.x = i;
            this.y = i2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new l75(this, i3, i, i4, i2, (byte) 2));
            this.w.addListener(new xva(this, i3, i, i4, i2));
            this.w.setInterpolator(s33.h);
            this.w.setDuration(420L);
            this.w.start();
            return;
        }
        this.x = i;
        this.r = i;
        this.y = i2;
        this.s = i2;
        this.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.g0.a(!TextUtils.isEmpty(str), true);
        gn gnVar = this.J;
        gnVar.a();
        gnVar.t(str, true, true);
    }

    public float getProgress() {
        return this.d0;
    }

    public int getValue() {
        return c(this.d0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int L = gl.L(14.0f);
        int L2 = gl.L(135.0f);
        this.R.set(L, L2, measuredWidth - L, gl.L(24.0f) + L2);
        this.c.setColor(-1069811);
        this.e.setColor(-1);
    }

    public void setStarsTop(long j) {
        this.Q = j;
        invalidate();
    }

    public void setTopText(String str) {
        this.M.p(str);
    }

    public void setValue(int i) {
        float b = b(i);
        this.d0 = b;
        this.e0 = b;
        gn gnVar = this.I;
        gnVar.a();
        gnVar.t(jva.Y0(false, k96.E(getValue(), ','), this.K), true, true);
    }

    public void setValueAnimated(int i) {
        if (i == getValue()) {
            return;
        }
        a(b(i));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
