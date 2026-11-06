package bi;

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
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public abstract class zd extends View {
    public LinearGradient D;
    public final Matrix E;
    public boolean F;
    public final Drawable G;
    public final org.telegram.ui.Components.i6 H;
    public final org.telegram.ui.Components.i6 I;
    public final wp[] J;
    public final Paint K;
    public final my0 L;
    public final org.telegram.ui.Components.w5 M;
    public final org.telegram.ui.Components.w5 N;
    public boolean O;
    public long P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final Path U;
    public final Path V;
    public final Path W;
    public final org.telegram.ui.ActionBar.f6 f5193a;
    public final RectF f5194a0;
    public final Paint f5195b;
    public final Path f5196b0;
    public final Paint f5197c;
    public float f5198c0;
    public final Paint d;
    public float f5199d0;
    public final Paint f5200e;
    public int[] f5201e0;
    public final Paint f5202f;
    public final te.a f5203f0;
    public float f5204g0;
    public final ud h;
    public float f5205h0;
    public long f5206i0;
    public int f5207j0;
    public boolean f5208k0;
    public ValueAnimator f5209l0;
    public final ud f5210n;
    public int f5211r;
    public int f5212s;
    public ValueAnimator f5213w;
    public int f5214x;
    public int f5215y;

    public zd(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f5195b = new Paint(1);
        this.f5197c = new Paint(1);
        this.d = new Paint(1);
        this.f5200e = new Paint(1);
        this.f5202f = new Paint(1);
        this.h = new ud(0, 300);
        this.f5210n = new ud(2, 30);
        this.f5211r = -1135603;
        this.f5212s = -404714;
        this.f5214x = -1135603;
        this.f5215y = -404714;
        this.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f5211r, this.f5212s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = new Matrix();
        this.F = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.H = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true);
        this.I = i6Var2;
        this.J = new wp[1];
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new my0(org.telegram.messenger.hd.M0(2131745038, null), 14.0f, org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        xq xqVar = xq.h;
        this.M = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.N = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.P = -1L;
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new Path();
        this.V = new Path();
        this.W = new Path();
        this.f5194a0 = new RectF();
        this.f5196b0 = new Path();
        this.f5198c0 = 0.0f;
        this.f5203f0 = new te.a(this, xqVar, 320L);
        this.f5193a = f6Var;
        Drawable h = jg.g.h(context, 2131232307);
        this.G = h;
        h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        i6Var.u(-1);
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.w(org.telegram.messenger.g0.L(21.0f));
        i6Var.setCallback(this);
        Point point = org.telegram.messenger.g0.f22544q;
        i6Var.M = point.x;
        i6Var.f34508b = 17;
        i6Var2.u(-570425345);
        i6Var2.w(org.telegram.messenger.g0.L(11.0f));
        i6Var2.setCallback(this);
        i6Var2.M = point.x;
        i6Var2.f34508b = 17;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f5209l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5198c0, f10);
        this.f5209l0 = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 9));
        int value = getValue();
        this.f5209l0.addListener(new yd(this, f10, value));
        this.f5209l0.setDuration(320L);
        this.f5209l0.setInterpolator(xq.h);
        this.f5209l0.start();
        if (c(f10) != value) {
            e(c(f10));
        }
        org.telegram.ui.Components.i6 i6Var = this.H;
        i6Var.a();
        i6Var.t(dd.Y0(false, org.telegram.messenger.hd.E(c(f10), ','), this.J), true, true);
    }

    public final float b(int i7) {
        int i10;
        int i11 = 1;
        while (true) {
            int[] iArr = this.f5201e0;
            if (i11 < iArr.length) {
                if (i7 <= iArr[i11]) {
                    int i12 = i11 - 1;
                    int i13 = iArr[i12];
                    return (i12 + ((i7 - i13) / (i10 - i13))) / (iArr.length - 1);
                }
                i11++;
            } else {
                return 1.0f;
            }
        }
    }

    public final int c(float f10) {
        int i7;
        int[] iArr;
        if (f10 <= 0.0f) {
            return this.f5201e0[0];
        }
        if (f10 >= 1.0f) {
            return this.f5201e0[iArr.length - 1];
        }
        int[] iArr2 = this.f5201e0;
        float length = f10 * (iArr2.length - 1);
        int i10 = (int) length;
        float f11 = length - i10;
        float f12 = iArr2[i10];
        int i11 = i10 + 1;
        if (i11 < iArr2.length) {
            i10 = i11;
        }
        return Math.round((f11 * (iArr2[i10] - i7)) + f12);
    }

    public boolean d(float f10) {
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        org.telegram.ui.Components.w5 w5Var;
        int i7;
        Path path;
        Paint paint2;
        RectF rectF;
        Canvas canvas2;
        int i10;
        float f11;
        float f12;
        float f13;
        boolean z9;
        boolean z10;
        float f14;
        boolean z11;
        boolean z12;
        float f15;
        super.dispatchDraw(canvas);
        Matrix matrix = this.E;
        matrix.reset();
        RectF rectF2 = this.Q;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.D.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.D;
        Paint paint3 = this.f5197c;
        paint3.setShader(linearGradient);
        int f16 = i0.a.f(this.f5198c0, this.f5211r, this.f5212s);
        Path path2 = this.U;
        path2.rewind();
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), direction);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, this.f5211r);
        Paint paint4 = this.f5195b;
        paint4.setColor(r12);
        canvas.drawPath(path2, paint4);
        RectF rectF3 = this.R;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = org.telegram.messenger.g0.T1(rectF3.left + org.telegram.messenger.g0.L(24.0f), rectF3.right, b10);
        Path path3 = this.V;
        path3.rewind();
        path3.addRoundRect(rectF3, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), direction);
        ud udVar = this.h;
        udVar.g(rectF2);
        float f17 = this.f5198c0;
        udVar.h = (f17 * 15.0f) + 1.0f;
        udVar.f4850j = (int) (udVar.f4844b.size() * ((f17 * 0.85f) + 0.15f));
        udVar.d();
        canvas.save();
        canvas.clipPath(path2);
        udVar.a(canvas, f16);
        long j3 = this.P;
        int i11 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        org.telegram.ui.Components.w5 w5Var2 = this.N;
        org.telegram.ui.Components.w5 w5Var3 = this.M;
        my0 my0Var = this.L;
        Paint paint5 = this.K;
        if (i11 != 0 && b((int) j3) < 1.0f && b((int) this.P) > 0.0f) {
            float L = rectF2.left + org.telegram.messenger.g0.L(12.0f) + (Utilities.l(b((int) this.P)) * (rectF2.width() - org.telegram.messenger.g0.L(24.0f)));
            if (Math.abs((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - L) < org.telegram.messenger.g0.L(14.0f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float d = w5Var3.d(z11);
            int L2 = org.telegram.messenger.g0.L(9.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            if (Math.abs((rectF3.right - org.telegram.messenger.g0.L(10.0f)) - L) < org.telegram.messenger.g0.L(12.0f)) {
                z12 = true;
            } else {
                z12 = false;
            }
            float W1 = org.telegram.messenger.g0.W1(w5Var2.d(z12), L2, L3);
            if (L + my0Var.f36125c + (org.telegram.messenger.g0.L(16.0f) * 2) > rectF2.right) {
                f15 = (L - W1) - my0Var.f36125c;
            } else {
                f15 = L + W1;
            }
            float f18 = f15;
            paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.k6.r1(0.6f, f16));
            paint = paint4;
            f10 = b10;
            w5Var = w5Var2;
            i7 = f16;
            rectF = rectF3;
            canvas.drawLine(L, org.telegram.messenger.g0.T1(rectF2.top, rectF2.centerY(), d), L, org.telegram.messenger.g0.T1(rectF2.bottom, rectF2.centerY(), d), paint5);
            path = path3;
            paint2 = paint5;
            this.L.c(f18, rectF2.centerY(), 0.6f, i7, canvas);
            canvas2 = canvas;
        } else {
            paint = paint4;
            f10 = b10;
            w5Var = w5Var2;
            i7 = f16;
            path = path3;
            paint2 = paint5;
            rectF = rectF3;
            canvas2 = canvas;
        }
        Path path4 = path;
        canvas2.drawPath(path4, paint3);
        canvas2.clipPath(path4);
        udVar.a(canvas2, -1);
        long j10 = this.P;
        if (j10 != -1 && b((int) j10) < 1.0f && b((int) this.P) > 0.0f) {
            float L4 = rectF2.left + org.telegram.messenger.g0.L(12.0f) + (Utilities.l(b((int) this.P)) * (rectF2.width() - org.telegram.messenger.g0.L(24.0f)));
            if (Math.abs((rectF.right - org.telegram.messenger.g0.L(10.0f)) - L4) < org.telegram.messenger.g0.L(14.0f)) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d2 = w5Var3.d(z9);
            int L5 = org.telegram.messenger.g0.L(9.0f);
            int L6 = org.telegram.messenger.g0.L(16.0f);
            if (Math.abs((rectF.right - org.telegram.messenger.g0.L(10.0f)) - L4) < org.telegram.messenger.g0.L(12.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float W12 = org.telegram.messenger.g0.W1(w5Var.d(z10), L5, L6);
            if (my0Var.f36125c + L4 + (org.telegram.messenger.g0.L(16.0f) * 2) > rectF2.right) {
                f14 = (L4 - W12) - my0Var.f36125c;
            } else {
                f14 = W12 + L4;
            }
            float f19 = f14;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, this.f5193a)));
            i10 = i7;
            canvas2.drawLine(L4, org.telegram.messenger.g0.T1(rectF2.top, rectF2.centerY(), d2), L4, org.telegram.messenger.g0.T1(rectF2.bottom, rectF2.centerY(), d2), paint2);
            this.L.c(f19, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i10 = i7;
        }
        canvas2.restore();
        invalidate();
        if (this.O) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int f20 = i0.a.f(0.5f, paint.getColor(), this.f5212s);
            Paint paint6 = this.d;
            paint6.setColor(f20);
            Path path5 = this.W;
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
        RectF rectF4 = this.S;
        rectF4.set(L7, centerY2, L8, L9);
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f5200e);
        float L10 = org.telegram.messenger.g0.L(9.0f) / rectF2.width();
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(rectF4.left, rectF4.right, f10), org.telegram.messenger.g0.T1(rectF4.left + org.telegram.messenger.g0.L(9.0f), rectF4.right - org.telegram.messenger.g0.L(9.0f), f10), Math.min(Utilities.l(f10 / L10), Utilities.l((1.0f - f10) / L10)));
        org.telegram.ui.Components.i6 i6Var = this.I;
        float c10 = i6Var.c() + org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.i6 i6Var2 = this.H;
        float max = Math.max(c10, i6Var2.c() + org.telegram.messenger.g0.L(50.0f));
        float i12 = Utilities.i(T1 - (max / f12), (rectF2.right - max) - org.telegram.messenger.g0.L(4.0f), rectF2.left + org.telegram.messenger.g0.L(4.0f));
        float L11 = rectF2.top - org.telegram.messenger.g0.L(21.0f);
        float L12 = rectF2.top - org.telegram.messenger.g0.L(21.0f);
        RectF rectF5 = this.f5194a0;
        rectF5.set(i12, L11 - org.telegram.messenger.g0.L(44.0f), max + i12, L12);
        float height2 = rectF5.height();
        float f21 = height2 / f12;
        float i13 = Utilities.i(T1, rectF5.right, rectF5.left);
        float i14 = Utilities.i(i13 - org.telegram.messenger.g0.L(9.0f), rectF5.right, rectF5.left);
        float i15 = Utilities.i(org.telegram.messenger.g0.L(9.0f) + i13, rectF5.right, rectF5.left);
        float i16 = Utilities.i(this.f5198c0 - this.f5199d0, 1.0f, -1.0f) * 60.0f;
        float f22 = f13;
        float L13 = rectF5.bottom + org.telegram.messenger.g0.L(8.0f);
        Path path6 = this.f5196b0;
        path6.rewind();
        float f23 = rectF5.left;
        float f24 = rectF5.top;
        RectF rectF6 = this.T;
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
        ud udVar2 = this.f5210n;
        udVar2.g(rectF7);
        udVar2.h = (this.f5198c0 * 15.0f) + 1.0f;
        udVar2.d();
        canvas2.save();
        udVar2.a(canvas2, i17);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(i16, i13, L13);
        if (Math.abs(this.f5198c0 - this.f5199d0) > 0.001f) {
            this.f5199d0 = org.telegram.messenger.g0.T1(this.f5199d0, this.f5198c0, 0.1f);
            invalidate();
        }
        this.f5202f.setShader(this.D);
        canvas2.drawPath(path6, this.f5202f);
        canvas2.save();
        canvas2.clipPath(path6);
        canvas2.rotate(-i16, i13, L13);
        udVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f32 = 1.0f - (this.f5203f0.f55394e * f22);
        canvas2.scale(f32, f32, rectF5.centerX(), rectF5.top - (rectF5.height() * f11));
        this.G.setBounds((int) ((rectF5.centerX() - (i6Var2.c() / f12)) + org.telegram.messenger.g0.L(-12.0f)), (int) (rectF5.centerY() - org.telegram.messenger.g0.L(10.0f)), (int) ((rectF5.centerX() - (i6Var2.c() / f12)) + org.telegram.messenger.g0.L(8.0f)), (int) (rectF5.centerY() + org.telegram.messenger.g0.L(10.0f)));
        if (this.F) {
            this.G.draw(canvas2);
        }
        i6Var2.o(rectF5.left + org.telegram.messenger.g0.L(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        i6Var2.draw(canvas2);
        canvas2.restore();
        i6Var.o(rectF5.left, rectF5.top + org.telegram.messenger.g0.L(10.0f), rectF5.right, rectF5.bottom + org.telegram.messenger.g0.L(10.0f));
        i6Var.B = (int) (this.f5203f0.f55394e * 255.0f);
        i6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5204g0 = motionEvent.getX();
            this.f5205h0 = motionEvent.getY();
            this.f5207j0 = motionEvent.getPointerId(0);
            this.f5206i0 = System.currentTimeMillis();
            this.f5208k0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f5207j0) {
            float x10 = motionEvent.getX() - this.f5204g0;
            float y10 = motionEvent.getY() - this.f5205h0;
            if (!this.f5208k0 && Math.abs(x10) > Math.abs(y10 * 1.5f) && Math.abs(x10) > org.telegram.messenger.g0.f22523e) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f5208k0 = true;
                ValueAnimator valueAnimator = this.f5209l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f5208k0) {
                int value = getValue();
                this.f5198c0 = Utilities.l((x10 / (getWidth() * 1.0f)) + this.f5198c0);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.i6 i6Var = this.H;
                    i6Var.a();
                    i6Var.t(dd.Y0(false, org.telegram.messenger.hd.E(getValue(), ','), this.J), true, true);
                }
                this.f5204g0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f5208k0 && motionEvent.getPointerId(0) == this.f5207j0 && a8.r9.a(this.f5204g0, this.f5205h0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.f22523e && ((float) (System.currentTimeMillis() - this.f5206i0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.Q;
                    float l10 = Utilities.l((x12 - rectF.left) / rectF.width());
                    long j3 = this.P;
                    if (j3 > 0 && Math.abs(b((int) j3) - l10) < 0.035f) {
                        l10 = Utilities.l(b((int) this.P));
                    }
                    a(l10);
                }
            }
            this.f5208k0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i7);

    public final void f(int i7, int i10, boolean z9) {
        if (this.f5214x == i7 && this.f5215y == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.f5213w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5213w = null;
        }
        if (z9) {
            int i11 = this.f5211r;
            int i12 = this.f5212s;
            this.f5214x = i7;
            this.f5215y = i10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5213w = ofFloat;
            ofFloat.addUpdateListener(new wd(this, i11, i7, i12, i10, 0));
            this.f5213w.addListener(new xd(this, i11, i7, i12, i10));
            this.f5213w.setInterpolator(xq.h);
            this.f5213w.setDuration(420L);
            this.f5213w.start();
            return;
        }
        this.f5214x = i7;
        this.f5211r = i7;
        this.f5215y = i10;
        this.f5212s = i10;
        this.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f5211r, this.f5212s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.f5203f0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.i6 i6Var = this.I;
        i6Var.a();
        i6Var.t(str, true, true);
    }

    public float getProgress() {
        return this.f5198c0;
    }

    public int getValue() {
        return c(this.f5198c0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(14.0f);
        int L2 = org.telegram.messenger.g0.L(135.0f);
        this.Q.set(L, L2, measuredWidth - L, org.telegram.messenger.g0.L(24.0f) + L2);
        this.f5197c.setColor(-1069811);
        this.f5200e.setColor(-1);
    }

    public void setStarsTop(long j3) {
        this.P = j3;
        invalidate();
    }

    public void setTopText(String str) {
        this.L.q(str);
    }

    public void setValue(int i7) {
        float b10 = b(i7);
        this.f5198c0 = b10;
        this.f5199d0 = b10;
        org.telegram.ui.Components.i6 i6Var = this.H;
        i6Var.a();
        i6Var.t(dd.Y0(false, org.telegram.messenger.hd.E(getValue(), ','), this.J), true, true);
    }

    public void setValueAnimated(int i7) {
        if (i7 == getValue()) {
            return;
        }
        a(b(i7));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.H && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
