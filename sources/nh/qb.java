package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.zz0;
public final class qb extends View {
    public boolean A;
    public final TextPaint A0;
    public String B;
    public final RectF B0;
    public boolean C;
    public final Path C0;
    public long D;
    public final Paint D0;
    public long E;
    public final pb E0;
    public float F;
    public final Paint F0;
    public float G;
    public final Drawable G0;
    public float H;
    public final TextPaint H0;
    public ob I;
    public StaticLayout I0;
    public boolean J;
    public float J0;
    public String K;
    public float K0;
    public boolean L;
    public final TextPaint L0;
    public long M;
    public StaticLayout M0;
    public long N;
    public float N0;
    public float O;
    public float O0;
    public float P;
    public final LinearGradient P0;
    public boolean Q;
    public final Matrix Q0;
    public float R;
    public final Paint R0;
    public boolean S;
    public final lm0 S0;
    public jb T;
    public boolean T0;
    public int U;
    public final eg.k0 U0;
    public final org.telegram.ui.Components.d6 V;
    public long V0;
    public final org.telegram.ui.Components.d6 W;
    public long W0;
    public final org.telegram.ui.Components.d6 X0;
    public long Y0;
    public eg.z1 Z0;
    public kb f18413a;
    public final org.telegram.ui.Components.d6 f18414a0;
    public long f18415a1;
    public Runnable f18416b;
    public final org.telegram.ui.Components.d6 f18417b0;
    public long f18418b1;
    public int f18419c;
    public final org.telegram.ui.Components.d6 f18420c0;
    public float f18421c1;
    public Runnable d;
    public final org.telegram.ui.Components.d6 f18422d0;
    public int f18423d1;
    public long f18424e;
    public final org.telegram.ui.Components.d6 f18425e0;
    public int f18426e1;
    public long f18427f;
    public boolean f18428f0;
    public int f18429f1;
    public final org.telegram.ui.Components.ga f18430g0;
    public int f18431g1;
    public lb h;
    public final org.telegram.ui.Components.ka f18432h0;
    public boolean f18433h1;
    public final org.telegram.ui.Components.ka f18434i0;
    public boolean f18435i1;
    public final org.telegram.ui.Components.ka f18436j0;
    public float f18437j1;
    public final RectF f18438k0;
    public boolean f18439k1;
    public final Path f18440l0;
    public VelocityTracker l1;
    public final zz0 m0;
    public boolean f18441m1;
    public int f18442n;
    public final Drawable f18443n0;
    public boolean f18444n1;
    public final pb f18445o0;
    public int f18446o1;
    public final RectF f18447p0;
    public final float[] f18448p1;
    public final Paint f18449q0;
    public int f18450q1;
    public final ArrayList f18451r;
    public final Path f18452r0;
    public int f18453r1;
    public final ArrayList f18454s;
    public final Path f18455s0;
    public int f18456s1;
    public final RectF f18457t0;
    public int f18458t1;
    public final Path f18459u0;
    public int f18460u1;
    public lb v;
    public final Paint f18461v0;
    public int f18462v1;
    public final Paint f18463w;
    public final Paint f18464w0;
    public final Path f18465x;
    public final Paint f18466x0;
    public final Path f18467y;
    public final Paint f18468y0;
    public final Paint f18469z0;

    public qb(Context context, ViewGroup viewGroup, ta taVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar) {
        super(context);
        this.f18442n = 0;
        this.f18451r = new ArrayList();
        this.f18454s = new ArrayList();
        this.f18463w = new Paint(3);
        this.f18465x = new Path();
        this.f18467y = new Path();
        this.U = 1;
        jr jrVar = jr.h;
        this.V = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.W = new org.telegram.ui.Components.d6(this, 360L, jrVar);
        this.f18414a0 = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.f18417b0 = new org.telegram.ui.Components.d6(this, 360L, jrVar);
        this.f18420c0 = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.f18422d0 = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.f18425e0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.f18428f0 = true;
        this.f18438k0 = new RectF();
        this.f18440l0 = new Path();
        this.f18445o0 = new pb();
        this.f18447p0 = new RectF();
        this.f18449q0 = new Paint(3);
        this.f18452r0 = new Path();
        this.f18455s0 = new Path();
        this.f18457t0 = new RectF();
        this.f18459u0 = new Path();
        Paint paint = new Paint(1);
        this.f18461v0 = paint;
        Paint paint2 = new Paint(1);
        this.f18464w0 = paint2;
        Paint paint3 = new Paint(1);
        this.f18466x0 = paint3;
        Paint paint4 = new Paint(1);
        this.f18468y0 = paint4;
        Paint paint5 = new Paint(1);
        this.f18469z0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.A0 = textPaint;
        this.B0 = new RectF();
        this.C0 = new Path();
        Paint paint6 = new Paint(1);
        this.D0 = paint6;
        this.E0 = new pb();
        Paint paint7 = new Paint(1);
        this.F0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.H0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.L0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.P0 = linearGradient;
        this.Q0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.R0 = paint8;
        this.S0 = new lm0(getContext(), null);
        this.V0 = -1L;
        this.W0 = -1L;
        this.X0 = new org.telegram.ui.Components.d6(0.0f, this, 0L, 340L, jrVar);
        this.Y0 = -1L;
        this.f18423d1 = -1;
        this.f18426e1 = -1;
        this.f18429f1 = -1;
        this.f18431g1 = -1;
        this.f18437j1 = 1.0f;
        this.f18441m1 = true;
        this.f18444n1 = false;
        this.f18448p1 = new float[8];
        paint7.setColor(Integer.MAX_VALUE);
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(1.0f), 436207616);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(2.0f), 1073741824);
        textPaint.setTypeface(AndroidUtilities.bold());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.m0 = new zz0(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f18443n0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.G0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f18430g0 = gaVar;
        this.f18432h0 = new org.telegram.ui.Components.ka(gaVar, this, 0, false);
        this.f18434i0 = new org.telegram.ui.Components.ka(gaVar, this, 3, false);
        this.f18436j0 = new org.telegram.ui.Components.ka(gaVar, this, 4, false);
        this.U0 = new eg.k0(this, viewGroup, c6Var, gaVar, taVar, 18);
    }

    public static void a(final qb qbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar, View view) {
        int i10;
        ArrayList arrayList = qbVar.f18454s;
        int i11 = qbVar.f18429f1;
        try {
            if (i11 == 2 && qbVar.J) {
                i7 i7Var = new i7(qbVar.getContext(), 0);
                i7Var.f17894b = 0.0f;
                i7Var.f17895c = 1.5f;
                i7Var.d(qbVar.R);
                i7Var.h = new Utilities.Callback(qbVar) {
                    public final qb f17913b;

                    {
                        this.f17913b = qbVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f9 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f9.floatValue();
                                qb qbVar2 = this.f17913b;
                                qbVar2.R = floatValue;
                                kb kbVar = qbVar2.f18413a;
                                if (kbVar != null) {
                                    kbVar.D(f9.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f9.floatValue();
                                qb qbVar3 = this.f17913b;
                                qbVar3.H = floatValue2;
                                kb kbVar2 = qbVar3.f18413a;
                                if (kbVar2 != null) {
                                    kbVar2.x(f9.floatValue());
                                    return;
                                }
                                return;
                            default:
                                qb qbVar4 = this.f17913b;
                                qbVar4.h.f18063i = f9.floatValue();
                                kb kbVar3 = qbVar4.f18413a;
                                if (kbVar3 != null) {
                                    kbVar3.H0(f9.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(qbVar.getBaseDuration(), qbVar.getMaxScrollDuration());
                int i12 = qbVar.f18453r1;
                int i13 = qbVar.f18460u1;
                int i14 = qbVar.f18458t1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(qbVar.P, 1.0f, qbVar.f18417b0.f27666c) * ((float) qbVar.N)) + ((float) (qbVar.M - qbVar.f18427f))) / ((float) min)) * qbVar.f18450q1) + i13 + i14);
                j70 F = j70.F(viewGroup, c6Var, qbVar);
                F.q(i7Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new hb(qbVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(qbVar.f18453r1 - min2)) + AndroidUtilities.dp(18.0f), qbVar.B0.top);
                F.Z();
                F.R(gaVar, -view.getX(), -view.getY());
                qbVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && qbVar.A) {
                i7 i7Var2 = new i7(qbVar.getContext(), 0);
                i7Var2.f17894b = 0.0f;
                i7Var2.f17895c = 1.5f;
                i7Var2.d(qbVar.H);
                i7Var2.h = new Utilities.Callback(qbVar) {
                    public final qb f17913b;

                    {
                        this.f17913b = qbVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f9 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f9.floatValue();
                                qb qbVar2 = this.f17913b;
                                qbVar2.R = floatValue;
                                kb kbVar = qbVar2.f18413a;
                                if (kbVar != null) {
                                    kbVar.D(f9.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f9.floatValue();
                                qb qbVar3 = this.f17913b;
                                qbVar3.H = floatValue2;
                                kb kbVar2 = qbVar3.f18413a;
                                if (kbVar2 != null) {
                                    kbVar2.x(f9.floatValue());
                                    return;
                                }
                                return;
                            default:
                                qb qbVar4 = this.f17913b;
                                qbVar4.h.f18063i = f9.floatValue();
                                kb kbVar3 = qbVar4.f18413a;
                                if (kbVar3 != null) {
                                    kbVar3.H0(f9.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(qbVar.getBaseDuration(), qbVar.getMaxScrollDuration());
                int i15 = qbVar.f18453r1;
                int i16 = qbVar.f18460u1;
                int i17 = qbVar.f18458t1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(qbVar.G, 1.0f, qbVar.W.f27666c) * ((float) qbVar.D)) + ((float) (qbVar.E - qbVar.f18427f))) / ((float) min3)) * qbVar.f18450q1) + i16 + i17);
                j70 F2 = j70.F(viewGroup, c6Var, qbVar);
                F2.q(i7Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new hb(qbVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(qbVar.f18453r1 - min4)) + AndroidUtilities.dp(18.0f), qbVar.f18457t0.top);
                F2.Z();
                F2.R(gaVar, -view.getX(), -view.getY());
                qbVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && qbVar.h != null) {
                i7 i7Var3 = new i7(qbVar.getContext(), 0);
                i7Var3.f17894b = 0.0f;
                i7Var3.f17895c = 1.5f;
                i7Var3.d(qbVar.h.f18063i);
                i7Var3.h = new Utilities.Callback(qbVar) {
                    public final qb f17913b;

                    {
                        this.f17913b = qbVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f9 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f9.floatValue();
                                qb qbVar2 = this.f17913b;
                                qbVar2.R = floatValue;
                                kb kbVar = qbVar2.f18413a;
                                if (kbVar != null) {
                                    kbVar.D(f9.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f9.floatValue();
                                qb qbVar3 = this.f17913b;
                                qbVar3.H = floatValue2;
                                kb kbVar2 = qbVar3.f18413a;
                                if (kbVar2 != null) {
                                    kbVar2.x(f9.floatValue());
                                    return;
                                }
                                return;
                            default:
                                qb qbVar4 = this.f17913b;
                                qbVar4.h.f18063i = f9.floatValue();
                                kb kbVar3 = qbVar4.f18413a;
                                if (kbVar3 != null) {
                                    kbVar3.H0(f9.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                j70 F3 = j70.F(viewGroup, c6Var, qbVar);
                F3.q(i7Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), qbVar.f18447p0.top);
                F3.Z();
                F3.R(gaVar, -view.getX(), -view.getY());
                qbVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = qbVar.f18431g1) >= 0 && i10 < arrayList.size()) {
                lb lbVar = (lb) arrayList.get(qbVar.f18431g1);
                i7 i7Var4 = new i7(qbVar.getContext(), 0);
                i7Var4.f17894b = 0.0f;
                i7Var4.f17895c = 1.5f;
                i7Var4.d(lbVar.f18063i);
                i7Var4.h = new ih.b1(16, qbVar, lbVar);
                j70 F4 = j70.F(viewGroup, c6Var, qbVar);
                F4.q(i7Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), lbVar.f18064j.top);
                F4.Z();
                F4.R(gaVar, -view.getX(), -view.getY());
                qbVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f18417b0.e(this.L));
    }

    public long getBaseDuration() {
        lb lbVar = this.h;
        if (lbVar != null) {
            return Math.max(1L, lbVar.f18060e);
        }
        lb lbVar2 = this.v;
        if (lbVar2 != null) {
            return Math.max(1L, lbVar2.f18060e);
        }
        if (this.A) {
            return Math.max(1L, this.D);
        }
        return Math.max(1L, this.N);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f18454s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f9 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f9 > 0.0f) {
                f9 += AndroidUtilities.dp(4.0f);
            }
            f9 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((lb) arrayList.get(i10)).f18065k.f27666c);
        }
        return f9;
    }

    private float getRoundHeight() {
        if (!this.A) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.W.e(this.C));
    }

    private float getVideoHeight() {
        lb lbVar = this.h;
        if (lbVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), lbVar.f18065k.f27666c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: nh.qb.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        lm0 lm0Var = this.S0;
        if (lm0Var.b()) {
            int i10 = lm0Var.f30388j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f18441m1) {
                this.f18427f = Math.max(0.0f, (((i10 - this.f18460u1) - this.f18458t1) / this.f18450q1) * ((float) min));
            } else if (!this.L) {
                lm0Var.a();
                return;
            } else {
                int i11 = this.f18460u1;
                int i12 = this.f18458t1;
                float f9 = this.f18450q1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f9) * f10) - ((((this.f18446o1 - i11) - i12) / f9) * f10));
            }
            invalidate();
            this.f18446o1 = i10;
        } else if (this.f18444n1) {
            this.f18444n1 = false;
            kb kbVar = this.f18413a;
            if (kbVar != null) {
                kbVar.s0(false);
            }
        }
    }

    public final void d(Canvas canvas, float f9, float f10, long j10, float f11) {
        long j11;
        float f12;
        if (this.T0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = (float) Utilities.clamp(j10, getBaseDuration(), 0L);
        lb lbVar = this.v;
        if (lbVar != null) {
            f12 = (lbVar.f18062g * ((float) lbVar.f18060e)) + ((float) lbVar.f18061f);
        } else {
            if (this.h == null) {
                j11 = this.M;
            } else {
                j11 = 0;
            }
            f12 = (float) j11;
        }
        float f13 = (this.f18450q1 * (((clamp + f12) - ((float) this.f18427f)) / ((float) min))) + this.f18460u1 + this.f18458t1;
        float f14 = (1.0f - f11) * (((f10 - f9) / 2.0f) / 2.0f);
        float f15 = f9 + f14;
        float f16 = f10 - f14;
        Paint paint = this.f18468y0;
        paint.setAlpha((int) (38.0f * f11));
        int i10 = (int) (f11 * 255.0f);
        Paint paint2 = this.f18469z0;
        paint2.setAlpha(i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f13 - AndroidUtilities.dpf2(1.5f), f15, AndroidUtilities.dpf2(1.5f) + f13, f16);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        rectF.set(f13 - AndroidUtilities.dpf2(1.5f), f15, AndroidUtilities.dpf2(1.5f) + f13, f16);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: nh.qb.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, float f9, float f10, float f11, float f12, float f13) {
        float f14;
        Paint paint2;
        float f15;
        float f16;
        float f17;
        if (f13 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        float f18 = 10.0f;
        rectF.set(f11 - AndroidUtilities.dp(10.0f), f9, AndroidUtilities.dp(10.0f) + f12, f10);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f18453r1, this.f18456s1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f18461v0;
        paint3.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        if (this.T0) {
            f14 = 2.5f;
        } else {
            f14 = 10.0f;
        }
        rectF.inset(AndroidUtilities.dp(f14), AndroidUtilities.dp(2.0f));
        boolean z10 = this.T0;
        Paint paint4 = this.f18464w0;
        if (z10) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint5 = this.f18466x0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i10);
        if (this.T0) {
            f15 = 2.0f;
        } else {
            f15 = 10.0f;
        }
        float a2 = org.telegram.messenger.x3.a(AndroidUtilities.dp(f15), dp, 2.0f, f11);
        float f19 = f9 + f10;
        float f20 = (f19 - dp2) / 2.0f;
        if (this.T0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float f21 = (f19 + dp2) / 2.0f;
        rectF.set(a2, f20, f11 - ((AndroidUtilities.dp(f16) + dp) / 2.0f), f21);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null && !this.T0) {
                paint5.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            }
        }
        if (this.T0) {
            f17 = 2.5f;
        } else {
            f17 = 10.0f;
        }
        float A = com.google.android.recaptcha.internal.a.A(AndroidUtilities.dp(f17), dp, 2.0f, f12);
        if (this.T0) {
            f18 = 2.5f;
        }
        rectF.set(A, f20, j7.l1.c(AndroidUtilities.dp(f18), dp, 2.0f, f12), f21);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.U * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f9;
        float collageHeight;
        float f10;
        float f11 = this.f18462v1;
        float f12 = 0.0f;
        if (this.h != null) {
            f9 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f9 = 0.0f;
        }
        float f13 = f11 + f9;
        if (this.f18454s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + AndroidUtilities.dp(4.0f);
        }
        float f14 = f13 + collageHeight;
        if (this.A) {
            f10 = getRoundHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f15 = f14 + f10;
        if (this.J) {
            f12 = AndroidUtilities.dp(4.0f) + getAudioHeight();
        }
        return (int) (f15 + f12 + this.f18462v1);
    }

    public int getMaxCount() {
        return this.U;
    }

    public long getMaxScrollDuration() {
        if (this.f18454s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f18462v1 + this.f18462v1, getContentHeight(), this.f18425e0.f27666c);
    }

    public final void h(float f9) {
        float f10;
        long j10;
        float f11;
        long j11;
        float f12;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        kb kbVar;
        long j17;
        long clamp;
        lb lbVar = this.h;
        if (lbVar == null && !this.A) {
            long j18 = this.M;
            long clamp2 = Utilities.clamp(j18 + f9, 0L, -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.M = clamp2;
            float f13 = (float) (clamp2 - j18);
            this.O = Utilities.clamp(this.O - (f13 / ((float) this.N)), 1.0f, 0.0f);
            this.P = Utilities.clamp(this.P - (f13 / ((float) this.N)), 1.0f, 0.0f);
            kb kbVar2 = this.f18413a;
            if (kbVar2 != null) {
                kbVar2.r1(this.O);
                this.f18413a.j1(this.P);
            }
        } else if (this.L) {
            if (lbVar != null) {
                f10 = lbVar.f18062g;
                j10 = lbVar.f18060e;
            } else {
                f10 = this.F;
                j10 = this.D;
            }
            float f14 = f10 * ((float) j10);
            if (lbVar != null) {
                f11 = lbVar.h;
                j11 = lbVar.f18060e;
            } else {
                f11 = this.G;
                j11 = this.D;
            }
            float f15 = f11 * ((float) j11);
            if (lbVar != null) {
                f12 = (lbVar.h - lbVar.f18062g) * ((float) lbVar.f18060e);
            } else {
                f12 = ((float) this.D) * (this.G - this.F);
            }
            float f16 = this.P;
            float f17 = (float) this.N;
            float f18 = this.O;
            long j19 = f14 - (f18 * f17);
            float min = Math.min(f16 - f18, f12 / f17);
            long j20 = this.M;
            long j21 = f9;
            long j22 = j20 + j21;
            if (j22 > f15 - (f16 * f17)) {
                float clamp3 = Utilities.clamp(((f15 - ((float) j20)) - ((float) j21)) / ((float) this.N), 1.0f, min);
                this.P = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.O = clamp4;
                float f19 = this.P;
                float f20 = (float) this.N;
                long j23 = f15 - (f19 * f20);
                long j24 = f14 - (clamp4 * f20);
                if (j23 < j24) {
                    j15 = j24;
                    j14 = j23;
                } else {
                    j14 = j24;
                    j15 = j23;
                }
                this.M = Utilities.clamp(this.M + j21, j15, j14);
                kb kbVar3 = this.f18413a;
                if (kbVar3 != null) {
                    kbVar3.r1(this.O);
                    this.f18413a.j1(this.P);
                }
            } else if (j22 < j19) {
                float clamp5 = Utilities.clamp(((f14 - ((float) j20)) - ((float) j21)) / ((float) this.N), 1.0f - min, 0.0f);
                this.O = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.P = clamp6;
                float f21 = (float) this.N;
                long j25 = f15 - (clamp6 * f21);
                long j26 = f14 - (this.O * f21);
                if (j25 < j26) {
                    j13 = j26;
                    j12 = j25;
                } else {
                    j12 = j26;
                    j13 = j25;
                }
                this.M = Utilities.clamp(this.M + j21, j13, j12);
                kb kbVar4 = this.f18413a;
                if (kbVar4 != null) {
                    kbVar4.r1(this.O);
                    this.f18413a.j1(this.P);
                }
            } else {
                this.M = j22;
            }
        } else {
            long j27 = this.M + f9;
            float f22 = (float) this.N;
            this.M = Utilities.clamp(j27, ((float) getBaseDuration()) - (this.P * f22), (-this.O) * f22);
        }
        invalidate();
        kb kbVar5 = this.f18413a;
        if (kbVar5 != null) {
            kbVar5.D1(this.M + (this.O * ((float) this.N)));
        }
        boolean z10 = this.f18435i1;
        if (!z10 && (kbVar = this.f18413a) != null) {
            kbVar.s0(true);
            lb lbVar2 = this.h;
            if (lbVar2 != null) {
                long j28 = this.M + (this.O * ((float) this.N));
                float f23 = lbVar2.h;
                float f24 = (float) lbVar2.f18060e;
                clamp = Utilities.clamp(j28, f23 * f24, lbVar2.f18062g * f24);
            } else if (this.A) {
                long j29 = this.M + (this.O * ((float) this.N));
                float f25 = this.G;
                float f26 = (float) this.D;
                clamp = Utilities.clamp(j29, f25 * f26, this.F * f26);
            } else {
                float f27 = this.O;
                clamp = Utilities.clamp(f27 * ((float) j17), this.N, 0L);
            }
            if (this.h != null && Math.abs(this.f18424e - clamp) > 400) {
                this.Y0 = this.f18424e;
                this.X0.d(1.0f, true);
            }
            kb kbVar6 = this.f18413a;
            this.f18424e = clamp;
            kbVar6.I(clamp, false);
        } else if (z10 || this.f18444n1) {
            lb lbVar3 = this.h;
            if (lbVar3 != null) {
                long j30 = this.M + (this.O * ((float) this.N));
                float f28 = lbVar3.h;
                float f29 = (float) lbVar3.f18060e;
                this.f18424e = Utilities.clamp(j30, f28 * f29, lbVar3.f18062g * f29);
            } else if (this.A && lbVar3 != null) {
                long j31 = this.M + (this.O * ((float) this.N));
                float f30 = this.G;
                float f31 = (float) lbVar3.f18060e;
                this.f18424e = Utilities.clamp(j31, f30 * f31, this.F * f31);
            } else {
                float f32 = this.O;
                this.f18424e = Utilities.clamp(f32 * ((float) j16), this.N, 0L);
            }
            kb kbVar7 = this.f18413a;
            if (kbVar7 != null) {
                kbVar7.I(this.f18424e, false);
            }
        }
    }

    public final void i(lb lbVar, float f9) {
        long j10;
        kb kbVar;
        long j11;
        long clamp;
        long j12;
        long j13;
        long j14;
        long j15;
        if (lbVar != null) {
            lb lbVar2 = this.v;
            if (lbVar2 != lbVar && lbVar2 != null) {
                if (this.f18442n == this.f18454s.indexOf(lbVar)) {
                    lb lbVar3 = this.v;
                    float f10 = (float) lbVar3.f18060e;
                    float f11 = lbVar.h;
                    float f12 = (float) lbVar.f18060e;
                    float f13 = lbVar.f18062g;
                    long j16 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((lbVar3.h - lbVar3.f18062g) * f10) / f12);
                    long j17 = lbVar.f18061f;
                    long j18 = f9;
                    long j19 = j17 + j18;
                    if (j19 > (f10 * 1.0f) - (f11 * f12)) {
                        lb lbVar4 = this.v;
                        float clamp2 = Utilities.clamp((((lbVar4.h * ((float) lbVar4.f18060e)) - ((float) j17)) - ((float) j18)) / ((float) lbVar.f18060e), 1.0f, min);
                        lbVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        lbVar.f18062g = clamp3;
                        lb lbVar5 = this.v;
                        float f14 = lbVar5.h;
                        float f15 = (float) lbVar5.f18060e;
                        float f16 = lbVar.h;
                        float f17 = (float) lbVar.f18060e;
                        long j20 = (f14 * f15) - (f16 * f17);
                        long j21 = (lbVar5.f18062g * f15) - (clamp3 * f17);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        lbVar.f18061f = Utilities.clamp(lbVar.f18061f + j18, j15, j14);
                        kb kbVar2 = this.f18413a;
                        if (kbVar2 != null) {
                            kbVar2.f1(lbVar.f18062g, lbVar.f18057a);
                            this.f18413a.w1(lbVar.h, lbVar.f18057a);
                        }
                    } else if (j19 < j16) {
                        lb lbVar6 = this.v;
                        float clamp4 = Utilities.clamp((((lbVar6.f18062g * ((float) lbVar6.f18060e)) - ((float) j17)) - ((float) j18)) / ((float) lbVar.f18060e), 1.0f - min, 0.0f);
                        lbVar.f18062g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        lbVar.h = clamp5;
                        lb lbVar7 = this.v;
                        float f18 = lbVar7.h;
                        float f19 = (float) lbVar7.f18060e;
                        float f20 = (float) lbVar.f18060e;
                        long j22 = (f18 * f19) - (clamp5 * f20);
                        long j23 = (lbVar7.f18062g * f19) - (lbVar.f18062g * f20);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        lbVar.f18061f = Utilities.clamp(lbVar.f18061f + j18, j13, j12);
                        kb kbVar3 = this.f18413a;
                        if (kbVar3 != null) {
                            kbVar3.f1(lbVar.f18062g, lbVar.f18057a);
                            this.f18413a.w1(lbVar.h, lbVar.f18057a);
                        }
                    } else {
                        lbVar.f18061f = j19;
                    }
                } else {
                    long j24 = lbVar.f18061f + f9;
                    float f21 = (float) lbVar.f18060e;
                    lbVar.f18061f = Utilities.clamp(j24, ((float) getBaseDuration()) - (lbVar.h * f21), (-lbVar.f18062g) * f21);
                }
            }
            invalidate();
            kb kbVar4 = this.f18413a;
            if (kbVar4 != null) {
                kbVar4.B1(lbVar.f18057a, lbVar.f18061f);
            }
            boolean z10 = this.f18435i1;
            if (!z10 && (kbVar = this.f18413a) != null) {
                kbVar.s0(true);
                lb lbVar8 = this.v;
                if (lbVar8 != lbVar && lbVar8 != null) {
                    long j25 = lbVar.f18061f + (lbVar.f18062g * ((float) lbVar.f18060e));
                    float f22 = lbVar8.h;
                    float f23 = (float) lbVar8.f18060e;
                    clamp = Utilities.clamp(j25, f22 * f23, lbVar8.f18062g * f23);
                } else {
                    float f24 = lbVar.f18062g;
                    clamp = Utilities.clamp(f24 * ((float) j11), lbVar.f18060e, 0L);
                }
                lb lbVar9 = this.v;
                if (lbVar9 != lbVar && lbVar9 != null && Math.abs(this.f18424e - clamp) > 400) {
                    this.Y0 = this.f18424e;
                    this.X0.d(1.0f, true);
                }
                kb kbVar5 = this.f18413a;
                this.f18424e = clamp;
                kbVar5.I(clamp, false);
            } else if (z10 || this.f18444n1) {
                lb lbVar10 = this.v;
                if (lbVar10 != lbVar && lbVar10 != null) {
                    long j26 = lbVar.f18061f + (lbVar.f18062g * ((float) lbVar.f18060e));
                    float f25 = lbVar10.h;
                    float f26 = (float) lbVar10.f18060e;
                    this.f18424e = Utilities.clamp(j26, f25 * f26, lbVar10.f18062g * f26);
                } else {
                    float f27 = lbVar.f18062g;
                    this.f18424e = Utilities.clamp(f27 * ((float) j10), lbVar.f18060e, 0L);
                }
                kb kbVar6 = this.f18413a;
                if (kbVar6 != null) {
                    kbVar6.I(this.f18424e, false);
                }
            }
        }
    }

    public final void j(float f9) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        kb kbVar;
        long j15;
        long clamp;
        lb lbVar = this.h;
        if (lbVar == null) {
            long j16 = this.E;
            long clamp2 = Utilities.clamp(j16 + f9, 0L, -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.E = clamp2;
            float f10 = (float) (clamp2 - j16);
            this.F = Utilities.clamp(this.F - (f10 / ((float) this.D)), 1.0f, 0.0f);
            this.G = Utilities.clamp(this.G - (f10 / ((float) this.D)), 1.0f, 0.0f);
            kb kbVar2 = this.f18413a;
            if (kbVar2 != null) {
                kbVar2.i0(this.F);
                this.f18413a.z1(this.G);
            }
        } else if (this.C) {
            float f11 = lbVar.h;
            float f12 = (float) lbVar.f18060e;
            float f13 = this.G;
            float f14 = (float) this.D;
            long j17 = (f11 * f12) - (f13 * f14);
            float f15 = lbVar.f18062g;
            float f16 = this.F;
            long j18 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j19 = this.E;
            long j20 = f9;
            long j21 = j19 + j20;
            if (j21 > j17) {
                lb lbVar2 = this.h;
                float clamp3 = Utilities.clamp((((lbVar2.h * ((float) lbVar2.f18060e)) - ((float) j19)) - ((float) j20)) / ((float) this.D), 1.0f, min);
                this.G = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.F = clamp4;
                lb lbVar3 = this.h;
                float f17 = lbVar3.h;
                float f18 = (float) lbVar3.f18060e;
                float f19 = this.G;
                float f20 = (float) this.D;
                long j22 = (f17 * f18) - (f19 * f20);
                long j23 = (lbVar3.f18062g * f18) - (clamp4 * f20);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.E = Utilities.clamp(this.E + j20, j13, j12);
                kb kbVar3 = this.f18413a;
                if (kbVar3 != null) {
                    kbVar3.i0(this.F);
                    this.f18413a.z1(this.G);
                }
            } else if (j21 < j18) {
                lb lbVar4 = this.h;
                float clamp5 = Utilities.clamp((((lbVar4.f18062g * ((float) lbVar4.f18060e)) - ((float) j19)) - ((float) j20)) / ((float) this.D), 1.0f - min, 0.0f);
                this.F = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.G = clamp6;
                lb lbVar5 = this.h;
                float f21 = lbVar5.h;
                float f22 = (float) lbVar5.f18060e;
                float f23 = (float) this.D;
                long j24 = (f21 * f22) - (clamp6 * f23);
                long j25 = (lbVar5.f18062g * f22) - (this.F * f23);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.E = Utilities.clamp(this.E + j20, j11, j10);
                kb kbVar4 = this.f18413a;
                if (kbVar4 != null) {
                    kbVar4.i0(this.F);
                    this.f18413a.z1(this.G);
                }
            } else {
                this.E = j21;
            }
        } else {
            long j26 = this.E + f9;
            float f24 = (float) this.D;
            this.E = Utilities.clamp(j26, ((float) getBaseDuration()) - (this.G * f24), (-this.F) * f24);
        }
        invalidate();
        kb kbVar5 = this.f18413a;
        if (kbVar5 != null) {
            kbVar5.b1(this.E + (this.F * ((float) this.D)));
        }
        boolean z10 = this.f18435i1;
        if (!z10 && (kbVar = this.f18413a) != null) {
            kbVar.s0(true);
            lb lbVar6 = this.h;
            if (lbVar6 != null) {
                long j27 = this.E + (this.F * ((float) this.D));
                float f25 = lbVar6.h;
                float f26 = (float) lbVar6.f18060e;
                clamp = Utilities.clamp(j27, f25 * f26, lbVar6.f18062g * f26);
            } else {
                float f27 = this.F;
                clamp = Utilities.clamp(f27 * ((float) j15), this.D, 0L);
            }
            if (this.h != null && Math.abs(this.f18424e - clamp) > 400) {
                this.Y0 = this.f18424e;
                this.X0.d(1.0f, true);
            }
            kb kbVar6 = this.f18413a;
            this.f18424e = clamp;
            kbVar6.I(clamp, false);
        } else if (z10 || this.f18444n1) {
            lb lbVar7 = this.h;
            if (lbVar7 != null) {
                long j28 = this.E + (this.F * ((float) this.D));
                float f28 = lbVar7.h;
                float f29 = (float) lbVar7.f18060e;
                this.f18424e = Utilities.clamp(j28, f28 * f29, lbVar7.f18062g * f29);
            } else {
                float f30 = this.F;
                this.f18424e = Utilities.clamp(f30 * ((float) j14), this.D, 0L);
            }
            kb kbVar7 = this.f18413a;
            if (kbVar7 != null) {
                kbVar7.I(this.f18424e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        lb lbVar = this.h;
        long j10 = lbVar.f18060e;
        this.f18427f = Utilities.clamp((((lbVar.h + lbVar.f18062g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        boolean z11 = true;
        if (z10 && this.A) {
            this.C = true;
            this.L = false;
        } else {
            this.C = false;
            this.L = (this.J && this.h == null) ? false : false;
        }
        invalidate();
    }

    public final boolean m(float f9, boolean z10) {
        long j10;
        lb lbVar;
        lb lbVar2 = this.h;
        ArrayList arrayList = this.f18454s;
        if (lbVar2 != null || this.J || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f9 - this.f18460u1) - this.f18458t1) / this.f18450q1;
            lb lbVar3 = this.v;
            if (lbVar3 != null) {
                j10 = (lbVar3.f18062g * ((float) lbVar3.f18060e)) + ((float) lbVar3.f18061f);
            } else {
                j10 = 0;
            }
            float f11 = f10 * ((float) min);
            if (lbVar3 == null) {
                if (this.h == null) {
                    j10 = this.M;
                } else {
                    j10 = 0;
                }
            }
            long clamp = Utilities.clamp((f11 - ((float) j10)) + ((float) this.f18427f), (float) getBaseDuration(), 0.0f);
            lb lbVar4 = this.h;
            if (lbVar4 != null) {
                float f12 = ((float) clamp) / ((float) lbVar4.f18060e);
                if (f12 < lbVar4.f18062g || f12 > lbVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (lbVar.h - lbVar.f18062g) * ((float) lbVar.f18060e))) {
                if (this.J && lbVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.N);
                    if (f13 < this.O || f13 > this.P) {
                        return false;
                    }
                }
                this.f18424e = clamp;
                invalidate();
                kb kbVar = this.f18413a;
                if (kbVar != null) {
                    kbVar.I(clamp, z10);
                }
                eg.z1 z1Var = this.Z0;
                if (z1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(z1Var);
                    this.Z0 = null;
                }
                if (z10) {
                    eg.z1 z1Var2 = new eg.z1(this, clamp, 11);
                    this.Z0 = z1Var2;
                    AndroidUtilities.runOnUIThread(z1Var2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j10, long j11, float f9, float f10, float f11, boolean z10) {
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        lb lbVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.B, str)) {
            return;
        }
        ob obVar = this.I;
        Long l10 = null;
        if (obVar != null) {
            obVar.b();
            this.I = null;
        }
        long j13 = this.D;
        if (str != null) {
            this.B = str;
            this.D = j10;
            this.E = j11 - (((float) j10) * f9);
            this.F = f9;
            this.G = f10;
            this.H = f11;
            if (getMeasuredWidth() <= 0 || this.I != null || ((lbVar = this.h) != null && lbVar.f18060e < 1)) {
                j12 = j13;
                z13 = false;
                z11 = true;
            } else {
                String str2 = this.B;
                int i10 = this.f18453r1;
                int i11 = this.f18460u1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.D;
                if (j14 > 2) {
                    l10 = Long.valueOf(j14);
                }
                lb lbVar2 = this.h;
                if (lbVar2 != null) {
                    maxScrollDuration = lbVar2.f18060e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z13 = false;
                z11 = true;
                this.I = new ob(this, false, str2, i12, dp, l10, maxScrollDuration, -1L, -1L, new hb(this, 0));
            }
            if (this.h == null) {
                this.L = z13;
                this.C = z11;
            }
        } else {
            j12 = j13;
            z11 = true;
            this.B = null;
            this.D = 1L;
            this.C = false;
        }
        if (this.B != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.A = z12;
        if (j12 != j10 && this.h == null && this.T != null) {
            this.S = z11;
            p();
        }
        if (this.J && this.A && this.h == null) {
            this.O = 0.0f;
            this.P = Utilities.clamp(((float) j10) / ((float) this.N), 1.0f, 0.0f);
        }
        if (!z10) {
            this.W.f(this.C, z11);
            this.f18417b0.f(this.L, z11);
            this.V.f(this.A, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f9) {
        String str2;
        lb lbVar = this.h;
        if (lbVar == null) {
            str2 = null;
        } else {
            str2 = lbVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        lb lbVar2 = this.h;
        if (lbVar2 != null) {
            ob obVar = lbVar2.f18059c;
            if (obVar != null) {
                obVar.b();
                this.h.f18059c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f18427f = 0L;
            lb lbVar3 = new lb(this);
            this.h = lbVar3;
            lbVar3.f18058b = z10;
            lbVar3.d = str;
            lbVar3.f18060e = j10;
            lbVar3.f18063i = f9;
            lb.a(lbVar3, false);
        } else {
            this.h = null;
            this.f18427f = 0L;
        }
        if (!this.A) {
            this.C = false;
        }
        this.f18424e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.H0.setTextSize(AndroidUtilities.dp(12.0f));
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f18460u1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f18462v1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f18453r1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f18456s1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f18458t1 = dp4;
        this.f18450q1 = (this.f18453r1 - (dp4 * 2)) - (this.f18460u1 * 2);
        lb lbVar = this.h;
        if (lbVar != null && lbVar.d != null && lbVar.f18059c == null) {
            lb.a(lbVar, false);
        }
        ArrayList arrayList = this.f18454s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                lb lbVar2 = (lb) obj;
                if (lbVar2.d != null && lbVar2.f18059c == null) {
                    lb.a(lbVar2, false);
                    lb.b(lbVar2);
                }
            }
        }
        if (this.K != null && this.T == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: nh.qb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.T == null || this.S) {
                this.T = new jb(this, this.K, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.Q = false;
                this.f18420c0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        lb lbVar;
        lh.e4 e4Var = new lh.e4(3);
        ArrayList arrayList = this.f18454s;
        Collections.sort(arrayList, e4Var);
        if (arrayList.isEmpty()) {
            lbVar = null;
        } else {
            lbVar = (lb) arrayList.get(0);
        }
        this.v = lbVar;
        if (lbVar != null) {
            long j10 = lbVar.f18061f;
        }
    }

    public void setCollage(ArrayList<o7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ob obVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f18454s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            lb lbVar = (lb) arrayList2.get(i10);
            if (lbVar != null && (obVar = lbVar.f18059c) != null) {
                obVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f18451r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            jb jbVar = (jb) arrayList3.get(i11);
            if (jbVar != null) {
                jbVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f18422d0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                o7 o7Var = arrayList.get(i12);
                if (o7Var.K) {
                    lb lbVar2 = new lb(this);
                    lbVar2.f18057a = i12;
                    lbVar2.f18058b = false;
                    lbVar2.d = o7Var.L.getAbsolutePath();
                    lbVar2.f18060e = o7Var.f18272h0;
                    lbVar2.f18061f = o7Var.X;
                    lbVar2.f18063i = o7Var.P;
                    lbVar2.f18062g = o7Var.V;
                    lbVar2.h = o7Var.W;
                    lb.a(lbVar2, false);
                    lb.b(lbVar2);
                    arrayList2.add(lbVar2);
                }
            }
        }
        q();
        this.f18442n = 0;
    }

    public void setDelegate(kb kbVar) {
        this.f18413a = kbVar;
    }

    public void setMaxCount(int i10) {
        this.U = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f18416b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: nh.qb.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f9) {
        lb lbVar = this.h;
        if (lbVar == null) {
            return;
        }
        lbVar.f18062g = f9;
        invalidate();
    }

    public void setVideoRight(float f9) {
        lb lbVar = this.h;
        if (lbVar == null) {
            return;
        }
        lbVar.h = f9;
        invalidate();
    }
}
