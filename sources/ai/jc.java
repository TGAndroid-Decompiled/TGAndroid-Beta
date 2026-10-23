package ai;

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
import org.telegram.messenger.sl;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.b20;
import org.telegram.ui.ey;
import org.telegram.ui.rt0;
import org.telegram.ui.vn;
public final class jc extends View {
    public final int f1568a;
    public Object f1569b;

    public jc(Context context) {
        super(context);
        this.f1568a = 17;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1568a) {
            case 1:
                canvas.save();
                ei.vb vbVar = (ei.vb) this.f1569b;
                canvas.translate(vbVar.f9973c1.getX() + vbVar.f10000l0.getX(), vbVar.f9973c1.getY() + vbVar.f10000l0.getY());
                ei.lb lbVar = vbVar.f9973c1;
                lbVar.k(canvas, lbVar.getBounds(), vbVar.f9973c1.getOver2Alpha());
                canvas.restore();
                return;
            case 6:
                bh.c cVar = ((ih.f) this.f1569b).I;
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
        switch (this.f1568a) {
            case 17:
                super.draw(canvas);
                ((i11) this.f1569b).e(canvas, (getMeasuredWidth() - ((i11) this.f1569b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 21:
                super.draw(canvas);
                ir0 ir0Var = (ir0) this.f1569b;
                ir0Var.Y0.setBounds(0, (getMeasuredHeight() - ir0Var.H0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                ir0Var.Y0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f1568a) {
            case 24:
                super.invalidate();
                ((ow0) this.f1569b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1568a) {
            case 4:
                super.onAttachedToWindow();
                ((hg.p1) this.f1569b).f12038f = true;
                return;
            case 8:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f1569b).f24291l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1568a) {
            case 4:
                super.onDetachedFromWindow();
                ((hg.p1) this.f1569b).f12038f = false;
                return;
            case 8:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f1569b).f24291l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        rr rrVar;
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
        switch (this.f1568a) {
            case 5:
                super.onDraw(canvas);
                hi.k0 k0Var = (hi.k0) this.f1569b;
                zf.y yVar = k0Var.K;
                float max = Math.max(k0Var.f12199b.e, k0Var.f12200c.e);
                zf.y yVar2 = k0Var.J;
                yVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.f12316b, 0);
                yVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.f12316b);
                int i14 = org.telegram.ui.ActionBar.k6.f21125a7;
                yVar2.b(org.telegram.ui.ActionBar.k6.o1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i14)));
                yVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                yVar.c(0, lerp);
                yVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                yVar.b(org.telegram.ui.ActionBar.k6.o1(lerp3, k0Var.getThemedColor(i14)));
                yVar.draw(canvas);
                return;
            case 7:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((ki.t0) this.f1569b).f15581c.draw(canvas);
                canvas.restore();
                return;
            case 8:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f1569b;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            case 11:
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) this.f1569b;
                q2Var.f22985n4.setBounds(0, 0, getWidth(), getHeight());
                q2Var.f22985n4.draw(canvas);
                return;
            case 16:
                if (((rr) this.f1569b).Z) {
                    canvas.drawRect(rr.R(rrVar), 0.0f, getMeasuredWidth() - rr.S(rrVar), 1.0f, org.telegram.ui.ActionBar.k6.f21304k0);
                    return;
                }
                return;
            case 20:
                super.onDraw(canvas);
                ((rt0) this.f1569b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                uq0 uq0Var = (uq0) this.f1569b;
                RectF rectF = uq0Var.f27041n;
                Paint paint2 = uq0Var.h;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 24:
                ow0 ow0Var = (ow0) this.f1569b;
                if (ow0Var.f29329b != null && !ow0Var.J) {
                    Drawable newDrawable = ow0Var.getNewDrawable();
                    boolean newDrawableMotion = ow0Var.getNewDrawableMotion();
                    float f14 = 0.0f;
                    if (newDrawable != ow0Var.f29329b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.k6.g1()) {
                            ow0Var.d = ow0Var.f29329b;
                            ow0Var.e = ow0Var.f29331c;
                        }
                        if (newDrawable instanceof yc0) {
                            ((yc0) newDrawable).q(ow0Var.L);
                        }
                        ow0Var.f29329b = newDrawable;
                        if (ow0Var.M && (newDrawable instanceof vn)) {
                            ((vn) newDrawable).f(this);
                        }
                        if (ow0Var.M) {
                            Drawable drawable3 = ow0Var.f29329b;
                            if (drawable3 instanceof yc0) {
                                ((yc0) drawable3).k();
                            }
                        }
                        ow0Var.f29331c = newDrawableMotion;
                        ow0Var.f29342l0 = 0.0f;
                        ow0Var.T(ow0Var.f29329b);
                        ow0Var.H();
                    } else if (ow0Var.f29331c != newDrawableMotion) {
                        ow0Var.f29331c = newDrawableMotion;
                        ow0Var.H();
                    }
                    float f15 = 1.0f;
                    ow0Var.f29342l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + ow0Var.f29342l0, 1.0f, 0.0f);
                    int i15 = 0;
                    while (i15 < 2) {
                        if (i15 == 0) {
                            drawable = ow0Var.d;
                        } else {
                            drawable = ow0Var.f29329b;
                        }
                        if (drawable == null) {
                            f12 = f15;
                        } else {
                            boolean z11 = true;
                            if (i15 == 1 && ow0Var.d != null && ow0Var.G != null) {
                                drawable.setAlpha((int) (ow0Var.f29342l0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i15 == 0) {
                                z10 = ow0Var.e;
                            } else {
                                z10 = ow0Var.f29331c;
                            }
                            if (z10) {
                                f7 = ow0Var.f29355y;
                                f10 = ow0Var.f29353w;
                                f11 = ow0Var.f29354x;
                            } else {
                                f7 = f15;
                                f10 = f14;
                                f11 = f10;
                            }
                            if (drawable instanceof yc0) {
                                yc0 yc0Var = (yc0) drawable;
                                if (yc0Var.f32897u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (ow0Var.O()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (ow0Var.P() && ow0Var.f29350s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i16 = i12 + i13;
                                    if (ow0Var.X()) {
                                        height2 = getRootView().getMeasuredHeight() - i16;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f12 = f15;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((height2 - ceil2) / 2) + ow0Var.E + i16 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i16, ceil, getMeasuredHeight() - ow0Var.h);
                                    drawable.setBounds(measuredWidth, i17, ceil + measuredWidth, ceil2 + i17);
                                    drawable.draw(canvas);
                                    ow0.F(ow0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (ow0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ow0Var.h);
                                    }
                                    yc0Var.f32883f = ow0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - ow0Var.E) + f11));
                                    drawable.draw(canvas);
                                    if (ow0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable instanceof ColorDrawable) {
                                    if (ow0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ow0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    ow0.F(ow0Var, canvas);
                                    if (ow0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (ow0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ow0Var.h);
                                    }
                                    drawable.setBounds(0, ow0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + ow0Var.E);
                                    drawable.draw(canvas);
                                    ow0.F(ow0Var, canvas);
                                    if (ow0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f16 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f16, f16);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                        drawable.draw(canvas);
                                        ow0.F(ow0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (ow0Var.O()) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (ow0Var.P() && ow0Var.f29350s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i18 = i10 + i11;
                                        if (ow0Var.X()) {
                                            height = getRootView().getMeasuredHeight() - i18;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f7);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f7);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i19 = ((height - ceil4) / 2) + ow0Var.E + i18 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i18, ceil3, getMeasuredHeight() - ow0Var.h);
                                        drawable.setBounds(measuredWidth2, i19, ceil3 + measuredWidth2, ceil4 + i19);
                                        drawable.draw(canvas);
                                        ow0.F(ow0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (ow0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ow0Var.h);
                                    }
                                    if (drawable instanceof vn) {
                                        vn vnVar = (vn) drawable;
                                        vnVar.f42793b = this;
                                        yc0 yc0Var2 = vnVar.f42795f;
                                        if (yc0Var2 != null) {
                                            yc0Var2.q(this);
                                        }
                                    }
                                    float f17 = f7 - f12;
                                    float B2 = a1.g.B(-getMeasuredWidth(), f17, 2.0f, f10);
                                    float B3 = a1.g.B(-getRootView().getMeasuredHeight(), f17, 2.0f, f11);
                                    drawable.setBounds((int) B2, (int) (ow0Var.E + B3), (int) ((getMeasuredWidth() * f7) + B2), (int) si.o0.c(getRootView().getMeasuredHeight(), f7, ow0Var.E, B3));
                                    drawable.draw(canvas);
                                    ow0.F(ow0Var, canvas);
                                    if (ow0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i15 == 0 && (drawable2 = ow0Var.d) != null && ow0Var.f29342l0 >= f12) {
                                if (ow0Var.M && (drawable2 instanceof vn)) {
                                    ((vn) drawable2).g(ow0Var.L);
                                }
                                if (ow0Var.M) {
                                    Drawable drawable4 = ow0Var.d;
                                    if (drawable4 instanceof yc0) {
                                        ((yc0) drawable4).l();
                                    }
                                }
                                ow0Var.d = null;
                                ow0Var.e = false;
                                ow0Var.H();
                                ow0Var.L.invalidate();
                            }
                        }
                        i15++;
                        f15 = f12;
                        f14 = 0.0f;
                    }
                    if (ow0Var.f29342l0 != f15) {
                        ow0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vi, false);
                cz0 cz0Var = (cz0) this.f1569b;
                org.telegram.ui.Components.voip.h hVar = cz0Var.L;
                Paint paint3 = cz0Var.f25457a;
                paint3.setColor(x02);
                Paint paint4 = cz0Var.f25458b;
                paint4.setColor(x02);
                Paint paint5 = cz0Var.f25459c;
                paint5.setColor(x02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = cz0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = cz0Var.e;
                if (z12 || cz0Var.J != 0.0f) {
                    if (z12) {
                        if (cz0Var.K) {
                            float f18 = cz0Var.J + 0.024615385f;
                            cz0Var.J = f18;
                            if (f18 > 1.0f) {
                                cz0Var.J = 1.0f;
                                cz0Var.K = false;
                            }
                        } else {
                            float f19 = cz0Var.J - 0.024615385f;
                            cz0Var.J = f19;
                            if (f19 < 0.0f) {
                                cz0Var.J = 0.0f;
                                cz0Var.K = true;
                            }
                        }
                    } else {
                        float f20 = cz0Var.J - 0.10666667f;
                        cz0Var.J = f20;
                        if (f20 < 0.0f) {
                            cz0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f31613f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (!cz0Var.e) {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (sl.B(24.0f, 2, getMeasuredWidth()) * cz0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    f13 = 1.0f;
                    paint = paint6;
                }
                if (!cz0Var.e) {
                    int B4 = (int) (sl.B(24.0f, 2, getMeasuredWidth()) * cz0Var.E);
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
                    ((org.telegram.ui.Components.voip.h1) this.f1569b).f31632n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        switch (this.f1568a) {
            case 0:
                nd ndVar = (nd) this.f1569b;
                if (ndVar.H) {
                    i12 = (nd.D0(ndVar).getMeasuredHeight() + ndVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + ndVar.I;
                    if (AndroidUtilities.dp(24.0f) + ndVar.f35833y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + ndVar.f35833y.getMeasuredHeight();
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
            case 24:
            case 27:
            case 28:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                fi.g gVar = (fi.g) this.f1569b;
                if (gVar.H) {
                    i13 = (fi.g.z0(gVar).getMeasuredHeight() + gVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.I;
                    if (AndroidUtilities.dp(24.0f) + gVar.f35833y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.f35833y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 3:
                gi.l lVar = (gi.l) this.f1569b;
                if (lVar.H) {
                    i14 = (gi.l.C0(lVar).getMeasuredHeight() + lVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + lVar.I;
                    if (AndroidUtilities.dp(24.0f) + lVar.f35833y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + lVar.f35833y.getMeasuredHeight();
                    }
                    i14 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), 1073741824));
                return;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                hg.p1 p1Var = (hg.p1) this.f1569b;
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
                s4.b0 b0Var = ((org.telegram.ui.s5) this.f1569b).d.F;
                if (b0Var instanceof yz) {
                    i16 = ((yz) b0Var).J;
                } else {
                    i16 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i16), 1073741824));
                return;
            case 12:
                org.telegram.ui.Components.bb bbVar = (org.telegram.ui.Components.bb) this.f1569b;
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((sm) this.f1569b).v.J, 1073741824));
                return;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((co) this.f1569b).d.R0);
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((go) ((org.telegram.ui.z7) this.f1569b).d).f26686w, 1073741824));
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((i11) this.f1569b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((i11) this.f1569b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((r70) this.f1569b).f30113c.f32464o0, 1073741824));
                return;
            case 19:
                int dp4 = AndroidUtilities.dp(48.0f);
                x70 x70Var = ((t70) this.f1569b).f30662n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + x70Var.f32464o0 + x70Var.f32470u0, 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((er0) this.f1569b).K.K.R, 1073741824));
                return;
            case 25:
                lx0 lx0Var = (lx0) this.f1569b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                ux0 ux0Var = lx0Var.d;
                int i21 = ux0Var.f31238h3;
                if (i21 > 0) {
                    i18 = AndroidUtilities.dp(4.0f) + i21;
                } else {
                    i18 = 0;
                }
                int max = Math.max(i18, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((lx0Var.h() - 1) * size2), lx0Var.d.Y2 * size2)));
                ux0Var.f31237g3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 26:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
            case 29:
                b20 b20Var = (b20) this.f1569b;
                if (b20Var.H) {
                    b20Var.J = (b20.U(b20Var).getMeasuredHeight() + b20Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp5 = AndroidUtilities.dp(140.0f) + b20Var.I;
                    if (AndroidUtilities.dp(24.0f) + b20Var.f35833y.getMeasuredHeight() > dp5) {
                        dp5 = Math.max(dp5, (AndroidUtilities.dp(24.0f) + b20Var.f35833y.getMeasuredHeight()) - b20Var.L);
                    }
                    b20Var.J = dp5;
                }
                int i22 = (int) (b20Var.J - (0 * 2.5f));
                b20Var.J = i22;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i22, 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f1568a) {
            case 27:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.h1) this.f1569b).f31632n.f31613f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1568a) {
            case 10:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.f8) this.f1569b).f37242b.f37780x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 28:
                super.setAlpha(f7);
                View view2 = ((ey) this.f1569b).fragmentView;
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
        switch (this.f1568a) {
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
        switch (this.f1568a) {
            case 12:
                super.setTranslationY(f7);
                org.telegram.ui.Components.bb.s((org.telegram.ui.Components.bb) this.f1569b).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public jc(Object obj, Context context, int i10) {
        super(context);
        this.f1568a = i10;
        this.f1569b = obj;
    }

    public jc(org.telegram.ui.Components.bb bbVar, Context context) {
        super(context);
        this.f1568a = 12;
        this.f1569b = bbVar;
        setTag(-33024);
    }

    public jc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f1568a = 8;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, g6Var);
        this.f1569b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.k6.hl, org.telegram.ui.ActionBar.k6.f21587z5, org.telegram.ui.ActionBar.k6.f21311k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
