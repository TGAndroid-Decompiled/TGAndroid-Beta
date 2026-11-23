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
public final class db extends View {
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
    public final cb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public bb N;
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
    public xa f14421a;
    public boolean f14422a0;
    public long f14423a1;
    public Runnable f14424b;
    public wa f14425b0;
    public long f14426b1;
    public int f14427c;
    public int f14428c0;
    public final org.telegram.ui.Components.d6 f14429c1;
    public Runnable d;
    public final org.telegram.ui.Components.d6 f14430d0;
    public long f14431d1;
    public long f14432e;
    public final org.telegram.ui.Components.d6 f14433e0;
    public bi.e4 f14434e1;
    public long f14435f;
    public final org.telegram.ui.Components.d6 f14436f0;
    public long f14437f1;
    public final org.telegram.ui.Components.d6 f14438g0;
    public long f14439g1;
    public ya h;
    public final org.telegram.ui.Components.d6 f14440h0;
    public float f14441h1;
    public final org.telegram.ui.Components.d6 f14442i0;
    public int f14443i1;
    public final org.telegram.ui.Components.d6 f14444j0;
    public int f14445j1;
    public boolean f14446k0;
    public int f14447k1;
    public final org.telegram.ui.Components.ca f14448l0;
    public int l1;
    public final org.telegram.ui.Components.ga m0;
    public boolean f14449m1;
    public int f14450n;
    public final org.telegram.ui.Components.ga f14451n0;
    public boolean n1;
    public final org.telegram.ui.Components.ga f14452o0;
    public float f14453o1;
    public final RectF f14454p0;
    public boolean f14455p1;
    public final Path f14456q0;
    public VelocityTracker f14457q1;
    public final ArrayList f14458r;
    public final xy0 f14459r0;
    public boolean f14460r1;
    public final ArrayList f14461s;
    public final Drawable f14462s0;
    public boolean f14463s1;
    public final cb f14464t0;
    public int f14465t1;
    public final RectF f14466u0;
    public final float[] f14467u1;
    public final Paint f14468v0;
    public int f14469v1;
    public ya f14470w;
    public final Path f14471w0;
    public int f14472w1;
    public final Paint f14473x;
    public final Path f14474x0;
    public int f14475x1;
    public final Path f14476y;
    public final RectF f14477y0;
    public int f14478y1;
    public final Path f14479z0;
    public int f14480z1;

    public db(Context context, ViewGroup viewGroup, fa faVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar) {
        super(context);
        this.f14450n = 0;
        this.f14458r = new ArrayList();
        this.f14461s = new ArrayList();
        this.f14473x = new Paint(3);
        this.f14476y = new Path();
        this.E = new Path();
        this.f14428c0 = 1;
        nr nrVar = nr.h;
        this.f14430d0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.f14433e0 = new org.telegram.ui.Components.d6(this, 360L, nrVar);
        this.f14436f0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.f14438g0 = new org.telegram.ui.Components.d6(this, 360L, nrVar);
        this.f14440h0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.f14442i0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.f14444j0 = new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar);
        this.f14446k0 = true;
        this.f14454p0 = new RectF();
        this.f14456q0 = new Path();
        this.f14464t0 = new cb();
        this.f14466u0 = new RectF();
        this.f14468v0 = new Paint(3);
        this.f14471w0 = new Path();
        this.f14474x0 = new Path();
        this.f14477y0 = new RectF();
        this.f14479z0 = new Path();
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
        this.J0 = new cb();
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
        this.f14423a1 = -1L;
        this.f14426b1 = -1L;
        this.f14429c1 = new org.telegram.ui.Components.d6(0.0f, this, 0L, 340L, nrVar);
        this.f14431d1 = -1L;
        this.f14443i1 = -1;
        this.f14445j1 = -1;
        this.f14447k1 = -1;
        this.l1 = -1;
        this.f14453o1 = 1.0f;
        this.f14460r1 = true;
        this.f14463s1 = false;
        this.f14467u1 = new float[8];
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
        this.f14459r0 = new xy0(hd.N0(2131744215, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232782).mutate();
        this.f14462s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231188).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f14448l0 = caVar;
        this.m0 = new org.telegram.ui.Components.ga(caVar, this, 0, false);
        this.f14451n0 = new org.telegram.ui.Components.ga(caVar, this, 3, false);
        this.f14452o0 = new org.telegram.ui.Components.ga(caVar, this, 4, false);
        this.Z0 = new bi.s1(this, viewGroup, h6Var, caVar, faVar, 15);
    }

    public static void a(final db dbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar, View view) {
        int i7;
        ArrayList arrayList = dbVar.f14461s;
        int i10 = dbVar.f14447k1;
        try {
            if (i10 == 2 && dbVar.O) {
                x6 x6Var = new x6(dbVar.getContext(), 0);
                x6Var.f15684b = 0.0f;
                x6Var.f15685c = 1.5f;
                x6Var.d(dbVar.W);
                x6Var.h = new y10(dbVar) {
                    public final db f15571b;

                    {
                        this.f15571b = dbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                db dbVar2 = this.f15571b;
                                dbVar2.W = floatValue;
                                xa xaVar = dbVar2.f14421a;
                                if (xaVar != null) {
                                    xaVar.F(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                db dbVar3 = this.f15571b;
                                dbVar3.M = floatValue2;
                                xa xaVar2 = dbVar3.f14421a;
                                if (xaVar2 != null) {
                                    xaVar2.t(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                db dbVar4 = this.f15571b;
                                dbVar4.h.f15743i = f10.floatValue();
                                xa xaVar3 = dbVar4.f14421a;
                                if (xaVar3 != null) {
                                    xaVar3.Q0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(dbVar.getBaseDuration(), dbVar.getMaxScrollDuration());
                int i11 = dbVar.f14472w1;
                int i12 = dbVar.f14480z1;
                int i13 = dbVar.f14478y1;
                float min2 = Math.min((i11 - i12) - i13, ((((org.telegram.messenger.g0.T1(dbVar.U, 1.0f, dbVar.f14438g0.f34349c) * ((float) dbVar.S)) + ((float) (dbVar.R - dbVar.f14435f))) / ((float) min)) * dbVar.f14469v1) + i12 + i13);
                a70 G = a70.G(viewGroup, h6Var, dbVar);
                G.q(x6Var);
                G.o(true);
                G.c(2131232110, hd.N0(2131744479, null), new ua(dbVar, 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(dbVar.f14472w1 - min2)) + org.telegram.messenger.g0.L(18.0f), dbVar.G0.top);
                G.a0();
                G.S(caVar, -view.getX(), -view.getY());
                dbVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && dbVar.F) {
                x6 x6Var2 = new x6(dbVar.getContext(), 0);
                x6Var2.f15684b = 0.0f;
                x6Var2.f15685c = 1.5f;
                x6Var2.d(dbVar.M);
                x6Var2.h = new y10(dbVar) {
                    public final db f15571b;

                    {
                        this.f15571b = dbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                db dbVar2 = this.f15571b;
                                dbVar2.W = floatValue;
                                xa xaVar = dbVar2.f14421a;
                                if (xaVar != null) {
                                    xaVar.F(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                db dbVar3 = this.f15571b;
                                dbVar3.M = floatValue2;
                                xa xaVar2 = dbVar3.f14421a;
                                if (xaVar2 != null) {
                                    xaVar2.t(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                db dbVar4 = this.f15571b;
                                dbVar4.h.f15743i = f10.floatValue();
                                xa xaVar3 = dbVar4.f14421a;
                                if (xaVar3 != null) {
                                    xaVar3.Q0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(dbVar.getBaseDuration(), dbVar.getMaxScrollDuration());
                int i14 = dbVar.f14472w1;
                int i15 = dbVar.f14480z1;
                int i16 = dbVar.f14478y1;
                float min4 = Math.min((i14 - i15) - i16, ((((org.telegram.messenger.g0.T1(dbVar.L, 1.0f, dbVar.f14433e0.f34349c) * ((float) dbVar.I)) + ((float) (dbVar.J - dbVar.f14435f))) / ((float) min3)) * dbVar.f14469v1) + i15 + i16);
                a70 G2 = a70.G(viewGroup, h6Var, dbVar);
                G2.q(x6Var2);
                G2.o(true);
                G2.c(2131232110, hd.N0(2131744246, null), new ua(dbVar, 2), false);
                G2.W(5);
                G2.X = true;
                G2.b0((-(dbVar.f14472w1 - min4)) + org.telegram.messenger.g0.L(18.0f), dbVar.f14477y0.top);
                G2.a0();
                G2.S(caVar, -view.getX(), -view.getY());
                dbVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && dbVar.h != null) {
                x6 x6Var3 = new x6(dbVar.getContext(), 0);
                x6Var3.f15684b = 0.0f;
                x6Var3.f15685c = 1.5f;
                x6Var3.d(dbVar.h.f15743i);
                x6Var3.h = new y10(dbVar) {
                    public final db f15571b;

                    {
                        this.f15571b = dbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                db dbVar2 = this.f15571b;
                                dbVar2.W = floatValue;
                                xa xaVar = dbVar2.f14421a;
                                if (xaVar != null) {
                                    xaVar.F(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                db dbVar3 = this.f15571b;
                                dbVar3.M = floatValue2;
                                xa xaVar2 = dbVar3.f14421a;
                                if (xaVar2 != null) {
                                    xaVar2.t(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                db dbVar4 = this.f15571b;
                                dbVar4.h.f15743i = f10.floatValue();
                                xa xaVar3 = dbVar4.f14421a;
                                if (xaVar3 != null) {
                                    xaVar3.Q0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                a70 G3 = a70.G(viewGroup, h6Var, dbVar);
                G3.q(x6Var3);
                G3.W(5);
                G3.X = true;
                G3.b0(org.telegram.messenger.g0.L(18.0f), dbVar.f14466u0.top);
                G3.a0();
                G3.S(caVar, -view.getX(), -view.getY());
                dbVar.performHapticFeedback(0, 1);
            } else if (i10 == 3 && (i7 = dbVar.l1) >= 0 && i7 < arrayList.size()) {
                ya yaVar = (ya) arrayList.get(dbVar.l1);
                x6 x6Var4 = new x6(dbVar.getContext(), 0);
                x6Var4.f15684b = 0.0f;
                x6Var4.f15685c = 1.5f;
                x6Var4.d(yaVar.f15743i);
                x6Var4.h = new ai.r1(22, dbVar, yaVar);
                a70 G4 = a70.G(viewGroup, h6Var, dbVar);
                G4.q(x6Var4);
                G4.W(5);
                G4.X = true;
                G4.b0(org.telegram.messenger.g0.L(18.0f), yaVar.f15744j.top);
                G4.a0();
                G4.S(caVar, -view.getX(), -view.getY());
                dbVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.g0.W1(this.f14438g0.d(this.Q), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public long getBaseDuration() {
        ya yaVar = this.h;
        if (yaVar != null) {
            return Math.max(1L, yaVar.f15740e);
        }
        ya yaVar2 = this.f14470w;
        if (yaVar2 != null) {
            return Math.max(1L, yaVar2.f15740e);
        }
        if (this.F) {
            return Math.max(1L, this.I);
        }
        return Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f14461s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (f10 > 0.0f) {
                f10 += org.telegram.messenger.g0.L(4.0f);
            }
            f10 += org.telegram.messenger.g0.W1(((ya) arrayList.get(i7)).f15745k.f34349c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.F) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(this.f14433e0.d(this.H), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    private float getVideoHeight() {
        ya yaVar = this.h;
        if (yaVar == null) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(yaVar.f15745k.f34349c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: hi.db.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        ll0 ll0Var = this.X0;
        if (ll0Var.b()) {
            int i7 = ll0Var.f37181j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f14460r1) {
                this.f14435f = Math.max(0.0f, (((i7 - this.f14480z1) - this.f14478y1) / this.f14469v1) * ((float) min));
            } else if (!this.Q) {
                ll0Var.a();
                return;
            } else {
                int i10 = this.f14480z1;
                int i11 = this.f14478y1;
                float f10 = this.f14469v1;
                float f11 = (float) min;
                h(((((i7 - i10) - i11) / f10) * f11) - ((((this.f14465t1 - i10) - i11) / f10) * f11));
            }
            invalidate();
            this.f14465t1 = i7;
        } else if (this.f14463s1) {
            this.f14463s1 = false;
            xa xaVar = this.f14421a;
            if (xaVar != null) {
                xaVar.D0(false);
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
        ya yaVar = this.f14470w;
        if (yaVar != null) {
            f13 = (yaVar.f15742g * ((float) yaVar.f15740e)) + ((float) yaVar.f15741f);
        } else {
            if (this.h == null) {
                j10 = this.R;
            } else {
                j10 = 0;
            }
            f13 = (float) j10;
        }
        float f14 = (this.f14469v1 * (((k10 + f13) - ((float) this.f14435f)) / ((float) min))) + this.f14480z1 + this.f14478y1;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.db.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f14472w1, this.f14475x1, 255, 31);
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
        return this.f14428c0 * 59000;
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
        if (this.f14461s.isEmpty()) {
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
        return this.f14428c0;
    }

    public long getMaxScrollDuration() {
        if (this.f14461s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return org.telegram.messenger.g0.W1(this.f14444j0.f34349c, org.telegram.messenger.g0.L(28.0f) + this.A1 + this.A1, getContentHeight());
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
        xa xaVar;
        long j16;
        long k10;
        ya yaVar = this.h;
        if (yaVar == null && !this.F) {
            long j17 = this.R;
            long k11 = Utilities.k(j17 + f10, 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k11;
            float f14 = (float) (k11 - j17);
            this.T = Utilities.i(this.T - (f14 / ((float) this.S)), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f14 / ((float) this.S)), 1.0f, 0.0f);
            xa xaVar2 = this.f14421a;
            if (xaVar2 != null) {
                xaVar2.w1(this.T);
                this.f14421a.q1(this.U);
            }
        } else if (this.Q) {
            if (yaVar != null) {
                f11 = yaVar.f15742g;
                j3 = yaVar.f15740e;
            } else {
                f11 = this.K;
                j3 = this.I;
            }
            float f15 = f11 * ((float) j3);
            if (yaVar != null) {
                f12 = yaVar.h;
                j10 = yaVar.f15740e;
            } else {
                f12 = this.L;
                j10 = this.I;
            }
            float f16 = f12 * ((float) j10);
            if (yaVar != null) {
                f13 = (yaVar.h - yaVar.f15742g) * ((float) yaVar.f15740e);
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
                xa xaVar3 = this.f14421a;
                if (xaVar3 != null) {
                    xaVar3.w1(this.T);
                    this.f14421a.q1(this.U);
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
                xa xaVar4 = this.f14421a;
                if (xaVar4 != null) {
                    xaVar4.w1(this.T);
                    this.f14421a.q1(this.U);
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
        xa xaVar5 = this.f14421a;
        if (xaVar5 != null) {
            xaVar5.m2(this.R + (this.T * ((float) this.S)));
        }
        boolean z10 = this.n1;
        if (!z10 && (xaVar = this.f14421a) != null) {
            xaVar.D0(true);
            ya yaVar2 = this.h;
            if (yaVar2 != null) {
                long j27 = this.R + (this.T * ((float) this.S));
                float f24 = yaVar2.h;
                float f25 = (float) yaVar2.f15740e;
                k10 = Utilities.k(j27, f24 * f25, yaVar2.f15742g * f25);
            } else if (this.F) {
                long j28 = this.R + (this.T * ((float) this.S));
                float f26 = this.L;
                float f27 = (float) this.I;
                k10 = Utilities.k(j28, f26 * f27, this.K * f27);
            } else {
                float f28 = this.T;
                k10 = Utilities.k(f28 * ((float) j16), this.S, 0L);
            }
            if (this.h != null && Math.abs(this.f14432e - k10) > 400) {
                this.f14431d1 = this.f14432e;
                this.f14429c1.e(true, 1.0f);
            }
            xa xaVar6 = this.f14421a;
            this.f14432e = k10;
            xaVar6.M(k10, false);
        } else if (z10 || this.f14463s1) {
            ya yaVar3 = this.h;
            if (yaVar3 != null) {
                long j29 = this.R + (this.T * ((float) this.S));
                float f29 = yaVar3.h;
                float f30 = (float) yaVar3.f15740e;
                this.f14432e = Utilities.k(j29, f29 * f30, yaVar3.f15742g * f30);
            } else if (this.F && yaVar3 != null) {
                long j30 = this.R + (this.T * ((float) this.S));
                float f31 = this.L;
                float f32 = (float) yaVar3.f15740e;
                this.f14432e = Utilities.k(j30, f31 * f32, this.K * f32);
            } else {
                float f33 = this.T;
                this.f14432e = Utilities.k(f33 * ((float) j15), this.S, 0L);
            }
            xa xaVar7 = this.f14421a;
            if (xaVar7 != null) {
                xaVar7.M(this.f14432e, false);
            }
        }
    }

    public final void i(ya yaVar, float f10) {
        long j3;
        xa xaVar;
        long j10;
        long k10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (yaVar != null) {
            ya yaVar2 = this.f14470w;
            if (yaVar2 != yaVar && yaVar2 != null) {
                if (this.f14450n == this.f14461s.indexOf(yaVar)) {
                    ya yaVar3 = this.f14470w;
                    float f11 = (float) yaVar3.f15740e;
                    float f12 = yaVar.h;
                    float f13 = (float) yaVar.f15740e;
                    float f14 = yaVar.f15742g;
                    long j15 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((yaVar3.h - yaVar3.f15742g) * f11) / f13);
                    long j16 = yaVar.f15741f;
                    long j17 = f10;
                    long j18 = j16 + j17;
                    if (j18 > (f11 * 1.0f) - (f12 * f13)) {
                        ya yaVar4 = this.f14470w;
                        float i7 = Utilities.i((((yaVar4.h * ((float) yaVar4.f15740e)) - ((float) j16)) - ((float) j17)) / ((float) yaVar.f15740e), 1.0f, min);
                        yaVar.h = i7;
                        float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                        yaVar.f15742g = i10;
                        ya yaVar5 = this.f14470w;
                        float f15 = yaVar5.h;
                        float f16 = (float) yaVar5.f15740e;
                        float f17 = yaVar.h;
                        float f18 = (float) yaVar.f15740e;
                        long j19 = (f15 * f16) - (f17 * f18);
                        long j20 = (yaVar5.f15742g * f16) - (i10 * f18);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        yaVar.f15741f = Utilities.k(yaVar.f15741f + j17, j14, j13);
                        xa xaVar2 = this.f14421a;
                        if (xaVar2 != null) {
                            xaVar2.n1(yaVar.f15742g, yaVar.f15737a);
                            this.f14421a.G1(yaVar.h, yaVar.f15737a);
                        }
                    } else if (j18 < j15) {
                        ya yaVar6 = this.f14470w;
                        float i11 = Utilities.i((((yaVar6.f15742g * ((float) yaVar6.f15740e)) - ((float) j16)) - ((float) j17)) / ((float) yaVar.f15740e), 1.0f - min, 0.0f);
                        yaVar.f15742g = i11;
                        float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                        yaVar.h = i12;
                        ya yaVar7 = this.f14470w;
                        float f19 = yaVar7.h;
                        float f20 = (float) yaVar7.f15740e;
                        float f21 = (float) yaVar.f15740e;
                        long j21 = (f19 * f20) - (i12 * f21);
                        long j22 = (yaVar7.f15742g * f20) - (yaVar.f15742g * f21);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        yaVar.f15741f = Utilities.k(yaVar.f15741f + j17, j12, j11);
                        xa xaVar3 = this.f14421a;
                        if (xaVar3 != null) {
                            xaVar3.n1(yaVar.f15742g, yaVar.f15737a);
                            this.f14421a.G1(yaVar.h, yaVar.f15737a);
                        }
                    } else {
                        yaVar.f15741f = j18;
                    }
                } else {
                    long j23 = yaVar.f15741f + f10;
                    float f22 = (float) yaVar.f15740e;
                    yaVar.f15741f = Utilities.k(j23, ((float) getBaseDuration()) - (yaVar.h * f22), (-yaVar.f15742g) * f22);
                }
            }
            invalidate();
            xa xaVar4 = this.f14421a;
            if (xaVar4 != null) {
                xaVar4.i2(yaVar.f15737a, yaVar.f15741f);
            }
            boolean z10 = this.n1;
            if (!z10 && (xaVar = this.f14421a) != null) {
                xaVar.D0(true);
                ya yaVar8 = this.f14470w;
                if (yaVar8 != yaVar && yaVar8 != null) {
                    long j24 = yaVar.f15741f + (yaVar.f15742g * ((float) yaVar.f15740e));
                    float f23 = yaVar8.h;
                    float f24 = (float) yaVar8.f15740e;
                    k10 = Utilities.k(j24, f23 * f24, yaVar8.f15742g * f24);
                } else {
                    float f25 = yaVar.f15742g;
                    k10 = Utilities.k(f25 * ((float) j10), yaVar.f15740e, 0L);
                }
                ya yaVar9 = this.f14470w;
                if (yaVar9 != yaVar && yaVar9 != null && Math.abs(this.f14432e - k10) > 400) {
                    this.f14431d1 = this.f14432e;
                    this.f14429c1.e(true, 1.0f);
                }
                xa xaVar5 = this.f14421a;
                this.f14432e = k10;
                xaVar5.M(k10, false);
            } else if (z10 || this.f14463s1) {
                ya yaVar10 = this.f14470w;
                if (yaVar10 != yaVar && yaVar10 != null) {
                    long j25 = yaVar.f15741f + (yaVar.f15742g * ((float) yaVar.f15740e));
                    float f26 = yaVar10.h;
                    float f27 = (float) yaVar10.f15740e;
                    this.f14432e = Utilities.k(j25, f26 * f27, yaVar10.f15742g * f27);
                } else {
                    float f28 = yaVar.f15742g;
                    this.f14432e = Utilities.k(f28 * ((float) j3), yaVar.f15740e, 0L);
                }
                xa xaVar6 = this.f14421a;
                if (xaVar6 != null) {
                    xaVar6.M(this.f14432e, false);
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
        xa xaVar;
        long j14;
        long k10;
        ya yaVar = this.h;
        if (yaVar == null) {
            long j15 = this.J;
            long k11 = Utilities.k(j15 + f10, 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k11;
            float f11 = (float) (k11 - j15);
            this.K = Utilities.i(this.K - (f11 / ((float) this.I)), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f11 / ((float) this.I)), 1.0f, 0.0f);
            xa xaVar2 = this.f14421a;
            if (xaVar2 != null) {
                xaVar2.s0(this.K);
                this.f14421a.b2(this.L);
            }
        } else if (this.H) {
            float f12 = yaVar.h;
            float f13 = (float) yaVar.f15740e;
            float f14 = this.L;
            float f15 = (float) this.I;
            long j16 = (f12 * f13) - (f14 * f15);
            float f16 = yaVar.f15742g;
            float f17 = this.K;
            long j17 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j18 = this.J;
            long j19 = f10;
            long j20 = j18 + j19;
            if (j20 > j16) {
                ya yaVar2 = this.h;
                float i7 = Utilities.i((((yaVar2.h * ((float) yaVar2.f15740e)) - ((float) j18)) - ((float) j19)) / ((float) this.I), 1.0f, min);
                this.L = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.K = i10;
                ya yaVar3 = this.h;
                float f18 = yaVar3.h;
                float f19 = (float) yaVar3.f15740e;
                float f20 = this.L;
                float f21 = (float) this.I;
                long j21 = (f18 * f19) - (f20 * f21);
                long j22 = (yaVar3.f15742g * f19) - (i10 * f21);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.J = Utilities.k(this.J + j19, j12, j11);
                xa xaVar3 = this.f14421a;
                if (xaVar3 != null) {
                    xaVar3.s0(this.K);
                    this.f14421a.b2(this.L);
                }
            } else if (j20 < j17) {
                ya yaVar4 = this.h;
                float i11 = Utilities.i((((yaVar4.f15742g * ((float) yaVar4.f15740e)) - ((float) j18)) - ((float) j19)) / ((float) this.I), 1.0f - min, 0.0f);
                this.K = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.L = i12;
                ya yaVar5 = this.h;
                float f22 = yaVar5.h;
                float f23 = (float) yaVar5.f15740e;
                float f24 = (float) this.I;
                long j23 = (f22 * f23) - (i12 * f24);
                long j24 = (yaVar5.f15742g * f23) - (this.K * f24);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.J = Utilities.k(this.J + j19, j10, j3);
                xa xaVar4 = this.f14421a;
                if (xaVar4 != null) {
                    xaVar4.s0(this.K);
                    this.f14421a.b2(this.L);
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
        xa xaVar5 = this.f14421a;
        if (xaVar5 != null) {
            xaVar5.e1(this.J + (this.K * ((float) this.I)));
        }
        boolean z10 = this.n1;
        if (!z10 && (xaVar = this.f14421a) != null) {
            xaVar.D0(true);
            ya yaVar6 = this.h;
            if (yaVar6 != null) {
                long j26 = this.J + (this.K * ((float) this.I));
                float f26 = yaVar6.h;
                float f27 = (float) yaVar6.f15740e;
                k10 = Utilities.k(j26, f26 * f27, yaVar6.f15742g * f27);
            } else {
                float f28 = this.K;
                k10 = Utilities.k(f28 * ((float) j14), this.I, 0L);
            }
            if (this.h != null && Math.abs(this.f14432e - k10) > 400) {
                this.f14431d1 = this.f14432e;
                this.f14429c1.e(true, 1.0f);
            }
            xa xaVar6 = this.f14421a;
            this.f14432e = k10;
            xaVar6.M(k10, false);
        } else if (z10 || this.f14463s1) {
            ya yaVar7 = this.h;
            if (yaVar7 != null) {
                long j27 = this.J + (this.K * ((float) this.I));
                float f29 = yaVar7.h;
                float f30 = (float) yaVar7.f15740e;
                this.f14432e = Utilities.k(j27, f29 * f30, yaVar7.f15742g * f30);
            } else {
                float f31 = this.K;
                this.f14432e = Utilities.k(f31 * ((float) j13), this.I, 0L);
            }
            xa xaVar7 = this.f14421a;
            if (xaVar7 != null) {
                xaVar7.M(this.f14432e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ya yaVar = this.h;
        long j3 = yaVar.f15740e;
        this.f14435f = Utilities.k((((yaVar.h + yaVar.f15742g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
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
        ya yaVar;
        ya yaVar2 = this.h;
        ArrayList arrayList = this.f14461s;
        if (yaVar2 != null || this.O || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f14480z1) - this.f14478y1) / this.f14469v1;
            ya yaVar3 = this.f14470w;
            if (yaVar3 != null) {
                j3 = (yaVar3.f15742g * ((float) yaVar3.f15740e)) + ((float) yaVar3.f15741f);
            } else {
                j3 = 0;
            }
            float f12 = f11 * ((float) min);
            if (yaVar3 == null) {
                if (this.h == null) {
                    j3 = this.R;
                } else {
                    j3 = 0;
                }
            }
            long i7 = Utilities.i((f12 - ((float) j3)) + ((float) this.f14435f), (float) getBaseDuration(), 0.0f);
            ya yaVar4 = this.h;
            if (yaVar4 != null) {
                float f13 = ((float) i7) / ((float) yaVar4.f15740e);
                if (f13 < yaVar4.f15742g || f13 > yaVar4.h) {
                    return false;
                }
            }
            if (this.f14470w == null || (i7 >= 0 && i7 < (yaVar.h - yaVar.f15742g) * ((float) yaVar.f15740e))) {
                if (this.O && yaVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) i7) / ((float) this.S);
                    if (f14 < this.T || f14 > this.U) {
                        return false;
                    }
                }
                this.f14432e = i7;
                invalidate();
                xa xaVar = this.f14421a;
                if (xaVar != null) {
                    xaVar.M(i7, z10);
                }
                bi.e4 e4Var = this.f14434e1;
                if (e4Var != null) {
                    org.telegram.messenger.g0.r(e4Var);
                    this.f14434e1 = null;
                }
                if (z10) {
                    bi.e4 e4Var2 = new bi.e4(this, i7, 10);
                    this.f14434e1 = e4Var2;
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
        ya yaVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        bb bbVar = this.N;
        Long l10 = null;
        if (bbVar != null) {
            bbVar.b();
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
            if (getMeasuredWidth() <= 0 || this.N != null || ((yaVar = this.h) != null && yaVar.f15740e < 1)) {
                z11 = false;
                j11 = j12;
                z12 = true;
            } else {
                String str2 = this.G;
                int i7 = this.f14472w1;
                int i10 = this.f14480z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j13 = this.I;
                if (j13 > 2) {
                    l10 = Long.valueOf(j13);
                }
                ya yaVar2 = this.h;
                if (yaVar2 != null) {
                    maxScrollDuration = yaVar2.f15740e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z11 = false;
                z12 = true;
                this.N = new bb(this, false, str2, i11, L, l10, maxScrollDuration, -1L, -1L, new ua(this, 0));
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
        if (j11 != j3 && this.h == null && this.f14425b0 != null) {
            this.f14422a0 = z12;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(((float) j3) / ((float) this.S), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f14433e0.f(this.H, z12);
            this.f14438g0.f(this.Q, z12);
            this.f14430d0.f(this.F, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f10) {
        String str2;
        ya yaVar = this.h;
        if (yaVar == null) {
            str2 = null;
        } else {
            str2 = yaVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        ya yaVar2 = this.h;
        if (yaVar2 != null) {
            bb bbVar = yaVar2.f15739c;
            if (bbVar != null) {
                bbVar.b();
                this.h.f15739c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f14435f = 0L;
            ya yaVar3 = new ya(this);
            this.h = yaVar3;
            yaVar3.f15738b = z10;
            yaVar3.d = str;
            yaVar3.f15740e = j3;
            yaVar3.f15743i = f10;
            ya.a(yaVar3, false);
        } else {
            this.h = null;
            this.f14435f = 0L;
        }
        if (!this.F) {
            this.H = false;
        }
        this.f14432e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.M0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.Q0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        this.f14480z1 = L;
        int L2 = org.telegram.messenger.g0.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        int size = View.MeasureSpec.getSize(i7);
        this.f14472w1 = size;
        int L3 = org.telegram.messenger.g0.L(388);
        this.f14475x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        this.f14478y1 = L4;
        this.f14469v1 = (this.f14472w1 - (L4 * 2)) - (this.f14480z1 * 2);
        ya yaVar = this.h;
        if (yaVar != null && yaVar.d != null && yaVar.f15739c == null) {
            ya.a(yaVar, false);
        }
        ArrayList arrayList = this.f14461s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ya yaVar2 = (ya) obj;
                if (yaVar2.d != null && yaVar2.f15739c == null) {
                    ya.a(yaVar2, false);
                    ya.b(yaVar2);
                }
            }
        }
        if (this.P != null && this.f14425b0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: hi.db.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f14425b0 == null || this.f14422a0) {
                this.f14425b0 = new wa(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.f14440h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        ya yaVar;
        a3.c cVar = new a3.c(29);
        ArrayList arrayList = this.f14461s;
        Collections.sort(arrayList, cVar);
        if (arrayList.isEmpty()) {
            yaVar = null;
        } else {
            yaVar = (ya) arrayList.get(0);
        }
        this.f14470w = yaVar;
        if (yaVar != null) {
            long j3 = yaVar.f15741f;
        }
    }

    public void setCollage(ArrayList<d7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        bb bbVar;
        int i7 = 0;
        while (true) {
            arrayList2 = this.f14461s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ya yaVar = (ya) arrayList2.get(i7);
            if (yaVar != null && (bbVar = yaVar.f15739c) != null) {
                bbVar.b();
            }
            i7++;
        }
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            arrayList3 = this.f14458r;
            if (i10 >= arrayList3.size()) {
                break;
            }
            wa waVar = (wa) arrayList3.get(i10);
            if (waVar != null) {
                waVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.f14442i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                d7 d7Var = arrayList.get(i11);
                if (d7Var.K) {
                    ya yaVar2 = new ya(this);
                    yaVar2.f15737a = i11;
                    yaVar2.f15738b = false;
                    yaVar2.d = d7Var.L.getAbsolutePath();
                    yaVar2.f15740e = d7Var.f14380h0;
                    yaVar2.f15741f = d7Var.X;
                    yaVar2.f15743i = d7Var.P;
                    yaVar2.f15742g = d7Var.V;
                    yaVar2.h = d7Var.W;
                    ya.a(yaVar2, false);
                    ya.b(yaVar2);
                    arrayList2.add(yaVar2);
                }
            }
        }
        q();
        this.f14450n = 0;
    }

    public void setDelegate(xa xaVar) {
        this.f14421a = xaVar;
    }

    public void setMaxCount(int i7) {
        this.f14428c0 = i7;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f14424b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: hi.db.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f10) {
        ya yaVar = this.h;
        if (yaVar == null) {
            return;
        }
        yaVar.f15742g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        ya yaVar = this.h;
        if (yaVar == null) {
            return;
        }
        yaVar.h = f10;
        invalidate();
    }
}
