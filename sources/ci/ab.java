package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.bo;
import org.telegram.ui.du0;
import org.telegram.ui.uy;
public final class ab extends View {
    public final int f4715a;
    public Object f4716b;

    public ab(Context context) {
        super(context);
        this.f4715a = 17;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4715a) {
            case 0:
                canvas.save();
                kc kcVar = (kc) this.f4716b;
                canvas.translate(kcVar.f5383c1.getX() + kcVar.f5411l0.getX(), kcVar.f5383c1.getY() + kcVar.f5411l0.getY());
                ac acVar = kcVar.f5383c1;
                acVar.k(canvas, acVar.getBounds(), kcVar.f5383c1.getOver2Alpha());
                canvas.restore();
                return;
            case 5:
                ah.e eVar = ((hh.g) this.f4716b).I;
                if (eVar != null) {
                    eVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.i3) this.f4716b).d);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f4715a) {
            case 17:
                super.draw(canvas);
                ((f11) this.f4716b).e(canvas, (getMeasuredWidth() - ((f11) this.f4716b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 21:
                super.draw(canvas);
                br0 br0Var = (br0) this.f4716b;
                br0Var.U0.setBounds(0, (getMeasuredHeight() - br0Var.G0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                br0Var.U0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f4715a) {
            case 25:
                super.invalidate();
                ((mw0) this.f4716b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f4715a) {
            case 4:
                super.onAttachedToWindow();
                ((gg.q1) this.f4716b).f10763f = true;
                return;
            case 7:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f4716b).f24096l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4715a) {
            case 4:
                super.onDetachedFromWindow();
                ((gg.q1) this.f4716b).f10763f = false;
                return;
            case 7:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f4716b).f24096l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        int i11;
        int height;
        Drawable drawable2;
        int i12;
        int i13;
        int height2;
        Paint paint;
        float f13;
        switch (this.f4715a) {
            case 3:
                super.onDraw(canvas);
                fi.k0 k0Var = (fi.k0) this.f4716b;
                yf.y yVar = k0Var.K;
                float max = Math.max(k0Var.f9915b.f15436e, k0Var.f9916c.f15436e);
                yf.y yVar2 = k0Var.J;
                yVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.f11527b, 0);
                yVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.f11527b);
                int i14 = org.telegram.ui.ActionBar.i6.f20771a7;
                yVar2.b(org.telegram.ui.ActionBar.i6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i14)));
                yVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                yVar.c(0, lerp);
                yVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                yVar.b(org.telegram.ui.ActionBar.i6.l1(lerp3, k0Var.getThemedColor(i14)));
                yVar.draw(canvas);
                return;
            case 6:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((ii.u0) this.f4716b).f12677c.draw(canvas);
                canvas.restore();
                return;
            case 7:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f4716b;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            case 11:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.f4716b;
                s2Var.f22825j4.setBounds(0, 0, getWidth(), getHeight());
                s2Var.f22825j4.draw(canvas);
                return;
            case 16:
                jr jrVar = (jr) this.f4716b;
                if (jrVar.Z) {
                    canvas.drawRect(jr.P(jrVar), 0.0f, getMeasuredWidth() - jr.Q(jrVar), 1.0f, org.telegram.ui.ActionBar.i6.f20950k0);
                    return;
                }
                return;
            case 20:
                super.onDraw(canvas);
                ((du0) this.f4716b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                nq0 nq0Var = (nq0) this.f4716b;
                RectF rectF = nq0Var.h;
                Paint paint2 = nq0Var.f24720f;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 25:
                mw0 mw0Var = (mw0) this.f4716b;
                if (mw0Var.f28830b != null && !mw0Var.J) {
                    Drawable newDrawable = mw0Var.getNewDrawable();
                    boolean newDrawableMotion = mw0Var.getNewDrawableMotion();
                    Drawable drawable3 = mw0Var.f28830b;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.i6.sl != null) {
                            mw0Var.d = drawable3;
                            mw0Var.f28835e = mw0Var.f28832c;
                        }
                        if (newDrawable instanceof pc0) {
                            ((pc0) newDrawable).r(mw0Var.L);
                        }
                        mw0Var.f28830b = newDrawable;
                        if (mw0Var.M && (newDrawable instanceof bo)) {
                            ((bo) newDrawable).f(this);
                        }
                        if (mw0Var.M) {
                            Drawable drawable4 = mw0Var.f28830b;
                            if (drawable4 instanceof pc0) {
                                ((pc0) drawable4).k();
                            }
                        }
                        mw0Var.f28832c = newDrawableMotion;
                        mw0Var.f28844l0 = 0.0f;
                        mw0Var.U(mw0Var.f28830b);
                        mw0Var.I();
                    } else if (mw0Var.f28832c != newDrawableMotion) {
                        mw0Var.f28832c = newDrawableMotion;
                        mw0Var.I();
                    }
                    mw0Var.f28844l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + mw0Var.f28844l0, 1.0f, 0.0f);
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (i15 == 0) {
                            drawable = mw0Var.d;
                        } else {
                            drawable = mw0Var.f28830b;
                        }
                        if (drawable != null) {
                            boolean z11 = true;
                            if (i15 == 1 && mw0Var.d != null && mw0Var.G != null) {
                                drawable.setAlpha((int) (mw0Var.f28844l0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i15 == 0) {
                                z10 = mw0Var.f28835e;
                            } else {
                                z10 = mw0Var.f28832c;
                            }
                            if (z10) {
                                f7 = mw0Var.f28857y;
                                f10 = mw0Var.f28855w;
                                f11 = mw0Var.f28856x;
                            } else {
                                f7 = 1.0f;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                            if (drawable instanceof pc0) {
                                pc0 pc0Var = (pc0) drawable;
                                if (pc0Var.f29721u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (mw0Var.P()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (mw0Var.Q() && mw0Var.f28852s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i16 = i12 + i13;
                                    if (mw0Var.Y()) {
                                        height2 = getRootView().getMeasuredHeight() - i16;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f12 = 1.0f;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((height2 - ceil2) / 2) + mw0Var.E + i16 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i16, ceil, getMeasuredHeight() - mw0Var.h);
                                    drawable.setBounds(measuredWidth, i17, ceil + measuredWidth, ceil2 + i17);
                                    drawable.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = 1.0f;
                                    if (mw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - mw0Var.h);
                                    }
                                    pc0Var.f29707f = mw0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - mw0Var.E) + f11));
                                    drawable.draw(canvas);
                                    if (mw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = 1.0f;
                                if (drawable instanceof ColorDrawable) {
                                    if (mw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - mw0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    if (mw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (mw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - mw0Var.h);
                                    }
                                    drawable.setBounds(0, mw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + mw0Var.E);
                                    drawable.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    if (mw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f14 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f14, f14);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f14), (int) Math.ceil(getRootView().getMeasuredHeight() / f14));
                                        drawable.draw(canvas);
                                        mw0.H(mw0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (mw0Var.P()) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (mw0Var.Q() && mw0Var.f28852s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i18 = i10 + i11;
                                        if (mw0Var.Y()) {
                                            height = getRootView().getMeasuredHeight() - i18;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f7);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f7);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i19 = ((height - ceil4) / 2) + mw0Var.E + i18 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i18, ceil3, getMeasuredHeight() - mw0Var.h);
                                        drawable.setBounds(measuredWidth2, i19, ceil3 + measuredWidth2, ceil4 + i19);
                                        drawable.draw(canvas);
                                        mw0.H(mw0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (mw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - mw0Var.h);
                                    }
                                    if (drawable instanceof bo) {
                                        bo boVar = (bo) drawable;
                                        boVar.f35179b = this;
                                        pc0 pc0Var2 = boVar.f35182f;
                                        if (pc0Var2 != null) {
                                            pc0Var2.r(this);
                                        }
                                    }
                                    float f15 = f7 - 1.0f;
                                    float B = a4.a.B(-getMeasuredWidth(), f15, 2.0f, f10);
                                    float B2 = a4.a.B(-getRootView().getMeasuredHeight(), f15, 2.0f, f11);
                                    drawable.setBounds((int) B, (int) (mw0Var.E + B2), (int) ((getMeasuredWidth() * f7) + B), (int) sa.e.d(getRootView().getMeasuredHeight(), f7, mw0Var.E, B2));
                                    drawable.draw(canvas);
                                    mw0.H(mw0Var, canvas);
                                    if (mw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i15 == 0 && (drawable2 = mw0Var.d) != null && mw0Var.f28844l0 >= f12) {
                                if (mw0Var.M && (drawable2 instanceof bo)) {
                                    ((bo) drawable2).g(mw0Var.L);
                                }
                                if (mw0Var.M) {
                                    Drawable drawable5 = mw0Var.d;
                                    if (drawable5 instanceof pc0) {
                                        ((pc0) drawable5).l();
                                    }
                                }
                                mw0Var.d = null;
                                mw0Var.f28835e = false;
                                mw0Var.I();
                                mw0Var.L.invalidate();
                            }
                        }
                    }
                    if (mw0Var.f28844l0 != 1.0f) {
                        mw0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Vi, false);
                bz0 bz0Var = (bz0) this.f4716b;
                org.telegram.ui.Components.voip.h hVar = bz0Var.L;
                Paint paint3 = bz0Var.f25142a;
                paint3.setColor(w02);
                Paint paint4 = bz0Var.f25143b;
                paint4.setColor(w02);
                Paint paint5 = bz0Var.f25144c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = bz0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = bz0Var.f25145e;
                if (z12 || bz0Var.J != 0.0f) {
                    if (z12) {
                        if (bz0Var.K) {
                            float f16 = bz0Var.J + 0.024615385f;
                            bz0Var.J = f16;
                            if (f16 > 1.0f) {
                                bz0Var.J = 1.0f;
                                bz0Var.K = false;
                            }
                        } else {
                            float f17 = bz0Var.J - 0.024615385f;
                            bz0Var.J = f17;
                            if (f17 < 0.0f) {
                                bz0Var.J = 0.0f;
                                bz0Var.K = true;
                            }
                        }
                    } else {
                        float f18 = bz0Var.J - 0.10666667f;
                        bz0Var.J = f18;
                        if (f18 < 0.0f) {
                            bz0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f31948f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (!bz0Var.f25145e) {
                    int A = (int) (bi.A(24.0f, 2, getMeasuredWidth()) * bz0Var.F);
                    int dp3 = AndroidUtilities.dp(24.0f) + A;
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    paint = paint6;
                    f13 = 1.0f;
                }
                if (!bz0Var.f25145e) {
                    int A2 = (int) (bi.A(24.0f, 2, getMeasuredWidth()) * bz0Var.E);
                    if (A2 < AndroidUtilities.dp(f13)) {
                        A2 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + A2;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A2, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    return;
                }
                return;
            case 28:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.k1) this.f4716b).f32011n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
                    invalidate();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f4715a) {
            case 1:
                di.k kVar = (di.k) this.f4716b;
                if (kVar.H) {
                    i12 = (di.k.E0(kVar).getMeasuredHeight() + kVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + kVar.I;
                    if (AndroidUtilities.dp(24.0f) + kVar.f39958y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + kVar.f39958y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 2:
                ei.m mVar = (ei.m) this.f4716b;
                if (mVar.H) {
                    i13 = (ei.m.G0(mVar).getMeasuredHeight() + mVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + mVar.I;
                    if (AndroidUtilities.dp(24.0f) + mVar.f39958y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + mVar.f39958y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 3:
            case 5:
            case 6:
            case 10:
            case 11:
            case 16:
            case 20:
            case 21:
            case 23:
            case 25:
            default:
                super.onMeasure(i10, i11);
                return;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                gg.q1 q1Var = (gg.q1) this.f4716b;
                Integer num = q1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    q1Var.h = i14;
                } else {
                    i14 = 0;
                    q1Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(24.0f));
                return;
            case 8:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                return;
            case 9:
                s4.c0 c0Var = ((org.telegram.ui.p5) this.f4716b).d.F;
                if (c0Var instanceof sz) {
                    i15 = ((sz) c0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 12:
                org.telegram.ui.Components.cb cbVar = (org.telegram.ui.Components.cb) this.f4716b;
                int i18 = cbVar.h;
                if (i18 == 0) {
                    i16 = AndroidUtilities.dp(300.0f);
                } else {
                    i16 = (int) (i18 * cbVar.v);
                }
                int i19 = i16 - (((cbVar.G - cbVar.H) - cbVar.I) - cbVar.J);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((km) this.f4716b).v.J, 1073741824));
                return;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((vn) this.f4716b).d.R0);
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((yn) ((org.telegram.ui.z7) this.f4716b).d).f33304w, 1073741824));
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((f11) this.f4716b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((f11) this.f4716b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((j70) this.f4716b).f27698c.f29630o0, 1073741824));
                return;
            case 19:
                int dp3 = AndroidUtilities.dp(48.0f);
                p70 p70Var = ((l70) this.f4716b).f28390n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3 + p70Var.f29630o0 + p70Var.f29636u0, 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((xq0) this.f4716b).K.J.R, 1073741824));
                return;
            case 24:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((bw0) this.f4716b).getMeasuredHeight());
                return;
            case 26:
                jx0 jx0Var = (jx0) this.f4716b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                sx0 sx0Var = jx0Var.d;
                int i20 = sx0Var.f30966n3;
                if (i20 > 0) {
                    i17 = AndroidUtilities.dp(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((jx0Var.h() - 1) * size2), jx0Var.d.f30958e3 * size2)));
                sx0Var.f30965m3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 27:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f4715a) {
            case 28:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.k1) this.f4716b).f32011n.f31948f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f4715a) {
            case 10:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.f8) this.f4716b).f36224b.f37028x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 29:
                super.setAlpha(f7);
                View view2 = ((uy) this.f4716b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f4715a) {
            case 23:
                super.setTranslationX(f7);
                invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f4715a) {
            case 12:
                super.setTranslationY(f7);
                org.telegram.ui.Components.cb.r((org.telegram.ui.Components.cb) this.f4716b).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public ab(Object obj, Context context, int i10) {
        super(context);
        this.f4715a = i10;
        this.f4716b = obj;
    }

    public ab(org.telegram.ui.Components.cb cbVar, Context context) {
        super(context);
        this.f4715a = 12;
        this.f4716b = cbVar;
        setTag(-33024);
    }

    public ab(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f4715a = 7;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, d6Var);
        this.f4716b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.f21232z5, org.telegram.ui.ActionBar.i6.f20957k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
