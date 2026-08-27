package lh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.as0;

public abstract class m extends FrameLayout {
    public final LinearGradient A;
    public pz0 A0;
    public final Matrix B;
    public Path B0;
    public Bitmap C;
    public Paint C0;
    public final TextPaint D;
    public Path D0;
    public final Paint E;
    public float[] E0;
    public final FrameLayout F;
    public final Path F0;
    public final zu0 G;
    public boolean G0;
    public final a4 H;
    public int H0;
    public i I;
    public final org.telegram.ui.Components.y5 I0;
    public int J;
    public Paint J0;
    public final org.telegram.ui.Components.z9 K;
    public RadialGradient K0;
    public final org.telegram.ui.Components.da L;
    public Paint L0;
    public final org.telegram.ui.Components.da M;
    public RadialGradient M0;
    public final org.telegram.ui.Components.da N;
    public Matrix N0;
    public final org.telegram.ui.Components.da O;
    public org.telegram.ui.Components.da P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public final e V;
    public Utilities.CallbackVoidReturn W;

    public org.telegram.ui.ActionBar.c6 f16329a;

    public boolean f16330a0;

    public final FrameLayout f16331b;

    public final org.telegram.ui.Components.nc f16332b0;

    public final jg.i f16333c;

    public ObjectAnimator f16334c0;
    public final jg.i d;

    public jg.a f16335d0;

    public final Paint f16336e;

    public lg.d f16337e0;

    public final g f16338f;

    public Utilities.Callback f16339f0;

    public Utilities.Callback f16340g0;
    public final Drawable h;

    public ObjectAnimator f16341h0;

    public boolean f16342i0;

    public final e f16343j0;

    public float f16344k0;

    public boolean f16345l0;
    public ValueAnimator m0;

    public final dq f16346n;

    public Bitmap f16347n0;

    public BitmapShader f16348o0;

    public Matrix f16349p0;

    public Paint f16350q0;

    public final j f16351r;

    public final org.telegram.ui.Components.y5 f16352r0;

    public final FrameLayout f16353s;

    public int f16354s0;

    public float f16355t0;

    public boolean f16356u0;
    public final org.telegram.ui.Components.j6 v;

    public final RectF f16357v0;

    public int f16358w;

    public final RectF f16359w0;

    public long f16360x;

    public final RectF f16361x0;

    public final Paint f16362y;

    public boolean f16363y0;

    public pz0 f16364z0;

    public m(Context context, FrameLayout frameLayout, zu0 zu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var) {
        super(context);
        jg.i iVar = new jg.i();
        this.f16333c = iVar;
        jg.i iVar2 = new jg.i();
        this.d = iVar2;
        Paint paint = new Paint(1);
        this.f16336e = paint;
        Paint paint2 = new Paint(1);
        this.f16362y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = new Matrix();
        this.D = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.E = paint3;
        this.J = -4;
        this.Q = UserConfig.selectedAccount;
        this.V = new e(this, 0);
        this.f16332b0 = new org.telegram.ui.Components.nc(this, 1.0f, 3.0f);
        this.f16343j0 = new e(this, 1);
        er erVar = er.h;
        this.f16352r0 = new org.telegram.ui.Components.y5(this, 0L, 300L, erVar);
        this.f16356u0 = false;
        this.f16357v0 = new RectF();
        this.f16359w0 = new RectF();
        this.f16361x0 = new RectF();
        this.F0 = new Path();
        this.I0 = new org.telegram.ui.Components.y5(this, 500L, erVar);
        this.f16329a = c6Var;
        this.F = frameLayout;
        this.G = zu0Var;
        this.f16331b = frameLayout2;
        this.K = z9Var;
        this.N = new org.telegram.ui.Components.da(z9Var, this, 0, !g());
        this.O = new org.telegram.ui.Components.da(z9Var, this, 8, false);
        this.M = new org.telegram.ui.Components.da(z9Var, this, 9, false);
        iVar.f13008j = true;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        iVar.a(new f(c6Var, i10, 0.0f, 0));
        iVar.f13006g.setColor(0);
        iVar.invalidateSelf();
        iVar2.f13008j = true;
        iVar2.a(new f(c6Var, i10, 0.0f, 1));
        iVar2.f13006g.setColor(0);
        iVar2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        int i11 = 24;
        this.H = new a4(frameLayout, false, new ag.n0(this, i11));
        g gVar = new g(this, context, zu0Var, getEditTextStyle(), new jh.b(), c6Var, z9Var);
        this.f16338f = gVar;
        gVar.O = true;
        gVar.getEditText().addTextChangedListener(new org.telegram.ui.Cells.f3());
        gVar.setFocusable(true);
        gVar.setFocusableInTouchMode(true);
        gVar.getEditText().hintLayoutYFix = true;
        gVar.getEditText().drawHint = new ch.c(this, i11);
        gVar.getEditText().setSupportRtlHint(true);
        this.L = new org.telegram.ui.Components.da(z9Var, gVar.getEditText(), g() ? 1 : 2, false);
        gVar.getEditText().setHintColor(-1);
        gVar.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gVar.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z10 = this instanceof as0;
        if (z10) {
            gVar.getEditText().setGravity(48);
        }
        gVar.getEmojiButton().setAlpha(0.0f);
        gVar.getEmojiButton().setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.setTranslationY(AndroidUtilities.dp(z10 ? 1.0f : -1.0f));
        gVar.getEditText().addTextChangedListener(new h(this));
        gVar.getEditText().setLinkTextColor(-1);
        addView(gVar, h7.z5.d(-1, -2.0f, (z10 ? 48 : 80) | 7, 12.0f, 8.0f, b() + 12, 8.0f));
        j jVar = new j(context);
        this.f16351r = jVar;
        h7.b6.b(jVar, 0.05f, 1.25f);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.h = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.SRC_IN));
        dq dqVar = new dq(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, c6Var)), drawableMutate, 0, AndroidUtilities.dp(1.0f));
        this.f16346n = dqVar;
        int iDp = AndroidUtilities.dp(36.0f);
        int iDp2 = AndroidUtilities.dp(36.0f);
        dqVar.h = iDp;
        dqVar.f27825n = iDp2;
        jVar.setImageDrawable(dqVar);
        jVar.setScaleType(ImageView.ScaleType.CENTER);
        jVar.setContentDescription(LocaleController.getString(R.string.Done));
        jVar.setAlpha(0.0f);
        jVar.setVisibility(8);
        jVar.setOnClickListener(new ag.w0(this, 27));
        addView(jVar, h7.z5.d(44, 44.0f, (z10 ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.v = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, erVar);
        j6Var.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f16353s = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        frameLayout3.addView(j6Var, h7.z5.e(52, 16, (z10 ? 48 : 80) | 5));
        addView(frameLayout3, h7.z5.d(52, 16.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 50 : 0, 0.0f, z10 ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int a() {
        return AndroidUtilities.navigationBarHeight;
    }

    public int b() {
        return 0;
    }

    public abstract void c(boolean z10);

    @Override
    public final void clearFocus() {
        this.f16338f.clearFocus();
    }

    public abstract void d(boolean z10);

    @Override
    public void dispatchDraw(Canvas canvas) {
        int iMax;
        float f10;
        m mVar;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        float fDp;
        org.telegram.ui.Components.da daVar;
        org.telegram.ui.Components.da daVar2;
        float fDp2;
        float f14;
        Paint paint;
        RectF rectF2;
        char c10;
        char c11;
        float f15;
        int iMin;
        Canvas canvas2 = canvas;
        if (this.f16356u0) {
            return;
        }
        g gVar = this.f16338f;
        int height = gVar.getHeight();
        if (this.G0) {
            iMax = AndroidUtilities.dp(44.0f);
        } else {
            iMax = this.f16345l0 ? Math.max(AndroidUtilities.dp(44.0f), height) : Math.min(AndroidUtilities.dp(82.0f), height);
        }
        if (!this.G0 && this.f16363y0) {
            iMax += AndroidUtilities.dp(50.0f);
        }
        float f16 = iMax;
        int iD = (int) this.f16352r0.d(f16, false);
        if (iD != this.f16354s0) {
            r(iD);
            Utilities.Callback callback = this.f16339f0;
            if (callback != null) {
                callback.run(Integer.valueOf(iD));
            }
            this.f16354s0 = iMax;
        }
        y();
        int iDp = AndroidUtilities.dp(7.0f);
        int iDp2 = AndroidUtilities.dp(8.0f);
        boolean z10 = this instanceof as0;
        RectF rectF3 = this.f16361x0;
        RectF rectF4 = this.f16359w0;
        if (z10) {
            if (!this.G0) {
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(-1.0f), AndroidUtilities.dpf2(1.0f), this.f16344k0);
                lt editText = gVar.getEditText();
                this.f16355t0 = fLerp;
                editText.setTranslationY(fLerp);
            }
            float f17 = iDp;
            float f18 = iDp2;
            int i10 = iDp2 + iD;
            rectF4.set(f17, f18, getWidth() - iDp, i10);
            rectF3.set(f17, f18, getWidth() - iDp, AndroidUtilities.dp(24.0f) + i10);
            f10 = 82.0f;
        } else {
            f10 = 82.0f;
            float fLerp2 = (AndroidUtilities.lerp(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(-1.0f), this.f16344k0) + f16) - iD;
            if (Math.abs(this.f16355t0 - fLerp2) >= 1.0f && !this.G0) {
                lt editText2 = gVar.getEditText();
                this.f16355t0 = fLerp2;
                editText2.setTranslationY(fLerp2);
            }
            rectF4.set(iDp, (getHeight() - iDp2) - iD, getWidth() - iDp, getHeight() - iDp2);
            rectF3.set(0.0f, (getHeight() - iD) - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float fA = this.f16332b0.a(0.018f);
        canvas2.scale(fA, fA, rectF4.centerX(), rectF4.centerY());
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(21.0f), 0, this.f16344k0 * 0.0f);
        jg.a aVar = this.f16335d0;
        if (aVar != null) {
            if (this.f16337e0 == null) {
                lg.d dVarC = aVar.c(this, null, false);
                dVarC.n(ng.c.i(this.f16329a));
                dVarC.o(AndroidUtilities.dp(5.0f));
                dVarC.p(AndroidUtilities.dp(22.0f));
                this.f16337e0 = dVarC;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF4.round(rect);
            rect.inset(-AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), this.f16344k0), -AndroidUtilities.dp(5.0f));
            this.f16337e0.setBounds(rect);
            this.f16337e0.draw(canvas2);
            mVar = this;
            rectF = rectF4;
            f11 = fLerp3;
            f12 = 50.0f;
            f13 = 21.0f;
        } else {
            boolean zG = g();
            Paint paint2 = this.f16336e;
            if (zG) {
                f12 = 50.0f;
                f13 = 21.0f;
                h(this.N, canvas, rectF4, fLerp3, false, 0.0f, 0.0f, true);
                mVar = this;
                canvas2 = canvas;
                rectF = rectF4;
                f11 = fLerp3;
                paint2.setAlpha(AndroidUtilities.lerp(38, 64, mVar.f16344k0));
                canvas2.drawRoundRect(rectF, f11, f11, paint2);
            } else {
                mVar = this;
                rectF = rectF4;
                f11 = fLerp3;
                f12 = 50.0f;
                f13 = 21.0f;
                Paint[] paintArrD = mVar.N.d();
                if (paintArrD[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f11, f11, paint2);
                } else {
                    Paint paint3 = paintArrD[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f11, f11, paint3);
                    }
                    Paint paint4 = paintArrD[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f11, f11, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f11, f11, paint2);
                }
            }
        }
        org.telegram.ui.Components.y5 y5Var = mVar.I0;
        float f19 = y5Var.f34812c;
        float fE = y5Var.e(mVar.G0);
        if (Math.abs(f19 - fE) > 0.001f) {
            mVar.n();
        } else {
            if ((f19 <= 0.0f) != (fE <= 0.0f)) {
                mVar.n();
            }
        }
        if (fE > 0.0f) {
            canvas2.saveLayerAlpha(rectF, 255, 31);
        }
        if (!mVar.f16363y0 || (daVar = mVar.O) == null || (daVar2 = mVar.M) == null) {
            rectF = rectF;
        } else {
            if (mVar.G0) {
                if (mVar.f16345l0) {
                    f15 = rectF.bottom;
                    iMin = Math.max(AndroidUtilities.dp(46.0f), gVar.getHeight());
                } else {
                    f15 = rectF.bottom;
                    iMin = Math.min(AndroidUtilities.dp(f10), gVar.getHeight());
                }
                float f20 = f15 - iMin;
                float f21 = 1.0f - y5Var.f34812c;
                fDp2 = f20 - AndroidUtilities.dp(f12);
                f14 = f21;
            } else {
                fDp2 = rectF.top;
                f14 = 1.0f;
            }
            float f22 = fDp2;
            Paint paintC = daVar.c(f14);
            Paint paintC2 = daVar2.c(f14);
            RectF rectF5 = AndroidUtilities.rectTmp;
            rectF5.set(rectF.left + AndroidUtilities.dp(10.0f), f22 + AndroidUtilities.dp(10.0f), rectF.right - AndroidUtilities.dp(10.0f), f22 + AndroidUtilities.dp(52.0f));
            if (paintC != null) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paintC);
            }
            if (paintC2 != null) {
                paint = paintC2;
                rectF2 = rectF5;
                c10 = 1;
                c11 = 3;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas2 = canvas;
            } else {
                paint = paintC2;
                rectF2 = rectF5;
                c10 = 1;
                c11 = 3;
            }
            Path path = mVar.B0;
            if (path == null) {
                mVar.B0 = new Path();
            } else {
                path.rewind();
            }
            float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(f13), 0, mVar.f16344k0);
            Path path2 = mVar.B0;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF, fLerp4, fLerp4, direction);
            canvas2.clipPath(mVar.B0);
            pz0 pz0Var = mVar.f16364z0;
            if (pz0Var != null) {
                pz0Var.f31708p = (int) (rectF.width() - AndroidUtilities.dp(40.0f));
                pz0Var.c(rectF.left + AndroidUtilities.dp(20.0f), f22 + AndroidUtilities.dp(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = mVar.D0;
            if (path3 == null) {
                mVar.D0 = new Path();
                float[] fArr = new float[8];
                mVar.E0 = fArr;
                float fDp3 = AndroidUtilities.dp(5.0f);
                fArr[c10] = fDp3;
                fArr[0] = fDp3;
                float[] fArr2 = mVar.E0;
                fArr2[c11] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float fDp4 = AndroidUtilities.dp(5.0f);
                fArr2[7] = fDp4;
                fArr2[6] = fDp4;
            } else {
                path3.rewind();
            }
            float f23 = rectF2.left;
            rectF2.set(f23, rectF2.top, AndroidUtilities.dp(3.0f) + f23, rectF2.bottom);
            mVar.D0.addRoundRect(rectF2, mVar.E0, direction);
            if (mVar.C0 == null) {
                Paint paint5 = new Paint();
                mVar.C0 = paint5;
                paint5.setColor(-1);
            }
            mVar.C0.setAlpha((int) (f14 * 255.0f));
            canvas2.drawPath(mVar.D0, mVar.C0);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
                canvas2.restore();
            }
            pz0 pz0Var2 = mVar.A0;
            if (pz0Var2 != null) {
                pz0Var2.f31708p = (int) (rectF.width() - AndroidUtilities.dp(40.0f));
                pz0Var2.c(rectF.left + AndroidUtilities.dp(20.0f), f22 + AndroidUtilities.dp(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (fE > 0.0f) {
            int i11 = mVar.H0;
            if (i11 == Integer.MAX_VALUE) {
                fDp = rectF.right - AndroidUtilities.dp(20.0f);
            } else {
                fDp = i11 == Integer.MIN_VALUE ? rectF.left + AndroidUtilities.dp(20.0f) : i11;
            }
            float fDp5 = rectF.bottom - AndroidUtilities.dp(20.0f);
            float fMax = Math.max(Math.max(h7.y.a(rectF.left, rectF.top, fDp, fDp5), h7.y.a(rectF.left, rectF.bottom, fDp, fDp5)), Math.max(h7.y.a(rectF.right, rectF.top, fDp, fDp5), h7.y.a(rectF.right, rectF.bottom, fDp, fDp5))) * fE;
            if (mVar.J0 == null) {
                Paint paint6 = new Paint(1);
                mVar.J0 = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                mVar.K0 = radialGradient;
                mVar.J0.setShader(radialGradient);
                mVar.N0 = new Matrix();
                Paint paint7 = new Paint(1);
                mVar.L0 = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, -1}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                mVar.M0 = radialGradient2;
                mVar.L0.setShader(radialGradient2);
            }
            mVar.N0.reset();
            mVar.N0.postTranslate(fDp, fDp5);
            mVar.N0.preScale(Math.max(1.0f, fMax) / 16.0f, Math.max(1.0f, fMax) / 16.0f);
            mVar.K0.setLocalMatrix(mVar.N0);
            canvas2.save();
            canvas2.drawRoundRect(rectF, f11, f11, mVar.J0);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF, 255, 31);
            mVar.j(canvas2, rectF);
            mVar.N0.reset();
            mVar.N0.postTranslate(fDp, fDp5);
            mVar.N0.preScale(Math.max(1.0f, fMax) / 16.0f, Math.max(1.0f, fMax) / 16.0f);
            mVar.M0.setLocalMatrix(mVar.N0);
            canvas2.save();
            canvas2.drawRoundRect(rectF, f11, f11, mVar.L0);
            canvas2.restore();
            canvas2.restore();
            if (!(mVar instanceof ib)) {
                mVar.k(canvas2, rectF, fE);
            }
        }
        canvas2.restore();
        if (mVar.f16335d0 == null) {
            Path path4 = mVar.F0;
            path4.rewind();
            path4.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            jg.i iVar = mVar.f16333c;
            iVar.f13009k = f11;
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            iVar.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f16330a0 && (motionEvent.getAction() != 0 || !l(motionEvent.getX(), motionEvent.getY()))) {
            if (this.f16361x0.contains(motionEvent.getX(), motionEvent.getY()) || this.f16345l0) {
                int action = motionEvent.getAction();
                org.telegram.ui.Components.nc ncVar = this.f16332b0;
                if (action != 0 || this.f16345l0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ncVar.c(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((this instanceof s) && ((s) this).K1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                int i10 = 0;
                while (true) {
                    int childCount = getChildCount();
                    g gVar = this.f16338f;
                    if (i10 >= childCount) {
                        this.H.b(false);
                        gVar.getEditText().setForceCursorEnd(true);
                        gVar.getEditText().requestFocus();
                        ot otVar = gVar.f32875a;
                        otVar.requestFocus();
                        AndroidUtilities.showKeyboard(otVar);
                        gVar.getEditText().setScrollY(0);
                        ncVar.c(true);
                        return true;
                    }
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && gVar != childAt) {
                        float x8 = childAt.getX();
                        float y10 = childAt.getY();
                        float x10 = childAt.getX() + childAt.getWidth();
                        float y11 = childAt.getY() + childAt.getHeight();
                        RectF rectF = this.f16357v0;
                        rectF.set(x8, y10, x10, y11);
                        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    i10++;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float fMax;
        RectF rectF = this.f16359w0;
        g gVar = this.f16338f;
        if (view != gVar) {
            if (!f(view)) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            canvas.clipRect(rectF);
            boolean zDrawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return zDrawChild;
        }
        if (this instanceof as0) {
            fMax = 0.0f;
        } else {
            fMax = (1.0f - this.f16344k0) * Math.max(0, (gVar.getHeight() - AndroidUtilities.dp(82.0f)) - gVar.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, fMax);
        boolean zDrawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.B;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.A;
        linearGradient.setLocalMatrix(matrix);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float fDp = AndroidUtilities.dp(10.0f) + f11;
        Paint paint = this.f16362y;
        canvas.drawRect(f10, f11, f12, fDp, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - AndroidUtilities.dp(10.0f), rectF.right, rectF.bottom, paint);
        canvas.restore();
        canvas.restore();
        return zDrawChild2;
    }

    public abstract boolean e();

    public boolean f(View view) {
        return true;
    }

    public abstract boolean g();

    public RectF getBounds() {
        return this.f16359w0;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return UserConfig.getInstance(this.Q).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.f16358w;
    }

    public int getEditTextHeight() {
        return (int) this.f16352r0.f34812c;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.f16338f.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.I0.f34812c;
    }

    public int getSelectionLength() {
        g gVar = this.f16338f;
        if (gVar != null && gVar.getEditText() != null) {
            try {
                return gVar.getEditText().getSelectionEnd() - gVar.getEditText().getSelectionStart();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.f16338f.getText();
    }

    public abstract void h(org.telegram.ui.Components.da daVar, Canvas canvas, RectF rectF, float f10, boolean z10, float f11, float f12, boolean z11);

    public void i(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    public abstract boolean l(float f10, float f11);

    public final void m() {
        invalidate();
        g gVar = this.f16338f;
        gVar.getEditText().invalidate();
        gVar.getEmojiButton().invalidate();
        i iVar = this.I;
        if (iVar != null) {
            iVar.invalidate();
        }
        if (gVar.getEmojiView() == null || !g()) {
            return;
        }
        gVar.getEmojiView().invalidate();
    }

    public final boolean o() {
        return getCodePointCount() > getCaptionLimit();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            Bitmap bitmap = this.C;
            if (bitmap != null) {
                bitmap.recycle();
                this.C = null;
            }
            TextPaint textPaint = this.D;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.C = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(string)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.C).drawText(string, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f16347n0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f16348o0 = null;
        this.f16350q0 = null;
        Bitmap bitmap2 = this.C;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.C = null;
        }
    }

    public final boolean p() {
        g gVar = this.f16338f;
        boolean z10 = gVar.f32884x;
        a4 a4Var = this.H;
        if (z10 && gVar.getEmojiView() != null) {
            if (a4Var.c()) {
                gVar.getEmojiView().C();
                return true;
            }
            pt ptVar = gVar.d;
            if (ptVar != null) {
                ptVar.C();
                gVar.d.u(false);
            }
            return true;
        }
        if (gVar.f32878e) {
            gVar.k(true);
            return true;
        }
        if ((!gVar.v && !a4Var.c()) || a4Var.d) {
            return false;
        }
        gVar.d();
        gVar.k(true);
        return true;
    }

    public void setAccount(int i10) {
        this.Q = i10;
    }

    public void setBlurredBackgroundDrawableForMentions(jg.a aVar) {
        this.f16335d0 = aVar;
    }

    public void setDialogId(long j10) {
        this.f16360x = j10;
        i iVar = this.I;
        if (iVar != null) {
            iVar.setDialogId(j10);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.f16339f0 = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.f16340g0 = callback;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f16332b0.c(z10 && !this.f16345l0);
    }

    public void setText(CharSequence charSequence) {
        this.R = true;
        this.f16338f.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.W = callbackVoidReturn;
    }

    public abstract void u(float f10);

    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.f16363y0 = false;
            invalidate();
            return;
        }
        this.f16363y0 = true;
        CharSequence charSequence2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence2 = "";
        }
        this.f16364z0 = new pz0(charSequence2, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.A0 = new pz0(charSequence, 14.0f, null);
    }

    public void w() {
        this.I.getAdapter().f45923c = false;
        this.I.getAdapter().d = false;
        this.I.getAdapter().f45926e = false;
        this.I.getAdapter().f45932i0 = this instanceof s;
    }

    public void x(int i10) {
        zu0 zu0Var = this.G;
        if (zu0Var != null) {
            zu0Var.S();
        }
        g gVar = this.f16338f;
        if (gVar.f32878e) {
            i10 = Math.max(0, gVar.getEmojiPadding() + a());
        } else if (gVar.J) {
            i10 = Math.max(0, gVar.getKeyboardHeight() + a());
        }
        int iMax = Math.max(0, i10 - (zu0Var == null ? 0 : zu0Var.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof as0)) {
            ObjectAnimator objectAnimator = this.f16341h0;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.f16341h0.cancel();
                this.f16341h0 = null;
            }
            this.f16341h0 = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -iMax);
            if (iMax > AndroidUtilities.dp(20.0f)) {
                this.f16341h0.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                this.f16341h0.setDuration(250L);
            } else {
                this.f16341h0.setInterpolator(er.h);
                this.f16341h0.setDuration(640L);
            }
            this.f16341h0.start();
        }
        this.f16342i0 = iMax > AndroidUtilities.dp(20.0f);
        e eVar = this.f16343j0;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar);
        if (iMax < AndroidUtilities.dp(20.0f)) {
            gVar.getEditText().clearFocus();
            gVar.k(true);
        }
    }

    public void y() {
        if (this.I != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.f16352r0.f34812c;
            if (this.I.getY() != translationY) {
                this.I.setTranslationY(translationY);
                this.I.invalidate();
            }
        }
    }

    public void n() {
    }

    public void t() {
    }

    public void q(boolean z10) {
    }

    public void r(int i10) {
    }

    public void j(Canvas canvas, RectF rectF) {
    }

    public void s(int i10, int i11) {
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
    }
}
