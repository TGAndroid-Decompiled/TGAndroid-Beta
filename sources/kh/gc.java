package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.yl0;
public final class gc extends View {
    public boolean A;
    public final TextPaint A0;
    public String B;
    public final RectF B0;
    public boolean C;
    public final Path C0;
    public long D;
    public final Paint D0;
    public long E;
    public final fc E0;
    public float F;
    public final Paint F0;
    public float G;
    public final Drawable G0;
    public float H;
    public final TextPaint H0;
    public ec I;
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
    public final yl0 S0;
    public zb T;
    public boolean T0;
    public int U;
    public final bg.o0 U0;
    public final org.telegram.ui.Components.y5 V;
    public long V0;
    public final org.telegram.ui.Components.y5 W;
    public long W0;
    public final org.telegram.ui.Components.y5 X0;
    public long Y0;
    public bg.i2 Z0;
    public ac f15326a;
    public final org.telegram.ui.Components.y5 f15327a0;
    public long f15328a1;
    public Runnable f15329b;
    public final org.telegram.ui.Components.y5 f15330b0;
    public long f15331b1;
    public int f15332c;
    public final org.telegram.ui.Components.y5 f15333c0;
    public float f15334c1;
    public Runnable d;
    public final org.telegram.ui.Components.y5 f15335d0;
    public int f15336d1;
    public long f15337e;
    public final org.telegram.ui.Components.y5 f15338e0;
    public int f15339e1;
    public long f15340f;
    public boolean f15341f0;
    public int f15342f1;
    public final org.telegram.ui.Components.ba f15343g0;
    public int f15344g1;
    public bc h;
    public final org.telegram.ui.Components.fa f15345h0;
    public boolean f15346h1;
    public final org.telegram.ui.Components.fa f15347i0;
    public boolean f15348i1;
    public final org.telegram.ui.Components.fa f15349j0;
    public float f15350j1;
    public final RectF f15351k0;
    public boolean f15352k1;
    public final Path f15353l0;
    public VelocityTracker l1;
    public final nz0 m0;
    public boolean f15354m1;
    public int f15355n;
    public final Drawable f15356n0;
    public boolean f15357n1;
    public final fc f15358o0;
    public int f15359o1;
    public final RectF f15360p0;
    public final float[] f15361p1;
    public final Paint f15362q0;
    public int f15363q1;
    public final ArrayList f15364r;
    public final Path f15365r0;
    public int f15366r1;
    public final ArrayList f15367s;
    public final Path f15368s0;
    public int f15369s1;
    public final RectF f15370t0;
    public int f15371t1;
    public final Path f15372u0;
    public int f15373u1;
    public bc v;
    public final Paint f15374v0;
    public int f15375v1;
    public final Paint f15376w;
    public final Paint f15377w0;
    public final Path f15378x;
    public final Paint f15379x0;
    public final Path f15380y;
    public final Paint f15381y0;
    public final Paint f15382z0;

    public gc(Context context, ViewGroup viewGroup, ib ibVar, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.f15355n = 0;
        this.f15364r = new ArrayList();
        this.f15367s = new ArrayList();
        this.f15376w = new Paint(3);
        this.f15378x = new Path();
        this.f15380y = new Path();
        this.U = 1;
        gr grVar = gr.h;
        this.V = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.W = new org.telegram.ui.Components.y5(this, 360L, grVar);
        this.f15327a0 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.f15330b0 = new org.telegram.ui.Components.y5(this, 360L, grVar);
        this.f15333c0 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.f15335d0 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.f15338e0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.f15341f0 = true;
        this.f15351k0 = new RectF();
        this.f15353l0 = new Path();
        this.f15358o0 = new fc();
        this.f15360p0 = new RectF();
        this.f15362q0 = new Paint(3);
        this.f15365r0 = new Path();
        this.f15368s0 = new Path();
        this.f15370t0 = new RectF();
        this.f15372u0 = new Path();
        Paint paint = new Paint(1);
        this.f15374v0 = paint;
        Paint paint2 = new Paint(1);
        this.f15377w0 = paint2;
        Paint paint3 = new Paint(1);
        this.f15379x0 = paint3;
        Paint paint4 = new Paint(1);
        this.f15381y0 = paint4;
        Paint paint5 = new Paint(1);
        this.f15382z0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.A0 = textPaint;
        this.B0 = new RectF();
        this.C0 = new Path();
        Paint paint6 = new Paint(1);
        this.D0 = paint6;
        this.E0 = new fc();
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
        this.S0 = new yl0(getContext(), null);
        this.V0 = -1L;
        this.W0 = -1L;
        this.X0 = new org.telegram.ui.Components.y5(0.0f, this, 0L, 340L, grVar);
        this.Y0 = -1L;
        this.f15336d1 = -1;
        this.f15339e1 = -1;
        this.f15342f1 = -1;
        this.f15344g1 = -1;
        this.f15350j1 = 1.0f;
        this.f15354m1 = true;
        this.f15357n1 = false;
        this.f15361p1 = new float[8];
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
        this.m0 = new nz0(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f15356n0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.G0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15343g0 = baVar;
        this.f15345h0 = new org.telegram.ui.Components.fa(baVar, this, 0, false);
        this.f15347i0 = new org.telegram.ui.Components.fa(baVar, this, 3, false);
        this.f15349j0 = new org.telegram.ui.Components.fa(baVar, this, 4, false);
        this.U0 = new bg.o0(this, viewGroup, b6Var, baVar, ibVar, 18);
    }

    public static void a(final gc gcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar, View view) {
        int i9;
        ArrayList arrayList = gcVar.f15367s;
        int i10 = gcVar.f15342f1;
        try {
            if (i10 == 2 && gcVar.J) {
                u7 u7Var = new u7(gcVar.getContext(), 0);
                u7Var.f16155b = 0.0f;
                u7Var.f16156c = 1.5f;
                u7Var.d(gcVar.R);
                u7Var.h = new Utilities.Callback(gcVar) {
                    public final gc f16414b;

                    {
                        this.f16414b = gcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                gc gcVar2 = this.f16414b;
                                gcVar2.R = floatValue;
                                ac acVar = gcVar2.f15326a;
                                if (acVar != null) {
                                    acVar.K(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                gc gcVar3 = this.f16414b;
                                gcVar3.H = floatValue2;
                                ac acVar2 = gcVar3.f15326a;
                                if (acVar2 != null) {
                                    acVar2.B(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                gc gcVar4 = this.f16414b;
                                gcVar4.h.f15018i = f10.floatValue();
                                ac acVar3 = gcVar4.f15326a;
                                if (acVar3 != null) {
                                    acVar3.X0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(gcVar.getBaseDuration(), gcVar.getMaxScrollDuration());
                int i11 = gcVar.f15366r1;
                int i12 = gcVar.f15373u1;
                int i13 = gcVar.f15371t1;
                float min2 = Math.min((i11 - i12) - i13, ((((AndroidUtilities.lerp(gcVar.P, 1.0f, gcVar.f15330b0.f34854c) * ((float) gcVar.N)) + ((float) (gcVar.M - gcVar.f15340f))) / ((float) min)) * gcVar.f15363q1) + i12 + i13);
                x60 F = x60.F(viewGroup, b6Var, gcVar);
                F.q(u7Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new xb(gcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(gcVar.f15366r1 - min2)) + AndroidUtilities.dp(18.0f), gcVar.B0.top);
                F.Z();
                F.R(baVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && gcVar.A) {
                u7 u7Var2 = new u7(gcVar.getContext(), 0);
                u7Var2.f16155b = 0.0f;
                u7Var2.f16156c = 1.5f;
                u7Var2.d(gcVar.H);
                u7Var2.h = new Utilities.Callback(gcVar) {
                    public final gc f16414b;

                    {
                        this.f16414b = gcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                gc gcVar2 = this.f16414b;
                                gcVar2.R = floatValue;
                                ac acVar = gcVar2.f15326a;
                                if (acVar != null) {
                                    acVar.K(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                gc gcVar3 = this.f16414b;
                                gcVar3.H = floatValue2;
                                ac acVar2 = gcVar3.f15326a;
                                if (acVar2 != null) {
                                    acVar2.B(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                gc gcVar4 = this.f16414b;
                                gcVar4.h.f15018i = f10.floatValue();
                                ac acVar3 = gcVar4.f15326a;
                                if (acVar3 != null) {
                                    acVar3.X0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(gcVar.getBaseDuration(), gcVar.getMaxScrollDuration());
                int i14 = gcVar.f15366r1;
                int i15 = gcVar.f15373u1;
                int i16 = gcVar.f15371t1;
                float min4 = Math.min((i14 - i15) - i16, ((((AndroidUtilities.lerp(gcVar.G, 1.0f, gcVar.W.f34854c) * ((float) gcVar.D)) + ((float) (gcVar.E - gcVar.f15340f))) / ((float) min3)) * gcVar.f15363q1) + i15 + i16);
                x60 F2 = x60.F(viewGroup, b6Var, gcVar);
                F2.q(u7Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new xb(gcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(gcVar.f15366r1 - min4)) + AndroidUtilities.dp(18.0f), gcVar.f15370t0.top);
                F2.Z();
                F2.R(baVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && gcVar.h != null) {
                u7 u7Var3 = new u7(gcVar.getContext(), 0);
                u7Var3.f16155b = 0.0f;
                u7Var3.f16156c = 1.5f;
                u7Var3.d(gcVar.h.f15018i);
                u7Var3.h = new Utilities.Callback(gcVar) {
                    public final gc f16414b;

                    {
                        this.f16414b = gcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                gc gcVar2 = this.f16414b;
                                gcVar2.R = floatValue;
                                ac acVar = gcVar2.f15326a;
                                if (acVar != null) {
                                    acVar.K(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                gc gcVar3 = this.f16414b;
                                gcVar3.H = floatValue2;
                                ac acVar2 = gcVar3.f15326a;
                                if (acVar2 != null) {
                                    acVar2.B(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                gc gcVar4 = this.f16414b;
                                gcVar4.h.f15018i = f10.floatValue();
                                ac acVar3 = gcVar4.f15326a;
                                if (acVar3 != null) {
                                    acVar3.X0(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                x60 F3 = x60.F(viewGroup, b6Var, gcVar);
                F3.q(u7Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), gcVar.f15360p0.top);
                F3.Z();
                F3.R(baVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else if (i10 == 3 && (i9 = gcVar.f15344g1) >= 0 && i9 < arrayList.size()) {
                bc bcVar = (bc) arrayList.get(gcVar.f15344g1);
                u7 u7Var4 = new u7(gcVar.getContext(), 0);
                u7Var4.f16155b = 0.0f;
                u7Var4.f16156c = 1.5f;
                u7Var4.d(bcVar.f15018i);
                u7Var4.h = new fh.f1(16, gcVar, bcVar);
                x60 F4 = x60.F(viewGroup, b6Var, gcVar);
                F4.q(u7Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), bcVar.f15019j.top);
                F4.Z();
                F4.R(baVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f15330b0.e(this.L));
    }

    public long getBaseDuration() {
        bc bcVar = this.h;
        if (bcVar != null) {
            return Math.max(1L, bcVar.f15015e);
        }
        bc bcVar2 = this.v;
        if (bcVar2 != null) {
            return Math.max(1L, bcVar2.f15015e);
        }
        if (this.A) {
            return Math.max(1L, this.D);
        }
        return Math.max(1L, this.N);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f15367s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (f10 > 0.0f) {
                f10 += AndroidUtilities.dp(4.0f);
            }
            f10 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((bc) arrayList.get(i9)).f15020k.f34854c);
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.A) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.W.e(this.C));
    }

    private float getVideoHeight() {
        bc bcVar = this.h;
        if (bcVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), bcVar.f15020k.f34854c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: kh.gc.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        yl0 yl0Var = this.S0;
        if (yl0Var.b()) {
            int i9 = yl0Var.f35015j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f15354m1) {
                this.f15340f = Math.max(0.0f, (((i9 - this.f15373u1) - this.f15371t1) / this.f15363q1) * ((float) min));
            } else if (!this.L) {
                yl0Var.a();
                return;
            } else {
                int i10 = this.f15373u1;
                int i11 = this.f15371t1;
                float f10 = this.f15363q1;
                float f11 = (float) min;
                h(((((i9 - i10) - i11) / f10) * f11) - ((((this.f15359o1 - i10) - i11) / f10) * f11));
            }
            invalidate();
            this.f15359o1 = i9;
        } else if (this.f15357n1) {
            this.f15357n1 = false;
            ac acVar = this.f15326a;
            if (acVar != null) {
                acVar.H0(false);
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, long j10, float f12) {
        long j11;
        float f13;
        if (this.T0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = (float) Utilities.clamp(j10, getBaseDuration(), 0L);
        bc bcVar = this.v;
        if (bcVar != null) {
            f13 = (bcVar.f15017g * ((float) bcVar.f15015e)) + ((float) bcVar.f15016f);
        } else {
            if (this.h == null) {
                j11 = this.M;
            } else {
                j11 = 0;
            }
            f13 = (float) j11;
        }
        float f14 = (this.f15363q1 * (((clamp + f13) - ((float) this.f15340f)) / ((float) min))) + this.f15373u1 + this.f15371t1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.f15381y0;
        paint.setAlpha((int) (38.0f * f12));
        int i9 = (int) (f12 * 255.0f);
        Paint paint2 = this.f15382z0;
        paint2.setAlpha(i9);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: kh.gc.dispatchDraw(android.graphics.Canvas):void");
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
        RectF rectF = AndroidUtilities.rectTmp;
        float f19 = 10.0f;
        rectF.set(f12 - AndroidUtilities.dp(10.0f), f10, AndroidUtilities.dp(10.0f) + f13, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f15366r1, this.f15369s1, 255, 31);
        int i9 = (int) (255.0f * f14);
        Paint paint3 = this.f15374v0;
        paint3.setAlpha(i9);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        if (this.T0) {
            f15 = 2.5f;
        } else {
            f15 = 10.0f;
        }
        rectF.inset(AndroidUtilities.dp(f15), AndroidUtilities.dp(2.0f));
        boolean z10 = this.T0;
        Paint paint4 = this.f15377w0;
        if (z10) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint5 = this.f15379x0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i9);
        if (this.T0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float a2 = org.telegram.messenger.l0.a(AndroidUtilities.dp(f16), dp, 2.0f, f12);
        float f20 = f10 + f11;
        float f21 = (f20 - dp2) / 2.0f;
        if (this.T0) {
            f17 = 2.0f;
        } else {
            f17 = 10.0f;
        }
        float f22 = (f20 + dp2) / 2.0f;
        rectF.set(a2, f21, f12 - ((AndroidUtilities.dp(f17) + dp) / 2.0f), f22);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null && !this.T0) {
                paint5.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            }
        }
        if (this.T0) {
            f18 = 2.5f;
        } else {
            f18 = 10.0f;
        }
        float A = e2.c.A(AndroidUtilities.dp(f18), dp, 2.0f, f13);
        if (this.T0) {
            f19 = 2.5f;
        }
        rectF.set(A, f21, j3.r0.c(AndroidUtilities.dp(f19), dp, 2.0f, f13), f22);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f14 * 48.0f));
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
        float f10;
        float collageHeight;
        float f11;
        float f12 = this.f15375v1;
        float f13 = 0.0f;
        if (this.h != null) {
            f10 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f12 + f10;
        if (this.f15367s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + AndroidUtilities.dp(4.0f);
        }
        float f15 = f14 + collageHeight;
        if (this.A) {
            f11 = getRoundHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f16 = f15 + f11;
        if (this.J) {
            f13 = AndroidUtilities.dp(4.0f) + getAudioHeight();
        }
        return (int) (f16 + f13 + this.f15375v1);
    }

    public int getMaxCount() {
        return this.U;
    }

    public long getMaxScrollDuration() {
        if (this.f15367s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f15375v1 + this.f15375v1, getContentHeight(), this.f15338e0.f34854c);
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
        ac acVar;
        long j17;
        long clamp;
        bc bcVar = this.h;
        if (bcVar == null && !this.A) {
            long j18 = this.M;
            long clamp2 = Utilities.clamp(j18 + f10, 0L, -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.M = clamp2;
            float f14 = (float) (clamp2 - j18);
            this.O = Utilities.clamp(this.O - (f14 / ((float) this.N)), 1.0f, 0.0f);
            this.P = Utilities.clamp(this.P - (f14 / ((float) this.N)), 1.0f, 0.0f);
            ac acVar2 = this.f15326a;
            if (acVar2 != null) {
                acVar2.K1(this.O);
                this.f15326a.u1(this.P);
            }
        } else if (this.L) {
            if (bcVar != null) {
                f11 = bcVar.f15017g;
                j10 = bcVar.f15015e;
            } else {
                f11 = this.F;
                j10 = this.D;
            }
            float f15 = f11 * ((float) j10);
            if (bcVar != null) {
                f12 = bcVar.h;
                j11 = bcVar.f15015e;
            } else {
                f12 = this.G;
                j11 = this.D;
            }
            float f16 = f12 * ((float) j11);
            if (bcVar != null) {
                f13 = (bcVar.h - bcVar.f15017g) * ((float) bcVar.f15015e);
            } else {
                f13 = ((float) this.D) * (this.G - this.F);
            }
            float f17 = this.P;
            float f18 = (float) this.N;
            float f19 = this.O;
            long j19 = f15 - (f19 * f18);
            float min = Math.min(f17 - f19, f13 / f18);
            long j20 = this.M;
            long j21 = f10;
            long j22 = j20 + j21;
            if (j22 > f16 - (f17 * f18)) {
                float clamp3 = Utilities.clamp(((f16 - ((float) j20)) - ((float) j21)) / ((float) this.N), 1.0f, min);
                this.P = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.O = clamp4;
                float f20 = this.P;
                float f21 = (float) this.N;
                long j23 = f16 - (f20 * f21);
                long j24 = f15 - (clamp4 * f21);
                if (j23 < j24) {
                    j15 = j24;
                    j14 = j23;
                } else {
                    j14 = j24;
                    j15 = j23;
                }
                this.M = Utilities.clamp(this.M + j21, j15, j14);
                ac acVar3 = this.f15326a;
                if (acVar3 != null) {
                    acVar3.K1(this.O);
                    this.f15326a.u1(this.P);
                }
            } else if (j22 < j19) {
                float clamp5 = Utilities.clamp(((f15 - ((float) j20)) - ((float) j21)) / ((float) this.N), 1.0f - min, 0.0f);
                this.O = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.P = clamp6;
                float f22 = (float) this.N;
                long j25 = f16 - (clamp6 * f22);
                long j26 = f15 - (this.O * f22);
                if (j25 < j26) {
                    j13 = j26;
                    j12 = j25;
                } else {
                    j12 = j26;
                    j13 = j25;
                }
                this.M = Utilities.clamp(this.M + j21, j13, j12);
                ac acVar4 = this.f15326a;
                if (acVar4 != null) {
                    acVar4.K1(this.O);
                    this.f15326a.u1(this.P);
                }
            } else {
                this.M = j22;
            }
        } else {
            long j27 = this.M + f10;
            float f23 = (float) this.N;
            this.M = Utilities.clamp(j27, ((float) getBaseDuration()) - (this.P * f23), (-this.O) * f23);
        }
        invalidate();
        ac acVar5 = this.f15326a;
        if (acVar5 != null) {
            acVar5.m2(this.M + (this.O * ((float) this.N)));
        }
        boolean z10 = this.f15348i1;
        if (!z10 && (acVar = this.f15326a) != null) {
            acVar.H0(true);
            bc bcVar2 = this.h;
            if (bcVar2 != null) {
                long j28 = this.M + (this.O * ((float) this.N));
                float f24 = bcVar2.h;
                float f25 = (float) bcVar2.f15015e;
                clamp = Utilities.clamp(j28, f24 * f25, bcVar2.f15017g * f25);
            } else if (this.A) {
                long j29 = this.M + (this.O * ((float) this.N));
                float f26 = this.G;
                float f27 = (float) this.D;
                clamp = Utilities.clamp(j29, f26 * f27, this.F * f27);
            } else {
                float f28 = this.O;
                clamp = Utilities.clamp(f28 * ((float) j17), this.N, 0L);
            }
            if (this.h != null && Math.abs(this.f15337e - clamp) > 400) {
                this.Y0 = this.f15337e;
                this.X0.d(1.0f, true);
            }
            ac acVar6 = this.f15326a;
            this.f15337e = clamp;
            acVar6.Q(clamp, false);
        } else if (z10 || this.f15357n1) {
            bc bcVar3 = this.h;
            if (bcVar3 != null) {
                long j30 = this.M + (this.O * ((float) this.N));
                float f29 = bcVar3.h;
                float f30 = (float) bcVar3.f15015e;
                this.f15337e = Utilities.clamp(j30, f29 * f30, bcVar3.f15017g * f30);
            } else if (this.A && bcVar3 != null) {
                long j31 = this.M + (this.O * ((float) this.N));
                float f31 = this.G;
                float f32 = (float) bcVar3.f15015e;
                this.f15337e = Utilities.clamp(j31, f31 * f32, this.F * f32);
            } else {
                float f33 = this.O;
                this.f15337e = Utilities.clamp(f33 * ((float) j16), this.N, 0L);
            }
            ac acVar7 = this.f15326a;
            if (acVar7 != null) {
                acVar7.Q(this.f15337e, false);
            }
        }
    }

    public final void i(bc bcVar, float f10) {
        long j10;
        ac acVar;
        long j11;
        long clamp;
        long j12;
        long j13;
        long j14;
        long j15;
        if (bcVar != null) {
            bc bcVar2 = this.v;
            if (bcVar2 != bcVar && bcVar2 != null) {
                if (this.f15355n == this.f15367s.indexOf(bcVar)) {
                    bc bcVar3 = this.v;
                    float f11 = (float) bcVar3.f15015e;
                    float f12 = bcVar.h;
                    float f13 = (float) bcVar.f15015e;
                    float f14 = bcVar.f15017g;
                    long j16 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((bcVar3.h - bcVar3.f15017g) * f11) / f13);
                    long j17 = bcVar.f15016f;
                    long j18 = f10;
                    long j19 = j17 + j18;
                    if (j19 > (f11 * 1.0f) - (f12 * f13)) {
                        bc bcVar4 = this.v;
                        float clamp2 = Utilities.clamp((((bcVar4.h * ((float) bcVar4.f15015e)) - ((float) j17)) - ((float) j18)) / ((float) bcVar.f15015e), 1.0f, min);
                        bcVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        bcVar.f15017g = clamp3;
                        bc bcVar5 = this.v;
                        float f15 = bcVar5.h;
                        float f16 = (float) bcVar5.f15015e;
                        float f17 = bcVar.h;
                        float f18 = (float) bcVar.f15015e;
                        long j20 = (f15 * f16) - (f17 * f18);
                        long j21 = (bcVar5.f15017g * f16) - (clamp3 * f18);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        bcVar.f15016f = Utilities.clamp(bcVar.f15016f + j18, j15, j14);
                        ac acVar2 = this.f15326a;
                        if (acVar2 != null) {
                            acVar2.p1(bcVar.f15017g, bcVar.f15012a);
                            this.f15326a.Y1(bcVar.h, bcVar.f15012a);
                        }
                    } else if (j19 < j16) {
                        bc bcVar6 = this.v;
                        float clamp4 = Utilities.clamp((((bcVar6.f15017g * ((float) bcVar6.f15015e)) - ((float) j17)) - ((float) j18)) / ((float) bcVar.f15015e), 1.0f - min, 0.0f);
                        bcVar.f15017g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        bcVar.h = clamp5;
                        bc bcVar7 = this.v;
                        float f19 = bcVar7.h;
                        float f20 = (float) bcVar7.f15015e;
                        float f21 = (float) bcVar.f15015e;
                        long j22 = (f19 * f20) - (clamp5 * f21);
                        long j23 = (bcVar7.f15017g * f20) - (bcVar.f15017g * f21);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        bcVar.f15016f = Utilities.clamp(bcVar.f15016f + j18, j13, j12);
                        ac acVar3 = this.f15326a;
                        if (acVar3 != null) {
                            acVar3.p1(bcVar.f15017g, bcVar.f15012a);
                            this.f15326a.Y1(bcVar.h, bcVar.f15012a);
                        }
                    } else {
                        bcVar.f15016f = j19;
                    }
                } else {
                    long j24 = bcVar.f15016f + f10;
                    float f22 = (float) bcVar.f15015e;
                    bcVar.f15016f = Utilities.clamp(j24, ((float) getBaseDuration()) - (bcVar.h * f22), (-bcVar.f15017g) * f22);
                }
            }
            invalidate();
            ac acVar4 = this.f15326a;
            if (acVar4 != null) {
                acVar4.j2(bcVar.f15012a, bcVar.f15016f);
            }
            boolean z10 = this.f15348i1;
            if (!z10 && (acVar = this.f15326a) != null) {
                acVar.H0(true);
                bc bcVar8 = this.v;
                if (bcVar8 != bcVar && bcVar8 != null) {
                    long j25 = bcVar.f15016f + (bcVar.f15017g * ((float) bcVar.f15015e));
                    float f23 = bcVar8.h;
                    float f24 = (float) bcVar8.f15015e;
                    clamp = Utilities.clamp(j25, f23 * f24, bcVar8.f15017g * f24);
                } else {
                    float f25 = bcVar.f15017g;
                    clamp = Utilities.clamp(f25 * ((float) j11), bcVar.f15015e, 0L);
                }
                bc bcVar9 = this.v;
                if (bcVar9 != bcVar && bcVar9 != null && Math.abs(this.f15337e - clamp) > 400) {
                    this.Y0 = this.f15337e;
                    this.X0.d(1.0f, true);
                }
                ac acVar5 = this.f15326a;
                this.f15337e = clamp;
                acVar5.Q(clamp, false);
            } else if (z10 || this.f15357n1) {
                bc bcVar10 = this.v;
                if (bcVar10 != bcVar && bcVar10 != null) {
                    long j26 = bcVar.f15016f + (bcVar.f15017g * ((float) bcVar.f15015e));
                    float f26 = bcVar10.h;
                    float f27 = (float) bcVar10.f15015e;
                    this.f15337e = Utilities.clamp(j26, f26 * f27, bcVar10.f15017g * f27);
                } else {
                    float f28 = bcVar.f15017g;
                    this.f15337e = Utilities.clamp(f28 * ((float) j10), bcVar.f15015e, 0L);
                }
                ac acVar6 = this.f15326a;
                if (acVar6 != null) {
                    acVar6.Q(this.f15337e, false);
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
        ac acVar;
        long j15;
        long clamp;
        bc bcVar = this.h;
        if (bcVar == null) {
            long j16 = this.E;
            long clamp2 = Utilities.clamp(j16 + f10, 0L, -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.E = clamp2;
            float f11 = (float) (clamp2 - j16);
            this.F = Utilities.clamp(this.F - (f11 / ((float) this.D)), 1.0f, 0.0f);
            this.G = Utilities.clamp(this.G - (f11 / ((float) this.D)), 1.0f, 0.0f);
            ac acVar2 = this.f15326a;
            if (acVar2 != null) {
                acVar2.v0(this.F);
                this.f15326a.h2(this.G);
            }
        } else if (this.C) {
            float f12 = bcVar.h;
            float f13 = (float) bcVar.f15015e;
            float f14 = this.G;
            float f15 = (float) this.D;
            long j17 = (f12 * f13) - (f14 * f15);
            float f16 = bcVar.f15017g;
            float f17 = this.F;
            long j18 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j19 = this.E;
            long j20 = f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                bc bcVar2 = this.h;
                float clamp3 = Utilities.clamp((((bcVar2.h * ((float) bcVar2.f15015e)) - ((float) j19)) - ((float) j20)) / ((float) this.D), 1.0f, min);
                this.G = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.F = clamp4;
                bc bcVar3 = this.h;
                float f18 = bcVar3.h;
                float f19 = (float) bcVar3.f15015e;
                float f20 = this.G;
                float f21 = (float) this.D;
                long j22 = (f18 * f19) - (f20 * f21);
                long j23 = (bcVar3.f15017g * f19) - (clamp4 * f21);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.E = Utilities.clamp(this.E + j20, j13, j12);
                ac acVar3 = this.f15326a;
                if (acVar3 != null) {
                    acVar3.v0(this.F);
                    this.f15326a.h2(this.G);
                }
            } else if (j21 < j18) {
                bc bcVar4 = this.h;
                float clamp5 = Utilities.clamp((((bcVar4.f15017g * ((float) bcVar4.f15015e)) - ((float) j19)) - ((float) j20)) / ((float) this.D), 1.0f - min, 0.0f);
                this.F = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.G = clamp6;
                bc bcVar5 = this.h;
                float f22 = bcVar5.h;
                float f23 = (float) bcVar5.f15015e;
                float f24 = (float) this.D;
                long j24 = (f22 * f23) - (clamp6 * f24);
                long j25 = (bcVar5.f15017g * f23) - (this.F * f24);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.E = Utilities.clamp(this.E + j20, j11, j10);
                ac acVar4 = this.f15326a;
                if (acVar4 != null) {
                    acVar4.v0(this.F);
                    this.f15326a.h2(this.G);
                }
            } else {
                this.E = j21;
            }
        } else {
            long j26 = this.E + f10;
            float f25 = (float) this.D;
            this.E = Utilities.clamp(j26, ((float) getBaseDuration()) - (this.G * f25), (-this.F) * f25);
        }
        invalidate();
        ac acVar5 = this.f15326a;
        if (acVar5 != null) {
            acVar5.i1(this.E + (this.F * ((float) this.D)));
        }
        boolean z10 = this.f15348i1;
        if (!z10 && (acVar = this.f15326a) != null) {
            acVar.H0(true);
            bc bcVar6 = this.h;
            if (bcVar6 != null) {
                long j27 = this.E + (this.F * ((float) this.D));
                float f26 = bcVar6.h;
                float f27 = (float) bcVar6.f15015e;
                clamp = Utilities.clamp(j27, f26 * f27, bcVar6.f15017g * f27);
            } else {
                float f28 = this.F;
                clamp = Utilities.clamp(f28 * ((float) j15), this.D, 0L);
            }
            if (this.h != null && Math.abs(this.f15337e - clamp) > 400) {
                this.Y0 = this.f15337e;
                this.X0.d(1.0f, true);
            }
            ac acVar6 = this.f15326a;
            this.f15337e = clamp;
            acVar6.Q(clamp, false);
        } else if (z10 || this.f15357n1) {
            bc bcVar7 = this.h;
            if (bcVar7 != null) {
                long j28 = this.E + (this.F * ((float) this.D));
                float f29 = bcVar7.h;
                float f30 = (float) bcVar7.f15015e;
                this.f15337e = Utilities.clamp(j28, f29 * f30, bcVar7.f15017g * f30);
            } else {
                float f31 = this.F;
                this.f15337e = Utilities.clamp(f31 * ((float) j14), this.D, 0L);
            }
            ac acVar7 = this.f15326a;
            if (acVar7 != null) {
                acVar7.Q(this.f15337e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        bc bcVar = this.h;
        long j10 = bcVar.f15015e;
        this.f15340f = Utilities.clamp((((bcVar.h + bcVar.f15017g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
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

    public final boolean m(float f10, boolean z10) {
        long j10;
        bc bcVar;
        bc bcVar2 = this.h;
        ArrayList arrayList = this.f15367s;
        if (bcVar2 != null || this.J || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f15373u1) - this.f15371t1) / this.f15363q1;
            bc bcVar3 = this.v;
            if (bcVar3 != null) {
                j10 = (bcVar3.f15017g * ((float) bcVar3.f15015e)) + ((float) bcVar3.f15016f);
            } else {
                j10 = 0;
            }
            float f12 = f11 * ((float) min);
            if (bcVar3 == null) {
                if (this.h == null) {
                    j10 = this.M;
                } else {
                    j10 = 0;
                }
            }
            long clamp = Utilities.clamp((f12 - ((float) j10)) + ((float) this.f15340f), (float) getBaseDuration(), 0.0f);
            bc bcVar4 = this.h;
            if (bcVar4 != null) {
                float f13 = ((float) clamp) / ((float) bcVar4.f15015e);
                if (f13 < bcVar4.f15017g || f13 > bcVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (bcVar.h - bcVar.f15017g) * ((float) bcVar.f15015e))) {
                if (this.J && bcVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) clamp) / ((float) this.N);
                    if (f14 < this.O || f14 > this.P) {
                        return false;
                    }
                }
                this.f15337e = clamp;
                invalidate();
                ac acVar = this.f15326a;
                if (acVar != null) {
                    acVar.Q(clamp, z10);
                }
                bg.i2 i2Var = this.Z0;
                if (i2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(i2Var);
                    this.Z0 = null;
                }
                if (z10) {
                    bg.i2 i2Var2 = new bg.i2(this, clamp, 11);
                    this.Z0 = i2Var2;
                    AndroidUtilities.runOnUIThread(i2Var2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j10, long j11, float f10, float f11, float f12, boolean z10) {
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        bc bcVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.B, str)) {
            return;
        }
        ec ecVar = this.I;
        Long l10 = null;
        if (ecVar != null) {
            ecVar.b();
            this.I = null;
        }
        long j13 = this.D;
        if (str != null) {
            this.B = str;
            this.D = j10;
            this.E = j11 - (((float) j10) * f10);
            this.F = f10;
            this.G = f11;
            this.H = f12;
            if (getMeasuredWidth() <= 0 || this.I != null || ((bcVar = this.h) != null && bcVar.f15015e < 1)) {
                j12 = j13;
                z13 = false;
                z11 = true;
            } else {
                String str2 = this.B;
                int i9 = this.f15366r1;
                int i10 = this.f15373u1;
                int i11 = (i9 - i10) - i10;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.D;
                if (j14 > 2) {
                    l10 = Long.valueOf(j14);
                }
                bc bcVar2 = this.h;
                if (bcVar2 != null) {
                    maxScrollDuration = bcVar2.f15015e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z13 = false;
                z11 = true;
                this.I = new ec(this, false, str2, i11, dp, l10, maxScrollDuration, -1L, -1L, new xb(this, 0));
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
            this.f15330b0.f(this.L, z11);
            this.V.f(this.A, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f10) {
        String str2;
        bc bcVar = this.h;
        if (bcVar == null) {
            str2 = null;
        } else {
            str2 = bcVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        bc bcVar2 = this.h;
        if (bcVar2 != null) {
            ec ecVar = bcVar2.f15014c;
            if (ecVar != null) {
                ecVar.b();
                this.h.f15014c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f15340f = 0L;
            bc bcVar3 = new bc(this);
            this.h = bcVar3;
            bcVar3.f15013b = z10;
            bcVar3.d = str;
            bcVar3.f15015e = j10;
            bcVar3.f15018i = f10;
            bc.a(bcVar3, false);
        } else {
            this.h = null;
            this.f15340f = 0L;
        }
        if (!this.A) {
            this.C = false;
        }
        this.f15337e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.H0.setTextSize(AndroidUtilities.dp(12.0f));
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f15373u1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f15375v1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i9);
        this.f15366r1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f15369s1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f15371t1 = dp4;
        this.f15363q1 = (this.f15366r1 - (dp4 * 2)) - (this.f15373u1 * 2);
        bc bcVar = this.h;
        if (bcVar != null && bcVar.d != null && bcVar.f15014c == null) {
            bc.a(bcVar, false);
        }
        ArrayList arrayList = this.f15367s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                bc bcVar2 = (bc) obj;
                if (bcVar2.d != null && bcVar2.f15014c == null) {
                    bc.a(bcVar2, false);
                    bc.b(bcVar2);
                }
            }
        }
        if (this.K != null && this.T == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: kh.gc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.T == null || this.S) {
                this.T = new zb(this, this.K, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.Q = false;
                this.f15333c0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        bc bcVar;
        j9.a aVar = new j9.a(2);
        ArrayList arrayList = this.f15367s;
        Collections.sort(arrayList, aVar);
        if (arrayList.isEmpty()) {
            bcVar = null;
        } else {
            bcVar = (bc) arrayList.get(0);
        }
        this.v = bcVar;
        if (bcVar != null) {
            long j10 = bcVar.f15016f;
        }
    }

    public void setCollage(ArrayList<a8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ec ecVar;
        int i9 = 0;
        while (true) {
            arrayList2 = this.f15367s;
            if (i9 >= arrayList2.size()) {
                break;
            }
            bc bcVar = (bc) arrayList2.get(i9);
            if (bcVar != null && (ecVar = bcVar.f15014c) != null) {
                ecVar.b();
            }
            i9++;
        }
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            arrayList3 = this.f15364r;
            if (i10 >= arrayList3.size()) {
                break;
            }
            zb zbVar = (zb) arrayList3.get(i10);
            if (zbVar != null) {
                zbVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.f15335d0.d(1.0f, true);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                a8 a8Var = arrayList.get(i11);
                if (a8Var.K) {
                    bc bcVar2 = new bc(this);
                    bcVar2.f15012a = i11;
                    bcVar2.f15013b = false;
                    bcVar2.d = a8Var.L.getAbsolutePath();
                    bcVar2.f15015e = a8Var.f14919h0;
                    bcVar2.f15016f = a8Var.X;
                    bcVar2.f15018i = a8Var.P;
                    bcVar2.f15017g = a8Var.V;
                    bcVar2.h = a8Var.W;
                    bc.a(bcVar2, false);
                    bc.b(bcVar2);
                    arrayList2.add(bcVar2);
                }
            }
        }
        q();
        this.f15355n = 0;
    }

    public void setDelegate(ac acVar) {
        this.f15326a = acVar;
    }

    public void setMaxCount(int i9) {
        this.U = i9;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f15329b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: kh.gc.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f10) {
        bc bcVar = this.h;
        if (bcVar == null) {
            return;
        }
        bcVar.f15017g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        bc bcVar = this.h;
        if (bcVar == null) {
            return;
        }
        bcVar.h = f10;
        invalidate();
    }
}
