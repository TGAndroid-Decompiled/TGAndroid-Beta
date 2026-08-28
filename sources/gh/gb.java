package gh;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
public abstract class gb extends View {
    public final Matrix A;
    public boolean B;
    public final Drawable C;
    public final org.telegram.ui.Components.i6 D;
    public final org.telegram.ui.Components.i6 E;
    public final eq[] F;
    public final Paint G;
    public final nz0 H;
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
    public final org.telegram.ui.ActionBar.b6 f8165a;
    public int[] f8166a0;
    public final Paint f8167b;
    public final td.a f8168b0;
    public final Paint f8169c;
    public float f8170c0;
    public final Paint d;
    public float f8171d0;
    public final Paint f8172e;
    public long f8173e0;
    public final Paint f8174f;
    public int f8175f0;
    public boolean f8176g0;
    public final bb h;
    public ValueAnimator f8177h0;
    public final bb f8178n;
    public int f8179r;
    public int f8180s;
    public ValueAnimator v;
    public int f8181w;
    public int f8182x;
    public LinearGradient f8183y;

    public gb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f8167b = new Paint(1);
        this.f8169c = new Paint(1);
        this.d = new Paint(1);
        this.f8172e = new Paint(1);
        this.f8174f = new Paint(1);
        this.h = new bb(0, 300);
        this.f8178n = new bb(2, 30);
        this.f8179r = -1135603;
        this.f8180s = -404714;
        this.f8181w = -1135603;
        this.f8182x = -404714;
        this.f8183y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f8179r, this.f8180s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = new Matrix();
        this.B = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.D = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true, false);
        this.E = i6Var2;
        this.F = new eq[1];
        Paint paint = new Paint(1);
        this.G = paint;
        this.H = new nz0(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        gr grVar = gr.h;
        this.I = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.J = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
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
        this.f8168b0 = new td.a(this, grVar, 320L);
        this.f8165a = b6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.C = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.t(AndroidUtilities.dp(21.0f));
        i6Var.setCallback(this);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.f29333b = 17;
        i6Var2.r(-570425345);
        i6Var2.t(AndroidUtilities.dp(11.0f));
        i6Var2.setCallback(this);
        i6Var2.G = AndroidUtilities.displaySize.x;
        i6Var2.f29333b = 17;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.f8177h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, f10);
        this.f8177h0 = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 8));
        int value = getValue();
        this.f8177h0.addListener(new fb(this, f10, value));
        this.f8177h0.setDuration(320L);
        this.f8177h0.setInterpolator(gr.h);
        this.f8177h0.start();
        if (c(f10) != value) {
            e(c(f10));
        }
        org.telegram.ui.Components.i6 i6Var = this.D;
        i6Var.b();
        i6Var.q(oa.V0(false, LocaleController.formatNumber(c(f10), ','), this.F), true, true);
    }

    public final float b(int i9) {
        int i10 = 1;
        while (true) {
            int[] iArr = this.f8166a0;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i9 <= i11) {
                    int i12 = i10 - 1;
                    int i13 = iArr[i12];
                    return (i12 + ((i9 - i13) / (i11 - i13))) / (iArr.length - 1);
                }
                i10++;
            } else {
                return 1.0f;
            }
        }
    }

    public final int c(float f10) {
        int i9;
        int[] iArr;
        if (f10 <= 0.0f) {
            return this.f8166a0[0];
        }
        if (f10 >= 1.0f) {
            return this.f8166a0[iArr.length - 1];
        }
        int[] iArr2 = this.f8166a0;
        float length = f10 * (iArr2.length - 1);
        int i10 = (int) length;
        float f11 = length - i10;
        float f12 = iArr2[i10];
        int i11 = i10 + 1;
        if (i11 < iArr2.length) {
            i10 = i11;
        }
        return Math.round((f11 * (iArr2[i10] - i9)) + f12);
    }

    public boolean d(float f10) {
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.y5 y5Var;
        RectF rectF;
        Paint paint;
        float f10;
        int i9;
        Path.Direction direction;
        Paint paint2;
        org.telegram.ui.Components.y5 y5Var2;
        Canvas canvas2;
        int i10;
        float f11;
        boolean z10;
        boolean z11;
        float f12;
        boolean z12;
        boolean z13;
        float f13;
        super.dispatchDraw(canvas);
        Matrix matrix = this.A;
        matrix.reset();
        RectF rectF2 = this.M;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.f8183y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.f8183y;
        Paint paint3 = this.f8169c;
        paint3.setShader(linearGradient);
        int d = i0.a.d(this.V, this.f8179r, this.f8180s);
        Path path = this.Q;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, this.f8179r);
        Paint paint4 = this.f8167b;
        paint4.setColor(l1);
        canvas.drawPath(path, paint4);
        RectF rectF3 = this.N;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, b10);
        Path path2 = this.R;
        path2.rewind();
        path2.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        bb bbVar = this.h;
        bbVar.g(rectF2);
        float f14 = this.V;
        bbVar.h = (f14 * 15.0f) + 1.0f;
        bbVar.f7884j = (int) (bbVar.f7878b.size() * ((f14 * 0.85f) + 0.15f));
        bbVar.d();
        canvas.save();
        canvas.clipPath(path);
        bbVar.a(canvas, d);
        long j10 = this.L;
        org.telegram.ui.Components.y5 y5Var3 = this.J;
        org.telegram.ui.Components.y5 y5Var4 = this.I;
        nz0 nz0Var = this.H;
        Paint paint5 = this.G;
        if (j10 != -1 && b((int) j10) < 1.0f && b((int) this.L) > 0.0f) {
            float clamp01 = (Utilities.clamp01(b((int) this.L)) * (rectF2.width() - AndroidUtilities.dp(24.0f))) + rectF2.left + AndroidUtilities.dp(12.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - clamp01) < AndroidUtilities.dp(14.0f)) {
                z12 = true;
            } else {
                z12 = false;
            }
            float e10 = y5Var4.e(z12);
            int dp = AndroidUtilities.dp(9.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - clamp01) < AndroidUtilities.dp(12.0f)) {
                z13 = true;
            } else {
                z13 = false;
            }
            float lerp = AndroidUtilities.lerp(dp, dp2, y5Var3.e(z13));
            if (clamp01 + nz0Var.f31223c + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f13 = (clamp01 - lerp) - nz0Var.f31223c;
            } else {
                f13 = clamp01 + lerp;
            }
            float f15 = f13;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.f6.l1(0.6f, d));
            y5Var = y5Var3;
            paint = paint4;
            rectF = rectF3;
            f10 = b10;
            i9 = d;
            y5Var2 = y5Var4;
            canvas.drawLine(clamp01, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e10), clamp01, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e10), paint5);
            direction = direction2;
            paint2 = paint5;
            this.H.c(f15, rectF2.centerY(), 0.6f, i9, canvas);
            canvas2 = canvas;
        } else {
            y5Var = y5Var3;
            rectF = rectF3;
            paint = paint4;
            f10 = b10;
            i9 = d;
            direction = direction2;
            paint2 = paint5;
            y5Var2 = y5Var4;
            canvas2 = canvas;
        }
        canvas2.drawPath(path2, paint3);
        canvas2.clipPath(path2);
        bbVar.a(canvas2, -1);
        long j11 = this.L;
        if (j11 != -1 && b((int) j11) < 1.0f && b((int) this.L) > 0.0f) {
            float dp3 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.L)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp3) < AndroidUtilities.dp(14.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e11 = y5Var2.e(z10);
            int dp4 = AndroidUtilities.dp(9.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp3) < AndroidUtilities.dp(12.0f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float lerp2 = AndroidUtilities.lerp(dp4, dp5, y5Var.e(z11));
            if (nz0Var.f31223c + dp3 + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f12 = (dp3 - lerp2) - nz0Var.f31223c;
            } else {
                f12 = lerp2 + dp3;
            }
            float f16 = f12;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.f6.l1(0.4f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, this.f8165a)));
            i10 = i9;
            canvas2.drawLine(dp3, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e11), dp3, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e11), paint2);
            this.H.c(f16, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i10 = i9;
        }
        canvas2.restore();
        invalidate();
        if (this.K) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int d9 = i0.a.d(0.5f, paint.getColor(), this.f8180s);
            Paint paint6 = this.d;
            paint6.setColor(d9);
            Path path3 = this.S;
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
        RectF rectF4 = this.O;
        rectF4.set(dp6, centerY2, dp7, dp8);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f8172e);
        float dp9 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float f17 = f10;
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f17), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f17), Math.min(Utilities.clamp01(f17 / dp9), Utilities.clamp01((1.0f - f17) / dp9)));
        org.telegram.ui.Components.i6 i6Var = this.E;
        float d10 = i6Var.d() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.i6 i6Var2 = this.D;
        float max = Math.max(d10, i6Var2.d() + AndroidUtilities.dp(50.0f));
        float clamp = Utilities.clamp(lerp3 - (max / 2.0f), (rectF2.right - max) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float dp10 = rectF2.top - AndroidUtilities.dp(21.0f);
        float dp11 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.T;
        rectF5.set(clamp, dp10 - AndroidUtilities.dp(44.0f), max + clamp, dp11);
        float height2 = rectF5.height();
        float f18 = height2 / 2.0f;
        float clamp2 = Utilities.clamp(lerp3, rectF5.right, rectF5.left);
        float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
        float clamp5 = Utilities.clamp(this.V - this.W, 1.0f, -1.0f) * 60.0f;
        float dp12 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path4 = this.U;
        path4.rewind();
        float f19 = rectF5.left;
        float f20 = rectF5.top;
        RectF rectF6 = this.P;
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
        bb bbVar2 = this.f8178n;
        bbVar2.g(rectF7);
        bbVar2.h = (this.V * 15.0f) + 1.0f;
        bbVar2.d();
        canvas2.save();
        bbVar2.a(canvas2, i10);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(clamp5, clamp2, dp12);
        if (Math.abs(this.V - this.W) > 0.001f) {
            this.W = AndroidUtilities.lerp(this.W, this.V, 0.1f);
            invalidate();
        }
        this.f8174f.setShader(this.f8183y);
        canvas2.drawPath(path4, this.f8174f);
        canvas2.save();
        canvas2.clipPath(path4);
        canvas2.rotate(-clamp5, clamp2, dp12);
        bbVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f28 = 1.0f - (this.f8168b0.f47775e * 0.15f);
        canvas2.scale(f28, f28, rectF5.centerX(), rectF5.top - (rectF5.height() * f11));
        this.C.setBounds((int) ((rectF5.centerX() - (i6Var2.d() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (i6Var2.d() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.B) {
            this.C.draw(canvas2);
        }
        i6Var2.l(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        i6Var2.draw(canvas2);
        canvas2.restore();
        i6Var.l(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        i6Var.f29351w = (int) (this.f8168b0.f47775e * 255.0f);
        i6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8170c0 = motionEvent.getX();
            this.f8171d0 = motionEvent.getY();
            this.f8175f0 = motionEvent.getPointerId(0);
            this.f8173e0 = System.currentTimeMillis();
            this.f8176g0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f8175f0) {
            float x10 = motionEvent.getX() - this.f8170c0;
            float y10 = motionEvent.getY() - this.f8171d0;
            if (!this.f8176g0 && Math.abs(x10) > Math.abs(y10 * 1.5f) && Math.abs(x10) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f8176g0 = true;
                ValueAnimator valueAnimator = this.f8177h0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f8176g0) {
                int value = getValue();
                this.V = Utilities.clamp01((x10 / (getWidth() * 1.0f)) + this.V);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.i6 i6Var = this.D;
                    i6Var.b();
                    i6Var.q(oa.V0(false, LocaleController.formatNumber(getValue(), ','), this.F), true, true);
                }
                this.f8170c0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f8176g0 && motionEvent.getPointerId(0) == this.f8175f0 && g7.w.a(this.f8170c0, this.f8171d0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && ((float) (System.currentTimeMillis() - this.f8173e0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.M;
                    float clamp01 = Utilities.clamp01((x12 - rectF.left) / rectF.width());
                    long j10 = this.L;
                    if (j10 > 0 && Math.abs(b((int) j10) - clamp01) < 0.035f) {
                        clamp01 = Utilities.clamp01(b((int) this.L));
                    }
                    a(clamp01);
                }
            }
            this.f8176g0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i9);

    public final void f(int i9, int i10, boolean z10) {
        if (this.f8181w == i9 && this.f8182x == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (z10) {
            int i11 = this.f8179r;
            int i12 = this.f8180s;
            this.f8181w = i9;
            this.f8182x = i10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new db(this, i11, i9, i12, i10, 0));
            this.v.addListener(new eb(this, i11, i9, i12, i10));
            this.v.setInterpolator(gr.h);
            this.v.setDuration(420L);
            this.v.start();
            return;
        }
        this.f8181w = i9;
        this.f8179r = i9;
        this.f8182x = i10;
        this.f8180s = i10;
        this.f8183y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f8179r, this.f8180s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.f8168b0.a(!TextUtils.isEmpty(str), true);
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
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = AndroidUtilities.dp(135.0f);
        this.M.set(dp, dp2, measuredWidth - dp, AndroidUtilities.dp(24.0f) + dp2);
        this.f8169c.setColor(-1069811);
        this.f8172e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.L = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.H.r(str);
    }

    public void setValue(int i9) {
        float b10 = b(i9);
        this.V = b10;
        this.W = b10;
        org.telegram.ui.Components.i6 i6Var = this.D;
        i6Var.b();
        i6Var.q(oa.V0(false, LocaleController.formatNumber(getValue(), ','), this.F), true, true);
    }

    public void setValueAnimated(int i9) {
        if (i9 == getValue()) {
            return;
        }
        a(b(i9));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.D && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
