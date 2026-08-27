package ag;

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
import hh.oa;
import lh.ib;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.a20;
import org.telegram.ui.c50;
import org.telegram.ui.c8;
import org.telegram.ui.e50;
import org.telegram.ui.gy;
import org.telegram.ui.ht0;
import org.telegram.ui.p5;
import org.telegram.ui.un;
import org.telegram.ui.w7;

public final class s0 extends View {

    public final int f639a;

    public Object f640b;

    public s0(Context context, int i10) {
        super(context);
        this.f639a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f639a) {
            case 3:
                canvas.save();
                sb sbVar = (sb) this.f640b;
                canvas.translate(sbVar.Y0.getX() + sbVar.f16767h0.getX(), sbVar.Y0.getY() + sbVar.f16767h0.getY());
                ib ibVar = sbVar.Y0;
                ibVar.k(canvas, ibVar.getBounds(), sbVar.Y0.getOver2Alpha());
                canvas.restore();
                break;
            case 7:
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((org.telegram.ui.ActionBar.h3) this.f640b).d);
                break;
            case 29:
                super.dispatchDraw(canvas);
                c50 c50Var = (c50) this.f640b;
                if (c50Var != null && c50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f639a) {
            case 16:
                super.draw(canvas);
                ((pz0) this.f640b).e(canvas, (getMeasuredWidth() - ((pz0) this.f640b).l()) / 2.0f, getMeasuredHeight() / 2.0f);
                break;
            case 20:
                super.draw(canvas);
                sp0 sp0Var = (sp0) this.f640b;
                sp0Var.S0.setBounds(0, (getMeasuredHeight() - sp0Var.C0.d) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                sp0Var.S0.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f639a) {
            case 23:
                super.invalidate();
                ((zu0) this.f640b).T();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f639a) {
            case 1:
                super.onAttachedToWindow();
                gh.g2 g2Var = (gh.g2) this.f640b;
                if (g2Var != null && !g2Var.f7268i) {
                    g2Var.f7268i = true;
                    g2Var.a();
                    n0 n0Var = new n0(g2Var, 9);
                    g2Var.h = n0Var;
                    LiteMode.addOnPowerSaverAppliedListener(n0Var);
                    break;
                }
                break;
            case 29:
                super.onAttachedToWindow();
                c50 c50Var = (c50) this.f640b;
                if (c50Var != null) {
                    c50Var.f36964g = this;
                    int i10 = 0;
                    while (true) {
                        e50[] e50VarArr = c50Var.f36961c;
                        if (i10 < e50VarArr.length) {
                            e50 e50Var = e50VarArr[i10];
                            e50Var.f37630i.add(this);
                            e50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f639a) {
            case 1:
                super.onDetachedFromWindow();
                gh.g2 g2Var = (gh.g2) this.f640b;
                if (g2Var != null && g2Var.f7268i) {
                    g2Var.f7268i = false;
                    g2Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(g2Var.h);
                    break;
                }
                break;
            case 29:
                super.onDetachedFromWindow();
                c50 c50Var = (c50) this.f640b;
                if (c50Var != null && c50Var.f36964g != this) {
                    int i10 = 0;
                    while (true) {
                        e50[] e50VarArr = c50Var.f36961c;
                        if (i10 >= e50VarArr.length) {
                            c50Var.f36964g = null;
                        } else {
                            e50 e50Var = e50VarArr[i10];
                            e50Var.f37630i.remove(this);
                            e50Var.a();
                            i10++;
                        }
                        break;
                    }
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        Drawable drawable;
        Paint paint;
        float f14;
        switch (this.f639a) {
            case 0:
                super.onDraw(canvas);
                i1 i1Var = (i1) this.f640b;
                if (i1Var.f440l0 - i1Var.f439k0 > 1) {
                    Paint paintT0 = g6.T0("paintDivider", ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider);
                    if (paintT0 == null) {
                        paintT0 = g6.f23175k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paintT0);
                }
                break;
            case 6:
                super.onDraw(canvas);
                oh.j0 j0Var = (oh.j0) this.f640b;
                gf.c0 c0Var = j0Var.G;
                float fMax = Math.max(j0Var.f19498b.f48497e, j0Var.f19499c.f48497e);
                gf.c0 c0Var2 = j0Var.F;
                c0Var2.c(AndroidUtilities.dp(42.0f) + j0Var.Q.f10490b, 0);
                c0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + j0Var.Q.f10490b);
                int i10 = g6.f22999a7;
                c0Var2.b(g6.l1(AndroidUtilities.lerp(1.0f, 0.8f, fMax), j0Var.getThemedColor(i10)));
                c0Var2.draw(canvas);
                if (j0Var.J) {
                    fMax = 1.0f;
                }
                int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + j0Var.Q.d, 0, fMax);
                int iLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, fMax) + j0Var.Q.d;
                float fLerp = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(j0Var.Q.d), fMax);
                c0Var.c(0, iLerp);
                c0Var.setBounds(0, getHeight() - iLerp2, getWidth(), getHeight());
                c0Var.b(g6.l1(fLerp, j0Var.getThemedColor(i10)));
                c0Var.draw(canvas);
                break;
            case 10:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.f640b;
                p2Var.f24865f4.setBounds(0, 0, getWidth(), getHeight());
                p2Var.f24865f4.draw(canvas);
                break;
            case 15:
                uq uqVar = (uq) this.f640b;
                if (uqVar.V) {
                    canvas.drawRect(((org.telegram.ui.ActionBar.e3) uqVar).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) uqVar).backgroundPaddingLeft, 1.0f, g6.f23175k0);
                }
                break;
            case 19:
                super.onDraw(canvas);
                ((ht0) this.f640b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                break;
            case 22:
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                dp0 dp0Var = (dp0) this.f640b;
                RectF rectF = dp0Var.h;
                Paint paint2 = dp0Var.f32252f;
                if (offsetColor != 0) {
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP));
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint2);
                break;
            case 23:
                zu0 zu0Var = (zu0) this.f640b;
                if (zu0Var.f35368b != null && !zu0Var.F) {
                    Drawable newDrawable = zu0Var.getNewDrawable();
                    boolean newDrawableMotion = zu0Var.getNewDrawableMotion();
                    Drawable drawable2 = zu0Var.f35368b;
                    if (newDrawable != drawable2 && newDrawable != null) {
                        if (g6.sl != null) {
                            zu0Var.d = drawable2;
                            zu0Var.f35373e = zu0Var.f35370c;
                        }
                        if (newDrawable instanceof nb0) {
                            ((nb0) newDrawable).r(zu0Var.H);
                        }
                        zu0Var.f35368b = newDrawable;
                        if (zu0Var.I && (newDrawable instanceof un)) {
                            ((un) newDrawable).f(this);
                        }
                        if (zu0Var.I) {
                            Drawable drawable3 = zu0Var.f35368b;
                            if (drawable3 instanceof nb0) {
                                ((nb0) drawable3).k();
                            }
                        }
                        zu0Var.f35370c = newDrawableMotion;
                        zu0Var.f35378h0 = 0.0f;
                        zu0Var.U(zu0Var.f35368b);
                        zu0Var.I();
                    } else if (zu0Var.f35370c != newDrawableMotion) {
                        zu0Var.f35370c = newDrawableMotion;
                        zu0Var.I();
                    }
                    zu0Var.f35378h0 = Utilities.clamp((AndroidUtilities.screenRefreshTime / 200.0f) + zu0Var.f35378h0, 1.0f, 0.0f);
                    int i11 = 0;
                    while (i11 < 2) {
                        Drawable drawable4 = i11 == 0 ? zu0Var.d : zu0Var.f35368b;
                        if (drawable4 != null) {
                            if (i11 != 1 || zu0Var.d == null || zu0Var.C == null) {
                                drawable4.setAlpha(255);
                            } else {
                                drawable4.setAlpha((int) (zu0Var.f35378h0 * 255.0f));
                            }
                            if (i11 == 0 ? zu0Var.f35373e : zu0Var.f35370c) {
                                f10 = zu0Var.f35391y;
                                f11 = zu0Var.f35389w;
                                f12 = zu0Var.f35390x;
                            } else {
                                f10 = 1.0f;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                            if (drawable4 instanceof nb0) {
                                nb0 nb0Var = (nb0) drawable4;
                                if (nb0Var.f30939u != null) {
                                    int currentActionBarHeight = (zu0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((zu0Var.Q() && zu0Var.f35388s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight = zu0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight : getHeight();
                                    f13 = 1.0f;
                                    float fMax2 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight / drawable4.getIntrinsicHeight());
                                    int iCeil = (int) Math.ceil(drawable4.getIntrinsicWidth() * fMax2 * f10);
                                    int iCeil2 = (int) Math.ceil(drawable4.getIntrinsicHeight() * fMax2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - iCeil) / 2) + ((int) f11);
                                    int i12 = ((measuredHeight - iCeil2) / 2) + zu0Var.A + currentActionBarHeight + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight, iCeil, getMeasuredHeight() - zu0Var.h);
                                    drawable4.setBounds(measuredWidth, i12, iCeil + measuredWidth, iCeil2 + i12);
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = 1.0f;
                                    if (zu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - zu0Var.h);
                                    }
                                    nb0Var.f30925f = zu0Var.A;
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - zu0Var.A) + f12));
                                    drawable4.draw(canvas);
                                    if (zu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = 1.0f;
                                if (drawable4 instanceof ColorDrawable) {
                                    if (zu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - zu0Var.h);
                                    }
                                    drawable4.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    if (zu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable4 instanceof GradientDrawable) {
                                    if (zu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - zu0Var.h);
                                    }
                                    drawable4.setBounds(0, zu0Var.A, getMeasuredWidth(), getRootView().getMeasuredHeight() + zu0Var.A);
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    if (zu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (!(drawable4 instanceof BitmapDrawable)) {
                                    if (zu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - zu0Var.h);
                                    }
                                    if (drawable4 instanceof un) {
                                        un unVar = (un) drawable4;
                                        unVar.f43255b = this;
                                        nb0 nb0Var2 = unVar.f43258f;
                                        if (nb0Var2 != null) {
                                            nb0Var2.r(this);
                                        }
                                    }
                                    float f15 = f10 - 1.0f;
                                    float fD = a9.p.d(-getMeasuredWidth(), f15, 2.0f, f11);
                                    float fD2 = a9.p.d(-getRootView().getMeasuredHeight(), f15, 2.0f, f12);
                                    drawable4.setBounds((int) fD, (int) (zu0Var.A + fD2), (int) ((getMeasuredWidth() * f10) + fD), (int) com.google.android.recaptcha.internal.a.d(getRootView().getMeasuredHeight(), f10, zu0Var.A, fD2));
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    if (zu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (((BitmapDrawable) drawable4).getTileModeX() == Shader.TileMode.REPEAT) {
                                    canvas.save();
                                    float f16 = 2.0f / AndroidUtilities.density;
                                    canvas.scale(f16, f16);
                                    drawable4.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f16), (int) Math.ceil(getRootView().getMeasuredHeight() / f16));
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    int currentActionBarHeight2 = (zu0Var.P() ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : 0) + ((zu0Var.Q() && zu0Var.f35388s) ? AndroidUtilities.statusBarHeight : 0);
                                    int measuredHeight2 = zu0Var.Y() ? getRootView().getMeasuredHeight() - currentActionBarHeight2 : getHeight();
                                    float fMax3 = Math.max(getMeasuredWidth() / drawable4.getIntrinsicWidth(), measuredHeight2 / drawable4.getIntrinsicHeight());
                                    int iCeil3 = (int) Math.ceil(drawable4.getIntrinsicWidth() * fMax3 * f10);
                                    int iCeil4 = (int) Math.ceil(drawable4.getIntrinsicHeight() * fMax3 * f10);
                                    int measuredWidth2 = ((getMeasuredWidth() - iCeil3) / 2) + ((int) f11);
                                    int i13 = ((measuredHeight2 - iCeil4) / 2) + zu0Var.A + currentActionBarHeight2 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, currentActionBarHeight2, iCeil3, getMeasuredHeight() - zu0Var.h);
                                    drawable4.setBounds(measuredWidth2, i13, iCeil3 + measuredWidth2, iCeil4 + i13);
                                    drawable4.draw(canvas);
                                    zu0.G(zu0Var, canvas);
                                    canvas.restore();
                                }
                            }
                            if (i11 == 0 && (drawable = zu0Var.d) != null && zu0Var.f35378h0 >= f13) {
                                if (zu0Var.I && (drawable instanceof un)) {
                                    ((un) drawable).g(zu0Var.H);
                                }
                                if (zu0Var.I) {
                                    Drawable drawable5 = zu0Var.d;
                                    if (drawable5 instanceof nb0) {
                                        ((nb0) drawable5).l();
                                    }
                                }
                                zu0Var.d = null;
                                zu0Var.f35373e = false;
                                zu0Var.I();
                                zu0Var.H.invalidate();
                            }
                        }
                        i11++;
                    }
                    if (zu0Var.f35378h0 != 1.0f) {
                        zu0Var.H.invalidate();
                    }
                    break;
                }
                break;
            case 25:
                super.onDraw(canvas);
                int iW0 = g6.w0(null, g6.Vi, false);
                ox0 ox0Var = (ox0) this.f640b;
                org.telegram.ui.Components.voip.h hVar = ox0Var.H;
                Paint paint3 = ox0Var.f31434a;
                paint3.setColor(iW0);
                Paint paint4 = ox0Var.f31435b;
                paint4.setColor(iW0);
                Paint paint5 = ox0Var.f31436c;
                paint5.setColor(iW0);
                paint4.setAlpha(255);
                paint5.setAlpha(82);
                paint3.setAlpha(46);
                Paint paint6 = ox0Var.d;
                paint6.setColor(g6.w0(null, g6.f23053d6, false));
                canvas.drawLine(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), paint3);
                boolean z10 = ox0Var.f31437e;
                if (z10 || ox0Var.F != 0.0f) {
                    if (!z10) {
                        float f17 = ox0Var.F - 0.10666667f;
                        ox0Var.F = f17;
                        if (f17 < 0.0f) {
                            ox0Var.F = 0.0f;
                        }
                    } else if (ox0Var.G) {
                        float f18 = ox0Var.F + 0.024615385f;
                        ox0Var.F = f18;
                        if (f18 > 1.0f) {
                            ox0Var.F = 1.0f;
                            ox0Var.G = false;
                        }
                    } else {
                        float f19 = ox0Var.F - 0.024615385f;
                        ox0Var.F = f19;
                        if (f19 < 0.0f) {
                            ox0Var.F = 0.0f;
                            ox0Var.G = true;
                        }
                    }
                    invalidate();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(17.0f), getMeasuredWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(23.0f));
                    hVar.f33591f = getMeasuredWidth();
                    hVar.a(AndroidUtilities.dp(3.0f), canvas, rectF2, null);
                }
                int iDp = AndroidUtilities.dp(24.0f);
                if (ox0Var.f31437e) {
                    paint = paint6;
                    f14 = 1.0f;
                } else {
                    int iZ = (int) (rl.z(24.0f, 2, getMeasuredWidth()) * ox0Var.B);
                    int iDp2 = AndroidUtilities.dp(24.0f) + iZ;
                    f14 = 1.0f;
                    canvas.drawLine(iDp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + iZ, AndroidUtilities.dp(20.0f), paint5);
                    canvas.drawRect(iDp2, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + iDp2, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint6);
                    paint = paint6;
                }
                if (!ox0Var.f31437e) {
                    int iZ2 = (int) (rl.z(24.0f, 2, getMeasuredWidth()) * ox0Var.A);
                    if (iZ2 < AndroidUtilities.dp(f14)) {
                        iZ2 = AndroidUtilities.dp(f14);
                    }
                    int iDp3 = AndroidUtilities.dp(24.0f) + iZ2;
                    canvas.drawLine(iDp, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + iZ2, AndroidUtilities.dp(20.0f), paint4);
                    canvas.drawRect(iDp3, AndroidUtilities.dp(20.0f) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f) + iDp3, AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(20.0f), paint);
                }
                break;
            case 26:
                if (getAlpha() != 0.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((org.telegram.ui.Components.voip.g1) this.f640b).f33572n.a(AndroidUtilities.dp(10.0f), canvas, rectF3, null);
                    invalidate();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        switch (this.f639a) {
            case 2:
                oa oaVar = (oa) this.f640b;
                if (oaVar.D) {
                    measuredHeight = (((org.telegram.ui.ActionBar.n2) oaVar).actionBar.getMeasuredHeight() + oaVar.E) - AndroidUtilities.dp(16.0f);
                } else {
                    int iDp = AndroidUtilities.dp(140.0f) + oaVar.E;
                    if (AndroidUtilities.dp(24.0f) + oaVar.f36350y.getMeasuredHeight() > iDp) {
                        iDp = AndroidUtilities.dp(24.0f) + oaVar.f36350y.getMeasuredHeight();
                    }
                    measuredHeight = iDp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight - (0 * 2.5f)), 1073741824));
                break;
            case 3:
            case 6:
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
                super.onMeasure(i10, i11);
                break;
            case 4:
                mh.g gVar = (mh.g) this.f640b;
                if (gVar.D) {
                    measuredHeight2 = (((org.telegram.ui.ActionBar.n2) gVar).actionBar.getMeasuredHeight() + gVar.E) - AndroidUtilities.dp(16.0f);
                } else {
                    int iDp2 = AndroidUtilities.dp(140.0f) + gVar.E;
                    if (AndroidUtilities.dp(24.0f) + gVar.f36350y.getMeasuredHeight() > iDp2) {
                        iDp2 = AndroidUtilities.dp(24.0f) + gVar.f36350y.getMeasuredHeight();
                    }
                    measuredHeight2 = iDp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight2 - (0 * 2.5f)), 1073741824));
                break;
            case 5:
                nh.k kVar = (nh.k) this.f640b;
                if (kVar.D) {
                    measuredHeight3 = (((org.telegram.ui.ActionBar.n2) kVar).actionBar.getMeasuredHeight() + kVar.E) - AndroidUtilities.dp(16.0f);
                } else {
                    int iDp3 = AndroidUtilities.dp(140.0f) + kVar.E;
                    if (AndroidUtilities.dp(24.0f) + kVar.f36350y.getMeasuredHeight() > iDp3) {
                        iDp3 = AndroidUtilities.dp(24.0f) + kVar.f36350y.getMeasuredHeight();
                    }
                    measuredHeight3 = iDp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight3 - (0 * 2.5f)), 1073741824));
                break;
            case 7:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.navigationBarHeight);
                setTranslationY(AndroidUtilities.navigationBarHeight);
                break;
            case 8:
                f2.k0 k0Var = ((p5) this.f640b).d.B;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, k0Var instanceof dz ? ((dz) k0Var).J : 0), 1073741824));
                break;
            case 11:
                qa qaVar = (qa) this.f640b;
                int i12 = qaVar.h;
                int iDp4 = (i12 == 0 ? AndroidUtilities.dp(300.0f) : (int) (i12 * qaVar.v)) - (((qaVar.C - qaVar.D) - qaVar.E) - qaVar.F);
                if (iDp4 < 1) {
                    iDp4 = 1;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iDp4, 1073741824));
                break;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((ul) this.f640b).v.F, 1073741824));
                break;
            case 13:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((gn) this.f640b).d.N0);
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(((jn) ((w7) this.f640b).d).f29741w, 1073741824));
                break;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((pz0) this.f640b).l()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((pz0) this.f640b).j()), AndroidUtilities.dp(26.0f)), 1073741824));
                break;
            case 17:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + ((j60) this.f640b).f29637c.f31524k0, 1073741824));
                break;
            case 18:
                int iDp5 = AndroidUtilities.dp(48.0f);
                p60 p60Var = ((l60) this.f640b).f30305n;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iDp5 + p60Var.f31524k0 + p60Var.f31529q0, 1073741824));
                break;
            case 21:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((op0) this.f640b).G.F.R, 1073741824));
                break;
            case 24:
                xv0 xv0Var = (xv0) this.f640b;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f);
                gw0 gw0Var = xv0Var.d;
                int i13 = gw0Var.f28838c3;
                int iMax = Math.max(i13 > 0 ? AndroidUtilities.dp(4.0f) + i13 : 0, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((xv0Var.h() - 1) * size2), xv0Var.d.T2 * size2)));
                gw0Var.f28837b3 = iMax;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), i11);
                break;
            case 25:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                break;
            case 28:
                a20 a20Var = (a20) this.f640b;
                if (a20Var.D) {
                    a20Var.F = (((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getMeasuredHeight() + a20Var.E) - AndroidUtilities.dp(16.0f);
                } else {
                    int iDp6 = AndroidUtilities.dp(140.0f) + a20Var.E;
                    if (AndroidUtilities.dp(24.0f) + a20Var.f36350y.getMeasuredHeight() > iDp6) {
                        iDp6 = Math.max(iDp6, (AndroidUtilities.dp(24.0f) + a20Var.f36350y.getMeasuredHeight()) - a20Var.H);
                    }
                    a20Var.F = iDp6;
                }
                int i14 = (int) (a20Var.F - (0 * 2.5f));
                a20Var.F = i14;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                break;
            case 29:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f639a) {
            case 26:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.voip.g1) this.f640b).f33572n.f33591f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f639a) {
            case 9:
                super.setAlpha(f10);
                View view = ((c8) this.f640b).f36993b.f37662x.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 27:
                super.setAlpha(f10);
                View view2 = ((gy) this.f640b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        switch (this.f639a) {
            case 1:
                if (((gh.g2) this.f640b) != null) {
                    if (isAttachedToWindow()) {
                        gh.g2 g2Var = (gh.g2) this.f640b;
                        if (g2Var.f7268i) {
                            g2Var.f7268i = false;
                            g2Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(g2Var.h);
                        }
                    }
                    this.f640b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof gh.g2) {
                    this.f640b = (gh.g2) drawable;
                    if (isAttachedToWindow()) {
                        gh.g2 g2Var2 = (gh.g2) this.f640b;
                        if (!g2Var2.f7268i) {
                            g2Var2.f7268i = true;
                            g2Var2.a();
                            n0 n0Var = new n0(g2Var2, 9);
                            g2Var2.h = n0Var;
                            LiteMode.addOnPowerSaverAppliedListener(n0Var);
                        }
                    }
                }
                break;
            default:
                super.setBackground(drawable);
                break;
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f639a) {
            case 22:
                super.setTranslationX(f10);
                invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f639a) {
            case 11:
                super.setTranslationY(f10);
                ((org.telegram.ui.ActionBar.e3) ((qa) this.f640b)).containerView.invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    public s0(Object obj, Context context, int i10) {
        super(context);
        this.f639a = i10;
        this.f640b = obj;
    }

    public s0(qa qaVar, Context context) {
        super(context);
        this.f639a = 11;
        this.f640b = qaVar;
        setTag(-33024);
    }

    public s0(Context context, c50 c50Var) {
        super(context);
        this.f639a = 29;
        this.f640b = c50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new xh0(28, this, context));
    }
}
