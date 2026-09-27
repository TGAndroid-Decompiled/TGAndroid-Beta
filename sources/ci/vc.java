package ci;

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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v01;
public final class vc extends View {
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
    public final uc I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public tc M;
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
    public final bn0 W0;
    public boolean X0;
    public final ai.m3 Y0;
    public long Z0;
    public oc f5693a;
    public nc f5694a0;
    public long f5695a1;
    public Runnable f5696b;
    public int f5697b0;
    public final org.telegram.ui.Components.e6 f5698b1;
    public int f5699c;
    public final org.telegram.ui.Components.e6 f5700c0;
    public long f5701c1;
    public Runnable d;
    public final org.telegram.ui.Components.e6 f5702d0;
    public ai.j f5703d1;
    public long e;
    public final org.telegram.ui.Components.e6 f5704e0;
    public long f5705e1;
    public long f5706f;
    public final org.telegram.ui.Components.e6 f5707f0;
    public long f5708f1;
    public final org.telegram.ui.Components.e6 f5709g0;
    public float f5710g1;
    public pc h;
    public final org.telegram.ui.Components.e6 f5711h0;
    public int f5712h1;
    public final org.telegram.ui.Components.e6 f5713i0;
    public int f5714i1;
    public boolean f5715j0;
    public int f5716j1;
    public final org.telegram.ui.Components.ja f5717k0;
    public int f5718k1;
    public final org.telegram.ui.Components.na f5719l0;
    public boolean l1;
    public final org.telegram.ui.Components.na m0;
    public boolean f5720m1;
    public int f5721n;
    public final org.telegram.ui.Components.na f5722n0;
    public float f5723n1;
    public final RectF f5724o0;
    public boolean f5725o1;
    public final Path f5726p0;
    public VelocityTracker f5727p1;
    public final v01 f5728q0;
    public boolean f5729q1;
    public final ArrayList f5730r;
    public final Drawable f5731r0;
    public boolean f5732r1;
    public final ArrayList f5733s;
    public final uc f5734s0;
    public int f5735s1;
    public final RectF f5736t0;
    public final float[] f5737t1;
    public final Paint f5738u0;
    public int f5739u1;
    public pc v;
    public final Path f5740v0;
    public int f5741v1;
    public final Paint f5742w;
    public final Path f5743w0;
    public int f5744w1;
    public final Path f5745x;
    public final RectF f5746x0;
    public int f5747x1;
    public final Path f5748y;
    public final Path f5749y0;
    public int f5750y1;
    public final Paint f5751z0;
    public int f5752z1;

    public vc(Context context, ViewGroup viewGroup, wb wbVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ja jaVar) {
        super(context);
        this.f5721n = 0;
        this.f5730r = new ArrayList();
        this.f5733s = new ArrayList();
        this.f5742w = new Paint(3);
        this.f5745x = new Path();
        this.f5748y = new Path();
        this.f5697b0 = 1;
        sr srVar = sr.h;
        this.f5700c0 = new org.telegram.ui.Components.e6(this, 0L, 360L, srVar);
        this.f5702d0 = new org.telegram.ui.Components.e6(this, 360L, srVar);
        this.f5704e0 = new org.telegram.ui.Components.e6(this, 0L, 360L, srVar);
        this.f5707f0 = new org.telegram.ui.Components.e6(this, 360L, srVar);
        this.f5709g0 = new org.telegram.ui.Components.e6(this, 0L, 360L, srVar);
        this.f5711h0 = new org.telegram.ui.Components.e6(this, 0L, 360L, srVar);
        this.f5713i0 = new org.telegram.ui.Components.e6(this, 0L, 320L, srVar);
        this.f5715j0 = true;
        this.f5724o0 = new RectF();
        this.f5726p0 = new Path();
        this.f5734s0 = new uc();
        this.f5736t0 = new RectF();
        this.f5738u0 = new Paint(3);
        this.f5740v0 = new Path();
        this.f5743w0 = new Path();
        this.f5746x0 = new RectF();
        this.f5749y0 = new Path();
        Paint paint = new Paint(1);
        this.f5751z0 = paint;
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
        this.I0 = new uc();
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
        this.W0 = new bn0(getContext(), null);
        this.Z0 = -1L;
        this.f5695a1 = -1L;
        this.f5698b1 = new org.telegram.ui.Components.e6(0.0f, this, 0L, 340L, srVar);
        this.f5701c1 = -1L;
        this.f5712h1 = -1;
        this.f5714i1 = -1;
        this.f5716j1 = -1;
        this.f5718k1 = -1;
        this.f5723n1 = 1.0f;
        this.f5729q1 = true;
        this.f5732r1 = false;
        this.f5737t1 = new float[8];
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
        this.f5728q0 = new v01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f5731r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f5717k0 = jaVar;
        this.f5719l0 = new org.telegram.ui.Components.na(jaVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.na(jaVar, this, 3, false);
        this.f5722n0 = new org.telegram.ui.Components.na(jaVar, this, 4, false);
        this.Y0 = new ai.m3(this, viewGroup, e6Var, jaVar, wbVar, 5);
    }

    public static void a(final vc vcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ja jaVar, View view) {
        int i10;
        ArrayList arrayList = vcVar.f5733s;
        int i11 = vcVar.f5716j1;
        try {
            if (i11 == 2 && vcVar.N) {
                e8 e8Var = new e8(vcVar.getContext(), 0);
                e8Var.f4657b = 0.0f;
                e8Var.f4658c = 1.5f;
                e8Var.d(vcVar.V);
                e8Var.h = new Utilities.Callback(vcVar) {
                    public final vc f5187b;

                    {
                        this.f5187b = vcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                vc vcVar2 = this.f5187b;
                                vcVar2.V = floatValue;
                                oc ocVar = vcVar2.f5693a;
                                if (ocVar != null) {
                                    ocVar.l(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                vc vcVar3 = this.f5187b;
                                vcVar3.L = floatValue2;
                                oc ocVar2 = vcVar3.f5693a;
                                if (ocVar2 != null) {
                                    ocVar2.i(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                vc vcVar4 = this.f5187b;
                                vcVar4.h.f5310i = f7.floatValue();
                                oc ocVar3 = vcVar4.f5693a;
                                if (ocVar3 != null) {
                                    ocVar3.D(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(vcVar.getBaseDuration(), vcVar.getMaxScrollDuration());
                int i12 = vcVar.f5741v1;
                int i13 = vcVar.f5750y1;
                int i14 = vcVar.f5747x1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(vcVar.T, 1.0f, vcVar.f5707f0.f23890c) * ((float) vcVar.R)) + ((float) (vcVar.Q - vcVar.f5706f))) / ((float) min)) * vcVar.f5739u1) + i13 + i14);
                a80 F = a80.F(viewGroup, e6Var, vcVar);
                F.q(e8Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new lc(vcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(vcVar.f5741v1 - min2)) + AndroidUtilities.dp(18.0f), vcVar.F0.top);
                F.Z();
                F.R(jaVar, -view.getX(), -view.getY());
                vcVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && vcVar.E) {
                e8 e8Var2 = new e8(vcVar.getContext(), 0);
                e8Var2.f4657b = 0.0f;
                e8Var2.f4658c = 1.5f;
                e8Var2.d(vcVar.L);
                e8Var2.h = new Utilities.Callback(vcVar) {
                    public final vc f5187b;

                    {
                        this.f5187b = vcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                vc vcVar2 = this.f5187b;
                                vcVar2.V = floatValue;
                                oc ocVar = vcVar2.f5693a;
                                if (ocVar != null) {
                                    ocVar.l(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                vc vcVar3 = this.f5187b;
                                vcVar3.L = floatValue2;
                                oc ocVar2 = vcVar3.f5693a;
                                if (ocVar2 != null) {
                                    ocVar2.i(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                vc vcVar4 = this.f5187b;
                                vcVar4.h.f5310i = f7.floatValue();
                                oc ocVar3 = vcVar4.f5693a;
                                if (ocVar3 != null) {
                                    ocVar3.D(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(vcVar.getBaseDuration(), vcVar.getMaxScrollDuration());
                int i15 = vcVar.f5741v1;
                int i16 = vcVar.f5750y1;
                int i17 = vcVar.f5747x1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(vcVar.K, 1.0f, vcVar.f5702d0.f23890c) * ((float) vcVar.H)) + ((float) (vcVar.I - vcVar.f5706f))) / ((float) min3)) * vcVar.f5739u1) + i16 + i17);
                a80 F2 = a80.F(viewGroup, e6Var, vcVar);
                F2.q(e8Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new lc(vcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(vcVar.f5741v1 - min4)) + AndroidUtilities.dp(18.0f), vcVar.f5746x0.top);
                F2.Z();
                F2.R(jaVar, -view.getX(), -view.getY());
                vcVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && vcVar.h != null) {
                e8 e8Var3 = new e8(vcVar.getContext(), 0);
                e8Var3.f4657b = 0.0f;
                e8Var3.f4658c = 1.5f;
                e8Var3.d(vcVar.h.f5310i);
                e8Var3.h = new Utilities.Callback(vcVar) {
                    public final vc f5187b;

                    {
                        this.f5187b = vcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                vc vcVar2 = this.f5187b;
                                vcVar2.V = floatValue;
                                oc ocVar = vcVar2.f5693a;
                                if (ocVar != null) {
                                    ocVar.l(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                vc vcVar3 = this.f5187b;
                                vcVar3.L = floatValue2;
                                oc ocVar2 = vcVar3.f5693a;
                                if (ocVar2 != null) {
                                    ocVar2.i(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                vc vcVar4 = this.f5187b;
                                vcVar4.h.f5310i = f7.floatValue();
                                oc ocVar3 = vcVar4.f5693a;
                                if (ocVar3 != null) {
                                    ocVar3.D(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                a80 F3 = a80.F(viewGroup, e6Var, vcVar);
                F3.q(e8Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), vcVar.f5736t0.top);
                F3.Z();
                F3.R(jaVar, -view.getX(), -view.getY());
                vcVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = vcVar.f5718k1) >= 0 && i10 < arrayList.size()) {
                pc pcVar = (pc) arrayList.get(vcVar.f5718k1);
                e8 e8Var4 = new e8(vcVar.getContext(), 0);
                e8Var4.f4657b = 0.0f;
                e8Var4.f4658c = 1.5f;
                e8Var4.d(pcVar.f5310i);
                e8Var4.h = new ai.g3(8, vcVar, pcVar);
                a80 F4 = a80.F(viewGroup, e6Var, vcVar);
                F4.q(e8Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), pcVar.f5311j.top);
                F4.Z();
                F4.R(jaVar, -view.getX(), -view.getY());
                vcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f5707f0.e(this.P));
    }

    public long getBaseDuration() {
        pc pcVar = this.h;
        if (pcVar != null) {
            return Math.max(1L, pcVar.e);
        }
        pc pcVar2 = this.v;
        if (pcVar2 != null) {
            return Math.max(1L, pcVar2.e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f5733s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((pc) arrayList.get(i10)).f5312k.f23890c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f5702d0.e(this.G));
    }

    private float getVideoHeight() {
        pc pcVar = this.h;
        if (pcVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), pcVar.f5312k.f23890c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.vc.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        bn0 bn0Var = this.W0;
        if (bn0Var.b()) {
            int i10 = bn0Var.f23086j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f5729q1) {
                this.f5706f = Math.max(0.0f, (((i10 - this.f5750y1) - this.f5747x1) / this.f5739u1) * ((float) min));
            } else if (!this.P) {
                bn0Var.a();
                return;
            } else {
                int i11 = this.f5750y1;
                int i12 = this.f5747x1;
                float f7 = this.f5739u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f5735s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f5735s1 = i10;
        } else if (this.f5732r1) {
            this.f5732r1 = false;
            oc ocVar = this.f5693a;
            if (ocVar != null) {
                ocVar.w(false);
            }
        }
    }

    public final void d(Canvas canvas, float f7, float f10, long j3, float f11) {
        long j10;
        float f12;
        if (this.X0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = (float) Utilities.clamp(j3, getBaseDuration(), 0L);
        pc pcVar = this.v;
        if (pcVar != null) {
            f12 = (pcVar.f5309g * ((float) pcVar.e)) + ((float) pcVar.f5308f);
        } else {
            if (this.h == null) {
                j10 = this.Q;
            } else {
                j10 = 0;
            }
            f12 = (float) j10;
        }
        float f13 = (this.f5739u1 * (((clamp + f12) - ((float) this.f5706f)) / ((float) min))) + this.f5750y1 + this.f5747x1;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.vc.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f5741v1, this.f5744w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f5751z0;
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
        float x10 = org.telegram.messenger.l0.x(AndroidUtilities.dp(f15), dp, 2.0f, f11);
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
        float A = com.google.android.gms.internal.vision.e2.A(AndroidUtilities.dp(f17), dp, 2.0f, f12);
        if (this.X0) {
            f18 = 2.5f;
        }
        rectF.set(A, f20, org.telegram.messenger.l0.a(AndroidUtilities.dp(f18), dp, 2.0f, f12), f21);
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
        return this.f5697b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f5752z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f5733s.isEmpty()) {
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
        return (int) (f15 + f12 + this.f5752z1);
    }

    public int getMaxCount() {
        return this.f5697b0;
    }

    public long getMaxScrollDuration() {
        if (this.f5733s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f5752z1 + this.f5752z1, getContentHeight(), this.f5713i0.f23890c);
    }

    public final void h(float f7) {
        float f10;
        long j3;
        float f11;
        long j10;
        float f12;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        oc ocVar;
        long j16;
        long clamp;
        pc pcVar = this.h;
        if (pcVar == null && !this.E) {
            long j17 = this.Q;
            long clamp2 = Utilities.clamp(j17 + f7, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f13 = (float) (clamp2 - j17);
            this.S = Utilities.clamp(this.S - (f13 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f13 / ((float) this.R)), 1.0f, 0.0f);
            oc ocVar2 = this.f5693a;
            if (ocVar2 != null) {
                ocVar2.Y(this.S);
                this.f5693a.T(this.T);
            }
        } else if (this.P) {
            if (pcVar != null) {
                f10 = pcVar.f5309g;
                j3 = pcVar.e;
            } else {
                f10 = this.J;
                j3 = this.H;
            }
            float f14 = f10 * ((float) j3);
            if (pcVar != null) {
                f11 = pcVar.h;
                j10 = pcVar.e;
            } else {
                f11 = this.K;
                j10 = this.H;
            }
            float f15 = f11 * ((float) j10);
            if (pcVar != null) {
                f12 = (pcVar.h - pcVar.f5309g) * ((float) pcVar.e);
            } else {
                f12 = ((float) this.H) * (this.K - this.J);
            }
            float f16 = this.T;
            float f17 = (float) this.R;
            float f18 = this.S;
            long j18 = f14 - (f18 * f17);
            float min = Math.min(f16 - f18, f12 / f17);
            long j19 = this.Q;
            long j20 = f7;
            long j21 = j19 + j20;
            if (j21 > f15 - (f16 * f17)) {
                float clamp3 = Utilities.clamp(((f15 - ((float) j19)) - ((float) j20)) / ((float) this.R), 1.0f, min);
                this.T = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.S = clamp4;
                float f19 = this.T;
                float f20 = (float) this.R;
                long j22 = f15 - (f19 * f20);
                long j23 = f14 - (clamp4 * f20);
                if (j22 < j23) {
                    j14 = j23;
                    j13 = j22;
                } else {
                    j13 = j23;
                    j14 = j22;
                }
                this.Q = Utilities.clamp(this.Q + j20, j14, j13);
                oc ocVar3 = this.f5693a;
                if (ocVar3 != null) {
                    ocVar3.Y(this.S);
                    this.f5693a.T(this.T);
                }
            } else if (j21 < j18) {
                float clamp5 = Utilities.clamp(((f14 - ((float) j19)) - ((float) j20)) / ((float) this.R), 1.0f - min, 0.0f);
                this.S = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.T = clamp6;
                float f21 = (float) this.R;
                long j24 = f15 - (clamp6 * f21);
                long j25 = f14 - (this.S * f21);
                if (j24 < j25) {
                    j12 = j25;
                    j11 = j24;
                } else {
                    j11 = j25;
                    j12 = j24;
                }
                this.Q = Utilities.clamp(this.Q + j20, j12, j11);
                oc ocVar4 = this.f5693a;
                if (ocVar4 != null) {
                    ocVar4.Y(this.S);
                    this.f5693a.T(this.T);
                }
            } else {
                this.Q = j21;
            }
        } else {
            long j26 = this.Q + f7;
            float f22 = (float) this.R;
            this.Q = Utilities.clamp(j26, ((float) getBaseDuration()) - (this.T * f22), (-this.S) * f22);
        }
        invalidate();
        oc ocVar5 = this.f5693a;
        if (ocVar5 != null) {
            ocVar5.l0(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f5720m1;
        if (!z10 && (ocVar = this.f5693a) != null) {
            ocVar.w(true);
            pc pcVar2 = this.h;
            if (pcVar2 != null) {
                long j27 = this.Q + (this.S * ((float) this.R));
                float f23 = pcVar2.h;
                float f24 = (float) pcVar2.e;
                clamp = Utilities.clamp(j27, f23 * f24, pcVar2.f5309g * f24);
            } else if (this.E) {
                long j28 = this.Q + (this.S * ((float) this.R));
                float f25 = this.K;
                float f26 = (float) this.H;
                clamp = Utilities.clamp(j28, f25 * f26, this.J * f26);
            } else {
                float f27 = this.S;
                clamp = Utilities.clamp(f27 * ((float) j16), this.R, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.f5701c1 = this.e;
                this.f5698b1.d(1.0f, true);
            }
            oc ocVar6 = this.f5693a;
            this.e = clamp;
            ocVar6.n(clamp, false);
        } else if (z10 || this.f5732r1) {
            pc pcVar3 = this.h;
            if (pcVar3 != null) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f28 = pcVar3.h;
                float f29 = (float) pcVar3.e;
                this.e = Utilities.clamp(j29, f28 * f29, pcVar3.f5309g * f29);
            } else if (this.E && pcVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) pcVar3.e;
                this.e = Utilities.clamp(j30, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.e = Utilities.clamp(f32 * ((float) j15), this.R, 0L);
            }
            oc ocVar7 = this.f5693a;
            if (ocVar7 != null) {
                ocVar7.n(this.e, false);
            }
        }
    }

    public final void i(pc pcVar, float f7) {
        long j3;
        oc ocVar;
        long j10;
        long clamp;
        long j11;
        long j12;
        long j13;
        long j14;
        if (pcVar != null) {
            pc pcVar2 = this.v;
            if (pcVar2 != pcVar && pcVar2 != null) {
                if (this.f5721n == this.f5733s.indexOf(pcVar)) {
                    pc pcVar3 = this.v;
                    float f10 = (float) pcVar3.e;
                    float f11 = pcVar.h;
                    float f12 = (float) pcVar.e;
                    float f13 = pcVar.f5309g;
                    long j15 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((pcVar3.h - pcVar3.f5309g) * f10) / f12);
                    long j16 = pcVar.f5308f;
                    long j17 = f7;
                    long j18 = j16 + j17;
                    if (j18 > (f10 * 1.0f) - (f11 * f12)) {
                        pc pcVar4 = this.v;
                        float clamp2 = Utilities.clamp((((pcVar4.h * ((float) pcVar4.e)) - ((float) j16)) - ((float) j17)) / ((float) pcVar.e), 1.0f, min);
                        pcVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        pcVar.f5309g = clamp3;
                        pc pcVar5 = this.v;
                        float f14 = pcVar5.h;
                        float f15 = (float) pcVar5.e;
                        float f16 = pcVar.h;
                        float f17 = (float) pcVar.e;
                        long j19 = (f14 * f15) - (f16 * f17);
                        long j20 = (pcVar5.f5309g * f15) - (clamp3 * f17);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        pcVar.f5308f = Utilities.clamp(pcVar.f5308f + j17, j14, j13);
                        oc ocVar2 = this.f5693a;
                        if (ocVar2 != null) {
                            ocVar2.R(pcVar.f5309g, pcVar.f5305a);
                            this.f5693a.Z(pcVar.h, pcVar.f5305a);
                        }
                    } else if (j18 < j15) {
                        pc pcVar6 = this.v;
                        float clamp4 = Utilities.clamp((((pcVar6.f5309g * ((float) pcVar6.e)) - ((float) j16)) - ((float) j17)) / ((float) pcVar.e), 1.0f - min, 0.0f);
                        pcVar.f5309g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        pcVar.h = clamp5;
                        pc pcVar7 = this.v;
                        float f18 = pcVar7.h;
                        float f19 = (float) pcVar7.e;
                        float f20 = (float) pcVar.e;
                        long j21 = (f18 * f19) - (clamp5 * f20);
                        long j22 = (pcVar7.f5309g * f19) - (pcVar.f5309g * f20);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        pcVar.f5308f = Utilities.clamp(pcVar.f5308f + j17, j12, j11);
                        oc ocVar3 = this.f5693a;
                        if (ocVar3 != null) {
                            ocVar3.R(pcVar.f5309g, pcVar.f5305a);
                            this.f5693a.Z(pcVar.h, pcVar.f5305a);
                        }
                    } else {
                        pcVar.f5308f = j18;
                    }
                } else {
                    long j23 = pcVar.f5308f + f7;
                    float f21 = (float) pcVar.e;
                    pcVar.f5308f = Utilities.clamp(j23, ((float) getBaseDuration()) - (pcVar.h * f21), (-pcVar.f5309g) * f21);
                }
            }
            invalidate();
            oc ocVar4 = this.f5693a;
            if (ocVar4 != null) {
                ocVar4.i0(pcVar.f5305a, pcVar.f5308f);
            }
            boolean z10 = this.f5720m1;
            if (!z10 && (ocVar = this.f5693a) != null) {
                ocVar.w(true);
                pc pcVar8 = this.v;
                if (pcVar8 != pcVar && pcVar8 != null) {
                    long j24 = pcVar.f5308f + (pcVar.f5309g * ((float) pcVar.e));
                    float f22 = pcVar8.h;
                    float f23 = (float) pcVar8.e;
                    clamp = Utilities.clamp(j24, f22 * f23, pcVar8.f5309g * f23);
                } else {
                    float f24 = pcVar.f5309g;
                    clamp = Utilities.clamp(f24 * ((float) j10), pcVar.e, 0L);
                }
                pc pcVar9 = this.v;
                if (pcVar9 != pcVar && pcVar9 != null && Math.abs(this.e - clamp) > 400) {
                    this.f5701c1 = this.e;
                    this.f5698b1.d(1.0f, true);
                }
                oc ocVar5 = this.f5693a;
                this.e = clamp;
                ocVar5.n(clamp, false);
            } else if (z10 || this.f5732r1) {
                pc pcVar10 = this.v;
                if (pcVar10 != pcVar && pcVar10 != null) {
                    long j25 = pcVar.f5308f + (pcVar.f5309g * ((float) pcVar.e));
                    float f25 = pcVar10.h;
                    float f26 = (float) pcVar10.e;
                    this.e = Utilities.clamp(j25, f25 * f26, pcVar10.f5309g * f26);
                } else {
                    float f27 = pcVar.f5309g;
                    this.e = Utilities.clamp(f27 * ((float) j3), pcVar.e, 0L);
                }
                oc ocVar6 = this.f5693a;
                if (ocVar6 != null) {
                    ocVar6.n(this.e, false);
                }
            }
        }
    }

    public final void j(float f7) {
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        oc ocVar;
        long j14;
        long clamp;
        pc pcVar = this.h;
        if (pcVar == null) {
            long j15 = this.I;
            long clamp2 = Utilities.clamp(j15 + f7, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = (float) (clamp2 - j15);
            this.J = Utilities.clamp(this.J - (f10 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / ((float) this.H)), 1.0f, 0.0f);
            oc ocVar2 = this.f5693a;
            if (ocVar2 != null) {
                ocVar2.u(this.J);
                this.f5693a.h0(this.K);
            }
        } else if (this.G) {
            float f11 = pcVar.h;
            float f12 = (float) pcVar.e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j16 = (f11 * f12) - (f13 * f14);
            float f15 = pcVar.f5309g;
            float f16 = this.J;
            long j17 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j18 = this.I;
            long j19 = f7;
            long j20 = j18 + j19;
            if (j20 > j16) {
                pc pcVar2 = this.h;
                float clamp3 = Utilities.clamp((((pcVar2.h * ((float) pcVar2.e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                pc pcVar3 = this.h;
                float f17 = pcVar3.h;
                float f18 = (float) pcVar3.e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j21 = (f17 * f18) - (f19 * f20);
                long j22 = (pcVar3.f5309g * f18) - (clamp4 * f20);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.I = Utilities.clamp(this.I + j19, j12, j11);
                oc ocVar3 = this.f5693a;
                if (ocVar3 != null) {
                    ocVar3.u(this.J);
                    this.f5693a.h0(this.K);
                }
            } else if (j20 < j17) {
                pc pcVar4 = this.h;
                float clamp5 = Utilities.clamp((((pcVar4.f5309g * ((float) pcVar4.e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                pc pcVar5 = this.h;
                float f21 = pcVar5.h;
                float f22 = (float) pcVar5.e;
                float f23 = (float) this.H;
                long j23 = (f21 * f22) - (clamp6 * f23);
                long j24 = (pcVar5.f5309g * f22) - (this.J * f23);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.I = Utilities.clamp(this.I + j19, j10, j3);
                oc ocVar4 = this.f5693a;
                if (ocVar4 != null) {
                    ocVar4.u(this.J);
                    this.f5693a.h0(this.K);
                }
            } else {
                this.I = j20;
            }
        } else {
            long j25 = this.I + f7;
            float f24 = (float) this.H;
            this.I = Utilities.clamp(j25, ((float) getBaseDuration()) - (this.K * f24), (-this.J) * f24);
        }
        invalidate();
        oc ocVar5 = this.f5693a;
        if (ocVar5 != null) {
            ocVar5.J(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f5720m1;
        if (!z10 && (ocVar = this.f5693a) != null) {
            ocVar.w(true);
            pc pcVar6 = this.h;
            if (pcVar6 != null) {
                long j26 = this.I + (this.J * ((float) this.H));
                float f25 = pcVar6.h;
                float f26 = (float) pcVar6.e;
                clamp = Utilities.clamp(j26, f25 * f26, pcVar6.f5309g * f26);
            } else {
                float f27 = this.J;
                clamp = Utilities.clamp(f27 * ((float) j14), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.f5701c1 = this.e;
                this.f5698b1.d(1.0f, true);
            }
            oc ocVar6 = this.f5693a;
            this.e = clamp;
            ocVar6.n(clamp, false);
        } else if (z10 || this.f5732r1) {
            pc pcVar7 = this.h;
            if (pcVar7 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f28 = pcVar7.h;
                float f29 = (float) pcVar7.e;
                this.e = Utilities.clamp(j27, f28 * f29, pcVar7.f5309g * f29);
            } else {
                float f30 = this.J;
                this.e = Utilities.clamp(f30 * ((float) j13), this.H, 0L);
            }
            oc ocVar7 = this.f5693a;
            if (ocVar7 != null) {
                ocVar7.n(this.e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        pc pcVar = this.h;
        long j3 = pcVar.e;
        this.f5706f = Utilities.clamp((((pcVar.h + pcVar.f5309g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        boolean z11 = true;
        if (z10 && this.E) {
            this.G = true;
            this.P = false;
        } else {
            this.G = false;
            this.P = (this.N && this.h == null) ? false : false;
        }
        invalidate();
    }

    public final boolean m(float f7, boolean z10) {
        long j3;
        pc pcVar;
        pc pcVar2 = this.h;
        ArrayList arrayList = this.f5733s;
        if (pcVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f5750y1) - this.f5747x1) / this.f5739u1;
            pc pcVar3 = this.v;
            if (pcVar3 != null) {
                j3 = (pcVar3.f5309g * ((float) pcVar3.e)) + ((float) pcVar3.f5308f);
            } else {
                j3 = 0;
            }
            float f11 = f10 * ((float) min);
            if (pcVar3 == null) {
                if (this.h == null) {
                    j3 = this.Q;
                } else {
                    j3 = 0;
                }
            }
            long clamp = Utilities.clamp((f11 - ((float) j3)) + ((float) this.f5706f), (float) getBaseDuration(), 0.0f);
            pc pcVar4 = this.h;
            if (pcVar4 != null) {
                float f12 = ((float) clamp) / ((float) pcVar4.e);
                if (f12 < pcVar4.f5309g || f12 > pcVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (pcVar.h - pcVar.f5309g) * ((float) pcVar.e))) {
                if (this.N && pcVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.e = clamp;
                invalidate();
                oc ocVar = this.f5693a;
                if (ocVar != null) {
                    ocVar.n(clamp, z10);
                }
                ai.j jVar = this.f5703d1;
                if (jVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(jVar);
                    this.f5703d1 = null;
                }
                if (z10) {
                    ai.j jVar2 = new ai.j(this, clamp, 7);
                    this.f5703d1 = jVar2;
                    AndroidUtilities.runOnUIThread(jVar2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j3, long j10, float f7, float f10, float f11, boolean z10) {
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        pc pcVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        tc tcVar = this.M;
        Long l4 = null;
        if (tcVar != null) {
            tcVar.b();
            this.M = null;
        }
        long j12 = this.H;
        if (str != null) {
            this.F = str;
            this.H = j3;
            this.I = j10 - (((float) j3) * f7);
            this.J = f7;
            this.K = f10;
            this.L = f11;
            if (getMeasuredWidth() <= 0 || this.M != null || ((pcVar = this.h) != null && pcVar.e < 1)) {
                j11 = j12;
                z13 = false;
                z11 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f5741v1;
                int i11 = this.f5750y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j13 = this.H;
                if (j13 > 2) {
                    l4 = Long.valueOf(j13);
                }
                pc pcVar2 = this.h;
                if (pcVar2 != null) {
                    maxScrollDuration = pcVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z13 = false;
                z11 = true;
                this.M = new tc(this, false, str2, i12, dp, l4, maxScrollDuration, -1L, -1L, new lc(this, 0));
            }
            if (this.h == null) {
                this.P = z13;
                this.G = z11;
            }
        } else {
            j11 = j12;
            z11 = true;
            this.F = null;
            this.H = 1L;
            this.G = false;
        }
        if (this.F != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.E = z12;
        if (j11 != j3 && this.h == null && this.f5694a0 != null) {
            this.W = z11;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(((float) j3) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f5702d0.f(this.G, z11);
            this.f5707f0.f(this.P, z11);
            this.f5700c0.f(this.E, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f7) {
        String str2;
        pc pcVar = this.h;
        if (pcVar == null) {
            str2 = null;
        } else {
            str2 = pcVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        pc pcVar2 = this.h;
        if (pcVar2 != null) {
            tc tcVar = pcVar2.f5307c;
            if (tcVar != null) {
                tcVar.b();
                this.h.f5307c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f5706f = 0L;
            pc pcVar3 = new pc(this);
            this.h = pcVar3;
            pcVar3.f5306b = z10;
            pcVar3.d = str;
            pcVar3.e = j3;
            pcVar3.f5310i = f7;
            pc.a(pcVar3, false);
        } else {
            this.h = null;
            this.f5706f = 0L;
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
        this.f5750y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f5752z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f5741v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f5744w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f5747x1 = dp4;
        this.f5739u1 = (this.f5741v1 - (dp4 * 2)) - (this.f5750y1 * 2);
        pc pcVar = this.h;
        if (pcVar != null && pcVar.d != null && pcVar.f5307c == null) {
            pc.a(pcVar, false);
        }
        ArrayList arrayList = this.f5733s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                pc pcVar2 = (pc) obj;
                if (pcVar2.d != null && pcVar2.f5307c == null) {
                    pc.a(pcVar2, false);
                    pc.b(pcVar2);
                }
            }
        }
        if (this.O != null && this.f5694a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.vc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f5694a0 == null || this.W) {
                this.f5694a0 = new nc(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f5709g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        pc pcVar;
        a4.e eVar = new a4.e(11);
        ArrayList arrayList = this.f5733s;
        Collections.sort(arrayList, eVar);
        if (arrayList.isEmpty()) {
            pcVar = null;
        } else {
            pcVar = (pc) arrayList.get(0);
        }
        this.v = pcVar;
        if (pcVar != null) {
            long j3 = pcVar.f5308f;
        }
    }

    public void setCollage(ArrayList<k8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        tc tcVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f5733s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            pc pcVar = (pc) arrayList2.get(i10);
            if (pcVar != null && (tcVar = pcVar.f5307c) != null) {
                tcVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f5730r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            nc ncVar = (nc) arrayList3.get(i11);
            if (ncVar != null) {
                ncVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f5711h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                k8 k8Var = arrayList.get(i12);
                if (k8Var.K) {
                    pc pcVar2 = new pc(this);
                    pcVar2.f5305a = i12;
                    pcVar2.f5306b = false;
                    pcVar2.d = k8Var.L.getAbsolutePath();
                    pcVar2.e = k8Var.f4937h0;
                    pcVar2.f5308f = k8Var.X;
                    pcVar2.f5310i = k8Var.P;
                    pcVar2.f5309g = k8Var.V;
                    pcVar2.h = k8Var.W;
                    pc.a(pcVar2, false);
                    pc.b(pcVar2);
                    arrayList2.add(pcVar2);
                }
            }
        }
        q();
        this.f5721n = 0;
    }

    public void setDelegate(oc ocVar) {
        this.f5693a = ocVar;
    }

    public void setMaxCount(int i10) {
        this.f5697b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f5696b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ci.vc.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        pc pcVar = this.h;
        if (pcVar == null) {
            return;
        }
        pcVar.f5309g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        pc pcVar = this.h;
        if (pcVar == null) {
            return;
        }
        pcVar.h = f7;
        invalidate();
    }
}
