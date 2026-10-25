package bi;

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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.cy;
import org.telegram.ui.vt0;
import org.telegram.ui.xn;
public final class cc extends View {
    public final int f4465a;
    public Object f4466b;

    public cc(Context context) {
        super(context);
        this.f4465a = 17;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4465a) {
            case 1:
                canvas.save();
                fi.sb sbVar = (fi.sb) this.f4466b;
                canvas.translate(sbVar.f11614c1.getX() + sbVar.f11641l0.getX(), sbVar.f11614c1.getY() + sbVar.f11641l0.getY());
                fi.ib ibVar = sbVar.f11614c1;
                ibVar.k(canvas, ibVar.getBounds(), sbVar.f11614c1.getOver2Alpha());
                canvas.restore();
                return;
            case 6:
                ch.c cVar = ((jh.f) this.f4466b).I;
                if (cVar != null) {
                    cVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f4465a) {
            case 17:
                super.draw(canvas);
                ((q11) this.f4466b).e(canvas, (getMeasuredWidth() - ((q11) this.f4466b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 21:
                super.draw(canvas);
                mr0 mr0Var = (mr0) this.f4466b;
                mr0Var.W0.setBounds(0, (getMeasuredHeight() - mr0Var.H0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                mr0Var.W0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f4465a) {
            case 25:
                super.invalidate();
                ((vw0) this.f4466b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f4465a) {
            case 4:
                super.onAttachedToWindow();
                ((ig.p1) this.f4466b).f14204f = true;
                return;
            case 8:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f4466b).f26082l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4465a) {
            case 4:
                super.onDetachedFromWindow();
                ((ig.p1) this.f4466b).f14204f = false;
                return;
            case 8:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f4466b).f26082l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        tr trVar;
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
        int C;
        switch (this.f4465a) {
            case 5:
                super.onDraw(canvas);
                ii.j0 j0Var = (ii.j0) this.f4466b;
                ag.h0 h0Var = j0Var.K;
                float max = Math.max(j0Var.f14358b.e, j0Var.f14359c.e);
                ag.h0 h0Var2 = j0Var.J;
                h0Var2.c(AndroidUtilities.dp(42.0f) + j0Var.U.f13451b, 0);
                h0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + j0Var.U.f13451b);
                int i14 = org.telegram.ui.ActionBar.y6.f23297a7;
                h0Var2.b(org.telegram.ui.ActionBar.y6.o1(AndroidUtilities.lerp(1.0f, 0.8f, max), j0Var.getThemedColor(i14)));
                h0Var2.draw(canvas);
                if (j0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + j0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + j0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(j0Var.U.d), max);
                h0Var.c(0, lerp);
                h0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                h0Var.b(org.telegram.ui.ActionBar.y6.o1(lerp3, j0Var.getThemedColor(i14)));
                h0Var.draw(canvas);
                return;
            case 7:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((li.s0) this.f4466b).f17462c.draw(canvas);
                canvas.restore();
                return;
            case 8:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f4466b;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            case 11:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.f4466b;
                p2Var.f24694n4.setBounds(0, 0, getWidth(), getHeight());
                p2Var.f24694n4.draw(canvas);
                return;
            case 16:
                if (((tr) this.f4466b).Z) {
                    canvas.drawRect(tr.R(trVar), 0.0f, getMeasuredWidth() - tr.S(trVar), 1.0f, org.telegram.ui.ActionBar.y6.f23476k0);
                    return;
                }
                return;
            case 20:
                super.onDraw(canvas);
                ((vt0) this.f4466b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                yq0 yq0Var = (yq0) this.f4466b;
                RectF rectF = yq0Var.f30279n;
                Paint paint2 = yq0Var.h;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 25:
                vw0 vw0Var = (vw0) this.f4466b;
                if (vw0Var.f34274b != null && !vw0Var.J) {
                    Drawable newDrawable = vw0Var.getNewDrawable();
                    boolean newDrawableMotion = vw0Var.getNewDrawableMotion();
                    float f14 = 0.0f;
                    if (newDrawable != vw0Var.f34274b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.y6.g1()) {
                            vw0Var.d = vw0Var.f34274b;
                            vw0Var.e = vw0Var.f34276c;
                        }
                        if (newDrawable instanceof uc0) {
                            ((uc0) newDrawable).q(vw0Var.L);
                        }
                        vw0Var.f34274b = newDrawable;
                        if (vw0Var.M && (newDrawable instanceof xn)) {
                            ((xn) newDrawable).f(this);
                        }
                        if (vw0Var.M) {
                            Drawable drawable3 = vw0Var.f34274b;
                            if (drawable3 instanceof uc0) {
                                ((uc0) drawable3).k();
                            }
                        }
                        vw0Var.f34276c = newDrawableMotion;
                        vw0Var.f34277c0 = 0.0f;
                        vw0Var.T(vw0Var.f34274b);
                        vw0Var.G();
                    } else if (vw0Var.f34276c != newDrawableMotion) {
                        vw0Var.f34276c = newDrawableMotion;
                        vw0Var.G();
                    }
                    float f15 = 1.0f;
                    vw0Var.f34277c0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + vw0Var.f34277c0, 1.0f, 0.0f);
                    int i15 = 0;
                    while (i15 < 2) {
                        if (i15 == 0) {
                            drawable = vw0Var.d;
                        } else {
                            drawable = vw0Var.f34274b;
                        }
                        if (drawable == null) {
                            f12 = f15;
                        } else {
                            boolean z11 = true;
                            if (i15 == 1 && vw0Var.d != null && vw0Var.G != null) {
                                drawable.setAlpha((int) (vw0Var.f34277c0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i15 == 0) {
                                z10 = vw0Var.e;
                            } else {
                                z10 = vw0Var.f34276c;
                            }
                            if (z10) {
                                f7 = vw0Var.f34291y;
                                f10 = vw0Var.f34289w;
                                f11 = vw0Var.f34290x;
                            } else {
                                f7 = f15;
                                f10 = f14;
                                f11 = f10;
                            }
                            if (drawable instanceof uc0) {
                                uc0 uc0Var = (uc0) drawable;
                                if (uc0Var.f33371u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (vw0Var.O()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (vw0Var.P() && vw0Var.f34288s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i16 = i12 + i13;
                                    if (vw0Var.W()) {
                                        height2 = getRootView().getMeasuredHeight() - i16;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f12 = f15;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((height2 - ceil2) / 2) + vw0Var.E + i16 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i16, ceil, getMeasuredHeight() - vw0Var.h);
                                    drawable.setBounds(measuredWidth, i17, ceil + measuredWidth, ceil2 + i17);
                                    drawable.draw(canvas);
                                    vw0.F(vw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (vw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - vw0Var.h);
                                    }
                                    uc0Var.f33357f = vw0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - vw0Var.E) + f11));
                                    drawable.draw(canvas);
                                    if (vw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable instanceof ColorDrawable) {
                                    if (vw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - vw0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    vw0.F(vw0Var, canvas);
                                    if (vw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (vw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - vw0Var.h);
                                    }
                                    drawable.setBounds(0, vw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + vw0Var.E);
                                    drawable.draw(canvas);
                                    vw0.F(vw0Var, canvas);
                                    if (vw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f16 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f16, f16);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                        drawable.draw(canvas);
                                        vw0.F(vw0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (vw0Var.O()) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (vw0Var.P() && vw0Var.f34288s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i18 = i10 + i11;
                                        if (vw0Var.W()) {
                                            height = getRootView().getMeasuredHeight() - i18;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f7);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f7);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i19 = ((height - ceil4) / 2) + vw0Var.E + i18 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i18, ceil3, getMeasuredHeight() - vw0Var.h);
                                        drawable.setBounds(measuredWidth2, i19, ceil3 + measuredWidth2, ceil4 + i19);
                                        drawable.draw(canvas);
                                        vw0.F(vw0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (vw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - vw0Var.h);
                                    }
                                    if (drawable instanceof xn) {
                                        xn xnVar = (xn) drawable;
                                        xnVar.f45808b = this;
                                        uc0 uc0Var2 = xnVar.f45810f;
                                        if (uc0Var2 != null) {
                                            uc0Var2.q(this);
                                        }
                                    }
                                    float f17 = f7 - f12;
                                    float C2 = a1.g.C(-getMeasuredWidth(), f17, 2.0f, f10);
                                    float C3 = a1.g.C(-getRootView().getMeasuredHeight(), f17, 2.0f, f11);
                                    drawable.setBounds((int) C2, (int) (vw0Var.E + C3), (int) ((getMeasuredWidth() * f7) + C2), (int) b10.e(getRootView().getMeasuredHeight(), f7, vw0Var.E, C3));
                                    drawable.draw(canvas);
                                    vw0.F(vw0Var, canvas);
                                    if (vw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i15 == 0 && (drawable2 = vw0Var.d) != null && vw0Var.f34277c0 >= f12) {
                                if (vw0Var.M && (drawable2 instanceof xn)) {
                                    ((xn) drawable2).g(vw0Var.L);
                                }
                                if (vw0Var.M) {
                                    Drawable drawable4 = vw0Var.d;
                                    if (drawable4 instanceof uc0) {
                                        ((uc0) drawable4).l();
                                    }
                                }
                                vw0Var.d = null;
                                vw0Var.e = false;
                                vw0Var.G();
                                vw0Var.L.invalidate();
                            }
                        }
                        i15++;
                        f15 = f12;
                        f14 = 0.0f;
                    }
                    if (vw0Var.f34277c0 != f15) {
                        vw0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
                lz0 lz0Var = (lz0) this.f4466b;
                org.telegram.ui.Components.voip.h hVar = lz0Var.L;
                Paint paint3 = lz0Var.f30334a;
                paint3.setColor(x02);
                Paint paint4 = lz0Var.f30335b;
                paint4.setColor(x02);
                Paint paint5 = lz0Var.f30336c;
                paint5.setColor(x02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = lz0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = lz0Var.e;
                if (z12 || lz0Var.J != 0.0f) {
                    if (z12) {
                        if (lz0Var.K) {
                            float f18 = lz0Var.J + 0.024615385f;
                            lz0Var.J = f18;
                            if (f18 > 1.0f) {
                                lz0Var.J = 1.0f;
                                lz0Var.K = false;
                            }
                        } else {
                            float f19 = lz0Var.J - 0.024615385f;
                            lz0Var.J = f19;
                            if (f19 < 0.0f) {
                                lz0Var.J = 0.0f;
                                lz0Var.K = true;
                            }
                        }
                    } else {
                        float f20 = lz0Var.J - 0.10666667f;
                        lz0Var.J = f20;
                        if (f20 < 0.0f) {
                            lz0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f33817f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (!lz0Var.e) {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (vh.C(24.0f, 2, getMeasuredWidth()) * lz0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + C, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    f13 = 1.0f;
                    paint = paint6;
                }
                if (!lz0Var.e) {
                    int C4 = (int) (vh.C(24.0f, 2, getMeasuredWidth()) * lz0Var.E);
                    if (C4 < AndroidUtilities.dp(f13)) {
                        C4 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + C4;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + C4, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    return;
                }
                return;
            case 28:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.i1) this.f4466b).f33847n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        int i18;
        switch (this.f4465a) {
            case 0:
                dd ddVar = (dd) this.f4466b;
                if (ddVar.H) {
                    i12 = (ddVar.l0().getMeasuredHeight() + ddVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + ddVar.I;
                    if (AndroidUtilities.dp(24.0f) + ddVar.f38720y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + ddVar.f38720y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 1:
            case 5:
            case 6:
            case 7:
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
            case 2:
                gi.h hVar = (gi.h) this.f4466b;
                if (hVar.H) {
                    i13 = (hVar.l0().getMeasuredHeight() + hVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + hVar.I;
                    if (AndroidUtilities.dp(24.0f) + hVar.f38720y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + hVar.f38720y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 3:
                hi.k kVar = (hi.k) this.f4466b;
                if (kVar.H) {
                    i14 = (hi.k.A0(kVar).getMeasuredHeight() + kVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + kVar.I;
                    if (AndroidUtilities.dp(24.0f) + kVar.f38720y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + kVar.f38720y.getMeasuredHeight();
                    }
                    i14 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), 1073741824));
                return;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                ig.p1 p1Var = (ig.p1) this.f4466b;
                Integer num = p1Var.d;
                if (num != null) {
                    i15 = num.intValue();
                    p1Var.h = i15;
                } else {
                    i15 = 0;
                    p1Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            case 8:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(24.0f));
                return;
            case 9:
                s4.c0 c0Var = ((org.telegram.ui.r5) this.f4466b).d.F;
                if (c0Var instanceof yz) {
                    i16 = ((yz) c0Var).J;
                } else {
                    i16 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i16), 1073741824));
                return;
            case 12:
                org.telegram.ui.Components.bb bbVar = (org.telegram.ui.Components.bb) this.f4466b;
                int i19 = bbVar.h;
                if (i19 == 0) {
                    i17 = AndroidUtilities.dp(300.0f);
                } else {
                    i17 = (int) (i19 * bbVar.v);
                }
                int i20 = i17 - (((bbVar.G - bbVar.H) - bbVar.I) - bbVar.J);
                if (i20 < 1) {
                    i20 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((tm) this.f4466b).v.J, 1073741824));
                return;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((eo) this.f4466b).d.R0);
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((ho) ((org.telegram.ui.c8) this.f4466b).d).f29031w, 1073741824));
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((q11) this.f4466b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((q11) this.f4466b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((s70) this.f4466b).f32446c.f34954o0, 1073741824));
                return;
            case 19:
                int dp4 = AndroidUtilities.dp(48.0f);
                y70 y70Var = ((u70) this.f4466b).f33265n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + y70Var.f34954o0 + y70Var.f34960u0, 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((ir0) this.f4466b).K.K.R, 1073741824));
                return;
            case 24:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((lw0) this.f4466b).getMeasuredHeight());
                return;
            case 26:
                sx0 sx0Var = (sx0) this.f4466b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                by0 by0Var = sx0Var.d;
                int i21 = by0Var.f26987o3;
                if (i21 > 0) {
                    i18 = AndroidUtilities.dp(4.0f) + i21;
                } else {
                    i18 = 0;
                }
                int max = Math.max(i18, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((sx0Var.h() - 1) * size2), sx0Var.d.f26978f3 * size2)));
                by0Var.f26986n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 27:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f4465a) {
            case 28:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.i1) this.f4466b).f33847n.f33817f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f4465a) {
            case 10:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.i8) this.f4466b).f40166b.f40822x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 29:
                super.setAlpha(f7);
                View view2 = ((cy) this.f4466b).fragmentView;
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
        switch (this.f4465a) {
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
        switch (this.f4465a) {
            case 12:
                super.setTranslationY(f7);
                org.telegram.ui.Components.bb.r((org.telegram.ui.Components.bb) this.f4466b).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public cc(Object obj, Context context, int i10) {
        super(context);
        this.f4465a = i10;
        this.f4466b = obj;
    }

    public cc(org.telegram.ui.Components.bb bbVar, Context context) {
        super(context);
        this.f4465a = 12;
        this.f4466b = bbVar;
        setTag(-33024);
    }

    public cc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f4465a = 8;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, u6Var);
        this.f4466b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.y6.hl, org.telegram.ui.ActionBar.y6.f23764z5, org.telegram.ui.ActionBar.y6.f23483k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
