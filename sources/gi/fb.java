package gi;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
public final class fb extends View {
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
    public final eb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public db N;
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
    public final al0 X0;
    public boolean Y0;
    public final ai.t6 Z0;
    public za f12758a;
    public boolean f12759a0;
    public long f12760a1;
    public Runnable f12761b;
    public ya f12762b0;
    public long f12763b1;
    public int f12764c;
    public int f12765c0;
    public final org.telegram.ui.Components.u5 f12766c1;
    public Runnable d;
    public final org.telegram.ui.Components.u5 f12767d0;
    public long f12768d1;
    public long f12769e;
    public final org.telegram.ui.Components.u5 f12770e0;
    public ci.e3 f12771e1;
    public long f12772f;
    public final org.telegram.ui.Components.u5 f12773f0;
    public long f12774f1;
    public final org.telegram.ui.Components.u5 f12775g0;
    public long f12776g1;
    public ab h;
    public final org.telegram.ui.Components.u5 f12777h0;
    public float f12778h1;
    public final org.telegram.ui.Components.u5 f12779i0;
    public int f12780i1;
    public final org.telegram.ui.Components.u5 f12781j0;
    public int f12782j1;
    public boolean f12783k0;
    public int k1;
    public final org.telegram.ui.Components.x9 f12784l0;
    public int f12785l1;
    public final org.telegram.ui.Components.ba m0;
    public boolean m1;
    public int f12786n;
    public final org.telegram.ui.Components.ba f12787n0;
    public boolean f12788n1;
    public final org.telegram.ui.Components.ba f12789o0;
    public float f12790o1;
    public final RectF f12791p0;
    public boolean f12792p1;
    public final Path f12793q0;
    public VelocityTracker f12794q1;
    public final ArrayList f12795r;
    public final ly0 f12796r0;
    public boolean f12797r1;
    public final ArrayList f12798s;
    public final Drawable f12799s0;
    public boolean f12800s1;
    public final eb f12801t0;
    public int f12802t1;
    public final RectF f12803u0;
    public final float[] f12804u1;
    public final Paint f12805v0;
    public int f12806v1;
    public ab f12807w;
    public final Path f12808w0;
    public int f12809w1;
    public final Paint f12810x;
    public final Path f12811x0;
    public int f12812x1;
    public final Path f12813y;
    public final RectF f12814y0;
    public int f12815y1;
    public final Path f12816z0;
    public int f12817z1;

    public fb(Context context, ViewGroup viewGroup, ha haVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var) {
        super(context);
        this.f12786n = 0;
        this.f12795r = new ArrayList();
        this.f12798s = new ArrayList();
        this.f12810x = new Paint(3);
        this.f12813y = new Path();
        this.E = new Path();
        this.f12765c0 = 1;
        xq xqVar = xq.h;
        this.f12767d0 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.f12770e0 = new org.telegram.ui.Components.u5(this, 360L, xqVar);
        this.f12773f0 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.f12775g0 = new org.telegram.ui.Components.u5(this, 360L, xqVar);
        this.f12777h0 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.f12779i0 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.f12781j0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.f12783k0 = true;
        this.f12791p0 = new RectF();
        this.f12793q0 = new Path();
        this.f12801t0 = new eb();
        this.f12803u0 = new RectF();
        this.f12805v0 = new Paint(3);
        this.f12808w0 = new Path();
        this.f12811x0 = new Path();
        this.f12814y0 = new RectF();
        this.f12816z0 = new Path();
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
        this.J0 = new eb();
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
        this.X0 = new al0(getContext(), null);
        this.f12760a1 = -1L;
        this.f12763b1 = -1L;
        this.f12766c1 = new org.telegram.ui.Components.u5(0.0f, this, 0L, 340L, xqVar);
        this.f12768d1 = -1L;
        this.f12780i1 = -1;
        this.f12782j1 = -1;
        this.k1 = -1;
        this.f12785l1 = -1;
        this.f12790o1 = 1.0f;
        this.f12797r1 = true;
        this.f12800s1 = false;
        this.f12804u1 = new float[8];
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
        this.f12796r0 = new ly0(bd.M0(2131744466, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232778).mutate();
        this.f12799s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231188).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f12784l0 = x9Var;
        this.m0 = new org.telegram.ui.Components.ba(x9Var, this, 0, false);
        this.f12787n0 = new org.telegram.ui.Components.ba(x9Var, this, 3, false);
        this.f12789o0 = new org.telegram.ui.Components.ba(x9Var, this, 4, false);
        this.Z0 = new ai.t6(this, viewGroup, e6Var, x9Var, haVar, 14);
    }

    public static void a(final fb fbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var, View view) {
        int i3;
        ArrayList arrayList = fbVar.f12798s;
        int i10 = fbVar.k1;
        try {
            if (i10 == 2 && fbVar.O) {
                z6 z6Var = new z6(fbVar.getContext(), 0);
                z6Var.f14032b = 0.0f;
                z6Var.f14033c = 1.5f;
                z6Var.d(fbVar.W);
                z6Var.h = new u10(fbVar) {
                    public final fb f13874b;

                    {
                        this.f13874b = fbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                fb fbVar2 = this.f13874b;
                                fbVar2.W = floatValue;
                                za zaVar = fbVar2.f12758a;
                                if (zaVar != null) {
                                    zaVar.j(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                fb fbVar3 = this.f13874b;
                                fbVar3.M = floatValue2;
                                za zaVar2 = fbVar3.f12758a;
                                if (zaVar2 != null) {
                                    zaVar2.i(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                fb fbVar4 = this.f13874b;
                                fbVar4.h.f12418i = f10.floatValue();
                                za zaVar3 = fbVar4.f12758a;
                                if (zaVar3 != null) {
                                    zaVar3.I(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
                int i11 = fbVar.f12809w1;
                int i12 = fbVar.f12817z1;
                int i13 = fbVar.f12815y1;
                float min2 = Math.min((i11 - i12) - i13, ((((org.telegram.messenger.g0.T1(fbVar.U, 1.0f, fbVar.f12775g0.f38645c) * ((float) fbVar.S)) + ((float) (fbVar.R - fbVar.f12772f))) / ((float) min)) * fbVar.f12806v1) + i12 + i13);
                f60 F = f60.F(viewGroup, e6Var, fbVar);
                F.q(z6Var);
                F.o();
                F.c(2131232108, bd.M0(2131744730, null), new wa(fbVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(fbVar.f12809w1 - min2)) + org.telegram.messenger.g0.L(18.0f), fbVar.G0.top);
                F.Z();
                F.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && fbVar.F) {
                z6 z6Var2 = new z6(fbVar.getContext(), 0);
                z6Var2.f14032b = 0.0f;
                z6Var2.f14033c = 1.5f;
                z6Var2.d(fbVar.M);
                z6Var2.h = new u10(fbVar) {
                    public final fb f13874b;

                    {
                        this.f13874b = fbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                fb fbVar2 = this.f13874b;
                                fbVar2.W = floatValue;
                                za zaVar = fbVar2.f12758a;
                                if (zaVar != null) {
                                    zaVar.j(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                fb fbVar3 = this.f13874b;
                                fbVar3.M = floatValue2;
                                za zaVar2 = fbVar3.f12758a;
                                if (zaVar2 != null) {
                                    zaVar2.i(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                fb fbVar4 = this.f13874b;
                                fbVar4.h.f12418i = f10.floatValue();
                                za zaVar3 = fbVar4.f12758a;
                                if (zaVar3 != null) {
                                    zaVar3.I(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
                int i14 = fbVar.f12809w1;
                int i15 = fbVar.f12817z1;
                int i16 = fbVar.f12815y1;
                float min4 = Math.min((i14 - i15) - i16, ((((org.telegram.messenger.g0.T1(fbVar.L, 1.0f, fbVar.f12770e0.f38645c) * ((float) fbVar.I)) + ((float) (fbVar.J - fbVar.f12772f))) / ((float) min3)) * fbVar.f12806v1) + i15 + i16);
                f60 F2 = f60.F(viewGroup, e6Var, fbVar);
                F2.q(z6Var2);
                F2.o();
                F2.c(2131232108, bd.M0(2131744497, null), new wa(fbVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(fbVar.f12809w1 - min4)) + org.telegram.messenger.g0.L(18.0f), fbVar.f12814y0.top);
                F2.Z();
                F2.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && fbVar.h != null) {
                z6 z6Var3 = new z6(fbVar.getContext(), 0);
                z6Var3.f14032b = 0.0f;
                z6Var3.f14033c = 1.5f;
                z6Var3.d(fbVar.h.f12418i);
                z6Var3.h = new u10(fbVar) {
                    public final fb f13874b;

                    {
                        this.f13874b = fbVar;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                fb fbVar2 = this.f13874b;
                                fbVar2.W = floatValue;
                                za zaVar = fbVar2.f12758a;
                                if (zaVar != null) {
                                    zaVar.j(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                fb fbVar3 = this.f13874b;
                                fbVar3.M = floatValue2;
                                za zaVar2 = fbVar3.f12758a;
                                if (zaVar2 != null) {
                                    zaVar2.i(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                fb fbVar4 = this.f13874b;
                                fbVar4.h.f12418i = f10.floatValue();
                                za zaVar3 = fbVar4.f12758a;
                                if (zaVar3 != null) {
                                    zaVar3.I(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                f60 F3 = f60.F(viewGroup, e6Var, fbVar);
                F3.q(z6Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(org.telegram.messenger.g0.L(18.0f), fbVar.f12803u0.top);
                F3.Z();
                F3.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            } else if (i10 == 3 && (i3 = fbVar.f12785l1) >= 0 && i3 < arrayList.size()) {
                ab abVar = (ab) arrayList.get(fbVar.f12785l1);
                z6 z6Var4 = new z6(fbVar.getContext(), 0);
                z6Var4.f14032b = 0.0f;
                z6Var4.f14033c = 1.5f;
                z6Var4.d(abVar.f12418i);
                z6Var4.h = new ai.o1(19, fbVar, abVar);
                f60 F4 = f60.F(viewGroup, e6Var, fbVar);
                F4.q(z6Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(org.telegram.messenger.g0.L(18.0f), abVar.f12419j.top);
                F4.Z();
                F4.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.g0.W1(this.f12775g0.d(this.Q), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public long getBaseDuration() {
        ab abVar = this.h;
        if (abVar != null) {
            return Math.max(1L, abVar.f12415e);
        }
        ab abVar2 = this.f12807w;
        if (abVar2 != null) {
            return Math.max(1L, abVar2.f12415e);
        }
        if (this.F) {
            return Math.max(1L, this.I);
        }
        return Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f12798s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (f10 > 0.0f) {
                f10 += org.telegram.messenger.g0.L(4.0f);
            }
            f10 += org.telegram.messenger.g0.W1(((ab) arrayList.get(i3)).f12420k.f38645c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.F) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(this.f12770e0.d(this.H), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    private float getVideoHeight() {
        ab abVar = this.h;
        if (abVar == null) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(abVar.f12420k.f38645c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: gi.fb.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        al0 al0Var = this.X0;
        if (al0Var.b()) {
            int i3 = al0Var.f31883j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f12797r1) {
                this.f12772f = Math.max(0.0f, (((i3 - this.f12817z1) - this.f12815y1) / this.f12806v1) * ((float) min));
            } else if (!this.Q) {
                al0Var.a();
                return;
            } else {
                int i10 = this.f12817z1;
                int i11 = this.f12815y1;
                float f10 = this.f12806v1;
                float f11 = (float) min;
                h(((((i3 - i10) - i11) / f10) * f11) - ((((this.f12802t1 - i10) - i11) / f10) * f11));
            }
            invalidate();
            this.f12802t1 = i3;
        } else if (this.f12800s1) {
            this.f12800s1 = false;
            za zaVar = this.f12758a;
            if (zaVar != null) {
                zaVar.C(false);
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, long j10, float f12) {
        long j11;
        float f13;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = (float) Utilities.k(j10, getBaseDuration(), 0L);
        ab abVar = this.f12807w;
        if (abVar != null) {
            f13 = (abVar.f12417g * ((float) abVar.f12415e)) + ((float) abVar.f12416f);
        } else {
            if (this.h == null) {
                j11 = this.R;
            } else {
                j11 = 0;
            }
            f13 = (float) j11;
        }
        float f14 = (this.f12806v1 * (((k10 + f13) - ((float) this.f12772f)) / ((float) min))) + this.f12817z1 + this.f12815y1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.D0;
        paint.setAlpha((int) (38.0f * f12));
        int i3 = (int) (f12 * 255.0f);
        Paint paint2 = this.E0;
        paint2.setAlpha(i3);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        rectF.inset(-org.telegram.messenger.g0.N(0.66f), -org.telegram.messenger.g0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: gi.fb.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f12809w1, this.f12812x1, 255, 31);
        int i3 = (int) (255.0f * f14);
        Paint paint3 = this.A0;
        paint3.setAlpha(i3);
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
        paint2.setAlpha(i3);
        if (this.Y0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float y9 = org.telegram.messenger.k5.y(org.telegram.messenger.g0.L(f16), L, 2.0f, f12);
        float f20 = f10 + f11;
        float f21 = (f20 - L2) / 2.0f;
        if (this.Y0) {
            f17 = 2.0f;
        } else {
            f17 = 10.0f;
        }
        float f22 = (f20 + L2) / 2.0f;
        rectF.set(y9, f21, f12 - ((org.telegram.messenger.g0.L(f17) + L) / 2.0f), f22);
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
        float z11 = com.google.android.recaptcha.internal.a.z(org.telegram.messenger.g0.L(f18), L, 2.0f, f13);
        if (this.Y0) {
            f19 = 2.5f;
        }
        rectF.set(z11, f21, org.telegram.messenger.k5.a(org.telegram.messenger.g0.L(f19), L, 2.0f, f13), f22);
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
        return this.f12765c0 * 59000;
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
        if (this.f12798s.isEmpty()) {
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
        return this.f12765c0;
    }

    public long getMaxScrollDuration() {
        if (this.f12798s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return org.telegram.messenger.g0.W1(this.f12781j0.f38645c, org.telegram.messenger.g0.L(28.0f) + this.A1 + this.A1, getContentHeight());
    }

    public final void h(float f10) {
        float f11;
        long j10;
        float f12;
        long j11;
        float f13;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        za zaVar;
        long j17;
        long k10;
        ab abVar = this.h;
        if (abVar == null && !this.F) {
            long j18 = this.R;
            long k11 = Utilities.k(j18 + f10, 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k11;
            float f14 = (float) (k11 - j18);
            this.T = Utilities.i(this.T - (f14 / ((float) this.S)), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f14 / ((float) this.S)), 1.0f, 0.0f);
            za zaVar2 = this.f12758a;
            if (zaVar2 != null) {
                zaVar2.T(this.T);
                this.f12758a.R(this.U);
            }
        } else if (this.Q) {
            if (abVar != null) {
                f11 = abVar.f12417g;
                j10 = abVar.f12415e;
            } else {
                f11 = this.K;
                j10 = this.I;
            }
            float f15 = f11 * ((float) j10);
            if (abVar != null) {
                f12 = abVar.h;
                j11 = abVar.f12415e;
            } else {
                f12 = this.L;
                j11 = this.I;
            }
            float f16 = f12 * ((float) j11);
            if (abVar != null) {
                f13 = (abVar.h - abVar.f12417g) * ((float) abVar.f12415e);
            } else {
                f13 = ((float) this.I) * (this.L - this.K);
            }
            float f17 = this.U;
            float f18 = (float) this.S;
            float f19 = this.T;
            long j19 = f15 - (f19 * f18);
            float min = Math.min(f17 - f19, f13 / f18);
            long j20 = this.R;
            long j21 = f10;
            long j22 = j20 + j21;
            if (j22 > f16 - (f17 * f18)) {
                float i3 = Utilities.i(((f16 - ((float) j20)) - ((float) j21)) / ((float) this.S), 1.0f, min);
                this.U = i3;
                float i10 = Utilities.i(i3 - min, 1.0f, 0.0f);
                this.T = i10;
                float f20 = this.U;
                float f21 = (float) this.S;
                long j23 = f16 - (f20 * f21);
                long j24 = f15 - (i10 * f21);
                if (j23 < j24) {
                    j15 = j24;
                    j14 = j23;
                } else {
                    j14 = j24;
                    j15 = j23;
                }
                this.R = Utilities.k(this.R + j21, j15, j14);
                za zaVar3 = this.f12758a;
                if (zaVar3 != null) {
                    zaVar3.T(this.T);
                    this.f12758a.R(this.U);
                }
            } else if (j22 < j19) {
                float i11 = Utilities.i(((f15 - ((float) j20)) - ((float) j21)) / ((float) this.S), 1.0f - min, 0.0f);
                this.T = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.U = i12;
                float f22 = (float) this.S;
                long j25 = f16 - (i12 * f22);
                long j26 = f15 - (this.T * f22);
                if (j25 < j26) {
                    j13 = j26;
                    j12 = j25;
                } else {
                    j12 = j26;
                    j13 = j25;
                }
                this.R = Utilities.k(this.R + j21, j13, j12);
                za zaVar4 = this.f12758a;
                if (zaVar4 != null) {
                    zaVar4.T(this.T);
                    this.f12758a.R(this.U);
                }
            } else {
                this.R = j22;
            }
        } else {
            long j27 = this.R + f10;
            float f23 = (float) this.S;
            this.R = Utilities.k(j27, ((float) getBaseDuration()) - (this.U * f23), (-this.T) * f23);
        }
        invalidate();
        za zaVar5 = this.f12758a;
        if (zaVar5 != null) {
            zaVar5.d0(this.R + (this.T * ((float) this.S)));
        }
        boolean z10 = this.f12788n1;
        if (!z10 && (zaVar = this.f12758a) != null) {
            zaVar.C(true);
            ab abVar2 = this.h;
            if (abVar2 != null) {
                long j28 = this.R + (this.T * ((float) this.S));
                float f24 = abVar2.h;
                float f25 = (float) abVar2.f12415e;
                k10 = Utilities.k(j28, f24 * f25, abVar2.f12417g * f25);
            } else if (this.F) {
                long j29 = this.R + (this.T * ((float) this.S));
                float f26 = this.L;
                float f27 = (float) this.I;
                k10 = Utilities.k(j29, f26 * f27, this.K * f27);
            } else {
                float f28 = this.T;
                k10 = Utilities.k(f28 * ((float) j17), this.S, 0L);
            }
            if (this.h != null && Math.abs(this.f12769e - k10) > 400) {
                this.f12768d1 = this.f12769e;
                this.f12766c1.e(true, 1.0f);
            }
            za zaVar6 = this.f12758a;
            this.f12769e = k10;
            zaVar6.n(k10, false);
        } else if (z10 || this.f12800s1) {
            ab abVar3 = this.h;
            if (abVar3 != null) {
                long j30 = this.R + (this.T * ((float) this.S));
                float f29 = abVar3.h;
                float f30 = (float) abVar3.f12415e;
                this.f12769e = Utilities.k(j30, f29 * f30, abVar3.f12417g * f30);
            } else if (this.F && abVar3 != null) {
                long j31 = this.R + (this.T * ((float) this.S));
                float f31 = this.L;
                float f32 = (float) abVar3.f12415e;
                this.f12769e = Utilities.k(j31, f31 * f32, this.K * f32);
            } else {
                float f33 = this.T;
                this.f12769e = Utilities.k(f33 * ((float) j16), this.S, 0L);
            }
            za zaVar7 = this.f12758a;
            if (zaVar7 != null) {
                zaVar7.n(this.f12769e, false);
            }
        }
    }

    public final void i(ab abVar, float f10) {
        long j10;
        za zaVar;
        long j11;
        long k10;
        long j12;
        long j13;
        long j14;
        long j15;
        if (abVar != null) {
            ab abVar2 = this.f12807w;
            if (abVar2 != abVar && abVar2 != null) {
                if (this.f12786n == this.f12798s.indexOf(abVar)) {
                    ab abVar3 = this.f12807w;
                    float f11 = (float) abVar3.f12415e;
                    float f12 = abVar.h;
                    float f13 = (float) abVar.f12415e;
                    float f14 = abVar.f12417g;
                    long j16 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((abVar3.h - abVar3.f12417g) * f11) / f13);
                    long j17 = abVar.f12416f;
                    long j18 = f10;
                    long j19 = j17 + j18;
                    if (j19 > (f11 * 1.0f) - (f12 * f13)) {
                        ab abVar4 = this.f12807w;
                        float i3 = Utilities.i((((abVar4.h * ((float) abVar4.f12415e)) - ((float) j17)) - ((float) j18)) / ((float) abVar.f12415e), 1.0f, min);
                        abVar.h = i3;
                        float i10 = Utilities.i(i3 - min, 1.0f, 0.0f);
                        abVar.f12417g = i10;
                        ab abVar5 = this.f12807w;
                        float f15 = abVar5.h;
                        float f16 = (float) abVar5.f12415e;
                        float f17 = abVar.h;
                        float f18 = (float) abVar.f12415e;
                        long j20 = (f15 * f16) - (f17 * f18);
                        long j21 = (abVar5.f12417g * f16) - (i10 * f18);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        abVar.f12416f = Utilities.k(abVar.f12416f + j18, j15, j14);
                        za zaVar2 = this.f12758a;
                        if (zaVar2 != null) {
                            zaVar2.P(abVar.f12417g, abVar.f12412a);
                            this.f12758a.V(abVar.h, abVar.f12412a);
                        }
                    } else if (j19 < j16) {
                        ab abVar6 = this.f12807w;
                        float i11 = Utilities.i((((abVar6.f12417g * ((float) abVar6.f12415e)) - ((float) j17)) - ((float) j18)) / ((float) abVar.f12415e), 1.0f - min, 0.0f);
                        abVar.f12417g = i11;
                        float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                        abVar.h = i12;
                        ab abVar7 = this.f12807w;
                        float f19 = abVar7.h;
                        float f20 = (float) abVar7.f12415e;
                        float f21 = (float) abVar.f12415e;
                        long j22 = (f19 * f20) - (i12 * f21);
                        long j23 = (abVar7.f12417g * f20) - (abVar.f12417g * f21);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        abVar.f12416f = Utilities.k(abVar.f12416f + j18, j13, j12);
                        za zaVar3 = this.f12758a;
                        if (zaVar3 != null) {
                            zaVar3.P(abVar.f12417g, abVar.f12412a);
                            this.f12758a.V(abVar.h, abVar.f12412a);
                        }
                    } else {
                        abVar.f12416f = j19;
                    }
                } else {
                    long j24 = abVar.f12416f + f10;
                    float f22 = (float) abVar.f12415e;
                    abVar.f12416f = Utilities.k(j24, ((float) getBaseDuration()) - (abVar.h * f22), (-abVar.f12417g) * f22);
                }
            }
            invalidate();
            za zaVar4 = this.f12758a;
            if (zaVar4 != null) {
                zaVar4.b0(abVar.f12412a, abVar.f12416f);
            }
            boolean z10 = this.f12788n1;
            if (!z10 && (zaVar = this.f12758a) != null) {
                zaVar.C(true);
                ab abVar8 = this.f12807w;
                if (abVar8 != abVar && abVar8 != null) {
                    long j25 = abVar.f12416f + (abVar.f12417g * ((float) abVar.f12415e));
                    float f23 = abVar8.h;
                    float f24 = (float) abVar8.f12415e;
                    k10 = Utilities.k(j25, f23 * f24, abVar8.f12417g * f24);
                } else {
                    float f25 = abVar.f12417g;
                    k10 = Utilities.k(f25 * ((float) j11), abVar.f12415e, 0L);
                }
                ab abVar9 = this.f12807w;
                if (abVar9 != abVar && abVar9 != null && Math.abs(this.f12769e - k10) > 400) {
                    this.f12768d1 = this.f12769e;
                    this.f12766c1.e(true, 1.0f);
                }
                za zaVar5 = this.f12758a;
                this.f12769e = k10;
                zaVar5.n(k10, false);
            } else if (z10 || this.f12800s1) {
                ab abVar10 = this.f12807w;
                if (abVar10 != abVar && abVar10 != null) {
                    long j26 = abVar.f12416f + (abVar.f12417g * ((float) abVar.f12415e));
                    float f26 = abVar10.h;
                    float f27 = (float) abVar10.f12415e;
                    this.f12769e = Utilities.k(j26, f26 * f27, abVar10.f12417g * f27);
                } else {
                    float f28 = abVar.f12417g;
                    this.f12769e = Utilities.k(f28 * ((float) j10), abVar.f12415e, 0L);
                }
                za zaVar6 = this.f12758a;
                if (zaVar6 != null) {
                    zaVar6.n(this.f12769e, false);
                }
            }
        }
    }

    public final void j(float f10) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        za zaVar;
        long j15;
        long k10;
        ab abVar = this.h;
        if (abVar == null) {
            long j16 = this.J;
            long k11 = Utilities.k(j16 + f10, 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k11;
            float f11 = (float) (k11 - j16);
            this.K = Utilities.i(this.K - (f11 / ((float) this.I)), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f11 / ((float) this.I)), 1.0f, 0.0f);
            za zaVar2 = this.f12758a;
            if (zaVar2 != null) {
                zaVar2.y(this.K);
                this.f12758a.a0(this.L);
            }
        } else if (this.H) {
            float f12 = abVar.h;
            float f13 = (float) abVar.f12415e;
            float f14 = this.L;
            float f15 = (float) this.I;
            long j17 = (f12 * f13) - (f14 * f15);
            float f16 = abVar.f12417g;
            float f17 = this.K;
            long j18 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j19 = this.J;
            long j20 = f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                ab abVar2 = this.h;
                float i3 = Utilities.i((((abVar2.h * ((float) abVar2.f12415e)) - ((float) j19)) - ((float) j20)) / ((float) this.I), 1.0f, min);
                this.L = i3;
                float i10 = Utilities.i(i3 - min, 1.0f, 0.0f);
                this.K = i10;
                ab abVar3 = this.h;
                float f18 = abVar3.h;
                float f19 = (float) abVar3.f12415e;
                float f20 = this.L;
                float f21 = (float) this.I;
                long j22 = (f18 * f19) - (f20 * f21);
                long j23 = (abVar3.f12417g * f19) - (i10 * f21);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.J = Utilities.k(this.J + j20, j13, j12);
                za zaVar3 = this.f12758a;
                if (zaVar3 != null) {
                    zaVar3.y(this.K);
                    this.f12758a.a0(this.L);
                }
            } else if (j21 < j18) {
                ab abVar4 = this.h;
                float i11 = Utilities.i((((abVar4.f12417g * ((float) abVar4.f12415e)) - ((float) j19)) - ((float) j20)) / ((float) this.I), 1.0f - min, 0.0f);
                this.K = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.L = i12;
                ab abVar5 = this.h;
                float f22 = abVar5.h;
                float f23 = (float) abVar5.f12415e;
                float f24 = (float) this.I;
                long j24 = (f22 * f23) - (i12 * f24);
                long j25 = (abVar5.f12417g * f23) - (this.K * f24);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.J = Utilities.k(this.J + j20, j11, j10);
                za zaVar4 = this.f12758a;
                if (zaVar4 != null) {
                    zaVar4.y(this.K);
                    this.f12758a.a0(this.L);
                }
            } else {
                this.J = j21;
            }
        } else {
            long j26 = this.J + f10;
            float f25 = (float) this.I;
            this.J = Utilities.k(j26, ((float) getBaseDuration()) - (this.L * f25), (-this.K) * f25);
        }
        invalidate();
        za zaVar5 = this.f12758a;
        if (zaVar5 != null) {
            zaVar5.K(this.J + (this.K * ((float) this.I)));
        }
        boolean z10 = this.f12788n1;
        if (!z10 && (zaVar = this.f12758a) != null) {
            zaVar.C(true);
            ab abVar6 = this.h;
            if (abVar6 != null) {
                long j27 = this.J + (this.K * ((float) this.I));
                float f26 = abVar6.h;
                float f27 = (float) abVar6.f12415e;
                k10 = Utilities.k(j27, f26 * f27, abVar6.f12417g * f27);
            } else {
                float f28 = this.K;
                k10 = Utilities.k(f28 * ((float) j15), this.I, 0L);
            }
            if (this.h != null && Math.abs(this.f12769e - k10) > 400) {
                this.f12768d1 = this.f12769e;
                this.f12766c1.e(true, 1.0f);
            }
            za zaVar6 = this.f12758a;
            this.f12769e = k10;
            zaVar6.n(k10, false);
        } else if (z10 || this.f12800s1) {
            ab abVar7 = this.h;
            if (abVar7 != null) {
                long j28 = this.J + (this.K * ((float) this.I));
                float f29 = abVar7.h;
                float f30 = (float) abVar7.f12415e;
                this.f12769e = Utilities.k(j28, f29 * f30, abVar7.f12417g * f30);
            } else {
                float f31 = this.K;
                this.f12769e = Utilities.k(f31 * ((float) j14), this.I, 0L);
            }
            za zaVar7 = this.f12758a;
            if (zaVar7 != null) {
                zaVar7.n(this.f12769e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ab abVar = this.h;
        long j10 = abVar.f12415e;
        this.f12772f = Utilities.k((((abVar.h + abVar.f12417g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
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
        long j10;
        ab abVar;
        ab abVar2 = this.h;
        ArrayList arrayList = this.f12798s;
        if (abVar2 != null || this.O || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f12817z1) - this.f12815y1) / this.f12806v1;
            ab abVar3 = this.f12807w;
            if (abVar3 != null) {
                j10 = (abVar3.f12417g * ((float) abVar3.f12415e)) + ((float) abVar3.f12416f);
            } else {
                j10 = 0;
            }
            float f12 = f11 * ((float) min);
            if (abVar3 == null) {
                if (this.h == null) {
                    j10 = this.R;
                } else {
                    j10 = 0;
                }
            }
            long i3 = Utilities.i((f12 - ((float) j10)) + ((float) this.f12772f), (float) getBaseDuration(), 0.0f);
            ab abVar4 = this.h;
            if (abVar4 != null) {
                float f13 = ((float) i3) / ((float) abVar4.f12415e);
                if (f13 < abVar4.f12417g || f13 > abVar4.h) {
                    return false;
                }
            }
            if (this.f12807w == null || (i3 >= 0 && i3 < (abVar.h - abVar.f12417g) * ((float) abVar.f12415e))) {
                if (this.O && abVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) i3) / ((float) this.S);
                    if (f14 < this.T || f14 > this.U) {
                        return false;
                    }
                }
                this.f12769e = i3;
                invalidate();
                za zaVar = this.f12758a;
                if (zaVar != null) {
                    zaVar.n(i3, z10);
                }
                ci.e3 e3Var = this.f12771e1;
                if (e3Var != null) {
                    org.telegram.messenger.g0.r(e3Var);
                    this.f12771e1 = null;
                }
                if (z10) {
                    ci.e3 e3Var2 = new ci.e3(this, i3, 9);
                    this.f12771e1 = e3Var2;
                    org.telegram.messenger.g0.i3(e3Var2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j10, long j11, float f10, float f11, float f12, boolean z10) {
        boolean z11;
        long j12;
        boolean z12;
        boolean z13;
        ab abVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        db dbVar = this.N;
        Long l10 = null;
        if (dbVar != null) {
            dbVar.b();
            this.N = null;
        }
        long j13 = this.I;
        if (str != null) {
            this.G = str;
            this.I = j10;
            this.J = j11 - (((float) j10) * f10);
            this.K = f10;
            this.L = f11;
            this.M = f12;
            if (getMeasuredWidth() <= 0 || this.N != null || ((abVar = this.h) != null && abVar.f12415e < 1)) {
                z11 = false;
                j12 = j13;
                z12 = true;
            } else {
                String str2 = this.G;
                int i3 = this.f12809w1;
                int i10 = this.f12817z1;
                int i11 = (i3 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j14 = this.I;
                if (j14 > 2) {
                    l10 = Long.valueOf(j14);
                }
                ab abVar2 = this.h;
                if (abVar2 != null) {
                    maxScrollDuration = abVar2.f12415e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z11 = false;
                z12 = true;
                this.N = new db(this, false, str2, i11, L, l10, maxScrollDuration, -1L, -1L, new wa(this, 0));
            }
            if (this.h == null) {
                this.Q = z11;
                this.H = z12;
            }
        } else {
            z11 = false;
            j12 = j13;
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
        if (j12 != j10 && this.h == null && this.f12762b0 != null) {
            this.f12759a0 = z12;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(((float) j10) / ((float) this.S), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f12770e0.f(this.H, z12);
            this.f12775g0.f(this.Q, z12);
            this.f12767d0.f(this.F, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f10) {
        String str2;
        ab abVar = this.h;
        if (abVar == null) {
            str2 = null;
        } else {
            str2 = abVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        ab abVar2 = this.h;
        if (abVar2 != null) {
            db dbVar = abVar2.f12414c;
            if (dbVar != null) {
                dbVar.b();
                this.h.f12414c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f12772f = 0L;
            ab abVar3 = new ab(this);
            this.h = abVar3;
            abVar3.f12413b = z10;
            abVar3.d = str;
            abVar3.f12415e = j10;
            abVar3.f12418i = f10;
            ab.a(abVar3, false);
        } else {
            this.h = null;
            this.f12772f = 0L;
        }
        if (!this.F) {
            this.H = false;
        }
        this.f12769e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.M0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.Q0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        this.f12817z1 = L;
        int L2 = org.telegram.messenger.g0.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        int size = View.MeasureSpec.getSize(i3);
        this.f12809w1 = size;
        int L3 = org.telegram.messenger.g0.L(388);
        this.f12812x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        this.f12815y1 = L4;
        this.f12806v1 = (this.f12809w1 - (L4 * 2)) - (this.f12817z1 * 2);
        ab abVar = this.h;
        if (abVar != null && abVar.d != null && abVar.f12414c == null) {
            ab.a(abVar, false);
        }
        ArrayList arrayList = this.f12798s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ab abVar2 = (ab) obj;
                if (abVar2.d != null && abVar2.f12414c == null) {
                    ab.a(abVar2, false);
                    ab.b(abVar2);
                }
            }
        }
        if (this.P != null && this.f12762b0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: gi.fb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f12762b0 == null || this.f12759a0) {
                this.f12762b0 = new ya(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.f12777h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        ab abVar;
        a3.u uVar = new a3.u(19);
        ArrayList arrayList = this.f12798s;
        Collections.sort(arrayList, uVar);
        if (arrayList.isEmpty()) {
            abVar = null;
        } else {
            abVar = (ab) arrayList.get(0);
        }
        this.f12807w = abVar;
        if (abVar != null) {
            long j10 = abVar.f12416f;
        }
    }

    public void setCollage(ArrayList<f7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        db dbVar;
        int i3 = 0;
        while (true) {
            arrayList2 = this.f12798s;
            if (i3 >= arrayList2.size()) {
                break;
            }
            ab abVar = (ab) arrayList2.get(i3);
            if (abVar != null && (dbVar = abVar.f12414c) != null) {
                dbVar.b();
            }
            i3++;
        }
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            arrayList3 = this.f12795r;
            if (i10 >= arrayList3.size()) {
                break;
            }
            ya yaVar = (ya) arrayList3.get(i10);
            if (yaVar != null) {
                yaVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.f12779i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                f7 f7Var = arrayList.get(i11);
                if (f7Var.K) {
                    ab abVar2 = new ab(this);
                    abVar2.f12412a = i11;
                    abVar2.f12413b = false;
                    abVar2.d = f7Var.L.getAbsolutePath();
                    abVar2.f12415e = f7Var.f12720h0;
                    abVar2.f12416f = f7Var.X;
                    abVar2.f12418i = f7Var.P;
                    abVar2.f12417g = f7Var.V;
                    abVar2.h = f7Var.W;
                    ab.a(abVar2, false);
                    ab.b(abVar2);
                    arrayList2.add(abVar2);
                }
            }
        }
        q();
        this.f12786n = 0;
    }

    public void setDelegate(za zaVar) {
        this.f12758a = zaVar;
    }

    public void setMaxCount(int i3) {
        this.f12765c0 = i3;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f12761b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: gi.fb.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f10) {
        ab abVar = this.h;
        if (abVar == null) {
            return;
        }
        abVar.f12417g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        ab abVar = this.h;
        if (abVar == null) {
            return;
        }
        abVar.h = f10;
        invalidate();
    }
}
