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
import di.lb;
import hi.ia;
import hi.sa;
import hi.u9;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i20;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.ru0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vq;
import org.telegram.ui.bq0;
import org.telegram.ui.d8;
import org.telegram.ui.dn;
import org.telegram.ui.y7;
public final class o2 extends View {
    public final int f3750a;
    public Object f3751b;

    public o2(int i7, Context context, Object obj) {
        super(context);
        this.f3750a = i7;
        this.f3751b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3750a) {
            case 2:
                super.dispatchDraw(canvas);
                hi.g5 g5Var = ((u9) this.f3751b).f14700y0;
                if (g5Var != null) {
                    g5Var.d(canvas);
                    return;
                }
                return;
            case 3:
                canvas.save();
                sa saVar = (sa) this.f3751b;
                canvas.translate(saVar.f15048d1.getX() + saVar.m0.getX(), saVar.f15048d1.getY() + saVar.m0.getY());
                ia iaVar = saVar.f15048d1;
                iaVar.k(canvas, iaVar.getBounds(), saVar.f15048d1.getOver2Alpha());
                canvas.restore();
                return;
            case 4:
            case 5:
            default:
                super.dispatchDraw(canvas);
                return;
            case 6:
                dh.d dVar = ((jh.f) this.f3751b).K;
                if (dVar != null) {
                    dVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3750a) {
            case 19:
                super.draw(canvas);
                ((oy0) this.f3751b).e(canvas, (getMeasuredWidth() - ((oy0) this.f3751b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 23:
                super.draw(canvas);
                po0 po0Var = (po0) this.f3751b;
                po0Var.R2.setBounds(0, (getMeasuredHeight() - po0Var.C2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                po0Var.R2.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f3750a) {
            case 27:
                super.invalidate();
                ((st0) this.f3751b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f3750a) {
            case 0:
                super.onAttachedToWindow();
                n2 n2Var = (n2) this.f3751b;
                if (n2Var != null && !n2Var.f3734i) {
                    n2Var.f3734i = true;
                    n2Var.a();
                    ai.g0 g0Var = new ai.g0(n2Var, 1);
                    n2Var.h = g0Var;
                    qc.a(g0Var);
                    return;
                }
                return;
            case 5:
                super.onAttachedToWindow();
                ((jg.n1) this.f3751b).f17216f = true;
                return;
            case 10:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f3751b).f32436l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3750a) {
            case 0:
                super.onDetachedFromWindow();
                n2 n2Var = (n2) this.f3751b;
                if (n2Var != null && n2Var.f3734i) {
                    n2Var.f3734i = false;
                    n2Var.a();
                    ai.g0 g0Var = n2Var.h;
                    HashSet hashSet = qc.f26077n;
                    if (hashSet != null) {
                        hashSet.remove(g0Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.onDetachedFromWindow();
                ((jg.n1) this.f3751b).f17216f = false;
                return;
            case 10:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f3751b).f32436l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        vq vqVar;
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
        int A;
        switch (this.f3750a) {
            case 8:
                super.onDraw(canvas);
                li.d0 d0Var = (li.d0) this.f3751b;
                bg.c0 c0Var = d0Var.F1;
                float max = Math.max(d0Var.f19540m1.f57085e, d0Var.n1.f57085e);
                bg.c0 c0Var2 = d0Var.E1;
                c0Var2.c(org.telegram.messenger.g0.L(42.0f) + d0Var.P1.f15575b, 0);
                c0Var2.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + d0Var.P1.f15575b);
                int i13 = org.telegram.ui.ActionBar.j6.f28792a7;
                c0Var2.b(org.telegram.ui.ActionBar.j6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.j6.w0(i13, d0Var.J0)));
                c0Var2.draw(canvas);
                if (d0Var.I1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + d0Var.P1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + d0Var.P1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(d0Var.P1.d), max);
                c0Var.c(0, W1);
                c0Var.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                c0Var.b(org.telegram.ui.ActionBar.j6.r1(T1, org.telegram.ui.ActionBar.j6.w0(i13, d0Var.J0)));
                c0Var.draw(canvas);
                return;
            case 9:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((oi.p0) this.f3751b).f21867c.draw(canvas);
                canvas.restore();
                return;
            case 10:
                int L = org.telegram.messenger.g0.L(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f3751b;
                checkBoxBase.e((getWidth() - L) / 2, (getHeight() - L) / 2, L, L);
                checkBoxBase.a(canvas);
                return;
            case 13:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.f3751b;
                t2Var.o4.setBounds(0, 0, getWidth(), getHeight());
                t2Var.o4.draw(canvas);
                return;
            case 18:
                if (((vq) this.f3751b).V1) {
                    canvas.drawRect(vqVar.f29717u0, 0.0f, getMeasuredWidth() - vqVar.f29717u0, 1.0f, org.telegram.ui.ActionBar.j6.f28972k0);
                    return;
                }
                return;
            case 22:
                super.onDraw(canvas);
                ((bq0) this.f3751b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 25:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                do0 do0Var = (do0) this.f3751b;
                do0Var.getClass();
                if (S0 != 0) {
                    do0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    do0Var.f34006n.setShader(do0Var.h);
                }
                do0Var.f34007r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(do0Var.f34007r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), do0Var.f34006n);
                return;
            case 27:
                st0 st0Var = (st0) this.f3751b;
                if (st0Var.f39410b != null && !st0Var.K) {
                    Drawable newDrawable = st0Var.getNewDrawable();
                    boolean newDrawableMotion = st0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != st0Var.f39410b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.j6.h1()) {
                            st0Var.d = st0Var.f39410b;
                            st0Var.f39415e = st0Var.f39412c;
                        }
                        if (newDrawable instanceof ra0) {
                            ((ra0) newDrawable).q(st0Var.M);
                        }
                        st0Var.f39410b = newDrawable;
                        if (st0Var.N && (newDrawable instanceof dn)) {
                            ((dn) newDrawable).f(this);
                        }
                        if (st0Var.N) {
                            Drawable drawable3 = st0Var.f39410b;
                            if (drawable3 instanceof ra0) {
                                ((ra0) drawable3).k();
                            }
                        }
                        st0Var.f39412c = newDrawableMotion;
                        st0Var.U = 0.0f;
                        st0Var.T(st0Var.f39410b);
                        st0Var.G();
                    } else if (st0Var.f39412c != newDrawableMotion) {
                        st0Var.f39412c = newDrawableMotion;
                        st0Var.G();
                    }
                    float f16 = 1.0f;
                    st0Var.U = Utilities.i((org.telegram.messenger.g0.f23614t / 200.0f) + st0Var.U, 1.0f, 0.0f);
                    int i14 = 0;
                    while (i14 < 2) {
                        if (i14 == 0) {
                            drawable = st0Var.d;
                        } else {
                            drawable = st0Var.f39410b;
                        }
                        if (drawable == null) {
                            f13 = f16;
                        } else {
                            boolean z11 = true;
                            if (i14 == 1 && st0Var.d != null && st0Var.H != null) {
                                drawable.setAlpha((int) (st0Var.U * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i14 == 0) {
                                z10 = st0Var.f39415e;
                            } else {
                                z10 = st0Var.f39412c;
                            }
                            if (z10) {
                                f10 = st0Var.E;
                                f11 = st0Var.f39422x;
                                f12 = st0Var.f39423y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable instanceof ra0) {
                                ra0 ra0Var = (ra0) drawable;
                                if (ra0Var.f38933u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (st0Var.O()) {
                                        i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i11 = 0;
                                    }
                                    if (st0Var.P() && st0Var.f39420s) {
                                        i12 = org.telegram.messenger.g0.f23605m;
                                    } else {
                                        i12 = 0;
                                    }
                                    int i15 = i11 + i12;
                                    if (st0Var.W()) {
                                        height2 = getRootView().getMeasuredHeight() - i15;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i16 = ((height2 - ceil2) / 2) + st0Var.F + i15 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, i15, ceil, getMeasuredHeight() - st0Var.h);
                                    drawable.setBounds(measuredWidth, i16, ceil + measuredWidth, ceil2 + i16);
                                    drawable.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (st0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - st0Var.h);
                                    }
                                    ra0Var.f38919f = st0Var.F;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - st0Var.F) + f12));
                                    drawable.draw(canvas);
                                    if (st0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable instanceof ColorDrawable) {
                                    if (st0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - st0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    if (st0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (st0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - st0Var.h);
                                    }
                                    drawable.setBounds(0, st0Var.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + st0Var.F);
                                    drawable.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    if (st0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f17 = 2.0f / org.telegram.messenger.g0.f23610p;
                                        canvas.scale(f17, f17);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f17), (int) Math.ceil(getRootView().getMeasuredHeight() / f17));
                                        drawable.draw(canvas);
                                        st0.F(st0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (st0Var.O()) {
                                            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i7 = 0;
                                        }
                                        if (st0Var.P() && st0Var.f39420s) {
                                            i10 = org.telegram.messenger.g0.f23605m;
                                        } else {
                                            i10 = 0;
                                        }
                                        int i17 = i7 + i10;
                                        if (st0Var.W()) {
                                            height = getRootView().getMeasuredHeight() - i17;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f10);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f10);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                        int i18 = ((height - ceil4) / 2) + st0Var.F + i17 + ((int) f12);
                                        canvas.save();
                                        canvas.clipRect(0, i17, ceil3, getMeasuredHeight() - st0Var.h);
                                        drawable.setBounds(measuredWidth2, i18, ceil3 + measuredWidth2, ceil4 + i18);
                                        drawable.draw(canvas);
                                        st0.F(st0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (st0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - st0Var.h);
                                    }
                                    if (drawable instanceof dn) {
                                        dn dnVar = (dn) drawable;
                                        dnVar.f46426b = this;
                                        ra0 ra0Var2 = dnVar.f46429f;
                                        if (ra0Var2 != null) {
                                            ra0Var2.q(this);
                                        }
                                    }
                                    float f18 = f10 - f13;
                                    float f19 = a8.p0.f(-getMeasuredWidth(), f18, 2.0f, f11);
                                    float f20 = a8.p0.f(-getRootView().getMeasuredHeight(), f18, 2.0f, f12);
                                    drawable.setBounds((int) f19, (int) (st0Var.F + f20), (int) ((getMeasuredWidth() * f10) + f19), (int) r.b.e(getRootView().getMeasuredHeight(), f10, st0Var.F, f20));
                                    drawable.draw(canvas);
                                    st0.F(st0Var, canvas);
                                    if (st0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i14 == 0 && (drawable2 = st0Var.d) != null && st0Var.U >= f13) {
                                if (st0Var.N && (drawable2 instanceof dn)) {
                                    ((dn) drawable2).g(st0Var.M);
                                }
                                if (st0Var.N) {
                                    Drawable drawable4 = st0Var.d;
                                    if (drawable4 instanceof ra0) {
                                        ((ra0) drawable4).l();
                                    }
                                }
                                st0Var.d = null;
                                st0Var.f39415e = false;
                                st0Var.G();
                                st0Var.M.invalidate();
                            }
                        }
                        i14++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (st0Var.U != f16) {
                        st0Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 29:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Mj, false);
                kw0 kw0Var = (kw0) this.f3751b;
                org.telegram.ui.Components.voip.n nVar = kw0Var.M;
                Paint paint2 = kw0Var.f36624a;
                paint2.setColor(x02);
                Paint paint3 = kw0Var.f36625b;
                paint3.setColor(x02);
                Paint paint4 = kw0Var.f36626c;
                paint4.setColor(x02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = kw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z12 = kw0Var.f36627e;
                if (z12 || kw0Var.K != 0.0f) {
                    if (z12) {
                        if (kw0Var.L) {
                            float f21 = kw0Var.K + 0.024615385f;
                            kw0Var.K = f21;
                            if (f21 > 1.0f) {
                                kw0Var.K = 1.0f;
                                kw0Var.L = false;
                            }
                        } else {
                            float f22 = kw0Var.K - 0.024615385f;
                            kw0Var.K = f22;
                            if (f22 < 0.0f) {
                                kw0Var.K = 0.0f;
                                kw0Var.L = true;
                            }
                        }
                    } else {
                        float f23 = kw0Var.K - 0.10666667f;
                        kw0Var.K = f23;
                        if (f23 < 0.0f) {
                            kw0Var.K = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    nVar.f40798f = getMeasuredWidth();
                    nVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (!kw0Var.f36627e) {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (i20.A(24.0f, 2, getMeasuredWidth()) * kw0Var.G));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + A, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                } else {
                    f14 = 1.0f;
                    paint = paint5;
                }
                if (!kw0Var.f36627e) {
                    int A2 = (int) (i20.A(24.0f, 2, getMeasuredWidth()) * kw0Var.F);
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
        switch (this.f3750a) {
            case 1:
                lb lbVar = (lb) this.f3751b;
                if (lbVar.I) {
                    i11 = (lbVar.p0().getMeasuredHeight() + lbVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + lbVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + lbVar.E.getMeasuredHeight() > L) {
                        L = org.telegram.messenger.g0.L(24.0f) + lbVar.E.getMeasuredHeight();
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
                ii.f fVar = (ii.f) this.f3751b;
                if (fVar.I) {
                    i12 = (fVar.p0().getMeasuredHeight() + fVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.g0.L(140.0f) + fVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + fVar.E.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.g0.L(24.0f) + fVar.E.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 5:
                ((View) getParent()).getMeasuredHeight();
                jg.n1 n1Var = (jg.n1) this.f3751b;
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
                ki.k kVar = (ki.k) this.f3751b;
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
                v4.b0 b0Var = ((org.telegram.ui.n5) this.f3751b).d.G;
                if (b0Var instanceof qy) {
                    i15 = ((qy) b0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 14:
                ja jaVar = (ja) this.f3751b;
                int i18 = jaVar.f35934r1;
                if (i18 == 0) {
                    i16 = org.telegram.messenger.g0.L(300.0f);
                } else {
                    i16 = (int) (i18 * jaVar.f35938v1);
                }
                int i19 = i16 - (((jaVar.B1 - jaVar.C1) - jaVar.D1) - jaVar.E1);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(((am) this.f3751b).f33023w.K, 1073741824));
                return;
            case 16:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((jn) ((org.telegram.ui.l4) this.f3751b).f48823e).S0);
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(((kn) ((y7) this.f3751b).d).f36558x, 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((oy0) this.f3751b).k()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((oy0) this.f3751b).i()), org.telegram.messenger.g0.L(26.0f)), 1073741824));
                return;
            case 20:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((t50) this.f3751b).f39542c.f32875j2, 1073741824));
                return;
            case 21:
                int L4 = org.telegram.messenger.g0.L(48.0f);
                a60 a60Var = ((v50) this.f3751b).f40273n;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L4 + a60Var.f32875j2 + a60Var.f32881p2, 1073741824));
                return;
            case 24:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((mo0) this.f3751b).L.F1.R, 1073741824));
                return;
            case 26:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((it0) this.f3751b).getMeasuredHeight());
                return;
            case 28:
                ru0 ru0Var = (ru0) this.f3751b;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                av0 av0Var = ru0Var.d;
                int i20 = av0Var.f33083o3;
                if (i20 > 0) {
                    i17 = org.telegram.messenger.g0.L(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((ru0Var.b() - 1) * size2), ru0Var.d.f33075f3 * size2)));
                av0Var.f33082n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i10);
                return;
            case 29:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f3750a) {
            case 12:
                super.setAlpha(f10);
                View view = ((d8) this.f3751b).f46306b.f47042y.fragmentView;
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
        switch (this.f3750a) {
            case 0:
                if (((n2) this.f3751b) != null) {
                    if (isAttachedToWindow()) {
                        n2 n2Var = (n2) this.f3751b;
                        if (n2Var.f3734i) {
                            n2Var.f3734i = false;
                            n2Var.a();
                            ai.g0 g0Var = n2Var.h;
                            HashSet hashSet = qc.f26077n;
                            if (hashSet != null) {
                                hashSet.remove(g0Var);
                            }
                        }
                    }
                    this.f3751b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof n2) {
                    this.f3751b = (n2) drawable;
                    if (isAttachedToWindow()) {
                        n2 n2Var2 = (n2) this.f3751b;
                        if (!n2Var2.f3734i) {
                            n2Var2.f3734i = true;
                            n2Var2.a();
                            ai.g0 g0Var2 = new ai.g0(n2Var2, 1);
                            n2Var2.h = g0Var2;
                            qc.a(g0Var2);
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
        switch (this.f3750a) {
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
        switch (this.f3750a) {
            case 14:
                super.setTranslationY(f10);
                int i7 = ja.S1;
                ((ja) this.f3751b).f29682b.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public o2(Context context, int i7) {
        super(context);
        this.f3750a = i7;
    }

    public o2(ja jaVar, Context context) {
        super(context);
        this.f3750a = 14;
        this.f3751b = jaVar;
        setTag(-33024);
    }

    public o2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f3750a = 10;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, e6Var);
        this.f3751b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.j6.Yl, org.telegram.ui.ActionBar.j6.f29259z5, org.telegram.ui.ActionBar.j6.f28979k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
