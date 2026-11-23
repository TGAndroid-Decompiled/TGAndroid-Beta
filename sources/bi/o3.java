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
import hi.db;
import hi.nb;
import hi.pa;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.m10;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.za0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.dq0;
import org.telegram.ui.en;
public final class o3 extends View {
    public final int f3897a;
    public Object f3898b;

    public o3(int i7, Context context, Object obj) {
        super(context);
        this.f3897a = i7;
        this.f3898b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3897a) {
            case 2:
                super.dispatchDraw(canvas);
                hi.p5 p5Var = ((pa) this.f3898b).f15600y0;
                if (p5Var != null) {
                    p5Var.d(canvas);
                    return;
                }
                return;
            case 3:
                canvas.save();
                nb nbVar = (nb) this.f3898b;
                canvas.translate(nbVar.f15067d1.getX() + nbVar.m0.getX(), nbVar.f15067d1.getY() + nbVar.m0.getY());
                db dbVar = nbVar.f15067d1;
                dbVar.k(canvas, dbVar.getBounds(), nbVar.f15067d1.getOver2Alpha());
                canvas.restore();
                return;
            case 4:
            case 5:
            default:
                super.dispatchDraw(canvas);
                return;
            case 6:
                dh.d dVar = ((jh.f) this.f3898b).L;
                if (dVar != null) {
                    dVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3897a) {
            case 19:
                super.draw(canvas);
                ((wy0) this.f3898b).e(canvas, (getMeasuredWidth() - ((wy0) this.f3898b).k()) / 2.0f, getMeasuredHeight() / 2.0f);
                return;
            case 23:
                super.draw(canvas);
                zo0 zo0Var = (zo0) this.f3898b;
                zo0Var.R2.setBounds(0, (getMeasuredHeight() - zo0Var.C2.d) - org.telegram.messenger.g0.L(72.0f), getMeasuredWidth(), getMeasuredHeight());
                zo0Var.R2.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f3897a) {
            case 27:
                super.invalidate();
                ((cu0) this.f3898b).S();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f3897a) {
            case 0:
                super.onAttachedToWindow();
                n3 n3Var = (n3) this.f3898b;
                if (n3Var != null && !n3Var.f3879i) {
                    n3Var.f3879i = true;
                    n3Var.a();
                    ai.d0 d0Var = new ai.d0(n3Var, 1);
                    n3Var.h = d0Var;
                    pc.a(d0Var);
                    return;
                }
                return;
            case 5:
                super.onAttachedToWindow();
                ((jg.n1) this.f3898b).f17695f = true;
                return;
            case 10:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f3898b).f32933l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3897a) {
            case 0:
                super.onDetachedFromWindow();
                n3 n3Var = (n3) this.f3898b;
                if (n3Var != null && n3Var.f3879i) {
                    n3Var.f3879i = false;
                    n3Var.a();
                    ai.d0 d0Var = n3Var.h;
                    HashSet hashSet = pc.f26318n;
                    if (hashSet != null) {
                        hashSet.remove(d0Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.onDetachedFromWindow();
                ((jg.n1) this.f3898b).f17695f = false;
                return;
            case 10:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f3898b).f32933l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        br brVar;
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
        switch (this.f3897a) {
            case 8:
                super.onDraw(canvas);
                li.c0 c0Var = (li.c0) this.f3898b;
                bg.d0 d0Var = c0Var.F1;
                float max = Math.max(c0Var.f19995m1.f57779e, c0Var.n1.f57779e);
                bg.d0 d0Var2 = c0Var.E1;
                d0Var2.c(org.telegram.messenger.g0.L(42.0f) + c0Var.P1.f15979b, 0);
                d0Var2.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.L(56.0f) + c0Var.P1.f15979b);
                int i13 = org.telegram.ui.ActionBar.n6.f29394a7;
                d0Var2.b(org.telegram.ui.ActionBar.n6.r1(org.telegram.messenger.g0.T1(1.0f, 0.8f, max), org.telegram.ui.ActionBar.n6.w0(i13, c0Var.J0)));
                d0Var2.draw(canvas);
                if (c0Var.I1) {
                    max = 1.0f;
                }
                int W1 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(48.0f) + c0Var.P1.d, 0);
                int W12 = org.telegram.messenger.g0.W1(max, org.telegram.messenger.g0.L(72.0f), 0) + c0Var.P1.d;
                float T1 = org.telegram.messenger.g0.T1(0.8f, org.telegram.messenger.g0.R0(c0Var.P1.d), max);
                d0Var.c(0, W1);
                d0Var.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                d0Var.b(org.telegram.ui.ActionBar.n6.r1(T1, org.telegram.ui.ActionBar.n6.w0(i13, c0Var.J0)));
                d0Var.draw(canvas);
                return;
            case 9:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.N(22.6f), org.telegram.messenger.g0.N(21.66f));
                ((oi.q0) this.f3898b).f22389c.draw(canvas);
                canvas.restore();
                return;
            case 10:
                int L = org.telegram.messenger.g0.L(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f3898b;
                checkBoxBase.e((getWidth() - L) / 2, (getHeight() - L) / 2, L, L);
                checkBoxBase.a(canvas);
                return;
            case 13:
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.f3898b;
                u2Var.o4.setBounds(0, 0, getWidth(), getHeight());
                u2Var.o4.draw(canvas);
                return;
            case 18:
                if (((br) this.f3898b).V1) {
                    canvas.drawRect(brVar.f30261u0, 0.0f, getMeasuredWidth() - brVar.f30261u0, 1.0f, org.telegram.ui.ActionBar.n6.f29574k0);
                    return;
                }
                return;
            case 22:
                super.onDraw(canvas);
                ((dq0) this.f3898b).j(canvas, getMeasuredWidth(), getMeasuredHeight());
                return;
            case 25:
                super.onDraw(canvas);
                int S0 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -9057429, -10513163);
                int S02 = org.telegram.messenger.g0.S0(getTranslationX() / getMeasuredWidth(), 1.0f, -11554882, -4629871);
                no0 no0Var = (no0) this.f3898b;
                no0Var.getClass();
                if (S0 != 0) {
                    no0Var.h = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{S0, S02}, (float[]) null, Shader.TileMode.CLAMP);
                    no0Var.f37880n.setShader(no0Var.h);
                }
                no0Var.f37881r.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(no0Var.f37881r, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), no0Var.f37880n);
                return;
            case 27:
                cu0 cu0Var = (cu0) this.f3898b;
                if (cu0Var.f34135b != null && !cu0Var.K) {
                    Drawable newDrawable = cu0Var.getNewDrawable();
                    boolean newDrawableMotion = cu0Var.getNewDrawableMotion();
                    float f15 = 0.0f;
                    if (newDrawable != cu0Var.f34135b && newDrawable != null) {
                        if (org.telegram.ui.ActionBar.n6.h1()) {
                            cu0Var.d = cu0Var.f34135b;
                            cu0Var.f34140e = cu0Var.f34137c;
                        }
                        if (newDrawable instanceof za0) {
                            ((za0) newDrawable).q(cu0Var.M);
                        }
                        cu0Var.f34135b = newDrawable;
                        if (cu0Var.N && (newDrawable instanceof en)) {
                            ((en) newDrawable).f(this);
                        }
                        if (cu0Var.N) {
                            Drawable drawable3 = cu0Var.f34135b;
                            if (drawable3 instanceof za0) {
                                ((za0) drawable3).k();
                            }
                        }
                        cu0Var.f34137c = newDrawableMotion;
                        cu0Var.U = 0.0f;
                        cu0Var.T(cu0Var.f34135b);
                        cu0Var.G();
                    } else if (cu0Var.f34137c != newDrawableMotion) {
                        cu0Var.f34137c = newDrawableMotion;
                        cu0Var.G();
                    }
                    float f16 = 1.0f;
                    cu0Var.U = Utilities.i((org.telegram.messenger.g0.f24229t / 200.0f) + cu0Var.U, 1.0f, 0.0f);
                    int i14 = 0;
                    while (i14 < 2) {
                        if (i14 == 0) {
                            drawable = cu0Var.d;
                        } else {
                            drawable = cu0Var.f34135b;
                        }
                        if (drawable == null) {
                            f13 = f16;
                        } else {
                            boolean z11 = true;
                            if (i14 == 1 && cu0Var.d != null && cu0Var.H != null) {
                                drawable.setAlpha((int) (cu0Var.U * 255.0f));
                            } else {
                                drawable.setAlpha(255);
                            }
                            if (i14 == 0) {
                                z10 = cu0Var.f34140e;
                            } else {
                                z10 = cu0Var.f34137c;
                            }
                            if (z10) {
                                f10 = cu0Var.E;
                                f11 = cu0Var.f34147x;
                                f12 = cu0Var.f34148y;
                            } else {
                                f10 = f16;
                                f11 = f15;
                                f12 = f11;
                            }
                            if (drawable instanceof za0) {
                                za0 za0Var = (za0) drawable;
                                if (za0Var.f42805u == null) {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (cu0Var.O()) {
                                        i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                    } else {
                                        i11 = 0;
                                    }
                                    if (cu0Var.P() && cu0Var.f34145s) {
                                        i12 = org.telegram.messenger.g0.f24220m;
                                    } else {
                                        i12 = 0;
                                    }
                                    int i15 = i11 + i12;
                                    if (cu0Var.W()) {
                                        height2 = getRootView().getMeasuredHeight() - i15;
                                    } else {
                                        height2 = getHeight();
                                    }
                                    f13 = f16;
                                    float max2 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height2 / drawable.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max2 * f10);
                                    int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max2 * f10);
                                    int measuredWidth = ((getMeasuredWidth() - ceil) / 2) + ((int) f11);
                                    int i16 = ((height2 - ceil2) / 2) + cu0Var.F + i15 + ((int) f12);
                                    canvas.save();
                                    canvas.clipRect(0, i15, ceil, getMeasuredHeight() - cu0Var.h);
                                    drawable.setBounds(measuredWidth, i16, ceil + measuredWidth, ceil2 + i16);
                                    drawable.draw(canvas);
                                    cu0.F(cu0Var, canvas);
                                    canvas.restore();
                                } else {
                                    f13 = f16;
                                    if (cu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cu0Var.h);
                                    }
                                    za0Var.f42791f = cu0Var.F;
                                    drawable.setBounds(0, 0, getMeasuredWidth(), (int) ((getRootView().getMeasuredHeight() - cu0Var.F) + f12));
                                    drawable.draw(canvas);
                                    if (cu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            } else {
                                f13 = f16;
                                if (drawable instanceof ColorDrawable) {
                                    if (cu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - cu0Var.h);
                                    }
                                    drawable.setBounds(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight());
                                    drawable.draw(canvas);
                                    cu0.F(cu0Var, canvas);
                                    if (cu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    if (cu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cu0Var.h);
                                    }
                                    drawable.setBounds(0, cu0Var.F, getMeasuredWidth(), getRootView().getMeasuredHeight() + cu0Var.F);
                                    drawable.draw(canvas);
                                    cu0.F(cu0Var, canvas);
                                    if (cu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                } else if (drawable instanceof BitmapDrawable) {
                                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                        canvas.save();
                                        float f17 = 2.0f / org.telegram.messenger.g0.f24225p;
                                        canvas.scale(f17, f17);
                                        drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f17), (int) Math.ceil(getRootView().getMeasuredHeight() / f17));
                                        drawable.draw(canvas);
                                        cu0.F(cu0Var, canvas);
                                        canvas.restore();
                                    } else {
                                        if (cu0Var.O()) {
                                            i7 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                        } else {
                                            i7 = 0;
                                        }
                                        if (cu0Var.P() && cu0Var.f34145s) {
                                            i10 = org.telegram.messenger.g0.f24220m;
                                        } else {
                                            i10 = 0;
                                        }
                                        int i17 = i7 + i10;
                                        if (cu0Var.W()) {
                                            height = getRootView().getMeasuredHeight() - i17;
                                        } else {
                                            height = getHeight();
                                        }
                                        float max3 = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), height / drawable.getIntrinsicHeight());
                                        int ceil3 = (int) Math.ceil(drawable.getIntrinsicWidth() * max3 * f10);
                                        int ceil4 = (int) Math.ceil(drawable.getIntrinsicHeight() * max3 * f10);
                                        int measuredWidth2 = ((getMeasuredWidth() - ceil3) / 2) + ((int) f11);
                                        int i18 = ((height - ceil4) / 2) + cu0Var.F + i17 + ((int) f12);
                                        canvas.save();
                                        canvas.clipRect(0, i17, ceil3, getMeasuredHeight() - cu0Var.h);
                                        drawable.setBounds(measuredWidth2, i18, ceil3 + measuredWidth2, ceil4 + i18);
                                        drawable.draw(canvas);
                                        cu0.F(cu0Var, canvas);
                                        canvas.restore();
                                    }
                                } else {
                                    if (cu0Var.h != 0) {
                                        canvas.save();
                                        canvas.clipRect(0, 0, getMeasuredWidth(), getRootView().getMeasuredHeight() - cu0Var.h);
                                    }
                                    if (drawable instanceof en) {
                                        en enVar = (en) drawable;
                                        enVar.f47587b = this;
                                        za0 za0Var2 = enVar.f47590f;
                                        if (za0Var2 != null) {
                                            za0Var2.q(this);
                                        }
                                    }
                                    float f18 = f10 - f13;
                                    float f19 = a8.p0.f(-getMeasuredWidth(), f18, 2.0f, f11);
                                    float f20 = a8.p0.f(-getRootView().getMeasuredHeight(), f18, 2.0f, f12);
                                    drawable.setBounds((int) f19, (int) (cu0Var.F + f20), (int) ((getMeasuredWidth() * f10) + f19), (int) p5.c.e(getRootView().getMeasuredHeight(), f10, cu0Var.F, f20));
                                    drawable.draw(canvas);
                                    cu0.F(cu0Var, canvas);
                                    if (cu0Var.h != 0) {
                                        canvas.restore();
                                    }
                                }
                            }
                            if (i14 == 0 && (drawable2 = cu0Var.d) != null && cu0Var.U >= f13) {
                                if (cu0Var.N && (drawable2 instanceof en)) {
                                    ((en) drawable2).g(cu0Var.M);
                                }
                                if (cu0Var.N) {
                                    Drawable drawable4 = cu0Var.d;
                                    if (drawable4 instanceof za0) {
                                        ((za0) drawable4).l();
                                    }
                                }
                                cu0Var.d = null;
                                cu0Var.f34140e = false;
                                cu0Var.G();
                                cu0Var.M.invalidate();
                            }
                        }
                        i14++;
                        f16 = f13;
                        f15 = 0.0f;
                    }
                    if (cu0Var.U != f16) {
                        cu0Var.M.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 29:
                super.onDraw(canvas);
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
                sw0 sw0Var = (sw0) this.f3898b;
                org.telegram.ui.Components.voip.n nVar = sw0Var.M;
                Paint paint2 = sw0Var.f39723a;
                paint2.setColor(x02);
                Paint paint3 = sw0Var.f39724b;
                paint3.setColor(x02);
                Paint paint4 = sw0Var.f39725c;
                paint4.setColor(x02);
                paint3.setAlpha(255);
                paint4.setAlpha(82);
                paint2.setAlpha(46);
                Paint paint5 = sw0Var.d;
                paint5.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
                canvas.drawLine(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), paint2);
                boolean z12 = sw0Var.f39726e;
                if (z12 || sw0Var.K != 0.0f) {
                    if (z12) {
                        if (sw0Var.L) {
                            float f21 = sw0Var.K + 0.024615385f;
                            sw0Var.K = f21;
                            if (f21 > 1.0f) {
                                sw0Var.K = 1.0f;
                                sw0Var.L = false;
                            }
                        } else {
                            float f22 = sw0Var.K - 0.024615385f;
                            sw0Var.K = f22;
                            if (f22 < 0.0f) {
                                sw0Var.K = 0.0f;
                                sw0Var.L = true;
                            }
                        }
                    } else {
                        float f23 = sw0Var.K - 0.10666667f;
                        sw0Var.K = f23;
                        if (f23 < 0.0f) {
                            sw0Var.K = 0.0f;
                        }
                    }
                    invalidate();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(17.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(23.0f));
                    nVar.f41074f = getMeasuredWidth();
                    nVar.a(org.telegram.messenger.g0.L(3.0f), canvas, rectF, null);
                }
                int L2 = org.telegram.messenger.g0.L(24.0f);
                if (!sw0Var.f39726e) {
                    int L3 = org.telegram.messenger.g0.L(24.0f) + ((int) (m10.B(24.0f, 2, getMeasuredWidth()) * sw0Var.G));
                    f14 = 1.0f;
                    canvas.drawLine(L2, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f) + B, org.telegram.messenger.g0.L(20.0f), paint4);
                    canvas.drawRect(L3, org.telegram.messenger.g0.L(20.0f) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + L3, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(20.0f), paint5);
                    paint = paint5;
                } else {
                    f14 = 1.0f;
                    paint = paint5;
                }
                if (!sw0Var.f39726e) {
                    int B2 = (int) (m10.B(24.0f, 2, getMeasuredWidth()) * sw0Var.F);
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
        switch (this.f3897a) {
            case 1:
                pb pbVar = (pb) this.f3898b;
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
                ii.t tVar = (ii.t) this.f3898b;
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
                jg.n1 n1Var = (jg.n1) this.f3898b;
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
                ki.j jVar = (ki.j) this.f3898b;
                if (jVar.I) {
                    i14 = (ki.j.E0(jVar).getMeasuredHeight() + jVar.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.g0.L(140.0f) + jVar.J;
                    if (org.telegram.messenger.g0.L(24.0f) + jVar.E.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.g0.L(24.0f) + jVar.E.getMeasuredHeight();
                    }
                    i14 = L3;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), 1073741824));
                return;
            case 10:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(24.0f));
                return;
            case 11:
                v4.c0 c0Var = ((org.telegram.ui.n5) this.f3898b).d.G;
                if (c0Var instanceof vy) {
                    i15 = ((vy) c0Var).J;
                } else {
                    i15 = 0;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), 1073741824));
                return;
            case 14:
                ra raVar = (ra) this.f3898b;
                int i18 = raVar.f39249r1;
                if (i18 == 0) {
                    i16 = org.telegram.messenger.g0.L(300.0f);
                } else {
                    i16 = (int) (i18 * raVar.f39253v1);
                }
                int i19 = i16 - (((raVar.B1 - raVar.C1) - raVar.D1) - raVar.E1);
                if (i19 < 1) {
                    i19 = 1;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                return;
            case 15:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(((hm) this.f3898b).f35771w.K, 1073741824));
                return;
            case 16:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((qn) ((org.telegram.ui.l4) this.f3898b).f49583e).S0);
                return;
            case 17:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(((rn) ((org.telegram.ui.z7) this.f3898b).d).f39359x, 1073741824));
                return;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + Math.round(((wy0) this.f3898b).k()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(getPaddingBottom() + getPaddingTop() + Math.round(((wy0) this.f3898b).i()), org.telegram.messenger.g0.L(26.0f)), 1073741824));
                return;
            case 20:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + ((b60) this.f3898b).f33672c.f35945j2, 1073741824));
                return;
            case 21:
                int L4 = org.telegram.messenger.g0.L(48.0f);
                i60 i60Var = ((d60) this.f3898b).f34223n;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L4 + i60Var.f35945j2 + i60Var.f35951p2, 1073741824));
                return;
            case 24:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((wo0) this.f3898b).L.F1.R, 1073741824));
                return;
            case 26:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((st0) this.f3898b).getMeasuredHeight());
                return;
            case 28:
                bv0 bv0Var = (bv0) this.f3898b;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = ((View) getParent()).getMeasuredWidth();
                }
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f);
                kv0 kv0Var = bv0Var.d;
                int i20 = kv0Var.f36906o3;
                if (i20 > 0) {
                    i17 = org.telegram.messenger.g0.L(4.0f) + i20;
                } else {
                    i17 = 0;
                }
                int max = Math.max(i17, (int) (size - Math.min(org.telegram.messenger.g0.L(4.0f) + ((bv0Var.b() - 1) * size2), bv0Var.d.f36898f3 * size2)));
                kv0Var.f36905n3 = max;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), i10);
                return;
            case 29:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f3897a) {
            case 12:
                super.setAlpha(f10);
                View view = ((org.telegram.ui.e8) this.f3898b).f47472b.f48168y.fragmentView;
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
        switch (this.f3897a) {
            case 0:
                if (((n3) this.f3898b) != null) {
                    if (isAttachedToWindow()) {
                        n3 n3Var = (n3) this.f3898b;
                        if (n3Var.f3879i) {
                            n3Var.f3879i = false;
                            n3Var.a();
                            ai.d0 d0Var = n3Var.h;
                            HashSet hashSet = pc.f26318n;
                            if (hashSet != null) {
                                hashSet.remove(d0Var);
                            }
                        }
                    }
                    this.f3898b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof n3) {
                    this.f3898b = (n3) drawable;
                    if (isAttachedToWindow()) {
                        n3 n3Var2 = (n3) this.f3898b;
                        if (!n3Var2.f3879i) {
                            n3Var2.f3879i = true;
                            n3Var2.a();
                            ai.d0 d0Var2 = new ai.d0(n3Var2, 1);
                            n3Var2.h = d0Var2;
                            pc.a(d0Var2);
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
        switch (this.f3897a) {
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
        switch (this.f3897a) {
            case 14:
                super.setTranslationY(f10);
                int i7 = ra.S1;
                ((ra) this.f3898b).f30226b.invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public o3(Context context, int i7) {
        super(context);
        this.f3897a = i7;
    }

    public o3(ra raVar, Context context) {
        super(context);
        this.f3897a = 14;
        this.f3898b = raVar;
        setTag(-33024);
    }

    public o3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f3897a = 10;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, i6Var);
        this.f3898b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.n6.Yl, org.telegram.ui.ActionBar.n6.f29861z5, org.telegram.ui.ActionBar.n6.f29581k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(org.telegram.messenger.g0.L(5.0f));
    }
}
