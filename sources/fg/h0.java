package fg;

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
import mh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yp0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ao;
import org.telegram.ui.e8;
import org.telegram.ui.hq0;
import org.telegram.ui.ij0;
import org.telegram.ui.m20;
import org.telegram.ui.o50;
import org.telegram.ui.pt0;
import org.telegram.ui.py;
import org.telegram.ui.q50;
import org.telegram.ui.r5;
import org.telegram.ui.rp0;
import org.telegram.ui.y7;
public final class h0 extends View {
    public final int f6321a;
    public Object f6322b;

    public h0(Context context, int i10) {
        super(context);
        this.f6321a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f6321a) {
            case 3:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((k3) this.f6322b).d);
                return;
            case 25:
                super.dispatchDraw(canvas);
                o50 o50Var = (o50) this.f6322b;
                if (o50Var != null && o50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f6321a) {
            case 12:
                super.draw(canvas);
                ((l01) this.f6322b).e(canvas, (getMeasuredWidth() - ((l01) this.f6322b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 16:
                super.draw(canvas);
                mq0 mq0Var = (mq0) this.f6322b;
                mq0Var.T0.setBounds(0, (getMeasuredHeight() - mq0Var.D0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                mq0Var.T0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f6321a) {
            case 19:
                super.invalidate();
                ((qv0) this.f6322b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f6321a) {
            case 1:
                super.onAttachedToWindow();
                lh.c2 c2Var = (lh.c2) this.f6322b;
                if (c2Var != null && !c2Var.f12649i) {
                    c2Var.f12649i = true;
                    c2Var.a();
                    dg.h0 h0Var = new dg.h0(c2Var, 14);
                    c2Var.h = h0Var;
                    LiteMode.addOnPowerSaverAppliedListener(h0Var);
                    return;
                }
                return;
            case 25:
                super.onAttachedToWindow();
                o50 o50Var = (o50) this.f6322b;
                if (o50Var != null) {
                    o50Var.f39594g = this;
                    int i10 = 0;
                    while (true) {
                        q50[] q50VarArr = o50Var.f39591c;
                        if (i10 < q50VarArr.length) {
                            q50 q50Var = q50VarArr[i10];
                            q50Var.f40346i.add(this);
                            q50Var.a();
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
        switch (this.f6321a) {
            case 1:
                super.onDetachedFromWindow();
                lh.c2 c2Var = (lh.c2) this.f6322b;
                if (c2Var != null && c2Var.f12649i) {
                    c2Var.f12649i = false;
                    c2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(c2Var.h);
                    return;
                }
                return;
            case 25:
                super.onDetachedFromWindow();
                o50 o50Var = (o50) this.f6322b;
                if (o50Var != null && o50Var.f39594g != this) {
                    int i10 = 0;
                    while (true) {
                        q50[] q50VarArr = o50Var.f39591c;
                        if (i10 < q50VarArr.length) {
                            q50 q50Var = q50VarArr[i10];
                            q50Var.f40346i.remove(this);
                            q50Var.a();
                            i10++;
                        } else {
                            o50Var.f39594g = null;
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
        boolean z4;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        int i11;
        int height;
        Drawable drawable2;
        boolean z10;
        int i12;
        int i13;
        int height2;
        int i14 = 255;
        int i15 = 1;
        switch (this.f6321a) {
            case 0:
                super.onDraw(canvas);
                v0 v0Var = (v0) this.f6322b;
                if (v0Var.m0 - v0Var.f6592l0 > 1) {
                    Paint T0 = k6.T0("paintDivider", v0.f0(v0Var));
                    if (T0 == null) {
                        T0 = k6.f21779k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.f6322b;
                r2Var.f23444g4.setBounds(0, 0, getWidth(), getHeight());
                r2Var.f23444g4.draw(canvas);
                return;
            case 11:
                gr grVar = (gr) this.f6322b;
                if (grVar.W) {
                    canvas.drawRect(gr.R(grVar), 0.0f, getMeasuredWidth() - gr.S(grVar), 1.0f, k6.f21779k0);
                    return;
                }
                return;
            case 15:
                super.onDraw(canvas);
                ((pt0) this.f6322b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 18:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                yp0 yp0Var = (yp0) this.f6322b;
                RectF rectF = yp0Var.h;
                Paint paint = yp0Var.f28807f;
                if (offsetColor != 0) {
                    paint.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                return;
            case 19:
                float f14 = 2.0f;
                qv0 qv0Var = (qv0) this.f6322b;
                if (qv0Var.f30489b != null && !qv0Var.G) {
                    Drawable newDrawable = qv0Var.getNewDrawable();
                    boolean newDrawableMotion = qv0Var.getNewDrawableMotion();
                    Drawable drawable3 = qv0Var.f30489b;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (k6.sl != null) {
                            qv0Var.d = drawable3;
                            qv0Var.f30494e = qv0Var.f30491c;
                        }
                        if (newDrawable instanceof fc0) {
                            ((fc0) newDrawable).r(qv0Var.I);
                        }
                        qv0Var.f30489b = newDrawable;
                        if (qv0Var.J && (newDrawable instanceof ao)) {
                            ((ao) newDrawable).f(this);
                        }
                        if (qv0Var.J) {
                            Drawable drawable4 = qv0Var.f30489b;
                            if (drawable4 instanceof fc0) {
                                ((fc0) drawable4).k();
                            }
                        }
                        qv0Var.f30491c = newDrawableMotion;
                        qv0Var.f30500i0 = 0.0f;
                        qv0Var.U(qv0Var.f30489b);
                        qv0Var.I();
                    } else if (qv0Var.f30491c != newDrawableMotion) {
                        qv0Var.f30491c = newDrawableMotion;
                        qv0Var.I();
                    }
                    qv0Var.f30500i0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + qv0Var.f30500i0, 1.0f, 0.0f);
                    int i16 = 0;
                    while (i16 < 2) {
                        if (i16 == 0) {
                            drawable = qv0Var.d;
                        } else {
                            drawable = qv0Var.f30489b;
                        }
                        if (drawable != null) {
                            if (i16 == i15 && qv0Var.d != null && qv0Var.D != null) {
                                drawable.setAlpha((int) (qv0Var.f30500i0 * 255.0f));
                            } else {
                                drawable.setAlpha(i14);
                            }
                            if (i16 == 0) {
                                z4 = qv0Var.f30494e;
                            } else {
                                z4 = qv0Var.f30491c;
                            }
                            if (z4) {
                                f10 = qv0Var.f30513y;
                                f11 = qv0Var.f30511w;
                                f12 = qv0Var.f30512x;
                            } else {
                                f10 = 1.0f;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                            if (drawable instanceof fc0) {
                                fc0 fc0Var = (fc0) drawable;
                                if (fc0Var.f26889u != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    if (qv0Var.P()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (qv0Var.Q() && qv0Var.f30510s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i17 = i12 + i13;
                                    if (qv0Var.Y()) {
                                        height2 = getRootView().getMeasuredHeight() - i17;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max * f10);
                                    f13 = 1.0f;
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i18 = ((height2 - ceil2) / 2) + qv0Var.B + i17 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, i17, ceil, getMeasuredHeight() - qv0Var.h);
                                    drawable.setBounds(measuredWidth, i18, ceil + measuredWidth, ceil2 + i18);
                                    drawable.draw(canvas);
                                    qv0.H(qv0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = 1.0f;
                                    if (qv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qv0Var.h);
                                    }
                                    fc0Var.f26875f = qv0Var.B;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - qv0Var.B) + f12));
                                    drawable.draw(canvas);
                                    if (qv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = 1.0f;
                                if (drawable instanceof ColorDrawable) {
                                    if (qv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - qv0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    qv0.H(qv0Var, canvas);
                                    if (qv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (qv0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qv0Var.h);
                                    }
                                    drawable.setBounds(0, qv0Var.B, getMeasuredWidth(), getRootView().getMeasuredHeight() + qv0Var.B);
                                    drawable.draw(canvas);
                                    qv0.H(qv0Var, canvas);
                                    if (qv0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else {
                                    if (drawable instanceof BitmapDrawable) {
                                        if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                            canvas.save();
                                            float f15 = f14 / AndroidUtilities.density;
                                            canvas.scale(f15, f15);
                                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f15), (int) Math.ceil(getRootView().getMeasuredHeight() / f15));
                                            drawable.draw(canvas);
                                            qv0.H(qv0Var, canvas);
                                            canvas.restore();
                                        } else {
                                            if (qv0Var.P()) {
                                                i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                            } else {
                                                i10 = 0;
                                            }
                                            if (qv0Var.Q() && qv0Var.f30510s) {
                                                i11 = AndroidUtilities.statusBarHeight;
                                            } else {
                                                i11 = 0;
                                            }
                                            int i19 = i10 + i11;
                                            if (qv0Var.Y()) {
                                                height = getRootView().getMeasuredHeight() - i19;
                                            } else {
                                                height = getHeight();
                                            }
                                            float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                            int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f10);
                                            int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f10);
                                            int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                            int i20 = ((height - ceil4) / 2) + qv0Var.B + i19 + ((int) f12);
                                            canvas.save();
                                            canvas.clipRect(0, i19, ceil3, getMeasuredHeight() - qv0Var.h);
                                            drawable.setBounds(measuredWidth2, i20, ceil3 + measuredWidth2, ceil4 + i20);
                                            drawable.draw(canvas);
                                            qv0.H(qv0Var, canvas);
                                            canvas.restore();
                                        }
                                    } else {
                                        if (qv0Var.h != 0) {
                                            canvas.save();
                                            canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qv0Var.h);
                                        }
                                        if (drawable instanceof ao) {
                                            ao aoVar = (ao) drawable;
                                            aoVar.f35216b = this;
                                            fc0 fc0Var2 = aoVar.f35219f;
                                            if (fc0Var2 != null) {
                                                fc0Var2.r(this);
                                            }
                                        }
                                        float f16 = f10 - 1.0f;
                                        float d = android.support.v4.media.a.d(-getMeasuredWidth(), f16, 2.0f, f11);
                                        float d10 = android.support.v4.media.a.d(-getRootView().getMeasuredHeight(), f16, 2.0f, f12);
                                        drawable.setBounds((int) d, (int) (qv0Var.B + d10), (int) ((getMeasuredWidth() * f10) + d), (int) e2.c.A(getRootView().getMeasuredHeight(), f10, qv0Var.B, d10));
                                        drawable.draw(canvas);
                                        qv0.H(qv0Var, canvas);
                                        if (qv0Var.h != 0) {
                                            canvas.restore();
                                        }
                                    }
                                    if (i16 != 0 && (drawable2 = qv0Var.d) != null && qv0Var.f30500i0 >= f13) {
                                        if (qv0Var.J && (drawable2 instanceof ao)) {
                                            ((ao) drawable2).g(qv0Var.I);
                                        }
                                        if (qv0Var.J) {
                                            Drawable drawable5 = qv0Var.d;
                                            if (drawable5 instanceof fc0) {
                                                ((fc0) drawable5).l();
                                            }
                                        }
                                        qv0Var.d = null;
                                        qv0Var.f30494e = false;
                                        qv0Var.I();
                                        qv0Var.I.invalidate();
                                    }
                                }
                            }
                            if (i16 != 0) {
                            }
                        }
                        i16++;
                        i14 = 255;
                        i15 = 1;
                        f14 = 2.0f;
                    }
                    if (qv0Var.f30500i0 != 1.0f) {
                        qv0Var.I.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onDraw(canvas);
                int w02 = k6.w0(null, k6.Vi, false);
                iy0 iy0Var = (iy0) this.f6322b;
                org.telegram.ui.Components.voip.h hVar = iy0Var.I;
                Paint paint2 = iy0Var.f27921a;
                paint2.setColor(w02);
                Paint paint3 = iy0Var.f27922b;
                paint3.setColor(w02);
                Paint paint4 = iy0Var.f27923c;
                paint4.setColor(w02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = iy0Var.d;
                paint5.setColor(k6.w0(null, k6.f21659d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint2);
                boolean z11 = iy0Var.f27924e;
                if (z11 || iy0Var.G != 0.0f) {
                    if (z11) {
                        if (iy0Var.H) {
                            float f17 = iy0Var.G + 0.024615385f;
                            iy0Var.G = f17;
                            if (f17 > 1.0f) {
                                iy0Var.G = 1.0f;
                                iy0Var.H = false;
                            }
                        } else {
                            float f18 = iy0Var.G - 0.024615385f;
                            iy0Var.G = f18;
                            if (f18 < 0.0f) {
                                iy0Var.G = 0.0f;
                                iy0Var.H = true;
                            }
                        }
                    } else {
                        float f19 = iy0Var.G - 0.10666667f;
                        iy0Var.G = f19;
                        if (f19 < 0.0f) {
                            iy0Var.G = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f32055f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp = AndroidUtilities.dp(24.0f);
                if (!iy0Var.f27924e) {
                    int z12 = (int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * iy0Var.C);
                    int dp2 = AndroidUtilities.dp(24.0f) + z12;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + z12, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                }
                if (!iy0Var.f27924e) {
                    int z13 = (int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * iy0Var.B);
                    if (z13 < AndroidUtilities.dp(1.0f)) {
                        z13 = AndroidUtilities.dp(1.0f);
                    }
                    int dp3 = AndroidUtilities.dp(24.0f) + z13;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + z13, AndroidUtilities.dp(20.0f), paint3);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                    return;
                }
                return;
            case 22:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.h1) this.f6322b).f32072n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
                    invalidate();
                    return;
                }
                return;
            case 26:
                canvas.drawColor(((ij0) this.f6322b).getThemedColor(k6.f21678e7));
                return;
            case 27:
                rp0 rp0Var = (rp0) this.f6322b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, rp0Var.f41026c.size())));
                int ceil5 = (int) Math.ceil(rp0Var.P.measureText(format));
                int max3 = Math.max(AndroidUtilities.dp(16.0f) + ceil5, AndroidUtilities.dp(24.0f));
                int measuredWidth3 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                rp0Var.P.setColor(k6.w0(null, k6.C5, false));
                rp0Var.R.setColor(k6.w0(null, k6.f21731h5, false));
                int i21 = max3 / 2;
                int i22 = measuredWidth3 - i21;
                int i23 = i21 + measuredWidth3;
                rp0Var.Q.set(i22, 0.0f, i23, getMeasuredHeight());
                canvas.drawRoundRect(rp0Var.Q, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), rp0Var.R);
                rp0Var.R.setColor(k6.w0(null, k6.B5, false));
                rp0Var.Q.set(AndroidUtilities.dp(2.0f) + i22, AndroidUtilities.dp(2.0f), i23 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(rp0Var.Q, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), rp0Var.R);
                canvas.drawText(format, measuredWidth3 - (ceil5 / 2), AndroidUtilities.dp(16.2f), rp0Var.P);
                return;
            case 28:
                hq0 hq0Var = (hq0) this.f6322b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, hq0Var.f37575c.size())));
                int ceil6 = (int) Math.ceil(hq0Var.f37579e0.measureText(format2));
                int max4 = Math.max(AndroidUtilities.dp(16.0f) + ceil6, AndroidUtilities.dp(24.0f));
                int measuredWidth4 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                hq0Var.f37579e0.setColor(k6.w0(null, k6.C5, false));
                hq0Var.f37582g0.setColor(k6.w0(null, hq0Var.f37594r0, false));
                int i24 = max4 / 2;
                int i25 = measuredWidth4 - i24;
                int i26 = i24 + measuredWidth4;
                hq0Var.f37581f0.set(i25, 0.0f, i26, getMeasuredHeight());
                canvas.drawRoundRect(hq0Var.f37581f0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), hq0Var.f37582g0);
                hq0Var.f37582g0.setColor(k6.w0(null, k6.B5, false));
                hq0Var.f37581f0.set(AndroidUtilities.dp(2.0f) + i25, AndroidUtilities.dp(2.0f), i26 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(hq0Var.f37581f0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), hq0Var.f37582g0);
                canvas.drawText(format2, measuredWidth4 - (ceil6 / 2), AndroidUtilities.dp(16.2f), hq0Var.f37579e0);
                return;
            case 29:
                ((PhotoViewer) this.f6322b).f34341n3.a(canvas, this);
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
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f6321a) {
            case 2:
                ja jaVar = (ja) this.f6322b;
                if (jaVar.E) {
                    i12 = (ja.C0(jaVar).getMeasuredHeight() + jaVar.F) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + jaVar.F;
                    if (AndroidUtilities.dp(24.0f) + jaVar.f38949y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + jaVar.f38949y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 3:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                return;
            case 4:
                f2.j0 j0Var = ((r5) this.f6322b).d.C;
                if (j0Var instanceof rz) {
                    i13 = ((rz) j0Var).J;
                } else {
                    i13 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i13), 1073741824));
                return;
            case 5:
            case 6:
            case 11:
            case 15:
            case 16:
            case 18:
            case 19:
            case 22:
            case 23:
            default:
                super.onMeasure(i10, i11);
                return;
            case 7:
                sa saVar = (sa) this.f6322b;
                int i16 = saVar.h;
                if (i16 == 0) {
                    i14 = AndroidUtilities.dp(300.0f);
                } else {
                    i14 = (int) (i16 * saVar.v);
                }
                int i17 = i14 - (((saVar.D - saVar.E) - saVar.F) - saVar.G);
                if (i17 < 1) {
                    i17 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((fm) this.f6322b).v.G, 1073741824));
                return;
            case 9:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((qn) this.f6322b).d.O0);
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((tn) ((y7) this.f6322b).d).f31416w, 1073741824));
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((l01) this.f6322b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((l01) this.f6322b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((y60) this.f6322b).f33382c.f26467l0, 1073741824));
                return;
            case 14:
                int dp2 = AndroidUtilities.dp(48.0f);
                e70 e70Var = ((a70) this.f6322b).f25175n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp2 + e70Var.f26467l0 + e70Var.f26472r0, 1073741824));
                return;
            case 17:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((iq0) this.f6322b).H.G.R, 1073741824));
                return;
            case 20:
                pw0 pw0Var = (pw0) this.f6322b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                yw0 yw0Var = pw0Var.d;
                int i18 = yw0Var.f33596d3;
                if (i18 > 0) {
                    i15 = AndroidUtilities.dp(4.0f) + i18;
                } else {
                    i15 = 0;
                }
                int max = Math.max(i15, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((pw0Var.h() - 1) * size2), pw0Var.d.U2 * size2)));
                yw0Var.c3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 21:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
            case 24:
                m20 m20Var = (m20) this.f6322b;
                if (m20Var.E) {
                    int i19 = m20Var.F;
                    kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
                    m20Var.G = (kVar.getMeasuredHeight() + i19) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + m20Var.F;
                    if (AndroidUtilities.dp(24.0f) + m20Var.f38949y.getMeasuredHeight() > dp3) {
                        dp3 = Math.max(dp3, (AndroidUtilities.dp(24.0f) + m20Var.f38949y.getMeasuredHeight()) - m20Var.I);
                    }
                    m20Var.G = dp3;
                }
                int i20 = (int) (m20Var.G - (0 * 2.5f));
                m20Var.G = i20;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                return;
            case 25:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f6321a) {
            case 22:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.h1) this.f6322b).f32072n.f32055f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f6321a) {
            case 5:
                super.setAlpha(f10);
                View view = ((e8) this.f6322b).f36417b.f37119x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 23:
                super.setAlpha(f10);
                View view2 = ((py) this.f6322b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        switch (this.f6321a) {
            case 1:
                if (((lh.c2) this.f6322b) != null) {
                    if (isAttachedToWindow()) {
                        lh.c2 c2Var = (lh.c2) this.f6322b;
                        if (c2Var.f12649i) {
                            c2Var.f12649i = false;
                            c2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(c2Var.h);
                        }
                    }
                    this.f6322b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof lh.c2) {
                    this.f6322b = (lh.c2) drawable;
                    if (isAttachedToWindow()) {
                        lh.c2 c2Var2 = (lh.c2) this.f6322b;
                        if (!c2Var2.f12649i) {
                            c2Var2.f12649i = true;
                            c2Var2.a();
                            dg.h0 h0Var = new dg.h0(c2Var2, 14);
                            c2Var2.h = h0Var;
                            LiteMode.addOnPowerSaverAppliedListener(h0Var);
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
    public void setTranslationX(float f10) {
        switch (this.f6321a) {
            case 18:
                super.setTranslationX(f10);
                invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f6321a) {
            case 7:
                super.setTranslationY(f10);
                sa.r((sa) this.f6322b).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public h0(Object obj, Context context, int i10) {
        super(context);
        this.f6321a = i10;
        this.f6322b = obj;
    }

    public h0(sa saVar, Context context) {
        super(context);
        this.f6321a = 7;
        this.f6322b = saVar;
        setTag(-33024);
    }

    public h0(Context context, o50 o50Var) {
        super(context);
        this.f6321a = 25;
        this.f6322b = o50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new sx0(25, this, context));
    }
}
