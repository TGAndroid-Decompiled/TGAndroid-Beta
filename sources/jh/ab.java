package jh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
public abstract class ab extends View {
    public final Matrix A;
    public boolean B;
    public final Drawable C;
    public final org.telegram.ui.Components.n6 D;
    public final org.telegram.ui.Components.n6 E;
    public final iq[] F;
    public final Paint G;
    public final zz0 H;
    public final org.telegram.ui.Components.d6 I;
    public final org.telegram.ui.Components.d6 J;
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
    public final org.telegram.ui.ActionBar.c6 f11748a;
    public int[] f11749a0;
    public final Paint f11750b;
    public final vd.a f11751b0;
    public final Paint f11752c;
    public float f11753c0;
    public final Paint d;
    public float f11754d0;
    public final Paint f11755e;
    public long f11756e0;
    public final Paint f11757f;
    public int f11758f0;
    public boolean f11759g0;
    public final va h;
    public ValueAnimator f11760h0;
    public final va f11761n;
    public int f11762r;
    public int f11763s;
    public ValueAnimator v;
    public int f11764w;
    public int f11765x;
    public LinearGradient f11766y;

    public ab(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f11750b = new Paint(1);
        this.f11752c = new Paint(1);
        this.d = new Paint(1);
        this.f11755e = new Paint(1);
        this.f11757f = new Paint(1);
        this.h = new va(0, 300);
        this.f11761n = new va(2, 30);
        this.f11762r = -1135603;
        this.f11763s = -404714;
        this.f11764w = -1135603;
        this.f11765x = -404714;
        this.f11766y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f11762r, this.f11763s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = new Matrix();
        this.B = true;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.D = n6Var;
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, true, true, false);
        this.E = n6Var2;
        this.F = new iq[1];
        Paint paint = new Paint(1);
        this.G = paint;
        this.H = new zz0(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        jr jrVar = jr.h;
        this.I = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.J = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
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
        this.f11751b0 = new vd.a(this, jrVar, 320L);
        this.f11748a = c6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.C = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.t(AndroidUtilities.dp(21.0f));
        n6Var.setCallback(this);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.f30862b = 17;
        n6Var2.r(-570425345);
        n6Var2.t(AndroidUtilities.dp(11.0f));
        n6Var2.setCallback(this);
        n6Var2.G = AndroidUtilities.displaySize.x;
        n6Var2.f30862b = 17;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f9) {
        ValueAnimator valueAnimator = this.f11760h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, f9);
        this.f11760h0 = ofFloat;
        ofFloat.addUpdateListener(new bg.q1(this, 17));
        int value = getValue();
        this.f11760h0.addListener(new za(this, f9, value));
        this.f11760h0.setDuration(320L);
        this.f11760h0.setInterpolator(jr.h);
        this.f11760h0.start();
        if (c(f9) != value) {
            e(c(f9));
        }
        org.telegram.ui.Components.n6 n6Var = this.D;
        n6Var.b();
        n6Var.q(ia.V0(false, LocaleController.formatNumber(c(f9), ','), this.F), true, true);
    }

    public final float b(int i10) {
        int i11 = 1;
        while (true) {
            int[] iArr = this.f11749a0;
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

    public final int c(float f9) {
        int i10;
        int[] iArr;
        if (f9 <= 0.0f) {
            return this.f11749a0[0];
        }
        if (f9 >= 1.0f) {
            return this.f11749a0[iArr.length - 1];
        }
        int[] iArr2 = this.f11749a0;
        float length = f9 * (iArr2.length - 1);
        int i11 = (int) length;
        float f10 = length - i11;
        float f11 = iArr2[i11];
        int i12 = i11 + 1;
        if (i12 < iArr2.length) {
            i11 = i12;
        }
        return Math.round((f10 * (iArr2[i11] - i10)) + f11);
    }

    public boolean d(float f9) {
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.d6 d6Var;
        RectF rectF;
        Paint paint;
        float f9;
        int i10;
        Path.Direction direction;
        Paint paint2;
        org.telegram.ui.Components.d6 d6Var2;
        Canvas canvas2;
        int i11;
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        boolean z12;
        boolean z13;
        float f12;
        super.dispatchDraw(canvas);
        Matrix matrix = this.A;
        matrix.reset();
        RectF rectF2 = this.M;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.f11766y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.f11766y;
        Paint paint3 = this.f11752c;
        paint3.setShader(linearGradient);
        int d = i0.a.d(this.V, this.f11762r, this.f11763s);
        Path path = this.Q;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.15f, this.f11762r);
        Paint paint4 = this.f11750b;
        paint4.setColor(l1);
        canvas.drawPath(path, paint4);
        RectF rectF3 = this.N;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, b10);
        Path path2 = this.R;
        path2.rewind();
        path2.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        va vaVar = this.h;
        vaVar.g(rectF2);
        float f13 = this.V;
        vaVar.h = (f13 * 15.0f) + 1.0f;
        vaVar.f12993j = (int) (vaVar.f12987b.size() * ((f13 * 0.85f) + 0.15f));
        vaVar.d();
        canvas.save();
        canvas.clipPath(path);
        vaVar.a(canvas, d);
        long j10 = this.L;
        org.telegram.ui.Components.d6 d6Var3 = this.J;
        org.telegram.ui.Components.d6 d6Var4 = this.I;
        zz0 zz0Var = this.H;
        Paint paint5 = this.G;
        if (j10 != -1 && b((int) j10) < 1.0f && b((int) this.L) > 0.0f) {
            float clamp01 = (Utilities.clamp01(b((int) this.L)) * (rectF2.width() - AndroidUtilities.dp(24.0f))) + rectF2.left + AndroidUtilities.dp(12.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - clamp01) < AndroidUtilities.dp(14.0f)) {
                z12 = true;
            } else {
                z12 = false;
            }
            float e10 = d6Var4.e(z12);
            int dp = AndroidUtilities.dp(9.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - clamp01) < AndroidUtilities.dp(12.0f)) {
                z13 = true;
            } else {
                z13 = false;
            }
            float lerp = AndroidUtilities.lerp(dp, dp2, d6Var3.e(z13));
            if (clamp01 + zz0Var.f35462c + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f12 = (clamp01 - lerp) - zz0Var.f35462c;
            } else {
                f12 = clamp01 + lerp;
            }
            float f14 = f12;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.g6.l1(0.6f, d));
            d6Var = d6Var3;
            paint = paint4;
            rectF = rectF3;
            f9 = b10;
            i10 = d;
            d6Var2 = d6Var4;
            canvas.drawLine(clamp01, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e10), clamp01, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e10), paint5);
            direction = direction2;
            paint2 = paint5;
            this.H.c(f14, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        } else {
            d6Var = d6Var3;
            rectF = rectF3;
            paint = paint4;
            f9 = b10;
            i10 = d;
            direction = direction2;
            paint2 = paint5;
            d6Var2 = d6Var4;
            canvas2 = canvas;
        }
        canvas2.drawPath(path2, paint3);
        canvas2.clipPath(path2);
        vaVar.a(canvas2, -1);
        long j11 = this.L;
        if (j11 != -1 && b((int) j11) < 1.0f && b((int) this.L) > 0.0f) {
            float dp3 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.L)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp3) < AndroidUtilities.dp(14.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e11 = d6Var2.e(z10);
            int dp4 = AndroidUtilities.dp(9.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp3) < AndroidUtilities.dp(12.0f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float lerp2 = AndroidUtilities.lerp(dp4, dp5, d6Var.e(z11));
            if (zz0Var.f35462c + dp3 + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f11 = (dp3 - lerp2) - zz0Var.f35462c;
            } else {
                f11 = lerp2 + dp3;
            }
            float f15 = f11;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, this.f11748a)));
            i11 = i10;
            canvas2.drawLine(dp3, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e11), dp3, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e11), paint2);
            this.H.c(f15, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i11 = i10;
        }
        canvas2.restore();
        invalidate();
        if (this.K) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int d10 = i0.a.d(0.5f, paint.getColor(), this.f11763s);
            Paint paint6 = this.d;
            paint6.setColor(d10);
            Path path3 = this.S;
            path3.rewind();
            f10 = 0.5f;
            Path.Direction direction3 = direction;
            path3.addRoundRect(height - AndroidUtilities.dp(1.0f), centerY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + height, centerY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            path3.addRoundRect(height - AndroidUtilities.dp(6.0f), centerY - AndroidUtilities.dp(1.0f), height + AndroidUtilities.dp(6.0f), centerY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            canvas2.drawPath(path3, paint6);
        } else {
            f10 = 0.5f;
        }
        float dp6 = (rectF.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f);
        float centerY2 = rectF.centerY() - (AndroidUtilities.dp(16.0f) / 2.0f);
        float dp7 = rectF.right - AndroidUtilities.dp(4.0f);
        float dp8 = (AndroidUtilities.dp(16.0f) / 2.0f) + rectF.centerY();
        RectF rectF4 = this.O;
        rectF4.set(dp6, centerY2, dp7, dp8);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f11755e);
        float dp9 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float f16 = f9;
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f16), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f16), Math.min(Utilities.clamp01(f16 / dp9), Utilities.clamp01((1.0f - f16) / dp9)));
        org.telegram.ui.Components.n6 n6Var = this.E;
        float d11 = n6Var.d() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.n6 n6Var2 = this.D;
        float max = Math.max(d11, n6Var2.d() + AndroidUtilities.dp(50.0f));
        float clamp = Utilities.clamp(lerp3 - (max / 2.0f), (rectF2.right - max) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float dp10 = rectF2.top - AndroidUtilities.dp(21.0f);
        float dp11 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.T;
        rectF5.set(clamp, dp10 - AndroidUtilities.dp(44.0f), max + clamp, dp11);
        float height2 = rectF5.height();
        float f17 = height2 / 2.0f;
        float clamp2 = Utilities.clamp(lerp3, rectF5.right, rectF5.left);
        float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
        float clamp5 = Utilities.clamp(this.V - this.W, 1.0f, -1.0f) * 60.0f;
        float dp12 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path4 = this.U;
        path4.rewind();
        float f18 = rectF5.left;
        float f19 = rectF5.top;
        RectF rectF6 = this.P;
        rectF6.set(f18, f19, f18 + height2, f19 + height2);
        path4.arcTo(rectF6, -180.0f, 90.0f);
        float f20 = rectF5.right;
        float f21 = rectF5.top;
        rectF6.set(f20 - height2, f21, f20, f21 + height2);
        path4.arcTo(rectF6, -90.0f, 90.0f);
        float f22 = rectF5.right;
        float f23 = rectF5.bottom;
        rectF6.set(f22 - height2, f23 - height2, f22, f23);
        path4.arcTo(rectF6, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp4 - rectF6.centerX()) / f17)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
        float f24 = 0.7f * height2;
        if (clamp3 < rectF5.right - f24) {
            path4.lineTo(clamp4, rectF5.bottom);
            path4.lineTo(clamp2 + 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
        }
        path4.lineTo(clamp2, rectF5.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
        if (clamp4 > rectF5.left + f24) {
            path4.lineTo(clamp2 - 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
            path4.lineTo(clamp3, rectF5.bottom);
        }
        float f25 = rectF5.left;
        float f26 = rectF5.bottom;
        rectF6.set(f25, f26 - height2, f25 + height2, f26);
        float clamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp3 - rectF6.left) / f17)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
        path4.arcTo(rectF6, clamp6, 180.0f - clamp6);
        path4.lineTo(rectF5.left, rectF5.bottom);
        path4.close();
        RectF rectF7 = AndroidUtilities.rectTmp;
        rectF7.set(rectF5);
        rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
        va vaVar2 = this.f11761n;
        vaVar2.g(rectF7);
        vaVar2.h = (this.V * 15.0f) + 1.0f;
        vaVar2.d();
        canvas2.save();
        vaVar2.a(canvas2, i11);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(clamp5, clamp2, dp12);
        if (Math.abs(this.V - this.W) > 0.001f) {
            this.W = AndroidUtilities.lerp(this.W, this.V, 0.1f);
            invalidate();
        }
        this.f11757f.setShader(this.f11766y);
        canvas2.drawPath(path4, this.f11757f);
        canvas2.save();
        canvas2.clipPath(path4);
        canvas2.rotate(-clamp5, clamp2, dp12);
        vaVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f27 = 1.0f - (this.f11751b0.f49505e * 0.15f);
        canvas2.scale(f27, f27, rectF5.centerX(), rectF5.top - (rectF5.height() * f10));
        this.C.setBounds((int) ((rectF5.centerX() - (n6Var2.d() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (n6Var2.d() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.B) {
            this.C.draw(canvas2);
        }
        n6Var2.l(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        n6Var2.draw(canvas2);
        canvas2.restore();
        n6Var.l(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        n6Var.f30880w = (int) (this.f11751b0.f49505e * 255.0f);
        n6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11753c0 = motionEvent.getX();
            this.f11754d0 = motionEvent.getY();
            this.f11758f0 = motionEvent.getPointerId(0);
            this.f11756e0 = System.currentTimeMillis();
            this.f11759g0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f11758f0) {
            float x4 = motionEvent.getX() - this.f11753c0;
            float y8 = motionEvent.getY() - this.f11754d0;
            if (!this.f11759g0 && Math.abs(x4) > Math.abs(y8 * 1.5f) && Math.abs(x4) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f11759g0 = true;
                ValueAnimator valueAnimator = this.f11760h0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f11759g0) {
                int value = getValue();
                this.V = Utilities.clamp01((x4 / (getWidth() * 1.0f)) + this.V);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.n6 n6Var = this.D;
                    n6Var.b();
                    n6Var.q(ia.V0(false, LocaleController.formatNumber(getValue(), ','), this.F), true, true);
                }
                this.f11753c0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f11759g0 && motionEvent.getPointerId(0) == this.f11758f0 && i7.z5.a(this.f11753c0, this.f11754d0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && ((float) (System.currentTimeMillis() - this.f11756e0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x10 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x10)) {
                    float x11 = motionEvent.getX();
                    RectF rectF = this.M;
                    float clamp01 = Utilities.clamp01((x11 - rectF.left) / rectF.width());
                    long j10 = this.L;
                    if (j10 > 0 && Math.abs(b((int) j10) - clamp01) < 0.035f) {
                        clamp01 = Utilities.clamp01(b((int) this.L));
                    }
                    a(clamp01);
                }
            }
            this.f11759g0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z10) {
        if (this.f11764w == i10 && this.f11765x == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (z10) {
            int i12 = this.f11762r;
            int i13 = this.f11763s;
            this.f11764w = i10;
            this.f11765x = i11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new xa(this, i12, i10, i13, i11, 0));
            this.v.addListener(new ya(this, i12, i10, i13, i11));
            this.v.setInterpolator(jr.h);
            this.v.setDuration(420L);
            this.v.start();
            return;
        }
        this.f11764w = i10;
        this.f11762r = i10;
        this.f11765x = i11;
        this.f11763s = i11;
        this.f11766y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f11762r, this.f11763s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.f11751b0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.n6 n6Var = this.E;
        n6Var.b();
        n6Var.q(str, true, true);
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
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = AndroidUtilities.dp(135.0f);
        this.M.set(dp, dp2, measuredWidth - dp, AndroidUtilities.dp(24.0f) + dp2);
        this.f11752c.setColor(-1069811);
        this.f11755e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.L = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.H.r(str);
    }

    public void setValue(int i10) {
        float b10 = b(i10);
        this.V = b10;
        this.W = b10;
        org.telegram.ui.Components.n6 n6Var = this.D;
        n6Var.b();
        n6Var.q(ia.V0(false, LocaleController.formatNumber(getValue(), ','), this.F), true, true);
    }

    public void setValueAnimated(int i10) {
        if (i10 == getValue()) {
            return;
        }
        a(b(i10));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.D && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
