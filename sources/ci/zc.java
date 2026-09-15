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
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qr;
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
    public final ai.m3 Y0;
    public long Z0;
    public sc f5878a;
    public rc f5879a0;
    public long f5880a1;
    public Runnable f5881b;
    public int f5882b0;
    public final org.telegram.ui.Components.c6 f5883b1;
    public int f5884c;
    public final org.telegram.ui.Components.c6 f5885c0;
    public long f5886c1;
    public Runnable d;
    public final org.telegram.ui.Components.c6 f5887d0;
    public ai.j f5888d1;
    public long e;
    public final org.telegram.ui.Components.c6 f5889e0;
    public long f5890e1;
    public long f5891f;
    public final org.telegram.ui.Components.c6 f5892f0;
    public long f5893f1;
    public final org.telegram.ui.Components.c6 f5894g0;
    public float f5895g1;
    public tc h;
    public final org.telegram.ui.Components.c6 f5896h0;
    public int f5897h1;
    public final org.telegram.ui.Components.c6 f5898i0;
    public int f5899i1;
    public boolean f5900j0;
    public int f5901j1;
    public final org.telegram.ui.Components.ha f5902k0;
    public int f5903k1;
    public final org.telegram.ui.Components.la f5904l0;
    public boolean l1;
    public final org.telegram.ui.Components.la m0;
    public boolean f5905m1;
    public int f5906n;
    public final org.telegram.ui.Components.la f5907n0;
    public float f5908n1;
    public final RectF f5909o0;
    public boolean f5910o1;
    public final Path f5911p0;
    public VelocityTracker f5912p1;
    public final g01 f5913q0;
    public boolean f5914q1;
    public final ArrayList f5915r;
    public final Drawable f5916r0;
    public boolean f5917r1;
    public final ArrayList f5918s;
    public final yc f5919s0;
    public int f5920s1;
    public final RectF f5921t0;
    public final float[] f5922t1;
    public final Paint f5923u0;
    public int f5924u1;
    public tc v;
    public final Path f5925v0;
    public int f5926v1;
    public final Paint f5927w;
    public final Path f5928w0;
    public int f5929w1;
    public final Path f5930x;
    public final RectF f5931x0;
    public int f5932x1;
    public final Path f5933y;
    public final Path f5934y0;
    public int f5935y1;
    public final Paint f5936z0;
    public int f5937z1;

    public zc(Context context, ViewGroup viewGroup, ac acVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ha haVar) {
        super(context);
        this.f5906n = 0;
        this.f5915r = new ArrayList();
        this.f5918s = new ArrayList();
        this.f5927w = new Paint(3);
        this.f5930x = new Path();
        this.f5933y = new Path();
        this.f5882b0 = 1;
        qr qrVar = qr.h;
        this.f5885c0 = new org.telegram.ui.Components.c6(this, 0L, 360L, qrVar);
        this.f5887d0 = new org.telegram.ui.Components.c6(this, 360L, qrVar);
        this.f5889e0 = new org.telegram.ui.Components.c6(this, 0L, 360L, qrVar);
        this.f5892f0 = new org.telegram.ui.Components.c6(this, 360L, qrVar);
        this.f5894g0 = new org.telegram.ui.Components.c6(this, 0L, 360L, qrVar);
        this.f5896h0 = new org.telegram.ui.Components.c6(this, 0L, 360L, qrVar);
        this.f5898i0 = new org.telegram.ui.Components.c6(this, 0L, 320L, qrVar);
        this.f5900j0 = true;
        this.f5909o0 = new RectF();
        this.f5911p0 = new Path();
        this.f5919s0 = new yc();
        this.f5921t0 = new RectF();
        this.f5923u0 = new Paint(3);
        this.f5925v0 = new Path();
        this.f5928w0 = new Path();
        this.f5931x0 = new RectF();
        this.f5934y0 = new Path();
        Paint paint = new Paint(1);
        this.f5936z0 = paint;
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
        this.f5880a1 = -1L;
        this.f5883b1 = new org.telegram.ui.Components.c6(0.0f, this, 0L, 340L, qrVar);
        this.f5886c1 = -1L;
        this.f5897h1 = -1;
        this.f5899i1 = -1;
        this.f5901j1 = -1;
        this.f5903k1 = -1;
        this.f5908n1 = 1.0f;
        this.f5914q1 = true;
        this.f5917r1 = false;
        this.f5922t1 = new float[8];
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
        this.f5913q0 = new g01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f5916r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f5902k0 = haVar;
        this.f5904l0 = new org.telegram.ui.Components.la(haVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.la(haVar, this, 3, false);
        this.f5907n0 = new org.telegram.ui.Components.la(haVar, this, 4, false);
        this.Y0 = new ai.m3(this, viewGroup, e6Var, haVar, acVar, 5);
    }

    public static void a(final zc zcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ha haVar, View view) {
        int i10;
        ArrayList arrayList = zcVar.f5918s;
        int i11 = zcVar.f5901j1;
        try {
            if (i11 == 2 && zcVar.N) {
                i8 i8Var = new i8(zcVar.getContext(), 0);
                i8Var.f4786b = 0.0f;
                i8Var.f4787c = 1.5f;
                i8Var.d(zcVar.V);
                i8Var.h = new Utilities.Callback(zcVar) {
                    public final zc f5363b;

                    {
                        this.f5363b = zcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                zc zcVar2 = this.f5363b;
                                zcVar2.V = floatValue;
                                sc scVar = zcVar2.f5878a;
                                if (scVar != null) {
                                    scVar.n(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                zc zcVar3 = this.f5363b;
                                zcVar3.L = floatValue2;
                                sc scVar2 = zcVar3.f5878a;
                                if (scVar2 != null) {
                                    scVar2.h(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                zc zcVar4 = this.f5363b;
                                zcVar4.h.f5577i = f7.floatValue();
                                sc scVar3 = zcVar4.f5878a;
                                if (scVar3 != null) {
                                    scVar3.F(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(zcVar.getBaseDuration(), zcVar.getMaxScrollDuration());
                int i12 = zcVar.f5926v1;
                int i13 = zcVar.f5935y1;
                int i14 = zcVar.f5932x1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(zcVar.T, 1.0f, zcVar.f5892f0.f22953c) * ((float) zcVar.R)) + ((float) (zcVar.Q - zcVar.f5891f))) / ((float) min)) * zcVar.f5924u1) + i13 + i14);
                n70 F = n70.F(viewGroup, e6Var, zcVar);
                F.q(i8Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new pc(zcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(zcVar.f5926v1 - min2)) + AndroidUtilities.dp(18.0f), zcVar.F0.top);
                F.Z();
                F.R(haVar, -view.getX(), -view.getY());
                zcVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && zcVar.E) {
                i8 i8Var2 = new i8(zcVar.getContext(), 0);
                i8Var2.f4786b = 0.0f;
                i8Var2.f4787c = 1.5f;
                i8Var2.d(zcVar.L);
                i8Var2.h = new Utilities.Callback(zcVar) {
                    public final zc f5363b;

                    {
                        this.f5363b = zcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                zc zcVar2 = this.f5363b;
                                zcVar2.V = floatValue;
                                sc scVar = zcVar2.f5878a;
                                if (scVar != null) {
                                    scVar.n(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                zc zcVar3 = this.f5363b;
                                zcVar3.L = floatValue2;
                                sc scVar2 = zcVar3.f5878a;
                                if (scVar2 != null) {
                                    scVar2.h(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                zc zcVar4 = this.f5363b;
                                zcVar4.h.f5577i = f7.floatValue();
                                sc scVar3 = zcVar4.f5878a;
                                if (scVar3 != null) {
                                    scVar3.F(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(zcVar.getBaseDuration(), zcVar.getMaxScrollDuration());
                int i15 = zcVar.f5926v1;
                int i16 = zcVar.f5935y1;
                int i17 = zcVar.f5932x1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(zcVar.K, 1.0f, zcVar.f5887d0.f22953c) * ((float) zcVar.H)) + ((float) (zcVar.I - zcVar.f5891f))) / ((float) min3)) * zcVar.f5924u1) + i16 + i17);
                n70 F2 = n70.F(viewGroup, e6Var, zcVar);
                F2.q(i8Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new pc(zcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(zcVar.f5926v1 - min4)) + AndroidUtilities.dp(18.0f), zcVar.f5931x0.top);
                F2.Z();
                F2.R(haVar, -view.getX(), -view.getY());
                zcVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && zcVar.h != null) {
                i8 i8Var3 = new i8(zcVar.getContext(), 0);
                i8Var3.f4786b = 0.0f;
                i8Var3.f4787c = 1.5f;
                i8Var3.d(zcVar.h.f5577i);
                i8Var3.h = new Utilities.Callback(zcVar) {
                    public final zc f5363b;

                    {
                        this.f5363b = zcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                zc zcVar2 = this.f5363b;
                                zcVar2.V = floatValue;
                                sc scVar = zcVar2.f5878a;
                                if (scVar != null) {
                                    scVar.n(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                zc zcVar3 = this.f5363b;
                                zcVar3.L = floatValue2;
                                sc scVar2 = zcVar3.f5878a;
                                if (scVar2 != null) {
                                    scVar2.h(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                zc zcVar4 = this.f5363b;
                                zcVar4.h.f5577i = f7.floatValue();
                                sc scVar3 = zcVar4.f5878a;
                                if (scVar3 != null) {
                                    scVar3.F(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                n70 F3 = n70.F(viewGroup, e6Var, zcVar);
                F3.q(i8Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), zcVar.f5921t0.top);
                F3.Z();
                F3.R(haVar, -view.getX(), -view.getY());
                zcVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = zcVar.f5903k1) >= 0 && i10 < arrayList.size()) {
                tc tcVar = (tc) arrayList.get(zcVar.f5903k1);
                i8 i8Var4 = new i8(zcVar.getContext(), 0);
                i8Var4.f4786b = 0.0f;
                i8Var4.f4787c = 1.5f;
                i8Var4.d(tcVar.f5577i);
                i8Var4.h = new m2(7, zcVar, tcVar);
                n70 F4 = n70.F(viewGroup, e6Var, zcVar);
                F4.q(i8Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), tcVar.f5578j.top);
                F4.Z();
                F4.R(haVar, -view.getX(), -view.getY());
                zcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f5892f0.e(this.P));
    }

    public long getBaseDuration() {
        tc tcVar = this.h;
        if (tcVar != null) {
            return Math.max(1L, tcVar.e);
        }
        tc tcVar2 = this.v;
        if (tcVar2 != null) {
            return Math.max(1L, tcVar2.e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f5918s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((tc) arrayList.get(i10)).f5579k.f22953c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f5887d0.e(this.G));
    }

    private float getVideoHeight() {
        tc tcVar = this.h;
        if (tcVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), tcVar.f5579k.f22953c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.zc.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        nm0 nm0Var = this.W0;
        if (nm0Var.b()) {
            int i10 = nm0Var.f26529j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f5914q1) {
                this.f5891f = Math.max(0.0f, (((i10 - this.f5935y1) - this.f5932x1) / this.f5924u1) * ((float) min));
            } else if (!this.P) {
                nm0Var.a();
                return;
            } else {
                int i11 = this.f5935y1;
                int i12 = this.f5932x1;
                float f7 = this.f5924u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f5920s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f5920s1 = i10;
        } else if (this.f5917r1) {
            this.f5917r1 = false;
            sc scVar = this.f5878a;
            if (scVar != null) {
                scVar.w(false);
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
        tc tcVar = this.v;
        if (tcVar != null) {
            f12 = (tcVar.f5576g * ((float) tcVar.e)) + ((float) tcVar.f5575f);
        } else {
            if (this.h == null) {
                j10 = this.Q;
            } else {
                j10 = 0;
            }
            f12 = (float) j10;
        }
        float f13 = (this.f5924u1 * (((clamp + f12) - ((float) this.f5891f)) / ((float) min))) + this.f5935y1 + this.f5932x1;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.zc.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f5926v1, this.f5929w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f5936z0;
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
        return this.f5882b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f5937z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f5918s.isEmpty()) {
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
        return (int) (f15 + f12 + this.f5937z1);
    }

    public int getMaxCount() {
        return this.f5882b0;
    }

    public long getMaxScrollDuration() {
        if (this.f5918s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f5937z1 + this.f5937z1, getContentHeight(), this.f5898i0.f22953c);
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
        sc scVar;
        long j16;
        long clamp;
        tc tcVar = this.h;
        if (tcVar == null && !this.E) {
            long j17 = this.Q;
            long clamp2 = Utilities.clamp(j17 + f7, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f13 = (float) (clamp2 - j17);
            this.S = Utilities.clamp(this.S - (f13 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f13 / ((float) this.R)), 1.0f, 0.0f);
            sc scVar2 = this.f5878a;
            if (scVar2 != null) {
                scVar2.Z(this.S);
                this.f5878a.V(this.T);
            }
        } else if (this.P) {
            if (tcVar != null) {
                f10 = tcVar.f5576g;
                j3 = tcVar.e;
            } else {
                f10 = this.J;
                j3 = this.H;
            }
            float f14 = f10 * ((float) j3);
            if (tcVar != null) {
                f11 = tcVar.h;
                j10 = tcVar.e;
            } else {
                f11 = this.K;
                j10 = this.H;
            }
            float f15 = f11 * ((float) j10);
            if (tcVar != null) {
                f12 = (tcVar.h - tcVar.f5576g) * ((float) tcVar.e);
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
                sc scVar3 = this.f5878a;
                if (scVar3 != null) {
                    scVar3.Z(this.S);
                    this.f5878a.V(this.T);
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
                sc scVar4 = this.f5878a;
                if (scVar4 != null) {
                    scVar4.Z(this.S);
                    this.f5878a.V(this.T);
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
        sc scVar5 = this.f5878a;
        if (scVar5 != null) {
            scVar5.o0(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f5905m1;
        if (!z10 && (scVar = this.f5878a) != null) {
            scVar.w(true);
            tc tcVar2 = this.h;
            if (tcVar2 != null) {
                long j27 = this.Q + (this.S * ((float) this.R));
                float f23 = tcVar2.h;
                float f24 = (float) tcVar2.e;
                clamp = Utilities.clamp(j27, f23 * f24, tcVar2.f5576g * f24);
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
                this.f5886c1 = this.e;
                this.f5883b1.d(1.0f, true);
            }
            sc scVar6 = this.f5878a;
            this.e = clamp;
            scVar6.o(clamp, false);
        } else if (z10 || this.f5917r1) {
            tc tcVar3 = this.h;
            if (tcVar3 != null) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f28 = tcVar3.h;
                float f29 = (float) tcVar3.e;
                this.e = Utilities.clamp(j29, f28 * f29, tcVar3.f5576g * f29);
            } else if (this.E && tcVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) tcVar3.e;
                this.e = Utilities.clamp(j30, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.e = Utilities.clamp(f32 * ((float) j15), this.R, 0L);
            }
            sc scVar7 = this.f5878a;
            if (scVar7 != null) {
                scVar7.o(this.e, false);
            }
        }
    }

    public final void i(tc tcVar, float f7) {
        long j3;
        sc scVar;
        long j10;
        long clamp;
        long j11;
        long j12;
        long j13;
        long j14;
        if (tcVar != null) {
            tc tcVar2 = this.v;
            if (tcVar2 != tcVar && tcVar2 != null) {
                if (this.f5906n == this.f5918s.indexOf(tcVar)) {
                    tc tcVar3 = this.v;
                    float f10 = (float) tcVar3.e;
                    float f11 = tcVar.h;
                    float f12 = (float) tcVar.e;
                    float f13 = tcVar.f5576g;
                    long j15 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((tcVar3.h - tcVar3.f5576g) * f10) / f12);
                    long j16 = tcVar.f5575f;
                    long j17 = f7;
                    long j18 = j16 + j17;
                    if (j18 > (f10 * 1.0f) - (f11 * f12)) {
                        tc tcVar4 = this.v;
                        float clamp2 = Utilities.clamp((((tcVar4.h * ((float) tcVar4.e)) - ((float) j16)) - ((float) j17)) / ((float) tcVar.e), 1.0f, min);
                        tcVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        tcVar.f5576g = clamp3;
                        tc tcVar5 = this.v;
                        float f14 = tcVar5.h;
                        float f15 = (float) tcVar5.e;
                        float f16 = tcVar.h;
                        float f17 = (float) tcVar.e;
                        long j19 = (f14 * f15) - (f16 * f17);
                        long j20 = (tcVar5.f5576g * f15) - (clamp3 * f17);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        tcVar.f5575f = Utilities.clamp(tcVar.f5575f + j17, j14, j13);
                        sc scVar2 = this.f5878a;
                        if (scVar2 != null) {
                            scVar2.T(tcVar.f5576g, tcVar.f5572a);
                            this.f5878a.d0(tcVar.h, tcVar.f5572a);
                        }
                    } else if (j18 < j15) {
                        tc tcVar6 = this.v;
                        float clamp4 = Utilities.clamp((((tcVar6.f5576g * ((float) tcVar6.e)) - ((float) j16)) - ((float) j17)) / ((float) tcVar.e), 1.0f - min, 0.0f);
                        tcVar.f5576g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        tcVar.h = clamp5;
                        tc tcVar7 = this.v;
                        float f18 = tcVar7.h;
                        float f19 = (float) tcVar7.e;
                        float f20 = (float) tcVar.e;
                        long j21 = (f18 * f19) - (clamp5 * f20);
                        long j22 = (tcVar7.f5576g * f19) - (tcVar.f5576g * f20);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        tcVar.f5575f = Utilities.clamp(tcVar.f5575f + j17, j12, j11);
                        sc scVar3 = this.f5878a;
                        if (scVar3 != null) {
                            scVar3.T(tcVar.f5576g, tcVar.f5572a);
                            this.f5878a.d0(tcVar.h, tcVar.f5572a);
                        }
                    } else {
                        tcVar.f5575f = j18;
                    }
                } else {
                    long j23 = tcVar.f5575f + f7;
                    float f21 = (float) tcVar.e;
                    tcVar.f5575f = Utilities.clamp(j23, ((float) getBaseDuration()) - (tcVar.h * f21), (-tcVar.f5576g) * f21);
                }
            }
            invalidate();
            sc scVar4 = this.f5878a;
            if (scVar4 != null) {
                scVar4.j0(tcVar.f5572a, tcVar.f5575f);
            }
            boolean z10 = this.f5905m1;
            if (!z10 && (scVar = this.f5878a) != null) {
                scVar.w(true);
                tc tcVar8 = this.v;
                if (tcVar8 != tcVar && tcVar8 != null) {
                    long j24 = tcVar.f5575f + (tcVar.f5576g * ((float) tcVar.e));
                    float f22 = tcVar8.h;
                    float f23 = (float) tcVar8.e;
                    clamp = Utilities.clamp(j24, f22 * f23, tcVar8.f5576g * f23);
                } else {
                    float f24 = tcVar.f5576g;
                    clamp = Utilities.clamp(f24 * ((float) j10), tcVar.e, 0L);
                }
                tc tcVar9 = this.v;
                if (tcVar9 != tcVar && tcVar9 != null && Math.abs(this.e - clamp) > 400) {
                    this.f5886c1 = this.e;
                    this.f5883b1.d(1.0f, true);
                }
                sc scVar5 = this.f5878a;
                this.e = clamp;
                scVar5.o(clamp, false);
            } else if (z10 || this.f5917r1) {
                tc tcVar10 = this.v;
                if (tcVar10 != tcVar && tcVar10 != null) {
                    long j25 = tcVar.f5575f + (tcVar.f5576g * ((float) tcVar.e));
                    float f25 = tcVar10.h;
                    float f26 = (float) tcVar10.e;
                    this.e = Utilities.clamp(j25, f25 * f26, tcVar10.f5576g * f26);
                } else {
                    float f27 = tcVar.f5576g;
                    this.e = Utilities.clamp(f27 * ((float) j3), tcVar.e, 0L);
                }
                sc scVar6 = this.f5878a;
                if (scVar6 != null) {
                    scVar6.o(this.e, false);
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
        sc scVar;
        long j14;
        long clamp;
        tc tcVar = this.h;
        if (tcVar == null) {
            long j15 = this.I;
            long clamp2 = Utilities.clamp(j15 + f7, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = (float) (clamp2 - j15);
            this.J = Utilities.clamp(this.J - (f10 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / ((float) this.H)), 1.0f, 0.0f);
            sc scVar2 = this.f5878a;
            if (scVar2 != null) {
                scVar2.u(this.J);
                this.f5878a.i0(this.K);
            }
        } else if (this.G) {
            float f11 = tcVar.h;
            float f12 = (float) tcVar.e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j16 = (f11 * f12) - (f13 * f14);
            float f15 = tcVar.f5576g;
            float f16 = this.J;
            long j17 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j18 = this.I;
            long j19 = f7;
            long j20 = j18 + j19;
            if (j20 > j16) {
                tc tcVar2 = this.h;
                float clamp3 = Utilities.clamp((((tcVar2.h * ((float) tcVar2.e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                tc tcVar3 = this.h;
                float f17 = tcVar3.h;
                float f18 = (float) tcVar3.e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j21 = (f17 * f18) - (f19 * f20);
                long j22 = (tcVar3.f5576g * f18) - (clamp4 * f20);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.I = Utilities.clamp(this.I + j19, j12, j11);
                sc scVar3 = this.f5878a;
                if (scVar3 != null) {
                    scVar3.u(this.J);
                    this.f5878a.i0(this.K);
                }
            } else if (j20 < j17) {
                tc tcVar4 = this.h;
                float clamp5 = Utilities.clamp((((tcVar4.f5576g * ((float) tcVar4.e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                tc tcVar5 = this.h;
                float f21 = tcVar5.h;
                float f22 = (float) tcVar5.e;
                float f23 = (float) this.H;
                long j23 = (f21 * f22) - (clamp6 * f23);
                long j24 = (tcVar5.f5576g * f22) - (this.J * f23);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.I = Utilities.clamp(this.I + j19, j10, j3);
                sc scVar4 = this.f5878a;
                if (scVar4 != null) {
                    scVar4.u(this.J);
                    this.f5878a.i0(this.K);
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
        sc scVar5 = this.f5878a;
        if (scVar5 != null) {
            scVar5.O(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f5905m1;
        if (!z10 && (scVar = this.f5878a) != null) {
            scVar.w(true);
            tc tcVar6 = this.h;
            if (tcVar6 != null) {
                long j26 = this.I + (this.J * ((float) this.H));
                float f25 = tcVar6.h;
                float f26 = (float) tcVar6.e;
                clamp = Utilities.clamp(j26, f25 * f26, tcVar6.f5576g * f26);
            } else {
                float f27 = this.J;
                clamp = Utilities.clamp(f27 * ((float) j14), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.f5886c1 = this.e;
                this.f5883b1.d(1.0f, true);
            }
            sc scVar6 = this.f5878a;
            this.e = clamp;
            scVar6.o(clamp, false);
        } else if (z10 || this.f5917r1) {
            tc tcVar7 = this.h;
            if (tcVar7 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f28 = tcVar7.h;
                float f29 = (float) tcVar7.e;
                this.e = Utilities.clamp(j27, f28 * f29, tcVar7.f5576g * f29);
            } else {
                float f30 = this.J;
                this.e = Utilities.clamp(f30 * ((float) j13), this.H, 0L);
            }
            sc scVar7 = this.f5878a;
            if (scVar7 != null) {
                scVar7.o(this.e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        tc tcVar = this.h;
        long j3 = tcVar.e;
        this.f5891f = Utilities.clamp((((tcVar.h + tcVar.f5576g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
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
        tc tcVar;
        tc tcVar2 = this.h;
        ArrayList arrayList = this.f5918s;
        if (tcVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f5935y1) - this.f5932x1) / this.f5924u1;
            tc tcVar3 = this.v;
            if (tcVar3 != null) {
                j3 = (tcVar3.f5576g * ((float) tcVar3.e)) + ((float) tcVar3.f5575f);
            } else {
                j3 = 0;
            }
            float f11 = f10 * ((float) min);
            if (tcVar3 == null) {
                if (this.h == null) {
                    j3 = this.Q;
                } else {
                    j3 = 0;
                }
            }
            long clamp = Utilities.clamp((f11 - ((float) j3)) + ((float) this.f5891f), (float) getBaseDuration(), 0.0f);
            tc tcVar4 = this.h;
            if (tcVar4 != null) {
                float f12 = ((float) clamp) / ((float) tcVar4.e);
                if (f12 < tcVar4.f5576g || f12 > tcVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (tcVar.h - tcVar.f5576g) * ((float) tcVar.e))) {
                if (this.N && tcVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.e = clamp;
                invalidate();
                sc scVar = this.f5878a;
                if (scVar != null) {
                    scVar.o(clamp, z10);
                }
                ai.j jVar = this.f5888d1;
                if (jVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(jVar);
                    this.f5888d1 = null;
                }
                if (z10) {
                    ai.j jVar2 = new ai.j(this, clamp, 7);
                    this.f5888d1 = jVar2;
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
        tc tcVar;
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
            if (getMeasuredWidth() <= 0 || this.M != null || ((tcVar = this.h) != null && tcVar.e < 1)) {
                j11 = j12;
                z13 = false;
                z11 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f5926v1;
                int i11 = this.f5935y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j13 = this.H;
                if (j13 > 2) {
                    l4 = Long.valueOf(j13);
                }
                tc tcVar2 = this.h;
                if (tcVar2 != null) {
                    maxScrollDuration = tcVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z13 = false;
                z11 = true;
                this.M = new xc(this, false, str2, i12, dp, l4, maxScrollDuration, -1L, -1L, new pc(this, 0));
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
        if (j11 != j3 && this.h == null && this.f5879a0 != null) {
            this.W = z11;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(((float) j3) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f5887d0.f(this.G, z11);
            this.f5892f0.f(this.P, z11);
            this.f5885c0.f(this.E, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f7) {
        String str2;
        tc tcVar = this.h;
        if (tcVar == null) {
            str2 = null;
        } else {
            str2 = tcVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        tc tcVar2 = this.h;
        if (tcVar2 != null) {
            xc xcVar = tcVar2.f5574c;
            if (xcVar != null) {
                xcVar.b();
                this.h.f5574c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f5891f = 0L;
            tc tcVar3 = new tc(this);
            this.h = tcVar3;
            tcVar3.f5573b = z10;
            tcVar3.d = str;
            tcVar3.e = j3;
            tcVar3.f5577i = f7;
            tc.a(tcVar3, false);
        } else {
            this.h = null;
            this.f5891f = 0L;
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
        this.f5935y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f5937z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f5926v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f5929w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f5932x1 = dp4;
        this.f5924u1 = (this.f5926v1 - (dp4 * 2)) - (this.f5935y1 * 2);
        tc tcVar = this.h;
        if (tcVar != null && tcVar.d != null && tcVar.f5574c == null) {
            tc.a(tcVar, false);
        }
        ArrayList arrayList = this.f5918s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                tc tcVar2 = (tc) obj;
                if (tcVar2.d != null && tcVar2.f5574c == null) {
                    tc.a(tcVar2, false);
                    tc.b(tcVar2);
                }
            }
        }
        if (this.O != null && this.f5879a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.zc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f5879a0 == null || this.W) {
                this.f5879a0 = new rc(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f5894g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        tc tcVar;
        a4.e eVar = new a4.e(11);
        ArrayList arrayList = this.f5918s;
        Collections.sort(arrayList, eVar);
        if (arrayList.isEmpty()) {
            tcVar = null;
        } else {
            tcVar = (tc) arrayList.get(0);
        }
        this.v = tcVar;
        if (tcVar != null) {
            long j3 = tcVar.f5575f;
        }
    }

    public void setCollage(ArrayList<o8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        xc xcVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f5918s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            tc tcVar = (tc) arrayList2.get(i10);
            if (tcVar != null && (xcVar = tcVar.f5574c) != null) {
                xcVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f5915r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            rc rcVar = (rc) arrayList3.get(i11);
            if (rcVar != null) {
                rcVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f5896h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                o8 o8Var = arrayList.get(i12);
                if (o8Var.K) {
                    tc tcVar2 = new tc(this);
                    tcVar2.f5572a = i12;
                    tcVar2.f5573b = false;
                    tcVar2.d = o8Var.L.getAbsolutePath();
                    tcVar2.e = o8Var.f5154h0;
                    tcVar2.f5575f = o8Var.X;
                    tcVar2.f5577i = o8Var.P;
                    tcVar2.f5576g = o8Var.V;
                    tcVar2.h = o8Var.W;
                    tc.a(tcVar2, false);
                    tc.b(tcVar2);
                    arrayList2.add(tcVar2);
                }
            }
        }
        q();
        this.f5906n = 0;
    }

    public void setDelegate(sc scVar) {
        this.f5878a = scVar;
    }

    public void setMaxCount(int i10) {
        this.f5882b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f5881b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ci.zc.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        tc tcVar = this.h;
        if (tcVar == null) {
            return;
        }
        tcVar.f5576g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        tc tcVar = this.h;
        if (tcVar == null) {
            return;
        }
        tcVar.h = f7;
        invalidate();
    }
}
