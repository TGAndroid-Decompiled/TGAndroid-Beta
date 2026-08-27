package hh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

public abstract class gb extends View {
    public final Matrix A;
    public boolean B;
    public final Drawable C;
    public final org.telegram.ui.Components.i6 D;
    public final org.telegram.ui.Components.i6 E;
    public final cq[] F;
    public final Paint G;
    public final pz0 H;
    public final org.telegram.ui.Components.y5 I;
    public final org.telegram.ui.Components.y5 J;
    public boolean K;
    public long L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final Path Q;
    public final Path R;
    public final Path S;
    public final RectF T;
    public final Path U;
    public float V;
    public float W;

    public final org.telegram.ui.ActionBar.c6 f9343a;

    public int[] f9344a0;

    public final Paint f9345b;

    public final ud.a f9346b0;

    public final Paint f9347c;

    public float f9348c0;
    public final Paint d;

    public float f9349d0;

    public final Paint f9350e;

    public long f9351e0;

    public final Paint f9352f;

    public int f9353f0;

    public boolean f9354g0;
    public final bb h;

    public ValueAnimator f9355h0;

    public final bb f9356n;

    public int f9357r;

    public int f9358s;
    public ValueAnimator v;

    public int f9359w;

    public int f9360x;

    public LinearGradient f9361y;

    public gb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9345b = new Paint(1);
        this.f9347c = new Paint(1);
        this.d = new Paint(1);
        this.f9350e = new Paint(1);
        this.f9352f = new Paint(1);
        this.h = new bb(0, 300);
        this.f9356n = new bb(2, 30);
        this.f9357r = -1135603;
        this.f9358s = -404714;
        this.f9359w = -1135603;
        this.f9360x = -404714;
        this.f9361y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f9357r, this.f9358s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = new Matrix();
        this.B = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.D = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true, false);
        this.E = i6Var2;
        this.F = new cq[1];
        Paint paint = new Paint(1);
        this.G = paint;
        this.H = new pz0(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        er erVar = er.h;
        this.I = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.J = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.L = -1L;
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new Path();
        this.R = new Path();
        this.S = new Path();
        this.T = new RectF();
        this.U = new Path();
        this.V = 0.0f;
        this.f9346b0 = new ud.a(this, erVar, 320L);
        this.f9343a = c6Var;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.C = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.t(AndroidUtilities.dp(21.0f));
        i6Var.setCallback(this);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.f29239b = 17;
        i6Var2.r(-570425345);
        i6Var2.t(AndroidUtilities.dp(11.0f));
        i6Var2.setCallback(this);
        i6Var2.G = AndroidUtilities.displaySize.x;
        i6Var2.f29239b = 17;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f9355h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.V, f10);
        this.f9355h0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 11));
        int value = getValue();
        this.f9355h0.addListener(new fb(this, f10, value));
        this.f9355h0.setDuration(320L);
        this.f9355h0.setInterpolator(er.h);
        this.f9355h0.start();
        if (c(f10) != value) {
            e(c(f10));
        }
        org.telegram.ui.Components.i6 i6Var = this.D;
        i6Var.b();
        i6Var.q(oa.V0(false, LocaleController.formatNumber(c(f10), ','), this.F), true, true);
    }

    public final float b(int i10) {
        int i11 = 1;
        while (true) {
            int[] iArr = this.f9344a0;
            if (i11 >= iArr.length) {
                return 1.0f;
            }
            int i12 = iArr[i11];
            if (i10 <= i12) {
                int i13 = i11 - 1;
                int i14 = iArr[i13];
                return (i13 + ((i10 - i14) / (i12 - i14))) / (iArr.length - 1);
            }
            i11++;
        }
    }

    public final int c(float f10) {
        if (f10 <= 0.0f) {
            return this.f9344a0[0];
        }
        if (f10 >= 1.0f) {
            int[] iArr = this.f9344a0;
            return iArr[iArr.length - 1];
        }
        int[] iArr2 = this.f9344a0;
        float length = f10 * (iArr2.length - 1);
        int i10 = (int) length;
        float f11 = length - i10;
        int i11 = iArr2[i10];
        float f12 = i11;
        int i12 = i10 + 1;
        if (i12 < iArr2.length) {
            i10 = i12;
        }
        return Math.round((f11 * (iArr2[i10] - i11)) + f12);
    }

    public boolean d(float f10) {
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        float f10;
        int i10;
        Paint paint2;
        Canvas canvas2;
        float f11;
        super.dispatchDraw(canvas);
        Matrix matrix = this.A;
        matrix.reset();
        RectF rectF2 = this.M;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.f9361y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.f9361y;
        Paint paint3 = this.f9347c;
        paint3.setShader(linearGradient);
        int iD = i0.b.d(this.V, this.f9357r, this.f9358s);
        Path path = this.Q;
        path.rewind();
        float fDp = AndroidUtilities.dp(12.0f);
        float fDp2 = AndroidUtilities.dp(12.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, fDp, fDp2, direction);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.15f, this.f9357r);
        Paint paint4 = this.f9345b;
        paint4.setColor(iL1);
        canvas.drawPath(path, paint4);
        RectF rectF3 = this.N;
        rectF3.set(rectF2);
        float fB = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, fB);
        Path path2 = this.R;
        path2.rewind();
        path2.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction);
        bb bbVar = this.h;
        bbVar.g(rectF2);
        float f12 = this.V;
        bbVar.h = (f12 * 15.0f) + 1.0f;
        bbVar.f9039j = (int) (bbVar.f9033b.size() * ((f12 * 0.85f) + 0.15f));
        bbVar.d();
        canvas.save();
        canvas.clipPath(path);
        bbVar.a(canvas, iD);
        long j10 = this.L;
        org.telegram.ui.Components.y5 y5Var = this.J;
        org.telegram.ui.Components.y5 y5Var2 = this.I;
        pz0 pz0Var = this.H;
        Paint paint5 = this.G;
        if (j10 == -1 || b((int) j10) >= 1.0f || b((int) this.L) <= 0.0f) {
            rectF = rectF3;
            paint = paint4;
            f10 = fB;
            i10 = iD;
            paint2 = paint5;
            canvas2 = canvas;
        } else {
            float fClamp01 = (Utilities.clamp01(b((int) this.L)) * (rectF2.width() - AndroidUtilities.dp(24.0f))) + rectF2.left + AndroidUtilities.dp(12.0f);
            float fE = y5Var2.e(Math.abs((rectF3.right - ((float) AndroidUtilities.dp(10.0f))) - fClamp01) < ((float) AndroidUtilities.dp(14.0f)));
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), y5Var.e(Math.abs((rectF3.right - ((float) AndroidUtilities.dp(10.0f))) - fClamp01) < ((float) AndroidUtilities.dp(12.0f))));
            float f13 = (fClamp01 + pz0Var.f31697c) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF2.right ? (fClamp01 - fLerp) - pz0Var.f31697c : fClamp01 + fLerp;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.g6.l1(0.6f, iD));
            paint = paint4;
            rectF = rectF3;
            f10 = fB;
            i10 = iD;
            canvas.drawLine(fClamp01, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), fE), fClamp01, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), fE), paint5);
            paint2 = paint5;
            this.H.c(f13, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        }
        canvas2.drawPath(path2, paint3);
        canvas2.clipPath(path2);
        bbVar.a(canvas2, -1);
        long j11 = this.L;
        if (j11 != -1 && b((int) j11) < 1.0f && b((int) this.L) > 0.0f) {
            float fDp3 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.L)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            float fE2 = y5Var2.e(Math.abs((rectF.right - ((float) AndroidUtilities.dp(10.0f))) - fDp3) < ((float) AndroidUtilities.dp(14.0f)));
            float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), y5Var.e(Math.abs((rectF.right - ((float) AndroidUtilities.dp(10.0f))) - fDp3) < ((float) AndroidUtilities.dp(12.0f))));
            float f14 = (pz0Var.f31697c + fDp3) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF2.right ? (fDp3 - fLerp2) - pz0Var.f31697c : fLerp2 + fDp3;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, this.f9343a)));
            canvas2.drawLine(fDp3, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), fE2), fDp3, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), fE2), paint2);
            this.H.c(f14, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        }
        canvas2.restore();
        invalidate();
        if (this.K) {
            float fHeight = rectF2.right - (rectF2.height() / 2.0f);
            float fCenterY = rectF2.centerY();
            int iD2 = i0.b.d(0.5f, paint.getColor(), this.f9358s);
            Paint paint6 = this.d;
            paint6.setColor(iD2);
            Path path3 = this.S;
            path3.rewind();
            f11 = 0.5f;
            path3.addRoundRect(fHeight - AndroidUtilities.dp(1.0f), fCenterY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + fHeight, fCenterY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction);
            path3.addRoundRect(fHeight - AndroidUtilities.dp(6.0f), fCenterY - AndroidUtilities.dp(1.0f), fHeight + AndroidUtilities.dp(6.0f), fCenterY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction);
            canvas2.drawPath(path3, paint6);
        } else {
            f11 = 0.5f;
        }
        float fDp4 = (rectF.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f);
        float fCenterY2 = rectF.centerY() - (AndroidUtilities.dp(16.0f) / 2.0f);
        float fDp5 = rectF.right - AndroidUtilities.dp(4.0f);
        float fDp6 = (AndroidUtilities.dp(16.0f) / 2.0f) + rectF.centerY();
        RectF rectF4 = this.O;
        rectF4.set(fDp4, fCenterY2, fDp5, fDp6);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f9350e);
        float fDp7 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float f15 = f10;
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f15), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f15), Math.min(Utilities.clamp01(f15 / fDp7), Utilities.clamp01((1.0f - f15) / fDp7)));
        org.telegram.ui.Components.i6 i6Var = this.E;
        float fD = i6Var.d() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.i6 i6Var2 = this.D;
        float fMax = Math.max(fD, i6Var2.d() + AndroidUtilities.dp(50.0f));
        float fDp8 = AndroidUtilities.dp(44.0f);
        float fClamp = Utilities.clamp(fLerp3 - (fMax / 2.0f), (rectF2.right - fMax) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float fDp9 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.T;
        rectF5.set(fClamp, (rectF2.top - AndroidUtilities.dp(21.0f)) - fDp8, fMax + fClamp, fDp9);
        float fHeight2 = rectF5.height();
        float f16 = fHeight2 / 2.0f;
        float fClamp2 = Utilities.clamp(fLerp3, rectF5.right, rectF5.left);
        float fClamp3 = Utilities.clamp(fClamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float fClamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + fClamp2, rectF5.right, rectF5.left);
        float fClamp5 = Utilities.clamp(this.V - this.W, 1.0f, -1.0f) * 60.0f;
        float fDp10 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path4 = this.U;
        path4.rewind();
        float f17 = rectF5.left;
        float f18 = rectF5.top;
        RectF rectF6 = this.P;
        rectF6.set(f17, f18, f17 + fHeight2, f18 + fHeight2);
        path4.arcTo(rectF6, -180.0f, 90.0f);
        float f19 = rectF5.right;
        float f20 = rectF5.top;
        rectF6.set(f19 - fHeight2, f20, f19, f20 + fHeight2);
        path4.arcTo(rectF6, -90.0f, 90.0f);
        float f21 = rectF5.right;
        float f22 = rectF5.bottom;
        rectF6.set(f21 - fHeight2, f22 - fHeight2, f21, f22);
        path4.arcTo(rectF6, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((fClamp4 - rectF6.centerX()) / f16)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
        float f23 = 0.7f * fHeight2;
        if (fClamp3 < rectF5.right - f23) {
            path4.lineTo(fClamp4, rectF5.bottom);
            path4.lineTo(fClamp2 + 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
        }
        path4.lineTo(fClamp2, rectF5.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
        if (fClamp4 > rectF5.left + f23) {
            path4.lineTo(fClamp2 - 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
            path4.lineTo(fClamp3, rectF5.bottom);
        }
        float f24 = rectF5.left;
        float f25 = rectF5.bottom;
        rectF6.set(f24, f25 - fHeight2, f24 + fHeight2, f25);
        float fClamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((fClamp3 - rectF6.left) / f16)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
        path4.arcTo(rectF6, fClamp6, 180.0f - fClamp6);
        path4.lineTo(rectF5.left, rectF5.bottom);
        path4.close();
        RectF rectF7 = AndroidUtilities.rectTmp;
        rectF7.set(rectF5);
        rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
        bb bbVar2 = this.f9356n;
        bbVar2.g(rectF7);
        bbVar2.h = (this.V * 15.0f) + 1.0f;
        bbVar2.d();
        canvas2.save();
        bbVar2.a(canvas2, i10);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(fClamp5, fClamp2, fDp10);
        if (Math.abs(this.V - this.W) > 0.001f) {
            this.W = AndroidUtilities.lerp(this.W, this.V, 0.1f);
            invalidate();
        }
        this.f9352f.setShader(this.f9361y);
        canvas2.drawPath(path4, this.f9352f);
        canvas2.save();
        canvas2.clipPath(path4);
        canvas2.rotate(-fClamp5, fClamp2, fDp10);
        bbVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f26 = 1.0f - (this.f9346b0.f48497e * 0.15f);
        canvas2.scale(f26, f26, rectF5.centerX(), rectF5.top - (rectF5.height() * f11));
        this.C.setBounds((int) ((rectF5.centerX() - (i6Var2.d() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (i6Var2.d() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.B) {
            this.C.draw(canvas2);
        }
        i6Var2.l(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        i6Var2.draw(canvas2);
        canvas2.restore();
        i6Var.l(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        i6Var.f29257w = (int) (this.f9346b0.f48497e * 255.0f);
        i6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9348c0 = motionEvent.getX();
            this.f9349d0 = motionEvent.getY();
            this.f9353f0 = motionEvent.getPointerId(0);
            this.f9351e0 = System.currentTimeMillis();
            this.f9354g0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f9353f0) {
            float x8 = motionEvent.getX() - this.f9348c0;
            float y10 = motionEvent.getY() - this.f9349d0;
            if (!this.f9354g0 && Math.abs(x8) > Math.abs(y10 * 1.5f) && Math.abs(x8) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f9354g0 = true;
                ValueAnimator valueAnimator = this.f9355h0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f9354g0) {
                int value = getValue();
                this.V = Utilities.clamp01((x8 / (getWidth() * 1.0f)) + this.V);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.i6 i6Var = this.D;
                    i6Var.b();
                    i6Var.q(oa.V0(false, LocaleController.formatNumber(getValue(), ','), this.F), true, true);
                }
                this.f9348c0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f9354g0 && motionEvent.getPointerId(0) == this.f9353f0 && h7.y.a(this.f9348c0, this.f9349d0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && System.currentTimeMillis() - this.f9351e0 <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x10 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x10)) {
                    float x11 = motionEvent.getX();
                    RectF rectF = this.M;
                    float fClamp01 = Utilities.clamp01((x11 - rectF.left) / rectF.width());
                    long j10 = this.L;
                    if (j10 > 0 && Math.abs(b((int) j10) - fClamp01) < 0.035f) {
                        fClamp01 = Utilities.clamp01(b((int) this.L));
                    }
                    a(fClamp01);
                }
            }
            this.f9354g0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z10) {
        if (this.f9359w == i10 && this.f9360x == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (!z10) {
            this.f9359w = i10;
            this.f9357r = i10;
            this.f9360x = i11;
            this.f9358s = i11;
            this.f9361y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f9357r, this.f9358s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            invalidate();
            return;
        }
        int i12 = this.f9357r;
        int i13 = this.f9358s;
        this.f9359w = i10;
        this.f9360x = i11;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new db(this, i12, i10, i13, i11, 0));
        this.v.addListener(new eb(this, i12, i10, i13, i11));
        this.v.setInterpolator(er.h);
        this.v.setDuration(420L);
        this.v.start();
    }

    public final void g(String str) {
        this.f9346b0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.i6 i6Var = this.E;
        i6Var.b();
        i6Var.q(str, true, true);
    }

    public float getProgress() {
        return this.V;
    }

    public int getValue() {
        return c(this.V);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int iDp = AndroidUtilities.dp(14.0f);
        int iDp2 = AndroidUtilities.dp(135.0f);
        this.M.set(iDp, iDp2, measuredWidth - iDp, AndroidUtilities.dp(24.0f) + iDp2);
        this.f9347c.setColor(-1069811);
        this.f9350e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.L = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.H.r(str);
    }

    public void setValue(int i10) {
        float fB = b(i10);
        this.V = fB;
        this.W = fB;
        org.telegram.ui.Components.i6 i6Var = this.D;
        i6Var.b();
        i6Var.q(oa.V0(false, LocaleController.formatNumber(getValue(), ','), this.F), true, true);
    }

    public void setValueAnimated(int i10) {
        if (i10 == getValue()) {
            return;
        }
        a(b(i10));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.D || super.verifyDrawable(drawable);
    }
}
