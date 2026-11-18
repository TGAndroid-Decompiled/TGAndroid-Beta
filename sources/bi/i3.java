package bi;

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
import di.pb;
import hi.ja;
import hi.ta;
import hi.v9;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.dq0;
import org.telegram.ui.en;
public final class i3 extends View {
    public final int f3722a;
    public Object f3723b;

    public i3(int i7, Context context, Object obj) {
        super(context);
        this.f3722a = i7;
        this.f3723b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3722a) {
            case 2:
                super.dispatchDraw(canvas);
                hi.f5 f5Var = ((v9) this.f3723b).f14939y0;
                if (f5Var != null) {
                    f5Var.d(canvas);
                    return;
                }
                return;
            case 3:
                canvas.save();
                ta taVar = (ta) this.f3723b;
                canvas.translate(taVar.f15436d1.getX() + taVar.m0.getX(), taVar.f15436d1.getY() + taVar.m0.getY());
                ja jaVar = taVar.f15436d1;
                jaVar.k(canvas, jaVar.getBounds(), taVar.f15436d1.getOver2Alpha());
                canvas.restore();
                return;
            case 4:
            case 5:
            default:
                super.dispatchDraw(canvas);
                return;
            case 6:
                dh.d dVar = ((jh.f) this.f3723b).L;
                if (dVar != null) {
                    dVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3722a) {
            case 19:
                super.draw(canvas);
                ((vy0) this.f3723b).e(canvas, (getMeasuredWidth() - ((vy0) this.f3723b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 23:
                super.draw(canvas);
                yo0 yo0Var = (yo0) this.f3723b;
                yo0Var.R2.setBounds(0, (getMeasuredHeight() - yo0Var.C2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                yo0Var.R2.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f3722a) {
            case 27:
                super.invalidate();
                ((au0) this.f3723b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f3722a) {
            case 0:
                super.onAttachedToWindow();
                h3 h3Var = (h3) this.f3723b;
                if (h3Var != null && !h3Var.f3695i) {
                    h3Var.f3695i = true;
                    h3Var.a();
                    ai.g0 g0Var = new ai.g0(h3Var, 1);
                    h3Var.h = g0Var;
                    pc.a(g0Var);
                    return;
                }
                return;
            case 5:
                super.onAttachedToWindow();
                ((jg.n1) this.f3723b).f17602f = true;
                return;
            case 10:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f3723b).f32833l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3722a) {
            case 0:
                super.onDetachedFromWindow();
                h3 h3Var = (h3) this.f3723b;
                if (h3Var != null && h3Var.f3695i) {
                    h3Var.f3695i = false;
                    h3Var.a();
                    ai.g0 g0Var = h3Var.h;
                    HashSet hashSet = pc.f26226n;
                    if (hashSet != null) {
                        hashSet.remove(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.onDetachedFromWindow();
                ((jg.n1) this.f3723b).f17602f = false;
                return;
            case 10:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f3723b).f32833l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        cr crVar;
        Drawable drawable;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i7;
        int i10;
        int height;
        Drawable drawable2;
        int i11;
        int i12;
        int height2;
        float f14;
        Paint paint;
        int B;
        switch (this.f3722a) {
            case 8:
                super.onDraw(canvas);
                li.d0 d0Var = (li.d0) this.f3723b;
                bg.d0 d0Var2 = d0Var.F1;
                float max = Math.max(d0Var.f19904m1.f57657e, d0Var.n1.f57657e);
                bg.d0 d0Var3 = d0Var.E1;
                d0Var3.c(org.telegram.messenger.g0.L(42.0f) + d0Var.P1.f15893b, 0);
                d0Var3.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + d0Var.P1.f15893b);
                int i13 = org.telegram.ui.ActionBar.n6.f29339a7;
                d0Var3.b(org.telegram.ui.ActionBar.n6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.n6.w0(i13, d0Var.J0)));
                d0Var3.draw(canvas);
                if (d0Var.I1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + d0Var.P1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + d0Var.P1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(d0Var.P1.d), max);
                d0Var2.c(0, W1);
                d0Var2.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                d0Var2.b(org.telegram.ui.ActionBar.n6.r1(T1, org.telegram.ui.ActionBar.n6.w0(i13, d0Var.J0)));
                d0Var2.draw(canvas);
                return;
            case 9:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((oi.p0) this.f3723b).f22234c.draw(canvas);
                canvas.restore();
                return;
            case 10:
                int L = org.telegram.messenger.g0.L(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f3723b;
                checkBoxBase.e((getWidth() - L) / 2, (getHeight() - L) / 2, L, L);
                checkBoxBase.a(canvas);
                return;
            case 13:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.f3723b;
                t2Var.o4.setBounds(0, 0, getWidth(), getHeight());
                t2Var.o4.draw(canvas);
                return;
            case 18:
                if (((cr) this.f3723b).V1) {
                    canvas.drawRect(crVar.f30227u0, 0.0f, getMeasuredWidth() - crVar.f30227u0, 1.0f, org.telegram.ui.ActionBar.n6.f29519k0);
                    return;
                }
                return;
            case 22:
                super.onDraw(canvas);
                ((dq0) this.f3723b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 25:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                mo0 mo0Var = (mo0) this.f3723b;
                mo0Var.getClass();
                if (S0 != 0) {
                    mo0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    mo0Var.f37595n.setShader(mo0Var.h);
                }
                mo0Var.f37596r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(mo0Var.f37596r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), mo0Var.f37595n);
                return;
            case 27:
                au0 au0Var = (au0) this.f3723b;
                if (au0Var.f33456b != null && !au0Var.K) {
                    Drawable newDrawable = au0Var.getNewDrawable();
                    boolean newDrawableMotion = au0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != au0Var.f33456b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.n6.h1()) {
                            au0Var.d = au0Var.f33456b;
                            au0Var.f33461e = au0Var.f33458c;
                        }
                        if (newDrawable instanceof bb0) {
                            ((bb0) newDrawable).q(au0Var.M);
                        }
                        au0Var.f33456b = newDrawable;
                        if (au0Var.N && (newDrawable instanceof en)) {
                            ((en) newDrawable).f(this);
                        }
                        if (au0Var.N) {
                            Drawable drawable3 = au0Var.f33456b;
                            if (drawable3 instanceof bb0) {
                                ((bb0) drawable3).k();
                            }
                        }
                        au0Var.f33458c = newDrawableMotion;
                        au0Var.U = 0.0f;
                        au0Var.T(au0Var.f33456b);
                        au0Var.G();
                    } else if (au0Var.f33458c != newDrawableMotion) {
                        au0Var.f33458c = newDrawableMotion;
                        au0Var.G();
                    }
                    float f16 = 1.0f;
                    au0Var.U = Utilities.i((org.telegram.messenger.g0.f24124t / 200.0f) + au0Var.U, 1.0f, 0.0f);
                    int i14 = 0;
                    while (i14 < 2) {
                        if (i14 == 0) {
                            drawable = au0Var.d;
                        } else {
                            drawable = au0Var.f33456b;
                        }
                        if (drawable == null) {
                            f13 = f16;
                        } else {
                            boolean z11 = true;
                            if (i14 == 1 && au0Var.d != null && au0Var.H != null) {
                                drawable.setAlpha((int) (au0Var.U * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i14 == 0) {
                                z10 = au0Var.f33461e;
                            } else {
                                z10 = au0Var.f33458c;
                            }
                            if (z10) {
                                f10 = au0Var.E;
                                f11 = au0Var.f33468x;
                                f12 = au0Var.f33469y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable instanceof bb0) {
                                bb0 bb0Var = (bb0) drawable;
                                if (bb0Var.f33645u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (au0Var.O()) {
                                        i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i11 = 0;
                                    }
                                    if (au0Var.P() && au0Var.f33466s) {
                                        i12 = org.telegram.messenger.g0.f24115m;
                                    } else {
                                        i12 = 0;
                                    }
                                    int i15 = i11 + i12;
                                    if (au0Var.W()) {
                                        height2 = getRootView().getMeasuredHeight() - i15;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i16 = ((height2 - ceil2) / 2) + au0Var.F + i15 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, i15, ceil, getMeasuredHeight() - au0Var.h);
                                    drawable.setBounds(measuredWidth, i16, ceil + measuredWidth, ceil2 + i16);
                                    drawable.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (au0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - au0Var.h);
                                    }
                                    bb0Var.f33631f = au0Var.F;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - au0Var.F) + f12));
                                    drawable.draw(canvas);
                                    if (au0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable instanceof ColorDrawable) {
                                    if (au0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - au0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    if (au0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (au0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - au0Var.h);
                                    }
                                    drawable.setBounds(0, au0Var.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + au0Var.F);
                                    drawable.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    if (au0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f17 = 2.0f / org.telegram.messenger.g0.f24120p;
                                        canvas.scale(f17, f17);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f17), (int) Math.ceil(getRootView().getMeasuredHeight() / f17));
                                        drawable.draw(canvas);
                                        au0.F(au0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (au0Var.O()) {
                                            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i7 = 0;
                                        }
                                        if (au0Var.P() && au0Var.f33466s) {
                                            i10 = org.telegram.messenger.g0.f24115m;
                                        } else {
                                            i10 = 0;
                                        }
                                        int i17 = i7 + i10;
                                        if (au0Var.W()) {
                                            height = getRootView().getMeasuredHeight() - i17;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f10);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f10);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                        int i18 = ((height - ceil4) / 2) + au0Var.F + i17 + ((int) f12);
                                        canvas.save();
                                        canvas.clipRect(0, i17, ceil3, getMeasuredHeight() - au0Var.h);
                                        drawable.setBounds(measuredWidth2, i18, ceil3 + measuredWidth2, ceil4 + i18);
                                        drawable.draw(canvas);
                                        au0.F(au0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (au0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - au0Var.h);
                                    }
                                    if (drawable instanceof en) {
                                        en enVar = (en) drawable;
                                        enVar.f47304b = this;
                                        bb0 bb0Var2 = enVar.f47307f;
                                        if (bb0Var2 != null) {
                                            bb0Var2.q(this);
                                        }
                                    }
                                    float f18 = f10 - f13;
                                    float f19 = a8.p0.f(-getMeasuredWidth(), f18, 2.0f, f11);
                                    float f20 = a8.p0.f(-getRootView().getMeasuredHeight(), f18, 2.0f, f12);
                                    drawable.setBounds((int) f19, (int) (au0Var.F + f20), (int) ((getMeasuredWidth() * f10) + f19), (int) p5.c.e(getRootView().getMeasuredHeight(), f10, au0Var.F, f20));
                                    drawable.draw(canvas);
                                    au0.F(au0Var, canvas);
                                    if (au0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i14 == 0 && (drawable2 = au0Var.d) != null && au0Var.U >= f13) {
                                if (au0Var.N && (drawable2 instanceof en)) {
                                    ((en) drawable2).g(au0Var.M);
                                }
                                if (au0Var.N) {
                                    Drawable drawable4 = au0Var.d;
                                    if (drawable4 instanceof bb0) {
                                        ((bb0) drawable4).l();
                                    }
                                }
                                au0Var.d = null;
                                au0Var.f33461e = false;
                                au0Var.G();
                                au0Var.M.invalidate();
                            }
                        }
                        i14++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (au0Var.U != f16) {
                        au0Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 29:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
                rw0 rw0Var = (rw0) this.f3723b;
                org.telegram.ui.Components.voip.n nVar = rw0Var.M;
                Paint paint2 = rw0Var.f39319a;
                paint2.setColor(x02);
                Paint paint3 = rw0Var.f39320b;
                paint3.setColor(x02);
                Paint paint4 = rw0Var.f39321c;
                paint4.setColor(x02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = rw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z12 = rw0Var.f39322e;
                if (z12 || rw0Var.K != 0.0f) {
                    if (z12) {
                        if (rw0Var.L) {
                            float f21 = rw0Var.K + 0.024615385f;
                            rw0Var.K = f21;
                            if (f21 > 1.0f) {
                                rw0Var.K = 1.0f;
                                rw0Var.L = false;
                            }
                        } else {
                            float f22 = rw0Var.K - 0.024615385f;
                            rw0Var.K = f22;
                            if (f22 < 0.0f) {
                                rw0Var.K = 0.0f;
                                rw0Var.L = true;
                            }
                        }
                    } else {
                        float f23 = rw0Var.K - 0.10666667f;
                        rw0Var.K = f23;
                        if (f23 < 0.0f) {
                            rw0Var.K = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    nVar.f41050f = getMeasuredWidth();
                    nVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (!rw0Var.f39322e) {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (n10.B(24.0f, 2, getMeasuredWidth()) * rw0Var.G));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + B, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                } else {
                    f14 = 1.0f;
                    paint = paint5;
                }
                if (!rw0Var.f39322e) {
                    int B2 = (int) (n10.B(24.0f, 2, getMeasuredWidth()) * rw0Var.F);
                    if (B2 < org.telegram.messenger.g0.L(f14)) {
                        B2 = org.telegram.messenger.g0.L(f14);
                    }
                    int L4 = org.telegram.messenger.g0.L(24.0f) + B2;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + B2, org.telegram.messenger.g0.L(20.0f), paint3);
                    canvas.drawRect(L4, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L4, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f3722a) {
            case 1:
                pb pbVar = (pb) this.f3723b;
                if (pbVar.I) {
                    i11 = (pbVar.p0().getMeasuredHeight() + pbVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + pbVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + pbVar.E.getMeasuredHeight() > L) {
                        L = org.telegram.messenger.g0.L(24.0f) + pbVar.E.getMeasuredHeight();
                    }
                    i11 = L;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i11 - (0 * 2.5f)), 1073741824));
                return;
            case 2:
            case 3:
            case 6:
            case 8:
            case 9:
            case 12:
            case 13:
            case 18:
            case 22:
            case 23:
            case 25:
            case 27:
            default:
                super.onMeasure(i7, i10);
                return;
            case 4:
                ii.t tVar = (ii.t) this.f3723b;
                if (tVar.I) {
                    i12 = (tVar.p0().getMeasuredHeight() + tVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.g0.L(140.0f) + tVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + tVar.E.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.g0.L(24.0f) + tVar.E.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 5:
                ((View) getParent()).getMeasuredHeight();
                jg.n1 n1Var = (jg.n1) this.f3723b;
                Integer num = n1Var.d;
                if (num != null) {
                    i13 = num.intValue();
                    n1Var.h = i13;
                } else {
                    i13 = 0;
                    n1Var.h = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                return;
            case 7:
                ki.k kVar = (ki.k) this.f3723b;
                if (kVar.I) {
                    i14 = (ki.k.E0(kVar).getMeasuredHeight() + kVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.g0.L(140.0f) + kVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + kVar.E.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.g0.L(24.0f) + kVar.E.getMeasuredHeight();
                    }
                    i14 = L3;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), 1073741824));
                return;
            case 10:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(24.0f));
                return;
            case 11:
                v4.c0 c0Var = ((org.telegram.ui.n5) this.f3723b).d.G;
                if (c0Var instanceof wy) {
                    i15 = ((wy) c0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 14:
                sa saVar = (sa) this.f3723b;
                int i18 = saVar.f39537r1;
                if (i18 == 0) {
                    i16 = org.telegram.messenger.g0.L(300.0f);
                } else {
                    i16 = (int) (i18 * saVar.f39541v1);
                }
                int i19 = i16 - (((saVar.B1 - saVar.C1) - saVar.D1) - saVar.E1);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(((hm) this.f3723b).f35930w.K, 1073741824));
                return;
            case 16:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((rn) ((org.telegram.ui.l4) this.f3723b).f49426e).S0);
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(((sn) ((org.telegram.ui.y7) this.f3723b).d).f39792x, 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((vy0) this.f3723b).k()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((vy0) this.f3723b).i()), org.telegram.messenger.g0.L(26.0f)), 1073741824));
                return;
            case 20:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((b60) this.f3723b).f33569c.f36360j2, 1073741824));
                return;
            case 21:
                int L4 = org.telegram.messenger.g0.L(48.0f);
                j60 j60Var = ((d60) this.f3723b).f34288n;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L4 + j60Var.f36360j2 + j60Var.f36366p2, 1073741824));
                return;
            case 24:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((vo0) this.f3723b).L.F1.R, 1073741824));
                return;
            case 26:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((qt0) this.f3723b).getMeasuredHeight());
                return;
            case 28:
                zu0 zu0Var = (zu0) this.f3723b;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                iv0 iv0Var = zu0Var.d;
                int i20 = iv0Var.f36219o3;
                if (i20 > 0) {
                    i17 = org.telegram.messenger.g0.L(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((zu0Var.b() - 1) * size2), zu0Var.d.f36211f3 * size2)));
                iv0Var.f36218n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i10);
                return;
            case 29:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f3722a) {
            case 12:
                super.setAlpha(f10);
                View view = ((org.telegram.ui.d8) this.f3723b).f46890b.f47608y.fragmentView;
                if (view != null) {
                    view.invalidate();
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
        switch (this.f3722a) {
            case 0:
                if (((h3) this.f3723b) != null) {
                    if (isAttachedToWindow()) {
                        h3 h3Var = (h3) this.f3723b;
                        if (h3Var.f3695i) {
                            h3Var.f3695i = false;
                            h3Var.a();
                            ai.g0 g0Var = h3Var.h;
                            HashSet hashSet = pc.f26226n;
                            if (hashSet != null) {
                                hashSet.remove(g0Var);
                            }
                        }
                    }
                    this.f3723b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof h3) {
                    this.f3723b = (h3) drawable;
                    if (isAttachedToWindow()) {
                        h3 h3Var2 = (h3) this.f3723b;
                        if (!h3Var2.f3695i) {
                            h3Var2.f3695i = true;
                            h3Var2.a();
                            ai.g0 g0Var2 = new ai.g0(h3Var2, 1);
                            h3Var2.h = g0Var2;
                            pc.a(g0Var2);
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
        switch (this.f3722a) {
            case 25:
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
        switch (this.f3722a) {
            case 14:
                super.setTranslationY(f10);
                int i7 = sa.S1;
                ((sa) this.f3723b).f30192b.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public i3(Context context, int i7) {
        super(context);
        this.f3722a = i7;
    }

    public i3(sa saVar, Context context) {
        super(context);
        this.f3722a = 14;
        this.f3723b = saVar;
        setTag(-33024);
    }

    public i3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f3722a = 10;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, i6Var);
        this.f3723b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.n6.Yl, org.telegram.ui.ActionBar.n6.f29806z5, org.telegram.ui.ActionBar.n6.f29526k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
