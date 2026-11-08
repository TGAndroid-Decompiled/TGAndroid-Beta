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
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.cq0;
import org.telegram.ui.dn;
import org.telegram.ui.ww;
public final class ec extends View {
    public final int f3832a;
    public Object f3833b;

    public ec(int i7, Context context, Object obj) {
        super(context);
        this.f3832a = i7;
        this.f3833b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3832a) {
            case 1:
                super.dispatchDraw(canvas);
                fi.i5 i5Var = ((fi.x9) this.f3833b).f12555x0;
                if (i5Var != null) {
                    i5Var.d(canvas);
                    return;
                }
                return;
            case 2:
                canvas.save();
                fi.va vaVar = (fi.va) this.f3833b;
                canvas.translate(vaVar.f12944c1.getX() + vaVar.f12971l0.getX(), vaVar.f12944c1.getY() + vaVar.f12971l0.getY());
                fi.la laVar = vaVar.f12944c1;
                laVar.k(canvas, laVar.getBounds(), vaVar.f12944c1.getOver2Alpha());
                canvas.restore();
                return;
            case 7:
                dh.d dVar = ((jh.f) this.f3833b).I;
                if (dVar != null) {
                    dVar.draw(canvas);
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
        switch (this.f3832a) {
            case 18:
                super.draw(canvas);
                ((my0) this.f3833b).e(canvas, (getMeasuredWidth() - ((my0) this.f3833b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 22:
                super.draw(canvas);
                mo0 mo0Var = (mo0) this.f3833b;
                mo0Var.N2.setBounds(0, (getMeasuredHeight() - mo0Var.f36074y2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                mo0Var.N2.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f3832a) {
            case 26:
                super.invalidate();
                ((rt0) this.f3833b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f3832a) {
            case 6:
                super.onAttachedToWindow();
                ((jg.o1) this.f3833b).f16878f = true;
                return;
            case 9:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f3833b).f31258l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3832a) {
            case 6:
                super.onDetachedFromWindow();
                ((jg.o1) this.f3833b).f16878f = false;
                return;
            case 9:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f3833b).f31258l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        oq oqVar;
        Drawable drawable;
        boolean z9;
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
        int A;
        switch (this.f3832a) {
            case 5:
                super.onDraw(canvas);
                ii.d0 d0Var = (ii.d0) this.f3833b;
                bg.c0 c0Var = d0Var.B1;
                float max = Math.max(d0Var.f15503i1.f55487e, d0Var.f15504j1.f55487e);
                bg.c0 c0Var2 = d0Var.A1;
                c0Var2.c(org.telegram.messenger.g0.L(42.0f) + d0Var.L1.f15121b, 0);
                c0Var2.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + d0Var.L1.f15121b);
                int i13 = org.telegram.ui.ActionBar.k6.f27796a7;
                c0Var2.b(org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.k6.w0(i13, d0Var.I0)));
                c0Var2.draw(canvas);
                if (d0Var.E1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + d0Var.L1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + d0Var.L1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(d0Var.L1.d), max);
                c0Var.c(0, W1);
                c0Var.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                c0Var.b(org.telegram.ui.ActionBar.k6.r1(T1, org.telegram.ui.ActionBar.k6.w0(i13, d0Var.I0)));
                c0Var.draw(canvas);
                return;
            case 8:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((li.r0) this.f3833b).f18804c.draw(canvas);
                canvas.restore();
                return;
            case 9:
                int L = org.telegram.messenger.g0.L(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f3833b;
                checkBoxBase.e((getWidth() - L) / 2, (getHeight() - L) / 2, L, L);
                checkBoxBase.a(canvas);
                return;
            case 12:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.f3833b;
                t2Var.f30456n4.setBounds(0, 0, getWidth(), getHeight());
                t2Var.f30456n4.draw(canvas);
                return;
            case 17:
                if (((oq) this.f3833b).R1) {
                    canvas.drawRect(oqVar.f28649t0, 0.0f, getMeasuredWidth() - oqVar.f28649t0, 1.0f, org.telegram.ui.ActionBar.k6.f27975k0);
                    return;
                }
                return;
            case 21:
                super.onDraw(canvas);
                ((cq0) this.f3833b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 24:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                ao0 ao0Var = (ao0) this.f3833b;
                ao0Var.getClass();
                if (S0 != 0) {
                    ao0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    ao0Var.f31874n.setShader(ao0Var.h);
                }
                ao0Var.f31875r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(ao0Var.f31875r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), ao0Var.f31874n);
                return;
            case 26:
                rt0 rt0Var = (rt0) this.f3833b;
                if (rt0Var.f37762b != null && !rt0Var.J) {
                    Drawable newDrawable = rt0Var.getNewDrawable();
                    boolean newDrawableMotion = rt0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != rt0Var.f37762b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.k6.h1()) {
                            rt0Var.d = rt0Var.f37762b;
                            rt0Var.f37767e = rt0Var.f37764c;
                        }
                        if (newDrawable instanceof qa0) {
                            ((qa0) newDrawable).q(rt0Var.L);
                        }
                        rt0Var.f37762b = newDrawable;
                        if (rt0Var.M && (newDrawable instanceof dn)) {
                            ((dn) newDrawable).f(this);
                        }
                        if (rt0Var.M) {
                            Drawable drawable3 = rt0Var.f37762b;
                            if (drawable3 instanceof qa0) {
                                ((qa0) drawable3).k();
                            }
                        }
                        rt0Var.f37764c = newDrawableMotion;
                        rt0Var.T = 0.0f;
                        rt0Var.T(rt0Var.f37762b);
                        rt0Var.G();
                    } else if (rt0Var.f37764c != newDrawableMotion) {
                        rt0Var.f37764c = newDrawableMotion;
                        rt0Var.G();
                    }
                    float f16 = 1.0f;
                    rt0Var.T = Utilities.i((org.telegram.messenger.g0.f22566t / 200.0f) + rt0Var.T, 1.0f, 0.0f);
                    int i14 = 0;
                    while (i14 < 2) {
                        if (i14 == 0) {
                            drawable = rt0Var.d;
                        } else {
                            drawable = rt0Var.f37762b;
                        }
                        if (drawable == null) {
                            f13 = f16;
                        } else {
                            boolean z10 = true;
                            if (i14 == 1 && rt0Var.d != null && rt0Var.G != null) {
                                drawable.setAlpha((int) (rt0Var.T * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i14 == 0) {
                                z9 = rt0Var.f37767e;
                            } else {
                                z9 = rt0Var.f37764c;
                            }
                            if (z9) {
                                f10 = rt0Var.D;
                                f11 = rt0Var.f37773x;
                                f12 = rt0Var.f37774y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable instanceof qa0) {
                                qa0 qa0Var = (qa0) drawable;
                                if (qa0Var.f37270u == null) {
                                    z10 = false;
                                }
                                if (z10) {
                                    if (rt0Var.O()) {
                                        i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i11 = 0;
                                    }
                                    if (rt0Var.P() && rt0Var.f37771s) {
                                        i12 = org.telegram.messenger.g0.f22557m;
                                    } else {
                                        i12 = 0;
                                    }
                                    int i15 = i11 + i12;
                                    if (rt0Var.W()) {
                                        height2 = getRootView().getMeasuredHeight() - i15;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i16 = ((height2 - ceil2) / 2) + rt0Var.E + i15 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, i15, ceil, getMeasuredHeight() - rt0Var.h);
                                    drawable.setBounds(measuredWidth, i16, ceil + measuredWidth, ceil2 + i16);
                                    drawable.draw(canvas);
                                    rt0.F(rt0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (rt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - rt0Var.h);
                                    }
                                    qa0Var.f37256f = rt0Var.E;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - rt0Var.E) + f12));
                                    drawable.draw(canvas);
                                    if (rt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable instanceof ColorDrawable) {
                                    if (rt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - rt0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    rt0.F(rt0Var, canvas);
                                    if (rt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (rt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - rt0Var.h);
                                    }
                                    drawable.setBounds(0, rt0Var.E, getMeasuredWidth(), getRootView().getMeasuredHeight() + rt0Var.E);
                                    drawable.draw(canvas);
                                    rt0.F(rt0Var, canvas);
                                    if (rt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f17 = 2.0f / org.telegram.messenger.g0.f22562p;
                                        canvas.scale(f17, f17);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f17), (int) Math.ceil(getRootView().getMeasuredHeight() / f17));
                                        drawable.draw(canvas);
                                        rt0.F(rt0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (rt0Var.O()) {
                                            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i7 = 0;
                                        }
                                        if (rt0Var.P() && rt0Var.f37771s) {
                                            i10 = org.telegram.messenger.g0.f22557m;
                                        } else {
                                            i10 = 0;
                                        }
                                        int i17 = i7 + i10;
                                        if (rt0Var.W()) {
                                            height = getRootView().getMeasuredHeight() - i17;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f10);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f10);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                        int i18 = ((height - ceil4) / 2) + rt0Var.E + i17 + ((int) f12);
                                        canvas.save();
                                        canvas.clipRect(0, i17, ceil3, getMeasuredHeight() - rt0Var.h);
                                        drawable.setBounds(measuredWidth2, i18, ceil3 + measuredWidth2, ceil4 + i18);
                                        drawable.draw(canvas);
                                        rt0.F(rt0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (rt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - rt0Var.h);
                                    }
                                    if (drawable instanceof dn) {
                                        dn dnVar = (dn) drawable;
                                        dnVar.f45106b = this;
                                        qa0 qa0Var2 = dnVar.f45109f;
                                        if (qa0Var2 != null) {
                                            qa0Var2.q(this);
                                        }
                                    }
                                    float f18 = f10 - f13;
                                    float f19 = a8.p0.f(-getMeasuredWidth(), f18, 2.0f, f11);
                                    float f20 = a8.p0.f(-getRootView().getMeasuredHeight(), f18, 2.0f, f12);
                                    drawable.setBounds((int) f19, (int) (rt0Var.E + f20), (int) ((getMeasuredWidth() * f10) + f19), (int) rf.b.d(getRootView().getMeasuredHeight(), f10, rt0Var.E, f20));
                                    drawable.draw(canvas);
                                    rt0.F(rt0Var, canvas);
                                    if (rt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i14 == 0 && (drawable2 = rt0Var.d) != null && rt0Var.T >= f13) {
                                if (rt0Var.M && (drawable2 instanceof dn)) {
                                    ((dn) drawable2).g(rt0Var.L);
                                }
                                if (rt0Var.M) {
                                    Drawable drawable4 = rt0Var.d;
                                    if (drawable4 instanceof qa0) {
                                        ((qa0) drawable4).l();
                                    }
                                }
                                rt0Var.d = null;
                                rt0Var.f37767e = false;
                                rt0Var.G();
                                rt0Var.L.invalidate();
                            }
                        }
                        i14++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (rt0Var.T != f16) {
                        rt0Var.L.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                hw0 hw0Var = (hw0) this.f3833b;
                org.telegram.ui.Components.voip.n nVar = hw0Var.L;
                Paint paint2 = hw0Var.f34368a;
                paint2.setColor(x02);
                Paint paint3 = hw0Var.f34369b;
                paint3.setColor(x02);
                Paint paint4 = hw0Var.f34370c;
                paint4.setColor(x02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = hw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z11 = hw0Var.f34371e;
                if (z11 || hw0Var.J != 0.0f) {
                    if (z11) {
                        if (hw0Var.K) {
                            float f21 = hw0Var.J + 0.024615385f;
                            hw0Var.J = f21;
                            if (f21 > 1.0f) {
                                hw0Var.J = 1.0f;
                                hw0Var.K = false;
                            }
                        } else {
                            float f22 = hw0Var.J - 0.024615385f;
                            hw0Var.J = f22;
                            if (f22 < 0.0f) {
                                hw0Var.J = 0.0f;
                                hw0Var.K = true;
                            }
                        }
                    } else {
                        float f23 = hw0Var.J - 0.10666667f;
                        hw0Var.J = f23;
                        if (f23 < 0.0f) {
                            hw0Var.J = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    nVar.f39374f = getMeasuredWidth();
                    nVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (!hw0Var.f34371e) {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (org.telegram.messenger.camera.q.A(24.0f, 2, getMeasuredWidth()) * hw0Var.F));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + A, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                } else {
                    f14 = 1.0f;
                    paint = paint5;
                }
                if (!hw0Var.f34371e) {
                    int A2 = (int) (org.telegram.messenger.camera.q.A(24.0f, 2, getMeasuredWidth()) * hw0Var.E);
                    if (A2 < org.telegram.messenger.g0.L(f14)) {
                        A2 = org.telegram.messenger.g0.L(f14);
                    }
                    int L4 = org.telegram.messenger.g0.L(24.0f) + A2;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + A2, org.telegram.messenger.g0.L(20.0f), paint3);
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
        switch (this.f3832a) {
            case 0:
                dd ddVar = (dd) this.f3833b;
                if (ddVar.H) {
                    i11 = (ddVar.p0().getMeasuredHeight() + ddVar.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + ddVar.I;
                    if (org.telegram.messenger.g0.L(24.0f) + ddVar.D.getMeasuredHeight() > L) {
                        L = org.telegram.messenger.g0.L(24.0f) + ddVar.D.getMeasuredHeight();
                    }
                    i11 = L;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i11 - (0 * 2.5f)), 1073741824));
                return;
            case 1:
            case 2:
            case 5:
            case 7:
            case 8:
            case 11:
            case 12:
            case 17:
            case 21:
            case 22:
            case 24:
            case 26:
            default:
                super.onMeasure(i7, i10);
                return;
            case 3:
                gi.f fVar = (gi.f) this.f3833b;
                if (fVar.H) {
                    i12 = (fVar.p0().getMeasuredHeight() + fVar.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.g0.L(140.0f) + fVar.I;
                    if (org.telegram.messenger.g0.L(24.0f) + fVar.D.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.g0.L(24.0f) + fVar.D.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 4:
                hi.j jVar = (hi.j) this.f3833b;
                if (jVar.H) {
                    i13 = (hi.j.E0(jVar).getMeasuredHeight() + jVar.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.g0.L(140.0f) + jVar.I;
                    if (org.telegram.messenger.g0.L(24.0f) + jVar.D.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.g0.L(24.0f) + jVar.D.getMeasuredHeight();
                    }
                    i13 = L3;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 6:
                ((View) getParent()).getMeasuredHeight();
                jg.o1 o1Var = (jg.o1) this.f3833b;
                Integer num = o1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    o1Var.h = i14;
                } else {
                    i14 = 0;
                    o1Var.h = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            case 9:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(24.0f));
                return;
            case 10:
                v4.b0 b0Var = ((org.telegram.ui.n5) this.f3833b).d.F;
                if (b0Var instanceof my) {
                    i15 = ((my) b0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 13:
                org.telegram.ui.Components.na naVar = (org.telegram.ui.Components.na) this.f3833b;
                int i18 = naVar.n1;
                if (i18 == 0) {
                    i16 = org.telegram.messenger.g0.L(300.0f);
                } else {
                    i16 = (int) (i18 * naVar.f36282r1);
                }
                int i19 = i16 - (((naVar.f36288x1 - naVar.f36289y1) - naVar.f36290z1) - naVar.A1);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(((tl) this.f3833b).f38386w.J, 1073741824));
                return;
            case 15:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((bn) ((org.telegram.ui.l4) this.f3833b).f47410e).R0);
                return;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(((cn) ((org.telegram.ui.x7) this.f3833b).d).f32638x, 1073741824));
                return;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((my0) this.f3833b).k()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((my0) this.f3833b).i()), org.telegram.messenger.g0.L(26.0f)), 1073741824));
                return;
            case 19:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((q50) this.f3833b).f37199c.f40216f2, 1073741824));
                return;
            case 20:
                int L4 = org.telegram.messenger.g0.L(48.0f);
                x50 x50Var = ((s50) this.f3833b).f37929n;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L4 + x50Var.f40216f2 + x50Var.f40222l2, 1073741824));
                return;
            case 23:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((jo0) this.f3833b).K.B1.R, 1073741824));
                return;
            case 25:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((ht0) this.f3833b).getMeasuredHeight());
                return;
            case 27:
                pu0 pu0Var = (pu0) this.f3833b;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                yu0 yu0Var = pu0Var.d;
                int i20 = yu0Var.f40762n3;
                if (i20 > 0) {
                    i17 = org.telegram.messenger.g0.L(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((pu0Var.b() - 1) * size2), pu0Var.d.f40754e3 * size2)));
                yu0Var.f40761m3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i10);
                return;
            case 28:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f3832a) {
            case 11:
                super.setAlpha(f10);
                View view = ((org.telegram.ui.c8) this.f3833b).f44715b.f45231y.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 29:
                super.setAlpha(f10);
                View view2 = ((ww) this.f3833b).fragmentView;
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
    public void setTranslationX(float f10) {
        switch (this.f3832a) {
            case 24:
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
        switch (this.f3832a) {
            case 13:
                super.setTranslationY(f10);
                int i7 = org.telegram.ui.Components.na.O1;
                ((org.telegram.ui.Components.na) this.f3833b).f28619b.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public ec(Context context) {
        super(context);
        this.f3832a = 18;
    }

    public ec(org.telegram.ui.Components.na naVar, Context context) {
        super(context);
        this.f3832a = 13;
        this.f3833b = naVar;
        setTag(-33024);
    }

    public ec(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3832a = 9;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, f6Var);
        this.f3833b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.f28261z5, org.telegram.ui.ActionBar.k6.f27982k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
