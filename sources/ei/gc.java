package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.mn0;
public final class gc extends View {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public boolean E;
    public final TextPaint E0;
    public String F;
    public final RectF F0;
    public boolean G;
    public final Path G0;
    public long H;
    public final Paint H0;
    public long I;
    public final fc I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public ec M;
    public StaticLayout M0;
    public boolean N;
    public float N0;
    public String O;
    public float O0;
    public boolean P;
    public final TextPaint P0;
    public long Q;
    public StaticLayout Q0;
    public long R;
    public float R0;
    public float S;
    public float S0;
    public float T;
    public final LinearGradient T0;
    public boolean U;
    public final Matrix U0;
    public float V;
    public final Paint V0;
    public boolean W;
    public final mn0 W0;
    public boolean X0;
    public final ai.t0 Y0;
    public long Z0;
    public zb f9079a;
    public yb f9080a0;
    public long f9081a1;
    public Runnable f9082b;
    public int f9083b0;
    public final org.telegram.ui.Components.f6 f9084b1;
    public int f9085c;
    public final org.telegram.ui.Components.f6 f9086c0;
    public long f9087c1;
    public Runnable d;
    public final org.telegram.ui.Components.f6 f9088d0;
    public ai.v3 f9089d1;
    public long e;
    public final org.telegram.ui.Components.f6 f9090e0;
    public long f9091e1;
    public long f9092f;
    public final org.telegram.ui.Components.f6 f9093f0;
    public long f9094f1;
    public final org.telegram.ui.Components.f6 f9095g0;
    public float f9096g1;
    public ac h;
    public final org.telegram.ui.Components.f6 f9097h0;
    public int f9098h1;
    public final org.telegram.ui.Components.f6 f9099i0;
    public int f9100i1;
    public boolean f9101j0;
    public int f9102j1;
    public final org.telegram.ui.Components.ja f9103k0;
    public int f9104k1;
    public final org.telegram.ui.Components.na f9105l0;
    public boolean l1;
    public final org.telegram.ui.Components.na m0;
    public boolean f9106m1;
    public int f9107n;
    public final org.telegram.ui.Components.na f9108n0;
    public float f9109n1;
    public final RectF f9110o0;
    public boolean f9111o1;
    public final Path f9112p0;
    public VelocityTracker f9113p1;
    public final f11 f9114q0;
    public boolean f9115q1;
    public final ArrayList f9116r;
    public final Drawable f9117r0;
    public boolean f9118r1;
    public final ArrayList f9119s;
    public final fc f9120s0;
    public int f9121s1;
    public final RectF f9122t0;
    public final float[] f9123t1;
    public final Paint f9124u0;
    public int f9125u1;
    public ac v;
    public final Path f9126v0;
    public int f9127v1;
    public final Paint f9128w;
    public final Path f9129w0;
    public int f9130w1;
    public final Path f9131x;
    public final RectF f9132x0;
    public int f9133x1;
    public final Path f9134y;
    public final Path f9135y0;
    public int f9136y1;
    public final Paint f9137z0;
    public int f9138z1;

    public gc(Context context, ViewGroup viewGroup, hb hbVar, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ja jaVar) {
        super(context);
        this.f9107n = 0;
        this.f9116r = new ArrayList();
        this.f9119s = new ArrayList();
        this.f9128w = new Paint(3);
        this.f9131x = new Path();
        this.f9134y = new Path();
        this.f9083b0 = 1;
        bs bsVar = bs.h;
        this.f9086c0 = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        this.f9088d0 = new org.telegram.ui.Components.f6(this, 360L, bsVar);
        this.f9090e0 = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        this.f9093f0 = new org.telegram.ui.Components.f6(this, 360L, bsVar);
        this.f9095g0 = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        this.f9097h0 = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        this.f9099i0 = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        this.f9101j0 = true;
        this.f9110o0 = new RectF();
        this.f9112p0 = new Path();
        this.f9120s0 = new fc();
        this.f9122t0 = new RectF();
        this.f9124u0 = new Paint(3);
        this.f9126v0 = new Path();
        this.f9129w0 = new Path();
        this.f9132x0 = new RectF();
        this.f9135y0 = new Path();
        Paint paint = new Paint(1);
        this.f9137z0 = paint;
        Paint paint2 = new Paint(1);
        this.A0 = paint2;
        Paint paint3 = new Paint(1);
        this.B0 = paint3;
        Paint paint4 = new Paint(1);
        this.C0 = paint4;
        Paint paint5 = new Paint(1);
        this.D0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.E0 = textPaint;
        this.F0 = new RectF();
        this.G0 = new Path();
        Paint paint6 = new Paint(1);
        this.H0 = paint6;
        this.I0 = new fc();
        Paint paint7 = new Paint(1);
        this.J0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.L0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.P0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.T0 = linearGradient;
        this.U0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.V0 = paint8;
        this.W0 = new mn0(getContext(), null);
        this.Z0 = -1L;
        this.f9081a1 = -1L;
        this.f9084b1 = new org.telegram.ui.Components.f6(0.0f, this, 0L, 340L, bsVar);
        this.f9087c1 = -1L;
        this.f9098h1 = -1;
        this.f9100i1 = -1;
        this.f9102j1 = -1;
        this.f9104k1 = -1;
        this.f9109n1 = 1.0f;
        this.f9115q1 = true;
        this.f9118r1 = false;
        this.f9123t1 = new float[8];
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
        this.f9114q0 = new f11(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f9117r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f9103k0 = jaVar;
        this.f9105l0 = new org.telegram.ui.Components.na(jaVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.na(jaVar, this, 3, false);
        this.f9108n0 = new org.telegram.ui.Components.na(jaVar, this, 4, false);
        this.Y0 = new ai.t0(this, viewGroup, d6Var, jaVar, hbVar, 13);
    }

    public static void a(final gc gcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ja jaVar, View view) {
        int i10;
        ArrayList arrayList = gcVar.f9119s;
        int i11 = gcVar.f9102j1;
        try {
            if (i11 == 2 && gcVar.N) {
                u7 u7Var = new u7(gcVar.getContext(), 0);
                u7Var.f9900b = 0.0f;
                u7Var.f9901c = 1.5f;
                u7Var.d(gcVar.V);
                u7Var.h = new Utilities.Callback(gcVar) {
                    public final gc f10118b;

                    {
                        this.f10118b = gcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                gc gcVar2 = this.f10118b;
                                gcVar2.V = floatValue;
                                zb zbVar = gcVar2.f9079a;
                                if (zbVar != null) {
                                    zbVar.l(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                gc gcVar3 = this.f10118b;
                                gcVar3.L = floatValue2;
                                zb zbVar2 = gcVar3.f9079a;
                                if (zbVar2 != null) {
                                    zbVar2.g(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                gc gcVar4 = this.f10118b;
                                gcVar4.h.f8758i = f7.floatValue();
                                zb zbVar3 = gcVar4.f9079a;
                                if (zbVar3 != null) {
                                    zbVar3.z(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(gcVar.getBaseDuration(), gcVar.getMaxScrollDuration());
                int i12 = gcVar.f9127v1;
                int i13 = gcVar.f9136y1;
                int i14 = gcVar.f9133x1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(gcVar.T, 1.0f, gcVar.f9093f0.f26090c) * ((float) gcVar.R)) + ((float) (gcVar.Q - gcVar.f9092f))) / ((float) min)) * gcVar.f9125u1) + i13 + i14);
                i80 F = i80.F(viewGroup, d6Var, gcVar);
                F.q(u7Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new wb(gcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(gcVar.f9127v1 - min2)) + AndroidUtilities.dp(18.0f), gcVar.F0.top);
                F.Z();
                F.R(jaVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && gcVar.E) {
                u7 u7Var2 = new u7(gcVar.getContext(), 0);
                u7Var2.f9900b = 0.0f;
                u7Var2.f9901c = 1.5f;
                u7Var2.d(gcVar.L);
                u7Var2.h = new Utilities.Callback(gcVar) {
                    public final gc f10118b;

                    {
                        this.f10118b = gcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                gc gcVar2 = this.f10118b;
                                gcVar2.V = floatValue;
                                zb zbVar = gcVar2.f9079a;
                                if (zbVar != null) {
                                    zbVar.l(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                gc gcVar3 = this.f10118b;
                                gcVar3.L = floatValue2;
                                zb zbVar2 = gcVar3.f9079a;
                                if (zbVar2 != null) {
                                    zbVar2.g(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                gc gcVar4 = this.f10118b;
                                gcVar4.h.f8758i = f7.floatValue();
                                zb zbVar3 = gcVar4.f9079a;
                                if (zbVar3 != null) {
                                    zbVar3.z(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(gcVar.getBaseDuration(), gcVar.getMaxScrollDuration());
                int i15 = gcVar.f9127v1;
                int i16 = gcVar.f9136y1;
                int i17 = gcVar.f9133x1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(gcVar.K, 1.0f, gcVar.f9088d0.f26090c) * ((float) gcVar.H)) + ((float) (gcVar.I - gcVar.f9092f))) / ((float) min3)) * gcVar.f9125u1) + i16 + i17);
                i80 F2 = i80.F(viewGroup, d6Var, gcVar);
                F2.q(u7Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new wb(gcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(gcVar.f9127v1 - min4)) + AndroidUtilities.dp(18.0f), gcVar.f9132x0.top);
                F2.Z();
                F2.R(jaVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && gcVar.h != null) {
                u7 u7Var3 = new u7(gcVar.getContext(), 0);
                u7Var3.f9900b = 0.0f;
                u7Var3.f9901c = 1.5f;
                u7Var3.d(gcVar.h.f8758i);
                u7Var3.h = new Utilities.Callback(gcVar) {
                    public final gc f10118b;

                    {
                        this.f10118b = gcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                gc gcVar2 = this.f10118b;
                                gcVar2.V = floatValue;
                                zb zbVar = gcVar2.f9079a;
                                if (zbVar != null) {
                                    zbVar.l(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                gc gcVar3 = this.f10118b;
                                gcVar3.L = floatValue2;
                                zb zbVar2 = gcVar3.f9079a;
                                if (zbVar2 != null) {
                                    zbVar2.g(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                gc gcVar4 = this.f10118b;
                                gcVar4.h.f8758i = f7.floatValue();
                                zb zbVar3 = gcVar4.f9079a;
                                if (zbVar3 != null) {
                                    zbVar3.z(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                i80 F3 = i80.F(viewGroup, d6Var, gcVar);
                F3.q(u7Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), gcVar.f9122t0.top);
                F3.Z();
                F3.R(jaVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = gcVar.f9104k1) >= 0 && i10 < arrayList.size()) {
                ac acVar = (ac) arrayList.get(gcVar.f9104k1);
                u7 u7Var4 = new u7(gcVar.getContext(), 0);
                u7Var4.f9900b = 0.0f;
                u7Var4.f9901c = 1.5f;
                u7Var4.d(acVar.f8758i);
                u7Var4.h = new ai.o2(14, gcVar, acVar);
                i80 F4 = i80.F(viewGroup, d6Var, gcVar);
                F4.q(u7Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), acVar.f8759j.top);
                F4.Z();
                F4.R(jaVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f9093f0.e(this.P));
    }

    public long getBaseDuration() {
        ac acVar = this.h;
        if (acVar != null) {
            return Math.max(1L, acVar.e);
        }
        ac acVar2 = this.v;
        if (acVar2 != null) {
            return Math.max(1L, acVar2.e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f9119s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((ac) arrayList.get(i10)).f8760k.f26090c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f9088d0.e(this.G));
    }

    private float getVideoHeight() {
        ac acVar = this.h;
        if (acVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), acVar.f8760k.f26090c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.gc.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        mn0 mn0Var = this.W0;
        if (mn0Var.b()) {
            int i10 = mn0Var.f28569j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f9115q1) {
                this.f9092f = Math.max(0.0f, (((i10 - this.f9136y1) - this.f9133x1) / this.f9125u1) * ((float) min));
            } else if (!this.P) {
                mn0Var.a();
                return;
            } else {
                int i11 = this.f9136y1;
                int i12 = this.f9133x1;
                float f7 = this.f9125u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f9121s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f9121s1 = i10;
        } else if (this.f9118r1) {
            this.f9118r1 = false;
            zb zbVar = this.f9079a;
            if (zbVar != null) {
                zbVar.u(false);
            }
        }
    }

    public final void d(Canvas canvas, float f7, float f10, long j10, float f11) {
        long j11;
        float f12;
        if (this.X0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = (float) Utilities.clamp(j10, getBaseDuration(), 0L);
        ac acVar = this.v;
        if (acVar != null) {
            f12 = (acVar.f8757g * ((float) acVar.e)) + ((float) acVar.f8756f);
        } else {
            if (this.h == null) {
                j11 = this.Q;
            } else {
                j11 = 0;
            }
            f12 = (float) j11;
        }
        float f13 = (this.f9125u1 * (((clamp + f12) - ((float) this.f9092f)) / ((float) min))) + this.f9136y1 + this.f9133x1;
        float f14 = (1.0f - f11) * (((f10 - f7) / 2.0f) / 2.0f);
        float f15 = f7 + f14;
        float f16 = f10 - f14;
        Paint paint = this.C0;
        paint.setAlpha((int) (38.0f * f11));
        int i10 = (int) (f11 * 255.0f);
        Paint paint2 = this.D0;
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
        throw new UnsupportedOperationException("Method not decompiled: ei.gc.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, float f7, float f10, float f11, float f12, float f13) {
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
        rectF.set(f11 - AndroidUtilities.dp(10.0f), f7, AndroidUtilities.dp(10.0f) + f12, f10);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f9127v1, this.f9130w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f9137z0;
        paint3.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        if (this.X0) {
            f14 = 2.5f;
        } else {
            f14 = 10.0f;
        }
        rectF.inset(AndroidUtilities.dp(f14), AndroidUtilities.dp(2.0f));
        boolean z10 = this.X0;
        Paint paint4 = this.A0;
        if (z10) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint5 = this.B0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i10);
        if (this.X0) {
            f15 = 2.0f;
        } else {
            f15 = 10.0f;
        }
        float x10 = org.telegram.messenger.g0.x(AndroidUtilities.dp(f15), dp, 2.0f, f11);
        float f19 = f7 + f10;
        float f20 = (f19 - dp2) / 2.0f;
        if (this.X0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float f21 = (f19 + dp2) / 2.0f;
        rectF.set(x10, f20, f11 - ((AndroidUtilities.dp(f16) + dp) / 2.0f), f21);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null && !this.X0) {
                paint5.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            }
        }
        if (this.X0) {
            f17 = 2.5f;
        } else {
            f17 = 10.0f;
        }
        float z11 = com.google.android.gms.internal.play_billing.k3.z(AndroidUtilities.dp(f17), dp, 2.0f, f12);
        if (this.X0) {
            f18 = 2.5f;
        }
        rectF.set(z11, f20, org.telegram.messenger.g0.a(AndroidUtilities.dp(f18), dp, 2.0f, f12), f21);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.f9083b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f9138z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f9119s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + AndroidUtilities.dp(4.0f);
        }
        float f14 = f13 + collageHeight;
        if (this.E) {
            f10 = getRoundHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f15 = f14 + f10;
        if (this.N) {
            f12 = AndroidUtilities.dp(4.0f) + getAudioHeight();
        }
        return (int) (f15 + f12 + this.f9138z1);
    }

    public int getMaxCount() {
        return this.f9083b0;
    }

    public long getMaxScrollDuration() {
        if (this.f9119s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f9138z1 + this.f9138z1, getContentHeight(), this.f9099i0.f26090c);
    }

    public final void h(float f7) {
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
        zb zbVar;
        long j17;
        long clamp;
        ac acVar = this.h;
        if (acVar == null && !this.E) {
            long j18 = this.Q;
            long clamp2 = Utilities.clamp(j18 + f7, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f13 = (float) (clamp2 - j18);
            this.S = Utilities.clamp(this.S - (f13 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f13 / ((float) this.R)), 1.0f, 0.0f);
            zb zbVar2 = this.f9079a;
            if (zbVar2 != null) {
                zbVar2.K(this.S);
                this.f9079a.J(this.T);
            }
        } else if (this.P) {
            if (acVar != null) {
                f10 = acVar.f8757g;
                j10 = acVar.e;
            } else {
                f10 = this.J;
                j10 = this.H;
            }
            float f14 = f10 * ((float) j10);
            if (acVar != null) {
                f11 = acVar.h;
                j11 = acVar.e;
            } else {
                f11 = this.K;
                j11 = this.H;
            }
            float f15 = f11 * ((float) j11);
            if (acVar != null) {
                f12 = (acVar.h - acVar.f8757g) * ((float) acVar.e);
            } else {
                f12 = ((float) this.H) * (this.K - this.J);
            }
            float f16 = this.T;
            float f17 = (float) this.R;
            float f18 = this.S;
            long j19 = f14 - (f18 * f17);
            float min = Math.min(f16 - f18, f12 / f17);
            long j20 = this.Q;
            long j21 = f7;
            long j22 = j20 + j21;
            if (j22 > f15 - (f16 * f17)) {
                float clamp3 = Utilities.clamp(((f15 - ((float) j20)) - ((float) j21)) / ((float) this.R), 1.0f, min);
                this.T = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.S = clamp4;
                float f19 = this.T;
                float f20 = (float) this.R;
                long j23 = f15 - (f19 * f20);
                long j24 = f14 - (clamp4 * f20);
                if (j23 < j24) {
                    j15 = j24;
                    j14 = j23;
                } else {
                    j14 = j24;
                    j15 = j23;
                }
                this.Q = Utilities.clamp(this.Q + j21, j15, j14);
                zb zbVar3 = this.f9079a;
                if (zbVar3 != null) {
                    zbVar3.K(this.S);
                    this.f9079a.J(this.T);
                }
            } else if (j22 < j19) {
                float clamp5 = Utilities.clamp(((f14 - ((float) j20)) - ((float) j21)) / ((float) this.R), 1.0f - min, 0.0f);
                this.S = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.T = clamp6;
                float f21 = (float) this.R;
                long j25 = f15 - (clamp6 * f21);
                long j26 = f14 - (this.S * f21);
                if (j25 < j26) {
                    j13 = j26;
                    j12 = j25;
                } else {
                    j12 = j26;
                    j13 = j25;
                }
                this.Q = Utilities.clamp(this.Q + j21, j13, j12);
                zb zbVar4 = this.f9079a;
                if (zbVar4 != null) {
                    zbVar4.K(this.S);
                    this.f9079a.J(this.T);
                }
            } else {
                this.Q = j22;
            }
        } else {
            long j27 = this.Q + f7;
            float f22 = (float) this.R;
            this.Q = Utilities.clamp(j27, ((float) getBaseDuration()) - (this.T * f22), (-this.S) * f22);
        }
        invalidate();
        zb zbVar5 = this.f9079a;
        if (zbVar5 != null) {
            zbVar5.V(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f9106m1;
        if (!z10 && (zbVar = this.f9079a) != null) {
            zbVar.u(true);
            ac acVar2 = this.h;
            if (acVar2 != null) {
                long j28 = this.Q + (this.S * ((float) this.R));
                float f23 = acVar2.h;
                float f24 = (float) acVar2.e;
                clamp = Utilities.clamp(j28, f23 * f24, acVar2.f8757g * f24);
            } else if (this.E) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f25 = this.K;
                float f26 = (float) this.H;
                clamp = Utilities.clamp(j29, f25 * f26, this.J * f26);
            } else {
                float f27 = this.S;
                clamp = Utilities.clamp(f27 * ((float) j17), this.R, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.f9087c1 = this.e;
                this.f9084b1.d(1.0f, true);
            }
            zb zbVar6 = this.f9079a;
            this.e = clamp;
            zbVar6.o(clamp, false);
        } else if (z10 || this.f9118r1) {
            ac acVar3 = this.h;
            if (acVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f28 = acVar3.h;
                float f29 = (float) acVar3.e;
                this.e = Utilities.clamp(j30, f28 * f29, acVar3.f8757g * f29);
            } else if (this.E && acVar3 != null) {
                long j31 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) acVar3.e;
                this.e = Utilities.clamp(j31, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.e = Utilities.clamp(f32 * ((float) j16), this.R, 0L);
            }
            zb zbVar7 = this.f9079a;
            if (zbVar7 != null) {
                zbVar7.o(this.e, false);
            }
        }
    }

    public final void i(ac acVar, float f7) {
        long j10;
        zb zbVar;
        long j11;
        long clamp;
        long j12;
        long j13;
        long j14;
        long j15;
        if (acVar != null) {
            ac acVar2 = this.v;
            if (acVar2 != acVar && acVar2 != null) {
                if (this.f9107n == this.f9119s.indexOf(acVar)) {
                    ac acVar3 = this.v;
                    float f10 = (float) acVar3.e;
                    float f11 = acVar.h;
                    float f12 = (float) acVar.e;
                    float f13 = acVar.f8757g;
                    long j16 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((acVar3.h - acVar3.f8757g) * f10) / f12);
                    long j17 = acVar.f8756f;
                    long j18 = f7;
                    long j19 = j17 + j18;
                    if (j19 > (f10 * 1.0f) - (f11 * f12)) {
                        ac acVar4 = this.v;
                        float clamp2 = Utilities.clamp((((acVar4.h * ((float) acVar4.e)) - ((float) j17)) - ((float) j18)) / ((float) acVar.e), 1.0f, min);
                        acVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        acVar.f8757g = clamp3;
                        ac acVar5 = this.v;
                        float f14 = acVar5.h;
                        float f15 = (float) acVar5.e;
                        float f16 = acVar.h;
                        float f17 = (float) acVar.e;
                        long j20 = (f14 * f15) - (f16 * f17);
                        long j21 = (acVar5.f8757g * f15) - (clamp3 * f17);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        acVar.f8756f = Utilities.clamp(acVar.f8756f + j18, j15, j14);
                        zb zbVar2 = this.f9079a;
                        if (zbVar2 != null) {
                            zbVar2.I(acVar.f8757g, acVar.f8753a);
                            this.f9079a.M(acVar.h, acVar.f8753a);
                        }
                    } else if (j19 < j16) {
                        ac acVar6 = this.v;
                        float clamp4 = Utilities.clamp((((acVar6.f8757g * ((float) acVar6.e)) - ((float) j17)) - ((float) j18)) / ((float) acVar.e), 1.0f - min, 0.0f);
                        acVar.f8757g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        acVar.h = clamp5;
                        ac acVar7 = this.v;
                        float f18 = acVar7.h;
                        float f19 = (float) acVar7.e;
                        float f20 = (float) acVar.e;
                        long j22 = (f18 * f19) - (clamp5 * f20);
                        long j23 = (acVar7.f8757g * f19) - (acVar.f8757g * f20);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        acVar.f8756f = Utilities.clamp(acVar.f8756f + j18, j13, j12);
                        zb zbVar3 = this.f9079a;
                        if (zbVar3 != null) {
                            zbVar3.I(acVar.f8757g, acVar.f8753a);
                            this.f9079a.M(acVar.h, acVar.f8753a);
                        }
                    } else {
                        acVar.f8756f = j19;
                    }
                } else {
                    long j24 = acVar.f8756f + f7;
                    float f21 = (float) acVar.e;
                    acVar.f8756f = Utilities.clamp(j24, ((float) getBaseDuration()) - (acVar.h * f21), (-acVar.f8757g) * f21);
                }
            }
            invalidate();
            zb zbVar4 = this.f9079a;
            if (zbVar4 != null) {
                zbVar4.T(acVar.f8753a, acVar.f8756f);
            }
            boolean z10 = this.f9106m1;
            if (!z10 && (zbVar = this.f9079a) != null) {
                zbVar.u(true);
                ac acVar8 = this.v;
                if (acVar8 != acVar && acVar8 != null) {
                    long j25 = acVar.f8756f + (acVar.f8757g * ((float) acVar.e));
                    float f22 = acVar8.h;
                    float f23 = (float) acVar8.e;
                    clamp = Utilities.clamp(j25, f22 * f23, acVar8.f8757g * f23);
                } else {
                    float f24 = acVar.f8757g;
                    clamp = Utilities.clamp(f24 * ((float) j11), acVar.e, 0L);
                }
                ac acVar9 = this.v;
                if (acVar9 != acVar && acVar9 != null && Math.abs(this.e - clamp) > 400) {
                    this.f9087c1 = this.e;
                    this.f9084b1.d(1.0f, true);
                }
                zb zbVar5 = this.f9079a;
                this.e = clamp;
                zbVar5.o(clamp, false);
            } else if (z10 || this.f9118r1) {
                ac acVar10 = this.v;
                if (acVar10 != acVar && acVar10 != null) {
                    long j26 = acVar.f8756f + (acVar.f8757g * ((float) acVar.e));
                    float f25 = acVar10.h;
                    float f26 = (float) acVar10.e;
                    this.e = Utilities.clamp(j26, f25 * f26, acVar10.f8757g * f26);
                } else {
                    float f27 = acVar.f8757g;
                    this.e = Utilities.clamp(f27 * ((float) j10), acVar.e, 0L);
                }
                zb zbVar6 = this.f9079a;
                if (zbVar6 != null) {
                    zbVar6.o(this.e, false);
                }
            }
        }
    }

    public final void j(float f7) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        zb zbVar;
        long j15;
        long clamp;
        ac acVar = this.h;
        if (acVar == null) {
            long j16 = this.I;
            long clamp2 = Utilities.clamp(j16 + f7, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = (float) (clamp2 - j16);
            this.J = Utilities.clamp(this.J - (f10 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / ((float) this.H)), 1.0f, 0.0f);
            zb zbVar2 = this.f9079a;
            if (zbVar2 != null) {
                zbVar2.t(this.J);
                this.f9079a.Q(this.K);
            }
        } else if (this.G) {
            float f11 = acVar.h;
            float f12 = (float) acVar.e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j17 = (f11 * f12) - (f13 * f14);
            float f15 = acVar.f8757g;
            float f16 = this.J;
            long j18 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j19 = this.I;
            long j20 = f7;
            long j21 = j19 + j20;
            if (j21 > j17) {
                ac acVar2 = this.h;
                float clamp3 = Utilities.clamp((((acVar2.h * ((float) acVar2.e)) - ((float) j19)) - ((float) j20)) / ((float) this.H), 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                ac acVar3 = this.h;
                float f17 = acVar3.h;
                float f18 = (float) acVar3.e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j22 = (f17 * f18) - (f19 * f20);
                long j23 = (acVar3.f8757g * f18) - (clamp4 * f20);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.I = Utilities.clamp(this.I + j20, j13, j12);
                zb zbVar3 = this.f9079a;
                if (zbVar3 != null) {
                    zbVar3.t(this.J);
                    this.f9079a.Q(this.K);
                }
            } else if (j21 < j18) {
                ac acVar4 = this.h;
                float clamp5 = Utilities.clamp((((acVar4.f8757g * ((float) acVar4.e)) - ((float) j19)) - ((float) j20)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                ac acVar5 = this.h;
                float f21 = acVar5.h;
                float f22 = (float) acVar5.e;
                float f23 = (float) this.H;
                long j24 = (f21 * f22) - (clamp6 * f23);
                long j25 = (acVar5.f8757g * f22) - (this.J * f23);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.I = Utilities.clamp(this.I + j20, j11, j10);
                zb zbVar4 = this.f9079a;
                if (zbVar4 != null) {
                    zbVar4.t(this.J);
                    this.f9079a.Q(this.K);
                }
            } else {
                this.I = j21;
            }
        } else {
            long j26 = this.I + f7;
            float f24 = (float) this.H;
            this.I = Utilities.clamp(j26, ((float) getBaseDuration()) - (this.K * f24), (-this.J) * f24);
        }
        invalidate();
        zb zbVar5 = this.f9079a;
        if (zbVar5 != null) {
            zbVar5.C(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f9106m1;
        if (!z10 && (zbVar = this.f9079a) != null) {
            zbVar.u(true);
            ac acVar6 = this.h;
            if (acVar6 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f25 = acVar6.h;
                float f26 = (float) acVar6.e;
                clamp = Utilities.clamp(j27, f25 * f26, acVar6.f8757g * f26);
            } else {
                float f27 = this.J;
                clamp = Utilities.clamp(f27 * ((float) j15), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.f9087c1 = this.e;
                this.f9084b1.d(1.0f, true);
            }
            zb zbVar6 = this.f9079a;
            this.e = clamp;
            zbVar6.o(clamp, false);
        } else if (z10 || this.f9118r1) {
            ac acVar7 = this.h;
            if (acVar7 != null) {
                long j28 = this.I + (this.J * ((float) this.H));
                float f28 = acVar7.h;
                float f29 = (float) acVar7.e;
                this.e = Utilities.clamp(j28, f28 * f29, acVar7.f8757g * f29);
            } else {
                float f30 = this.J;
                this.e = Utilities.clamp(f30 * ((float) j14), this.H, 0L);
            }
            zb zbVar7 = this.f9079a;
            if (zbVar7 != null) {
                zbVar7.o(this.e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ac acVar = this.h;
        long j10 = acVar.e;
        this.f9092f = Utilities.clamp((((acVar.h + acVar.f8757g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        boolean z11 = true;
        if (z10 && this.E) {
            this.G = true;
            this.P = false;
        } else {
            this.G = false;
            if (!this.N || this.h != null) {
                z11 = false;
            }
            this.P = z11;
        }
        invalidate();
    }

    public final boolean m(float f7, boolean z10) {
        long j10;
        ac acVar;
        ac acVar2 = this.h;
        ArrayList arrayList = this.f9119s;
        if (acVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f9136y1) - this.f9133x1) / this.f9125u1;
            ac acVar3 = this.v;
            if (acVar3 != null) {
                j10 = (acVar3.f8757g * ((float) acVar3.e)) + ((float) acVar3.f8756f);
            } else {
                j10 = 0;
            }
            float f11 = f10 * ((float) min);
            if (acVar3 == null) {
                if (this.h == null) {
                    j10 = this.Q;
                } else {
                    j10 = 0;
                }
            }
            long clamp = Utilities.clamp((f11 - ((float) j10)) + ((float) this.f9092f), (float) getBaseDuration(), 0.0f);
            ac acVar4 = this.h;
            if (acVar4 != null) {
                float f12 = ((float) clamp) / ((float) acVar4.e);
                if (f12 < acVar4.f8757g || f12 > acVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (acVar.h - acVar.f8757g) * ((float) acVar.e))) {
                if (this.N && acVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.e = clamp;
                invalidate();
                zb zbVar = this.f9079a;
                if (zbVar != null) {
                    zbVar.o(clamp, z10);
                }
                ai.v3 v3Var = this.f9089d1;
                if (v3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(v3Var);
                    this.f9089d1 = null;
                }
                if (z10) {
                    ai.v3 v3Var2 = new ai.v3(this, clamp, 9);
                    this.f9089d1 = v3Var2;
                    AndroidUtilities.runOnUIThread(v3Var2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j10, long j11, float f7, float f10, float f11, boolean z10) {
        boolean z11;
        long j12;
        boolean z12;
        boolean z13;
        ac acVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        ec ecVar = this.M;
        Long l4 = null;
        if (ecVar != null) {
            ecVar.b();
            this.M = null;
        }
        long j13 = this.H;
        if (str != null) {
            this.F = str;
            this.H = j10;
            this.I = j11 - (((float) j10) * f7);
            this.J = f7;
            this.K = f10;
            this.L = f11;
            if (getMeasuredWidth() <= 0 || this.M != null || ((acVar = this.h) != null && acVar.e < 1)) {
                z11 = false;
                j12 = j13;
                z12 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f9127v1;
                int i11 = this.f9136y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.H;
                if (j14 > 2) {
                    l4 = Long.valueOf(j14);
                }
                ac acVar2 = this.h;
                if (acVar2 != null) {
                    maxScrollDuration = acVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z11 = false;
                z12 = true;
                this.M = new ec(this, false, str2, i12, dp, l4, maxScrollDuration, -1L, -1L, new wb(this, 0));
            }
            if (this.h == null) {
                this.P = z11;
                this.G = z12;
            }
        } else {
            z11 = false;
            j12 = j13;
            z12 = true;
            this.F = null;
            this.H = 1L;
            this.G = false;
        }
        if (this.F != null) {
            z13 = z12;
        } else {
            z13 = z11;
        }
        this.E = z13;
        if (j12 != j10 && this.h == null && this.f9080a0 != null) {
            this.W = z12;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(((float) j10) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f9088d0.f(this.G, z12);
            this.f9093f0.f(this.P, z12);
            this.f9086c0.f(this.E, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f7) {
        String str2;
        ac acVar = this.h;
        if (acVar == null) {
            str2 = null;
        } else {
            str2 = acVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        ac acVar2 = this.h;
        if (acVar2 != null) {
            ec ecVar = acVar2.f8755c;
            if (ecVar != null) {
                ecVar.b();
                this.h.f8755c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f9092f = 0L;
            ac acVar3 = new ac(this);
            this.h = acVar3;
            acVar3.f8754b = z10;
            acVar3.d = str;
            acVar3.e = j10;
            acVar3.f8758i = f7;
            ac.a(acVar3, false);
        } else {
            this.h = null;
            this.f9092f = 0L;
        }
        if (!this.E) {
            this.G = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        this.P0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f9136y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f9138z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f9127v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f9130w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f9133x1 = dp4;
        this.f9125u1 = (this.f9127v1 - (dp4 * 2)) - (this.f9136y1 * 2);
        ac acVar = this.h;
        if (acVar != null && acVar.d != null && acVar.f8755c == null) {
            ac.a(acVar, false);
        }
        ArrayList arrayList = this.f9119s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ac acVar2 = (ac) obj;
                if (acVar2.d != null && acVar2.f8755c == null) {
                    ac.a(acVar2, false);
                    ac.b(acVar2);
                }
            }
        }
        if (this.O != null && this.f9080a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: ei.gc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f9080a0 == null || this.W) {
                this.f9080a0 = new yb(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f9095g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        ac acVar;
        a4.d dVar = new a4.d(17);
        ArrayList arrayList = this.f9119s;
        Collections.sort(arrayList, dVar);
        if (arrayList.isEmpty()) {
            acVar = null;
        } else {
            acVar = (ac) arrayList.get(0);
        }
        this.v = acVar;
        if (acVar != null) {
            long j10 = acVar.f8756f;
        }
    }

    public void setCollage(ArrayList<a8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ec ecVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f9119s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ac acVar = (ac) arrayList2.get(i10);
            if (acVar != null && (ecVar = acVar.f8755c) != null) {
                ecVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f9116r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            yb ybVar = (yb) arrayList3.get(i11);
            if (ybVar != null) {
                ybVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f9097h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                a8 a8Var = arrayList.get(i12);
                if (a8Var.K) {
                    ac acVar2 = new ac(this);
                    acVar2.f8753a = i12;
                    acVar2.f8754b = false;
                    acVar2.d = a8Var.L.getAbsolutePath();
                    acVar2.e = a8Var.f8711h0;
                    acVar2.f8756f = a8Var.X;
                    acVar2.f8758i = a8Var.P;
                    acVar2.f8757g = a8Var.V;
                    acVar2.h = a8Var.W;
                    ac.a(acVar2, false);
                    ac.b(acVar2);
                    arrayList2.add(acVar2);
                }
            }
        }
        q();
        this.f9107n = 0;
    }

    public void setDelegate(zb zbVar) {
        this.f9079a = zbVar;
    }

    public void setMaxCount(int i10) {
        this.f9083b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f9082b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ei.gc.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        ac acVar = this.h;
        if (acVar == null) {
            return;
        }
        acVar.f8757g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        ac acVar = this.h;
        if (acVar == null) {
            return;
        }
        acVar.h = f7;
        invalidate();
    }
}
