package di;

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
import org.telegram.messenger.vl;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.go;
import org.telegram.ui.hu0;
import org.telegram.ui.r20;
import org.telegram.ui.uy;
public final class eb extends View {
    public final int f7180a;
    public Object f7181b;

    public eb(Context context) {
        super(context);
        this.f7180a = 17;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f7180a) {
            case 0:
                canvas.save();
                pc pcVar = (pc) this.f7181b;
                canvas.translate(pcVar.f7850c1.getX() + pcVar.f7878l0.getX(), pcVar.f7850c1.getY() + pcVar.f7878l0.getY());
                fc fcVar = pcVar.f7850c1;
                fcVar.k(canvas, fcVar.getBounds(), pcVar.f7850c1.getOver2Alpha());
                canvas.restore();
                return;
            case 5:
                bh.c cVar = ((ih.g) this.f7181b).I;
                if (cVar != null) {
                    cVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.i3) this.f7181b).d);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f7180a) {
            case 17:
                super.draw(canvas);
                ((f01) this.f7181b).e(canvas, (getMeasuredWidth() - ((f01) this.f7181b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 21:
                super.draw(canvas);
                hq0 hq0Var = (hq0) this.f7181b;
                hq0Var.W0.setBounds(0, (getMeasuredHeight() - hq0Var.G0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                hq0Var.W0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f7180a) {
            case 24:
                super.invalidate();
                ((ov0) this.f7181b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f7180a) {
            case 4:
                super.onAttachedToWindow();
                ((hg.q1) this.f7181b).f11223f = true;
                return;
            case 7:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f7181b).f23902l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f7180a) {
            case 4:
                super.onDetachedFromWindow();
                ((hg.q1) this.f7181b).f11223f = false;
                return;
            case 7:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f7181b).f23902l = false;
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
        switch (this.f7180a) {
            case 3:
                super.onDraw(canvas);
                gi.k0 k0Var = (gi.k0) this.f7181b;
                yf.z zVar = k0Var.K;
                float max = Math.max(k0Var.f10709b.f15368e, k0Var.f10710c.f15368e);
                yf.z zVar2 = k0Var.J;
                zVar2.c(AndroidUtilities.dp(42.0f) + k0Var.U.f11426b, 0);
                zVar2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + k0Var.U.f11426b);
                int i14 = org.telegram.ui.ActionBar.j6.f20607a7;
                zVar2.b(org.telegram.ui.ActionBar.j6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), k0Var.getThemedColor(i14)));
                zVar2.draw(canvas);
                if (k0Var.N) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + k0Var.U.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + k0Var.U.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(k0Var.U.d), max);
                zVar.c(0, lerp);
                zVar.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                zVar.b(org.telegram.ui.ActionBar.j6.l1(lerp3, k0Var.getThemedColor(i14)));
                zVar.draw(canvas);
                return;
            case 6:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((ji.t0) this.f7181b).f14179c.draw(canvas);
                canvas.restore();
                return;
            case 7:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f7181b;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            case 11:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.f7181b;
                r2Var.f22582j4.setBounds(0, 0, getWidth(), getHeight());
                r2Var.f22582j4.draw(canvas);
                return;
            case 16:
                fr frVar = (fr) this.f7181b;
                if (frVar.Z) {
                    canvas.drawRect(fr.R(frVar), 0.0f, getMeasuredWidth() - fr.S(frVar), 1.0f, org.telegram.ui.ActionBar.j6.f20785k0);
                    return;
                }
                return;
            case 20:
                super.onDraw(canvas);
                ((hu0) this.f7181b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 23:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                tp0 tp0Var = (tp0) this.f7181b;
                RectF rectF = tp0Var.h;
                Paint paint2 = tp0Var.f26490f;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 24:
                ov0 ov0Var = (ov0) this.f7181b;
                if (ov0Var.f29199b != null && !ov0Var.J) {
                    Drawable newDrawable = ov0Var.getNewDrawable();
                    boolean newDrawableMotion = ov0Var.getNewDrawableMotion();
                    Drawable drawable3 = ov0Var.f29199b;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.j6.sl != null) {
                            ov0Var.d = drawable3;
                            ov0Var.f29204e = ov0Var.f29201c;
                        }
                        if (newDrawable instanceof dc0) {
                            ((dc0) newDrawable).r(ov0Var.L);
                        }
                        ov0Var.f29199b = newDrawable;
                        if (ov0Var.M && (newDrawable instanceof go)) {
                            ((go) newDrawable).f(this);
                        }
                        if (ov0Var.M) {
                            Drawable drawable4 = ov0Var.f29199b;
                            if (drawable4 instanceof dc0) {
                                ((dc0) drawable4).k();
                            }
                        }
                        ov0Var.f29201c = newDrawableMotion;
                        ov0Var.f29213l0 = 0.0f;
                        ov0Var.U(ov0Var.f29199b);
                        ov0Var.I();
                    } else if (ov0Var.f29201c != newDrawableMotion) {
                        ov0Var.f29201c = newDrawableMotion;
                        ov0Var.I();
                    }
                    ov0Var.f29213l0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + ov0Var.f29213l0, 1.0f, 0.0f);
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (i15 == 0) {
                            drawable = ov0Var.d;
                        } else {
                            drawable = ov0Var.f29199b;
                        }
                        if (drawable != null) {
                            boolean z11 = true;
                            if (i15 == 1 && ov0Var.d != null && ov0Var.G != null) {
                                drawable.setAlpha((int) (ov0Var.f29213l0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i15 == 0) {
                                z10 = ov0Var.f29204e;
                            } else {
                                z10 = ov0Var.f29201c;
                            }
                            if (z10) {
                                f7 = ov0Var.f29226y;
                                f10 = ov0Var.f29224w;
                                f11 = ov0Var.f29225x;
                            } else {
                                f7 = 1.0f;
                                f10 = 0.0f;
                                f11 = 0.0f;
                            }
                            if (drawable instanceof dc0) {
                                dc0 dc0Var = (dc0) drawable;
                                if (dc0Var.f25363u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (ov0Var.P()) {
                                        i12 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i12 = 0;
                                    }
                                    if (ov0Var.Q() && ov0Var.f29221s) {
                                        i13 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i13 = 0;
                                    }
                                    int i16 = i12 + i13;
                                    if (ov0Var.Y()) {
                                        height2 = getRootView().getMeasuredHeight() - i16;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f12 = 1.0f;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f7);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f7);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f10);
                                    int i17 = ((height2 - ceil2) / 2) + ov0Var.E + i16 + ((int) f11);
                                    canvas.save();
                                    canvas.clipRect(0, i16, ceil, getMeasuredHeight() - ov0Var.h);
                                    drawable.setBounds(measuredWidth, i17, ceil + measuredWidth, ceil2 + i17);
                                    drawable.draw(canvas);
                                    ov0.G(ov0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f12 = 1.0f;
                                    if (ov0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ov0Var.h);
                                    }
                                    dc0Var.f25349f = ov0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - ov0Var.E) + f11));
                                    drawable.draw(canvas);
                                    if (ov0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f12 = 1.0f;
                                if (drawable instanceof ColorDrawable) {
                                    if (ov0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ov0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    ov0.G(ov0Var, canvas);
                                    if (ov0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (ov0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ov0Var.h);
                                    }
                                    drawable.setBounds(0, ov0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + ov0Var.E);
                                    drawable.draw(canvas);
                                    ov0.G(ov0Var, canvas);
                                    if (ov0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f14 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f14, f14);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f14), (int) Math.ceil(getRootView().getMeasuredHeight() / f14));
                                        drawable.draw(canvas);
                                        ov0.G(ov0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (ov0Var.P()) {
                                            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i10 = 0;
                                        }
                                        if (ov0Var.Q() && ov0Var.f29221s) {
                                            i11 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i11 = 0;
                                        }
                                        int i18 = i10 + i11;
                                        if (ov0Var.Y()) {
                                            height = getRootView().getMeasuredHeight() - i18;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f7);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f7);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f10);
                                        int i19 = ((height - ceil4) / 2) + ov0Var.E + i18 + ((int) f11);
                                        canvas.save();
                                        canvas.clipRect(0, i18, ceil3, getMeasuredHeight() - ov0Var.h);
                                        drawable.setBounds(measuredWidth2, i19, ceil3 + measuredWidth2, ceil4 + i19);
                                        drawable.draw(canvas);
                                        ov0.G(ov0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (ov0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - ov0Var.h);
                                    }
                                    if (drawable instanceof go) {
                                        go goVar = (go) drawable;
                                        goVar.f36725b = this;
                                        dc0 dc0Var2 = goVar.f36728f;
                                        if (dc0Var2 != null) {
                                            dc0Var2.r(this);
                                        }
                                    }
                                    float f15 = f7 - 1.0f;
                                    float A = a4.a.A(-getMeasuredWidth(), f15, 2.0f, f10);
                                    float A2 = a4.a.A(-getRootView().getMeasuredHeight(), f15, 2.0f, f11);
                                    drawable.setBounds((int) A, (int) (ov0Var.E + A2), (int) ((getMeasuredWidth() * f7) + A), (int) org.telegram.ui.Cells.p6.a(getRootView().getMeasuredHeight(), f7, ov0Var.E, A2));
                                    drawable.draw(canvas);
                                    ov0.G(ov0Var, canvas);
                                    if (ov0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i15 == 0 && (drawable2 = ov0Var.d) != null && ov0Var.f29213l0 >= f12) {
                                if (ov0Var.M && (drawable2 instanceof go)) {
                                    ((go) drawable2).g(ov0Var.L);
                                }
                                if (ov0Var.M) {
                                    Drawable drawable5 = ov0Var.d;
                                    if (drawable5 instanceof dc0) {
                                        ((dc0) drawable5).l();
                                    }
                                }
                                ov0Var.d = null;
                                ov0Var.f29204e = false;
                                ov0Var.I();
                                ov0Var.L.invalidate();
                            }
                        }
                    }
                    if (ov0Var.f29213l0 != 1.0f) {
                        ov0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                ey0 ey0Var = (ey0) this.f7181b;
                org.telegram.ui.Components.voip.h hVar = ey0Var.L;
                Paint paint3 = ey0Var.f25805a;
                paint3.setColor(w02);
                Paint paint4 = ey0Var.f25806b;
                paint4.setColor(w02);
                Paint paint5 = ey0Var.f25807c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = ey0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = ey0Var.f25808e;
                if (z12 || ey0Var.J != 0.0f) {
                    if (z12) {
                        if (ey0Var.K) {
                            float f16 = ey0Var.J + 0.024615385f;
                            ey0Var.J = f16;
                            if (f16 > 1.0f) {
                                ey0Var.J = 1.0f;
                                ey0Var.K = false;
                            }
                        } else {
                            float f17 = ey0Var.J - 0.024615385f;
                            ey0Var.J = f17;
                            if (f17 < 0.0f) {
                                ey0Var.J = 0.0f;
                                ey0Var.K = true;
                            }
                        }
                    } else {
                        float f18 = ey0Var.J - 0.10666667f;
                        ey0Var.J = f18;
                        if (f18 < 0.0f) {
                            ey0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f31503f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp2 = AndroidUtilities.dp(24.0f);
                if (!ey0Var.f25808e) {
                    int A3 = (int) (vl.A(24.0f, 2, getMeasuredWidth()) * ey0Var.F);
                    int dp3 = AndroidUtilities.dp(24.0f) + A3;
                    f13 = 1.0f;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A3, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    paint = paint6;
                    f13 = 1.0f;
                }
                if (!ey0Var.f25808e) {
                    int A4 = (int) (vl.A(24.0f, 2, getMeasuredWidth()) * ey0Var.E);
                    if (A4 < AndroidUtilities.dp(f13)) {
                        A4 = AndroidUtilities.dp(f13);
                    }
                    int dp4 = AndroidUtilities.dp(24.0f) + A4;
                    canvas.drawLine(dp2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A4, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp4, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp4, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    return;
                }
                return;
            case 27:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.h1) this.f7181b).f31523n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
        switch (this.f7180a) {
            case 1:
                ei.i iVar = (ei.i) this.f7181b;
                if (iVar.H) {
                    i12 = (ei.i.y0(iVar).getMeasuredHeight() + iVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + iVar.I;
                    if (AndroidUtilities.dp(24.0f) + iVar.f40049y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + iVar.f40049y.getMeasuredHeight();
                    }
                    i12 = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 2:
                fi.m mVar = (fi.m) this.f7181b;
                if (mVar.H) {
                    i13 = (fi.m.B0(mVar).getMeasuredHeight() + mVar.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + mVar.I;
                    if (AndroidUtilities.dp(24.0f) + mVar.f40049y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + mVar.f40049y.getMeasuredHeight();
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
                hg.q1 q1Var = (hg.q1) this.f7181b;
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
                s4.c0 c0Var = ((org.telegram.ui.o5) this.f7181b).d.F;
                if (c0Var instanceof pz) {
                    i15 = ((pz) c0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 12:
                org.telegram.ui.Components.bb bbVar = (org.telegram.ui.Components.bb) this.f7181b;
                int i18 = bbVar.h;
                if (i18 == 0) {
                    i16 = AndroidUtilities.dp(300.0f);
                } else {
                    i16 = (int) (i18 * bbVar.v);
                }
                int i19 = i16 - (((bbVar.G - bbVar.H) - bbVar.I) - bbVar.J);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((hm) this.f7181b).v.J, 1073741824));
                return;
            case 14:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((rn) this.f7181b).d.R0);
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((un) ((org.telegram.ui.w7) this.f7181b).d).f30928w, 1073741824));
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((f01) this.f7181b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((f01) this.f7181b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 18:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((v60) this.f7181b).f31142c.f24580o0, 1073741824));
                return;
            case 19:
                int dp3 = AndroidUtilities.dp(48.0f);
                b70 b70Var = ((x60) this.f7181b).f32437n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp3 + b70Var.f24580o0 + b70Var.f24586u0, 1073741824));
                return;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((dq0) this.f7181b).K.J.R, 1073741824));
                return;
            case 25:
                mw0 mw0Var = (mw0) this.f7181b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                vw0 vw0Var = mw0Var.d;
                int i20 = vw0Var.f32000g3;
                if (i20 > 0) {
                    i17 = AndroidUtilities.dp(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((mw0Var.h() - 1) * size2), mw0Var.d.X2 * size2)));
                vw0Var.f31999f3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i11);
                return;
            case 26:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
            case 29:
                r20 r20Var = (r20) this.f7181b;
                if (r20Var.H) {
                    r20Var.J = (r20.U(r20Var).getMeasuredHeight() + r20Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp4 = AndroidUtilities.dp(140.0f) + r20Var.I;
                    if (AndroidUtilities.dp(24.0f) + r20Var.f40049y.getMeasuredHeight() > dp4) {
                        dp4 = Math.max(dp4, (AndroidUtilities.dp(24.0f) + r20Var.f40049y.getMeasuredHeight()) - r20Var.L);
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
        switch (this.f7180a) {
            case 27:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.h1) this.f7181b).f31523n.f31503f = i10;
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f7180a) {
            case 10:
                super.setAlpha(f7);
                View view = ((org.telegram.ui.c8) this.f7181b).f35021b.f35971x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 28:
                super.setAlpha(f7);
                View view2 = ((uy) this.f7181b).fragmentView;
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
        switch (this.f7180a) {
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
        switch (this.f7180a) {
            case 12:
                super.setTranslationY(f7);
                org.telegram.ui.Components.bb.r((org.telegram.ui.Components.bb) this.f7181b).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public eb(Object obj, Context context, int i10) {
        super(context);
        this.f7180a = i10;
        this.f7181b = obj;
    }

    public eb(org.telegram.ui.Components.bb bbVar, Context context) {
        super(context);
        this.f7180a = 12;
        this.f7181b = bbVar;
        setTag(-33024);
    }

    public eb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f7180a = 7;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, f6Var);
        this.f7181b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.f21060z5, org.telegram.ui.ActionBar.j6.f20792k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
