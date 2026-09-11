package di;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pr;
public final class zc extends View {
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
    public final yc I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public xc M;
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
    public final nm0 W0;
    public boolean X0;
    public final bi.z2 Y0;
    public long Z0;
    public tc f8535a;
    public sc f8536a0;
    public long f8537a1;
    public Runnable f8538b;
    public int f8539b0;
    public final org.telegram.ui.Components.e6 f8540b1;
    public int f8541c;
    public final org.telegram.ui.Components.e6 f8542c0;
    public long f8543c1;
    public Runnable d;
    public final org.telegram.ui.Components.e6 f8544d0;
    public bi.g f8545d1;
    public long f8546e;
    public final org.telegram.ui.Components.e6 f8547e0;
    public long f8548e1;
    public long f8549f;
    public final org.telegram.ui.Components.e6 f8550f0;
    public long f8551f1;
    public final org.telegram.ui.Components.e6 f8552g0;
    public float f8553g1;
    public uc h;
    public final org.telegram.ui.Components.e6 f8554h0;
    public int f8555h1;
    public final org.telegram.ui.Components.e6 f8556i0;
    public int f8557i1;
    public boolean f8558j0;
    public int f8559j1;
    public final org.telegram.ui.Components.ja f8560k0;
    public int f8561k1;
    public final org.telegram.ui.Components.na f8562l0;
    public boolean l1;
    public final org.telegram.ui.Components.na m0;
    public boolean f8563m1;
    public int f8564n;
    public final org.telegram.ui.Components.na f8565n0;
    public float f8566n1;
    public final RectF f8567o0;
    public boolean f8568o1;
    public final Path f8569p0;
    public VelocityTracker f8570p1;
    public final f01 f8571q0;
    public boolean f8572q1;
    public final ArrayList f8573r;
    public final Drawable f8574r0;
    public boolean f8575r1;
    public final ArrayList f8576s;
    public final yc f8577s0;
    public int f8578s1;
    public final RectF f8579t0;
    public final float[] f8580t1;
    public final Paint f8581u0;
    public int f8582u1;
    public uc v;
    public final Path f8583v0;
    public int f8584v1;
    public final Paint f8585w;
    public final Path f8586w0;
    public int f8587w1;
    public final Path f8588x;
    public final RectF f8589x0;
    public int f8590x1;
    public final Path f8591y;
    public final Path f8592y0;
    public int f8593y1;
    public final Paint f8594z0;
    public int f8595z1;

    public zc(Context context, ViewGroup viewGroup, bc bcVar, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ja jaVar) {
        super(context);
        this.f8564n = 0;
        this.f8573r = new ArrayList();
        this.f8576s = new ArrayList();
        this.f8585w = new Paint(3);
        this.f8588x = new Path();
        this.f8591y = new Path();
        this.f8539b0 = 1;
        pr prVar = pr.h;
        this.f8542c0 = new org.telegram.ui.Components.e6(this, 0L, 360L, prVar);
        this.f8544d0 = new org.telegram.ui.Components.e6(this, 360L, prVar);
        this.f8547e0 = new org.telegram.ui.Components.e6(this, 0L, 360L, prVar);
        this.f8550f0 = new org.telegram.ui.Components.e6(this, 360L, prVar);
        this.f8552g0 = new org.telegram.ui.Components.e6(this, 0L, 360L, prVar);
        this.f8554h0 = new org.telegram.ui.Components.e6(this, 0L, 360L, prVar);
        this.f8556i0 = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.f8558j0 = true;
        this.f8567o0 = new RectF();
        this.f8569p0 = new Path();
        this.f8577s0 = new yc();
        this.f8579t0 = new RectF();
        this.f8581u0 = new Paint(3);
        this.f8583v0 = new Path();
        this.f8586w0 = new Path();
        this.f8589x0 = new RectF();
        this.f8592y0 = new Path();
        Paint paint = new Paint(1);
        this.f8594z0 = paint;
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
        this.I0 = new yc();
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
        this.W0 = new nm0(getContext(), null);
        this.Z0 = -1L;
        this.f8537a1 = -1L;
        this.f8540b1 = new org.telegram.ui.Components.e6(0.0f, this, 0L, 340L, prVar);
        this.f8543c1 = -1L;
        this.f8555h1 = -1;
        this.f8557i1 = -1;
        this.f8559j1 = -1;
        this.f8561k1 = -1;
        this.f8566n1 = 1.0f;
        this.f8572q1 = true;
        this.f8575r1 = false;
        this.f8580t1 = new float[8];
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
        this.f8571q0 = new f01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f8574r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f8560k0 = jaVar;
        this.f8562l0 = new org.telegram.ui.Components.na(jaVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.na(jaVar, this, 3, false);
        this.f8565n0 = new org.telegram.ui.Components.na(jaVar, this, 4, false);
        this.Y0 = new bi.z2(this, viewGroup, f6Var, jaVar, bcVar, 5);
    }

    public static void a(final zc zcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ja jaVar, View view) {
        int i10;
        ArrayList arrayList = zcVar.f8576s;
        int i11 = zcVar.f8559j1;
        try {
            if (i11 == 2 && zcVar.N) {
                i8 i8Var = new i8(zcVar.getContext(), 0);
                i8Var.f7374b = 0.0f;
                i8Var.f7375c = 1.5f;
                i8Var.d(zcVar.V);
                i8Var.h = new Utilities.Callback(zcVar) {
                    public final zc f8085b;

                    {
                        this.f8085b = zcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                zc zcVar2 = this.f8085b;
                                zcVar2.V = floatValue;
                                tc tcVar = zcVar2.f8535a;
                                if (tcVar != null) {
                                    tcVar.i(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                zc zcVar3 = this.f8085b;
                                zcVar3.L = floatValue2;
                                tc tcVar2 = zcVar3.f8535a;
                                if (tcVar2 != null) {
                                    tcVar2.c(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                zc zcVar4 = this.f8085b;
                                zcVar4.h.f8269i = f7.floatValue();
                                tc tcVar3 = zcVar4.f8535a;
                                if (tcVar3 != null) {
                                    tcVar3.y(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(zcVar.getBaseDuration(), zcVar.getMaxScrollDuration());
                int i12 = zcVar.f8584v1;
                int i13 = zcVar.f8593y1;
                int i14 = zcVar.f8590x1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(zcVar.T, 1.0f, zcVar.f8550f0.f25565c) * ((float) zcVar.R)) + ((float) (zcVar.Q - zcVar.f8549f))) / ((float) min)) * zcVar.f8582u1) + i13 + i14);
                n70 F = n70.F(viewGroup, f6Var, zcVar);
                F.q(i8Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new qc(zcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(zcVar.f8584v1 - min2)) + AndroidUtilities.dp(18.0f), zcVar.F0.top);
                F.Z();
                F.R(jaVar, -view.getX(), -view.getY());
                zcVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && zcVar.E) {
                i8 i8Var2 = new i8(zcVar.getContext(), 0);
                i8Var2.f7374b = 0.0f;
                i8Var2.f7375c = 1.5f;
                i8Var2.d(zcVar.L);
                i8Var2.h = new Utilities.Callback(zcVar) {
                    public final zc f8085b;

                    {
                        this.f8085b = zcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                zc zcVar2 = this.f8085b;
                                zcVar2.V = floatValue;
                                tc tcVar = zcVar2.f8535a;
                                if (tcVar != null) {
                                    tcVar.i(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                zc zcVar3 = this.f8085b;
                                zcVar3.L = floatValue2;
                                tc tcVar2 = zcVar3.f8535a;
                                if (tcVar2 != null) {
                                    tcVar2.c(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                zc zcVar4 = this.f8085b;
                                zcVar4.h.f8269i = f7.floatValue();
                                tc tcVar3 = zcVar4.f8535a;
                                if (tcVar3 != null) {
                                    tcVar3.y(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(zcVar.getBaseDuration(), zcVar.getMaxScrollDuration());
                int i15 = zcVar.f8584v1;
                int i16 = zcVar.f8593y1;
                int i17 = zcVar.f8590x1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(zcVar.K, 1.0f, zcVar.f8544d0.f25565c) * ((float) zcVar.H)) + ((float) (zcVar.I - zcVar.f8549f))) / ((float) min3)) * zcVar.f8582u1) + i16 + i17);
                n70 F2 = n70.F(viewGroup, f6Var, zcVar);
                F2.q(i8Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new qc(zcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(zcVar.f8584v1 - min4)) + AndroidUtilities.dp(18.0f), zcVar.f8589x0.top);
                F2.Z();
                F2.R(jaVar, -view.getX(), -view.getY());
                zcVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && zcVar.h != null) {
                i8 i8Var3 = new i8(zcVar.getContext(), 0);
                i8Var3.f7374b = 0.0f;
                i8Var3.f7375c = 1.5f;
                i8Var3.d(zcVar.h.f8269i);
                i8Var3.h = new Utilities.Callback(zcVar) {
                    public final zc f8085b;

                    {
                        this.f8085b = zcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                zc zcVar2 = this.f8085b;
                                zcVar2.V = floatValue;
                                tc tcVar = zcVar2.f8535a;
                                if (tcVar != null) {
                                    tcVar.i(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                zc zcVar3 = this.f8085b;
                                zcVar3.L = floatValue2;
                                tc tcVar2 = zcVar3.f8535a;
                                if (tcVar2 != null) {
                                    tcVar2.c(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                zc zcVar4 = this.f8085b;
                                zcVar4.h.f8269i = f7.floatValue();
                                tc tcVar3 = zcVar4.f8535a;
                                if (tcVar3 != null) {
                                    tcVar3.y(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                n70 F3 = n70.F(viewGroup, f6Var, zcVar);
                F3.q(i8Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), zcVar.f8579t0.top);
                F3.Z();
                F3.R(jaVar, -view.getX(), -view.getY());
                zcVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = zcVar.f8561k1) >= 0 && i10 < arrayList.size()) {
                uc ucVar = (uc) arrayList.get(zcVar.f8561k1);
                i8 i8Var4 = new i8(zcVar.getContext(), 0);
                i8Var4.f7374b = 0.0f;
                i8Var4.f7375c = 1.5f;
                i8Var4.d(ucVar.f8269i);
                i8Var4.h = new m2(7, zcVar, ucVar);
                n70 F4 = n70.F(viewGroup, f6Var, zcVar);
                F4.q(i8Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), ucVar.f8270j.top);
                F4.Z();
                F4.R(jaVar, -view.getX(), -view.getY());
                zcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f8550f0.e(this.P));
    }

    public long getBaseDuration() {
        uc ucVar = this.h;
        if (ucVar != null) {
            return Math.max(1L, ucVar.f8266e);
        }
        uc ucVar2 = this.v;
        if (ucVar2 != null) {
            return Math.max(1L, ucVar2.f8266e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f8576s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((uc) arrayList.get(i10)).f8271k.f25565c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f8544d0.e(this.G));
    }

    private float getVideoHeight() {
        uc ucVar = this.h;
        if (ucVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ucVar.f8271k.f25565c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: di.zc.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        nm0 nm0Var = this.W0;
        if (nm0Var.b()) {
            int i10 = nm0Var.f28825j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f8572q1) {
                this.f8549f = Math.max(0.0f, (((i10 - this.f8593y1) - this.f8590x1) / this.f8582u1) * ((float) min));
            } else if (!this.P) {
                nm0Var.a();
                return;
            } else {
                int i11 = this.f8593y1;
                int i12 = this.f8590x1;
                float f7 = this.f8582u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f8578s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f8578s1 = i10;
        } else if (this.f8575r1) {
            this.f8575r1 = false;
            tc tcVar = this.f8535a;
            if (tcVar != null) {
                tcVar.r(false);
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
        uc ucVar = this.v;
        if (ucVar != null) {
            f12 = (ucVar.f8268g * ((float) ucVar.f8266e)) + ((float) ucVar.f8267f);
        } else {
            if (this.h == null) {
                j10 = this.Q;
            } else {
                j10 = 0;
            }
            f12 = (float) j10;
        }
        float f13 = (this.f8582u1 * (((clamp + f12) - ((float) this.f8549f)) / ((float) min))) + this.f8593y1 + this.f8590x1;
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
        throw new UnsupportedOperationException("Method not decompiled: di.zc.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f8584v1, this.f8587w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f8594z0;
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
        float y3 = org.telegram.messenger.w1.y(AndroidUtilities.dp(f15), dp, 2.0f, f11);
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
        rectF.set(A, f20, org.telegram.messenger.w1.a(AndroidUtilities.dp(f18), dp, 2.0f, f12), f21);
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
        return this.f8539b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f8595z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f8576s.isEmpty()) {
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
        return (int) (f15 + f12 + this.f8595z1);
    }

    public int getMaxCount() {
        return this.f8539b0;
    }

    public long getMaxScrollDuration() {
        if (this.f8576s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f8595z1 + this.f8595z1, getContentHeight(), this.f8556i0.f25565c);
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
        tc tcVar;
        long j16;
        long clamp;
        uc ucVar = this.h;
        if (ucVar == null && !this.E) {
            long j17 = this.Q;
            long clamp2 = Utilities.clamp(j17 + f7, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f13 = (float) (clamp2 - j17);
            this.S = Utilities.clamp(this.S - (f13 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f13 / ((float) this.R)), 1.0f, 0.0f);
            tc tcVar2 = this.f8535a;
            if (tcVar2 != null) {
                tcVar2.R(this.S);
                this.f8535a.O(this.T);
            }
        } else if (this.P) {
            if (ucVar != null) {
                f10 = ucVar.f8268g;
                j3 = ucVar.f8266e;
            } else {
                f10 = this.J;
                j3 = this.H;
            }
            float f14 = f10 * ((float) j3);
            if (ucVar != null) {
                f11 = ucVar.h;
                j10 = ucVar.f8266e;
            } else {
                f11 = this.K;
                j10 = this.H;
            }
            float f15 = f11 * ((float) j10);
            if (ucVar != null) {
                f12 = (ucVar.h - ucVar.f8268g) * ((float) ucVar.f8266e);
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
                tc tcVar3 = this.f8535a;
                if (tcVar3 != null) {
                    tcVar3.R(this.S);
                    this.f8535a.O(this.T);
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
                tc tcVar4 = this.f8535a;
                if (tcVar4 != null) {
                    tcVar4.R(this.S);
                    this.f8535a.O(this.T);
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
        tc tcVar5 = this.f8535a;
        if (tcVar5 != null) {
            tcVar5.d0(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f8563m1;
        if (!z10 && (tcVar = this.f8535a) != null) {
            tcVar.r(true);
            uc ucVar2 = this.h;
            if (ucVar2 != null) {
                long j27 = this.Q + (this.S * ((float) this.R));
                float f23 = ucVar2.h;
                float f24 = (float) ucVar2.f8266e;
                clamp = Utilities.clamp(j27, f23 * f24, ucVar2.f8268g * f24);
            } else if (this.E) {
                long j28 = this.Q + (this.S * ((float) this.R));
                float f25 = this.K;
                float f26 = (float) this.H;
                clamp = Utilities.clamp(j28, f25 * f26, this.J * f26);
            } else {
                float f27 = this.S;
                clamp = Utilities.clamp(f27 * ((float) j16), this.R, 0L);
            }
            if (this.h != null && Math.abs(this.f8546e - clamp) > 400) {
                this.f8543c1 = this.f8546e;
                this.f8540b1.d(1.0f, true);
            }
            tc tcVar6 = this.f8535a;
            this.f8546e = clamp;
            tcVar6.m(clamp, false);
        } else if (z10 || this.f8575r1) {
            uc ucVar3 = this.h;
            if (ucVar3 != null) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f28 = ucVar3.h;
                float f29 = (float) ucVar3.f8266e;
                this.f8546e = Utilities.clamp(j29, f28 * f29, ucVar3.f8268g * f29);
            } else if (this.E && ucVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) ucVar3.f8266e;
                this.f8546e = Utilities.clamp(j30, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.f8546e = Utilities.clamp(f32 * ((float) j15), this.R, 0L);
            }
            tc tcVar7 = this.f8535a;
            if (tcVar7 != null) {
                tcVar7.m(this.f8546e, false);
            }
        }
    }

    public final void i(uc ucVar, float f7) {
        long j3;
        tc tcVar;
        long j10;
        long clamp;
        long j11;
        long j12;
        long j13;
        long j14;
        if (ucVar != null) {
            uc ucVar2 = this.v;
            if (ucVar2 != ucVar && ucVar2 != null) {
                if (this.f8564n == this.f8576s.indexOf(ucVar)) {
                    uc ucVar3 = this.v;
                    float f10 = (float) ucVar3.f8266e;
                    float f11 = ucVar.h;
                    float f12 = (float) ucVar.f8266e;
                    float f13 = ucVar.f8268g;
                    long j15 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((ucVar3.h - ucVar3.f8268g) * f10) / f12);
                    long j16 = ucVar.f8267f;
                    long j17 = f7;
                    long j18 = j16 + j17;
                    if (j18 > (f10 * 1.0f) - (f11 * f12)) {
                        uc ucVar4 = this.v;
                        float clamp2 = Utilities.clamp((((ucVar4.h * ((float) ucVar4.f8266e)) - ((float) j16)) - ((float) j17)) / ((float) ucVar.f8266e), 1.0f, min);
                        ucVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        ucVar.f8268g = clamp3;
                        uc ucVar5 = this.v;
                        float f14 = ucVar5.h;
                        float f15 = (float) ucVar5.f8266e;
                        float f16 = ucVar.h;
                        float f17 = (float) ucVar.f8266e;
                        long j19 = (f14 * f15) - (f16 * f17);
                        long j20 = (ucVar5.f8268g * f15) - (clamp3 * f17);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        ucVar.f8267f = Utilities.clamp(ucVar.f8267f + j17, j14, j13);
                        tc tcVar2 = this.f8535a;
                        if (tcVar2 != null) {
                            tcVar2.N(ucVar.f8268g, ucVar.f8263a);
                            this.f8535a.S(ucVar.h, ucVar.f8263a);
                        }
                    } else if (j18 < j15) {
                        uc ucVar6 = this.v;
                        float clamp4 = Utilities.clamp((((ucVar6.f8268g * ((float) ucVar6.f8266e)) - ((float) j16)) - ((float) j17)) / ((float) ucVar.f8266e), 1.0f - min, 0.0f);
                        ucVar.f8268g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        ucVar.h = clamp5;
                        uc ucVar7 = this.v;
                        float f18 = ucVar7.h;
                        float f19 = (float) ucVar7.f8266e;
                        float f20 = (float) ucVar.f8266e;
                        long j21 = (f18 * f19) - (clamp5 * f20);
                        long j22 = (ucVar7.f8268g * f19) - (ucVar.f8268g * f20);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        ucVar.f8267f = Utilities.clamp(ucVar.f8267f + j17, j12, j11);
                        tc tcVar3 = this.f8535a;
                        if (tcVar3 != null) {
                            tcVar3.N(ucVar.f8268g, ucVar.f8263a);
                            this.f8535a.S(ucVar.h, ucVar.f8263a);
                        }
                    } else {
                        ucVar.f8267f = j18;
                    }
                } else {
                    long j23 = ucVar.f8267f + f7;
                    float f21 = (float) ucVar.f8266e;
                    ucVar.f8267f = Utilities.clamp(j23, ((float) getBaseDuration()) - (ucVar.h * f21), (-ucVar.f8268g) * f21);
                }
            }
            invalidate();
            tc tcVar4 = this.f8535a;
            if (tcVar4 != null) {
                tcVar4.a0(ucVar.f8263a, ucVar.f8267f);
            }
            boolean z10 = this.f8563m1;
            if (!z10 && (tcVar = this.f8535a) != null) {
                tcVar.r(true);
                uc ucVar8 = this.v;
                if (ucVar8 != ucVar && ucVar8 != null) {
                    long j24 = ucVar.f8267f + (ucVar.f8268g * ((float) ucVar.f8266e));
                    float f22 = ucVar8.h;
                    float f23 = (float) ucVar8.f8266e;
                    clamp = Utilities.clamp(j24, f22 * f23, ucVar8.f8268g * f23);
                } else {
                    float f24 = ucVar.f8268g;
                    clamp = Utilities.clamp(f24 * ((float) j10), ucVar.f8266e, 0L);
                }
                uc ucVar9 = this.v;
                if (ucVar9 != ucVar && ucVar9 != null && Math.abs(this.f8546e - clamp) > 400) {
                    this.f8543c1 = this.f8546e;
                    this.f8540b1.d(1.0f, true);
                }
                tc tcVar5 = this.f8535a;
                this.f8546e = clamp;
                tcVar5.m(clamp, false);
            } else if (z10 || this.f8575r1) {
                uc ucVar10 = this.v;
                if (ucVar10 != ucVar && ucVar10 != null) {
                    long j25 = ucVar.f8267f + (ucVar.f8268g * ((float) ucVar.f8266e));
                    float f25 = ucVar10.h;
                    float f26 = (float) ucVar10.f8266e;
                    this.f8546e = Utilities.clamp(j25, f25 * f26, ucVar10.f8268g * f26);
                } else {
                    float f27 = ucVar.f8268g;
                    this.f8546e = Utilities.clamp(f27 * ((float) j3), ucVar.f8266e, 0L);
                }
                tc tcVar6 = this.f8535a;
                if (tcVar6 != null) {
                    tcVar6.m(this.f8546e, false);
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
        tc tcVar;
        long j14;
        long clamp;
        uc ucVar = this.h;
        if (ucVar == null) {
            long j15 = this.I;
            long clamp2 = Utilities.clamp(j15 + f7, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = (float) (clamp2 - j15);
            this.J = Utilities.clamp(this.J - (f10 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / ((float) this.H)), 1.0f, 0.0f);
            tc tcVar2 = this.f8535a;
            if (tcVar2 != null) {
                tcVar2.o(this.J);
                this.f8535a.Z(this.K);
            }
        } else if (this.G) {
            float f11 = ucVar.h;
            float f12 = (float) ucVar.f8266e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j16 = (f11 * f12) - (f13 * f14);
            float f15 = ucVar.f8268g;
            float f16 = this.J;
            long j17 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j18 = this.I;
            long j19 = f7;
            long j20 = j18 + j19;
            if (j20 > j16) {
                uc ucVar2 = this.h;
                float clamp3 = Utilities.clamp((((ucVar2.h * ((float) ucVar2.f8266e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                uc ucVar3 = this.h;
                float f17 = ucVar3.h;
                float f18 = (float) ucVar3.f8266e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j21 = (f17 * f18) - (f19 * f20);
                long j22 = (ucVar3.f8268g * f18) - (clamp4 * f20);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.I = Utilities.clamp(this.I + j19, j12, j11);
                tc tcVar3 = this.f8535a;
                if (tcVar3 != null) {
                    tcVar3.o(this.J);
                    this.f8535a.Z(this.K);
                }
            } else if (j20 < j17) {
                uc ucVar4 = this.h;
                float clamp5 = Utilities.clamp((((ucVar4.f8268g * ((float) ucVar4.f8266e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                uc ucVar5 = this.h;
                float f21 = ucVar5.h;
                float f22 = (float) ucVar5.f8266e;
                float f23 = (float) this.H;
                long j23 = (f21 * f22) - (clamp6 * f23);
                long j24 = (ucVar5.f8268g * f22) - (this.J * f23);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.I = Utilities.clamp(this.I + j19, j10, j3);
                tc tcVar4 = this.f8535a;
                if (tcVar4 != null) {
                    tcVar4.o(this.J);
                    this.f8535a.Z(this.K);
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
        tc tcVar5 = this.f8535a;
        if (tcVar5 != null) {
            tcVar5.I(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f8563m1;
        if (!z10 && (tcVar = this.f8535a) != null) {
            tcVar.r(true);
            uc ucVar6 = this.h;
            if (ucVar6 != null) {
                long j26 = this.I + (this.J * ((float) this.H));
                float f25 = ucVar6.h;
                float f26 = (float) ucVar6.f8266e;
                clamp = Utilities.clamp(j26, f25 * f26, ucVar6.f8268g * f26);
            } else {
                float f27 = this.J;
                clamp = Utilities.clamp(f27 * ((float) j14), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.f8546e - clamp) > 400) {
                this.f8543c1 = this.f8546e;
                this.f8540b1.d(1.0f, true);
            }
            tc tcVar6 = this.f8535a;
            this.f8546e = clamp;
            tcVar6.m(clamp, false);
        } else if (z10 || this.f8575r1) {
            uc ucVar7 = this.h;
            if (ucVar7 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f28 = ucVar7.h;
                float f29 = (float) ucVar7.f8266e;
                this.f8546e = Utilities.clamp(j27, f28 * f29, ucVar7.f8268g * f29);
            } else {
                float f30 = this.J;
                this.f8546e = Utilities.clamp(f30 * ((float) j13), this.H, 0L);
            }
            tc tcVar7 = this.f8535a;
            if (tcVar7 != null) {
                tcVar7.m(this.f8546e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        uc ucVar = this.h;
        long j3 = ucVar.f8266e;
        this.f8549f = Utilities.clamp((((ucVar.h + ucVar.f8268g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
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
        uc ucVar;
        uc ucVar2 = this.h;
        ArrayList arrayList = this.f8576s;
        if (ucVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f8593y1) - this.f8590x1) / this.f8582u1;
            uc ucVar3 = this.v;
            if (ucVar3 != null) {
                j3 = (ucVar3.f8268g * ((float) ucVar3.f8266e)) + ((float) ucVar3.f8267f);
            } else {
                j3 = 0;
            }
            float f11 = f10 * ((float) min);
            if (ucVar3 == null) {
                if (this.h == null) {
                    j3 = this.Q;
                } else {
                    j3 = 0;
                }
            }
            long clamp = Utilities.clamp((f11 - ((float) j3)) + ((float) this.f8549f), (float) getBaseDuration(), 0.0f);
            uc ucVar4 = this.h;
            if (ucVar4 != null) {
                float f12 = ((float) clamp) / ((float) ucVar4.f8266e);
                if (f12 < ucVar4.f8268g || f12 > ucVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (ucVar.h - ucVar.f8268g) * ((float) ucVar.f8266e))) {
                if (this.N && ucVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.f8546e = clamp;
                invalidate();
                tc tcVar = this.f8535a;
                if (tcVar != null) {
                    tcVar.m(clamp, z10);
                }
                bi.g gVar = this.f8545d1;
                if (gVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    this.f8545d1 = null;
                }
                if (z10) {
                    bi.g gVar2 = new bi.g(this, clamp, 7);
                    this.f8545d1 = gVar2;
                    AndroidUtilities.runOnUIThread(gVar2, 150L);
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
        uc ucVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        xc xcVar = this.M;
        Long l4 = null;
        if (xcVar != null) {
            xcVar.b();
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
            if (getMeasuredWidth() <= 0 || this.M != null || ((ucVar = this.h) != null && ucVar.f8266e < 1)) {
                j11 = j12;
                z13 = false;
                z11 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f8584v1;
                int i11 = this.f8593y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j13 = this.H;
                if (j13 > 2) {
                    l4 = Long.valueOf(j13);
                }
                uc ucVar2 = this.h;
                if (ucVar2 != null) {
                    maxScrollDuration = ucVar2.f8266e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z13 = false;
                z11 = true;
                this.M = new xc(this, false, str2, i12, dp, l4, maxScrollDuration, -1L, -1L, new qc(this, 0));
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
        if (j11 != j3 && this.h == null && this.f8536a0 != null) {
            this.W = z11;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(((float) j3) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f8544d0.f(this.G, z11);
            this.f8550f0.f(this.P, z11);
            this.f8542c0.f(this.E, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f7) {
        String str2;
        uc ucVar = this.h;
        if (ucVar == null) {
            str2 = null;
        } else {
            str2 = ucVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        uc ucVar2 = this.h;
        if (ucVar2 != null) {
            xc xcVar = ucVar2.f8265c;
            if (xcVar != null) {
                xcVar.b();
                this.h.f8265c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f8549f = 0L;
            uc ucVar3 = new uc(this);
            this.h = ucVar3;
            ucVar3.f8264b = z10;
            ucVar3.d = str;
            ucVar3.f8266e = j3;
            ucVar3.f8269i = f7;
            uc.a(ucVar3, false);
        } else {
            this.h = null;
            this.f8549f = 0L;
        }
        if (!this.E) {
            this.G = false;
        }
        this.f8546e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        this.P0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f8593y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f8595z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f8584v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f8587w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f8590x1 = dp4;
        this.f8582u1 = (this.f8584v1 - (dp4 * 2)) - (this.f8593y1 * 2);
        uc ucVar = this.h;
        if (ucVar != null && ucVar.d != null && ucVar.f8265c == null) {
            uc.a(ucVar, false);
        }
        ArrayList arrayList = this.f8576s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                uc ucVar2 = (uc) obj;
                if (ucVar2.d != null && ucVar2.f8265c == null) {
                    uc.a(ucVar2, false);
                    uc.b(ucVar2);
                }
            }
        }
        if (this.O != null && this.f8536a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: di.zc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f8536a0 == null || this.W) {
                this.f8536a0 = new sc(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f8552g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        uc ucVar;
        a4.e eVar = new a4.e(13);
        ArrayList arrayList = this.f8576s;
        Collections.sort(arrayList, eVar);
        if (arrayList.isEmpty()) {
            ucVar = null;
        } else {
            ucVar = (uc) arrayList.get(0);
        }
        this.v = ucVar;
        if (ucVar != null) {
            long j3 = ucVar.f8267f;
        }
    }

    public void setCollage(ArrayList<o8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        xc xcVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f8576s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            uc ucVar = (uc) arrayList2.get(i10);
            if (ucVar != null && (xcVar = ucVar.f8265c) != null) {
                xcVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f8573r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            sc scVar = (sc) arrayList3.get(i11);
            if (scVar != null) {
                scVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f8554h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                o8 o8Var = arrayList.get(i12);
                if (o8Var.K) {
                    uc ucVar2 = new uc(this);
                    ucVar2.f8263a = i12;
                    ucVar2.f8264b = false;
                    ucVar2.d = o8Var.L.getAbsolutePath();
                    ucVar2.f8266e = o8Var.f7758h0;
                    ucVar2.f8267f = o8Var.X;
                    ucVar2.f8269i = o8Var.P;
                    ucVar2.f8268g = o8Var.V;
                    ucVar2.h = o8Var.W;
                    uc.a(ucVar2, false);
                    uc.b(ucVar2);
                    arrayList2.add(ucVar2);
                }
            }
        }
        q();
        this.f8564n = 0;
    }

    public void setDelegate(tc tcVar) {
        this.f8535a = tcVar;
    }

    public void setMaxCount(int i10) {
        this.f8539b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f8538b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: di.zc.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        uc ucVar = this.h;
        if (ucVar == null) {
            return;
        }
        ucVar.f8268g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        uc ucVar = this.h;
        if (ucVar == null) {
            return;
        }
        ucVar.h = f7;
        invalidate();
    }
}
