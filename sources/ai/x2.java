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
import ci.wb;
import gi.la;
import gi.va;
import gi.x9;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.d8;
import org.telegram.ui.tp0;
import org.telegram.ui.y7;
import org.telegram.ui.zm;
public final class x2 extends View {
    public final int f1093a;
    public Object f1094b;

    public x2(int i3, Context context, Object obj) {
        super(context);
        this.f1093a = i3;
        this.f1094b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f1093a) {
            case 2:
                super.dispatchDraw(canvas);
                gi.g5 g5Var = ((x9) this.f1094b).f13239y0;
                if (g5Var != null) {
                    g5Var.d(canvas);
                    return;
                }
                return;
            case 3:
                canvas.save();
                va vaVar = (va) this.f1094b;
                canvas.translate(vaVar.f13710d1.getX() + vaVar.m0.getX(), vaVar.f13710d1.getY() + vaVar.m0.getY());
                la laVar = vaVar.f13710d1;
                laVar.k(canvas, laVar.getBounds(), vaVar.f13710d1.getOver2Alpha());
                canvas.restore();
                return;
            case 8:
                eh.d dVar = ((kh.f) this.f1094b).J;
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
        switch (this.f1093a) {
            case 19:
                super.draw(canvas);
                ((ly0) this.f1094b).e(canvas, (getMeasuredWidth() - ((ly0) this.f1094b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 23:
                super.draw(canvas);
                oo0 oo0Var = (oo0) this.f1094b;
                oo0Var.O2.setBounds(0, (getMeasuredHeight() - oo0Var.f36914z2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                oo0Var.O2.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f1093a) {
            case 27:
                super.invalidate();
                ((qt0) this.f1094b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1093a) {
            case 0:
                super.onAttachedToWindow();
                w2 w2Var = (w2) this.f1094b;
                if (w2Var != null && !w2Var.f1061i) {
                    w2Var.f1061i = true;
                    w2Var.a();
                    v2 v2Var = new v2(w2Var, 0);
                    w2Var.h = v2Var;
                    lc.a(v2Var);
                    return;
                }
                return;
            case 7:
                super.onAttachedToWindow();
                ((kg.k1) this.f1094b).f17077f = true;
                return;
            case 10:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f1094b).f31329l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1093a) {
            case 0:
                super.onDetachedFromWindow();
                w2 w2Var = (w2) this.f1094b;
                if (w2Var != null && w2Var.f1061i) {
                    w2Var.f1061i = false;
                    w2Var.a();
                    v2 v2Var = w2Var.h;
                    HashSet hashSet = lc.f23973n;
                    if (hashSet != null) {
                        hashSet.remove(v2Var);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                super.onDetachedFromWindow();
                ((kg.k1) this.f1094b).f17077f = false;
                return;
            case 10:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f1094b).f31329l = false;
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
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i3;
        int i10;
        int height;
        Drawable drawable2;
        int i11;
        int i12;
        int height2;
        float f14;
        Paint paint;
        int A;
        switch (this.f1093a) {
            case 6:
                super.onDraw(canvas);
                ji.b0 b0Var = (ji.b0) this.f1094b;
                cg.b0 b0Var2 = b0Var.C1;
                float max = Math.max(b0Var.f16264j1.f53840e, b0Var.k1.f53840e);
                cg.b0 b0Var3 = b0Var.B1;
                b0Var3.c(org.telegram.messenger.g0.L(42.0f) + b0Var.M1.f14496b, 0);
                b0Var3.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + b0Var.M1.f14496b);
                int i13 = org.telegram.ui.ActionBar.k6.f27824a7;
                b0Var3.b(org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.k6.w0(i13, b0Var.J0)));
                b0Var3.draw(canvas);
                if (b0Var.F1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + b0Var.M1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + b0Var.M1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(b0Var.M1.d), max);
                b0Var2.c(0, W1);
                b0Var2.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                b0Var2.b(org.telegram.ui.ActionBar.k6.r1(T1, org.telegram.ui.ActionBar.k6.w0(i13, b0Var.J0)));
                b0Var2.draw(canvas);
                return;
            case 9:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((mi.s0) this.f1094b).f19873c.draw(canvas);
                canvas.restore();
                return;
            case 10:
                int L = org.telegram.messenger.g0.L(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f1094b;
                checkBoxBase.e((getWidth() - L) / 2, (getHeight() - L) / 2, L, L);
                checkBoxBase.a(canvas);
                return;
            case 13:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.f1094b;
                t2Var.f30536o4.setBounds(0, 0, getWidth(), getHeight());
                t2Var.f30536o4.draw(canvas);
                return;
            case 18:
                if (((oq) this.f1094b).S1) {
                    canvas.drawRect(oqVar.f28618u0, 0.0f, getMeasuredWidth() - oqVar.f28618u0, 1.0f, org.telegram.ui.ActionBar.k6.f28002k0);
                    return;
                }
                return;
            case 22:
                super.onDraw(canvas);
                ((tp0) this.f1094b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 25:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                co0 co0Var = (co0) this.f1094b;
                co0Var.getClass();
                if (S0 != 0) {
                    co0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    co0Var.f32783n.setShader(co0Var.h);
                }
                co0Var.f32784r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(co0Var.f32784r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), co0Var.f32783n);
                return;
            case 27:
                qt0 qt0Var = (qt0) this.f1094b;
                if (qt0Var.f37528b != null && !qt0Var.K) {
                    Drawable newDrawable = qt0Var.getNewDrawable();
                    boolean newDrawableMotion = qt0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != qt0Var.f37528b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.k6.h1()) {
                            qt0Var.d = qt0Var.f37528b;
                            qt0Var.f37533e = qt0Var.f37530c;
                        }
                        if (newDrawable instanceof la0) {
                            ((la0) newDrawable).q(qt0Var.M);
                        }
                        qt0Var.f37528b = newDrawable;
                        if (qt0Var.N && (newDrawable instanceof zm)) {
                            ((zm) newDrawable).f(this);
                        }
                        if (qt0Var.N) {
                            Drawable drawable3 = qt0Var.f37528b;
                            if (drawable3 instanceof la0) {
                                ((la0) drawable3).k();
                            }
                        }
                        qt0Var.f37530c = newDrawableMotion;
                        qt0Var.U = 0.0f;
                        qt0Var.T(qt0Var.f37528b);
                        qt0Var.G();
                    } else if (qt0Var.f37530c != newDrawableMotion) {
                        qt0Var.f37530c = newDrawableMotion;
                        qt0Var.G();
                    }
                    float f16 = 1.0f;
                    qt0Var.U = Utilities.i((org.telegram.messenger.g0.f22611t / 200.0f) + qt0Var.U, 1.0f, 0.0f);
                    int i14 = 0;
                    while (i14 < 2) {
                        if (i14 == 0) {
                            drawable = qt0Var.d;
                        } else {
                            drawable = qt0Var.f37528b;
                        }
                        if (drawable == null) {
                            f13 = f16;
                        } else {
                            boolean z11 = true;
                            if (i14 == 1 && qt0Var.d != null && qt0Var.H != null) {
                                drawable.setAlpha((int) (qt0Var.U * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i14 == 0) {
                                z10 = qt0Var.f37533e;
                            } else {
                                z10 = qt0Var.f37530c;
                            }
                            if (z10) {
                                f10 = qt0Var.E;
                                f11 = qt0Var.f37540x;
                                f12 = qt0Var.f37541y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable instanceof la0) {
                                la0 la0Var = (la0) drawable;
                                if (la0Var.f35668u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (qt0Var.O()) {
                                        i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i11 = 0;
                                    }
                                    if (qt0Var.P() && qt0Var.f37538s) {
                                        i12 = org.telegram.messenger.g0.f22602m;
                                    } else {
                                        i12 = 0;
                                    }
                                    int i15 = i11 + i12;
                                    if (qt0Var.W()) {
                                        height2 = getRootView().getMeasuredHeight() - i15;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i16 = ((height2 - ceil2) / 2) + qt0Var.F + i15 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, i15, ceil, getMeasuredHeight() - qt0Var.h);
                                    drawable.setBounds(measuredWidth, i16, ceil + measuredWidth, ceil2 + i16);
                                    drawable.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (qt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qt0Var.h);
                                    }
                                    la0Var.f35654f = qt0Var.F;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - qt0Var.F) + f12));
                                    drawable.draw(canvas);
                                    if (qt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable instanceof ColorDrawable) {
                                    if (qt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - qt0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    if (qt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (qt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qt0Var.h);
                                    }
                                    drawable.setBounds(0, qt0Var.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + qt0Var.F);
                                    drawable.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    if (qt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f17 = 2.0f / org.telegram.messenger.g0.f22607p;
                                        canvas.scale(f17, f17);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f17), (int) Math.ceil(getRootView().getMeasuredHeight() / f17));
                                        drawable.draw(canvas);
                                        qt0.F(qt0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (qt0Var.O()) {
                                            i3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i3 = 0;
                                        }
                                        if (qt0Var.P() && qt0Var.f37538s) {
                                            i10 = org.telegram.messenger.g0.f22602m;
                                        } else {
                                            i10 = 0;
                                        }
                                        int i17 = i3 + i10;
                                        if (qt0Var.W()) {
                                            height = getRootView().getMeasuredHeight() - i17;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f10);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f10);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                        int i18 = ((height - ceil4) / 2) + qt0Var.F + i17 + ((int) f12);
                                        canvas.save();
                                        canvas.clipRect(0, i17, ceil3, getMeasuredHeight() - qt0Var.h);
                                        drawable.setBounds(measuredWidth2, i18, ceil3 + measuredWidth2, ceil4 + i18);
                                        drawable.draw(canvas);
                                        qt0.F(qt0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (qt0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - qt0Var.h);
                                    }
                                    if (drawable instanceof zm) {
                                        zm zmVar = (zm) drawable;
                                        zmVar.f52707b = this;
                                        la0 la0Var2 = zmVar.f52710f;
                                        if (la0Var2 != null) {
                                            la0Var2.q(this);
                                        }
                                    }
                                    float f18 = f10 - f13;
                                    float e10 = a1.g.e(-getMeasuredWidth(), f18, 2.0f, f11);
                                    float e11 = a1.g.e(-getRootView().getMeasuredHeight(), f18, 2.0f, f12);
                                    drawable.setBounds((int) e10, (int) (qt0Var.F + e11), (int) ((getMeasuredWidth() * f10) + e10), (int) t4.c.c(getRootView().getMeasuredHeight(), f10, qt0Var.F, e11));
                                    drawable.draw(canvas);
                                    qt0.F(qt0Var, canvas);
                                    if (qt0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i14 == 0 && (drawable2 = qt0Var.d) != null && qt0Var.U >= f13) {
                                if (qt0Var.N && (drawable2 instanceof zm)) {
                                    ((zm) drawable2).g(qt0Var.M);
                                }
                                if (qt0Var.N) {
                                    Drawable drawable4 = qt0Var.d;
                                    if (drawable4 instanceof la0) {
                                        ((la0) drawable4).l();
                                    }
                                }
                                qt0Var.d = null;
                                qt0Var.f37533e = false;
                                qt0Var.G();
                                qt0Var.M.invalidate();
                            }
                        }
                        i14++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (qt0Var.U != f16) {
                        qt0Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 29:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                gw0 gw0Var = (gw0) this.f1094b;
                org.telegram.ui.Components.voip.g gVar = gw0Var.M;
                Paint paint2 = gw0Var.f34211a;
                paint2.setColor(x02);
                Paint paint3 = gw0Var.f34212b;
                paint3.setColor(x02);
                Paint paint4 = gw0Var.f34213c;
                paint4.setColor(x02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = gw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z12 = gw0Var.f34214e;
                if (z12 || gw0Var.K != 0.0f) {
                    if (z12) {
                        if (gw0Var.L) {
                            float f19 = gw0Var.K + 0.024615385f;
                            gw0Var.K = f19;
                            if (f19 > 1.0f) {
                                gw0Var.K = 1.0f;
                                gw0Var.L = false;
                            }
                        } else {
                            float f20 = gw0Var.K - 0.024615385f;
                            gw0Var.K = f20;
                            if (f20 < 0.0f) {
                                gw0Var.K = 0.0f;
                                gw0Var.L = true;
                            }
                        }
                    } else {
                        float f21 = gw0Var.K - 0.10666667f;
                        gw0Var.K = f21;
                        if (f21 < 0.0f) {
                            gw0Var.K = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    gVar.f39349f = getMeasuredWidth();
                    gVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (!gw0Var.f34214e) {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (org.telegram.messenger.camera.q.A(24.0f, 2, getMeasuredWidth()) * gw0Var.G));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + A, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                } else {
                    f14 = 1.0f;
                    paint = paint5;
                }
                if (!gw0Var.f34214e) {
                    int A2 = (int) (org.telegram.messenger.camera.q.A(24.0f, 2, getMeasuredWidth()) * gw0Var.F);
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
    public void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f1093a) {
            case 1:
                wb wbVar = (wb) this.f1094b;
                if (wbVar.I) {
                    i11 = (wbVar.p0().getMeasuredHeight() + wbVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + wbVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + wbVar.E.getMeasuredHeight() > L) {
                        L = org.telegram.messenger.g0.L(24.0f) + wbVar.E.getMeasuredHeight();
                    }
                    i11 = L;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (i11 - (0 * 2.5f)), 1073741824));
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
                super.onMeasure(i3, i10);
                return;
            case 4:
                hi.g gVar = (hi.g) this.f1094b;
                if (gVar.I) {
                    i12 = (gVar.p0().getMeasuredHeight() + gVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.g0.L(140.0f) + gVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + gVar.E.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.g0.L(24.0f) + gVar.E.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 5:
                ii.k kVar = (ii.k) this.f1094b;
                if (kVar.I) {
                    i13 = (ii.k.E0(kVar).getMeasuredHeight() + kVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.g0.L(140.0f) + kVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + kVar.E.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.g0.L(24.0f) + kVar.E.getMeasuredHeight();
                    }
                    i13 = L3;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 7:
                ((View) getParent()).getMeasuredHeight();
                kg.k1 k1Var = (kg.k1) this.f1094b;
                Integer num = k1Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    k1Var.h = i14;
                } else {
                    i14 = 0;
                    k1Var.h = 0;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            case 10:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(24.0f));
                return;
            case 11:
                u4.b0 b0Var = ((org.telegram.ui.p5) this.f1094b).d.G;
                if (b0Var instanceof jy) {
                    i15 = ((jy) b0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 14:
                ma maVar = (ma) this.f1094b;
                int i18 = maVar.f36104o1;
                if (i18 == 0) {
                    i16 = org.telegram.messenger.g0.L(300.0f);
                } else {
                    i16 = (int) (i18 * maVar.f36108s1);
                }
                int i19 = i16 - (((maVar.f36114y1 - maVar.f36115z1) - maVar.A1) - maVar.B1);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(((sl) this.f1094b).f38055w.K, 1073741824));
                return;
            case 16:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), ((an) ((org.telegram.ui.n4) this.f1094b).f47865e).S0);
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(((bn) ((y7) this.f1094b).d).f32328x, 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((ly0) this.f1094b).k()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((ly0) this.f1094b).i()), org.telegram.messenger.g0.L(26.0f)), 1073741824));
                return;
            case 20:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((n50) this.f1094b).f36378c.f38293g2, 1073741824));
                return;
            case 21:
                int L4 = org.telegram.messenger.g0.L(48.0f);
                t50 t50Var = ((p50) this.f1094b).f37068n;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L4 + t50Var.f38293g2 + t50Var.f38299m2, 1073741824));
                return;
            case 24:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(((lo0) this.f1094b).L.C1.R, 1073741824));
                return;
            case 26:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), ((gt0) this.f1094b).getMeasuredHeight());
                return;
            case 28:
                ou0 ou0Var = (ou0) this.f1094b;
                int size = View.MeasureSpec.getSize(i3);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                xu0 xu0Var = ou0Var.d;
                int i20 = xu0Var.f40491o3;
                if (i20 > 0) {
                    i17 = org.telegram.messenger.g0.L(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((ou0Var.b() - 1) * size2), ou0Var.d.f40483f3 * size2)));
                xu0Var.f40490n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i10);
                return;
            case 29:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f1093a) {
            case 12:
                super.setAlpha(f10);
                View view = ((d8) this.f1094b).f44588b.f45185y.fragmentView;
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
        switch (this.f1093a) {
            case 0:
                if (((w2) this.f1094b) != null) {
                    if (isAttachedToWindow()) {
                        w2 w2Var = (w2) this.f1094b;
                        if (w2Var.f1061i) {
                            w2Var.f1061i = false;
                            w2Var.a();
                            v2 v2Var = w2Var.h;
                            HashSet hashSet = lc.f23973n;
                            if (hashSet != null) {
                                hashSet.remove(v2Var);
                            }
                        }
                    }
                    this.f1094b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof w2) {
                    this.f1094b = (w2) drawable;
                    if (isAttachedToWindow()) {
                        w2 w2Var2 = (w2) this.f1094b;
                        if (!w2Var2.f1061i) {
                            w2Var2.f1061i = true;
                            w2Var2.a();
                            v2 v2Var2 = new v2(w2Var2, 0);
                            w2Var2.h = v2Var2;
                            lc.a(v2Var2);
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
        switch (this.f1093a) {
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
        switch (this.f1093a) {
            case 14:
                super.setTranslationY(f10);
                int i3 = ma.P1;
                ((ma) this.f1094b).f28586b.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public x2(Context context, int i3) {
        super(context);
        this.f1093a = i3;
    }

    public x2(ma maVar, Context context) {
        super(context);
        this.f1093a = 14;
        this.f1094b = maVar;
        setTag(-33024);
    }

    public x2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f1093a = 10;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, e6Var);
        this.f1094b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.f28289z5, org.telegram.ui.ActionBar.k6.f28008k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
