package lh;

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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
public abstract class bb extends View {
    public final Matrix B;
    public boolean C;
    public final Drawable D;
    public final org.telegram.ui.Components.j6 E;
    public final org.telegram.ui.Components.j6 F;
    public final mq[] G;
    public final Paint H;
    public final k01 I;
    public final org.telegram.ui.Components.z5 J;
    public final org.telegram.ui.Components.z5 K;
    public boolean L;
    public long M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final Path R;
    public final Path S;
    public final Path T;
    public final RectF U;
    public final Path V;
    public float W;
    public final org.telegram.ui.ActionBar.f6 f12178a;
    public float f12179a0;
    public final Paint f12180b;
    public int[] f12181b0;
    public final Paint f12182c;
    public final xd.a f12183c0;
    public final Paint d;
    public float f12184d0;
    public final Paint e;
    public float f12185e0;
    public final Paint f12186f;
    public long f12187f0;
    public int f12188g0;
    public final wa h;
    public boolean f12189h0;
    public ValueAnimator f12190i0;
    public final wa f12191n;
    public int f12192r;
    public int f12193s;
    public ValueAnimator v;
    public int f12194w;
    public int f12195x;
    public LinearGradient f12196y;

    public bb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12180b = new Paint(1);
        this.f12182c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f12186f = new Paint(1);
        this.h = new wa(0, 300);
        this.f12191n = new wa(2, 30);
        this.f12192r = -1135603;
        this.f12193s = -404714;
        this.f12194w = -1135603;
        this.f12195x = -404714;
        this.f12196y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f12192r, this.f12193s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.B = new Matrix();
        this.C = true;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.E = j6Var;
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, true, false);
        this.F = j6Var2;
        this.G = new mq[1];
        Paint paint = new Paint(1);
        this.H = paint;
        this.I = new k01(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        nr nrVar = nr.h;
        this.J = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.K = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.M = -1L;
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new Path();
        this.S = new Path();
        this.T = new Path();
        this.U = new RectF();
        this.V = new Path();
        this.W = 0.0f;
        this.f12183c0 = new xd.a(this, nrVar, 320L);
        this.f12178a = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.D = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        j6Var.r(-1);
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.t(AndroidUtilities.dp(21.0f));
        j6Var.setCallback(this);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.f25884b = 17;
        j6Var2.r(-570425345);
        j6Var2.t(AndroidUtilities.dp(11.0f));
        j6Var2.setCallback(this);
        j6Var2.G = AndroidUtilities.displaySize.x;
        j6Var2.f25884b = 17;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f12190i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, f10);
        this.f12190i0 = ofFloat;
        ofFloat.addUpdateListener(new dg.o1(this, 17));
        int value = getValue();
        this.f12190i0.addListener(new ab(this, f10, value));
        this.f12190i0.setDuration(320L);
        this.f12190i0.setInterpolator(nr.h);
        this.f12190i0.start();
        if (c(f10) != value) {
            e(c(f10));
        }
        org.telegram.ui.Components.j6 j6Var = this.E;
        j6Var.b();
        j6Var.q(ja.V0(false, LocaleController.formatNumber(c(f10), ','), this.G), true, true);
    }

    public final float b(int i10) {
        int i11 = 1;
        while (true) {
            int[] iArr = this.f12181b0;
            if (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i10 <= i12) {
                    int i13 = i11 - 1;
                    int i14 = iArr[i13];
                    return (i13 + ((i10 - i14) / (i12 - i14))) / (iArr.length - 1);
                }
                i11++;
            } else {
                return 1.0f;
            }
        }
    }

    public final int c(float f10) {
        int i10;
        int[] iArr;
        if (f10 <= 0.0f) {
            return this.f12181b0[0];
        }
        if (f10 >= 1.0f) {
            return this.f12181b0[iArr.length - 1];
        }
        int[] iArr2 = this.f12181b0;
        float length = f10 * (iArr2.length - 1);
        int i11 = (int) length;
        float f11 = length - i11;
        float f12 = iArr2[i11];
        int i12 = i11 + 1;
        if (i12 < iArr2.length) {
            i11 = i12;
        }
        return Math.round((f11 * (iArr2[i11] - i10)) + f12);
    }

    public boolean d(float f10) {
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.z5 z5Var;
        RectF rectF;
        Paint paint;
        float f10;
        int i10;
        Path.Direction direction;
        Paint paint2;
        org.telegram.ui.Components.z5 z5Var2;
        Canvas canvas2;
        int i11;
        float f11;
        boolean z4;
        boolean z10;
        float f12;
        boolean z11;
        boolean z12;
        float f13;
        super.dispatchDraw(canvas);
        Matrix matrix = this.B;
        matrix.reset();
        RectF rectF2 = this.N;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.f12196y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.f12196y;
        Paint paint3 = this.f12182c;
        paint3.setShader(linearGradient);
        int d = i0.a.d(this.W, this.f12192r, this.f12193s);
        Path path = this.R;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, this.f12192r);
        Paint paint4 = this.f12180b;
        paint4.setColor(l1);
        canvas.drawPath(path, paint4);
        RectF rectF3 = this.O;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, b10);
        Path path2 = this.S;
        path2.rewind();
        path2.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        wa waVar = this.h;
        waVar.g(rectF2);
        float f14 = this.W;
        waVar.h = (f14 * 15.0f) + 1.0f;
        waVar.f13318j = (int) (waVar.f13313b.size() * ((f14 * 0.85f) + 0.15f));
        waVar.d();
        canvas.save();
        canvas.clipPath(path);
        waVar.a(canvas, d);
        long j10 = this.M;
        org.telegram.ui.Components.z5 z5Var3 = this.K;
        org.telegram.ui.Components.z5 z5Var4 = this.J;
        k01 k01Var = this.I;
        Paint paint5 = this.H;
        if (j10 != -1 && b((int) j10) < 1.0f && b((int) this.M) > 0.0f) {
            float clamp01 = (Utilities.clamp01(b((int) this.M)) * (rectF2.width() - AndroidUtilities.dp(24.0f))) + rectF2.left + AndroidUtilities.dp(12.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - clamp01) < AndroidUtilities.dp(14.0f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float e = z5Var4.e(z11);
            int dp = AndroidUtilities.dp(9.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - clamp01) < AndroidUtilities.dp(12.0f)) {
                z12 = true;
            } else {
                z12 = false;
            }
            float lerp = AndroidUtilities.lerp(dp, dp2, z5Var3.e(z12));
            if (clamp01 + k01Var.f26084c + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f13 = (clamp01 - lerp) - k01Var.f26084c;
            } else {
                f13 = clamp01 + lerp;
            }
            float f15 = f13;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.j6.l1(0.6f, d));
            z5Var = z5Var3;
            paint = paint4;
            rectF = rectF3;
            f10 = b10;
            i10 = d;
            z5Var2 = z5Var4;
            canvas.drawLine(clamp01, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e), clamp01, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e), paint5);
            direction = direction2;
            paint2 = paint5;
            this.I.c(f15, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        } else {
            z5Var = z5Var3;
            rectF = rectF3;
            paint = paint4;
            f10 = b10;
            i10 = d;
            direction = direction2;
            paint2 = paint5;
            z5Var2 = z5Var4;
            canvas2 = canvas;
        }
        canvas2.drawPath(path2, paint3);
        canvas2.clipPath(path2);
        waVar.a(canvas2, -1);
        long j11 = this.M;
        if (j11 != -1 && b((int) j11) < 1.0f && b((int) this.M) > 0.0f) {
            float dp3 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.M)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp3) < AndroidUtilities.dp(14.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e6 = z5Var2.e(z4);
            int dp4 = AndroidUtilities.dp(9.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp3) < AndroidUtilities.dp(12.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float lerp2 = AndroidUtilities.lerp(dp4, dp5, z5Var.e(z10));
            if (k01Var.f26084c + dp3 + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f12 = (dp3 - lerp2) - k01Var.f26084c;
            } else {
                f12 = lerp2 + dp3;
            }
            float f16 = f12;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, this.f12178a)));
            i11 = i10;
            canvas2.drawLine(dp3, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e6), dp3, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e6), paint2);
            this.I.c(f16, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i11 = i10;
        }
        canvas2.restore();
        invalidate();
        if (this.L) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int d10 = i0.a.d(0.5f, paint.getColor(), this.f12193s);
            Paint paint6 = this.d;
            paint6.setColor(d10);
            Path path3 = this.T;
            path3.rewind();
            f11 = 0.5f;
            Path.Direction direction3 = direction;
            path3.addRoundRect(height - AndroidUtilities.dp(1.0f), centerY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + height, centerY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            path3.addRoundRect(height - AndroidUtilities.dp(6.0f), centerY - AndroidUtilities.dp(1.0f), height + AndroidUtilities.dp(6.0f), centerY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            canvas2.drawPath(path3, paint6);
        } else {
            f11 = 0.5f;
        }
        float dp6 = (rectF.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f);
        float centerY2 = rectF.centerY() - (AndroidUtilities.dp(16.0f) / 2.0f);
        float dp7 = rectF.right - AndroidUtilities.dp(4.0f);
        float dp8 = (AndroidUtilities.dp(16.0f) / 2.0f) + rectF.centerY();
        RectF rectF4 = this.P;
        rectF4.set(dp6, centerY2, dp7, dp8);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.e);
        float dp9 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float f17 = f10;
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f17), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f17), Math.min(Utilities.clamp01(f17 / dp9), Utilities.clamp01((1.0f - f17) / dp9)));
        org.telegram.ui.Components.j6 j6Var = this.F;
        float d11 = j6Var.d() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.j6 j6Var2 = this.E;
        float max = Math.max(d11, j6Var2.d() + AndroidUtilities.dp(50.0f));
        float clamp = Utilities.clamp(lerp3 - (max / 2.0f), (rectF2.right - max) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float dp10 = rectF2.top - AndroidUtilities.dp(21.0f);
        float dp11 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.U;
        rectF5.set(clamp, dp10 - AndroidUtilities.dp(44.0f), max + clamp, dp11);
        float height2 = rectF5.height();
        float f18 = height2 / 2.0f;
        float clamp2 = Utilities.clamp(lerp3, rectF5.right, rectF5.left);
        float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
        float clamp5 = Utilities.clamp(this.W - this.f12179a0, 1.0f, -1.0f) * 60.0f;
        float dp12 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path4 = this.V;
        path4.rewind();
        float f19 = rectF5.left;
        float f20 = rectF5.top;
        RectF rectF6 = this.Q;
        rectF6.set(f19, f20, f19 + height2, f20 + height2);
        path4.arcTo(rectF6, -180.0f, 90.0f);
        float f21 = rectF5.right;
        float f22 = rectF5.top;
        rectF6.set(f21 - height2, f22, f21, f22 + height2);
        path4.arcTo(rectF6, -90.0f, 90.0f);
        float f23 = rectF5.right;
        float f24 = rectF5.bottom;
        rectF6.set(f23 - height2, f24 - height2, f23, f24);
        path4.arcTo(rectF6, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp4 - rectF6.centerX()) / f18)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
        float f25 = 0.7f * height2;
        if (clamp3 < rectF5.right - f25) {
            path4.lineTo(clamp4, rectF5.bottom);
            path4.lineTo(clamp2 + 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
        }
        path4.lineTo(clamp2, rectF5.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
        if (clamp4 > rectF5.left + f25) {
            path4.lineTo(clamp2 - 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
            path4.lineTo(clamp3, rectF5.bottom);
        }
        float f26 = rectF5.left;
        float f27 = rectF5.bottom;
        rectF6.set(f26, f27 - height2, f26 + height2, f27);
        float clamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp3 - rectF6.left) / f18)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
        path4.arcTo(rectF6, clamp6, 180.0f - clamp6);
        path4.lineTo(rectF5.left, rectF5.bottom);
        path4.close();
        RectF rectF7 = AndroidUtilities.rectTmp;
        rectF7.set(rectF5);
        rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
        wa waVar2 = this.f12191n;
        waVar2.g(rectF7);
        waVar2.h = (this.W * 15.0f) + 1.0f;
        waVar2.d();
        canvas2.save();
        waVar2.a(canvas2, i11);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(clamp5, clamp2, dp12);
        if (Math.abs(this.W - this.f12179a0) > 0.001f) {
            this.f12179a0 = AndroidUtilities.lerp(this.f12179a0, this.W, 0.1f);
            invalidate();
        }
        this.f12186f.setShader(this.f12196y);
        canvas2.drawPath(path4, this.f12186f);
        canvas2.save();
        canvas2.clipPath(path4);
        canvas2.rotate(-clamp5, clamp2, dp12);
        waVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f28 = 1.0f - (this.f12183c0.e * 0.15f);
        canvas2.scale(f28, f28, rectF5.centerX(), rectF5.top - (rectF5.height() * f11));
        this.D.setBounds((int) ((rectF5.centerX() - (j6Var2.d() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (j6Var2.d() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.C) {
            this.D.draw(canvas2);
        }
        j6Var2.l(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        j6Var2.draw(canvas2);
        canvas2.restore();
        j6Var.l(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        j6Var.f25901w = (int) (this.f12183c0.e * 255.0f);
        j6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f12184d0 = motionEvent.getX();
            this.f12185e0 = motionEvent.getY();
            this.f12188g0 = motionEvent.getPointerId(0);
            this.f12187f0 = System.currentTimeMillis();
            this.f12189h0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f12188g0) {
            float x10 = motionEvent.getX() - this.f12184d0;
            float y10 = motionEvent.getY() - this.f12185e0;
            if (!this.f12189h0 && Math.abs(x10) > Math.abs(y10 * 1.5f) && Math.abs(x10) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f12189h0 = true;
                ValueAnimator valueAnimator = this.f12190i0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f12189h0) {
                int value = getValue();
                this.W = Utilities.clamp01((x10 / (getWidth() * 1.0f)) + this.W);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.j6 j6Var = this.E;
                    j6Var.b();
                    j6Var.q(ja.V0(false, LocaleController.formatNumber(getValue(), ','), this.G), true, true);
                }
                this.f12184d0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f12189h0 && motionEvent.getPointerId(0) == this.f12188g0 && k7.n6.a(this.f12184d0, this.f12185e0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && ((float) (System.currentTimeMillis() - this.f12187f0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.N;
                    float clamp01 = Utilities.clamp01((x12 - rectF.left) / rectF.width());
                    long j10 = this.M;
                    if (j10 > 0 && Math.abs(b((int) j10) - clamp01) < 0.035f) {
                        clamp01 = Utilities.clamp01(b((int) this.M));
                    }
                    a(clamp01);
                }
            }
            this.f12189h0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z4) {
        if (this.f12194w == i10 && this.f12195x == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (z4) {
            int i12 = this.f12192r;
            int i13 = this.f12193s;
            this.f12194w = i10;
            this.f12195x = i11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ya(this, i12, i10, i13, i11, 0));
            this.v.addListener(new za(this, i12, i10, i13, i11));
            this.v.setInterpolator(nr.h);
            this.v.setDuration(420L);
            this.v.start();
            return;
        }
        this.f12194w = i10;
        this.f12192r = i10;
        this.f12195x = i11;
        this.f12193s = i11;
        this.f12196y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f12192r, this.f12193s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.f12183c0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.j6 j6Var = this.F;
        j6Var.b();
        j6Var.q(str, true, true);
    }

    public float getProgress() {
        return this.W;
    }

    public int getValue() {
        return c(this.W);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = AndroidUtilities.dp(135.0f);
        this.N.set(dp, dp2, measuredWidth - dp, AndroidUtilities.dp(24.0f) + dp2);
        this.f12182c.setColor(-1069811);
        this.e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.M = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.I.r(str);
    }

    public void setValue(int i10) {
        float b10 = b(i10);
        this.W = b10;
        this.f12179a0 = b10;
        org.telegram.ui.Components.j6 j6Var = this.E;
        j6Var.b();
        j6Var.q(ja.V0(false, LocaleController.formatNumber(getValue(), ','), this.G), true, true);
    }

    public void setValueAnimated(int i10) {
        if (i10 == getValue()) {
            return;
        }
        a(b(i10));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
