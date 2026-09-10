package bi;

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
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xm0;
public final class me extends View {
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
    public final le I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public ke M;
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
    public final xm0 W0;
    public boolean X0;
    public final ya Y0;
    public long Z0;
    public ge f3148a;
    public fe f3149a0;
    public long f3150a1;
    public Runnable f3151b;
    public int f3152b0;
    public final org.telegram.ui.Components.d6 f3153b1;
    public int f3154c;
    public final org.telegram.ui.Components.d6 f3155c0;
    public long f3156c1;
    public Runnable d;
    public final org.telegram.ui.Components.d6 f3157d0;
    public va f3158d1;
    public long e;
    public final org.telegram.ui.Components.d6 f3159e0;
    public long f3160e1;
    public long f3161f;
    public final org.telegram.ui.Components.d6 f3162f0;
    public long f3163f1;
    public final org.telegram.ui.Components.d6 f3164g0;
    public float f3165g1;
    public he h;
    public final org.telegram.ui.Components.d6 f3166h0;
    public int f3167h1;
    public final org.telegram.ui.Components.d6 f3168i0;
    public int f3169i1;
    public boolean f3170j0;
    public int f3171j1;
    public final org.telegram.ui.Components.ia f3172k0;
    public int f3173k1;
    public final org.telegram.ui.Components.ma f3174l0;
    public boolean l1;
    public final org.telegram.ui.Components.ma m0;
    public boolean f3175m1;
    public int f3176n;
    public final org.telegram.ui.Components.ma f3177n0;
    public float f3178n1;
    public final RectF f3179o0;
    public boolean f3180o1;
    public final Path f3181p0;
    public VelocityTracker f3182p1;
    public final t01 f3183q0;
    public boolean f3184q1;
    public final ArrayList f3185r;
    public final Drawable f3186r0;
    public boolean f3187r1;
    public final ArrayList f3188s;
    public final le f3189s0;
    public int f3190s1;
    public final RectF f3191t0;
    public final float[] f3192t1;
    public final Paint f3193u0;
    public int f3194u1;
    public he v;
    public final Path f3195v0;
    public int f3196v1;
    public final Paint f3197w;
    public final Path f3198w0;
    public int f3199w1;
    public final Path f3200x;
    public final RectF f3201x0;
    public int f3202x1;
    public final Path f3203y;
    public final Path f3204y0;
    public int f3205y1;
    public final Paint f3206z0;
    public int f3207z1;

    public me(Context context, ViewGroup viewGroup, kd kdVar, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ia iaVar) {
        super(context);
        this.f3176n = 0;
        this.f3185r = new ArrayList();
        this.f3188s = new ArrayList();
        this.f3197w = new Paint(3);
        this.f3200x = new Path();
        this.f3203y = new Path();
        this.f3152b0 = 1;
        wr wrVar = wr.h;
        this.f3155c0 = new org.telegram.ui.Components.d6(this, 0L, 360L, wrVar);
        this.f3157d0 = new org.telegram.ui.Components.d6(this, 360L, wrVar);
        this.f3159e0 = new org.telegram.ui.Components.d6(this, 0L, 360L, wrVar);
        this.f3162f0 = new org.telegram.ui.Components.d6(this, 360L, wrVar);
        this.f3164g0 = new org.telegram.ui.Components.d6(this, 0L, 360L, wrVar);
        this.f3166h0 = new org.telegram.ui.Components.d6(this, 0L, 360L, wrVar);
        this.f3168i0 = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.f3170j0 = true;
        this.f3179o0 = new RectF();
        this.f3181p0 = new Path();
        this.f3189s0 = new le();
        this.f3191t0 = new RectF();
        this.f3193u0 = new Paint(3);
        this.f3195v0 = new Path();
        this.f3198w0 = new Path();
        this.f3201x0 = new RectF();
        this.f3204y0 = new Path();
        Paint paint = new Paint(1);
        this.f3206z0 = paint;
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
        this.I0 = new le();
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
        this.W0 = new xm0(getContext(), null);
        this.Z0 = -1L;
        this.f3150a1 = -1L;
        this.f3153b1 = new org.telegram.ui.Components.d6(0.0f, this, 0L, 340L, wrVar);
        this.f3156c1 = -1L;
        this.f3167h1 = -1;
        this.f3169i1 = -1;
        this.f3171j1 = -1;
        this.f3173k1 = -1;
        this.f3178n1 = 1.0f;
        this.f3184q1 = true;
        this.f3187r1 = false;
        this.f3192t1 = new float[8];
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
        this.f3183q0 = new t01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f3186r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f3172k0 = iaVar;
        this.f3174l0 = new org.telegram.ui.Components.ma(iaVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.ma(iaVar, this, 3, false);
        this.f3177n0 = new org.telegram.ui.Components.ma(iaVar, this, 4, false);
        this.Y0 = new ya(this, viewGroup, f6Var, iaVar, kdVar, 1);
    }

    public static void a(final me meVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ia iaVar, View view) {
        int i10;
        ArrayList arrayList = meVar.f3188s;
        int i11 = meVar.f3171j1;
        try {
            if (i11 == 2 && meVar.N) {
                k9 k9Var = new k9(meVar.getContext(), 0);
                k9Var.f2993b = 0.0f;
                k9Var.f2994c = 1.5f;
                k9Var.d(meVar.V);
                k9Var.h = new Utilities.Callback(meVar) {
                    public final me f2678b;

                    {
                        this.f2678b = meVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                me meVar2 = this.f2678b;
                                meVar2.V = floatValue;
                                ge geVar = meVar2.f3148a;
                                if (geVar != null) {
                                    geVar.m(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                me meVar3 = this.f2678b;
                                meVar3.L = floatValue2;
                                ge geVar2 = meVar3.f3148a;
                                if (geVar2 != null) {
                                    geVar2.i(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                me meVar4 = this.f2678b;
                                meVar4.h.f2818i = f7.floatValue();
                                ge geVar3 = meVar4.f3148a;
                                if (geVar3 != null) {
                                    geVar3.H(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(meVar.getBaseDuration(), meVar.getMaxScrollDuration());
                int i12 = meVar.f3196v1;
                int i13 = meVar.f3205y1;
                int i14 = meVar.f3202x1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(meVar.T, 1.0f, meVar.f3162f0.f22295c) * ((float) meVar.R)) + ((float) (meVar.Q - meVar.f3161f))) / ((float) min)) * meVar.f3194u1) + i13 + i14);
                w70 F = w70.F(viewGroup, f6Var, meVar);
                F.q(k9Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new de(meVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(meVar.f3196v1 - min2)) + AndroidUtilities.dp(18.0f), meVar.F0.top);
                F.Z();
                F.Q(iaVar, -view.getX(), -view.getY());
                meVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && meVar.E) {
                k9 k9Var2 = new k9(meVar.getContext(), 0);
                k9Var2.f2993b = 0.0f;
                k9Var2.f2994c = 1.5f;
                k9Var2.d(meVar.L);
                k9Var2.h = new Utilities.Callback(meVar) {
                    public final me f2678b;

                    {
                        this.f2678b = meVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                me meVar2 = this.f2678b;
                                meVar2.V = floatValue;
                                ge geVar = meVar2.f3148a;
                                if (geVar != null) {
                                    geVar.m(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                me meVar3 = this.f2678b;
                                meVar3.L = floatValue2;
                                ge geVar2 = meVar3.f3148a;
                                if (geVar2 != null) {
                                    geVar2.i(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                me meVar4 = this.f2678b;
                                meVar4.h.f2818i = f7.floatValue();
                                ge geVar3 = meVar4.f3148a;
                                if (geVar3 != null) {
                                    geVar3.H(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(meVar.getBaseDuration(), meVar.getMaxScrollDuration());
                int i15 = meVar.f3196v1;
                int i16 = meVar.f3205y1;
                int i17 = meVar.f3202x1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(meVar.K, 1.0f, meVar.f3157d0.f22295c) * ((float) meVar.H)) + ((float) (meVar.I - meVar.f3161f))) / ((float) min3)) * meVar.f3194u1) + i16 + i17);
                w70 F2 = w70.F(viewGroup, f6Var, meVar);
                F2.q(k9Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new de(meVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(meVar.f3196v1 - min4)) + AndroidUtilities.dp(18.0f), meVar.f3201x0.top);
                F2.Z();
                F2.Q(iaVar, -view.getX(), -view.getY());
                meVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && meVar.h != null) {
                k9 k9Var3 = new k9(meVar.getContext(), 0);
                k9Var3.f2993b = 0.0f;
                k9Var3.f2994c = 1.5f;
                k9Var3.d(meVar.h.f2818i);
                k9Var3.h = new Utilities.Callback(meVar) {
                    public final me f2678b;

                    {
                        this.f2678b = meVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                me meVar2 = this.f2678b;
                                meVar2.V = floatValue;
                                ge geVar = meVar2.f3148a;
                                if (geVar != null) {
                                    geVar.m(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                me meVar3 = this.f2678b;
                                meVar3.L = floatValue2;
                                ge geVar2 = meVar3.f3148a;
                                if (geVar2 != null) {
                                    geVar2.i(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                me meVar4 = this.f2678b;
                                meVar4.h.f2818i = f7.floatValue();
                                ge geVar3 = meVar4.f3148a;
                                if (geVar3 != null) {
                                    geVar3.H(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                w70 F3 = w70.F(viewGroup, f6Var, meVar);
                F3.q(k9Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), meVar.f3191t0.top);
                F3.Z();
                F3.Q(iaVar, -view.getX(), -view.getY());
                meVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = meVar.f3173k1) >= 0 && i10 < arrayList.size()) {
                he heVar = (he) arrayList.get(meVar.f3173k1);
                k9 k9Var4 = new k9(meVar.getContext(), 0);
                k9Var4.f2993b = 0.0f;
                k9Var4.f2994c = 1.5f;
                k9Var4.d(heVar.f2818i);
                k9Var4.h = new y2(7, meVar, heVar);
                w70 F4 = w70.F(viewGroup, f6Var, meVar);
                F4.q(k9Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), heVar.f2819j.top);
                F4.Z();
                F4.Q(iaVar, -view.getX(), -view.getY());
                meVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f3162f0.e(this.P));
    }

    public long getBaseDuration() {
        he heVar = this.h;
        if (heVar != null) {
            return Math.max(1L, heVar.e);
        }
        he heVar2 = this.v;
        if (heVar2 != null) {
            return Math.max(1L, heVar2.e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f3188s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((he) arrayList.get(i10)).f2820k.f22295c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f3157d0.e(this.G));
    }

    private float getVideoHeight() {
        he heVar = this.h;
        if (heVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), heVar.f2820k.f22295c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: bi.me.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        xm0 xm0Var = this.W0;
        if (xm0Var.b()) {
            int i10 = xm0Var.f29095j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f3184q1) {
                this.f3161f = Math.max(0.0f, (((i10 - this.f3205y1) - this.f3202x1) / this.f3194u1) * ((float) min));
            } else if (!this.P) {
                xm0Var.a();
                return;
            } else {
                int i11 = this.f3205y1;
                int i12 = this.f3202x1;
                float f7 = this.f3194u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f3190s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f3190s1 = i10;
        } else if (this.f3187r1) {
            this.f3187r1 = false;
            ge geVar = this.f3148a;
            if (geVar != null) {
                geVar.z(false);
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
        he heVar = this.v;
        if (heVar != null) {
            f12 = (heVar.f2817g * ((float) heVar.e)) + ((float) heVar.f2816f);
        } else {
            if (this.h == null) {
                j10 = this.Q;
            } else {
                j10 = 0;
            }
            f12 = (float) j10;
        }
        float f13 = (this.f3194u1 * (((clamp + f12) - ((float) this.f3161f)) / ((float) min))) + this.f3205y1 + this.f3202x1;
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
        throw new UnsupportedOperationException("Method not decompiled: bi.me.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f3196v1, this.f3199w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f3206z0;
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
        float y3 = org.telegram.messenger.a2.y(AndroidUtilities.dp(f15), dp, 2.0f, f11);
        float f19 = f7 + f10;
        float f20 = (f19 - dp2) / 2.0f;
        if (this.X0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float f21 = (f19 + dp2) / 2.0f;
        rectF.set(y3, f20, f11 - ((AndroidUtilities.dp(f16) + dp) / 2.0f), f21);
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
        rectF.set(A, f20, org.telegram.messenger.a2.a(AndroidUtilities.dp(f18), dp, 2.0f, f12), f21);
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
        return this.f3152b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f3207z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f3188s.isEmpty()) {
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
        return (int) (f15 + f12 + this.f3207z1);
    }

    public int getMaxCount() {
        return this.f3152b0;
    }

    public long getMaxScrollDuration() {
        if (this.f3188s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f3207z1 + this.f3207z1, getContentHeight(), this.f3168i0.f22295c);
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
        ge geVar;
        long j16;
        long clamp;
        he heVar = this.h;
        if (heVar == null && !this.E) {
            long j17 = this.Q;
            long clamp2 = Utilities.clamp(j17 + f7, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f13 = (float) (clamp2 - j17);
            this.S = Utilities.clamp(this.S - (f13 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f13 / ((float) this.R)), 1.0f, 0.0f);
            ge geVar2 = this.f3148a;
            if (geVar2 != null) {
                geVar2.d0(this.S);
                this.f3148a.X(this.T);
            }
        } else if (this.P) {
            if (heVar != null) {
                f10 = heVar.f2817g;
                j3 = heVar.e;
            } else {
                f10 = this.J;
                j3 = this.H;
            }
            float f14 = f10 * ((float) j3);
            if (heVar != null) {
                f11 = heVar.h;
                j10 = heVar.e;
            } else {
                f11 = this.K;
                j10 = this.H;
            }
            float f15 = f11 * ((float) j10);
            if (heVar != null) {
                f12 = (heVar.h - heVar.f2817g) * ((float) heVar.e);
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
                ge geVar3 = this.f3148a;
                if (geVar3 != null) {
                    geVar3.d0(this.S);
                    this.f3148a.X(this.T);
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
                ge geVar4 = this.f3148a;
                if (geVar4 != null) {
                    geVar4.d0(this.S);
                    this.f3148a.X(this.T);
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
        ge geVar5 = this.f3148a;
        if (geVar5 != null) {
            geVar5.q0(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f3175m1;
        if (!z10 && (geVar = this.f3148a) != null) {
            geVar.z(true);
            he heVar2 = this.h;
            if (heVar2 != null) {
                long j27 = this.Q + (this.S * ((float) this.R));
                float f23 = heVar2.h;
                float f24 = (float) heVar2.e;
                clamp = Utilities.clamp(j27, f23 * f24, heVar2.f2817g * f24);
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
                this.f3156c1 = this.e;
                this.f3153b1.d(1.0f, true);
            }
            ge geVar6 = this.f3148a;
            this.e = clamp;
            geVar6.n(clamp, false);
        } else if (z10 || this.f3187r1) {
            he heVar3 = this.h;
            if (heVar3 != null) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f28 = heVar3.h;
                float f29 = (float) heVar3.e;
                this.e = Utilities.clamp(j29, f28 * f29, heVar3.f2817g * f29);
            } else if (this.E && heVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) heVar3.e;
                this.e = Utilities.clamp(j30, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.e = Utilities.clamp(f32 * ((float) j15), this.R, 0L);
            }
            ge geVar7 = this.f3148a;
            if (geVar7 != null) {
                geVar7.n(this.e, false);
            }
        }
    }

    public final void i(he heVar, float f7) {
        long j3;
        ge geVar;
        long j10;
        long clamp;
        long j11;
        long j12;
        long j13;
        long j14;
        if (heVar != null) {
            he heVar2 = this.v;
            if (heVar2 != heVar && heVar2 != null) {
                if (this.f3176n == this.f3188s.indexOf(heVar)) {
                    he heVar3 = this.v;
                    float f10 = (float) heVar3.e;
                    float f11 = heVar.h;
                    float f12 = (float) heVar.e;
                    float f13 = heVar.f2817g;
                    long j15 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((heVar3.h - heVar3.f2817g) * f10) / f12);
                    long j16 = heVar.f2816f;
                    long j17 = f7;
                    long j18 = j16 + j17;
                    if (j18 > (f10 * 1.0f) - (f11 * f12)) {
                        he heVar4 = this.v;
                        float clamp2 = Utilities.clamp((((heVar4.h * ((float) heVar4.e)) - ((float) j16)) - ((float) j17)) / ((float) heVar.e), 1.0f, min);
                        heVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        heVar.f2817g = clamp3;
                        he heVar5 = this.v;
                        float f14 = heVar5.h;
                        float f15 = (float) heVar5.e;
                        float f16 = heVar.h;
                        float f17 = (float) heVar.e;
                        long j19 = (f14 * f15) - (f16 * f17);
                        long j20 = (heVar5.f2817g * f15) - (clamp3 * f17);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        heVar.f2816f = Utilities.clamp(heVar.f2816f + j17, j14, j13);
                        ge geVar2 = this.f3148a;
                        if (geVar2 != null) {
                            geVar2.V(heVar.f2817g, heVar.f2813a);
                            this.f3148a.f0(heVar.h, heVar.f2813a);
                        }
                    } else if (j18 < j15) {
                        he heVar6 = this.v;
                        float clamp4 = Utilities.clamp((((heVar6.f2817g * ((float) heVar6.e)) - ((float) j16)) - ((float) j17)) / ((float) heVar.e), 1.0f - min, 0.0f);
                        heVar.f2817g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        heVar.h = clamp5;
                        he heVar7 = this.v;
                        float f18 = heVar7.h;
                        float f19 = (float) heVar7.e;
                        float f20 = (float) heVar.e;
                        long j21 = (f18 * f19) - (clamp5 * f20);
                        long j22 = (heVar7.f2817g * f19) - (heVar.f2817g * f20);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        heVar.f2816f = Utilities.clamp(heVar.f2816f + j17, j12, j11);
                        ge geVar3 = this.f3148a;
                        if (geVar3 != null) {
                            geVar3.V(heVar.f2817g, heVar.f2813a);
                            this.f3148a.f0(heVar.h, heVar.f2813a);
                        }
                    } else {
                        heVar.f2816f = j18;
                    }
                } else {
                    long j23 = heVar.f2816f + f7;
                    float f21 = (float) heVar.e;
                    heVar.f2816f = Utilities.clamp(j23, ((float) getBaseDuration()) - (heVar.h * f21), (-heVar.f2817g) * f21);
                }
            }
            invalidate();
            ge geVar4 = this.f3148a;
            if (geVar4 != null) {
                geVar4.n0(heVar.f2813a, heVar.f2816f);
            }
            boolean z10 = this.f3175m1;
            if (!z10 && (geVar = this.f3148a) != null) {
                geVar.z(true);
                he heVar8 = this.v;
                if (heVar8 != heVar && heVar8 != null) {
                    long j24 = heVar.f2816f + (heVar.f2817g * ((float) heVar.e));
                    float f22 = heVar8.h;
                    float f23 = (float) heVar8.e;
                    clamp = Utilities.clamp(j24, f22 * f23, heVar8.f2817g * f23);
                } else {
                    float f24 = heVar.f2817g;
                    clamp = Utilities.clamp(f24 * ((float) j10), heVar.e, 0L);
                }
                he heVar9 = this.v;
                if (heVar9 != heVar && heVar9 != null && Math.abs(this.e - clamp) > 400) {
                    this.f3156c1 = this.e;
                    this.f3153b1.d(1.0f, true);
                }
                ge geVar5 = this.f3148a;
                this.e = clamp;
                geVar5.n(clamp, false);
            } else if (z10 || this.f3187r1) {
                he heVar10 = this.v;
                if (heVar10 != heVar && heVar10 != null) {
                    long j25 = heVar.f2816f + (heVar.f2817g * ((float) heVar.e));
                    float f25 = heVar10.h;
                    float f26 = (float) heVar10.e;
                    this.e = Utilities.clamp(j25, f25 * f26, heVar10.f2817g * f26);
                } else {
                    float f27 = heVar.f2817g;
                    this.e = Utilities.clamp(f27 * ((float) j3), heVar.e, 0L);
                }
                ge geVar6 = this.f3148a;
                if (geVar6 != null) {
                    geVar6.n(this.e, false);
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
        ge geVar;
        long j14;
        long clamp;
        he heVar = this.h;
        if (heVar == null) {
            long j15 = this.I;
            long clamp2 = Utilities.clamp(j15 + f7, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = (float) (clamp2 - j15);
            this.J = Utilities.clamp(this.J - (f10 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / ((float) this.H)), 1.0f, 0.0f);
            ge geVar2 = this.f3148a;
            if (geVar2 != null) {
                geVar2.x(this.J);
                this.f3148a.l0(this.K);
            }
        } else if (this.G) {
            float f11 = heVar.h;
            float f12 = (float) heVar.e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j16 = (f11 * f12) - (f13 * f14);
            float f15 = heVar.f2817g;
            float f16 = this.J;
            long j17 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j18 = this.I;
            long j19 = f7;
            long j20 = j18 + j19;
            if (j20 > j16) {
                he heVar2 = this.h;
                float clamp3 = Utilities.clamp((((heVar2.h * ((float) heVar2.e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                he heVar3 = this.h;
                float f17 = heVar3.h;
                float f18 = (float) heVar3.e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j21 = (f17 * f18) - (f19 * f20);
                long j22 = (heVar3.f2817g * f18) - (clamp4 * f20);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.I = Utilities.clamp(this.I + j19, j12, j11);
                ge geVar3 = this.f3148a;
                if (geVar3 != null) {
                    geVar3.x(this.J);
                    this.f3148a.l0(this.K);
                }
            } else if (j20 < j17) {
                he heVar4 = this.h;
                float clamp5 = Utilities.clamp((((heVar4.f2817g * ((float) heVar4.e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                he heVar5 = this.h;
                float f21 = heVar5.h;
                float f22 = (float) heVar5.e;
                float f23 = (float) this.H;
                long j23 = (f21 * f22) - (clamp6 * f23);
                long j24 = (heVar5.f2817g * f22) - (this.J * f23);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.I = Utilities.clamp(this.I + j19, j10, j3);
                ge geVar4 = this.f3148a;
                if (geVar4 != null) {
                    geVar4.x(this.J);
                    this.f3148a.l0(this.K);
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
        ge geVar5 = this.f3148a;
        if (geVar5 != null) {
            geVar5.Q(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f3175m1;
        if (!z10 && (geVar = this.f3148a) != null) {
            geVar.z(true);
            he heVar6 = this.h;
            if (heVar6 != null) {
                long j26 = this.I + (this.J * ((float) this.H));
                float f25 = heVar6.h;
                float f26 = (float) heVar6.e;
                clamp = Utilities.clamp(j26, f25 * f26, heVar6.f2817g * f26);
            } else {
                float f27 = this.J;
                clamp = Utilities.clamp(f27 * ((float) j14), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.f3156c1 = this.e;
                this.f3153b1.d(1.0f, true);
            }
            ge geVar6 = this.f3148a;
            this.e = clamp;
            geVar6.n(clamp, false);
        } else if (z10 || this.f3187r1) {
            he heVar7 = this.h;
            if (heVar7 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f28 = heVar7.h;
                float f29 = (float) heVar7.e;
                this.e = Utilities.clamp(j27, f28 * f29, heVar7.f2817g * f29);
            } else {
                float f30 = this.J;
                this.e = Utilities.clamp(f30 * ((float) j13), this.H, 0L);
            }
            ge geVar7 = this.f3148a;
            if (geVar7 != null) {
                geVar7.n(this.e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        he heVar = this.h;
        long j3 = heVar.e;
        this.f3161f = Utilities.clamp((((heVar.h + heVar.f2817g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
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
        he heVar;
        he heVar2 = this.h;
        ArrayList arrayList = this.f3188s;
        if (heVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f3205y1) - this.f3202x1) / this.f3194u1;
            he heVar3 = this.v;
            if (heVar3 != null) {
                j3 = (heVar3.f2817g * ((float) heVar3.e)) + ((float) heVar3.f2816f);
            } else {
                j3 = 0;
            }
            float f11 = f10 * ((float) min);
            if (heVar3 == null) {
                if (this.h == null) {
                    j3 = this.Q;
                } else {
                    j3 = 0;
                }
            }
            long clamp = Utilities.clamp((f11 - ((float) j3)) + ((float) this.f3161f), (float) getBaseDuration(), 0.0f);
            he heVar4 = this.h;
            if (heVar4 != null) {
                float f12 = ((float) clamp) / ((float) heVar4.e);
                if (f12 < heVar4.f2817g || f12 > heVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (heVar.h - heVar.f2817g) * ((float) heVar.e))) {
                if (this.N && heVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.e = clamp;
                invalidate();
                ge geVar = this.f3148a;
                if (geVar != null) {
                    geVar.n(clamp, z10);
                }
                va vaVar = this.f3158d1;
                if (vaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(vaVar);
                    this.f3158d1 = null;
                }
                if (z10) {
                    va vaVar2 = new va(this, clamp, 2);
                    this.f3158d1 = vaVar2;
                    AndroidUtilities.runOnUIThread(vaVar2, 150L);
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
        he heVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        ke keVar = this.M;
        Long l4 = null;
        if (keVar != null) {
            keVar.b();
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
            if (getMeasuredWidth() <= 0 || this.M != null || ((heVar = this.h) != null && heVar.e < 1)) {
                j11 = j12;
                z13 = false;
                z11 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f3196v1;
                int i11 = this.f3205y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j13 = this.H;
                if (j13 > 2) {
                    l4 = Long.valueOf(j13);
                }
                he heVar2 = this.h;
                if (heVar2 != null) {
                    maxScrollDuration = heVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z13 = false;
                z11 = true;
                this.M = new ke(this, false, str2, i12, dp, l4, maxScrollDuration, -1L, -1L, new de(this, 0));
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
        if (j11 != j3 && this.h == null && this.f3149a0 != null) {
            this.W = z11;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(((float) j3) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f3157d0.f(this.G, z11);
            this.f3162f0.f(this.P, z11);
            this.f3155c0.f(this.E, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f7) {
        String str2;
        he heVar = this.h;
        if (heVar == null) {
            str2 = null;
        } else {
            str2 = heVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        he heVar2 = this.h;
        if (heVar2 != null) {
            ke keVar = heVar2.f2815c;
            if (keVar != null) {
                keVar.b();
                this.h.f2815c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f3161f = 0L;
            he heVar3 = new he(this);
            this.h = heVar3;
            heVar3.f2814b = z10;
            heVar3.d = str;
            heVar3.e = j3;
            heVar3.f2818i = f7;
            he.a(heVar3, false);
        } else {
            this.h = null;
            this.f3161f = 0L;
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
        this.f3205y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f3207z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f3196v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f3199w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f3202x1 = dp4;
        this.f3194u1 = (this.f3196v1 - (dp4 * 2)) - (this.f3205y1 * 2);
        he heVar = this.h;
        if (heVar != null && heVar.d != null && heVar.f2815c == null) {
            he.a(heVar, false);
        }
        ArrayList arrayList = this.f3188s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                he heVar2 = (he) obj;
                if (heVar2.d != null && heVar2.f2815c == null) {
                    he.a(heVar2, false);
                    he.b(heVar2);
                }
            }
        }
        if (this.O != null && this.f3149a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.me.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f3149a0 == null || this.W) {
                this.f3149a0 = new fe(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f3164g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        he heVar;
        a4.e eVar = new a4.e(4);
        ArrayList arrayList = this.f3188s;
        Collections.sort(arrayList, eVar);
        if (arrayList.isEmpty()) {
            heVar = null;
        } else {
            heVar = (he) arrayList.get(0);
        }
        this.v = heVar;
        if (heVar != null) {
            long j3 = heVar.f2816f;
        }
    }

    public void setCollage(ArrayList<r9> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ke keVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f3188s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            he heVar = (he) arrayList2.get(i10);
            if (heVar != null && (keVar = heVar.f2815c) != null) {
                keVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f3185r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            fe feVar = (fe) arrayList3.get(i11);
            if (feVar != null) {
                feVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f3166h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                r9 r9Var = arrayList.get(i12);
                if (r9Var.K) {
                    he heVar2 = new he(this);
                    heVar2.f2813a = i12;
                    heVar2.f2814b = false;
                    heVar2.d = r9Var.L.getAbsolutePath();
                    heVar2.e = r9Var.f3576h0;
                    heVar2.f2816f = r9Var.X;
                    heVar2.f2818i = r9Var.P;
                    heVar2.f2817g = r9Var.V;
                    heVar2.h = r9Var.W;
                    he.a(heVar2, false);
                    he.b(heVar2);
                    arrayList2.add(heVar2);
                }
            }
        }
        q();
        this.f3176n = 0;
    }

    public void setDelegate(ge geVar) {
        this.f3148a = geVar;
    }

    public void setMaxCount(int i10) {
        this.f3152b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f3151b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.me.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        he heVar = this.h;
        if (heVar == null) {
            return;
        }
        heVar.f2817g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        he heVar = this.h;
        if (heVar == null) {
            return;
        }
        heVar.h = f7;
        invalidate();
    }
}
