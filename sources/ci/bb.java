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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.ym;
import org.telegram.ui.co;
import org.telegram.ui.iu0;
import org.telegram.ui.o20;
import org.telegram.ui.sy;
public final class bb extends View {
    public final int f4801a;
    public Object f4802b;

    public bb(Context context) {
        super(context);
        this.f4801a = 17;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4801a) {
            case 0:
                canvas.save();
                lc lcVar = (lc) this.f4802b;
                canvas.translate(lcVar.f5466c1.getX() + lcVar.f5494l0.getX(), lcVar.f5466c1.getY() + lcVar.f5494l0.getY());
                bc bcVar = lcVar.f5466c1;
                bcVar.k(canvas, bcVar.getBounds(), lcVar.f5466c1.getOver2Alpha());
                canvas.restore();
                return;
            case 5:
                ah.d dVar = ((hh.f) this.f4802b).I;
                if (dVar != null) {
                    dVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.h3) this.f4802b).d);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f4801a) {
            case 17:
                super.draw(canvas);
                ((n11) this.f4802b).e(canvas, (getMeasuredWidth() - ((n11) this.f4802b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 21:
                super.draw(canvas);
                or0 or0Var = (or0) this.f4802b;
                or0Var.W0.setBounds(0, (getMeasuredHeight() - or0Var.G0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                or0Var.W0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f4801a) {
            case 24:
                super.invalidate();
                ((uw0) this.f4802b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f4801a) {
            case 4:
                super.onAttachedToWindow();
                ((gg.p1) this.f4802b).f10767f = true;
                return;
            case 7:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f4802b).f24084l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4801a) {
            case 4:
                super.onDetachedFromWindow();
                ((gg.p1) this.f4802b).f10767f = false;
                return;
            case 7:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f4802b).f24084l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        xr xrVar;
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
        float f13;
        Paint paint;
        int B;
        switch (this.f4801a) {
            case 3:
                super.onDraw(canvas);
                fi.k0 k0Var = (fi.k0) this.f4802b;
                yf.y yVar = k0Var.K;
                float max = Math.max(k0Var.f9989b.f16365e, k0Var.f9990c.f16365e);
                yf.y yVar2 = k0Var.J;
                yVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.f11576b, 0);
                yVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.f11576b);
                int i14 = org.telegram.ui.ActionBar.h6.f20730a7;
                yVar2.b(org.telegram.ui.ActionBar.h6.m1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i14)));
                yVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                yVar.c(0, lerp);
                yVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                yVar.b(org.telegram.ui.ActionBar.h6.m1(lerp3, k0Var.getThemedColor(i14)));
                yVar.draw(canvas);
                return;
            case 6:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((ii.u0) this.f4802b).f12723c.draw(canvas);
                canvas.restore();
                return;
            case 7:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f4802b;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            case 11:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.f4802b;
                s2Var.f22824n4.setBounds(0, 0, getWidth(), getHeight());
                s2Var.f22824n4.draw(canvas);
                return;
            case 16:
                if (((xr) this.f4802b).Z) {
                    canvas.drawRect(xr.S(xrVar), 0.0f, getMeasuredWidth() - xr.T(xrVar), 1.0f, org.telegram.ui.ActionBar.h6.f20908k0);
                    return;
                }
                return;
            case 20:
                super.onDraw(canvas);
                ((iu0) this.f4802b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                ar0 ar0Var = (ar0) this.f4802b;
                RectF rectF = ar0Var.f29131n;
                Paint paint2 = ar0Var.h;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 24:
                uw0 uw0Var = (uw0) this.f4802b;
                if (uw0Var.f31579b != null && !uw0Var.J) {
                    Drawable newDrawable = uw0Var.getNewDrawable();
                    boolean newDrawableMotion = uw0Var.getNewDrawableMotion();
                    Drawable drawable3 = uw0Var.f31579b;
                    float f14 = 0.0f;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.h6.vl != null) {
                            uw0Var.d = drawable3;
                            uw0Var.f31584e = uw0Var.f31581c;
                        }
                        if (newDrawable instanceof dd0) {
                            ((dd0) newDrawable).r(uw0Var.L);
                        }
                        uw0Var.f31579b = newDrawable;
                        if (uw0Var.M && (newDrawable instanceof co)) {
                            ((co) newDrawable).f(this);
                        }
                        if (uw0Var.M) {
                            Drawable drawable4 = uw0Var.f31579b;
                            if (drawable4 instanceof dd0) {
                                ((dd0) drawable4).k();
                            }
                        }
                        uw0Var.f31581c = newDrawableMotion;
                        uw0Var.f31593l0 = 0.0f;
                        uw0Var.U(uw0Var.f31579b);
                        uw0Var.I();
                    } else if (uw0Var.f31581c != newDrawableMotion) {
                        uw0Var.f31581c = newDrawableMotion;
                        uw0Var.I();
                    }
                    float f15 = 1.0f;
                    uw0Var.f31593l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + uw0Var.f31593l0, 1.0f, 0.0f);
                    int i15 = 0;
                    while (i15 < 2) {
                        if (i15 == 0) {
                            drawable = uw0Var.d;
                        } else {
                            drawable = uw0Var.f31579b;
                        }
                        if (drawable == null) {
                            f12 = f15;
                        } else {
                            boolean z11 = true;
                            if (i15 == 1 && uw0Var.d != null && uw0Var.G != null) {
                                drawable.setAlpha((int) (uw0Var.f31593l0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i15 == 0) {
                                z10 = uw0Var.f31584e;
                            } else {
                                z10 = uw0Var.f31581c;
                            }
                            if (z10) {
                                f7 = uw0Var.f31606y;
                                f10 = uw0Var.f31604w;
                                f11 = uw0Var.f31605x;
                            } else {
                                f7 = f15;
                                f10 = f14;
                                f11 = f10;
                            }
                            if (drawable instanceof dd0) {
                                dd0 dd0Var = (dd0) drawable;
                                if (dd0Var.f25566u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (uw0Var.P()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (uw0Var.Q() && uw0Var.f31601s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i16 = i12 + i13;
                                    if (uw0Var.Y()) {
                                        height2 = getRootView().getMeasuredHeight() - i16;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f12 = f15;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((height2 - ceil2) / 2) + uw0Var.E + i16 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i16, ceil, getMeasuredHeight() - uw0Var.h);
                                    drawable.setBounds(measuredWidth, i17, ceil + measuredWidth, ceil2 + i17);
                                    drawable.draw(canvas);
                                    uw0.G(uw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (uw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - uw0Var.h);
                                    }
                                    dd0Var.f25552f = uw0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - uw0Var.E) + f11));
                                    drawable.draw(canvas);
                                    if (uw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable instanceof ColorDrawable) {
                                    if (uw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - uw0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    uw0.G(uw0Var, canvas);
                                    if (uw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (uw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - uw0Var.h);
                                    }
                                    drawable.setBounds(0, uw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + uw0Var.E);
                                    drawable.draw(canvas);
                                    uw0.G(uw0Var, canvas);
                                    if (uw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f16 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f16, f16);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                        drawable.draw(canvas);
                                        uw0.G(uw0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (uw0Var.P()) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (uw0Var.Q() && uw0Var.f31601s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i18 = i10 + i11;
                                        if (uw0Var.Y()) {
                                            height = getRootView().getMeasuredHeight() - i18;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f7);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f7);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i19 = ((height - ceil4) / 2) + uw0Var.E + i18 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i18, ceil3, getMeasuredHeight() - uw0Var.h);
                                        drawable.setBounds(measuredWidth2, i19, ceil3 + measuredWidth2, ceil4 + i19);
                                        drawable.draw(canvas);
                                        uw0.G(uw0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (uw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - uw0Var.h);
                                    }
                                    if (drawable instanceof co) {
                                        co coVar = (co) drawable;
                                        coVar.f36790b = this;
                                        dd0 dd0Var2 = coVar.f36793f;
                                        if (dd0Var2 != null) {
                                            dd0Var2.r(this);
                                        }
                                    }
                                    float f17 = f7 - f12;
                                    float B2 = a1.g.B(-getMeasuredWidth(), f17, 2.0f, f10);
                                    float B3 = a1.g.B(-getRootView().getMeasuredHeight(), f17, 2.0f, f11);
                                    drawable.setBounds((int) B2, (int) (uw0Var.E + B3), (int) ((getMeasuredWidth() * f7) + B2), (int) sc.v.d(getRootView().getMeasuredHeight(), f7, uw0Var.E, B3));
                                    drawable.draw(canvas);
                                    uw0.G(uw0Var, canvas);
                                    if (uw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i15 == 0 && (drawable2 = uw0Var.d) != null && uw0Var.f31593l0 >= f12) {
                                if (uw0Var.M && (drawable2 instanceof co)) {
                                    ((co) drawable2).g(uw0Var.L);
                                }
                                if (uw0Var.M) {
                                    Drawable drawable5 = uw0Var.d;
                                    if (drawable5 instanceof dd0) {
                                        ((dd0) drawable5).l();
                                    }
                                }
                                uw0Var.d = null;
                                uw0Var.f31584e = false;
                                uw0Var.I();
                                uw0Var.L.invalidate();
                            }
                        }
                        i15++;
                        f15 = f12;
                        f14 = 0.0f;
                    }
                    if (uw0Var.f31593l0 != f15) {
                        uw0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Vi, false);
                iz0 iz0Var = (iz0) this.f4802b;
                org.telegram.ui.Components.voip.h hVar = iz0Var.L;
                Paint paint3 = iz0Var.f27489a;
                paint3.setColor(x02);
                Paint paint4 = iz0Var.f27490b;
                paint4.setColor(x02);
                Paint paint5 = iz0Var.f27491c;
                paint5.setColor(x02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = iz0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = iz0Var.f27492e;
                if (z12 || iz0Var.J != 0.0f) {
                    if (z12) {
                        if (iz0Var.K) {
                            float f18 = iz0Var.J + 0.024615385f;
                            iz0Var.J = f18;
                            if (f18 > 1.0f) {
                                iz0Var.J = 1.0f;
                                iz0Var.K = false;
                            }
                        } else {
                            float f19 = iz0Var.J - 0.024615385f;
                            iz0Var.J = f19;
                            if (f19 < 0.0f) {
                                iz0Var.J = 0.0f;
                                iz0Var.K = true;
                            }
                        }
                    } else {
                        float f20 = iz0Var.J - 0.10666667f;
                        iz0Var.J = f20;
                        if (f20 < 0.0f) {
                            iz0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f32001f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (!iz0Var.f27492e) {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (ai.B(24.0f, 2, getMeasuredWidth()) * iz0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    f13 = 1.0f;
                    paint = paint6;
                }
                if (!iz0Var.f27492e) {
                    int B4 = (int) (ai.B(24.0f, 2, getMeasuredWidth()) * iz0Var.E);
                    if (B4 < AndroidUtilities.dp(f13)) {
                        B4 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + B4;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B4, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    return;
                }
                return;
            case 27:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.k1) this.f4802b).f32063n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        switch (this.f4801a) {
            case 1:
                di.i iVar = (di.i) this.f4802b;
                if (iVar.H) {
                    i12 = (di.i.z0(iVar).getMeasuredHeight() + iVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + iVar.I;
                    if (AndroidUtilities.dp(24.0f) + iVar.f40400y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + iVar.f40400y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 2:
                ei.l lVar = (ei.l) this.f4802b;
                if (lVar.H) {
                    i13 = (ei.l.C0(lVar).getMeasuredHeight() + lVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + lVar.I;
                    if (AndroidUtilities.dp(24.0f) + lVar.f40400y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + lVar.f40400y.getMeasuredHeight();
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
            case 24:
            case 27:
            case 28:
            default:
                super.onMeasure(i10, i11);
                return;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                gg.p1 p1Var = (gg.p1) this.f4802b;
                Integer num = p1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    p1Var.h = i14;
                } else {
                    i14 = 0;
                    p1Var.h = 0;
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
                s4.d0 d0Var = ((org.telegram.ui.n5) this.f4802b).d.F;
                if (d0Var instanceof g00) {
                    i15 = ((g00) d0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 12:
                org.telegram.ui.Components.db dbVar = (org.telegram.ui.Components.db) this.f4802b;
                int i18 = dbVar.h;
                if (i18 == 0) {
                    i16 = AndroidUtilities.dp(300.0f);
                } else {
                    i16 = (int) (i18 * dbVar.v);
                }
                int i19 = i16 - (((dbVar.G - dbVar.H) - dbVar.I) - dbVar.J);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((ym) this.f4802b).v.J, 1073741824));
                return;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((jo) this.f4802b).d.R0);
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((mo) ((org.telegram.ui.u7) this.f4802b).d).f28809w, 1073741824));
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((n11) this.f4802b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((n11) this.f4802b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((y70) this.f4802b).f33104c.f25911o0, 1073741824));
                return;
            case 19:
                int dp3 = AndroidUtilities.dp(48.0f);
                e80 e80Var = ((a80) this.f4802b).f24464n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3 + e80Var.f25911o0 + e80Var.f25917u0, 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((kr0) this.f4802b).K.J.R, 1073741824));
                return;
            case 25:
                rx0 rx0Var = (rx0) this.f4802b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                ay0 ay0Var = rx0Var.d;
                int i20 = ay0Var.f24620e3;
                if (i20 > 0) {
                    i17 = AndroidUtilities.dp(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((rx0Var.h() - 1) * size2), rx0Var.d.V2 * size2)));
                ay0Var.f24619d3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 26:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
            case 29:
                o20 o20Var = (o20) this.f4802b;
                if (o20Var.H) {
                    o20Var.J = (o20.U(o20Var).getMeasuredHeight() + o20Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp4 = AndroidUtilities.dp(140.0f) + o20Var.I;
                    if (AndroidUtilities.dp(24.0f) + o20Var.f40400y.getMeasuredHeight() > dp4) {
                        dp4 = Math.max(dp4, (AndroidUtilities.dp(24.0f) + o20Var.f40400y.getMeasuredHeight()) - o20Var.L);
                    }
                    o20Var.J = dp4;
                }
                int i21 = (int) (o20Var.J - (0 * 2.5f));
                o20Var.J = i21;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f4801a) {
            case 27:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.k1) this.f4802b).f32063n.f32001f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f4801a) {
            case 10:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.a8) this.f4802b).f35916b.f36626x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 28:
                super.setAlpha(f7);
                View view2 = ((sy) this.f4802b).fragmentView;
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
        switch (this.f4801a) {
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
        switch (this.f4801a) {
            case 12:
                super.setTranslationY(f7);
                org.telegram.ui.Components.db.t((org.telegram.ui.Components.db) this.f4802b).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public bb(Object obj, Context context, int i10) {
        super(context);
        this.f4801a = i10;
        this.f4802b = obj;
    }

    public bb(org.telegram.ui.Components.db dbVar, Context context) {
        super(context);
        this.f4801a = 12;
        this.f4802b = dbVar;
        setTag(-33024);
    }

    public bb(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f4801a = 7;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, d6Var);
        this.f4802b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f21188z5, org.telegram.ui.ActionBar.h6.f20915k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
