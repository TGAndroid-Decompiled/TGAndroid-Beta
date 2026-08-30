package eg;

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
import lh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ao;
import org.telegram.ui.e8;
import org.telegram.ui.fq0;
import org.telegram.ui.hj0;
import org.telegram.ui.l20;
import org.telegram.ui.n50;
import org.telegram.ui.nt0;
import org.telegram.ui.oy;
import org.telegram.ui.p50;
import org.telegram.ui.pp0;
import org.telegram.ui.r5;
import org.telegram.ui.y7;
public final class h0 extends View {
    public final int f5296a;
    public Object f5297b;

    public h0(Context context, int i10) {
        super(context);
        this.f5296a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5296a) {
            case 3:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((j3) this.f5297b).d);
                return;
            case 25:
                super.dispatchDraw(canvas);
                n50 n50Var = (n50) this.f5297b;
                if (n50Var != null && n50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f5296a) {
            case 12:
                super.draw(canvas);
                ((k01) this.f5297b).e(canvas, (getMeasuredWidth() - ((k01) this.f5297b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 16:
                super.draw(canvas);
                lq0 lq0Var = (lq0) this.f5297b;
                lq0Var.T0.setBounds(0, (getMeasuredHeight() - lq0Var.D0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                lq0Var.T0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f5296a) {
            case 19:
                super.invalidate();
                ((qv0) this.f5297b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f5296a) {
            case 1:
                super.onAttachedToWindow();
                kh.d2 d2Var = (kh.d2) this.f5297b;
                if (d2Var != null && !d2Var.f10532i) {
                    d2Var.f10532i = true;
                    d2Var.a();
                    cg.h0 h0Var = new cg.h0(d2Var, 14);
                    d2Var.h = h0Var;
                    LiteMode.addOnPowerSaverAppliedListener(h0Var);
                    return;
                }
                return;
            case 25:
                super.onAttachedToWindow();
                n50 n50Var = (n50) this.f5297b;
                if (n50Var != null) {
                    n50Var.f36454g = this;
                    int i10 = 0;
                    while (true) {
                        p50[] p50VarArr = n50Var.f36452c;
                        if (i10 < p50VarArr.length) {
                            p50 p50Var = p50VarArr[i10];
                            p50Var.f37190i.add(this);
                            p50Var.a();
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
        switch (this.f5296a) {
            case 1:
                super.onDetachedFromWindow();
                kh.d2 d2Var = (kh.d2) this.f5297b;
                if (d2Var != null && d2Var.f10532i) {
                    d2Var.f10532i = false;
                    d2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(d2Var.h);
                    return;
                }
                return;
            case 25:
                super.onDetachedFromWindow();
                n50 n50Var = (n50) this.f5297b;
                if (n50Var != null && n50Var.f36454g != this) {
                    int i10 = 0;
                    while (true) {
                        p50[] p50VarArr = n50Var.f36452c;
                        if (i10 < p50VarArr.length) {
                            p50 p50Var = p50VarArr[i10];
                            p50Var.f37190i.remove(this);
                            p50Var.a();
                            i10++;
                        } else {
                            n50Var.f36454g = null;
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
        switch (this.f5296a) {
            case 0:
                super.onDraw(canvas);
                v0 v0Var = (v0) this.f5297b;
                if (v0Var.m0 - v0Var.f5545l0 > 1) {
                    Paint T0 = j6.T0("paintDivider", v0.f0(v0Var));
                    if (T0 == null) {
                        T0 = j6.f20025k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.f5297b;
                r2Var.f21653g4.setBounds(0, 0, getWidth(), getHeight());
                r2Var.f21653g4.draw(canvas);
                return;
            case 11:
                er erVar = (er) this.f5297b;
                if (erVar.W) {
                    canvas.drawRect(er.R(erVar), 0.0f, getMeasuredWidth() - er.S(erVar), 1.0f, j6.f20025k0);
                    return;
                }
                return;
            case 15:
                super.onDraw(canvas);
                ((nt0) this.f5297b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 18:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                xp0 xp0Var = (xp0) this.f5297b;
                RectF rectF = xp0Var.h;
                Paint paint = xp0Var.f26368f;
                if (offsetColor != 0) {
                    paint.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                return;
            case 19:
                float f14 = 2.0f;
                qv0 qv0Var = (qv0) this.f5297b;
                if (qv0Var.f28271b != null && !qv0Var.G) {
                    Drawable newDrawable = qv0Var.getNewDrawable();
                    boolean newDrawableMotion = qv0Var.getNewDrawableMotion();
                    Drawable drawable3 = qv0Var.f28271b;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (j6.sl != null) {
                            qv0Var.d = drawable3;
                            qv0Var.e = qv0Var.f28273c;
                        }
                        if (newDrawable instanceof dc0) {
                            ((dc0) newDrawable).r(qv0Var.I);
                        }
                        qv0Var.f28271b = newDrawable;
                        if (qv0Var.J && (newDrawable instanceof ao)) {
                            ((ao) newDrawable).f(this);
                        }
                        if (qv0Var.J) {
                            Drawable drawable4 = qv0Var.f28271b;
                            if (drawable4 instanceof dc0) {
                                ((dc0) drawable4).k();
                            }
                        }
                        qv0Var.f28273c = newDrawableMotion;
                        qv0Var.f28281i0 = 0.0f;
                        qv0Var.U(qv0Var.f28271b);
                        qv0Var.I();
                    } else if (qv0Var.f28273c != newDrawableMotion) {
                        qv0Var.f28273c = newDrawableMotion;
                        qv0Var.I();
                    }
                    qv0Var.f28281i0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + qv0Var.f28281i0, 1.0f, 0.0f);
                    int i16 = 0;
                    while (i16 < 2) {
                        if (i16 == 0) {
                            drawable = qv0Var.d;
                        } else {
                            drawable = qv0Var.f28271b;
                        }
                        if (drawable != null) {
                            if (i16 == i15 && qv0Var.d != null && qv0Var.D != null) {
                                drawable.setAlpha((int) (qv0Var.f28281i0 * 255.0f));
                            } else {
                                drawable.setAlpha(i14);
                            }
                            if (i16 == 0) {
                                z4 = qv0Var.e;
                            } else {
                                z4 = qv0Var.f28273c;
                            }
                            if (z4) {
                                f10 = qv0Var.f28294y;
                                f11 = qv0Var.f28292w;
                                f12 = qv0Var.f28293x;
                            } else {
                                f10 = 1.0f;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                            if (drawable instanceof dc0) {
                                dc0 dc0Var = (dc0) drawable;
                                if (dc0Var.f24251u != null) {
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
                                    if (qv0Var.Q() && qv0Var.f28291s) {
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
                                    dc0Var.f24237f = qv0Var.B;
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
                                            if (qv0Var.Q() && qv0Var.f28291s) {
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
                                            aoVar.f32675b = this;
                                            dc0 dc0Var2 = aoVar.f32677f;
                                            if (dc0Var2 != null) {
                                                dc0Var2.r(this);
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
                                    if (i16 != 0 && (drawable2 = qv0Var.d) != null && qv0Var.f28281i0 >= f13) {
                                        if (qv0Var.J && (drawable2 instanceof ao)) {
                                            ((ao) drawable2).g(qv0Var.I);
                                        }
                                        if (qv0Var.J) {
                                            Drawable drawable5 = qv0Var.d;
                                            if (drawable5 instanceof dc0) {
                                                ((dc0) drawable5).l();
                                            }
                                        }
                                        qv0Var.d = null;
                                        qv0Var.e = false;
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
                    if (qv0Var.f28281i0 != 1.0f) {
                        qv0Var.I.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onDraw(canvas);
                int w02 = j6.w0(null, j6.Vi, false);
                hy0 hy0Var = (hy0) this.f5297b;
                org.telegram.ui.Components.voip.h hVar = hy0Var.I;
                Paint paint2 = hy0Var.f25516a;
                paint2.setColor(w02);
                Paint paint3 = hy0Var.f25517b;
                paint3.setColor(w02);
                Paint paint4 = hy0Var.f25518c;
                paint4.setColor(w02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = hy0Var.d;
                paint5.setColor(j6.w0(null, j6.f19906d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint2);
                boolean z11 = hy0Var.e;
                if (z11 || hy0Var.G != 0.0f) {
                    if (z11) {
                        if (hy0Var.H) {
                            float f17 = hy0Var.G + 0.024615385f;
                            hy0Var.G = f17;
                            if (f17 > 1.0f) {
                                hy0Var.G = 1.0f;
                                hy0Var.H = false;
                            }
                        } else {
                            float f18 = hy0Var.G - 0.024615385f;
                            hy0Var.G = f18;
                            if (f18 < 0.0f) {
                                hy0Var.G = 0.0f;
                                hy0Var.H = true;
                            }
                        }
                    } else {
                        float f19 = hy0Var.G - 0.10666667f;
                        hy0Var.G = f19;
                        if (f19 < 0.0f) {
                            hy0Var.G = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f29656f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp = AndroidUtilities.dp(24.0f);
                if (!hy0Var.e) {
                    int z12 = (int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * hy0Var.C);
                    int dp2 = AndroidUtilities.dp(24.0f) + z12;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + z12, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint5);
                }
                if (!hy0Var.e) {
                    int z13 = (int) (org.telegram.ui.b.z(24.0f, 2, getMeasuredWidth()) * hy0Var.B);
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
                    ((org.telegram.ui.Components.voip.g1) this.f5297b).f29641n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
                    invalidate();
                    return;
                }
                return;
            case 26:
                canvas.drawColor(((hj0) this.f5297b).getThemedColor(j6.f19924e7));
                return;
            case 27:
                pp0 pp0Var = (pp0) this.f5297b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, pp0Var.f37429c.size())));
                int ceil5 = (int) Math.ceil(pp0Var.P.measureText(format));
                int max3 = Math.max(AndroidUtilities.dp(16.0f) + ceil5, AndroidUtilities.dp(24.0f));
                int measuredWidth3 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                pp0Var.P.setColor(j6.w0(null, j6.C5, false));
                pp0Var.R.setColor(j6.w0(null, j6.f19977h5, false));
                int i21 = max3 / 2;
                int i22 = measuredWidth3 - i21;
                int i23 = i21 + measuredWidth3;
                pp0Var.Q.set(i22, 0.0f, i23, getMeasuredHeight());
                canvas.drawRoundRect(pp0Var.Q, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), pp0Var.R);
                pp0Var.R.setColor(j6.w0(null, j6.B5, false));
                pp0Var.Q.set(AndroidUtilities.dp(2.0f) + i22, AndroidUtilities.dp(2.0f), i23 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(pp0Var.Q, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), pp0Var.R);
                canvas.drawText(format, measuredWidth3 - (ceil5 / 2), AndroidUtilities.dp(16.2f), pp0Var.P);
                return;
            case 28:
                fq0 fq0Var = (fq0) this.f5297b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, fq0Var.f34317c.size())));
                int ceil6 = (int) Math.ceil(fq0Var.f34320e0.measureText(format2));
                int max4 = Math.max(AndroidUtilities.dp(16.0f) + ceil6, AndroidUtilities.dp(24.0f));
                int measuredWidth4 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                fq0Var.f34320e0.setColor(j6.w0(null, j6.C5, false));
                fq0Var.f34323g0.setColor(j6.w0(null, fq0Var.f34335r0, false));
                int i24 = max4 / 2;
                int i25 = measuredWidth4 - i24;
                int i26 = i24 + measuredWidth4;
                fq0Var.f34322f0.set(i25, 0.0f, i26, getMeasuredHeight());
                canvas.drawRoundRect(fq0Var.f34322f0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), fq0Var.f34323g0);
                fq0Var.f34323g0.setColor(j6.w0(null, j6.B5, false));
                fq0Var.f34322f0.set(AndroidUtilities.dp(2.0f) + i25, AndroidUtilities.dp(2.0f), i26 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(fq0Var.f34322f0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), fq0Var.f34323g0);
                canvas.drawText(format2, measuredWidth4 - (ceil6 / 2), AndroidUtilities.dp(16.2f), fq0Var.f34320e0);
                return;
            case 29:
                ((PhotoViewer) this.f5297b).f31815n3.a(canvas, this);
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
        switch (this.f5296a) {
            case 2:
                ja jaVar = (ja) this.f5297b;
                if (jaVar.E) {
                    i12 = (ja.C0(jaVar).getMeasuredHeight() + jaVar.F) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + jaVar.F;
                    if (AndroidUtilities.dp(24.0f) + jaVar.f35888y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + jaVar.f35888y.getMeasuredHeight();
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
                f2.i0 i0Var = ((r5) this.f5297b).d.C;
                if (i0Var instanceof pz) {
                    i13 = ((pz) i0Var).J;
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
                sa saVar = (sa) this.f5297b;
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((em) this.f5297b).v.G, 1073741824));
                return;
            case 9:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((on) this.f5297b).d.O0);
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((rn) ((y7) this.f5297b).d).f28499w, 1073741824));
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((k01) this.f5297b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((k01) this.f5297b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((w60) this.f5297b).f30247c.f23874l0, 1073741824));
                return;
            case 14:
                int dp2 = AndroidUtilities.dp(48.0f);
                c70 c70Var = ((y60) this.f5297b).f30891n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp2 + c70Var.f23874l0 + c70Var.f23879r0, 1073741824));
                return;
            case 17:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((hq0) this.f5297b).H.G.R, 1073741824));
                return;
            case 20:
                ow0 ow0Var = (ow0) this.f5297b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                xw0 xw0Var = ow0Var.d;
                int i18 = xw0Var.f30748d3;
                if (i18 > 0) {
                    i15 = AndroidUtilities.dp(4.0f) + i18;
                } else {
                    i15 = 0;
                }
                int max = Math.max(i15, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((ow0Var.h() - 1) * size2), ow0Var.d.U2 * size2)));
                xw0Var.c3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 21:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
            case 24:
                l20 l20Var = (l20) this.f5297b;
                if (l20Var.E) {
                    int i19 = l20Var.F;
                    kVar = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
                    l20Var.G = (kVar.getMeasuredHeight() + i19) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + l20Var.F;
                    if (AndroidUtilities.dp(24.0f) + l20Var.f35888y.getMeasuredHeight() > dp3) {
                        dp3 = Math.max(dp3, (AndroidUtilities.dp(24.0f) + l20Var.f35888y.getMeasuredHeight()) - l20Var.I);
                    }
                    l20Var.G = dp3;
                }
                int i20 = (int) (l20Var.G - (0 * 2.5f));
                l20Var.G = i20;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                return;
            case 25:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5296a) {
            case 22:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.g1) this.f5297b).f29641n.f29656f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f5296a) {
            case 5:
                super.setAlpha(f10);
                View view = ((e8) this.f5297b).f33927b.f34478x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 23:
                super.setAlpha(f10);
                View view2 = ((oy) this.f5297b).fragmentView;
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
        switch (this.f5296a) {
            case 1:
                if (((kh.d2) this.f5297b) != null) {
                    if (isAttachedToWindow()) {
                        kh.d2 d2Var = (kh.d2) this.f5297b;
                        if (d2Var.f10532i) {
                            d2Var.f10532i = false;
                            d2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(d2Var.h);
                        }
                    }
                    this.f5297b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof kh.d2) {
                    this.f5297b = (kh.d2) drawable;
                    if (isAttachedToWindow()) {
                        kh.d2 d2Var2 = (kh.d2) this.f5297b;
                        if (!d2Var2.f10532i) {
                            d2Var2.f10532i = true;
                            d2Var2.a();
                            cg.h0 h0Var = new cg.h0(d2Var2, 14);
                            d2Var2.h = h0Var;
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
        switch (this.f5296a) {
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
        switch (this.f5296a) {
            case 7:
                super.setTranslationY(f10);
                sa.r((sa) this.f5297b).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public h0(Object obj, Context context, int i10) {
        super(context);
        this.f5296a = i10;
        this.f5297b = obj;
    }

    public h0(sa saVar, Context context) {
        super(context);
        this.f5296a = 7;
        this.f5297b = saVar;
        setTag(-33024);
    }

    public h0(Context context, n50 n50Var) {
        super(context);
        this.f5296a = 25;
        this.f5297b = n50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new rx0(25, this, context));
    }
}
