package fh;

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
import gh.oa;
import kh.mb;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yl;
import org.telegram.ui.b50;
import org.telegram.ui.b8;
import org.telegram.ui.dy;
import org.telegram.ui.gt0;
import org.telegram.ui.tn;
import org.telegram.ui.v7;
import org.telegram.ui.x10;
import org.telegram.ui.z40;
public final class l2 extends View {
    public final int f6601a;
    public Object f6602b;

    public l2(Context context, int i9) {
        super(context);
        this.f6601a = i9;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f6601a) {
            case 2:
                canvas.save();
                wb wbVar = (wb) this.f6602b;
                canvas.translate(wbVar.Y0.getX() + wbVar.f16271h0.getX(), wbVar.Y0.getY() + wbVar.f16271h0.getY());
                mb mbVar = wbVar.Y0;
                mbVar.k(canvas, mbVar.getBounds(), wbVar.Y0.getOver2Alpha());
                canvas.restore();
                return;
            case 7:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.i3) this.f6602b).d);
                return;
            case 29:
                super.dispatchDraw(canvas);
                z40 z40Var = (z40) this.f6602b;
                if (z40Var != null && z40Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f6601a) {
            case 16:
                super.draw(canvas);
                ((nz0) this.f6602b).e(canvas, (getMeasuredWidth() - ((nz0) this.f6602b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 20:
                super.draw(canvas);
                rp0 rp0Var = (rp0) this.f6602b;
                rp0Var.S0.setBounds(0, (getMeasuredHeight() - rp0Var.C0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                rp0Var.S0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f6601a) {
            case 23:
                super.invalidate();
                ((xu0) this.f6602b).T();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f6601a) {
            case 0:
                super.onAttachedToWindow();
                k2 k2Var = (k2) this.f6602b;
                if (k2Var != null && !k2Var.f6584i) {
                    k2Var.f6584i = true;
                    k2Var.a();
                    bg.i iVar = new bg.i(k2Var, 7);
                    k2Var.h = iVar;
                    LiteMode.addOnPowerSaverAppliedListener(iVar);
                    return;
                }
                return;
            case 6:
                super.onAttachedToWindow();
                ((of.k1) this.f6602b).f19400f = true;
                return;
            case 29:
                super.onAttachedToWindow();
                z40 z40Var = (z40) this.f6602b;
                if (z40Var != null) {
                    z40Var.f45027g = this;
                    int i9 = 0;
                    while (true) {
                        b50[] b50VarArr = z40Var.f45024c;
                        if (i9 < b50VarArr.length) {
                            b50 b50Var = b50VarArr[i9];
                            b50Var.f36651i.add(this);
                            b50Var.a();
                            i9++;
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
        switch (this.f6601a) {
            case 0:
                super.onDetachedFromWindow();
                k2 k2Var = (k2) this.f6602b;
                if (k2Var != null && k2Var.f6584i) {
                    k2Var.f6584i = false;
                    k2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(k2Var.h);
                    return;
                }
                return;
            case 6:
                super.onDetachedFromWindow();
                ((of.k1) this.f6602b).f19400f = false;
                return;
            case 29:
                super.onDetachedFromWindow();
                z40 z40Var = (z40) this.f6602b;
                if (z40Var != null && z40Var.f45027g != this) {
                    int i9 = 0;
                    while (true) {
                        b50[] b50VarArr = z40Var.f45024c;
                        if (i9 < b50VarArr.length) {
                            b50 b50Var = b50VarArr[i9];
                            b50Var.f36651i.remove(this);
                            b50Var.a();
                            i9++;
                        } else {
                            z40Var.f45027g = null;
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
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        int i10;
        int height;
        Drawable drawable2;
        int i11;
        int i12;
        int height2;
        Paint paint;
        float f14;
        switch (this.f6601a) {
            case 5:
                super.onDraw(canvas);
                nh.j0 j0Var = (nh.j0) this.f6602b;
                ff.c0 c0Var = j0Var.G;
                float max = Math.max(j0Var.f18649b.f47775e, j0Var.f18650c.f47775e);
                ff.c0 c0Var2 = j0Var.F;
                c0Var2.c(AndroidUtilities.dp(42.0f) + j0Var.Q.f10849b, 0);
                c0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + j0Var.Q.f10849b);
                int i13 = org.telegram.ui.ActionBar.f6.f22947a7;
                c0Var2.b(org.telegram.ui.ActionBar.f6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), j0Var.getThemedColor(i13)));
                c0Var2.draw(canvas);
                if (j0Var.J) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + j0Var.Q.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + j0Var.Q.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(j0Var.Q.d), max);
                c0Var.c(0, lerp);
                c0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                c0Var.b(org.telegram.ui.ActionBar.f6.l1(lerp3, j0Var.getThemedColor(i13)));
                c0Var.draw(canvas);
                return;
            case 10:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.f6602b;
                r2Var.f24982f4.setBounds(0, 0, getWidth(), getHeight());
                r2Var.f24982f4.draw(canvas);
                return;
            case 15:
                wq wqVar = (wq) this.f6602b;
                if (wqVar.V) {
                    canvas.drawRect(wq.Q(wqVar), 0.0f, getMeasuredWidth() - wq.R(wqVar), 1.0f, org.telegram.ui.ActionBar.f6.f23121k0);
                    return;
                }
                return;
            case 19:
                super.onDraw(canvas);
                ((gt0) this.f6602b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 22:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                dp0 dp0Var = (dp0) this.f6602b;
                RectF rectF = dp0Var.h;
                Paint paint2 = dp0Var.f32008f;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                return;
            case 23:
                xu0 xu0Var = (xu0) this.f6602b;
                if (xu0Var.f34773b != null && !xu0Var.F) {
                    Drawable newDrawable = xu0Var.getNewDrawable();
                    boolean newDrawableMotion = xu0Var.getNewDrawableMotion();
                    Drawable drawable3 = xu0Var.f34773b;
                    if (newDrawable != drawable3 && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.f6.sl != null) {
                            xu0Var.d = drawable3;
                            xu0Var.f34778e = xu0Var.f34775c;
                        }
                        if (newDrawable instanceof jb0) {
                            ((jb0) newDrawable).r(xu0Var.H);
                        }
                        xu0Var.f34773b = newDrawable;
                        if (xu0Var.I && (newDrawable instanceof tn)) {
                            ((tn) newDrawable).f(this);
                        }
                        if (xu0Var.I) {
                            Drawable drawable4 = xu0Var.f34773b;
                            if (drawable4 instanceof jb0) {
                                ((jb0) drawable4).k();
                            }
                        }
                        xu0Var.f34775c = newDrawableMotion;
                        xu0Var.f34783h0 = 0.0f;
                        xu0Var.U(xu0Var.f34773b);
                        xu0Var.I();
                    } else if (xu0Var.f34775c != newDrawableMotion) {
                        xu0Var.f34775c = newDrawableMotion;
                        xu0Var.I();
                    }
                    xu0Var.f34783h0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + xu0Var.f34783h0, 1.0f, 0.0f);
                    for (int i14 = 0; i14 < 2; i14++) {
                        if (i14 == 0) {
                            drawable = xu0Var.d;
                        } else {
                            drawable = xu0Var.f34773b;
                        }
                        if (drawable != null) {
                            boolean z11 = true;
                            if (i14 == 1 && xu0Var.d != null && xu0Var.C != null) {
                                drawable.setAlpha((int) (xu0Var.f34783h0 * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i14 == 0) {
                                z10 = xu0Var.f34778e;
                            } else {
                                z10 = xu0Var.f34775c;
                            }
                            if (z10) {
                                f10 = xu0Var.f34796y;
                                f11 = xu0Var.f34794w;
                                f12 = xu0Var.f34795x;
                            } else {
                                f10 = 1.0f;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                            if (drawable instanceof jb0) {
                                jb0 jb0Var = (jb0) drawable;
                                if (jb0Var.f29708u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (xu0Var.P()) {
                                        i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i11 = 0;
                                    }
                                    if (xu0Var.Q() && xu0Var.f34793s) {
                                        i12 = AndroidUtilities.statusBarHeight;
                                    } else {
                                        i12 = 0;
                                    }
                                    int i15 = i11 + i12;
                                    if (xu0Var.Y()) {
                                        height2 = getRootView().getMeasuredHeight() - i15;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f13 = 1.0f;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i16 = ((height2 - ceil2) / 2) + xu0Var.A + i15 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, i15, ceil, getMeasuredHeight() - xu0Var.h);
                                    drawable.setBounds(measuredWidth, i16, ceil + measuredWidth, ceil2 + i16);
                                    drawable.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = 1.0f;
                                    if (xu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - xu0Var.h);
                                    }
                                    jb0Var.f29694f = xu0Var.A;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - xu0Var.A) + f12));
                                    drawable.draw(canvas);
                                    if (xu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = 1.0f;
                                if (drawable instanceof ColorDrawable) {
                                    if (xu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - xu0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    if (xu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (xu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - xu0Var.h);
                                    }
                                    drawable.setBounds(0, xu0Var.A, getMeasuredWidth(), getRootView().getMeasuredHeight() + xu0Var.A);
                                    drawable.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    if (xu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f15 = 2.0f / AndroidUtilities.density;
                                        canvas.scale(f15, f15);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f15), (int) Math.ceil(getRootView().getMeasuredHeight() / f15));
                                        drawable.draw(canvas);
                                        xu0.H(xu0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (xu0Var.P()) {
                                            i9 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i9 = 0;
                                        }
                                        if (xu0Var.Q() && xu0Var.f34793s) {
                                            i10 = AndroidUtilities.statusBarHeight;
                                        } else {
                                            i10 = 0;
                                        }
                                        int i17 = i9 + i10;
                                        if (xu0Var.Y()) {
                                            height = getRootView().getMeasuredHeight() - i17;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f10);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f10);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                        int i18 = ((height - ceil4) / 2) + xu0Var.A + i17 + ((int) f12);
                                        canvas.save();
                                        canvas.clipRect(0, i17, ceil3, getMeasuredHeight() - xu0Var.h);
                                        drawable.setBounds(measuredWidth2, i18, ceil3 + measuredWidth2, ceil4 + i18);
                                        drawable.draw(canvas);
                                        xu0.H(xu0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (xu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - xu0Var.h);
                                    }
                                    if (drawable instanceof tn) {
                                        tn tnVar = (tn) drawable;
                                        tnVar.f43035b = this;
                                        jb0 jb0Var2 = tnVar.f43038f;
                                        if (jb0Var2 != null) {
                                            jb0Var2.r(this);
                                        }
                                    }
                                    float f16 = f10 - 1.0f;
                                    float d = aa.d.d(-getMeasuredWidth(), f16, 2.0f, f11);
                                    float d9 = aa.d.d(-getRootView().getMeasuredHeight(), f16, 2.0f, f12);
                                    drawable.setBounds((int) d, (int) (xu0Var.A + d9), (int) ((getMeasuredWidth() * f10) + d), (int) aa.d.w(getRootView().getMeasuredHeight(), f10, xu0Var.A, d9));
                                    drawable.draw(canvas);
                                    xu0.H(xu0Var, canvas);
                                    if (xu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i14 == 0 && (drawable2 = xu0Var.d) != null && xu0Var.f34783h0 >= f13) {
                                if (xu0Var.I && (drawable2 instanceof tn)) {
                                    ((tn) drawable2).g(xu0Var.H);
                                }
                                if (xu0Var.I) {
                                    Drawable drawable5 = xu0Var.d;
                                    if (drawable5 instanceof jb0) {
                                        ((jb0) drawable5).l();
                                    }
                                }
                                xu0Var.d = null;
                                xu0Var.f34778e = false;
                                xu0Var.I();
                                xu0Var.H.invalidate();
                            }
                        }
                    }
                    if (xu0Var.f34783h0 != 1.0f) {
                        xu0Var.H.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Vi, false);
                mx0 mx0Var = (mx0) this.f6602b;
                org.telegram.ui.Components.voip.h hVar = mx0Var.H;
                Paint paint3 = mx0Var.f30933a;
                paint3.setColor(w02);
                Paint paint4 = mx0Var.f30934b;
                paint4.setColor(w02);
                Paint paint5 = mx0Var.f30935c;
                paint5.setColor(w02);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = mx0Var.d;
                paint6.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z12 = mx0Var.f30936e;
                if (z12 || mx0Var.F != 0.0f) {
                    if (z12) {
                        if (mx0Var.G) {
                            float f17 = mx0Var.F + 0.024615385f;
                            mx0Var.F = f17;
                            if (f17 > 1.0f) {
                                mx0Var.F = 1.0f;
                                mx0Var.G = false;
                            }
                        } else {
                            float f18 = mx0Var.F - 0.024615385f;
                            mx0Var.F = f18;
                            if (f18 < 0.0f) {
                                mx0Var.F = 0.0f;
                                mx0Var.G = true;
                            }
                        }
                    } else {
                        float f19 = mx0Var.F - 0.10666667f;
                        mx0Var.F = f19;
                        if (f19 < 0.0f) {
                            mx0Var.F = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f33541f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int dp = AndroidUtilities.dp(24.0f);
                if (!mx0Var.f30936e) {
                    int A = (int) (ll.A(24.0f, 2, getMeasuredWidth()) * mx0Var.B);
                    int dp2 = AndroidUtilities.dp(24.0f) + A;
                    f14 = 1.0f;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(dp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                } else {
                    paint = paint6;
                    f14 = 1.0f;
                }
                if (!mx0Var.f30936e) {
                    int A2 = (int) (ll.A(24.0f, 2, getMeasuredWidth()) * mx0Var.A);
                    if (A2 < AndroidUtilities.dp(f14)) {
                        A2 = AndroidUtilities.dp(f14);
                    }
                    int dp3 = AndroidUtilities.dp(24.0f) + A2;
                    canvas.drawLine(dp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + A2, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(dp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + dp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                    return;
                }
                return;
            case 26:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.g1) this.f6602b).f33522n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
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
    public void onMeasure(int i9, int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f6601a) {
            case 1:
                oa oaVar = (oa) this.f6602b;
                if (oaVar.D) {
                    int i18 = oaVar.E;
                    kVar = ((org.telegram.ui.ActionBar.o2) oaVar).actionBar;
                    i11 = (kVar.getMeasuredHeight() + i18) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + oaVar.E;
                    if (AndroidUtilities.dp(24.0f) + oaVar.f44322y.getMeasuredHeight() > dp) {
                        dp = AndroidUtilities.dp(24.0f) + oaVar.f44322y.getMeasuredHeight();
                    }
                    i11 = dp;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (i11 - (0 * 2.5f)), 1073741824));
                return;
            case 2:
            case 5:
            case 9:
            case 10:
            case 15:
            case 19:
            case 20:
            case 22:
            case 23:
            case 26:
            case 27:
            default:
                super.onMeasure(i9, i10);
                return;
            case 3:
                lh.g gVar = (lh.g) this.f6602b;
                if (gVar.D) {
                    i12 = (lh.g.x0(gVar).getMeasuredHeight() + gVar.E) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.E;
                    if (AndroidUtilities.dp(24.0f) + gVar.f44322y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.f44322y.getMeasuredHeight();
                    }
                    i12 = dp2;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 4:
                mh.l lVar = (mh.l) this.f6602b;
                if (lVar.D) {
                    i13 = (mh.l.A0(lVar).getMeasuredHeight() + lVar.E) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + lVar.E;
                    if (AndroidUtilities.dp(24.0f) + lVar.f44322y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + lVar.f44322y.getMeasuredHeight();
                    }
                    i13 = dp3;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 6:
                ((View) getParent()).getMeasuredHeight();
                of.k1 k1Var = (of.k1) this.f6602b;
                Integer num = k1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    k1Var.h = i14;
                } else {
                    i14 = 0;
                    k1Var.h = 0;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                return;
            case 8:
                f2.m0 m0Var = ((org.telegram.ui.o5) this.f6602b).d.B;
                if (m0Var instanceof bz) {
                    i15 = ((bz) m0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 11:
                sa saVar = (sa) this.f6602b;
                int i19 = saVar.h;
                if (i19 == 0) {
                    i16 = AndroidUtilities.dp(300.0f);
                } else {
                    i16 = (int) (i19 * saVar.v);
                }
                int i20 = i16 - (((saVar.C - saVar.D) - saVar.E) - saVar.F);
                if (i20 < 1) {
                    i20 = 1;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(((yl) this.f6602b).v.F, 1073741824));
                return;
            case 13:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), ((hn) this.f6602b).d.N0);
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(((ln) ((v7) this.f6602b).d).f30486w, 1073741824));
                return;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((nz0) this.f6602b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((nz0) this.f6602b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                return;
            case 17:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((e60) this.f6602b).f27962c.f29984k0, 1073741824));
                return;
            case 18:
                int dp4 = AndroidUtilities.dp(48.0f);
                k60 k60Var = ((g60) this.f6602b).f28659n;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(dp4 + k60Var.f29984k0 + k60Var.f29989q0, 1073741824));
                return;
            case 21:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(((np0) this.f6602b).G.F.R, 1073741824));
                return;
            case 24:
                vv0 vv0Var = (vv0) this.f6602b;
                int size = View.MeasureSpec.getSize(i9);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(4.0f);
                ew0 ew0Var = vv0Var.d;
                int i21 = ew0Var.f28194c3;
                if (i21 > 0) {
                    i17 = AndroidUtilities.dp(4.0f) + i21;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((vv0Var.h() - 1) * size2), vv0Var.d.T2 * size2)));
                ew0Var.f28193b3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i10);
                return;
            case 25:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                return;
            case 28:
                x10 x10Var = (x10) this.f6602b;
                if (x10Var.D) {
                    int i22 = x10Var.E;
                    kVar2 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
                    x10Var.F = (kVar2.getMeasuredHeight() + i22) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp5 = AndroidUtilities.dp(140.0f) + x10Var.E;
                    if (AndroidUtilities.dp(24.0f) + x10Var.f44322y.getMeasuredHeight() > dp5) {
                        dp5 = Math.max(dp5, (AndroidUtilities.dp(24.0f) + x10Var.f44322y.getMeasuredHeight()) - x10Var.H);
                    }
                    x10Var.F = dp5;
                }
                int i23 = (int) (x10Var.F - (0 * 2.5f));
                x10Var.F = i23;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(i23, 1073741824));
                return;
            case 29:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(38.0f));
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f6601a) {
            case 26:
                super.onSizeChanged(i9, i10, i11, i12);
                ((org.telegram.ui.Components.voip.g1) this.f6602b).f33522n.f33541f = i9;
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f6601a) {
            case 9:
                super.setAlpha(f10);
                View view = ((b8) this.f6602b).f36734b.f37442x.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 27:
                super.setAlpha(f10);
                View view2 = ((dy) this.f6602b).fragmentView;
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
        switch (this.f6601a) {
            case 0:
                if (((k2) this.f6602b) != null) {
                    if (isAttachedToWindow()) {
                        k2 k2Var = (k2) this.f6602b;
                        if (k2Var.f6584i) {
                            k2Var.f6584i = false;
                            k2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(k2Var.h);
                        }
                    }
                    this.f6602b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof k2) {
                    this.f6602b = (k2) drawable;
                    if (isAttachedToWindow()) {
                        k2 k2Var2 = (k2) this.f6602b;
                        if (!k2Var2.f6584i) {
                            k2Var2.f6584i = true;
                            k2Var2.a();
                            bg.i iVar = new bg.i(k2Var2, 7);
                            k2Var2.h = iVar;
                            LiteMode.addOnPowerSaverAppliedListener(iVar);
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
        switch (this.f6601a) {
            case 22:
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
        switch (this.f6601a) {
            case 11:
                super.setTranslationY(f10);
                sa.r((sa) this.f6602b).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public l2(Object obj, Context context, int i9) {
        super(context);
        this.f6601a = i9;
        this.f6602b = obj;
    }

    public l2(sa saVar, Context context) {
        super(context);
        this.f6601a = 11;
        this.f6602b = saVar;
        setTag(-33024);
    }

    public l2(Context context, z40 z40Var) {
        super(context);
        this.f6601a = 29;
        this.f6602b = z40Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new vh0(27, this, context));
    }
}
