package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.vn0;
public final class cc extends View {
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
    public final bc I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public ac M;
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
    public final vn0 W0;
    public boolean X0;
    public final bi.u0 Y0;
    public long Z0;
    public wb f10621a;
    public vb f10622a0;
    public long f10623a1;
    public Runnable f10624b;
    public int f10625b0;
    public final org.telegram.ui.Components.h6 f10626b1;
    public int f10627c;
    public final org.telegram.ui.Components.h6 f10628c0;
    public long f10629c1;
    public Runnable d;
    public final org.telegram.ui.Components.h6 f10630d0;
    public bi.r3 f10631d1;
    public long e;
    public final org.telegram.ui.Components.h6 f10632e0;
    public long f10633e1;
    public long f10634f;
    public final org.telegram.ui.Components.h6 f10635f0;
    public long f10636f1;
    public final org.telegram.ui.Components.h6 f10637g0;
    public float f10638g1;
    public xb h;
    public final org.telegram.ui.Components.h6 f10639h0;
    public int f10640h1;
    public final org.telegram.ui.Components.h6 f10641i0;
    public int f10642i1;
    public boolean f10643j0;
    public int f10644j1;
    public final org.telegram.ui.Components.la f10645k0;
    public int f10646k1;
    public final org.telegram.ui.Components.pa f10647l0;
    public boolean l1;
    public final org.telegram.ui.Components.pa m0;
    public boolean f10648m1;
    public int f10649n;
    public final org.telegram.ui.Components.pa f10650n0;
    public float f10651n1;
    public final RectF f10652o0;
    public boolean f10653o1;
    public final Path f10654p0;
    public VelocityTracker f10655p1;
    public final r11 f10656q0;
    public boolean f10657q1;
    public final ArrayList f10658r;
    public final Drawable f10659r0;
    public boolean f10660r1;
    public final ArrayList f10661s;
    public final bc f10662s0;
    public int f10663s1;
    public final RectF f10664t0;
    public final float[] f10665t1;
    public final Paint f10666u0;
    public int f10667u1;
    public xb v;
    public final Path f10668v0;
    public int f10669v1;
    public final Paint f10670w;
    public final Path f10671w0;
    public int f10672w1;
    public final Path f10673x;
    public final RectF f10674x0;
    public int f10675x1;
    public final Path f10676y;
    public final Path f10677y0;
    public int f10678y1;
    public final Paint f10679z0;
    public int f10680z1;

    public cc(Context context, ViewGroup viewGroup, eb ebVar, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.la laVar) {
        super(context);
        this.f10649n = 0;
        this.f10658r = new ArrayList();
        this.f10661s = new ArrayList();
        this.f10670w = new Paint(3);
        this.f10673x = new Path();
        this.f10676y = new Path();
        this.f10625b0 = 1;
        ds dsVar = ds.h;
        this.f10628c0 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f10630d0 = new org.telegram.ui.Components.h6(this, 360L, dsVar);
        this.f10632e0 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f10635f0 = new org.telegram.ui.Components.h6(this, 360L, dsVar);
        this.f10637g0 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f10639h0 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f10641i0 = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.f10643j0 = true;
        this.f10652o0 = new RectF();
        this.f10654p0 = new Path();
        this.f10662s0 = new bc();
        this.f10664t0 = new RectF();
        this.f10666u0 = new Paint(3);
        this.f10668v0 = new Path();
        this.f10671w0 = new Path();
        this.f10674x0 = new RectF();
        this.f10677y0 = new Path();
        Paint paint = new Paint(1);
        this.f10679z0 = paint;
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
        this.I0 = new bc();
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
        this.W0 = new vn0(getContext(), null);
        this.Z0 = -1L;
        this.f10623a1 = -1L;
        this.f10626b1 = new org.telegram.ui.Components.h6(0.0f, this, 0L, 340L, dsVar);
        this.f10629c1 = -1L;
        this.f10640h1 = -1;
        this.f10642i1 = -1;
        this.f10644j1 = -1;
        this.f10646k1 = -1;
        this.f10651n1 = 1.0f;
        this.f10657q1 = true;
        this.f10660r1 = false;
        this.f10665t1 = new float[8];
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
        this.f10656q0 = new r11(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f10659r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f10645k0 = laVar;
        this.f10647l0 = new org.telegram.ui.Components.pa(laVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.pa(laVar, this, 3, false);
        this.f10650n0 = new org.telegram.ui.Components.pa(laVar, this, 4, false);
        this.Y0 = new bi.u0(this, viewGroup, u6Var, laVar, ebVar, 13);
    }

    public static void a(final cc ccVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.la laVar, View view) {
        int i10;
        ArrayList arrayList = ccVar.f10661s;
        int i11 = ccVar.f10644j1;
        try {
            if (i11 == 2 && ccVar.N) {
                q7 q7Var = new q7(ccVar.getContext(), 0);
                q7Var.f11489b = 0.0f;
                q7Var.f11490c = 1.5f;
                q7Var.d(ccVar.V);
                q7Var.h = new Utilities.Callback(ccVar) {
                    public final cc f11769b;

                    {
                        this.f11769b = ccVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                cc ccVar2 = this.f11769b;
                                ccVar2.V = floatValue;
                                wb wbVar = ccVar2.f10621a;
                                if (wbVar != null) {
                                    wbVar.e(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                cc ccVar3 = this.f11769b;
                                ccVar3.L = floatValue2;
                                wb wbVar2 = ccVar3.f10621a;
                                if (wbVar2 != null) {
                                    wbVar2.c(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                cc ccVar4 = this.f11769b;
                                ccVar4.h.f11972i = f7.floatValue();
                                wb wbVar3 = ccVar4.f10621a;
                                if (wbVar3 != null) {
                                    wbVar3.u(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
                int i12 = ccVar.f10669v1;
                int i13 = ccVar.f10678y1;
                int i14 = ccVar.f10675x1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(ccVar.T, 1.0f, ccVar.f10635f0.f28864c) * ((float) ccVar.R)) + ((float) (ccVar.Q - ccVar.f10634f))) / ((float) min)) * ccVar.f10667u1) + i13 + i14);
                l80 F = l80.F(viewGroup, u6Var, ccVar);
                F.q(q7Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new tb(ccVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(ccVar.f10669v1 - min2)) + AndroidUtilities.dp(18.0f), ccVar.F0.top);
                F.Z();
                F.R(laVar, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && ccVar.E) {
                q7 q7Var2 = new q7(ccVar.getContext(), 0);
                q7Var2.f11489b = 0.0f;
                q7Var2.f11490c = 1.5f;
                q7Var2.d(ccVar.L);
                q7Var2.h = new Utilities.Callback(ccVar) {
                    public final cc f11769b;

                    {
                        this.f11769b = ccVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                cc ccVar2 = this.f11769b;
                                ccVar2.V = floatValue;
                                wb wbVar = ccVar2.f10621a;
                                if (wbVar != null) {
                                    wbVar.e(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                cc ccVar3 = this.f11769b;
                                ccVar3.L = floatValue2;
                                wb wbVar2 = ccVar3.f10621a;
                                if (wbVar2 != null) {
                                    wbVar2.c(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                cc ccVar4 = this.f11769b;
                                ccVar4.h.f11972i = f7.floatValue();
                                wb wbVar3 = ccVar4.f10621a;
                                if (wbVar3 != null) {
                                    wbVar3.u(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
                int i15 = ccVar.f10669v1;
                int i16 = ccVar.f10678y1;
                int i17 = ccVar.f10675x1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(ccVar.K, 1.0f, ccVar.f10630d0.f28864c) * ((float) ccVar.H)) + ((float) (ccVar.I - ccVar.f10634f))) / ((float) min3)) * ccVar.f10667u1) + i16 + i17);
                l80 F2 = l80.F(viewGroup, u6Var, ccVar);
                F2.q(q7Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new tb(ccVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(ccVar.f10669v1 - min4)) + AndroidUtilities.dp(18.0f), ccVar.f10674x0.top);
                F2.Z();
                F2.R(laVar, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && ccVar.h != null) {
                q7 q7Var3 = new q7(ccVar.getContext(), 0);
                q7Var3.f11489b = 0.0f;
                q7Var3.f11490c = 1.5f;
                q7Var3.d(ccVar.h.f11972i);
                q7Var3.h = new Utilities.Callback(ccVar) {
                    public final cc f11769b;

                    {
                        this.f11769b = ccVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                cc ccVar2 = this.f11769b;
                                ccVar2.V = floatValue;
                                wb wbVar = ccVar2.f10621a;
                                if (wbVar != null) {
                                    wbVar.e(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                cc ccVar3 = this.f11769b;
                                ccVar3.L = floatValue2;
                                wb wbVar2 = ccVar3.f10621a;
                                if (wbVar2 != null) {
                                    wbVar2.c(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                cc ccVar4 = this.f11769b;
                                ccVar4.h.f11972i = f7.floatValue();
                                wb wbVar3 = ccVar4.f10621a;
                                if (wbVar3 != null) {
                                    wbVar3.u(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                l80 F3 = l80.F(viewGroup, u6Var, ccVar);
                F3.q(q7Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), ccVar.f10664t0.top);
                F3.Z();
                F3.R(laVar, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = ccVar.f10646k1) >= 0 && i10 < arrayList.size()) {
                xb xbVar = (xb) arrayList.get(ccVar.f10646k1);
                q7 q7Var4 = new q7(ccVar.getContext(), 0);
                q7Var4.f11489b = 0.0f;
                q7Var4.f11490c = 1.5f;
                q7Var4.d(xbVar.f11972i);
                q7Var4.h = new ai.n1(15, ccVar, xbVar);
                l80 F4 = l80.F(viewGroup, u6Var, ccVar);
                F4.q(q7Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), xbVar.f11973j.top);
                F4.Z();
                F4.R(laVar, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f10635f0.e(this.P));
    }

    public long getBaseDuration() {
        xb xbVar = this.h;
        if (xbVar != null) {
            return Math.max(1L, xbVar.e);
        }
        xb xbVar2 = this.v;
        if (xbVar2 != null) {
            return Math.max(1L, xbVar2.e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f10661s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((xb) arrayList.get(i10)).f11974k.f28864c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f10630d0.e(this.G));
    }

    private float getVideoHeight() {
        xb xbVar = this.h;
        if (xbVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), xbVar.f11974k.f28864c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: fi.cc.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        vn0 vn0Var = this.W0;
        if (vn0Var.b()) {
            int i10 = vn0Var.f33790j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f10657q1) {
                this.f10634f = Math.max(0.0f, (((i10 - this.f10678y1) - this.f10675x1) / this.f10667u1) * ((float) min));
            } else if (!this.P) {
                vn0Var.a();
                return;
            } else {
                int i11 = this.f10678y1;
                int i12 = this.f10675x1;
                float f7 = this.f10667u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f10663s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f10663s1 = i10;
        } else if (this.f10660r1) {
            this.f10660r1 = false;
            wb wbVar = this.f10621a;
            if (wbVar != null) {
                wbVar.o(false);
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
        xb xbVar = this.v;
        if (xbVar != null) {
            f12 = (xbVar.f11971g * ((float) xbVar.e)) + ((float) xbVar.f11970f);
        } else {
            if (this.h == null) {
                j11 = this.Q;
            } else {
                j11 = 0;
            }
            f12 = (float) j11;
        }
        float f13 = (this.f10667u1 * (((clamp + f12) - ((float) this.f10634f)) / ((float) min))) + this.f10678y1 + this.f10675x1;
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
    public final void dispatchDraw(android.graphics.Canvas r57) {
        throw new UnsupportedOperationException("Method not decompiled: fi.cc.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f10669v1, this.f10672w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f10679z0;
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
        float y3 = org.telegram.messenger.t.y(AndroidUtilities.dp(f15), dp, 2.0f, f11);
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
        float B = c3.h0.B(AndroidUtilities.dp(f17), dp, 2.0f, f12);
        if (this.X0) {
            f18 = 2.5f;
        }
        rectF.set(B, f20, org.telegram.messenger.t.b(AndroidUtilities.dp(f18), dp, 2.0f, f12), f21);
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
        return this.f10625b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f10680z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f10661s.isEmpty()) {
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
        return (int) (f15 + f12 + this.f10680z1);
    }

    public int getMaxCount() {
        return this.f10625b0;
    }

    public long getMaxScrollDuration() {
        if (this.f10661s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f10680z1 + this.f10680z1, getContentHeight(), this.f10641i0.f28864c);
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
        wb wbVar;
        long j17;
        long clamp;
        xb xbVar = this.h;
        if (xbVar == null && !this.E) {
            long j18 = this.Q;
            long clamp2 = Utilities.clamp(j18 + f7, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f13 = (float) (clamp2 - j18);
            this.S = Utilities.clamp(this.S - (f13 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f13 / ((float) this.R)), 1.0f, 0.0f);
            wb wbVar2 = this.f10621a;
            if (wbVar2 != null) {
                wbVar2.D(this.S);
                this.f10621a.C(this.T);
            }
        } else if (this.P) {
            if (xbVar != null) {
                f10 = xbVar.f11971g;
                j10 = xbVar.e;
            } else {
                f10 = this.J;
                j10 = this.H;
            }
            float f14 = f10 * ((float) j10);
            if (xbVar != null) {
                f11 = xbVar.h;
                j11 = xbVar.e;
            } else {
                f11 = this.K;
                j11 = this.H;
            }
            float f15 = f11 * ((float) j11);
            if (xbVar != null) {
                f12 = (xbVar.h - xbVar.f11971g) * ((float) xbVar.e);
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
                wb wbVar3 = this.f10621a;
                if (wbVar3 != null) {
                    wbVar3.D(this.S);
                    this.f10621a.C(this.T);
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
                wb wbVar4 = this.f10621a;
                if (wbVar4 != null) {
                    wbVar4.D(this.S);
                    this.f10621a.C(this.T);
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
        wb wbVar5 = this.f10621a;
        if (wbVar5 != null) {
            wbVar5.L(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f10648m1;
        if (!z10 && (wbVar = this.f10621a) != null) {
            wbVar.o(true);
            xb xbVar2 = this.h;
            if (xbVar2 != null) {
                long j28 = this.Q + (this.S * ((float) this.R));
                float f23 = xbVar2.h;
                float f24 = (float) xbVar2.e;
                clamp = Utilities.clamp(j28, f23 * f24, xbVar2.f11971g * f24);
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
                this.f10629c1 = this.e;
                this.f10626b1.d(1.0f, true);
            }
            wb wbVar6 = this.f10621a;
            this.e = clamp;
            wbVar6.h(clamp, false);
        } else if (z10 || this.f10660r1) {
            xb xbVar3 = this.h;
            if (xbVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f28 = xbVar3.h;
                float f29 = (float) xbVar3.e;
                this.e = Utilities.clamp(j30, f28 * f29, xbVar3.f11971g * f29);
            } else if (this.E && xbVar3 != null) {
                long j31 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) xbVar3.e;
                this.e = Utilities.clamp(j31, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.e = Utilities.clamp(f32 * ((float) j16), this.R, 0L);
            }
            wb wbVar7 = this.f10621a;
            if (wbVar7 != null) {
                wbVar7.h(this.e, false);
            }
        }
    }

    public final void i(xb xbVar, float f7) {
        long j10;
        wb wbVar;
        long j11;
        long clamp;
        long j12;
        long j13;
        long j14;
        long j15;
        if (xbVar != null) {
            xb xbVar2 = this.v;
            if (xbVar2 != xbVar && xbVar2 != null) {
                if (this.f10649n == this.f10661s.indexOf(xbVar)) {
                    xb xbVar3 = this.v;
                    float f10 = (float) xbVar3.e;
                    float f11 = xbVar.h;
                    float f12 = (float) xbVar.e;
                    float f13 = xbVar.f11971g;
                    long j16 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((xbVar3.h - xbVar3.f11971g) * f10) / f12);
                    long j17 = xbVar.f11970f;
                    long j18 = f7;
                    long j19 = j17 + j18;
                    if (j19 > (f10 * 1.0f) - (f11 * f12)) {
                        xb xbVar4 = this.v;
                        float clamp2 = Utilities.clamp((((xbVar4.h * ((float) xbVar4.e)) - ((float) j17)) - ((float) j18)) / ((float) xbVar.e), 1.0f, min);
                        xbVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        xbVar.f11971g = clamp3;
                        xb xbVar5 = this.v;
                        float f14 = xbVar5.h;
                        float f15 = (float) xbVar5.e;
                        float f16 = xbVar.h;
                        float f17 = (float) xbVar.e;
                        long j20 = (f14 * f15) - (f16 * f17);
                        long j21 = (xbVar5.f11971g * f15) - (clamp3 * f17);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        xbVar.f11970f = Utilities.clamp(xbVar.f11970f + j18, j15, j14);
                        wb wbVar2 = this.f10621a;
                        if (wbVar2 != null) {
                            wbVar2.B(xbVar.f11971g, xbVar.f11967a);
                            this.f10621a.E(xbVar.h, xbVar.f11967a);
                        }
                    } else if (j19 < j16) {
                        xb xbVar6 = this.v;
                        float clamp4 = Utilities.clamp((((xbVar6.f11971g * ((float) xbVar6.e)) - ((float) j17)) - ((float) j18)) / ((float) xbVar.e), 1.0f - min, 0.0f);
                        xbVar.f11971g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        xbVar.h = clamp5;
                        xb xbVar7 = this.v;
                        float f18 = xbVar7.h;
                        float f19 = (float) xbVar7.e;
                        float f20 = (float) xbVar.e;
                        long j22 = (f18 * f19) - (clamp5 * f20);
                        long j23 = (xbVar7.f11971g * f19) - (xbVar.f11971g * f20);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        xbVar.f11970f = Utilities.clamp(xbVar.f11970f + j18, j13, j12);
                        wb wbVar3 = this.f10621a;
                        if (wbVar3 != null) {
                            wbVar3.B(xbVar.f11971g, xbVar.f11967a);
                            this.f10621a.E(xbVar.h, xbVar.f11967a);
                        }
                    } else {
                        xbVar.f11970f = j19;
                    }
                } else {
                    long j24 = xbVar.f11970f + f7;
                    float f21 = (float) xbVar.e;
                    xbVar.f11970f = Utilities.clamp(j24, ((float) getBaseDuration()) - (xbVar.h * f21), (-xbVar.f11971g) * f21);
                }
            }
            invalidate();
            wb wbVar4 = this.f10621a;
            if (wbVar4 != null) {
                wbVar4.K(xbVar.f11967a, xbVar.f11970f);
            }
            boolean z10 = this.f10648m1;
            if (!z10 && (wbVar = this.f10621a) != null) {
                wbVar.o(true);
                xb xbVar8 = this.v;
                if (xbVar8 != xbVar && xbVar8 != null) {
                    long j25 = xbVar.f11970f + (xbVar.f11971g * ((float) xbVar.e));
                    float f22 = xbVar8.h;
                    float f23 = (float) xbVar8.e;
                    clamp = Utilities.clamp(j25, f22 * f23, xbVar8.f11971g * f23);
                } else {
                    float f24 = xbVar.f11971g;
                    clamp = Utilities.clamp(f24 * ((float) j11), xbVar.e, 0L);
                }
                xb xbVar9 = this.v;
                if (xbVar9 != xbVar && xbVar9 != null && Math.abs(this.e - clamp) > 400) {
                    this.f10629c1 = this.e;
                    this.f10626b1.d(1.0f, true);
                }
                wb wbVar5 = this.f10621a;
                this.e = clamp;
                wbVar5.h(clamp, false);
            } else if (z10 || this.f10660r1) {
                xb xbVar10 = this.v;
                if (xbVar10 != xbVar && xbVar10 != null) {
                    long j26 = xbVar.f11970f + (xbVar.f11971g * ((float) xbVar.e));
                    float f25 = xbVar10.h;
                    float f26 = (float) xbVar10.e;
                    this.e = Utilities.clamp(j26, f25 * f26, xbVar10.f11971g * f26);
                } else {
                    float f27 = xbVar.f11971g;
                    this.e = Utilities.clamp(f27 * ((float) j10), xbVar.e, 0L);
                }
                wb wbVar6 = this.f10621a;
                if (wbVar6 != null) {
                    wbVar6.h(this.e, false);
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
        wb wbVar;
        long j15;
        long clamp;
        xb xbVar = this.h;
        if (xbVar == null) {
            long j16 = this.I;
            long clamp2 = Utilities.clamp(j16 + f7, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = (float) (clamp2 - j16);
            this.J = Utilities.clamp(this.J - (f10 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / ((float) this.H)), 1.0f, 0.0f);
            wb wbVar2 = this.f10621a;
            if (wbVar2 != null) {
                wbVar2.n(this.J);
                this.f10621a.J(this.K);
            }
        } else if (this.G) {
            float f11 = xbVar.h;
            float f12 = (float) xbVar.e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j17 = (f11 * f12) - (f13 * f14);
            float f15 = xbVar.f11971g;
            float f16 = this.J;
            long j18 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j19 = this.I;
            long j20 = f7;
            long j21 = j19 + j20;
            if (j21 > j17) {
                xb xbVar2 = this.h;
                float clamp3 = Utilities.clamp((((xbVar2.h * ((float) xbVar2.e)) - ((float) j19)) - ((float) j20)) / ((float) this.H), 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                xb xbVar3 = this.h;
                float f17 = xbVar3.h;
                float f18 = (float) xbVar3.e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j22 = (f17 * f18) - (f19 * f20);
                long j23 = (xbVar3.f11971g * f18) - (clamp4 * f20);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.I = Utilities.clamp(this.I + j20, j13, j12);
                wb wbVar3 = this.f10621a;
                if (wbVar3 != null) {
                    wbVar3.n(this.J);
                    this.f10621a.J(this.K);
                }
            } else if (j21 < j18) {
                xb xbVar4 = this.h;
                float clamp5 = Utilities.clamp((((xbVar4.f11971g * ((float) xbVar4.e)) - ((float) j19)) - ((float) j20)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                xb xbVar5 = this.h;
                float f21 = xbVar5.h;
                float f22 = (float) xbVar5.e;
                float f23 = (float) this.H;
                long j24 = (f21 * f22) - (clamp6 * f23);
                long j25 = (xbVar5.f11971g * f22) - (this.J * f23);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.I = Utilities.clamp(this.I + j20, j11, j10);
                wb wbVar4 = this.f10621a;
                if (wbVar4 != null) {
                    wbVar4.n(this.J);
                    this.f10621a.J(this.K);
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
        wb wbVar5 = this.f10621a;
        if (wbVar5 != null) {
            wbVar5.z(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f10648m1;
        if (!z10 && (wbVar = this.f10621a) != null) {
            wbVar.o(true);
            xb xbVar6 = this.h;
            if (xbVar6 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f25 = xbVar6.h;
                float f26 = (float) xbVar6.e;
                clamp = Utilities.clamp(j27, f25 * f26, xbVar6.f11971g * f26);
            } else {
                float f27 = this.J;
                clamp = Utilities.clamp(f27 * ((float) j15), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.f10629c1 = this.e;
                this.f10626b1.d(1.0f, true);
            }
            wb wbVar6 = this.f10621a;
            this.e = clamp;
            wbVar6.h(clamp, false);
        } else if (z10 || this.f10660r1) {
            xb xbVar7 = this.h;
            if (xbVar7 != null) {
                long j28 = this.I + (this.J * ((float) this.H));
                float f28 = xbVar7.h;
                float f29 = (float) xbVar7.e;
                this.e = Utilities.clamp(j28, f28 * f29, xbVar7.f11971g * f29);
            } else {
                float f30 = this.J;
                this.e = Utilities.clamp(f30 * ((float) j14), this.H, 0L);
            }
            wb wbVar7 = this.f10621a;
            if (wbVar7 != null) {
                wbVar7.h(this.e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        xb xbVar = this.h;
        long j10 = xbVar.e;
        this.f10634f = Utilities.clamp((((xbVar.h + xbVar.f11971g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
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
        xb xbVar;
        xb xbVar2 = this.h;
        ArrayList arrayList = this.f10661s;
        if (xbVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f10678y1) - this.f10675x1) / this.f10667u1;
            xb xbVar3 = this.v;
            if (xbVar3 != null) {
                j10 = (xbVar3.f11971g * ((float) xbVar3.e)) + ((float) xbVar3.f11970f);
            } else {
                j10 = 0;
            }
            float f11 = f10 * ((float) min);
            if (xbVar3 == null) {
                if (this.h == null) {
                    j10 = this.Q;
                } else {
                    j10 = 0;
                }
            }
            long clamp = Utilities.clamp((f11 - ((float) j10)) + ((float) this.f10634f), (float) getBaseDuration(), 0.0f);
            xb xbVar4 = this.h;
            if (xbVar4 != null) {
                float f12 = ((float) clamp) / ((float) xbVar4.e);
                if (f12 < xbVar4.f11971g || f12 > xbVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (xbVar.h - xbVar.f11971g) * ((float) xbVar.e))) {
                if (this.N && xbVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.e = clamp;
                invalidate();
                wb wbVar = this.f10621a;
                if (wbVar != null) {
                    wbVar.h(clamp, z10);
                }
                bi.r3 r3Var = this.f10631d1;
                if (r3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(r3Var);
                    this.f10631d1 = null;
                }
                if (z10) {
                    bi.r3 r3Var2 = new bi.r3(this, clamp, 9);
                    this.f10631d1 = r3Var2;
                    AndroidUtilities.runOnUIThread(r3Var2, 150L);
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
        xb xbVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        ac acVar = this.M;
        Long l4 = null;
        if (acVar != null) {
            acVar.b();
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
            if (getMeasuredWidth() <= 0 || this.M != null || ((xbVar = this.h) != null && xbVar.e < 1)) {
                z11 = false;
                j12 = j13;
                z12 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f10669v1;
                int i11 = this.f10678y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.H;
                if (j14 > 2) {
                    l4 = Long.valueOf(j14);
                }
                xb xbVar2 = this.h;
                if (xbVar2 != null) {
                    maxScrollDuration = xbVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z11 = false;
                z12 = true;
                this.M = new ac(this, false, str2, i12, dp, l4, maxScrollDuration, -1L, -1L, new tb(this, 0));
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
        if (j12 != j10 && this.h == null && this.f10622a0 != null) {
            this.W = z12;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(((float) j10) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f10630d0.f(this.G, z12);
            this.f10635f0.f(this.P, z12);
            this.f10628c0.f(this.E, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f7) {
        String str2;
        xb xbVar = this.h;
        if (xbVar == null) {
            str2 = null;
        } else {
            str2 = xbVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        xb xbVar2 = this.h;
        if (xbVar2 != null) {
            ac acVar = xbVar2.f11969c;
            if (acVar != null) {
                acVar.b();
                this.h.f11969c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f10634f = 0L;
            xb xbVar3 = new xb(this);
            this.h = xbVar3;
            xbVar3.f11968b = z10;
            xbVar3.d = str;
            xbVar3.e = j10;
            xbVar3.f11972i = f7;
            xb.a(xbVar3, false);
        } else {
            this.h = null;
            this.f10634f = 0L;
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
        this.f10678y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f10680z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f10669v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f10672w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f10675x1 = dp4;
        this.f10667u1 = (this.f10669v1 - (dp4 * 2)) - (this.f10678y1 * 2);
        xb xbVar = this.h;
        if (xbVar != null && xbVar.d != null && xbVar.f11969c == null) {
            xb.a(xbVar, false);
        }
        ArrayList arrayList = this.f10661s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                xb xbVar2 = (xb) obj;
                if (xbVar2.d != null && xbVar2.f11969c == null) {
                    xb.a(xbVar2, false);
                    xb.b(xbVar2);
                }
            }
        }
        if (this.O != null && this.f10622a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: fi.cc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f10622a0 == null || this.W) {
                this.f10622a0 = new vb(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f10637g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        xb xbVar;
        a4.d dVar = new a4.d(17);
        ArrayList arrayList = this.f10661s;
        Collections.sort(arrayList, dVar);
        if (arrayList.isEmpty()) {
            xbVar = null;
        } else {
            xbVar = (xb) arrayList.get(0);
        }
        this.v = xbVar;
        if (xbVar != null) {
            long j10 = xbVar.f11970f;
        }
    }

    public void setCollage(ArrayList<w7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ac acVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f10661s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            xb xbVar = (xb) arrayList2.get(i10);
            if (xbVar != null && (acVar = xbVar.f11969c) != null) {
                acVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f10658r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            vb vbVar = (vb) arrayList3.get(i11);
            if (vbVar != null) {
                vbVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f10639h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                w7 w7Var = arrayList.get(i12);
                if (w7Var.K) {
                    xb xbVar2 = new xb(this);
                    xbVar2.f11967a = i12;
                    xbVar2.f11968b = false;
                    xbVar2.d = w7Var.L.getAbsolutePath();
                    xbVar2.e = w7Var.f11904h0;
                    xbVar2.f11970f = w7Var.X;
                    xbVar2.f11972i = w7Var.P;
                    xbVar2.f11971g = w7Var.V;
                    xbVar2.h = w7Var.W;
                    xb.a(xbVar2, false);
                    xb.b(xbVar2);
                    arrayList2.add(xbVar2);
                }
            }
        }
        q();
        this.f10649n = 0;
    }

    public void setDelegate(wb wbVar) {
        this.f10621a = wbVar;
    }

    public void setMaxCount(int i10) {
        this.f10625b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f10624b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: fi.cc.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        xb xbVar = this.h;
        if (xbVar == null) {
            return;
        }
        xbVar.f11971g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        xb xbVar = this.h;
        if (xbVar == null) {
            return;
        }
        xbVar.h = f7;
        invalidate();
    }
}
