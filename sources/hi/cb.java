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
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
public final class cb extends View {
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
    public final bb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public ab N;
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
    public final ai.b Z0;
    public wa f14397a;
    public boolean f14398a0;
    public long f14399a1;
    public Runnable f14400b;
    public va f14401b0;
    public long f14402b1;
    public int f14403c;
    public int f14404c0;
    public final org.telegram.ui.Components.d6 f14405c1;
    public Runnable d;
    public final org.telegram.ui.Components.d6 f14406d0;
    public long f14407d1;
    public long f14408e;
    public final org.telegram.ui.Components.d6 f14409e0;
    public bi.c4 f14410e1;
    public long f14411f;
    public final org.telegram.ui.Components.d6 f14412f0;
    public long f14413f1;
    public final org.telegram.ui.Components.d6 f14414g0;
    public long f14415g1;
    public xa h;
    public final org.telegram.ui.Components.d6 f14416h0;
    public float f14417h1;
    public final org.telegram.ui.Components.d6 f14418i0;
    public int f14419i1;
    public final org.telegram.ui.Components.d6 f14420j0;
    public int f14421j1;
    public boolean f14422k0;
    public int f14423k1;
    public final org.telegram.ui.Components.ca f14424l0;
    public int l1;
    public final org.telegram.ui.Components.ga m0;
    public boolean f14425m1;
    public int f14426n;
    public final org.telegram.ui.Components.ga f14427n0;
    public boolean n1;
    public final org.telegram.ui.Components.ga f14428o0;
    public float f14429o1;
    public final RectF f14430p0;
    public boolean f14431p1;
    public final Path f14432q0;
    public VelocityTracker f14433q1;
    public final ArrayList f14434r;
    public final xy0 f14435r0;
    public boolean f14436r1;
    public final ArrayList f14437s;
    public final Drawable f14438s0;
    public boolean f14439s1;
    public final bb f14440t0;
    public int f14441t1;
    public final RectF f14442u0;
    public final float[] f14443u1;
    public final Paint f14444v0;
    public int f14445v1;
    public xa f14446w;
    public final Path f14447w0;
    public int f14448w1;
    public final Paint f14449x;
    public final Path f14450x0;
    public int f14451x1;
    public final Path f14452y;
    public final RectF f14453y0;
    public int f14454y1;
    public final Path f14455z0;
    public int f14456z1;

    public cb(Context context, ViewGroup viewGroup, ea eaVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar) {
        super(context);
        this.f14426n = 0;
        this.f14434r = new ArrayList();
        this.f14437s = new ArrayList();
        this.f14449x = new Paint(3);
        this.f14452y = new Path();
        this.E = new Path();
        this.f14404c0 = 1;
        nr nrVar = nr.h;
        this.f14406d0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.f14409e0 = new org.telegram.ui.Components.d6(this, 360L, nrVar);
        this.f14412f0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.f14414g0 = new org.telegram.ui.Components.d6(this, 360L, nrVar);
        this.f14416h0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.f14418i0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.f14420j0 = new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar);
        this.f14422k0 = true;
        this.f14430p0 = new RectF();
        this.f14432q0 = new Path();
        this.f14440t0 = new bb();
        this.f14442u0 = new RectF();
        this.f14444v0 = new Paint(3);
        this.f14447w0 = new Path();
        this.f14450x0 = new Path();
        this.f14453y0 = new RectF();
        this.f14455z0 = new Path();
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
        this.J0 = new bb();
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
        this.f14399a1 = -1L;
        this.f14402b1 = -1L;
        this.f14405c1 = new org.telegram.ui.Components.d6(0.0f, this, 0L, 340L, nrVar);
        this.f14407d1 = -1L;
        this.f14419i1 = -1;
        this.f14421j1 = -1;
        this.f14423k1 = -1;
        this.l1 = -1;
        this.f14429o1 = 1.0f;
        this.f14436r1 = true;
        this.f14439s1 = false;
        this.f14443u1 = new float[8];
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
        this.f14435r0 = new xy0(hd.N0(2131744213, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232782).mutate();
        this.f14438s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231188).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f14424l0 = caVar;
        this.m0 = new org.telegram.ui.Components.ga(caVar, this, 0, false);
        this.f14427n0 = new org.telegram.ui.Components.ga(caVar, this, 3, false);
        this.f14428o0 = new org.telegram.ui.Components.ga(caVar, this, 4, false);
        this.Z0 = new ai.b(this, viewGroup, h6Var, caVar, eaVar, 16);
    }

    public static void a(final cb cbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar, View view) {
        int i7;
        ArrayList arrayList = cbVar.f14437s;
        int i10 = cbVar.f14423k1;
        try {
            if (i10 == 2 && cbVar.O) {
                w6 w6Var = new w6(cbVar.getContext(), 0);
                w6Var.f15712b = 0.0f;
                w6Var.f15713c = 1.5f;
                w6Var.d(cbVar.W);
                w6Var.h = new y10(cbVar) {
                    public final cb f15586b;

                    {
                        this.f15586b = cbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cb cbVar2 = this.f15586b;
                                cbVar2.W = floatValue;
                                wa waVar = cbVar2.f14397a;
                                if (waVar != null) {
                                    waVar.F(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cb cbVar3 = this.f15586b;
                                cbVar3.M = floatValue2;
                                wa waVar2 = cbVar3.f14397a;
                                if (waVar2 != null) {
                                    waVar2.t(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                cb cbVar4 = this.f15586b;
                                cbVar4.h.f15770i = f10.floatValue();
                                wa waVar3 = cbVar4.f14397a;
                                if (waVar3 != null) {
                                    waVar3.Q0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration());
                int i11 = cbVar.f14448w1;
                int i12 = cbVar.f14456z1;
                int i13 = cbVar.f14454y1;
                float min2 = Math.min((i11 - i12) - i13, ((((org.telegram.messenger.g0.T1(cbVar.U, 1.0f, cbVar.f14414g0.f34386c) * ((float) cbVar.S)) + ((float) (cbVar.R - cbVar.f14411f))) / ((float) min)) * cbVar.f14445v1) + i12 + i13);
                a70 G = a70.G(viewGroup, h6Var, cbVar);
                G.q(w6Var);
                G.o(true);
                G.c(2131232110, hd.N0(2131744477, null), new ta(cbVar, 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(cbVar.f14448w1 - min2)) + org.telegram.messenger.g0.L(18.0f), cbVar.G0.top);
                G.a0();
                G.S(caVar, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && cbVar.F) {
                w6 w6Var2 = new w6(cbVar.getContext(), 0);
                w6Var2.f15712b = 0.0f;
                w6Var2.f15713c = 1.5f;
                w6Var2.d(cbVar.M);
                w6Var2.h = new y10(cbVar) {
                    public final cb f15586b;

                    {
                        this.f15586b = cbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cb cbVar2 = this.f15586b;
                                cbVar2.W = floatValue;
                                wa waVar = cbVar2.f14397a;
                                if (waVar != null) {
                                    waVar.F(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cb cbVar3 = this.f15586b;
                                cbVar3.M = floatValue2;
                                wa waVar2 = cbVar3.f14397a;
                                if (waVar2 != null) {
                                    waVar2.t(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                cb cbVar4 = this.f15586b;
                                cbVar4.h.f15770i = f10.floatValue();
                                wa waVar3 = cbVar4.f14397a;
                                if (waVar3 != null) {
                                    waVar3.Q0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration());
                int i14 = cbVar.f14448w1;
                int i15 = cbVar.f14456z1;
                int i16 = cbVar.f14454y1;
                float min4 = Math.min((i14 - i15) - i16, ((((org.telegram.messenger.g0.T1(cbVar.L, 1.0f, cbVar.f14409e0.f34386c) * ((float) cbVar.I)) + ((float) (cbVar.J - cbVar.f14411f))) / ((float) min3)) * cbVar.f14445v1) + i15 + i16);
                a70 G2 = a70.G(viewGroup, h6Var, cbVar);
                G2.q(w6Var2);
                G2.o(true);
                G2.c(2131232110, hd.N0(2131744244, null), new ta(cbVar, 2), false);
                G2.W(5);
                G2.X = true;
                G2.b0((-(cbVar.f14448w1 - min4)) + org.telegram.messenger.g0.L(18.0f), cbVar.f14453y0.top);
                G2.a0();
                G2.S(caVar, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && cbVar.h != null) {
                w6 w6Var3 = new w6(cbVar.getContext(), 0);
                w6Var3.f15712b = 0.0f;
                w6Var3.f15713c = 1.5f;
                w6Var3.d(cbVar.h.f15770i);
                w6Var3.h = new y10(cbVar) {
                    public final cb f15586b;

                    {
                        this.f15586b = cbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cb cbVar2 = this.f15586b;
                                cbVar2.W = floatValue;
                                wa waVar = cbVar2.f14397a;
                                if (waVar != null) {
                                    waVar.F(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cb cbVar3 = this.f15586b;
                                cbVar3.M = floatValue2;
                                wa waVar2 = cbVar3.f14397a;
                                if (waVar2 != null) {
                                    waVar2.t(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                cb cbVar4 = this.f15586b;
                                cbVar4.h.f15770i = f10.floatValue();
                                wa waVar3 = cbVar4.f14397a;
                                if (waVar3 != null) {
                                    waVar3.Q0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                a70 G3 = a70.G(viewGroup, h6Var, cbVar);
                G3.q(w6Var3);
                G3.W(5);
                G3.X = true;
                G3.b0(org.telegram.messenger.g0.L(18.0f), cbVar.f14442u0.top);
                G3.a0();
                G3.S(caVar, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
            } else if (i10 == 3 && (i7 = cbVar.l1) >= 0 && i7 < arrayList.size()) {
                xa xaVar = (xa) arrayList.get(cbVar.l1);
                w6 w6Var4 = new w6(cbVar.getContext(), 0);
                w6Var4.f15712b = 0.0f;
                w6Var4.f15713c = 1.5f;
                w6Var4.d(xaVar.f15770i);
                w6Var4.h = new ai.y1(22, cbVar, xaVar);
                a70 G4 = a70.G(viewGroup, h6Var, cbVar);
                G4.q(w6Var4);
                G4.W(5);
                G4.X = true;
                G4.b0(org.telegram.messenger.g0.L(18.0f), xaVar.f15771j.top);
                G4.a0();
                G4.S(caVar, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.g0.W1(this.f14414g0.d(this.Q), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public long getBaseDuration() {
        xa xaVar = this.h;
        if (xaVar != null) {
            return Math.max(1L, xaVar.f15767e);
        }
        xa xaVar2 = this.f14446w;
        if (xaVar2 != null) {
            return Math.max(1L, xaVar2.f15767e);
        }
        if (this.F) {
            return Math.max(1L, this.I);
        }
        return Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f14437s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (f10 > 0.0f) {
                f10 += org.telegram.messenger.g0.L(4.0f);
            }
            f10 += org.telegram.messenger.g0.W1(((xa) arrayList.get(i7)).f15772k.f34386c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.F) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(this.f14409e0.d(this.H), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    private float getVideoHeight() {
        xa xaVar = this.h;
        if (xaVar == null) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(xaVar.f15772k.f34386c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: hi.cb.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        ll0 ll0Var = this.X0;
        if (ll0Var.b()) {
            int i7 = ll0Var.f37225j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f14436r1) {
                this.f14411f = Math.max(0.0f, (((i7 - this.f14456z1) - this.f14454y1) / this.f14445v1) * ((float) min));
            } else if (!this.Q) {
                ll0Var.a();
                return;
            } else {
                int i10 = this.f14456z1;
                int i11 = this.f14454y1;
                float f10 = this.f14445v1;
                float f11 = (float) min;
                h(((((i7 - i10) - i11) / f10) * f11) - ((((this.f14441t1 - i10) - i11) / f10) * f11));
            }
            invalidate();
            this.f14441t1 = i7;
        } else if (this.f14439s1) {
            this.f14439s1 = false;
            wa waVar = this.f14397a;
            if (waVar != null) {
                waVar.D0(false);
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
        xa xaVar = this.f14446w;
        if (xaVar != null) {
            f13 = (xaVar.f15769g * ((float) xaVar.f15767e)) + ((float) xaVar.f15768f);
        } else {
            if (this.h == null) {
                j10 = this.R;
            } else {
                j10 = 0;
            }
            f13 = (float) j10;
        }
        float f14 = (this.f14445v1 * (((k10 + f13) - ((float) this.f14411f)) / ((float) min))) + this.f14456z1 + this.f14454y1;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.cb.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f14448w1, this.f14451x1, 255, 31);
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
        return this.f14404c0 * 59000;
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
        if (this.f14437s.isEmpty()) {
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
        return this.f14404c0;
    }

    public long getMaxScrollDuration() {
        if (this.f14437s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return org.telegram.messenger.g0.W1(this.f14420j0.f34386c, org.telegram.messenger.g0.L(28.0f) + this.A1 + this.A1, getContentHeight());
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
        wa waVar;
        long j16;
        long k10;
        xa xaVar = this.h;
        if (xaVar == null && !this.F) {
            long j17 = this.R;
            long k11 = Utilities.k(j17 + f10, 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k11;
            float f14 = (float) (k11 - j17);
            this.T = Utilities.i(this.T - (f14 / ((float) this.S)), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f14 / ((float) this.S)), 1.0f, 0.0f);
            wa waVar2 = this.f14397a;
            if (waVar2 != null) {
                waVar2.w1(this.T);
                this.f14397a.q1(this.U);
            }
        } else if (this.Q) {
            if (xaVar != null) {
                f11 = xaVar.f15769g;
                j3 = xaVar.f15767e;
            } else {
                f11 = this.K;
                j3 = this.I;
            }
            float f15 = f11 * ((float) j3);
            if (xaVar != null) {
                f12 = xaVar.h;
                j10 = xaVar.f15767e;
            } else {
                f12 = this.L;
                j10 = this.I;
            }
            float f16 = f12 * ((float) j10);
            if (xaVar != null) {
                f13 = (xaVar.h - xaVar.f15769g) * ((float) xaVar.f15767e);
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
                wa waVar3 = this.f14397a;
                if (waVar3 != null) {
                    waVar3.w1(this.T);
                    this.f14397a.q1(this.U);
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
                wa waVar4 = this.f14397a;
                if (waVar4 != null) {
                    waVar4.w1(this.T);
                    this.f14397a.q1(this.U);
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
        wa waVar5 = this.f14397a;
        if (waVar5 != null) {
            waVar5.m2(this.R + (this.T * ((float) this.S)));
        }
        boolean z10 = this.n1;
        if (!z10 && (waVar = this.f14397a) != null) {
            waVar.D0(true);
            xa xaVar2 = this.h;
            if (xaVar2 != null) {
                long j27 = this.R + (this.T * ((float) this.S));
                float f24 = xaVar2.h;
                float f25 = (float) xaVar2.f15767e;
                k10 = Utilities.k(j27, f24 * f25, xaVar2.f15769g * f25);
            } else if (this.F) {
                long j28 = this.R + (this.T * ((float) this.S));
                float f26 = this.L;
                float f27 = (float) this.I;
                k10 = Utilities.k(j28, f26 * f27, this.K * f27);
            } else {
                float f28 = this.T;
                k10 = Utilities.k(f28 * ((float) j16), this.S, 0L);
            }
            if (this.h != null && Math.abs(this.f14408e - k10) > 400) {
                this.f14407d1 = this.f14408e;
                this.f14405c1.e(true, 1.0f);
            }
            wa waVar6 = this.f14397a;
            this.f14408e = k10;
            waVar6.M(k10, false);
        } else if (z10 || this.f14439s1) {
            xa xaVar3 = this.h;
            if (xaVar3 != null) {
                long j29 = this.R + (this.T * ((float) this.S));
                float f29 = xaVar3.h;
                float f30 = (float) xaVar3.f15767e;
                this.f14408e = Utilities.k(j29, f29 * f30, xaVar3.f15769g * f30);
            } else if (this.F && xaVar3 != null) {
                long j30 = this.R + (this.T * ((float) this.S));
                float f31 = this.L;
                float f32 = (float) xaVar3.f15767e;
                this.f14408e = Utilities.k(j30, f31 * f32, this.K * f32);
            } else {
                float f33 = this.T;
                this.f14408e = Utilities.k(f33 * ((float) j15), this.S, 0L);
            }
            wa waVar7 = this.f14397a;
            if (waVar7 != null) {
                waVar7.M(this.f14408e, false);
            }
        }
    }

    public final void i(xa xaVar, float f10) {
        long j3;
        wa waVar;
        long j10;
        long k10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (xaVar != null) {
            xa xaVar2 = this.f14446w;
            if (xaVar2 != xaVar && xaVar2 != null) {
                if (this.f14426n == this.f14437s.indexOf(xaVar)) {
                    xa xaVar3 = this.f14446w;
                    float f11 = (float) xaVar3.f15767e;
                    float f12 = xaVar.h;
                    float f13 = (float) xaVar.f15767e;
                    float f14 = xaVar.f15769g;
                    long j15 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((xaVar3.h - xaVar3.f15769g) * f11) / f13);
                    long j16 = xaVar.f15768f;
                    long j17 = f10;
                    long j18 = j16 + j17;
                    if (j18 > (f11 * 1.0f) - (f12 * f13)) {
                        xa xaVar4 = this.f14446w;
                        float i7 = Utilities.i((((xaVar4.h * ((float) xaVar4.f15767e)) - ((float) j16)) - ((float) j17)) / ((float) xaVar.f15767e), 1.0f, min);
                        xaVar.h = i7;
                        float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                        xaVar.f15769g = i10;
                        xa xaVar5 = this.f14446w;
                        float f15 = xaVar5.h;
                        float f16 = (float) xaVar5.f15767e;
                        float f17 = xaVar.h;
                        float f18 = (float) xaVar.f15767e;
                        long j19 = (f15 * f16) - (f17 * f18);
                        long j20 = (xaVar5.f15769g * f16) - (i10 * f18);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        xaVar.f15768f = Utilities.k(xaVar.f15768f + j17, j14, j13);
                        wa waVar2 = this.f14397a;
                        if (waVar2 != null) {
                            waVar2.n1(xaVar.f15769g, xaVar.f15764a);
                            this.f14397a.G1(xaVar.h, xaVar.f15764a);
                        }
                    } else if (j18 < j15) {
                        xa xaVar6 = this.f14446w;
                        float i11 = Utilities.i((((xaVar6.f15769g * ((float) xaVar6.f15767e)) - ((float) j16)) - ((float) j17)) / ((float) xaVar.f15767e), 1.0f - min, 0.0f);
                        xaVar.f15769g = i11;
                        float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                        xaVar.h = i12;
                        xa xaVar7 = this.f14446w;
                        float f19 = xaVar7.h;
                        float f20 = (float) xaVar7.f15767e;
                        float f21 = (float) xaVar.f15767e;
                        long j21 = (f19 * f20) - (i12 * f21);
                        long j22 = (xaVar7.f15769g * f20) - (xaVar.f15769g * f21);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        xaVar.f15768f = Utilities.k(xaVar.f15768f + j17, j12, j11);
                        wa waVar3 = this.f14397a;
                        if (waVar3 != null) {
                            waVar3.n1(xaVar.f15769g, xaVar.f15764a);
                            this.f14397a.G1(xaVar.h, xaVar.f15764a);
                        }
                    } else {
                        xaVar.f15768f = j18;
                    }
                } else {
                    long j23 = xaVar.f15768f + f10;
                    float f22 = (float) xaVar.f15767e;
                    xaVar.f15768f = Utilities.k(j23, ((float) getBaseDuration()) - (xaVar.h * f22), (-xaVar.f15769g) * f22);
                }
            }
            invalidate();
            wa waVar4 = this.f14397a;
            if (waVar4 != null) {
                waVar4.i2(xaVar.f15764a, xaVar.f15768f);
            }
            boolean z10 = this.n1;
            if (!z10 && (waVar = this.f14397a) != null) {
                waVar.D0(true);
                xa xaVar8 = this.f14446w;
                if (xaVar8 != xaVar && xaVar8 != null) {
                    long j24 = xaVar.f15768f + (xaVar.f15769g * ((float) xaVar.f15767e));
                    float f23 = xaVar8.h;
                    float f24 = (float) xaVar8.f15767e;
                    k10 = Utilities.k(j24, f23 * f24, xaVar8.f15769g * f24);
                } else {
                    float f25 = xaVar.f15769g;
                    k10 = Utilities.k(f25 * ((float) j10), xaVar.f15767e, 0L);
                }
                xa xaVar9 = this.f14446w;
                if (xaVar9 != xaVar && xaVar9 != null && Math.abs(this.f14408e - k10) > 400) {
                    this.f14407d1 = this.f14408e;
                    this.f14405c1.e(true, 1.0f);
                }
                wa waVar5 = this.f14397a;
                this.f14408e = k10;
                waVar5.M(k10, false);
            } else if (z10 || this.f14439s1) {
                xa xaVar10 = this.f14446w;
                if (xaVar10 != xaVar && xaVar10 != null) {
                    long j25 = xaVar.f15768f + (xaVar.f15769g * ((float) xaVar.f15767e));
                    float f26 = xaVar10.h;
                    float f27 = (float) xaVar10.f15767e;
                    this.f14408e = Utilities.k(j25, f26 * f27, xaVar10.f15769g * f27);
                } else {
                    float f28 = xaVar.f15769g;
                    this.f14408e = Utilities.k(f28 * ((float) j3), xaVar.f15767e, 0L);
                }
                wa waVar6 = this.f14397a;
                if (waVar6 != null) {
                    waVar6.M(this.f14408e, false);
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
        wa waVar;
        long j14;
        long k10;
        xa xaVar = this.h;
        if (xaVar == null) {
            long j15 = this.J;
            long k11 = Utilities.k(j15 + f10, 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k11;
            float f11 = (float) (k11 - j15);
            this.K = Utilities.i(this.K - (f11 / ((float) this.I)), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f11 / ((float) this.I)), 1.0f, 0.0f);
            wa waVar2 = this.f14397a;
            if (waVar2 != null) {
                waVar2.s0(this.K);
                this.f14397a.b2(this.L);
            }
        } else if (this.H) {
            float f12 = xaVar.h;
            float f13 = (float) xaVar.f15767e;
            float f14 = this.L;
            float f15 = (float) this.I;
            long j16 = (f12 * f13) - (f14 * f15);
            float f16 = xaVar.f15769g;
            float f17 = this.K;
            long j17 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j18 = this.J;
            long j19 = f10;
            long j20 = j18 + j19;
            if (j20 > j16) {
                xa xaVar2 = this.h;
                float i7 = Utilities.i((((xaVar2.h * ((float) xaVar2.f15767e)) - ((float) j18)) - ((float) j19)) / ((float) this.I), 1.0f, min);
                this.L = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.K = i10;
                xa xaVar3 = this.h;
                float f18 = xaVar3.h;
                float f19 = (float) xaVar3.f15767e;
                float f20 = this.L;
                float f21 = (float) this.I;
                long j21 = (f18 * f19) - (f20 * f21);
                long j22 = (xaVar3.f15769g * f19) - (i10 * f21);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.J = Utilities.k(this.J + j19, j12, j11);
                wa waVar3 = this.f14397a;
                if (waVar3 != null) {
                    waVar3.s0(this.K);
                    this.f14397a.b2(this.L);
                }
            } else if (j20 < j17) {
                xa xaVar4 = this.h;
                float i11 = Utilities.i((((xaVar4.f15769g * ((float) xaVar4.f15767e)) - ((float) j18)) - ((float) j19)) / ((float) this.I), 1.0f - min, 0.0f);
                this.K = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.L = i12;
                xa xaVar5 = this.h;
                float f22 = xaVar5.h;
                float f23 = (float) xaVar5.f15767e;
                float f24 = (float) this.I;
                long j23 = (f22 * f23) - (i12 * f24);
                long j24 = (xaVar5.f15769g * f23) - (this.K * f24);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.J = Utilities.k(this.J + j19, j10, j3);
                wa waVar4 = this.f14397a;
                if (waVar4 != null) {
                    waVar4.s0(this.K);
                    this.f14397a.b2(this.L);
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
        wa waVar5 = this.f14397a;
        if (waVar5 != null) {
            waVar5.e1(this.J + (this.K * ((float) this.I)));
        }
        boolean z10 = this.n1;
        if (!z10 && (waVar = this.f14397a) != null) {
            waVar.D0(true);
            xa xaVar6 = this.h;
            if (xaVar6 != null) {
                long j26 = this.J + (this.K * ((float) this.I));
                float f26 = xaVar6.h;
                float f27 = (float) xaVar6.f15767e;
                k10 = Utilities.k(j26, f26 * f27, xaVar6.f15769g * f27);
            } else {
                float f28 = this.K;
                k10 = Utilities.k(f28 * ((float) j14), this.I, 0L);
            }
            if (this.h != null && Math.abs(this.f14408e - k10) > 400) {
                this.f14407d1 = this.f14408e;
                this.f14405c1.e(true, 1.0f);
            }
            wa waVar6 = this.f14397a;
            this.f14408e = k10;
            waVar6.M(k10, false);
        } else if (z10 || this.f14439s1) {
            xa xaVar7 = this.h;
            if (xaVar7 != null) {
                long j27 = this.J + (this.K * ((float) this.I));
                float f29 = xaVar7.h;
                float f30 = (float) xaVar7.f15767e;
                this.f14408e = Utilities.k(j27, f29 * f30, xaVar7.f15769g * f30);
            } else {
                float f31 = this.K;
                this.f14408e = Utilities.k(f31 * ((float) j13), this.I, 0L);
            }
            wa waVar7 = this.f14397a;
            if (waVar7 != null) {
                waVar7.M(this.f14408e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        xa xaVar = this.h;
        long j3 = xaVar.f15767e;
        this.f14411f = Utilities.k((((xaVar.h + xaVar.f15769g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
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
        xa xaVar;
        xa xaVar2 = this.h;
        ArrayList arrayList = this.f14437s;
        if (xaVar2 != null || this.O || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f14456z1) - this.f14454y1) / this.f14445v1;
            xa xaVar3 = this.f14446w;
            if (xaVar3 != null) {
                j3 = (xaVar3.f15769g * ((float) xaVar3.f15767e)) + ((float) xaVar3.f15768f);
            } else {
                j3 = 0;
            }
            float f12 = f11 * ((float) min);
            if (xaVar3 == null) {
                if (this.h == null) {
                    j3 = this.R;
                } else {
                    j3 = 0;
                }
            }
            long i7 = Utilities.i((f12 - ((float) j3)) + ((float) this.f14411f), (float) getBaseDuration(), 0.0f);
            xa xaVar4 = this.h;
            if (xaVar4 != null) {
                float f13 = ((float) i7) / ((float) xaVar4.f15767e);
                if (f13 < xaVar4.f15769g || f13 > xaVar4.h) {
                    return false;
                }
            }
            if (this.f14446w == null || (i7 >= 0 && i7 < (xaVar.h - xaVar.f15769g) * ((float) xaVar.f15767e))) {
                if (this.O && xaVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) i7) / ((float) this.S);
                    if (f14 < this.T || f14 > this.U) {
                        return false;
                    }
                }
                this.f14408e = i7;
                invalidate();
                wa waVar = this.f14397a;
                if (waVar != null) {
                    waVar.M(i7, z10);
                }
                bi.c4 c4Var = this.f14410e1;
                if (c4Var != null) {
                    org.telegram.messenger.g0.r(c4Var);
                    this.f14410e1 = null;
                }
                if (z10) {
                    bi.c4 c4Var2 = new bi.c4(this, i7, 10);
                    this.f14410e1 = c4Var2;
                    org.telegram.messenger.g0.h3(c4Var2, 150L);
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
        xa xaVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        ab abVar = this.N;
        Long l10 = null;
        if (abVar != null) {
            abVar.b();
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
            if (getMeasuredWidth() <= 0 || this.N != null || ((xaVar = this.h) != null && xaVar.f15767e < 1)) {
                z11 = false;
                j11 = j12;
                z12 = true;
            } else {
                String str2 = this.G;
                int i7 = this.f14448w1;
                int i10 = this.f14456z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j13 = this.I;
                if (j13 > 2) {
                    l10 = Long.valueOf(j13);
                }
                xa xaVar2 = this.h;
                if (xaVar2 != null) {
                    maxScrollDuration = xaVar2.f15767e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z11 = false;
                z12 = true;
                this.N = new ab(this, false, str2, i11, L, l10, maxScrollDuration, -1L, -1L, new ta(this, 0));
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
        if (j11 != j3 && this.h == null && this.f14401b0 != null) {
            this.f14398a0 = z12;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(((float) j3) / ((float) this.S), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f14409e0.f(this.H, z12);
            this.f14414g0.f(this.Q, z12);
            this.f14406d0.f(this.F, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f10) {
        String str2;
        xa xaVar = this.h;
        if (xaVar == null) {
            str2 = null;
        } else {
            str2 = xaVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        xa xaVar2 = this.h;
        if (xaVar2 != null) {
            ab abVar = xaVar2.f15766c;
            if (abVar != null) {
                abVar.b();
                this.h.f15766c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f14411f = 0L;
            xa xaVar3 = new xa(this);
            this.h = xaVar3;
            xaVar3.f15765b = z10;
            xaVar3.d = str;
            xaVar3.f15767e = j3;
            xaVar3.f15770i = f10;
            xa.a(xaVar3, false);
        } else {
            this.h = null;
            this.f14411f = 0L;
        }
        if (!this.F) {
            this.H = false;
        }
        this.f14408e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.M0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.Q0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        this.f14456z1 = L;
        int L2 = org.telegram.messenger.g0.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        int size = View.MeasureSpec.getSize(i7);
        this.f14448w1 = size;
        int L3 = org.telegram.messenger.g0.L(388);
        this.f14451x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        this.f14454y1 = L4;
        this.f14445v1 = (this.f14448w1 - (L4 * 2)) - (this.f14456z1 * 2);
        xa xaVar = this.h;
        if (xaVar != null && xaVar.d != null && xaVar.f15766c == null) {
            xa.a(xaVar, false);
        }
        ArrayList arrayList = this.f14437s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                xa xaVar2 = (xa) obj;
                if (xaVar2.d != null && xaVar2.f15766c == null) {
                    xa.a(xaVar2, false);
                    xa.b(xaVar2);
                }
            }
        }
        if (this.P != null && this.f14401b0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: hi.cb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f14401b0 == null || this.f14398a0) {
                this.f14401b0 = new va(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.f14416h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        xa xaVar;
        a3.c cVar = new a3.c(29);
        ArrayList arrayList = this.f14437s;
        Collections.sort(arrayList, cVar);
        if (arrayList.isEmpty()) {
            xaVar = null;
        } else {
            xaVar = (xa) arrayList.get(0);
        }
        this.f14446w = xaVar;
        if (xaVar != null) {
            long j3 = xaVar.f15768f;
        }
    }

    public void setCollage(ArrayList<c7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ab abVar;
        int i7 = 0;
        while (true) {
            arrayList2 = this.f14437s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            xa xaVar = (xa) arrayList2.get(i7);
            if (xaVar != null && (abVar = xaVar.f15766c) != null) {
                abVar.b();
            }
            i7++;
        }
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            arrayList3 = this.f14434r;
            if (i10 >= arrayList3.size()) {
                break;
            }
            va vaVar = (va) arrayList3.get(i10);
            if (vaVar != null) {
                vaVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.f14418i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                c7 c7Var = arrayList.get(i11);
                if (c7Var.K) {
                    xa xaVar2 = new xa(this);
                    xaVar2.f15764a = i11;
                    xaVar2.f15765b = false;
                    xaVar2.d = c7Var.L.getAbsolutePath();
                    xaVar2.f15767e = c7Var.f14356h0;
                    xaVar2.f15768f = c7Var.X;
                    xaVar2.f15770i = c7Var.P;
                    xaVar2.f15769g = c7Var.V;
                    xaVar2.h = c7Var.W;
                    xa.a(xaVar2, false);
                    xa.b(xaVar2);
                    arrayList2.add(xaVar2);
                }
            }
        }
        q();
        this.f14426n = 0;
    }

    public void setDelegate(wa waVar) {
        this.f14397a = waVar;
    }

    public void setMaxCount(int i7) {
        this.f14404c0 = i7;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f14400b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: hi.cb.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f10) {
        xa xaVar = this.h;
        if (xaVar == null) {
            return;
        }
        xaVar.f15769g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        xa xaVar = this.h;
        if (xaVar == null) {
            return;
        }
        xaVar.h = f10;
        invalidate();
    }
}
