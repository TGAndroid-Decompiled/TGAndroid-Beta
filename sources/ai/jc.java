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
import org.telegram.messenger.tl;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.tq0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.b20;
import org.telegram.ui.ey;
import org.telegram.ui.qt0;
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
                ((h11) this.f1569b).e(canvas, (getMeasuredWidth() - ((h11) this.f1569b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 21:
                super.draw(canvas);
                hr0 hr0Var = (hr0) this.f1569b;
                hr0Var.Y0.setBounds(0, (getMeasuredHeight() - hr0Var.H0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                hr0Var.Y0.draw(canvas);
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
                ((nw0) this.f1569b).S();
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
                ((CheckBoxBase) this.f1569b).f24292l = true;
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
                ((CheckBoxBase) this.f1569b).f24292l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        pr prVar;
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
                int i14 = org.telegram.ui.ActionBar.k6.f21126a7;
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
                q2Var.f22986n4.setBounds(0, 0, getWidth(), getHeight());
                q2Var.f22986n4.draw(canvas);
                return;
            case 16:
                if (((pr) this.f1569b).Z) {
                    canvas.drawRect(pr.R(prVar), 0.0f, getMeasuredWidth() - pr.S(prVar), 1.0f, org.telegram.ui.ActionBar.k6.f21305k0);
                    return;
                }
                return;
            case 20:
                super.onDraw(canvas);
                ((qt0) this.f1569b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                tq0 tq0Var = (tq0) this.f1569b;
                RectF rectF = tq0Var.f26782n;
                Paint paint2 = tq0Var.h;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 24:
                nw0 nw0Var = (nw0) this.f1569b;
                if (nw0Var.f29048b != null && !nw0Var.J) {
                    Drawable newDrawable = nw0Var.getNewDrawable();
                    boolean newDrawableMotion = nw0Var.getNewDrawableMotion();
                    float f14 = 0.0f;
                    if (newDrawable != nw0Var.f29048b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.k6.g1()) {
                            nw0Var.d = nw0Var.f29048b;
                            nw0Var.e = nw0Var.f29050c;
                        }
                        if (newDrawable instanceof wc0) {
                            ((wc0) newDrawable).q(nw0Var.L);
                        }
                        nw0Var.f29048b = newDrawable;
                        if (nw0Var.M && (newDrawable instanceof vn)) {
                            ((vn) newDrawable).f(this);
                        }
                        if (nw0Var.M) {
                            Drawable drawable3 = nw0Var.f29048b;
                            if (drawable3 instanceof wc0) {
                                ((wc0) drawable3).k();
                            }
                        }
                        nw0Var.f29050c = newDrawableMotion;
                        nw0Var.f29061l0 = 0.0f;
                        nw0Var.T(nw0Var.f29048b);
                        nw0Var.H();
                    } else if (nw0Var.f29050c != newDrawableMotion) {
                        nw0Var.f29050c = newDrawableMotion;
                        nw0Var.H();
                    }
                    float f15 = 1.0f;
                    nw0Var.f29061l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + nw0Var.f29061l0, 1.0f, 0.0f);
                    int i15 = 0;
                    while (i15 < 2) {
                        if (i15 == 0) {
                            drawable = nw0Var.d;
                        } else {
                            drawable = nw0Var.f29048b;
                        }
                        if (drawable == null) {
                            f12 = f15;
                        } else {
                            boolean z11 = true;
                            if (i15 == 1 && nw0Var.d != null && nw0Var.G != null) {
                                drawable.setAlpha((int) (nw0Var.f29061l0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i15 == 0) {
                                z10 = nw0Var.e;
                            } else {
                                z10 = nw0Var.f29050c;
                            }
                            if (z10) {
                                f7 = nw0Var.f29074y;
                                f10 = nw0Var.f29072w;
                                f11 = nw0Var.f29073x;
                            } else {
                                f7 = f15;
                                f10 = f14;
                                f11 = f10;
                            }
                            if (drawable instanceof wc0) {
                                wc0 wc0Var = (wc0) drawable;
                                if (wc0Var.f32210u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (nw0Var.O()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (nw0Var.P() && nw0Var.f29069s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i16 = i12 + i13;
                                    if (nw0Var.X()) {
                                        height2 = getRootView().getMeasuredHeight() - i16;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f12 = f15;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((height2 - ceil2) / 2) + nw0Var.E + i16 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i16, ceil, getMeasuredHeight() - nw0Var.h);
                                    drawable.setBounds(measuredWidth, i17, ceil + measuredWidth, ceil2 + i17);
                                    drawable.draw(canvas);
                                    nw0.F(nw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (nw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - nw0Var.h);
                                    }
                                    wc0Var.f32196f = nw0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - nw0Var.E) + f11));
                                    drawable.draw(canvas);
                                    if (nw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable instanceof ColorDrawable) {
                                    if (nw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - nw0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    nw0.F(nw0Var, canvas);
                                    if (nw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (nw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - nw0Var.h);
                                    }
                                    drawable.setBounds(0, nw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + nw0Var.E);
                                    drawable.draw(canvas);
                                    nw0.F(nw0Var, canvas);
                                    if (nw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f16 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f16, f16);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                        drawable.draw(canvas);
                                        nw0.F(nw0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (nw0Var.O()) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (nw0Var.P() && nw0Var.f29069s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i18 = i10 + i11;
                                        if (nw0Var.X()) {
                                            height = getRootView().getMeasuredHeight() - i18;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f7);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f7);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i19 = ((height - ceil4) / 2) + nw0Var.E + i18 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i18, ceil3, getMeasuredHeight() - nw0Var.h);
                                        drawable.setBounds(measuredWidth2, i19, ceil3 + measuredWidth2, ceil4 + i19);
                                        drawable.draw(canvas);
                                        nw0.F(nw0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (nw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - nw0Var.h);
                                    }
                                    if (drawable instanceof vn) {
                                        vn vnVar = (vn) drawable;
                                        vnVar.f42774b = this;
                                        wc0 wc0Var2 = vnVar.f42776f;
                                        if (wc0Var2 != null) {
                                            wc0Var2.q(this);
                                        }
                                    }
                                    float f17 = f7 - f12;
                                    float B2 = a1.g.B(-getMeasuredWidth(), f17, 2.0f, f10);
                                    float B3 = a1.g.B(-getRootView().getMeasuredHeight(), f17, 2.0f, f11);
                                    drawable.setBounds((int) B2, (int) (nw0Var.E + B3), (int) ((getMeasuredWidth() * f7) + B2), (int) si.o0.c(getRootView().getMeasuredHeight(), f7, nw0Var.E, B3));
                                    drawable.draw(canvas);
                                    nw0.F(nw0Var, canvas);
                                    if (nw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i15 == 0 && (drawable2 = nw0Var.d) != null && nw0Var.f29061l0 >= f12) {
                                if (nw0Var.M && (drawable2 instanceof vn)) {
                                    ((vn) drawable2).g(nw0Var.L);
                                }
                                if (nw0Var.M) {
                                    Drawable drawable4 = nw0Var.d;
                                    if (drawable4 instanceof wc0) {
                                        ((wc0) drawable4).l();
                                    }
                                }
                                nw0Var.d = null;
                                nw0Var.e = false;
                                nw0Var.H();
                                nw0Var.L.invalidate();
                            }
                        }
                        i15++;
                        f15 = f12;
                        f14 = 0.0f;
                    }
                    if (nw0Var.f29061l0 != f15) {
                        nw0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vi, false);
                bz0 bz0Var = (bz0) this.f1569b;
                org.telegram.ui.Components.voip.h hVar = bz0Var.L;
                Paint paint3 = bz0Var.f25116a;
                paint3.setColor(x02);
                Paint paint4 = bz0Var.f25117b;
                paint4.setColor(x02);
                Paint paint5 = bz0Var.f25118c;
                paint5.setColor(x02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = bz0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = bz0Var.e;
                if (z12 || bz0Var.J != 0.0f) {
                    if (z12) {
                        if (bz0Var.K) {
                            float f18 = bz0Var.J + 0.024615385f;
                            bz0Var.J = f18;
                            if (f18 > 1.0f) {
                                bz0Var.J = 1.0f;
                                bz0Var.K = false;
                            }
                        } else {
                            float f19 = bz0Var.J - 0.024615385f;
                            bz0Var.J = f19;
                            if (f19 < 0.0f) {
                                bz0Var.J = 0.0f;
                                bz0Var.K = true;
                            }
                        }
                    } else {
                        float f20 = bz0Var.J - 0.10666667f;
                        bz0Var.J = f20;
                        if (f20 < 0.0f) {
                            bz0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f31583f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (!bz0Var.e) {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (tl.B(24.0f, 2, getMeasuredWidth()) * bz0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    f13 = 1.0f;
                    paint = paint6;
                }
                if (!bz0Var.e) {
                    int B4 = (int) (tl.B(24.0f, 2, getMeasuredWidth()) * bz0Var.E);
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
                    ((org.telegram.ui.Components.voip.h1) this.f1569b).f31602n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
                    if (AndroidUtilities.dp(24.0f) + ndVar.f35901y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + ndVar.f35901y.getMeasuredHeight();
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
                    if (AndroidUtilities.dp(24.0f) + gVar.f35901y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.f35901y.getMeasuredHeight();
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
                    if (AndroidUtilities.dp(24.0f) + lVar.f35901y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + lVar.f35901y.getMeasuredHeight();
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
                if (b0Var instanceof wz) {
                    i16 = ((wz) b0Var).J;
                } else {
                    i16 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i16), 1073741824));
                return;
            case 12:
                org.telegram.ui.Components.za zaVar = (org.telegram.ui.Components.za) this.f1569b;
                int i19 = zaVar.h;
                if (i19 == 0) {
                    i17 = AndroidUtilities.dp(300.0f);
                } else {
                    i17 = (int) (i19 * zaVar.v);
                }
                int i20 = i17 - (((zaVar.G - zaVar.H) - zaVar.I) - zaVar.J);
                if (i20 < 1) {
                    i20 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((qm) this.f1569b).v.J, 1073741824));
                return;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((ao) this.f1569b).d.R0);
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((eo) ((org.telegram.ui.z7) this.f1569b).d).f26087w, 1073741824));
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((h11) this.f1569b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((h11) this.f1569b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((p70) this.f1569b).f29503c.f31359o0, 1073741824));
                return;
            case 19:
                int dp4 = AndroidUtilities.dp(48.0f);
                v70 v70Var = ((r70) this.f1569b).f30087n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + v70Var.f31359o0 + v70Var.f31365u0, 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((dr0) this.f1569b).K.K.R, 1073741824));
                return;
            case 25:
                kx0 kx0Var = (kx0) this.f1569b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                tx0 tx0Var = kx0Var.d;
                int i21 = tx0Var.f30918h3;
                if (i21 > 0) {
                    i18 = AndroidUtilities.dp(4.0f) + i21;
                } else {
                    i18 = 0;
                }
                int max = Math.max(i18, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((kx0Var.h() - 1) * size2), kx0Var.d.Y2 * size2)));
                tx0Var.f30917g3 = max;
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
                    if (AndroidUtilities.dp(24.0f) + b20Var.f35901y.getMeasuredHeight() > dp5) {
                        dp5 = Math.max(dp5, (AndroidUtilities.dp(24.0f) + b20Var.f35901y.getMeasuredHeight()) - b20Var.L);
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
                ((org.telegram.ui.Components.voip.h1) this.f1569b).f31602n.f31583f = i10;
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
                View view = ((org.telegram.ui.f8) this.f1569b).f37226b.f37783x.fragmentView;
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
                org.telegram.ui.Components.za.s((org.telegram.ui.Components.za) this.f1569b).invalidate();
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

    public jc(org.telegram.ui.Components.za zaVar, Context context) {
        super(context);
        this.f1568a = 12;
        this.f1569b = zaVar;
        setTag(-33024);
    }

    public jc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f1568a = 8;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, g6Var);
        this.f1569b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.k6.hl, org.telegram.ui.ActionBar.k6.f21588z5, org.telegram.ui.ActionBar.k6.f21312k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
