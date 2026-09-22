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
import org.telegram.messenger.rk;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.co;
import org.telegram.ui.iu0;
import org.telegram.ui.r20;
import org.telegram.ui.uy;
public final class eb extends View {
    public final int f4611a;
    public Object f4612b;

    public eb(Context context) {
        super(context);
        this.f4611a = 17;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4611a) {
            case 0:
                canvas.save();
                oc ocVar = (oc) this.f4612b;
                canvas.translate(ocVar.f5212c1.getX() + ocVar.f5239l0.getX(), ocVar.f5212c1.getY() + ocVar.f5239l0.getY());
                ec ecVar = ocVar.f5212c1;
                ecVar.k(canvas, ecVar.getBounds(), ocVar.f5212c1.getOver2Alpha());
                canvas.restore();
                return;
            case 5:
                ah.e eVar = ((hh.g) this.f4612b).I;
                if (eVar != null) {
                    eVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.i3) this.f4612b).d);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f4611a) {
            case 17:
                super.draw(canvas);
                ((w01) this.f4612b).e(canvas, (getMeasuredWidth() - ((w01) this.f4612b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 21:
                super.draw(canvas);
                wq0 wq0Var = (wq0) this.f4612b;
                wq0Var.W0.setBounds(0, (getMeasuredHeight() - wq0Var.G0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                wq0Var.W0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f4611a) {
            case 24:
                super.invalidate();
                ((cw0) this.f4612b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f4611a) {
            case 4:
                super.onAttachedToWindow();
                ((gg.q1) this.f4612b).f9903f = true;
                return;
            case 7:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f4612b).f22204l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4611a) {
            case 4:
                super.onDetachedFromWindow();
                ((gg.q1) this.f4612b).f9903f = false;
                return;
            case 7:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f4612b).f22204l = false;
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
        switch (this.f4611a) {
            case 3:
                super.onDraw(canvas);
                fi.k0 k0Var = (fi.k0) this.f4612b;
                yf.y yVar = k0Var.K;
                float max = Math.max(k0Var.f9125b.e, k0Var.f9126c.e);
                yf.y yVar2 = k0Var.J;
                yVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.f10593b, 0);
                yVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.f10593b);
                int i14 = org.telegram.ui.ActionBar.j6.f19053a7;
                yVar2.b(org.telegram.ui.ActionBar.j6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i14)));
                yVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                yVar.c(0, lerp);
                yVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                yVar.b(org.telegram.ui.ActionBar.j6.l1(lerp3, k0Var.getThemedColor(i14)));
                yVar.draw(canvas);
                return;
            case 6:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((ii.u0) this.f4612b).f11652c.draw(canvas);
                canvas.restore();
                return;
            case 7:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f4612b;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            case 11:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.f4612b;
                s2Var.f20987j4.setBounds(0, 0, getWidth(), getHeight());
                s2Var.f20987j4.draw(canvas);
                return;
            case 16:
                gr grVar = (gr) this.f4612b;
                if (grVar.Z) {
                    canvas.drawRect(gr.R(grVar), 0.0f, getMeasuredWidth() - gr.S(grVar), 1.0f, org.telegram.ui.ActionBar.j6.f19231k0);
                    return;
                }
                return;
            case 20:
                super.onDraw(canvas);
                ((iu0) this.f4612b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                iq0 iq0Var = (iq0) this.f4612b;
                RectF rectF = iq0Var.h;
                Paint paint2 = iq0Var.f29783f;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 24:
                cw0 cw0Var = (cw0) this.f4612b;
                if (cw0Var.f23459b != null && !cw0Var.J) {
                    Drawable newDrawable = cw0Var.getNewDrawable();
                    boolean newDrawableMotion = cw0Var.getNewDrawableMotion();
                    Drawable drawable3 = cw0Var.f23459b;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.j6.sl != null) {
                            cw0Var.d = drawable3;
                            cw0Var.e = cw0Var.f23461c;
                        }
                        if (newDrawable instanceof nc0) {
                            ((nc0) newDrawable).r(cw0Var.L);
                        }
                        cw0Var.f23459b = newDrawable;
                        if (cw0Var.M && (newDrawable instanceof co)) {
                            ((co) newDrawable).f(this);
                        }
                        if (cw0Var.M) {
                            Drawable drawable4 = cw0Var.f23459b;
                            if (drawable4 instanceof nc0) {
                                ((nc0) drawable4).k();
                            }
                        }
                        cw0Var.f23461c = newDrawableMotion;
                        cw0Var.f23472l0 = 0.0f;
                        cw0Var.U(cw0Var.f23459b);
                        cw0Var.I();
                    } else if (cw0Var.f23461c != newDrawableMotion) {
                        cw0Var.f23461c = newDrawableMotion;
                        cw0Var.I();
                    }
                    cw0Var.f23472l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + cw0Var.f23472l0, 1.0f, 0.0f);
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (i15 == 0) {
                            drawable = cw0Var.d;
                        } else {
                            drawable = cw0Var.f23459b;
                        }
                        if (drawable != null) {
                            boolean z11 = true;
                            if (i15 == 1 && cw0Var.d != null && cw0Var.G != null) {
                                drawable.setAlpha((int) (cw0Var.f23472l0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i15 == 0) {
                                z10 = cw0Var.e;
                            } else {
                                z10 = cw0Var.f23461c;
                            }
                            if (z10) {
                                f7 = cw0Var.f23485y;
                                f10 = cw0Var.f23483w;
                                f11 = cw0Var.f23484x;
                            } else {
                                f7 = 1.0f;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                            if (drawable instanceof nc0) {
                                nc0 nc0Var = (nc0) drawable;
                                if (nc0Var.f26746u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (cw0Var.P()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (cw0Var.Q() && cw0Var.f23480s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i16 = i12 + i13;
                                    if (cw0Var.Y()) {
                                        height2 = getRootView().getMeasuredHeight() - i16;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f12 = 1.0f;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((height2 - ceil2) / 2) + cw0Var.E + i16 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i16, ceil, getMeasuredHeight() - cw0Var.h);
                                    drawable.setBounds(measuredWidth, i17, ceil + measuredWidth, ceil2 + i17);
                                    drawable.draw(canvas);
                                    cw0.H(cw0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = 1.0f;
                                    if (cw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cw0Var.h);
                                    }
                                    nc0Var.f26732f = cw0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - cw0Var.E) + f11));
                                    drawable.draw(canvas);
                                    if (cw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = 1.0f;
                                if (drawable instanceof ColorDrawable) {
                                    if (cw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - cw0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    cw0.H(cw0Var, canvas);
                                    if (cw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (cw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cw0Var.h);
                                    }
                                    drawable.setBounds(0, cw0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + cw0Var.E);
                                    drawable.draw(canvas);
                                    cw0.H(cw0Var, canvas);
                                    if (cw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f14 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f14, f14);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f14), (int) Math.ceil(getRootView().getMeasuredHeight() / f14));
                                        drawable.draw(canvas);
                                        cw0.H(cw0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (cw0Var.P()) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (cw0Var.Q() && cw0Var.f23480s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i18 = i10 + i11;
                                        if (cw0Var.Y()) {
                                            height = getRootView().getMeasuredHeight() - i18;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f7);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f7);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i19 = ((height - ceil4) / 2) + cw0Var.E + i18 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i18, ceil3, getMeasuredHeight() - cw0Var.h);
                                        drawable.setBounds(measuredWidth2, i19, ceil3 + measuredWidth2, ceil4 + i19);
                                        drawable.draw(canvas);
                                        cw0.H(cw0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (cw0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cw0Var.h);
                                    }
                                    if (drawable instanceof co) {
                                        co coVar = (co) drawable;
                                        coVar.f32814b = this;
                                        nc0 nc0Var2 = coVar.f32816f;
                                        if (nc0Var2 != null) {
                                            nc0Var2.r(this);
                                        }
                                    }
                                    float f15 = f7 - 1.0f;
                                    float A = a4.a.A(-getMeasuredWidth(), f15, 2.0f, f10);
                                    float A2 = a4.a.A(-getRootView().getMeasuredHeight(), f15, 2.0f, f11);
                                    drawable.setBounds((int) A, (int) (cw0Var.E + A2), (int) ((getMeasuredWidth() * f7) + A), (int) org.telegram.ui.Cells.c1.b(getRootView().getMeasuredHeight(), f7, cw0Var.E, A2));
                                    drawable.draw(canvas);
                                    cw0.H(cw0Var, canvas);
                                    if (cw0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i15 == 0 && (drawable2 = cw0Var.d) != null && cw0Var.f23472l0 >= f12) {
                                if (cw0Var.M && (drawable2 instanceof co)) {
                                    ((co) drawable2).g(cw0Var.L);
                                }
                                if (cw0Var.M) {
                                    Drawable drawable5 = cw0Var.d;
                                    if (drawable5 instanceof nc0) {
                                        ((nc0) drawable5).l();
                                    }
                                }
                                cw0Var.d = null;
                                cw0Var.e = false;
                                cw0Var.I();
                                cw0Var.L.invalidate();
                            }
                        }
                    }
                    if (cw0Var.f23472l0 != 1.0f) {
                        cw0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                sy0 sy0Var = (sy0) this.f4612b;
                org.telegram.ui.Components.voip.h hVar = sy0Var.L;
                Paint paint3 = sy0Var.f28336a;
                paint3.setColor(w02);
                Paint paint4 = sy0Var.f28337b;
                paint4.setColor(w02);
                Paint paint5 = sy0Var.f28338c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = sy0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = sy0Var.e;
                if (z12 || sy0Var.J != 0.0f) {
                    if (z12) {
                        if (sy0Var.K) {
                            float f16 = sy0Var.J + 0.024615385f;
                            sy0Var.J = f16;
                            if (f16 > 1.0f) {
                                sy0Var.J = 1.0f;
                                sy0Var.K = false;
                            }
                        } else {
                            float f17 = sy0Var.J - 0.024615385f;
                            sy0Var.J = f17;
                            if (f17 < 0.0f) {
                                sy0Var.J = 0.0f;
                                sy0Var.K = true;
                            }
                        }
                    } else {
                        float f18 = sy0Var.J - 0.10666667f;
                        sy0Var.J = f18;
                        if (f18 < 0.0f) {
                            sy0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f29330f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (!sy0Var.e) {
                    int B = (int) (rk.B(24.0f, 2, getMeasuredWidth()) * sy0Var.F);
                    int dp3 = AndroidUtilities.dp(24.0f) + B;
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    paint = paint6;
                    f13 = 1.0f;
                }
                if (!sy0Var.e) {
                    int B2 = (int) (rk.B(24.0f, 2, getMeasuredWidth()) * sy0Var.E);
                    if (B2 < AndroidUtilities.dp(f13)) {
                        B2 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + B2;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + B2, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    return;
                }
                return;
            case 27:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.j1) this.f4612b).f29376n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        switch (this.f4611a) {
            case 1:
                di.i iVar = (di.i) this.f4612b;
                if (iVar.H) {
                    i12 = (di.i.y0(iVar).getMeasuredHeight() + iVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + iVar.I;
                    if (AndroidUtilities.dp(24.0f) + iVar.f37054y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + iVar.f37054y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 2:
                ei.l lVar = (ei.l) this.f4612b;
                if (lVar.H) {
                    i13 = (ei.l.B0(lVar).getMeasuredHeight() + lVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + lVar.I;
                    if (AndroidUtilities.dp(24.0f) + lVar.f37054y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + lVar.f37054y.getMeasuredHeight();
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
                gg.q1 q1Var = (gg.q1) this.f4612b;
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
                s4.c0 c0Var = ((org.telegram.ui.o5) this.f4612b).d.F;
                if (c0Var instanceof pz) {
                    i15 = ((pz) c0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 12:
                org.telegram.ui.Components.ab abVar = (org.telegram.ui.Components.ab) this.f4612b;
                int i18 = abVar.h;
                if (i18 == 0) {
                    i16 = AndroidUtilities.dp(300.0f);
                } else {
                    i16 = (int) (i18 * abVar.v);
                }
                int i19 = i16 - (((abVar.G - abVar.H) - abVar.I) - abVar.J);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((hm) this.f4612b).v.J, 1073741824));
                return;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((sn) this.f4612b).d.R0);
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((vn) ((org.telegram.ui.x7) this.f4612b).d).f29211w, 1073741824));
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((w01) this.f4612b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((w01) this.f4612b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((g70) this.f4612b).f24434c.f26363o0, 1073741824));
                return;
            case 19:
                int dp3 = AndroidUtilities.dp(48.0f);
                m70 m70Var = ((i70) this.f4612b).f24991n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3 + m70Var.f26363o0 + m70Var.f26369u0, 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((sq0) this.f4612b).K.J.R, 1073741824));
                return;
            case 25:
                ax0 ax0Var = (ax0) this.f4612b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                jx0 jx0Var = ax0Var.d;
                int i20 = jx0Var.f25497g3;
                if (i20 > 0) {
                    i17 = AndroidUtilities.dp(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((ax0Var.h() - 1) * size2), ax0Var.d.X2 * size2)));
                jx0Var.f25496f3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 26:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
            case 29:
                r20 r20Var = (r20) this.f4612b;
                if (r20Var.H) {
                    r20Var.J = (r20.U(r20Var).getMeasuredHeight() + r20Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp4 = AndroidUtilities.dp(140.0f) + r20Var.I;
                    if (AndroidUtilities.dp(24.0f) + r20Var.f37054y.getMeasuredHeight() > dp4) {
                        dp4 = Math.max(dp4, (AndroidUtilities.dp(24.0f) + r20Var.f37054y.getMeasuredHeight()) - r20Var.L);
                    }
                    r20Var.J = dp4;
                }
                int i21 = (int) (r20Var.J - (0 * 2.5f));
                r20Var.J = i21;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f4611a) {
            case 27:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.j1) this.f4612b).f29376n.f29330f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f4611a) {
            case 10:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.d8) this.f4612b).f32975b.f33564x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 28:
                super.setAlpha(f7);
                View view2 = ((uy) this.f4612b).fragmentView;
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
        switch (this.f4611a) {
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
        switch (this.f4611a) {
            case 12:
                super.setTranslationY(f7);
                org.telegram.ui.Components.ab.r((org.telegram.ui.Components.ab) this.f4612b).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public eb(Object obj, Context context, int i10) {
        super(context);
        this.f4611a = i10;
        this.f4612b = obj;
    }

    public eb(org.telegram.ui.Components.ab abVar, Context context) {
        super(context);
        this.f4611a = 12;
        this.f4612b = abVar;
        setTag(-33024);
    }

    public eb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f4611a = 7;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, f6Var);
        this.f4612b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.f19510z5, org.telegram.ui.ActionBar.j6.f19238k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
