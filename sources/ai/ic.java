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
import org.telegram.messenger.lk;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.cy;
import org.telegram.ui.ot0;
import org.telegram.ui.tn;
public final class ic extends View {
    public final int f1502a;
    public Object f1503b;

    public ic(Context context) {
        super(context);
        this.f1502a = 18;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1502a) {
            case 1:
                canvas.save();
                ei.vb vbVar = (ei.vb) this.f1503b;
                canvas.translate(vbVar.f9958c1.getX() + vbVar.f9985l0.getX(), vbVar.f9958c1.getY() + vbVar.f9985l0.getY());
                ei.lb lbVar = vbVar.f9958c1;
                lbVar.k(canvas, lbVar.getBounds(), vbVar.f9958c1.getOver2Alpha());
                canvas.restore();
                return;
            case 6:
                bh.c cVar = ((ih.f) this.f1503b).I;
                if (cVar != null) {
                    cVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.i3) this.f1503b).d);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f1502a) {
            case 18:
                super.draw(canvas);
                ((e11) this.f1503b).e(canvas, (getMeasuredWidth() - ((e11) this.f1503b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 22:
                super.draw(canvas);
                er0 er0Var = (er0) this.f1503b;
                er0Var.X0.setBounds(0, (getMeasuredHeight() - er0Var.H0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                er0Var.X0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f1502a) {
            case 25:
                super.invalidate();
                ((kw0) this.f1503b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1502a) {
            case 4:
                super.onAttachedToWindow();
                ((hg.p1) this.f1503b).f12013f = true;
                return;
            case 8:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f1503b).f24145l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1502a) {
            case 4:
                super.onDetachedFromWindow();
                ((hg.p1) this.f1503b).f12013f = false;
                return;
            case 8:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f1503b).f24145l = false;
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
        switch (this.f1502a) {
            case 5:
                super.onDraw(canvas);
                hi.k0 k0Var = (hi.k0) this.f1503b;
                zf.y yVar = k0Var.K;
                float max = Math.max(k0Var.f12170b.e, k0Var.f12171c.e);
                zf.y yVar2 = k0Var.J;
                yVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.f12286b, 0);
                yVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.f12286b);
                int i14 = org.telegram.ui.ActionBar.h6.f20931a7;
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
            case 7:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((ki.t0) this.f1503b).f15523c.draw(canvas);
                canvas.restore();
                return;
            case 8:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f1503b;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            case 12:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.f1503b;
                r2Var.f22871n4.setBounds(0, 0, getWidth(), getHeight());
                r2Var.f22871n4.draw(canvas);
                return;
            case 17:
                if (((rr) this.f1503b).Z) {
                    canvas.drawRect(rr.S(rrVar), 0.0f, getMeasuredWidth() - rr.T(rrVar), 1.0f, org.telegram.ui.ActionBar.h6.f21110k0);
                    return;
                }
                return;
            case 21:
                super.onDraw(canvas);
                ((ot0) this.f1503b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 24:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                qq0 qq0Var = (qq0) this.f1503b;
                RectF rectF = qq0Var.f25628n;
                Paint paint2 = qq0Var.h;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 25:
                kw0 kw0Var = (kw0) this.f1503b;
                if (kw0Var.f27997b != null && !kw0Var.J) {
                    Drawable newDrawable = kw0Var.getNewDrawable();
                    boolean newDrawableMotion = kw0Var.getNewDrawableMotion();
                    Drawable drawable3 = kw0Var.f27997b;
                    float f14 = 0.0f;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.h6.vl != null) {
                            kw0Var.d = drawable3;
                            kw0Var.e = kw0Var.f27999c;
                        }
                        if (newDrawable instanceof wc0) {
                            ((wc0) newDrawable).q(kw0Var.L);
                        }
                        kw0Var.f27997b = newDrawable;
                        if (kw0Var.M && (newDrawable instanceof tn)) {
                            ((tn) newDrawable).f(this);
                        }
                        if (kw0Var.M) {
                            Drawable drawable4 = kw0Var.f27997b;
                            if (drawable4 instanceof wc0) {
                                ((wc0) drawable4).k();
                            }
                        }
                        kw0Var.f27999c = newDrawableMotion;
                        kw0Var.f28010l0 = 0.0f;
                        kw0Var.U(kw0Var.f27997b);
                        kw0Var.I();
                    } else if (kw0Var.f27999c != newDrawableMotion) {
                        kw0Var.f27999c = newDrawableMotion;
                        kw0Var.I();
                    }
                    float f15 = 1.0f;
                    kw0Var.f28010l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + kw0Var.f28010l0, 1.0f, 0.0f);
                    int i15 = 0;
                    while (i15 < 2) {
                        if (i15 == 0) {
                            drawable = kw0Var.d;
                        } else {
                            drawable = kw0Var.f27997b;
                        }
                        if (drawable == null) {
                            f12 = f15;
                        } else {
                            boolean z11 = true;
                            if (i15 == 1 && kw0Var.d != null && kw0Var.G != null) {
                                drawable.setAlpha((int) (kw0Var.f28010l0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i15 == 0) {
                                z10 = kw0Var.e;
                            } else {
                                z10 = kw0Var.f27999c;
                            }
                            if (z10) {
                                f7 = kw0Var.f28023y;
                                f10 = kw0Var.f28021w;
                                f11 = kw0Var.f28022x;
                            } else {
                                f7 = f15;
                                f10 = f14;
                                f11 = f10;
                            }
                            if (drawable instanceof wc0) {
                                wc0 wc0Var = (wc0) drawable;
                                if (wc0Var.f32100u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (kw0Var.P()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (kw0Var.Q() && kw0Var.f28018s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i16 = i12 + i13;
                                    if (kw0Var.Y()) {
                                        height2 = getRootView().getMeasuredHeight() - i16;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f12 = f15;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((height2 - ceil2) / 2) + kw0Var.E + i16 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i16, ceil, getMeasuredHeight() - kw0Var.h);
                                    drawable.setBounds(measuredWidth, i17, ceil + measuredWidth, ceil2 + i17);
                                    drawable.draw(canvas);
                                    kw0.H(kw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = f15;
                                    if (kw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - kw0Var.h);
                                    }
                                    wc0Var.f32086f = kw0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - kw0Var.E) + f11));
                                    drawable.draw(canvas);
                                    if (kw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = f15;
                                if (drawable instanceof ColorDrawable) {
                                    if (kw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - kw0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    kw0.H(kw0Var, canvas);
                                    if (kw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (kw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - kw0Var.h);
                                    }
                                    drawable.setBounds(0, kw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + kw0Var.E);
                                    drawable.draw(canvas);
                                    kw0.H(kw0Var, canvas);
                                    if (kw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f16 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f16, f16);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                        drawable.draw(canvas);
                                        kw0.H(kw0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (kw0Var.P()) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (kw0Var.Q() && kw0Var.f28018s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i18 = i10 + i11;
                                        if (kw0Var.Y()) {
                                            height = getRootView().getMeasuredHeight() - i18;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f7);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f7);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i19 = ((height - ceil4) / 2) + kw0Var.E + i18 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i18, ceil3, getMeasuredHeight() - kw0Var.h);
                                        drawable.setBounds(measuredWidth2, i19, ceil3 + measuredWidth2, ceil4 + i19);
                                        drawable.draw(canvas);
                                        kw0.H(kw0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (kw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - kw0Var.h);
                                    }
                                    if (drawable instanceof tn) {
                                        tn tnVar = (tn) drawable;
                                        tnVar.f41715b = this;
                                        wc0 wc0Var2 = tnVar.f41717f;
                                        if (wc0Var2 != null) {
                                            wc0Var2.q(this);
                                        }
                                    }
                                    float f17 = f7 - f12;
                                    float B2 = a1.g.B(-getMeasuredWidth(), f17, 2.0f, f10);
                                    float B3 = a1.g.B(-getRootView().getMeasuredHeight(), f17, 2.0f, f11);
                                    drawable.setBounds((int) B2, (int) (kw0Var.E + B3), (int) ((getMeasuredWidth() * f7) + B2), (int) r4.c.c(getRootView().getMeasuredHeight(), f7, kw0Var.E, B3));
                                    drawable.draw(canvas);
                                    kw0.H(kw0Var, canvas);
                                    if (kw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i15 == 0 && (drawable2 = kw0Var.d) != null && kw0Var.f28010l0 >= f12) {
                                if (kw0Var.M && (drawable2 instanceof tn)) {
                                    ((tn) drawable2).g(kw0Var.L);
                                }
                                if (kw0Var.M) {
                                    Drawable drawable5 = kw0Var.d;
                                    if (drawable5 instanceof wc0) {
                                        ((wc0) drawable5).l();
                                    }
                                }
                                kw0Var.d = null;
                                kw0Var.e = false;
                                kw0Var.I();
                                kw0Var.L.invalidate();
                            }
                        }
                        i15++;
                        f15 = f12;
                        f14 = 0.0f;
                    }
                    if (kw0Var.f28010l0 != f15) {
                        kw0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Vi, false);
                yy0 yy0Var = (yy0) this.f1503b;
                org.telegram.ui.Components.voip.h hVar = yy0Var.L;
                Paint paint3 = yy0Var.f32777a;
                paint3.setColor(x02);
                Paint paint4 = yy0Var.f32778b;
                paint4.setColor(x02);
                Paint paint5 = yy0Var.f32779c;
                paint5.setColor(x02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = yy0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = yy0Var.e;
                if (z12 || yy0Var.J != 0.0f) {
                    if (z12) {
                        if (yy0Var.K) {
                            float f18 = yy0Var.J + 0.024615385f;
                            yy0Var.J = f18;
                            if (f18 > 1.0f) {
                                yy0Var.J = 1.0f;
                                yy0Var.K = false;
                            }
                        } else {
                            float f19 = yy0Var.J - 0.024615385f;
                            yy0Var.J = f19;
                            if (f19 < 0.0f) {
                                yy0Var.J = 0.0f;
                                yy0Var.K = true;
                            }
                        }
                    } else {
                        float f20 = yy0Var.J - 0.10666667f;
                        yy0Var.J = f20;
                        if (f20 < 0.0f) {
                            yy0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f31478f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (!yy0Var.e) {
                    int dp3 = AndroidUtilities.dp(24.0f) + ((int) (lk.B(24.0f, 2, getMeasuredWidth()) * yy0Var.F));
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    f13 = 1.0f;
                    paint = paint6;
                }
                if (!yy0Var.e) {
                    int B4 = (int) (lk.B(24.0f, 2, getMeasuredWidth()) * yy0Var.E);
                    if (B4 < AndroidUtilities.dp(f13)) {
                        B4 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + B4;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B4, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    return;
                }
                return;
            case 28:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.h1) this.f1503b).f31497n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        switch (this.f1502a) {
            case 0:
                md mdVar = (md) this.f1503b;
                if (mdVar.H) {
                    i12 = (md.D0(mdVar).getMeasuredHeight() + mdVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + mdVar.I;
                    if (AndroidUtilities.dp(24.0f) + mdVar.f43322y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + mdVar.f43322y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 1:
            case 5:
            case 6:
            case 7:
            case 11:
            case 12:
            case 17:
            case 21:
            case 22:
            case 24:
            case 25:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                fi.g gVar = (fi.g) this.f1503b;
                if (gVar.H) {
                    i13 = (fi.g.z0(gVar).getMeasuredHeight() + gVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.I;
                    if (AndroidUtilities.dp(24.0f) + gVar.f43322y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.f43322y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 3:
                gi.l lVar = (gi.l) this.f1503b;
                if (lVar.H) {
                    i14 = (gi.l.C0(lVar).getMeasuredHeight() + lVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + lVar.I;
                    if (AndroidUtilities.dp(24.0f) + lVar.f43322y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + lVar.f43322y.getMeasuredHeight();
                    }
                    i14 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), 1073741824));
                return;
            case 4:
                ((View) getParent()).getMeasuredHeight();
                hg.p1 p1Var = (hg.p1) this.f1503b;
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
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                return;
            case 10:
                s4.b0 b0Var = ((org.telegram.ui.t5) this.f1503b).d.F;
                if (b0Var instanceof yz) {
                    i16 = ((yz) b0Var).J;
                } else {
                    i16 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i16), 1073741824));
                return;
            case 13:
                org.telegram.ui.Components.bb bbVar = (org.telegram.ui.Components.bb) this.f1503b;
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
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((sm) this.f1503b).v.J, 1073741824));
                return;
            case 15:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((co) this.f1503b).d.R0);
                return;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((go) ((org.telegram.ui.z7) this.f1503b).d).f26655w, 1073741824));
                return;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((e11) this.f1503b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((e11) this.f1503b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 19:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((p70) this.f1503b).f29206c.f31185o0, 1073741824));
                return;
            case 20:
                int dp4 = AndroidUtilities.dp(48.0f);
                v70 v70Var = ((r70) this.f1503b).f29872n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp4 + v70Var.f31185o0 + v70Var.f31191u0, 1073741824));
                return;
            case 23:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((ar0) this.f1503b).K.K.R, 1073741824));
                return;
            case 26:
                hx0 hx0Var = (hx0) this.f1503b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                qx0 qx0Var = hx0Var.d;
                int i21 = qx0Var.f29740e3;
                if (i21 > 0) {
                    i18 = AndroidUtilities.dp(4.0f) + i21;
                } else {
                    i18 = 0;
                }
                int max = Math.max(i18, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((hx0Var.h() - 1) * size2), hx0Var.d.V2 * size2)));
                qx0Var.f29739d3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 27:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f1502a) {
            case 28:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.h1) this.f1503b).f31497n.f31478f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1502a) {
            case 11:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.f8) this.f1503b).f36912b.f37557x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 29:
                super.setAlpha(f7);
                View view2 = ((cy) this.f1503b).fragmentView;
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
        switch (this.f1502a) {
            case 24:
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
        switch (this.f1502a) {
            case 13:
                super.setTranslationY(f7);
                org.telegram.ui.Components.bb.t((org.telegram.ui.Components.bb) this.f1503b).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public ic(Object obj, Context context, int i10) {
        super(context);
        this.f1502a = i10;
        this.f1503b = obj;
    }

    public ic(org.telegram.ui.Components.bb bbVar, Context context) {
        super(context);
        this.f1502a = 13;
        this.f1503b = bbVar;
        setTag(-33024);
    }

    public ic(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1502a = 8;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, d6Var);
        this.f1503b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f21393z5, org.telegram.ui.ActionBar.h6.f21117k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
