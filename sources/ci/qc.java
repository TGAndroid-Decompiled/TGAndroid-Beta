package ci;

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
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public abstract class qc extends View {
    public LinearGradient E;
    public final Matrix F;
    public boolean G;
    public final Drawable H;
    public final org.telegram.ui.Components.g6 I;
    public final org.telegram.ui.Components.g6 J;
    public final wp[] K;
    public final Paint L;
    public final ly0 M;
    public final org.telegram.ui.Components.u5 N;
    public final org.telegram.ui.Components.u5 O;
    public boolean P;
    public long Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final RectF U;
    public final Path V;
    public final Path W;
    public final org.telegram.ui.ActionBar.e6 f5856a;
    public final Path f5857a0;
    public final Paint f5858b;
    public final RectF f5859b0;
    public final Paint f5860c;
    public final Path f5861c0;
    public final Paint d;
    public float f5862d0;
    public final Paint f5863e;
    public float f5864e0;
    public final Paint f5865f;
    public int[] f5866f0;
    public final qe.a f5867g0;
    public final lc h;
    public float f5868h0;
    public float f5869i0;
    public long f5870j0;
    public int f5871k0;
    public boolean f5872l0;
    public ValueAnimator m0;
    public final lc f5873n;
    public int f5874r;
    public int f5875s;
    public ValueAnimator f5876w;
    public int f5877x;
    public int f5878y;

    public qc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5858b = new Paint(1);
        this.f5860c = new Paint(1);
        this.d = new Paint(1);
        this.f5863e = new Paint(1);
        this.f5865f = new Paint(1);
        this.h = new lc(0, 300);
        this.f5873n = new lc(2, 30);
        this.f5874r = -1135603;
        this.f5875s = -404714;
        this.f5877x = -1135603;
        this.f5878y = -404714;
        this.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f5874r, this.f5875s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = new Matrix();
        this.G = true;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.I = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, true);
        this.J = g6Var2;
        this.K = new wp[1];
        Paint paint = new Paint(1);
        this.L = paint;
        this.M = new ly0(bd.M0(2131745047, null), 14.0f, org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        xq xqVar = xq.h;
        this.N = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.O = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.Q = -1L;
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new RectF();
        this.V = new Path();
        this.W = new Path();
        this.f5857a0 = new Path();
        this.f5859b0 = new RectF();
        this.f5861c0 = new Path();
        this.f5862d0 = 0.0f;
        this.f5867g0 = new qe.a(this, xqVar, 320L);
        this.f5856a = e6Var;
        Drawable g7 = k2.p1.g(context, 2131232307);
        this.H = g7;
        g7.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        g6Var.u(-1);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.w(org.telegram.messenger.g0.L(21.0f));
        g6Var.setCallback(this);
        Point point = org.telegram.messenger.g0.f22608q;
        g6Var.M = point.x;
        g6Var.f33983b = 17;
        g6Var2.u(-570425345);
        g6Var2.w(org.telegram.messenger.g0.L(11.0f));
        g6Var2.setCallback(this);
        g6Var2.M = point.x;
        g6Var2.f33983b = 17;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, e6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5862d0, f10);
        this.m0 = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 9));
        int value = getValue();
        this.m0.addListener(new pc(this, f10, value));
        this.m0.setDuration(320L);
        this.m0.setInterpolator(xq.h);
        this.m0.start();
        if (c(f10) != value) {
            e(c(f10));
        }
        org.telegram.ui.Components.g6 g6Var = this.I;
        g6Var.a();
        g6Var.t(wb.Y0(false, bd.E(c(f10), ','), this.K), true, true);
    }

    public final float b(int i3) {
        int i10;
        int i11 = 1;
        while (true) {
            int[] iArr = this.f5866f0;
            if (i11 < iArr.length) {
                if (i3 <= iArr[i11]) {
                    int i12 = i11 - 1;
                    int i13 = iArr[i12];
                    return (i12 + ((i3 - i13) / (i10 - i13))) / (iArr.length - 1);
                }
                i11++;
            } else {
                return 1.0f;
            }
        }
    }

    public final int c(float f10) {
        int i3;
        int[] iArr;
        if (f10 <= 0.0f) {
            return this.f5866f0[0];
        }
        if (f10 >= 1.0f) {
            return this.f5866f0[iArr.length - 1];
        }
        int[] iArr2 = this.f5866f0;
        float length = f10 * (iArr2.length - 1);
        int i10 = (int) length;
        float f11 = length - i10;
        float f12 = iArr2[i10];
        int i11 = i10 + 1;
        if (i11 < iArr2.length) {
            i10 = i11;
        }
        return Math.round((f11 * (iArr2[i10] - i3)) + f12);
    }

    public boolean d(float f10) {
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        org.telegram.ui.Components.u5 u5Var;
        int i3;
        Path path;
        Paint paint2;
        RectF rectF;
        Canvas canvas2;
        int i10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        boolean z11;
        float f14;
        boolean z12;
        boolean z13;
        float f15;
        super.dispatchDraw(canvas);
        Matrix matrix = this.F;
        matrix.reset();
        RectF rectF2 = this.R;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.E.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.E;
        Paint paint3 = this.f5860c;
        paint3.setShader(linearGradient);
        int f16 = i0.a.f(this.f5862d0, this.f5874r, this.f5875s);
        Path path2 = this.V;
        path2.rewind();
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), direction);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, this.f5874r);
        Paint paint4 = this.f5858b;
        paint4.setColor(r12);
        canvas.drawPath(path2, paint4);
        RectF rectF3 = this.S;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = org.telegram.messenger.g0.T1(rectF3.left + org.telegram.messenger.g0.L(24.0f), rectF3.right, b10);
        Path path3 = this.W;
        path3.rewind();
        path3.addRoundRect(rectF3, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), direction);
        lc lcVar = this.h;
        lcVar.g(rectF2);
        float f17 = this.f5862d0;
        lcVar.h = (f17 * 15.0f) + 1.0f;
        lcVar.f5520j = (int) (lcVar.f5514b.size() * ((f17 * 0.85f) + 0.15f));
        lcVar.d();
        canvas.save();
        canvas.clipPath(path2);
        lcVar.a(canvas, f16);
        long j10 = this.Q;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        org.telegram.ui.Components.u5 u5Var2 = this.O;
        org.telegram.ui.Components.u5 u5Var3 = this.N;
        ly0 ly0Var = this.M;
        Paint paint5 = this.L;
        if (i11 != 0 && b((int) j10) < 1.0f && b((int) this.Q) > 0.0f) {
            float L = rectF2.left + org.telegram.messenger.g0.L(12.0f) + (Utilities.l(b((int) this.Q)) * (rectF2.width() - org.telegram.messenger.g0.L(24.0f)));
            if (Math.abs((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - L) < org.telegram.messenger.g0.L(14.0f)) {
                z12 = true;
            } else {
                z12 = false;
            }
            float d = u5Var3.d(z12);
            int L2 = org.telegram.messenger.g0.L(9.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            if (Math.abs((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - L) < org.telegram.messenger.g0.L(12.0f)) {
                z13 = true;
            } else {
                z13 = false;
            }
            float W1 = org.telegram.messenger.g0.W1(u5Var2.d(z13), L2, L3);
            if (L + ly0Var.f35918c + (org.telegram.messenger.g0.L(16.0f) * 2) > rectF2.right) {
                f15 = (L - W1) - ly0Var.f35918c;
            } else {
                f15 = L + W1;
            }
            float f18 = f15;
            paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.k6.r1(0.6f, f16));
            paint = paint4;
            f10 = b10;
            u5Var = u5Var2;
            i3 = f16;
            rectF = rectF3;
            canvas.drawLine(L, org.telegram.messenger.g0.T1(rectF2.top, rectF2.centerY(), d), L, org.telegram.messenger.g0.T1(rectF2.bottom, rectF2.centerY(), d), paint5);
            path = path3;
            paint2 = paint5;
            this.M.c(f18, rectF2.centerY(), 0.6f, i3, canvas);
            canvas2 = canvas;
        } else {
            paint = paint4;
            f10 = b10;
            u5Var = u5Var2;
            i3 = f16;
            path = path3;
            paint2 = paint5;
            rectF = rectF3;
            canvas2 = canvas;
        }
        Path path4 = path;
        canvas2.drawPath(path4, paint3);
        canvas2.clipPath(path4);
        lcVar.a(canvas2, -1);
        long j11 = this.Q;
        if (j11 != -1 && b((int) j11) < 1.0f && b((int) this.Q) > 0.0f) {
            float L4 = rectF2.left + org.telegram.messenger.g0.L(12.0f) + (Utilities.l(b((int) this.Q)) * (rectF2.width() - org.telegram.messenger.g0.L(24.0f)));
            if (Math.abs((rectF.right - org.telegram.messenger.g0.L(10.0f)) - L4) < org.telegram.messenger.g0.L(14.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d10 = u5Var3.d(z10);
            int L5 = org.telegram.messenger.g0.L(9.0f);
            int L6 = org.telegram.messenger.g0.L(16.0f);
            if (Math.abs((rectF.right - org.telegram.messenger.g0.L(10.0f)) - L4) < org.telegram.messenger.g0.L(12.0f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float W12 = org.telegram.messenger.g0.W1(u5Var.d(z11), L5, L6);
            if (ly0Var.f35918c + L4 + (org.telegram.messenger.g0.L(16.0f) * 2) > rectF2.right) {
                f14 = (L4 - W12) - ly0Var.f35918c;
            } else {
                f14 = W12 + L4;
            }
            float f19 = f14;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.f5856a)));
            i10 = i3;
            canvas2.drawLine(L4, org.telegram.messenger.g0.T1(rectF2.top, rectF2.centerY(), d10), L4, org.telegram.messenger.g0.T1(rectF2.bottom, rectF2.centerY(), d10), paint2);
            this.M.c(f19, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i10 = i3;
        }
        canvas2.restore();
        invalidate();
        if (this.P) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int f20 = i0.a.f(0.5f, paint.getColor(), this.f5875s);
            Paint paint6 = this.d;
            paint6.setColor(f20);
            Path path5 = this.f5857a0;
            path5.rewind();
            f11 = 0.5f;
            f12 = 2.0f;
            f13 = 0.15f;
            path5.addRoundRect(height - org.telegram.messenger.g0.L(1.0f), centerY - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + height, centerY + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), direction);
            path5.addRoundRect(height - org.telegram.messenger.g0.L(6.0f), centerY - org.telegram.messenger.g0.L(1.0f), height + org.telegram.messenger.g0.L(6.0f), centerY + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), direction);
            canvas2.drawPath(path5, paint6);
        } else {
            f11 = 0.5f;
            f12 = 2.0f;
            f13 = 0.15f;
        }
        float L7 = (rectF.right - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f);
        float centerY2 = rectF.centerY() - (org.telegram.messenger.g0.L(16.0f) / f12);
        float L8 = rectF.right - org.telegram.messenger.g0.L(4.0f);
        float L9 = (org.telegram.messenger.g0.L(16.0f) / f12) + rectF.centerY();
        RectF rectF4 = this.T;
        rectF4.set(L7, centerY2, L8, L9);
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f5863e);
        float L10 = org.telegram.messenger.g0.L(9.0f) / rectF2.width();
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(rectF4.left, rectF4.right, f10), org.telegram.messenger.g0.T1(rectF4.left + org.telegram.messenger.g0.L(9.0f), rectF4.right - org.telegram.messenger.g0.L(9.0f), f10), Math.min(Utilities.l(f10 / L10), Utilities.l((1.0f - f10) / L10)));
        org.telegram.ui.Components.g6 g6Var = this.J;
        float c2 = g6Var.c() + org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.g6 g6Var2 = this.I;
        float max = Math.max(c2, g6Var2.c() + org.telegram.messenger.g0.L(50.0f));
        float i12 = Utilities.i(T1 - (max / f12), (rectF2.right - max) - org.telegram.messenger.g0.L(4.0f), rectF2.left + org.telegram.messenger.g0.L(4.0f));
        float L11 = rectF2.top - org.telegram.messenger.g0.L(21.0f);
        float L12 = rectF2.top - org.telegram.messenger.g0.L(21.0f);
        RectF rectF5 = this.f5859b0;
        rectF5.set(i12, L11 - org.telegram.messenger.g0.L(44.0f), max + i12, L12);
        float height2 = rectF5.height();
        float f21 = height2 / f12;
        float i13 = Utilities.i(T1, rectF5.right, rectF5.left);
        float i14 = Utilities.i(i13 - org.telegram.messenger.g0.L(9.0f), rectF5.right, rectF5.left);
        float i15 = Utilities.i(org.telegram.messenger.g0.L(9.0f) + i13, rectF5.right, rectF5.left);
        float i16 = Utilities.i(this.f5862d0 - this.f5864e0, 1.0f, -1.0f) * 60.0f;
        float f22 = f13;
        float L13 = rectF5.bottom + org.telegram.messenger.g0.L(8.0f);
        Path path6 = this.f5861c0;
        path6.rewind();
        float f23 = rectF5.left;
        float f24 = rectF5.top;
        RectF rectF6 = this.U;
        rectF6.set(f23, f24, f23 + height2, f24 + height2);
        path6.arcTo(rectF6, -180.0f, 90.0f);
        float f25 = rectF5.right;
        float f26 = rectF5.top;
        rectF6.set(f25 - height2, f26, f25, f26 + height2);
        path6.arcTo(rectF6, -90.0f, 90.0f);
        float f27 = rectF5.right;
        float f28 = rectF5.bottom;
        rectF6.set(f27 - height2, f28 - height2, f27, f28);
        int i17 = i10;
        path6.arcTo(rectF6, 0.0f, (float) Utilities.h(((Math.acos(Utilities.l((i15 - rectF6.centerX()) / f21)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d));
        float f29 = 0.7f * height2;
        if (i14 < rectF5.right - f29) {
            path6.lineTo(i15, rectF5.bottom);
            path6.lineTo(i13 + f12, rectF5.bottom + org.telegram.messenger.g0.L(8.0f));
        }
        path6.lineTo(i13, rectF5.bottom + org.telegram.messenger.g0.L(8.0f) + 1.0f);
        if (i15 > rectF5.left + f29) {
            path6.lineTo(i13 - f12, rectF5.bottom + org.telegram.messenger.g0.L(8.0f));
            path6.lineTo(i14, rectF5.bottom);
        }
        float f30 = rectF5.left;
        float f31 = rectF5.bottom;
        rectF6.set(f30, f31 - height2, f30 + height2, f31);
        float h = ((float) Utilities.h(((Math.acos(Utilities.l((i14 - rectF6.left) / f21)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d)) + 90.0f;
        path6.arcTo(rectF6, h, 180.0f - h);
        path6.lineTo(rectF5.left, rectF5.bottom);
        path6.close();
        RectF rectF7 = org.telegram.messenger.g0.P;
        rectF7.set(rectF5);
        rectF7.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(12.0f));
        lc lcVar2 = this.f5873n;
        lcVar2.g(rectF7);
        lcVar2.h = (this.f5862d0 * 15.0f) + 1.0f;
        lcVar2.d();
        canvas2.save();
        lcVar2.a(canvas2, i17);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(i16, i13, L13);
        if (Math.abs(this.f5862d0 - this.f5864e0) > 0.001f) {
            this.f5864e0 = org.telegram.messenger.g0.T1(this.f5864e0, this.f5862d0, 0.1f);
            invalidate();
        }
        this.f5865f.setShader(this.E);
        canvas2.drawPath(path6, this.f5865f);
        canvas2.save();
        canvas2.clipPath(path6);
        canvas2.rotate(-i16, i13, L13);
        lcVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f32 = 1.0f - (this.f5867g0.f53840e * f22);
        canvas2.scale(f32, f32, rectF5.centerX(), rectF5.top - (rectF5.height() * f11));
        this.H.setBounds((int) ((rectF5.centerX() - (g6Var2.c() / f12)) + org.telegram.messenger.g0.L(-12.0f)), (int) (rectF5.centerY() - org.telegram.messenger.g0.L(10.0f)), (int) ((rectF5.centerX() - (g6Var2.c() / f12)) + org.telegram.messenger.g0.L(8.0f)), (int) (rectF5.centerY() + org.telegram.messenger.g0.L(10.0f)));
        if (this.G) {
            this.H.draw(canvas2);
        }
        g6Var2.o(rectF5.left + org.telegram.messenger.g0.L(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        g6Var2.draw(canvas2);
        canvas2.restore();
        g6Var.o(rectF5.left, rectF5.top + org.telegram.messenger.g0.L(10.0f), rectF5.right, rectF5.bottom + org.telegram.messenger.g0.L(10.0f));
        g6Var.B = (int) (this.f5867g0.f53840e * 255.0f);
        g6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5868h0 = motionEvent.getX();
            this.f5869i0 = motionEvent.getY();
            this.f5871k0 = motionEvent.getPointerId(0);
            this.f5870j0 = System.currentTimeMillis();
            this.f5872l0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f5871k0) {
            float x10 = motionEvent.getX() - this.f5868h0;
            float y9 = motionEvent.getY() - this.f5869i0;
            if (!this.f5872l0 && Math.abs(x10) > Math.abs(y9 * 1.5f) && Math.abs(x10) > org.telegram.messenger.g0.f22587e) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f5872l0 = true;
                ValueAnimator valueAnimator = this.m0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f5872l0) {
                int value = getValue();
                this.f5862d0 = Utilities.l((x10 / (getWidth() * 1.0f)) + this.f5862d0);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.g6 g6Var = this.I;
                    g6Var.a();
                    g6Var.t(wb.Y0(false, bd.E(getValue(), ','), this.K), true, true);
                }
                this.f5868h0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f5872l0 && motionEvent.getPointerId(0) == this.f5871k0 && a7.h.a(this.f5868h0, this.f5869i0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.f22587e && ((float) (System.currentTimeMillis() - this.f5870j0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.R;
                    float l10 = Utilities.l((x12 - rectF.left) / rectF.width());
                    long j10 = this.Q;
                    if (j10 > 0 && Math.abs(b((int) j10) - l10) < 0.035f) {
                        l10 = Utilities.l(b((int) this.Q));
                    }
                    a(l10);
                }
            }
            this.f5872l0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i3);

    public final void f(int i3, int i10, boolean z10) {
        if (this.f5877x == i3 && this.f5878y == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.f5876w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5876w = null;
        }
        if (z10) {
            int i11 = this.f5874r;
            int i12 = this.f5875s;
            this.f5877x = i3;
            this.f5878y = i10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5876w = ofFloat;
            ofFloat.addUpdateListener(new nc(this, i11, i3, i12, i10, 0));
            this.f5876w.addListener(new oc(this, i11, i3, i12, i10));
            this.f5876w.setInterpolator(xq.h);
            this.f5876w.setDuration(420L);
            this.f5876w.start();
            return;
        }
        this.f5877x = i3;
        this.f5874r = i3;
        this.f5878y = i10;
        this.f5875s = i10;
        this.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f5874r, this.f5875s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.f5867g0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.g6 g6Var = this.J;
        g6Var.a();
        g6Var.t(str, true, true);
    }

    public float getProgress() {
        return this.f5862d0;
    }

    public int getValue() {
        return c(this.f5862d0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(14.0f);
        int L2 = org.telegram.messenger.g0.L(135.0f);
        this.R.set(L, L2, measuredWidth - L, org.telegram.messenger.g0.L(24.0f) + L2);
        this.f5860c.setColor(-1069811);
        this.f5863e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.Q = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.M.q(str);
    }

    public void setValue(int i3) {
        float b10 = b(i3);
        this.f5862d0 = b10;
        this.f5864e0 = b10;
        org.telegram.ui.Components.g6 g6Var = this.I;
        g6Var.a();
        g6Var.t(wb.Y0(false, bd.E(getValue(), ','), this.K), true, true);
    }

    public void setValueAnimated(int i3) {
        if (i3 == getValue()) {
            return;
        }
        a(b(i3));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.I && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
