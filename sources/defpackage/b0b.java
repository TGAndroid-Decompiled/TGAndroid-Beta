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
public abstract class b0b extends View {
    public LinearGradient E;
    public final Matrix F;
    public boolean G;
    public final Drawable H;
    public final hn I;
    public final hn J;
    public final wm2[] K;
    public final Paint L;
    public final pkb M;
    public final mm N;
    public final mm O;
    public boolean P;
    public long Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final RectF U;
    public final Path V;
    public final Path W;
    public final vnb a;
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
    public final yza h;
    public float h0;
    public float i0;
    public long j0;
    public int k0;
    public boolean l0;
    public ValueAnimator m0;
    public final yza n;
    public int r;
    public int s;
    public ValueAnimator w;
    public int x;
    public int y;

    public b0b(Context context, vnb vnbVar) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.h = new yza(0, 300);
        this.n = new yza(2, 30);
        this.r = -1135603;
        this.s = -404714;
        this.x = -1135603;
        this.y = -404714;
        this.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = new Matrix();
        this.G = true;
        hn hnVar = new hn(false, true, true);
        this.I = hnVar;
        hn hnVar2 = new hn(false, true, true);
        this.J = hnVar2;
        this.K = new wm2[1];
        Paint paint = new Paint(1);
        this.L = paint;
        this.M = new pkb(ob6.M0(2131744694, null), 14.0f, hl.n1("fonts/rcondensedbold.ttf"));
        k43 k43Var = k43.h;
        this.N = new mm(this, 0L, 320L, k43Var);
        this.O = new mm(this, 0L, 320L, k43Var);
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
        this.g0 = new fm0(320L, this, k43Var);
        this.a = vnbVar;
        Drawable e = c00.e(context, 2131232312);
        this.H = e;
        e.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        hnVar.u(-1);
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.w(hl.L(21.0f));
        hnVar.setCallback(this);
        Point point = hl.q;
        hnVar.N = point.x;
        hnVar.b = 17;
        hnVar2.u(-570425345);
        hnVar2.w(hl.L(11.0f));
        hnVar2.setCallback(this);
        hnVar2.N = point.x;
        hnVar2.b = 17;
        paint.setColor(aob.v0(aob.h5, vnbVar));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.0f));
    }

    public final void a(float f) {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d0, f);
        this.m0 = ofFloat;
        ofFloat.addUpdateListener(new ija(this, (byte) 9));
        int value = getValue();
        this.m0.addListener(new cg4(this, f, value));
        this.m0.setDuration(320L);
        this.m0.setInterpolator(k43.h);
        this.m0.start();
        if (c(f) != value) {
            e(c(f));
        }
        hn hnVar = this.I;
        hnVar.a();
        hnVar.t(nza.Z0(false, ob6.E(c(f), ','), this.K), true, true);
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
        mm mmVar;
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
        int f7 = vm2.f(this.d0, this.r, this.s);
        Path path2 = this.V;
        path2.rewind();
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, hl.L(12.0f), hl.L(12.0f), direction);
        int p1 = aob.p1(0.15f, this.r);
        Paint paint4 = this.b;
        paint4.setColor(p1);
        canvas.drawPath(path2, paint4);
        RectF rectF3 = this.S;
        rectF3.set(rectF2);
        float b = b(getValue());
        rectF3.right = hl.R1(rectF3.left + hl.L(24.0f), rectF3.right, b);
        Path path3 = this.W;
        path3.rewind();
        path3.addRoundRect(rectF3, hl.L(12.0f), hl.L(12.0f), direction);
        yza yzaVar = this.h;
        yzaVar.g(rectF2);
        float f8 = this.d0;
        yzaVar.h = (f8 * 15.0f) + 1.0f;
        yzaVar.j = (int) (yzaVar.b.size() * ((f8 * 0.85f) + 0.15f));
        yzaVar.d();
        canvas.save();
        canvas.clipPath(path2);
        yzaVar.a(canvas, f7);
        long j = this.Q;
        int i3 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        mm mmVar2 = this.O;
        mm mmVar3 = this.N;
        pkb pkbVar = this.M;
        Paint paint5 = this.L;
        if (i3 != 0 && b((int) j) < 1.0f && b((int) this.Q) > 0.0f) {
            float L = rectF2.left + hl.L(12.0f) + (Utilities.l(b((int) this.Q)) * (rectF2.width() - hl.L(24.0f)));
            if (Math.abs((rectF3.right - hl.L(10.0f)) - L) < hl.L(14.0f)) {
                z3 = true;
            } else {
                z3 = false;
            }
            float d = mmVar3.d(z3);
            int L2 = hl.L(9.0f);
            int L3 = hl.L(16.0f);
            if (Math.abs((rectF3.right - hl.L(10.0f)) - L) < hl.L(12.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            float U1 = hl.U1(mmVar2.d(z4), L2, L3);
            if (L + pkbVar.c + (hl.L(16.0f) << 1) > rectF2.right) {
                f6 = (L - U1) - pkbVar.c;
            } else {
                f6 = L + U1;
            }
            float f9 = f6;
            paint5.setStrokeWidth(hl.L(1.0f));
            paint5.setColor(aob.p1(0.6f, f7));
            paint = paint4;
            f = b;
            mmVar = mmVar2;
            i = f7;
            rectF = rectF3;
            canvas.drawLine(L, hl.R1(rectF2.top, rectF2.centerY(), d), L, hl.R1(rectF2.bottom, rectF2.centerY(), d), paint5);
            path = path3;
            paint2 = paint5;
            this.M.c(f9, rectF2.centerY(), 0.6f, i, canvas);
            canvas2 = canvas;
        } else {
            paint = paint4;
            f = b;
            mmVar = mmVar2;
            i = f7;
            path = path3;
            paint2 = paint5;
            rectF = rectF3;
            canvas2 = canvas;
        }
        Path path4 = path;
        canvas2.drawPath(path4, paint3);
        canvas2.clipPath(path4);
        yzaVar.a(canvas2, -1);
        long j2 = this.Q;
        if (j2 != -1 && b((int) j2) < 1.0f && b((int) this.Q) > 0.0f) {
            float L4 = rectF2.left + hl.L(12.0f) + (Utilities.l(b((int) this.Q)) * (rectF2.width() - hl.L(24.0f)));
            if (Math.abs((rectF.right - hl.L(10.0f)) - L4) < hl.L(14.0f)) {
                z = true;
            } else {
                z = false;
            }
            float d2 = mmVar3.d(z);
            int L5 = hl.L(9.0f);
            int L6 = hl.L(16.0f);
            if (Math.abs((rectF.right - hl.L(10.0f)) - L4) < hl.L(12.0f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            float U12 = hl.U1(mmVar.d(z2), L5, L6);
            if (pkbVar.c + L4 + (hl.L(16.0f) << 1) > rectF2.right) {
                f5 = (L4 - U12) - pkbVar.c;
            } else {
                f5 = U12 + L4;
            }
            float f10 = f5;
            paint2.setStrokeWidth(hl.L(1.0f));
            paint2.setColor(aob.p1(0.4f, aob.v0(aob.h5, this.a)));
            i2 = i;
            canvas2.drawLine(L4, hl.R1(rectF2.top, rectF2.centerY(), d2), L4, hl.R1(rectF2.bottom, rectF2.centerY(), d2), paint2);
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
            int f11 = vm2.f(0.5f, paint.getColor(), this.s);
            Paint paint6 = this.d;
            paint6.setColor(f11);
            Path path5 = this.a0;
            path5.rewind();
            f2 = 0.5f;
            f3 = 2.0f;
            f4 = 0.15f;
            path5.addRoundRect(height - hl.L(1.0f), centerY - hl.L(6.0f), hl.L(1.0f) + height, centerY + hl.L(6.0f), hl.L(1.0f), hl.L(1.0f), direction);
            path5.addRoundRect(height - hl.L(6.0f), centerY - hl.L(1.0f), height + hl.L(6.0f), centerY + hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), direction);
            canvas2.drawPath(path5, paint6);
        } else {
            f2 = 0.5f;
            f3 = 2.0f;
            f4 = 0.15f;
        }
        float L7 = (rectF.right - hl.L(16.0f)) - hl.L(4.0f);
        float centerY2 = rectF.centerY() - (hl.L(16.0f) / f3);
        float L8 = rectF.right - hl.L(4.0f);
        float L9 = (hl.L(16.0f) / f3) + rectF.centerY();
        RectF rectF4 = this.T;
        rectF4.set(L7, centerY2, L8, L9);
        canvas2.drawRoundRect(rectF4, hl.L(12.0f), hl.L(12.0f), this.e);
        float L10 = hl.L(9.0f) / rectF2.width();
        float R1 = hl.R1(hl.R1(rectF4.left, rectF4.right, f), hl.R1(rectF4.left + hl.L(9.0f), rectF4.right - hl.L(9.0f), f), Math.min(Utilities.l(f / L10), Utilities.l((1.0f - f) / L10)));
        hn hnVar = this.J;
        float c = hnVar.c() + hl.L(20.0f);
        hn hnVar2 = this.I;
        float max = Math.max(c, hnVar2.c() + hl.L(50.0f));
        float i4 = Utilities.i(R1 - (max / f3), (rectF2.right - max) - hl.L(4.0f), rectF2.left + hl.L(4.0f));
        float L11 = rectF2.top - hl.L(21.0f);
        float L12 = rectF2.top - hl.L(21.0f);
        RectF rectF5 = this.b0;
        rectF5.set(i4, L11 - hl.L(44.0f), max + i4, L12);
        float height2 = rectF5.height();
        float f12 = height2 / f3;
        float i5 = Utilities.i(R1, rectF5.right, rectF5.left);
        float i6 = Utilities.i(i5 - hl.L(9.0f), rectF5.right, rectF5.left);
        float i7 = Utilities.i(hl.L(9.0f) + i5, rectF5.right, rectF5.left);
        float i8 = Utilities.i(this.d0 - this.e0, 1.0f, -1.0f) * 60.0f;
        float f13 = f4;
        float L13 = rectF5.bottom + hl.L(8.0f);
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
            path6.lineTo(i5 + f3, rectF5.bottom + hl.L(8.0f));
        }
        path6.lineTo(i5, rectF5.bottom + hl.L(8.0f) + 1.0f);
        if (i7 > rectF5.left + f20) {
            path6.lineTo(i5 - f3, rectF5.bottom + hl.L(8.0f));
            path6.lineTo(i6, rectF5.bottom);
        }
        float f21 = rectF5.left;
        float f22 = rectF5.bottom;
        rectF6.set(f21, f22 - height2, f21 + height2, f22);
        float h = ((float) Utilities.h(((Math.acos(Utilities.l((i6 - rectF6.left) / f12)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d)) + 90.0f;
        path6.arcTo(rectF6, h, 180.0f - h);
        path6.lineTo(rectF5.left, rectF5.bottom);
        path6.close();
        RectF rectF7 = hl.P;
        rectF7.set(rectF5);
        rectF7.inset(-hl.L(12.0f), -hl.L(12.0f));
        yza yzaVar2 = this.n;
        yzaVar2.g(rectF7);
        yzaVar2.h = (this.d0 * 15.0f) + 1.0f;
        yzaVar2.d();
        canvas2.save();
        yzaVar2.a(canvas2, i9);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(i8, i5, L13);
        if (Math.abs(this.d0 - this.e0) > 0.001f) {
            this.e0 = hl.R1(this.e0, this.d0, 0.1f);
            invalidate();
        }
        LinearGradient linearGradient2 = this.E;
        Paint paint7 = this.f;
        paint7.setShader(linearGradient2);
        canvas2.drawPath(path6, paint7);
        canvas2.save();
        canvas2.clipPath(path6);
        canvas2.rotate(-i8, i5, L13);
        yzaVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        fm0 fm0Var = this.g0;
        float f23 = 1.0f - (fm0Var.e * f13);
        canvas2.scale(f23, f23, rectF5.centerX(), rectF5.top - (rectF5.height() * f2));
        Drawable drawable = this.H;
        drawable.setBounds((int) ((rectF5.centerX() - (hnVar2.c() / f3)) + hl.L(-12.0f)), (int) (rectF5.centerY() - hl.L(10.0f)), (int) ((rectF5.centerX() - (hnVar2.c() / f3)) + hl.L(8.0f)), (int) (rectF5.centerY() + hl.L(10.0f)));
        if (this.G) {
            drawable.draw(canvas2);
        }
        hnVar2.o(rectF5.left + hl.L(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        hnVar2.draw(canvas2);
        canvas2.restore();
        hnVar.o(rectF5.left, rectF5.top + hl.L(10.0f), rectF5.right, rectF5.bottom + hl.L(10.0f));
        hnVar.C = (int) (fm0Var.e * 255.0f);
        hnVar.draw(canvas2);
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
            if (!this.l0 && Math.abs(x) > Math.abs(y * 1.5f) && Math.abs(x) > hl.e) {
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
                    hn hnVar = this.I;
                    hnVar.a();
                    hnVar.t(nza.Z0(false, ob6.E(getValue(), ','), this.K), true, true);
                }
                this.h0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.l0 && motionEvent.getPointerId(0) == this.k0 && dte.a(this.h0, this.i0, motionEvent.getX(), motionEvent.getY()) < hl.e && ((float) (System.currentTimeMillis() - this.j0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
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
            ofFloat.addUpdateListener(new n95(this, i3, i, i4, i2, (byte) 2));
            this.w.addListener(new a0b(this, i3, i, i4, i2));
            this.w.setInterpolator(k43.h);
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
        hn hnVar = this.J;
        hnVar.a();
        hnVar.t(str, true, true);
    }

    public float getProgress() {
        return this.d0;
    }

    public int getValue() {
        return c(this.d0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int L = hl.L(14.0f);
        int L2 = hl.L(135.0f);
        this.R.set(L, L2, measuredWidth - L, hl.L(24.0f) + L2);
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
        hn hnVar = this.I;
        hnVar.a();
        hnVar.t(nza.Z0(false, ob6.E(getValue(), ','), this.K), true, true);
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
