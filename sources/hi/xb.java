package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x60;
public final class xb extends View {
    public final Paint A0;
    public int A1;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public final Path E;
    public final Paint E0;
    public boolean F;
    public final TextPaint F0;
    public String G;
    public final RectF G0;
    public boolean H;
    public final Path H0;
    public long I;
    public final Paint I0;
    public long J;
    public final wb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public vb N;
    public StaticLayout N0;
    public boolean O;
    public float O0;
    public String P;
    public float P0;
    public boolean Q;
    public final TextPaint Q0;
    public long R;
    public StaticLayout R0;
    public long S;
    public float S0;
    public float T;
    public float T0;
    public float U;
    public final LinearGradient U0;
    public boolean V;
    public final Matrix V0;
    public float W;
    public final Paint W0;
    public final ll0 X0;
    public boolean Y0;
    public final bi.s1 Z0;
    public rb f15792a;
    public boolean f15793a0;
    public long f15794a1;
    public Runnable f15795b;
    public qb f15796b0;
    public long f15797b1;
    public int f15798c;
    public int f15799c0;
    public final org.telegram.ui.Components.c6 f15800c1;
    public Runnable d;
    public final org.telegram.ui.Components.c6 f15801d0;
    public long f15802d1;
    public long f15803e;
    public final org.telegram.ui.Components.c6 f15804e0;
    public bi.e4 f15805e1;
    public long f15806f;
    public final org.telegram.ui.Components.c6 f15807f0;
    public long f15808f1;
    public final org.telegram.ui.Components.c6 f15809g0;
    public long f15810g1;
    public sb h;
    public final org.telegram.ui.Components.c6 f15811h0;
    public float f15812h1;
    public final org.telegram.ui.Components.c6 f15813i0;
    public int f15814i1;
    public final org.telegram.ui.Components.c6 f15815j0;
    public int f15816j1;
    public boolean f15817k0;
    public int f15818k1;
    public final org.telegram.ui.Components.ba f15819l0;
    public int l1;
    public final org.telegram.ui.Components.fa m0;
    public boolean f15820m1;
    public int f15821n;
    public final org.telegram.ui.Components.fa f15822n0;
    public boolean n1;
    public final org.telegram.ui.Components.fa f15823o0;
    public float f15824o1;
    public final RectF f15825p0;
    public boolean f15826p1;
    public final Path f15827q0;
    public VelocityTracker f15828q1;
    public final ArrayList f15829r;
    public final wy0 f15830r0;
    public boolean f15831r1;
    public final ArrayList f15832s;
    public final Drawable f15833s0;
    public boolean f15834s1;
    public final wb f15835t0;
    public int f15836t1;
    public final RectF f15837u0;
    public final float[] f15838u1;
    public final Paint f15839v0;
    public int f15840v1;
    public sb f15841w;
    public final Path f15842w0;
    public int f15843w1;
    public final Paint f15844x;
    public final Path f15845x0;
    public int f15846x1;
    public final Path f15847y;
    public final RectF f15848y0;
    public int f15849y1;
    public final Path f15850z0;
    public int f15851z1;

    public xb(Context context, ViewGroup viewGroup, za zaVar, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.f15821n = 0;
        this.f15829r = new ArrayList();
        this.f15832s = new ArrayList();
        this.f15844x = new Paint(3);
        this.f15847y = new Path();
        this.E = new Path();
        this.f15799c0 = 1;
        kr krVar = kr.h;
        this.f15801d0 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.f15804e0 = new org.telegram.ui.Components.c6(this, 360L, krVar);
        this.f15807f0 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.f15809g0 = new org.telegram.ui.Components.c6(this, 360L, krVar);
        this.f15811h0 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.f15813i0 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.f15815j0 = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.f15817k0 = true;
        this.f15825p0 = new RectF();
        this.f15827q0 = new Path();
        this.f15835t0 = new wb();
        this.f15837u0 = new RectF();
        this.f15839v0 = new Paint(3);
        this.f15842w0 = new Path();
        this.f15845x0 = new Path();
        this.f15848y0 = new RectF();
        this.f15850z0 = new Path();
        Paint paint = new Paint(1);
        this.A0 = paint;
        Paint paint2 = new Paint(1);
        this.B0 = paint2;
        Paint paint3 = new Paint(1);
        this.C0 = paint3;
        Paint paint4 = new Paint(1);
        this.D0 = paint4;
        Paint paint5 = new Paint(1);
        this.E0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        this.G0 = new RectF();
        this.H0 = new Path();
        Paint paint6 = new Paint(1);
        this.I0 = paint6;
        this.J0 = new wb();
        Paint paint7 = new Paint(1);
        this.K0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.M0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.Q0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U0 = linearGradient;
        this.V0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.W0 = paint8;
        this.X0 = new ll0(getContext(), null);
        this.f15794a1 = -1L;
        this.f15797b1 = -1L;
        this.f15800c1 = new org.telegram.ui.Components.c6(0.0f, this, 0L, 340L, krVar);
        this.f15802d1 = -1L;
        this.f15814i1 = -1;
        this.f15816j1 = -1;
        this.f15818k1 = -1;
        this.l1 = -1;
        this.f15824o1 = 1.0f;
        this.f15831r1 = true;
        this.f15834s1 = false;
        this.f15838u1 = new float[8];
        paint7.setColor(Integer.MAX_VALUE);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 436207616);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), 1073741824);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.f15830r0 = new wy0(gd.N0(2131744212, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232785).mutate();
        this.f15833s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231191).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15819l0 = baVar;
        this.m0 = new org.telegram.ui.Components.fa(baVar, this, 0, false);
        this.f15822n0 = new org.telegram.ui.Components.fa(baVar, this, 3, false);
        this.f15823o0 = new org.telegram.ui.Components.fa(baVar, this, 4, false);
        this.Z0 = new bi.s1(this, viewGroup, i6Var, baVar, zaVar, 15);
    }

    public static void a(final xb xbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ba baVar, View view) {
        int i7;
        ArrayList arrayList = xbVar.f15832s;
        int i10 = xbVar.f15818k1;
        try {
            if (i10 == 2 && xbVar.O) {
                g7 g7Var = new g7(xbVar.getContext(), 0);
                g7Var.f14545b = 0.0f;
                g7Var.f14546c = 1.5f;
                g7Var.d(xbVar.W);
                g7Var.h = new w10(xbVar) {
                    public final xb f15200b;

                    {
                        this.f15200b = xbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                xb xbVar2 = this.f15200b;
                                xbVar2.W = floatValue;
                                rb rbVar = xbVar2.f15792a;
                                if (rbVar != null) {
                                    rbVar.n(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                xb xbVar3 = this.f15200b;
                                xbVar3.M = floatValue2;
                                rb rbVar2 = xbVar3.f15792a;
                                if (rbVar2 != null) {
                                    rbVar2.k(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                xb xbVar4 = this.f15200b;
                                xbVar4.h.f15414i = f10.floatValue();
                                rb rbVar3 = xbVar4.f15792a;
                                if (rbVar3 != null) {
                                    rbVar3.L(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(xbVar.getBaseDuration(), xbVar.getMaxScrollDuration());
                int i11 = xbVar.f15843w1;
                int i12 = xbVar.f15851z1;
                int i13 = xbVar.f15849y1;
                float min2 = Math.min((i11 - i12) - i13, ((((org.telegram.messenger.g0.T1(xbVar.U, 1.0f, xbVar.f15809g0.f33931c) * ((float) xbVar.S)) + ((float) (xbVar.R - xbVar.f15806f))) / ((float) min)) * xbVar.f15840v1) + i12 + i13);
                x60 G = x60.G(viewGroup, i6Var, xbVar);
                G.q(g7Var);
                G.o(true);
                G.c(2131232113, gd.N0(2131744479, null), new ob(xbVar, 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(xbVar.f15843w1 - min2)) + org.telegram.messenger.g0.L(18.0f), xbVar.G0.top);
                G.a0();
                G.S(baVar, -view.getX(), -view.getY());
                xbVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && xbVar.F) {
                g7 g7Var2 = new g7(xbVar.getContext(), 0);
                g7Var2.f14545b = 0.0f;
                g7Var2.f14546c = 1.5f;
                g7Var2.d(xbVar.M);
                g7Var2.h = new w10(xbVar) {
                    public final xb f15200b;

                    {
                        this.f15200b = xbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                xb xbVar2 = this.f15200b;
                                xbVar2.W = floatValue;
                                rb rbVar = xbVar2.f15792a;
                                if (rbVar != null) {
                                    rbVar.n(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                xb xbVar3 = this.f15200b;
                                xbVar3.M = floatValue2;
                                rb rbVar2 = xbVar3.f15792a;
                                if (rbVar2 != null) {
                                    rbVar2.k(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                xb xbVar4 = this.f15200b;
                                xbVar4.h.f15414i = f10.floatValue();
                                rb rbVar3 = xbVar4.f15792a;
                                if (rbVar3 != null) {
                                    rbVar3.L(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(xbVar.getBaseDuration(), xbVar.getMaxScrollDuration());
                int i14 = xbVar.f15843w1;
                int i15 = xbVar.f15851z1;
                int i16 = xbVar.f15849y1;
                float min4 = Math.min((i14 - i15) - i16, ((((org.telegram.messenger.g0.T1(xbVar.L, 1.0f, xbVar.f15804e0.f33931c) * ((float) xbVar.I)) + ((float) (xbVar.J - xbVar.f15806f))) / ((float) min3)) * xbVar.f15840v1) + i15 + i16);
                x60 G2 = x60.G(viewGroup, i6Var, xbVar);
                G2.q(g7Var2);
                G2.o(true);
                G2.c(2131232113, gd.N0(2131744243, null), new ob(xbVar, 2), false);
                G2.W(5);
                G2.X = true;
                G2.b0((-(xbVar.f15843w1 - min4)) + org.telegram.messenger.g0.L(18.0f), xbVar.f15848y0.top);
                G2.a0();
                G2.S(baVar, -view.getX(), -view.getY());
                xbVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && xbVar.h != null) {
                g7 g7Var3 = new g7(xbVar.getContext(), 0);
                g7Var3.f14545b = 0.0f;
                g7Var3.f14546c = 1.5f;
                g7Var3.d(xbVar.h.f15414i);
                g7Var3.h = new w10(xbVar) {
                    public final xb f15200b;

                    {
                        this.f15200b = xbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                xb xbVar2 = this.f15200b;
                                xbVar2.W = floatValue;
                                rb rbVar = xbVar2.f15792a;
                                if (rbVar != null) {
                                    rbVar.n(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                xb xbVar3 = this.f15200b;
                                xbVar3.M = floatValue2;
                                rb rbVar2 = xbVar3.f15792a;
                                if (rbVar2 != null) {
                                    rbVar2.k(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                xb xbVar4 = this.f15200b;
                                xbVar4.h.f15414i = f10.floatValue();
                                rb rbVar3 = xbVar4.f15792a;
                                if (rbVar3 != null) {
                                    rbVar3.L(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                x60 G3 = x60.G(viewGroup, i6Var, xbVar);
                G3.q(g7Var3);
                G3.W(5);
                G3.X = true;
                G3.b0(org.telegram.messenger.g0.L(18.0f), xbVar.f15837u0.top);
                G3.a0();
                G3.S(baVar, -view.getX(), -view.getY());
                xbVar.performHapticFeedback(0, 1);
            } else if (i10 == 3 && (i7 = xbVar.l1) >= 0 && i7 < arrayList.size()) {
                sb sbVar = (sb) arrayList.get(xbVar.l1);
                g7 g7Var4 = new g7(xbVar.getContext(), 0);
                g7Var4.f14545b = 0.0f;
                g7Var4.f14546c = 1.5f;
                g7Var4.d(sbVar.f15414i);
                g7Var4.h = new ai.s1(23, xbVar, sbVar);
                x60 G4 = x60.G(viewGroup, i6Var, xbVar);
                G4.q(g7Var4);
                G4.W(5);
                G4.X = true;
                G4.b0(org.telegram.messenger.g0.L(18.0f), sbVar.f15415j.top);
                G4.a0();
                G4.S(baVar, -view.getX(), -view.getY());
                xbVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.g0.W1(this.f15809g0.d(this.Q), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public long getBaseDuration() {
        sb sbVar = this.h;
        if (sbVar != null) {
            return Math.max(1L, sbVar.f15411e);
        }
        sb sbVar2 = this.f15841w;
        if (sbVar2 != null) {
            return Math.max(1L, sbVar2.f15411e);
        }
        if (this.F) {
            return Math.max(1L, this.I);
        }
        return Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f15832s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (f10 > 0.0f) {
                f10 += org.telegram.messenger.g0.L(4.0f);
            }
            f10 += org.telegram.messenger.g0.W1(((sb) arrayList.get(i7)).f15416k.f33931c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.F) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(this.f15804e0.d(this.H), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    private float getVideoHeight() {
        sb sbVar = this.h;
        if (sbVar == null) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(sbVar.f15416k.f33931c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: hi.xb.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        ll0 ll0Var = this.X0;
        if (ll0Var.b()) {
            int i7 = ll0Var.f37169j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f15831r1) {
                this.f15806f = Math.max(0.0f, (((i7 - this.f15851z1) - this.f15849y1) / this.f15840v1) * ((float) min));
            } else if (!this.Q) {
                ll0Var.a();
                return;
            } else {
                int i10 = this.f15851z1;
                int i11 = this.f15849y1;
                float f10 = this.f15840v1;
                float f11 = (float) min;
                h(((((i7 - i10) - i11) / f10) * f11) - ((((this.f15836t1 - i10) - i11) / f10) * f11));
            }
            invalidate();
            this.f15836t1 = i7;
        } else if (this.f15834s1) {
            this.f15834s1 = false;
            rb rbVar = this.f15792a;
            if (rbVar != null) {
                rbVar.D(false);
            }
        }
    }

    public final void d(float f10, float f11, float f12, long j3, Canvas canvas) {
        long j10;
        float f13;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = (float) Utilities.k(j3, getBaseDuration(), 0L);
        sb sbVar = this.f15841w;
        if (sbVar != null) {
            f13 = (sbVar.f15413g * ((float) sbVar.f15411e)) + ((float) sbVar.f15412f);
        } else {
            if (this.h == null) {
                j10 = this.R;
            } else {
                j10 = 0;
            }
            f13 = (float) j10;
        }
        float f14 = (this.f15840v1 * (((k10 + f13) - ((float) this.f15806f)) / ((float) min))) + this.f15851z1 + this.f15849y1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.D0;
        paint.setAlpha((int) (38.0f * f12));
        Paint paint2 = this.E0;
        paint2.setAlpha((int) (f12 * 255.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        rectF.inset(-org.telegram.messenger.g0.N(0.66f), -org.telegram.messenger.g0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r58) {
        throw new UnsupportedOperationException("Method not decompiled: hi.xb.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        Paint paint2;
        float f16;
        float f17;
        float f18;
        if (f14 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        float f19 = 10.0f;
        rectF.set(f12 - org.telegram.messenger.g0.L(10.0f), f10, org.telegram.messenger.g0.L(10.0f) + f13, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f15843w1, this.f15846x1, 255, 31);
        int i7 = (int) (255.0f * f14);
        Paint paint3 = this.A0;
        paint3.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint3);
        if (this.Y0) {
            f15 = 2.5f;
        } else {
            f15 = 10.0f;
        }
        rectF.inset(org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(2.0f));
        boolean z10 = this.Y0;
        Paint paint4 = this.B0;
        if (z10) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float L = org.telegram.messenger.g0.L(2.0f);
        float L2 = org.telegram.messenger.g0.L(10.0f);
        Paint paint5 = this.C0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i7);
        if (this.Y0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float y10 = org.telegram.messenger.f3.y(org.telegram.messenger.g0.L(f16), L, 2.0f, f12);
        float f20 = f10 + f11;
        float f21 = (f20 - L2) / 2.0f;
        if (this.Y0) {
            f17 = 2.0f;
        } else {
            f17 = 10.0f;
        }
        float f22 = (f20 + L2) / 2.0f;
        rectF.set(y10, f21, f12 - ((org.telegram.messenger.g0.L(f17) + L) / 2.0f), f22);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint2);
            if (paint != null && !this.Y0) {
                paint5.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            }
        }
        if (this.Y0) {
            f18 = 2.5f;
        } else {
            f18 = 10.0f;
        }
        float A = com.google.android.gms.internal.vision.e2.A(org.telegram.messenger.g0.L(f18), L, 2.0f, f13);
        if (this.Y0) {
            f19 = 2.5f;
        }
        rectF.set(A, f21, org.telegram.messenger.f3.a(org.telegram.messenger.g0.L(f19), L, 2.0f, f13), f22);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.f15799c0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f10;
        float collageHeight;
        float f11;
        float f12 = this.A1;
        float f13 = 0.0f;
        if (this.h != null) {
            f10 = getVideoHeight() + org.telegram.messenger.g0.L(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f12 + f10;
        if (this.f15832s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + org.telegram.messenger.g0.L(4.0f);
        }
        float f15 = f14 + collageHeight;
        if (this.F) {
            f11 = getRoundHeight() + org.telegram.messenger.g0.L(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f16 = f15 + f11;
        if (this.O) {
            f13 = org.telegram.messenger.g0.L(4.0f) + getAudioHeight();
        }
        return (int) (f16 + f13 + this.A1);
    }

    public int getMaxCount() {
        return this.f15799c0;
    }

    public long getMaxScrollDuration() {
        if (this.f15832s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return org.telegram.messenger.g0.W1(this.f15815j0.f33931c, org.telegram.messenger.g0.L(28.0f) + this.A1 + this.A1, getContentHeight());
    }

    public final void h(float f10) {
        float f11;
        long j3;
        float f12;
        long j10;
        float f13;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        rb rbVar;
        long j16;
        long k10;
        sb sbVar = this.h;
        if (sbVar == null && !this.F) {
            long j17 = this.R;
            long k11 = Utilities.k(j17 + f10, 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k11;
            float f14 = (float) (k11 - j17);
            this.T = Utilities.i(this.T - (f14 / ((float) this.S)), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f14 / ((float) this.S)), 1.0f, 0.0f);
            rb rbVar2 = this.f15792a;
            if (rbVar2 != null) {
                rbVar2.j0(this.T);
                this.f15792a.d0(this.U);
            }
        } else if (this.Q) {
            if (sbVar != null) {
                f11 = sbVar.f15413g;
                j3 = sbVar.f15411e;
            } else {
                f11 = this.K;
                j3 = this.I;
            }
            float f15 = f11 * ((float) j3);
            if (sbVar != null) {
                f12 = sbVar.h;
                j10 = sbVar.f15411e;
            } else {
                f12 = this.L;
                j10 = this.I;
            }
            float f16 = f12 * ((float) j10);
            if (sbVar != null) {
                f13 = (sbVar.h - sbVar.f15413g) * ((float) sbVar.f15411e);
            } else {
                f13 = ((float) this.I) * (this.L - this.K);
            }
            float f17 = this.U;
            float f18 = (float) this.S;
            float f19 = this.T;
            long j18 = f15 - (f19 * f18);
            float min = Math.min(f17 - f19, f13 / f18);
            long j19 = this.R;
            long j20 = f10;
            long j21 = j19 + j20;
            if (j21 > f16 - (f17 * f18)) {
                float i7 = Utilities.i(((f16 - ((float) j19)) - ((float) j20)) / ((float) this.S), 1.0f, min);
                this.U = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.T = i10;
                float f20 = this.U;
                float f21 = (float) this.S;
                long j22 = f16 - (f20 * f21);
                long j23 = f15 - (i10 * f21);
                if (j22 < j23) {
                    j14 = j23;
                    j13 = j22;
                } else {
                    j13 = j23;
                    j14 = j22;
                }
                this.R = Utilities.k(this.R + j20, j14, j13);
                rb rbVar3 = this.f15792a;
                if (rbVar3 != null) {
                    rbVar3.j0(this.T);
                    this.f15792a.d0(this.U);
                }
            } else if (j21 < j18) {
                float i11 = Utilities.i(((f15 - ((float) j19)) - ((float) j20)) / ((float) this.S), 1.0f - min, 0.0f);
                this.T = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.U = i12;
                float f22 = (float) this.S;
                long j24 = f16 - (i12 * f22);
                long j25 = f15 - (this.T * f22);
                if (j24 < j25) {
                    j12 = j25;
                    j11 = j24;
                } else {
                    j11 = j25;
                    j12 = j24;
                }
                this.R = Utilities.k(this.R + j20, j12, j11);
                rb rbVar4 = this.f15792a;
                if (rbVar4 != null) {
                    rbVar4.j0(this.T);
                    this.f15792a.d0(this.U);
                }
            } else {
                this.R = j21;
            }
        } else {
            long j26 = this.R + f10;
            float f23 = (float) this.S;
            this.R = Utilities.k(j26, ((float) getBaseDuration()) - (this.U * f23), (-this.T) * f23);
        }
        invalidate();
        rb rbVar5 = this.f15792a;
        if (rbVar5 != null) {
            rbVar5.y0(this.R + (this.T * ((float) this.S)));
        }
        boolean z10 = this.n1;
        if (!z10 && (rbVar = this.f15792a) != null) {
            rbVar.D(true);
            sb sbVar2 = this.h;
            if (sbVar2 != null) {
                long j27 = this.R + (this.T * ((float) this.S));
                float f24 = sbVar2.h;
                float f25 = (float) sbVar2.f15411e;
                k10 = Utilities.k(j27, f24 * f25, sbVar2.f15413g * f25);
            } else if (this.F) {
                long j28 = this.R + (this.T * ((float) this.S));
                float f26 = this.L;
                float f27 = (float) this.I;
                k10 = Utilities.k(j28, f26 * f27, this.K * f27);
            } else {
                float f28 = this.T;
                k10 = Utilities.k(f28 * ((float) j16), this.S, 0L);
            }
            if (this.h != null && Math.abs(this.f15803e - k10) > 400) {
                this.f15802d1 = this.f15803e;
                this.f15800c1.e(true, 1.0f);
            }
            rb rbVar6 = this.f15792a;
            this.f15803e = k10;
            rbVar6.p(k10, false);
        } else if (z10 || this.f15834s1) {
            sb sbVar3 = this.h;
            if (sbVar3 != null) {
                long j29 = this.R + (this.T * ((float) this.S));
                float f29 = sbVar3.h;
                float f30 = (float) sbVar3.f15411e;
                this.f15803e = Utilities.k(j29, f29 * f30, sbVar3.f15413g * f30);
            } else if (this.F && sbVar3 != null) {
                long j30 = this.R + (this.T * ((float) this.S));
                float f31 = this.L;
                float f32 = (float) sbVar3.f15411e;
                this.f15803e = Utilities.k(j30, f31 * f32, this.K * f32);
            } else {
                float f33 = this.T;
                this.f15803e = Utilities.k(f33 * ((float) j15), this.S, 0L);
            }
            rb rbVar7 = this.f15792a;
            if (rbVar7 != null) {
                rbVar7.p(this.f15803e, false);
            }
        }
    }

    public final void i(sb sbVar, float f10) {
        long j3;
        rb rbVar;
        long j10;
        long k10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (sbVar != null) {
            sb sbVar2 = this.f15841w;
            if (sbVar2 != sbVar && sbVar2 != null) {
                if (this.f15821n == this.f15832s.indexOf(sbVar)) {
                    sb sbVar3 = this.f15841w;
                    float f11 = (float) sbVar3.f15411e;
                    float f12 = sbVar.h;
                    float f13 = (float) sbVar.f15411e;
                    float f14 = sbVar.f15413g;
                    long j15 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((sbVar3.h - sbVar3.f15413g) * f11) / f13);
                    long j16 = sbVar.f15412f;
                    long j17 = f10;
                    long j18 = j16 + j17;
                    if (j18 > (f11 * 1.0f) - (f12 * f13)) {
                        sb sbVar4 = this.f15841w;
                        float i7 = Utilities.i((((sbVar4.h * ((float) sbVar4.f15411e)) - ((float) j16)) - ((float) j17)) / ((float) sbVar.f15411e), 1.0f, min);
                        sbVar.h = i7;
                        float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                        sbVar.f15413g = i10;
                        sb sbVar5 = this.f15841w;
                        float f15 = sbVar5.h;
                        float f16 = (float) sbVar5.f15411e;
                        float f17 = sbVar.h;
                        float f18 = (float) sbVar.f15411e;
                        long j19 = (f15 * f16) - (f17 * f18);
                        long j20 = (sbVar5.f15413g * f16) - (i10 * f18);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        sbVar.f15412f = Utilities.k(sbVar.f15412f + j17, j14, j13);
                        rb rbVar2 = this.f15792a;
                        if (rbVar2 != null) {
                            rbVar2.b0(sbVar.f15413g, sbVar.f15408a);
                            this.f15792a.n0(sbVar.h, sbVar.f15408a);
                        }
                    } else if (j18 < j15) {
                        sb sbVar6 = this.f15841w;
                        float i11 = Utilities.i((((sbVar6.f15413g * ((float) sbVar6.f15411e)) - ((float) j16)) - ((float) j17)) / ((float) sbVar.f15411e), 1.0f - min, 0.0f);
                        sbVar.f15413g = i11;
                        float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                        sbVar.h = i12;
                        sb sbVar7 = this.f15841w;
                        float f19 = sbVar7.h;
                        float f20 = (float) sbVar7.f15411e;
                        float f21 = (float) sbVar.f15411e;
                        long j21 = (f19 * f20) - (i12 * f21);
                        long j22 = (sbVar7.f15413g * f20) - (sbVar.f15413g * f21);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        sbVar.f15412f = Utilities.k(sbVar.f15412f + j17, j12, j11);
                        rb rbVar3 = this.f15792a;
                        if (rbVar3 != null) {
                            rbVar3.b0(sbVar.f15413g, sbVar.f15408a);
                            this.f15792a.n0(sbVar.h, sbVar.f15408a);
                        }
                    } else {
                        sbVar.f15412f = j18;
                    }
                } else {
                    long j23 = sbVar.f15412f + f10;
                    float f22 = (float) sbVar.f15411e;
                    sbVar.f15412f = Utilities.k(j23, ((float) getBaseDuration()) - (sbVar.h * f22), (-sbVar.f15413g) * f22);
                }
            }
            invalidate();
            rb rbVar4 = this.f15792a;
            if (rbVar4 != null) {
                rbVar4.u0(sbVar.f15408a, sbVar.f15412f);
            }
            boolean z10 = this.n1;
            if (!z10 && (rbVar = this.f15792a) != null) {
                rbVar.D(true);
                sb sbVar8 = this.f15841w;
                if (sbVar8 != sbVar && sbVar8 != null) {
                    long j24 = sbVar.f15412f + (sbVar.f15413g * ((float) sbVar.f15411e));
                    float f23 = sbVar8.h;
                    float f24 = (float) sbVar8.f15411e;
                    k10 = Utilities.k(j24, f23 * f24, sbVar8.f15413g * f24);
                } else {
                    float f25 = sbVar.f15413g;
                    k10 = Utilities.k(f25 * ((float) j10), sbVar.f15411e, 0L);
                }
                sb sbVar9 = this.f15841w;
                if (sbVar9 != sbVar && sbVar9 != null && Math.abs(this.f15803e - k10) > 400) {
                    this.f15802d1 = this.f15803e;
                    this.f15800c1.e(true, 1.0f);
                }
                rb rbVar5 = this.f15792a;
                this.f15803e = k10;
                rbVar5.p(k10, false);
            } else if (z10 || this.f15834s1) {
                sb sbVar10 = this.f15841w;
                if (sbVar10 != sbVar && sbVar10 != null) {
                    long j25 = sbVar.f15412f + (sbVar.f15413g * ((float) sbVar.f15411e));
                    float f26 = sbVar10.h;
                    float f27 = (float) sbVar10.f15411e;
                    this.f15803e = Utilities.k(j25, f26 * f27, sbVar10.f15413g * f27);
                } else {
                    float f28 = sbVar.f15413g;
                    this.f15803e = Utilities.k(f28 * ((float) j3), sbVar.f15411e, 0L);
                }
                rb rbVar6 = this.f15792a;
                if (rbVar6 != null) {
                    rbVar6.p(this.f15803e, false);
                }
            }
        }
    }

    public final void j(float f10) {
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        rb rbVar;
        long j14;
        long k10;
        sb sbVar = this.h;
        if (sbVar == null) {
            long j15 = this.J;
            long k11 = Utilities.k(j15 + f10, 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k11;
            float f11 = (float) (k11 - j15);
            this.K = Utilities.i(this.K - (f11 / ((float) this.I)), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f11 / ((float) this.I)), 1.0f, 0.0f);
            rb rbVar2 = this.f15792a;
            if (rbVar2 != null) {
                rbVar2.z(this.K);
                this.f15792a.r0(this.L);
            }
        } else if (this.H) {
            float f12 = sbVar.h;
            float f13 = (float) sbVar.f15411e;
            float f14 = this.L;
            float f15 = (float) this.I;
            long j16 = (f12 * f13) - (f14 * f15);
            float f16 = sbVar.f15413g;
            float f17 = this.K;
            long j17 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j18 = this.J;
            long j19 = f10;
            long j20 = j18 + j19;
            if (j20 > j16) {
                sb sbVar2 = this.h;
                float i7 = Utilities.i((((sbVar2.h * ((float) sbVar2.f15411e)) - ((float) j18)) - ((float) j19)) / ((float) this.I), 1.0f, min);
                this.L = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.K = i10;
                sb sbVar3 = this.h;
                float f18 = sbVar3.h;
                float f19 = (float) sbVar3.f15411e;
                float f20 = this.L;
                float f21 = (float) this.I;
                long j21 = (f18 * f19) - (f20 * f21);
                long j22 = (sbVar3.f15413g * f19) - (i10 * f21);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.J = Utilities.k(this.J + j19, j12, j11);
                rb rbVar3 = this.f15792a;
                if (rbVar3 != null) {
                    rbVar3.z(this.K);
                    this.f15792a.r0(this.L);
                }
            } else if (j20 < j17) {
                sb sbVar4 = this.h;
                float i11 = Utilities.i((((sbVar4.f15413g * ((float) sbVar4.f15411e)) - ((float) j18)) - ((float) j19)) / ((float) this.I), 1.0f - min, 0.0f);
                this.K = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.L = i12;
                sb sbVar5 = this.h;
                float f22 = sbVar5.h;
                float f23 = (float) sbVar5.f15411e;
                float f24 = (float) this.I;
                long j23 = (f22 * f23) - (i12 * f24);
                long j24 = (sbVar5.f15413g * f23) - (this.K * f24);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.J = Utilities.k(this.J + j19, j10, j3);
                rb rbVar4 = this.f15792a;
                if (rbVar4 != null) {
                    rbVar4.z(this.K);
                    this.f15792a.r0(this.L);
                }
            } else {
                this.J = j20;
            }
        } else {
            long j25 = this.J + f10;
            float f25 = (float) this.I;
            this.J = Utilities.k(j25, ((float) getBaseDuration()) - (this.L * f25), (-this.K) * f25);
        }
        invalidate();
        rb rbVar5 = this.f15792a;
        if (rbVar5 != null) {
            rbVar5.U(this.J + (this.K * ((float) this.I)));
        }
        boolean z10 = this.n1;
        if (!z10 && (rbVar = this.f15792a) != null) {
            rbVar.D(true);
            sb sbVar6 = this.h;
            if (sbVar6 != null) {
                long j26 = this.J + (this.K * ((float) this.I));
                float f26 = sbVar6.h;
                float f27 = (float) sbVar6.f15411e;
                k10 = Utilities.k(j26, f26 * f27, sbVar6.f15413g * f27);
            } else {
                float f28 = this.K;
                k10 = Utilities.k(f28 * ((float) j14), this.I, 0L);
            }
            if (this.h != null && Math.abs(this.f15803e - k10) > 400) {
                this.f15802d1 = this.f15803e;
                this.f15800c1.e(true, 1.0f);
            }
            rb rbVar6 = this.f15792a;
            this.f15803e = k10;
            rbVar6.p(k10, false);
        } else if (z10 || this.f15834s1) {
            sb sbVar7 = this.h;
            if (sbVar7 != null) {
                long j27 = this.J + (this.K * ((float) this.I));
                float f29 = sbVar7.h;
                float f30 = (float) sbVar7.f15411e;
                this.f15803e = Utilities.k(j27, f29 * f30, sbVar7.f15413g * f30);
            } else {
                float f31 = this.K;
                this.f15803e = Utilities.k(f31 * ((float) j13), this.I, 0L);
            }
            rb rbVar7 = this.f15792a;
            if (rbVar7 != null) {
                rbVar7.p(this.f15803e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        sb sbVar = this.h;
        long j3 = sbVar.f15411e;
        this.f15806f = Utilities.k((((sbVar.h + sbVar.f15413g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        boolean z11 = true;
        if (z10 && this.F) {
            this.H = true;
            this.Q = false;
        } else {
            this.H = false;
            if (!this.O || this.h != null) {
                z11 = false;
            }
            this.Q = z11;
        }
        invalidate();
    }

    public final boolean m(boolean z10, float f10) {
        long j3;
        sb sbVar;
        sb sbVar2 = this.h;
        ArrayList arrayList = this.f15832s;
        if (sbVar2 != null || this.O || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f15851z1) - this.f15849y1) / this.f15840v1;
            sb sbVar3 = this.f15841w;
            if (sbVar3 != null) {
                j3 = (sbVar3.f15413g * ((float) sbVar3.f15411e)) + ((float) sbVar3.f15412f);
            } else {
                j3 = 0;
            }
            float f12 = f11 * ((float) min);
            if (sbVar3 == null) {
                if (this.h == null) {
                    j3 = this.R;
                } else {
                    j3 = 0;
                }
            }
            long i7 = Utilities.i((f12 - ((float) j3)) + ((float) this.f15806f), (float) getBaseDuration(), 0.0f);
            sb sbVar4 = this.h;
            if (sbVar4 != null) {
                float f13 = ((float) i7) / ((float) sbVar4.f15411e);
                if (f13 < sbVar4.f15413g || f13 > sbVar4.h) {
                    return false;
                }
            }
            if (this.f15841w == null || (i7 >= 0 && i7 < (sbVar.h - sbVar.f15413g) * ((float) sbVar.f15411e))) {
                if (this.O && sbVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) i7) / ((float) this.S);
                    if (f14 < this.T || f14 > this.U) {
                        return false;
                    }
                }
                this.f15803e = i7;
                invalidate();
                rb rbVar = this.f15792a;
                if (rbVar != null) {
                    rbVar.p(i7, z10);
                }
                bi.e4 e4Var = this.f15805e1;
                if (e4Var != null) {
                    org.telegram.messenger.g0.r(e4Var);
                    this.f15805e1 = null;
                }
                if (z10) {
                    bi.e4 e4Var2 = new bi.e4(this, i7, 10);
                    this.f15805e1 = e4Var2;
                    org.telegram.messenger.g0.h3(e4Var2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j3, long j10, float f10, float f11, float f12, boolean z10) {
        boolean z11;
        long j11;
        boolean z12;
        boolean z13;
        sb sbVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        vb vbVar = this.N;
        Long l10 = null;
        if (vbVar != null) {
            vbVar.b();
            this.N = null;
        }
        long j12 = this.I;
        if (str != null) {
            this.G = str;
            this.I = j3;
            this.J = j10 - (((float) j3) * f10);
            this.K = f10;
            this.L = f11;
            this.M = f12;
            if (getMeasuredWidth() <= 0 || this.N != null || ((sbVar = this.h) != null && sbVar.f15411e < 1)) {
                z11 = false;
                j11 = j12;
                z12 = true;
            } else {
                String str2 = this.G;
                int i7 = this.f15843w1;
                int i10 = this.f15851z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j13 = this.I;
                if (j13 > 2) {
                    l10 = Long.valueOf(j13);
                }
                sb sbVar2 = this.h;
                if (sbVar2 != null) {
                    maxScrollDuration = sbVar2.f15411e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z11 = false;
                z12 = true;
                this.N = new vb(this, false, str2, i11, L, l10, maxScrollDuration, -1L, -1L, new ob(this, 0));
            }
            if (this.h == null) {
                this.Q = z11;
                this.H = z12;
            }
        } else {
            z11 = false;
            j11 = j12;
            z12 = true;
            this.G = null;
            this.I = 1L;
            this.H = false;
        }
        if (this.G != null) {
            z13 = z12;
        } else {
            z13 = z11;
        }
        this.F = z13;
        if (j11 != j3 && this.h == null && this.f15796b0 != null) {
            this.f15793a0 = z12;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(((float) j3) / ((float) this.S), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f15804e0.f(this.H, z12);
            this.f15809g0.f(this.Q, z12);
            this.f15801d0.f(this.F, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f10) {
        String str2;
        sb sbVar = this.h;
        if (sbVar == null) {
            str2 = null;
        } else {
            str2 = sbVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        sb sbVar2 = this.h;
        if (sbVar2 != null) {
            vb vbVar = sbVar2.f15410c;
            if (vbVar != null) {
                vbVar.b();
                this.h.f15410c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f15806f = 0L;
            sb sbVar3 = new sb(this);
            this.h = sbVar3;
            sbVar3.f15409b = z10;
            sbVar3.d = str;
            sbVar3.f15411e = j3;
            sbVar3.f15414i = f10;
            sb.a(sbVar3, false);
        } else {
            this.h = null;
            this.f15806f = 0L;
        }
        if (!this.F) {
            this.H = false;
        }
        this.f15803e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.M0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.Q0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        this.f15851z1 = L;
        int L2 = org.telegram.messenger.g0.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        int size = View.MeasureSpec.getSize(i7);
        this.f15843w1 = size;
        int L3 = org.telegram.messenger.g0.L(388);
        this.f15846x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        this.f15849y1 = L4;
        this.f15840v1 = (this.f15843w1 - (L4 * 2)) - (this.f15851z1 * 2);
        sb sbVar = this.h;
        if (sbVar != null && sbVar.d != null && sbVar.f15410c == null) {
            sb.a(sbVar, false);
        }
        ArrayList arrayList = this.f15832s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                sb sbVar2 = (sb) obj;
                if (sbVar2.d != null && sbVar2.f15410c == null) {
                    sb.a(sbVar2, false);
                    sb.b(sbVar2);
                }
            }
        }
        if (this.P != null && this.f15796b0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: hi.xb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f15796b0 == null || this.f15793a0) {
                this.f15796b0 = new qb(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.f15811h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        sb sbVar;
        a3.c cVar = new a3.c(29);
        ArrayList arrayList = this.f15832s;
        Collections.sort(arrayList, cVar);
        if (arrayList.isEmpty()) {
            sbVar = null;
        } else {
            sbVar = (sb) arrayList.get(0);
        }
        this.f15841w = sbVar;
        if (sbVar != null) {
            long j3 = sbVar.f15412f;
        }
    }

    public void setCollage(ArrayList<x7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        vb vbVar;
        int i7 = 0;
        while (true) {
            arrayList2 = this.f15832s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            sb sbVar = (sb) arrayList2.get(i7);
            if (sbVar != null && (vbVar = sbVar.f15410c) != null) {
                vbVar.b();
            }
            i7++;
        }
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            arrayList3 = this.f15829r;
            if (i10 >= arrayList3.size()) {
                break;
            }
            qb qbVar = (qb) arrayList3.get(i10);
            if (qbVar != null) {
                qbVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.f15813i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                x7 x7Var = arrayList.get(i11);
                if (x7Var.K) {
                    sb sbVar2 = new sb(this);
                    sbVar2.f15408a = i11;
                    sbVar2.f15409b = false;
                    sbVar2.d = x7Var.L.getAbsolutePath();
                    sbVar2.f15411e = x7Var.f15751h0;
                    sbVar2.f15412f = x7Var.X;
                    sbVar2.f15414i = x7Var.P;
                    sbVar2.f15413g = x7Var.V;
                    sbVar2.h = x7Var.W;
                    sb.a(sbVar2, false);
                    sb.b(sbVar2);
                    arrayList2.add(sbVar2);
                }
            }
        }
        q();
        this.f15821n = 0;
    }

    public void setDelegate(rb rbVar) {
        this.f15792a = rbVar;
    }

    public void setMaxCount(int i7) {
        this.f15799c0 = i7;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f15795b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: hi.xb.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f10) {
        sb sbVar = this.h;
        if (sbVar == null) {
            return;
        }
        sbVar.f15413g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        sb sbVar = this.h;
        if (sbVar == null) {
            return;
        }
        sbVar.h = f10;
        invalidate();
    }
}
