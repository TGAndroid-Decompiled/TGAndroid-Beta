package cg;

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
import jh.ia;
import nh.gb;
import nh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.a8;
import org.telegram.ui.b50;
import org.telegram.ui.d50;
import org.telegram.ui.et0;
import org.telegram.ui.fy;
import org.telegram.ui.hp0;
import org.telegram.ui.p5;
import org.telegram.ui.u7;
import org.telegram.ui.wn;
import org.telegram.ui.z10;
import org.telegram.ui.zi0;
public final class h0 extends View {
    public final int f3153a;
    public Object f3154b;

    public h0(Context context, int i10) {
        super(context);
        this.f3153a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3153a) {
            case 3:
                canvas.save();
                gb gbVar = (gb) this.f3154b;
                canvas.translate(gbVar.Y0.getX() + gbVar.f17761h0.getX(), gbVar.Y0.getY() + gbVar.f17761h0.getY());
                wa waVar = gbVar.Y0;
                waVar.k(canvas, waVar.getBounds(), gbVar.Y0.getOver2Alpha());
                canvas.restore();
                return;
            case 5:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((i3) this.f3154b).d);
                return;
            case 27:
                super.dispatchDraw(canvas);
                b50 b50Var = (b50) this.f3154b;
                if (b50Var != null && b50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3153a) {
            case 14:
                super.draw(canvas);
                ((zz0) this.f3154b).e(canvas, (getMeasuredWidth() - ((zz0) this.f3154b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 18:
                super.draw(canvas);
                dq0 dq0Var = (dq0) this.f3154b;
                dq0Var.S0.setBounds(0, (getMeasuredHeight() - dq0Var.C0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                dq0Var.S0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f3153a) {
            case 21:
                super.invalidate();
                ((hv0) this.f3154b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f3153a) {
            case 1:
                super.onAttachedToWindow();
                ih.d2 d2Var = (ih.d2) this.f3154b;
                if (d2Var != null && !d2Var.f9095i) {
                    d2Var.f9095i = true;
                    d2Var.a();
                    ag.i0 i0Var = new ag.i0(d2Var, 14);
                    d2Var.h = i0Var;
                    LiteMode.addOnPowerSaverAppliedListener(i0Var);
                    return;
                }
                return;
            case 27:
                super.onAttachedToWindow();
                b50 b50Var = (b50) this.f3154b;
                if (b50Var != null) {
                    b50Var.f36691g = this;
                    int i10 = 0;
                    while (true) {
                        d50[] d50VarArr = b50Var.f36688c;
                        if (i10 < d50VarArr.length) {
                            d50 d50Var = d50VarArr[i10];
                            d50Var.f37305i.add(this);
                            d50Var.a();
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3153a) {
            case 1:
                super.onDetachedFromWindow();
                ih.d2 d2Var = (ih.d2) this.f3154b;
                if (d2Var != null && d2Var.f9095i) {
                    d2Var.f9095i = false;
                    d2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(d2Var.h);
                    return;
                }
                return;
            case 27:
                super.onDetachedFromWindow();
                b50 b50Var = (b50) this.f3154b;
                if (b50Var != null && b50Var.f36691g != this) {
                    int i10 = 0;
                    while (true) {
                        d50[] d50VarArr = b50Var.f36688c;
                        if (i10 < d50VarArr.length) {
                            d50 d50Var = d50VarArr[i10];
                            d50Var.f37305i.remove(this);
                            d50Var.a();
                            i10++;
                        } else {
                            b50Var.f36691g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        boolean z10;
        float f9;
        float f10;
        float f11;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        Drawable drawable2;
        boolean z11;
        int i14;
        int i15;
        int height2;
        int i16 = 255;
        int i17 = 1;
        switch (this.f3153a) {
            case 0:
                super.onDraw(canvas);
                v0 v0Var = (v0) this.f3154b;
                if (v0Var.f3412l0 - v0Var.f3411k0 > 1) {
                    Paint T0 = g6.T0("paintDivider", v0.f0(v0Var));
                    if (T0 == null) {
                        T0 = g6.f23183k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.f3154b;
                p2Var.f24856f4.setBounds(0, 0, getWidth(), getHeight());
                p2Var.f24856f4.draw(canvas);
                return;
            case 13:
                ar arVar = (ar) this.f3154b;
                if (arVar.V) {
                    canvas.drawRect(ar.R(arVar), 0.0f, getMeasuredWidth() - ar.S(arVar), 1.0f, g6.f23183k0);
                    return;
                }
                return;
            case 17:
                super.onDraw(canvas);
                ((et0) this.f3154b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 20:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                op0 op0Var = (op0) this.f3154b;
                RectF rectF = op0Var.h;
                Paint paint = op0Var.f27556f;
                if (offsetColor != 0) {
                    paint.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                return;
            case 21:
                float f12 = 2.0f;
                hv0 hv0Var = (hv0) this.f3154b;
                if (hv0Var.f29238b != null && !hv0Var.F) {
                    Drawable newDrawable = hv0Var.getNewDrawable();
                    boolean newDrawableMotion = hv0Var.getNewDrawableMotion();
                    Drawable drawable3 = hv0Var.f29238b;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (g6.sl != null) {
                            hv0Var.d = drawable3;
                            hv0Var.f29243e = hv0Var.f29240c;
                        }
                        if (newDrawable instanceof yb0) {
                            ((yb0) newDrawable).r(hv0Var.H);
                        }
                        hv0Var.f29238b = newDrawable;
                        if (hv0Var.I && (newDrawable instanceof wn)) {
                            ((wn) newDrawable).f(this);
                        }
                        if (hv0Var.I) {
                            Drawable drawable4 = hv0Var.f29238b;
                            if (drawable4 instanceof yb0) {
                                ((yb0) drawable4).k();
                            }
                        }
                        hv0Var.f29240c = newDrawableMotion;
                        hv0Var.f29248h0 = 0.0f;
                        hv0Var.U(hv0Var.f29238b);
                        hv0Var.I();
                    } else if (hv0Var.f29240c != newDrawableMotion) {
                        hv0Var.f29240c = newDrawableMotion;
                        hv0Var.I();
                    }
                    hv0Var.f29248h0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + hv0Var.f29248h0, 1.0f, 0.0f);
                    int i18 = 0;
                    while (i18 < 2) {
                        if (i18 == 0) {
                            drawable = hv0Var.d;
                        } else {
                            drawable = hv0Var.f29238b;
                        }
                        if (drawable != null) {
                            if (i18 == i17 && hv0Var.d != null && hv0Var.C != null) {
                                drawable.setAlpha((int) (hv0Var.f29248h0 * 255.0f));
                            } else {
                                drawable.setAlpha(i16);
                            }
                            if (i18 == 0) {
                                z10 = hv0Var.f29243e;
                            } else {
                                z10 = hv0Var.f29240c;
                            }
                            if (z10) {
                                f9 = hv0Var.f29261y;
                                f10 = hv0Var.f29259w;
                                f11 = hv0Var.f29260x;
                            } else {
                                f9 = 1.0f;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                            if (drawable instanceof yb0) {
                                yb0 yb0Var = (yb0) drawable;
                                if (yb0Var.f35036u != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (hv0Var.P()) {
                                        i14 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                                    } else {
                                        i14 = 0;
                                    }
                                    if (hv0Var.Q() && hv0Var.f29258s) {
                                        i15 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i15 = 0;
                                    }
                                    int i19 = i14 + i15;
                                    if (hv0Var.Y()) {
                                        height2 = getRootView().getMeasuredHeight() - i19;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max * f9);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max * f9);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i20 = ((height2 - ceil2) / 2) + hv0Var.A + i19 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i19, ceil, getMeasuredHeight() - hv0Var.h);
                                    drawable.setBounds(measuredWidth, i20, ceil + measuredWidth, ceil2 + i20);
                                    drawable.draw(canvas);
                                    hv0.H(hv0Var, canvas);
                                    canvas.restore();
                                } else {
                                    if (hv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - hv0Var.h);
                                    }
                                    yb0Var.f35022f = hv0Var.A;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - hv0Var.A) + f11));
                                    drawable.draw(canvas);
                                    if (hv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else if (drawable instanceof ColorDrawable) {
                                if (hv0Var.h != 0) {
                                    canvas.save();
                                    i13 = 0;
                                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - hv0Var.h);
                                } else {
                                    i13 = 0;
                                }
                                drawable.setBounds(i13, i13, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                drawable.draw(canvas);
                                hv0.H(hv0Var, canvas);
                                if (hv0Var.h != 0) {
                                    canvas.restore();
                                }
                            } else if (drawable instanceof GradientDrawable) {
                                if (hv0Var.h != 0) {
                                    canvas.save();
                                    i12 = 0;
                                    canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - hv0Var.h);
                                } else {
                                    i12 = 0;
                                }
                                drawable.setBounds(i12, hv0Var.A, getMeasuredWidth(), getRootView().getMeasuredHeight() + hv0Var.A);
                                drawable.draw(canvas);
                                hv0.H(hv0Var, canvas);
                                if (hv0Var.h != 0) {
                                    canvas.restore();
                                }
                            } else {
                                if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f13 = f12 / AndroidUtilities.density;
                                        canvas.scale(f13, f13);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f13), (int) Math.ceil(getRootView().getMeasuredHeight() / f13));
                                        drawable.draw(canvas);
                                        hv0.H(hv0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (hv0Var.P()) {
                                            i10 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (hv0Var.Q() && hv0Var.f29258s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i21 = i10 + i11;
                                        if (hv0Var.Y()) {
                                            height = getRootView().getMeasuredHeight() - i21;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f9);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f9);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i22 = ((height - ceil4) / 2) + hv0Var.A + i21 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i21, ceil3, getMeasuredHeight() - hv0Var.h);
                                        drawable.setBounds(measuredWidth2, i22, ceil3 + measuredWidth2, ceil4 + i22);
                                        drawable.draw(canvas);
                                        hv0.H(hv0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (hv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - hv0Var.h);
                                    }
                                    if (drawable instanceof wn) {
                                        wn wnVar = (wn) drawable;
                                        wnVar.f44330b = this;
                                        yb0 yb0Var2 = wnVar.f44333f;
                                        if (yb0Var2 != null) {
                                            yb0Var2.r(this);
                                        }
                                    }
                                    float f14 = f9 - 1.0f;
                                    float d = a4.w.d(-getMeasuredWidth(), f14, 2.0f, f10);
                                    float d10 = a4.w.d(-getRootView().getMeasuredHeight(), f14, 2.0f, f11);
                                    drawable.setBounds((int) d, (int) (hv0Var.A + d10), (int) ((getMeasuredWidth() * f9) + d), (int) com.google.android.recaptcha.internal.a.d(getRootView().getMeasuredHeight(), f9, hv0Var.A, d10));
                                    drawable.draw(canvas);
                                    hv0.H(hv0Var, canvas);
                                    if (hv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                                if (i18 != 0 && (drawable2 = hv0Var.d) != null && hv0Var.f29248h0 >= 1.0f) {
                                    if (hv0Var.I && (drawable2 instanceof wn)) {
                                        ((wn) drawable2).g(hv0Var.H);
                                    }
                                    if (hv0Var.I) {
                                        Drawable drawable5 = hv0Var.d;
                                        if (drawable5 instanceof yb0) {
                                            ((yb0) drawable5).l();
                                        }
                                    }
                                    hv0Var.d = null;
                                    hv0Var.f29243e = false;
                                    hv0Var.I();
                                    hv0Var.H.invalidate();
                                }
                            }
                            if (i18 != 0) {
                            }
                        }
                        i18++;
                        i16 = 255;
                        i17 = 1;
                        f12 = 2.0f;
                    }
                    if (hv0Var.f29248h0 != 1.0f) {
                        hv0Var.H.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                super.onDraw(canvas);
                int w02 = g6.w0(null, g6.Vi, false);
                xx0 xx0Var = (xx0) this.f3154b;
                org.telegram.ui.Components.voip.h hVar = xx0Var.H;
                Paint paint2 = xx0Var.f34841a;
                paint2.setColor(w02);
                Paint paint3 = xx0Var.f34842b;
                paint3.setColor(w02);
                Paint paint4 = xx0Var.f34843c;
                paint4.setColor(w02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = xx0Var.d;
                paint5.setColor(g6.w0(null, g6.f23062d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint2);
                boolean z12 = xx0Var.f34844e;
                if (z12 || xx0Var.F != 0.0f) {
                    if (z12) {
                        if (xx0Var.G) {
                            float f15 = xx0Var.F + 0.024615385f;
                            xx0Var.F = f15;
                            if (f15 > 1.0f) {
                                xx0Var.F = 1.0f;
                                xx0Var.G = false;
                            }
                        } else {
                            float f16 = xx0Var.F - 0.024615385f;
                            xx0Var.F = f16;
                            if (f16 < 0.0f) {
                                xx0Var.F = 0.0f;
                                xx0Var.G = true;
                            }
                        }
                    } else {
                        float f17 = xx0Var.F - 0.10666667f;
                        xx0Var.F = f17;
                        if (f17 < 0.0f) {
                            xx0Var.F = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f33720f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp = AndroidUtilities.dp(24.0f);
                if (!xx0Var.f34844e) {
                    int z13 = (int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * xx0Var.B);
                    int dp2 = AndroidUtilities.dp(24.0f) + z13;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + z13, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                }
                if (!xx0Var.f34844e) {
                    int z14 = (int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * xx0Var.A);
                    if (z14 < AndroidUtilities.dp(1.0f)) {
                        z14 = AndroidUtilities.dp(1.0f);
                    }
                    int dp3 = AndroidUtilities.dp(24.0f) + z14;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + z14, AndroidUtilities.dp(20.0f), paint3);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                    return;
                }
                return;
            case 24:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.h1) this.f3154b).f33736n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
                    invalidate();
                    return;
                }
                return;
            case 28:
                canvas.drawColor(((zi0) this.f3154b).getThemedColor(g6.f23081e7));
                return;
            case 29:
                hp0 hp0Var = (hp0) this.f3154b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, hp0Var.f38986c.size())));
                int ceil5 = (int) Math.ceil(hp0Var.O.measureText(format));
                int max3 = Math.max(AndroidUtilities.dp(16.0f) + ceil5, AndroidUtilities.dp(24.0f));
                int measuredWidth3 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                hp0Var.O.setColor(g6.w0(null, g6.C5, false));
                hp0Var.Q.setColor(g6.w0(null, g6.f23133h5, false));
                int i23 = max3 / 2;
                int i24 = measuredWidth3 - i23;
                int i25 = i23 + measuredWidth3;
                hp0Var.P.set(i24, 0.0f, i25, getMeasuredHeight());
                canvas.drawRoundRect(hp0Var.P, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), hp0Var.Q);
                hp0Var.Q.setColor(g6.w0(null, g6.B5, false));
                hp0Var.P.set(AndroidUtilities.dp(2.0f) + i24, AndroidUtilities.dp(2.0f), i25 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(hp0Var.P, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), hp0Var.Q);
                canvas.drawText(format, measuredWidth3 - (ceil5 / 2), AndroidUtilities.dp(16.2f), hp0Var.O);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f3153a) {
            case 2:
                ia iaVar = (ia) this.f3154b;
                if (iaVar.D) {
                    int i17 = iaVar.E;
                    lVar = ((org.telegram.ui.ActionBar.o2) iaVar).actionBar;
                    i12 = (lVar.getMeasuredHeight() + i17) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + iaVar.E;
                    if (AndroidUtilities.dp(24.0f) + iaVar.f45023y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + iaVar.f45023y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 3:
            case 7:
            case 8:
            case 13:
            case 17:
            case 18:
            case 20:
            case 21:
            case 24:
            case 25:
            default:
                super.onMeasure(i10, i11);
                return;
            case 4:
                oh.g gVar = (oh.g) this.f3154b;
                if (gVar.D) {
                    i13 = (oh.g.y0(gVar).getMeasuredHeight() + gVar.E) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.E;
                    if (AndroidUtilities.dp(24.0f) + gVar.f45023y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.f45023y.getMeasuredHeight();
                    }
                    i13 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 5:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                return;
            case 6:
                f2.j0 j0Var = ((p5) this.f3154b).d.B;
                if (j0Var instanceof kz) {
                    i14 = ((kz) j0Var).J;
                } else {
                    i14 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i14), 1073741824));
                return;
            case 9:
                xa xaVar = (xa) this.f3154b;
                int i18 = xaVar.h;
                if (i18 == 0) {
                    i15 = AndroidUtilities.dp(300.0f);
                } else {
                    i15 = (int) (i18 * xaVar.v);
                }
                int i19 = i15 - (((xaVar.C - xaVar.D) - xaVar.E) - xaVar.F);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((cm) this.f3154b).v.F, 1073741824));
                return;
            case 11:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((mn) this.f3154b).d.N0);
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((pn) ((u7) this.f3154b).d).f31716w, 1073741824));
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((zz0) this.f3154b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((zz0) this.f3154b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 15:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((r60) this.f3154b).f32226c.f34614k0, 1073741824));
                return;
            case 16:
                int dp3 = AndroidUtilities.dp(48.0f);
                x60 x60Var = ((t60) this.f3154b).f32882n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3 + x60Var.f34614k0 + x60Var.f34619q0, 1073741824));
                return;
            case 19:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((zp0) this.f3154b).G.F.R, 1073741824));
                return;
            case 22:
                fw0 fw0Var = (fw0) this.f3154b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                ow0 ow0Var = fw0Var.d;
                int i20 = ow0Var.c3;
                if (i20 > 0) {
                    i16 = AndroidUtilities.dp(4.0f) + i20;
                } else {
                    i16 = 0;
                }
                int max = Math.max(i16, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((fw0Var.h() - 1) * size2), fw0Var.d.T2 * size2)));
                ow0Var.f31491b3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 23:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
            case 26:
                z10 z10Var = (z10) this.f3154b;
                if (z10Var.D) {
                    int i21 = z10Var.E;
                    lVar2 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
                    z10Var.F = (lVar2.getMeasuredHeight() + i21) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp4 = AndroidUtilities.dp(140.0f) + z10Var.E;
                    if (AndroidUtilities.dp(24.0f) + z10Var.f45023y.getMeasuredHeight() > dp4) {
                        dp4 = Math.max(dp4, (AndroidUtilities.dp(24.0f) + z10Var.f45023y.getMeasuredHeight()) - z10Var.H);
                    }
                    z10Var.F = dp4;
                }
                int i22 = (int) (z10Var.F - (0 * 2.5f));
                z10Var.F = i22;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i22, 1073741824));
                return;
            case 27:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f3153a) {
            case 24:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.h1) this.f3154b).f33736n.f33720f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f3153a) {
            case 7:
                super.setAlpha(f9);
                View view = ((a8) this.f3154b).f36452b.f37036x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 25:
                super.setAlpha(f9);
                View view2 = ((fy) this.f3154b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        switch (this.f3153a) {
            case 1:
                if (((ih.d2) this.f3154b) != null) {
                    if (isAttachedToWindow()) {
                        ih.d2 d2Var = (ih.d2) this.f3154b;
                        if (d2Var.f9095i) {
                            d2Var.f9095i = false;
                            d2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(d2Var.h);
                        }
                    }
                    this.f3154b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof ih.d2) {
                    this.f3154b = (ih.d2) drawable;
                    if (isAttachedToWindow()) {
                        ih.d2 d2Var2 = (ih.d2) this.f3154b;
                        if (!d2Var2.f9095i) {
                            d2Var2.f9095i = true;
                            d2Var2.a();
                            ag.i0 i0Var = new ag.i0(d2Var2, 14);
                            d2Var2.h = i0Var;
                            LiteMode.addOnPowerSaverAppliedListener(i0Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setBackground(drawable);
                return;
        }
    }

    @Override
    public void setTranslationX(float f9) {
        switch (this.f3153a) {
            case 20:
                super.setTranslationX(f9);
                invalidate();
                return;
            default:
                super.setTranslationX(f9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f3153a) {
            case 9:
                super.setTranslationY(f9);
                xa.r((xa) this.f3154b).invalidate();
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    public h0(Object obj, Context context, int i10) {
        super(context);
        this.f3153a = i10;
        this.f3154b = obj;
    }

    public h0(xa xaVar, Context context) {
        super(context);
        this.f3153a = 9;
        this.f3154b = xaVar;
        setTag(-33024);
    }

    public h0(Context context, b50 b50Var) {
        super(context);
        this.f3153a = 27;
        this.f3154b = b50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new fi0(28, this, context));
    }
}
