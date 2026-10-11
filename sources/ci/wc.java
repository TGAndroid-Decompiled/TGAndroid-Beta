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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.un0;
public final class wc extends View {
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
    public final vc I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public uc M;
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
    public final un0 W0;
    public boolean X0;
    public final ai.n3 Y0;
    public long Z0;
    public pc f6226a;
    public oc f6227a0;
    public long f6228a1;
    public Runnable f6229b;
    public int f6230b0;
    public final org.telegram.ui.Components.g6 f6231b1;
    public int f6232c;
    public final org.telegram.ui.Components.g6 f6233c0;
    public long f6234c1;
    public Runnable d;
    public final org.telegram.ui.Components.g6 f6235d0;
    public ai.j f6236d1;
    public long f6237e;
    public final org.telegram.ui.Components.g6 f6238e0;
    public long f6239e1;
    public long f6240f;
    public final org.telegram.ui.Components.g6 f6241f0;
    public long f6242f1;
    public final org.telegram.ui.Components.g6 f6243g0;
    public float f6244g1;
    public qc h;
    public final org.telegram.ui.Components.g6 f6245h0;
    public int f6246h1;
    public final org.telegram.ui.Components.g6 f6247i0;
    public int f6248i1;
    public boolean f6249j0;
    public int f6250j1;
    public final org.telegram.ui.Components.la f6251k0;
    public int f6252k1;
    public final org.telegram.ui.Components.pa f6253l0;
    public boolean l1;
    public final org.telegram.ui.Components.pa m0;
    public boolean f6254m1;
    public int f6255n;
    public final org.telegram.ui.Components.pa f6256n0;
    public float f6257n1;
    public final RectF f6258o0;
    public boolean f6259o1;
    public final Path f6260p0;
    public VelocityTracker f6261p1;
    public final m11 f6262q0;
    public boolean f6263q1;
    public final ArrayList f6264r;
    public final Drawable f6265r0;
    public boolean f6266r1;
    public final ArrayList f6267s;
    public final vc f6268s0;
    public int f6269s1;
    public final RectF f6270t0;
    public final float[] f6271t1;
    public final Paint f6272u0;
    public int f6273u1;
    public qc v;
    public final Path f6274v0;
    public int f6275v1;
    public final Paint f6276w;
    public final Path f6277w0;
    public int f6278w1;
    public final Path f6279x;
    public final RectF f6280x0;
    public int f6281x1;
    public final Path f6282y;
    public final Path f6283y0;
    public int f6284y1;
    public final Paint f6285z0;
    public int f6286z1;

    public wc(Context context, ViewGroup viewGroup, xb xbVar, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.la laVar) {
        super(context);
        this.f6255n = 0;
        this.f6264r = new ArrayList();
        this.f6267s = new ArrayList();
        this.f6276w = new Paint(3);
        this.f6279x = new Path();
        this.f6282y = new Path();
        this.f6230b0 = 1;
        is isVar = is.h;
        this.f6233c0 = new org.telegram.ui.Components.g6(this, 0L, 360L, isVar);
        this.f6235d0 = new org.telegram.ui.Components.g6(this, 360L, isVar);
        this.f6238e0 = new org.telegram.ui.Components.g6(this, 0L, 360L, isVar);
        this.f6241f0 = new org.telegram.ui.Components.g6(this, 360L, isVar);
        this.f6243g0 = new org.telegram.ui.Components.g6(this, 0L, 360L, isVar);
        this.f6245h0 = new org.telegram.ui.Components.g6(this, 0L, 360L, isVar);
        this.f6247i0 = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        this.f6249j0 = true;
        this.f6258o0 = new RectF();
        this.f6260p0 = new Path();
        this.f6268s0 = new vc();
        this.f6270t0 = new RectF();
        this.f6272u0 = new Paint(3);
        this.f6274v0 = new Path();
        this.f6277w0 = new Path();
        this.f6280x0 = new RectF();
        this.f6283y0 = new Path();
        Paint paint = new Paint(1);
        this.f6285z0 = paint;
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
        this.I0 = new vc();
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
        this.W0 = new un0(getContext(), null);
        this.Z0 = -1L;
        this.f6228a1 = -1L;
        this.f6231b1 = new org.telegram.ui.Components.g6(0.0f, this, 0L, 340L, isVar);
        this.f6234c1 = -1L;
        this.f6246h1 = -1;
        this.f6248i1 = -1;
        this.f6250j1 = -1;
        this.f6252k1 = -1;
        this.f6257n1 = 1.0f;
        this.f6263q1 = true;
        this.f6266r1 = false;
        this.f6271t1 = new float[8];
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
        this.f6262q0 = new m11(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f6265r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f6251k0 = laVar;
        this.f6253l0 = new org.telegram.ui.Components.pa(laVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.pa(laVar, this, 3, false);
        this.f6256n0 = new org.telegram.ui.Components.pa(laVar, this, 4, false);
        this.Y0 = new ai.n3(this, viewGroup, d6Var, laVar, xbVar, 5);
    }

    public static void a(final wc wcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.la laVar, View view) {
        int i10;
        ArrayList arrayList = wcVar.f6267s;
        int i11 = wcVar.f6250j1;
        try {
            if (i11 == 2 && wcVar.N) {
                f8 f8Var = new f8(wcVar.getContext(), 0);
                f8Var.f5076b = 0.0f;
                f8Var.f5077c = 1.5f;
                f8Var.d(wcVar.V);
                f8Var.h = new Utilities.Callback(wcVar) {
                    public final wc f5654b;

                    {
                        this.f5654b = wcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                wc wcVar2 = this.f5654b;
                                wcVar2.V = floatValue;
                                pc pcVar = wcVar2.f6226a;
                                if (pcVar != null) {
                                    pcVar.g(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                wc wcVar3 = this.f5654b;
                                wcVar3.L = floatValue2;
                                pc pcVar2 = wcVar3.f6226a;
                                if (pcVar2 != null) {
                                    pcVar2.e(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                wc wcVar4 = this.f5654b;
                                wcVar4.h.f5850i = f7.floatValue();
                                pc pcVar3 = wcVar4.f6226a;
                                if (pcVar3 != null) {
                                    pcVar3.w(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(wcVar.getBaseDuration(), wcVar.getMaxScrollDuration());
                int i12 = wcVar.f6275v1;
                int i13 = wcVar.f6284y1;
                int i14 = wcVar.f6281x1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(wcVar.T, 1.0f, wcVar.f6241f0.f26665c) * ((float) wcVar.R)) + ((float) (wcVar.Q - wcVar.f6240f))) / ((float) min)) * wcVar.f6273u1) + i13 + i14);
                p80 F = p80.F(viewGroup, d6Var, wcVar);
                F.q(f8Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new mc(wcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(wcVar.f6275v1 - min2)) + AndroidUtilities.dp(18.0f), wcVar.F0.top);
                F.Z();
                F.R(laVar, -view.getX(), -view.getY());
                wcVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && wcVar.E) {
                f8 f8Var2 = new f8(wcVar.getContext(), 0);
                f8Var2.f5076b = 0.0f;
                f8Var2.f5077c = 1.5f;
                f8Var2.d(wcVar.L);
                f8Var2.h = new Utilities.Callback(wcVar) {
                    public final wc f5654b;

                    {
                        this.f5654b = wcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                wc wcVar2 = this.f5654b;
                                wcVar2.V = floatValue;
                                pc pcVar = wcVar2.f6226a;
                                if (pcVar != null) {
                                    pcVar.g(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                wc wcVar3 = this.f5654b;
                                wcVar3.L = floatValue2;
                                pc pcVar2 = wcVar3.f6226a;
                                if (pcVar2 != null) {
                                    pcVar2.e(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                wc wcVar4 = this.f5654b;
                                wcVar4.h.f5850i = f7.floatValue();
                                pc pcVar3 = wcVar4.f6226a;
                                if (pcVar3 != null) {
                                    pcVar3.w(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(wcVar.getBaseDuration(), wcVar.getMaxScrollDuration());
                int i15 = wcVar.f6275v1;
                int i16 = wcVar.f6284y1;
                int i17 = wcVar.f6281x1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(wcVar.K, 1.0f, wcVar.f6235d0.f26665c) * ((float) wcVar.H)) + ((float) (wcVar.I - wcVar.f6240f))) / ((float) min3)) * wcVar.f6273u1) + i16 + i17);
                p80 F2 = p80.F(viewGroup, d6Var, wcVar);
                F2.q(f8Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new mc(wcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(wcVar.f6275v1 - min4)) + AndroidUtilities.dp(18.0f), wcVar.f6280x0.top);
                F2.Z();
                F2.R(laVar, -view.getX(), -view.getY());
                wcVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && wcVar.h != null) {
                f8 f8Var3 = new f8(wcVar.getContext(), 0);
                f8Var3.f5076b = 0.0f;
                f8Var3.f5077c = 1.5f;
                f8Var3.d(wcVar.h.f5850i);
                f8Var3.h = new Utilities.Callback(wcVar) {
                    public final wc f5654b;

                    {
                        this.f5654b = wcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                wc wcVar2 = this.f5654b;
                                wcVar2.V = floatValue;
                                pc pcVar = wcVar2.f6226a;
                                if (pcVar != null) {
                                    pcVar.g(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                wc wcVar3 = this.f5654b;
                                wcVar3.L = floatValue2;
                                pc pcVar2 = wcVar3.f6226a;
                                if (pcVar2 != null) {
                                    pcVar2.e(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                wc wcVar4 = this.f5654b;
                                wcVar4.h.f5850i = f7.floatValue();
                                pc pcVar3 = wcVar4.f6226a;
                                if (pcVar3 != null) {
                                    pcVar3.w(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                p80 F3 = p80.F(viewGroup, d6Var, wcVar);
                F3.q(f8Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), wcVar.f6270t0.top);
                F3.Z();
                F3.R(laVar, -view.getX(), -view.getY());
                wcVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = wcVar.f6252k1) >= 0 && i10 < arrayList.size()) {
                qc qcVar = (qc) arrayList.get(wcVar.f6252k1);
                f8 f8Var4 = new f8(wcVar.getContext(), 0);
                f8Var4.f5076b = 0.0f;
                f8Var4.f5077c = 1.5f;
                f8Var4.d(qcVar.f5850i);
                f8Var4.h = new ai.h3(8, wcVar, qcVar);
                p80 F4 = p80.F(viewGroup, d6Var, wcVar);
                F4.q(f8Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), qcVar.f5851j.top);
                F4.Z();
                F4.R(laVar, -view.getX(), -view.getY());
                wcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f6241f0.e(this.P));
    }

    public long getBaseDuration() {
        qc qcVar = this.h;
        if (qcVar != null) {
            return Math.max(1L, qcVar.f5847e);
        }
        qc qcVar2 = this.v;
        if (qcVar2 != null) {
            return Math.max(1L, qcVar2.f5847e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f6267s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((qc) arrayList.get(i10)).f5852k.f26665c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f6235d0.e(this.G));
    }

    private float getVideoHeight() {
        qc qcVar = this.h;
        if (qcVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), qcVar.f5852k.f26665c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.wc.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        un0 un0Var = this.W0;
        if (un0Var.b()) {
            int i10 = un0Var.f31656j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f6263q1) {
                this.f6240f = Math.max(0.0f, (((i10 - this.f6284y1) - this.f6281x1) / this.f6273u1) * ((float) min));
            } else if (!this.P) {
                un0Var.a();
                return;
            } else {
                int i11 = this.f6284y1;
                int i12 = this.f6281x1;
                float f7 = this.f6273u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f6269s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f6269s1 = i10;
        } else if (this.f6266r1) {
            this.f6266r1 = false;
            pc pcVar = this.f6226a;
            if (pcVar != null) {
                pcVar.q(false);
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
        qc qcVar = this.v;
        if (qcVar != null) {
            f12 = (qcVar.f5849g * ((float) qcVar.f5847e)) + ((float) qcVar.f5848f);
        } else {
            if (this.h == null) {
                j10 = this.Q;
            } else {
                j10 = 0;
            }
            f12 = (float) j10;
        }
        float f13 = (this.f6273u1 * (((clamp + f12) - ((float) this.f6240f)) / ((float) min))) + this.f6284y1 + this.f6281x1;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.wc.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f6275v1, this.f6278w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f6285z0;
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
        float x10 = org.telegram.messenger.q.x(AndroidUtilities.dp(f15), dp, 2.0f, f11);
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
        float z11 = com.google.android.gms.internal.vision.e2.z(AndroidUtilities.dp(f17), dp, 2.0f, f12);
        if (this.X0) {
            f18 = 2.5f;
        }
        rectF.set(z11, f20, org.telegram.messenger.q.a(AndroidUtilities.dp(f18), dp, 2.0f, f12), f21);
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
        return this.f6230b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f6286z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f6267s.isEmpty()) {
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
        return (int) (f15 + f12 + this.f6286z1);
    }

    public int getMaxCount() {
        return this.f6230b0;
    }

    public long getMaxScrollDuration() {
        if (this.f6267s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f6286z1 + this.f6286z1, getContentHeight(), this.f6247i0.f26665c);
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
        pc pcVar;
        long j16;
        long clamp;
        qc qcVar = this.h;
        if (qcVar == null && !this.E) {
            long j17 = this.Q;
            long clamp2 = Utilities.clamp(j17 + f7, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f13 = (float) (clamp2 - j17);
            this.S = Utilities.clamp(this.S - (f13 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f13 / ((float) this.R)), 1.0f, 0.0f);
            pc pcVar2 = this.f6226a;
            if (pcVar2 != null) {
                pcVar2.K(this.S);
                this.f6226a.I(this.T);
            }
        } else if (this.P) {
            if (qcVar != null) {
                f10 = qcVar.f5849g;
                j3 = qcVar.f5847e;
            } else {
                f10 = this.J;
                j3 = this.H;
            }
            float f14 = f10 * ((float) j3);
            if (qcVar != null) {
                f11 = qcVar.h;
                j10 = qcVar.f5847e;
            } else {
                f11 = this.K;
                j10 = this.H;
            }
            float f15 = f11 * ((float) j10);
            if (qcVar != null) {
                f12 = (qcVar.h - qcVar.f5849g) * ((float) qcVar.f5847e);
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
                pc pcVar3 = this.f6226a;
                if (pcVar3 != null) {
                    pcVar3.K(this.S);
                    this.f6226a.I(this.T);
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
                pc pcVar4 = this.f6226a;
                if (pcVar4 != null) {
                    pcVar4.K(this.S);
                    this.f6226a.I(this.T);
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
        pc pcVar5 = this.f6226a;
        if (pcVar5 != null) {
            pcVar5.V(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f6254m1;
        if (!z10 && (pcVar = this.f6226a) != null) {
            pcVar.q(true);
            qc qcVar2 = this.h;
            if (qcVar2 != null) {
                long j27 = this.Q + (this.S * ((float) this.R));
                float f23 = qcVar2.h;
                float f24 = (float) qcVar2.f5847e;
                clamp = Utilities.clamp(j27, f23 * f24, qcVar2.f5849g * f24);
            } else if (this.E) {
                long j28 = this.Q + (this.S * ((float) this.R));
                float f25 = this.K;
                float f26 = (float) this.H;
                clamp = Utilities.clamp(j28, f25 * f26, this.J * f26);
            } else {
                float f27 = this.S;
                clamp = Utilities.clamp(f27 * ((float) j16), this.R, 0L);
            }
            if (this.h != null && Math.abs(this.f6237e - clamp) > 400) {
                this.f6234c1 = this.f6237e;
                this.f6231b1.d(1.0f, true);
            }
            pc pcVar6 = this.f6226a;
            this.f6237e = clamp;
            pcVar6.h(clamp, false);
        } else if (z10 || this.f6266r1) {
            qc qcVar3 = this.h;
            if (qcVar3 != null) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f28 = qcVar3.h;
                float f29 = (float) qcVar3.f5847e;
                this.f6237e = Utilities.clamp(j29, f28 * f29, qcVar3.f5849g * f29);
            } else if (this.E && qcVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) qcVar3.f5847e;
                this.f6237e = Utilities.clamp(j30, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.f6237e = Utilities.clamp(f32 * ((float) j15), this.R, 0L);
            }
            pc pcVar7 = this.f6226a;
            if (pcVar7 != null) {
                pcVar7.h(this.f6237e, false);
            }
        }
    }

    public final void i(qc qcVar, float f7) {
        long j3;
        pc pcVar;
        long j10;
        long clamp;
        long j11;
        long j12;
        long j13;
        long j14;
        if (qcVar != null) {
            qc qcVar2 = this.v;
            if (qcVar2 != qcVar && qcVar2 != null) {
                if (this.f6255n == this.f6267s.indexOf(qcVar)) {
                    qc qcVar3 = this.v;
                    float f10 = (float) qcVar3.f5847e;
                    float f11 = qcVar.h;
                    float f12 = (float) qcVar.f5847e;
                    float f13 = qcVar.f5849g;
                    long j15 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((qcVar3.h - qcVar3.f5849g) * f10) / f12);
                    long j16 = qcVar.f5848f;
                    long j17 = f7;
                    long j18 = j16 + j17;
                    if (j18 > (f10 * 1.0f) - (f11 * f12)) {
                        qc qcVar4 = this.v;
                        float clamp2 = Utilities.clamp((((qcVar4.h * ((float) qcVar4.f5847e)) - ((float) j16)) - ((float) j17)) / ((float) qcVar.f5847e), 1.0f, min);
                        qcVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        qcVar.f5849g = clamp3;
                        qc qcVar5 = this.v;
                        float f14 = qcVar5.h;
                        float f15 = (float) qcVar5.f5847e;
                        float f16 = qcVar.h;
                        float f17 = (float) qcVar.f5847e;
                        long j19 = (f14 * f15) - (f16 * f17);
                        long j20 = (qcVar5.f5849g * f15) - (clamp3 * f17);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        qcVar.f5848f = Utilities.clamp(qcVar.f5848f + j17, j14, j13);
                        pc pcVar2 = this.f6226a;
                        if (pcVar2 != null) {
                            pcVar2.G(qcVar.f5849g, qcVar.f5844a);
                            this.f6226a.M(qcVar.h, qcVar.f5844a);
                        }
                    } else if (j18 < j15) {
                        qc qcVar6 = this.v;
                        float clamp4 = Utilities.clamp((((qcVar6.f5849g * ((float) qcVar6.f5847e)) - ((float) j16)) - ((float) j17)) / ((float) qcVar.f5847e), 1.0f - min, 0.0f);
                        qcVar.f5849g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        qcVar.h = clamp5;
                        qc qcVar7 = this.v;
                        float f18 = qcVar7.h;
                        float f19 = (float) qcVar7.f5847e;
                        float f20 = (float) qcVar.f5847e;
                        long j21 = (f18 * f19) - (clamp5 * f20);
                        long j22 = (qcVar7.f5849g * f19) - (qcVar.f5849g * f20);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        qcVar.f5848f = Utilities.clamp(qcVar.f5848f + j17, j12, j11);
                        pc pcVar3 = this.f6226a;
                        if (pcVar3 != null) {
                            pcVar3.G(qcVar.f5849g, qcVar.f5844a);
                            this.f6226a.M(qcVar.h, qcVar.f5844a);
                        }
                    } else {
                        qcVar.f5848f = j18;
                    }
                } else {
                    long j23 = qcVar.f5848f + f7;
                    float f21 = (float) qcVar.f5847e;
                    qcVar.f5848f = Utilities.clamp(j23, ((float) getBaseDuration()) - (qcVar.h * f21), (-qcVar.f5849g) * f21);
                }
            }
            invalidate();
            pc pcVar4 = this.f6226a;
            if (pcVar4 != null) {
                pcVar4.T(qcVar.f5844a, qcVar.f5848f);
            }
            boolean z10 = this.f6254m1;
            if (!z10 && (pcVar = this.f6226a) != null) {
                pcVar.q(true);
                qc qcVar8 = this.v;
                if (qcVar8 != qcVar && qcVar8 != null) {
                    long j24 = qcVar.f5848f + (qcVar.f5849g * ((float) qcVar.f5847e));
                    float f22 = qcVar8.h;
                    float f23 = (float) qcVar8.f5847e;
                    clamp = Utilities.clamp(j24, f22 * f23, qcVar8.f5849g * f23);
                } else {
                    float f24 = qcVar.f5849g;
                    clamp = Utilities.clamp(f24 * ((float) j10), qcVar.f5847e, 0L);
                }
                qc qcVar9 = this.v;
                if (qcVar9 != qcVar && qcVar9 != null && Math.abs(this.f6237e - clamp) > 400) {
                    this.f6234c1 = this.f6237e;
                    this.f6231b1.d(1.0f, true);
                }
                pc pcVar5 = this.f6226a;
                this.f6237e = clamp;
                pcVar5.h(clamp, false);
            } else if (z10 || this.f6266r1) {
                qc qcVar10 = this.v;
                if (qcVar10 != qcVar && qcVar10 != null) {
                    long j25 = qcVar.f5848f + (qcVar.f5849g * ((float) qcVar.f5847e));
                    float f25 = qcVar10.h;
                    float f26 = (float) qcVar10.f5847e;
                    this.f6237e = Utilities.clamp(j25, f25 * f26, qcVar10.f5849g * f26);
                } else {
                    float f27 = qcVar.f5849g;
                    this.f6237e = Utilities.clamp(f27 * ((float) j3), qcVar.f5847e, 0L);
                }
                pc pcVar6 = this.f6226a;
                if (pcVar6 != null) {
                    pcVar6.h(this.f6237e, false);
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
        pc pcVar;
        long j14;
        long clamp;
        qc qcVar = this.h;
        if (qcVar == null) {
            long j15 = this.I;
            long clamp2 = Utilities.clamp(j15 + f7, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = (float) (clamp2 - j15);
            this.J = Utilities.clamp(this.J - (f10 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / ((float) this.H)), 1.0f, 0.0f);
            pc pcVar2 = this.f6226a;
            if (pcVar2 != null) {
                pcVar2.p(this.J);
                this.f6226a.S(this.K);
            }
        } else if (this.G) {
            float f11 = qcVar.h;
            float f12 = (float) qcVar.f5847e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j16 = (f11 * f12) - (f13 * f14);
            float f15 = qcVar.f5849g;
            float f16 = this.J;
            long j17 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j18 = this.I;
            long j19 = f7;
            long j20 = j18 + j19;
            if (j20 > j16) {
                qc qcVar2 = this.h;
                float clamp3 = Utilities.clamp((((qcVar2.h * ((float) qcVar2.f5847e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                qc qcVar3 = this.h;
                float f17 = qcVar3.h;
                float f18 = (float) qcVar3.f5847e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j21 = (f17 * f18) - (f19 * f20);
                long j22 = (qcVar3.f5849g * f18) - (clamp4 * f20);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.I = Utilities.clamp(this.I + j19, j12, j11);
                pc pcVar3 = this.f6226a;
                if (pcVar3 != null) {
                    pcVar3.p(this.J);
                    this.f6226a.S(this.K);
                }
            } else if (j20 < j17) {
                qc qcVar4 = this.h;
                float clamp5 = Utilities.clamp((((qcVar4.f5849g * ((float) qcVar4.f5847e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                qc qcVar5 = this.h;
                float f21 = qcVar5.h;
                float f22 = (float) qcVar5.f5847e;
                float f23 = (float) this.H;
                long j23 = (f21 * f22) - (clamp6 * f23);
                long j24 = (qcVar5.f5849g * f22) - (this.J * f23);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.I = Utilities.clamp(this.I + j19, j10, j3);
                pc pcVar4 = this.f6226a;
                if (pcVar4 != null) {
                    pcVar4.p(this.J);
                    this.f6226a.S(this.K);
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
        pc pcVar5 = this.f6226a;
        if (pcVar5 != null) {
            pcVar5.B(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f6254m1;
        if (!z10 && (pcVar = this.f6226a) != null) {
            pcVar.q(true);
            qc qcVar6 = this.h;
            if (qcVar6 != null) {
                long j26 = this.I + (this.J * ((float) this.H));
                float f25 = qcVar6.h;
                float f26 = (float) qcVar6.f5847e;
                clamp = Utilities.clamp(j26, f25 * f26, qcVar6.f5849g * f26);
            } else {
                float f27 = this.J;
                clamp = Utilities.clamp(f27 * ((float) j14), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.f6237e - clamp) > 400) {
                this.f6234c1 = this.f6237e;
                this.f6231b1.d(1.0f, true);
            }
            pc pcVar6 = this.f6226a;
            this.f6237e = clamp;
            pcVar6.h(clamp, false);
        } else if (z10 || this.f6266r1) {
            qc qcVar7 = this.h;
            if (qcVar7 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f28 = qcVar7.h;
                float f29 = (float) qcVar7.f5847e;
                this.f6237e = Utilities.clamp(j27, f28 * f29, qcVar7.f5849g * f29);
            } else {
                float f30 = this.J;
                this.f6237e = Utilities.clamp(f30 * ((float) j13), this.H, 0L);
            }
            pc pcVar7 = this.f6226a;
            if (pcVar7 != null) {
                pcVar7.h(this.f6237e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        qc qcVar = this.h;
        long j3 = qcVar.f5847e;
        this.f6240f = Utilities.clamp((((qcVar.h + qcVar.f5849g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
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
        long j3;
        qc qcVar;
        qc qcVar2 = this.h;
        ArrayList arrayList = this.f6267s;
        if (qcVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f6284y1) - this.f6281x1) / this.f6273u1;
            qc qcVar3 = this.v;
            if (qcVar3 != null) {
                j3 = (qcVar3.f5849g * ((float) qcVar3.f5847e)) + ((float) qcVar3.f5848f);
            } else {
                j3 = 0;
            }
            float f11 = f10 * ((float) min);
            if (qcVar3 == null) {
                if (this.h == null) {
                    j3 = this.Q;
                } else {
                    j3 = 0;
                }
            }
            long clamp = Utilities.clamp((f11 - ((float) j3)) + ((float) this.f6240f), (float) getBaseDuration(), 0.0f);
            qc qcVar4 = this.h;
            if (qcVar4 != null) {
                float f12 = ((float) clamp) / ((float) qcVar4.f5847e);
                if (f12 < qcVar4.f5849g || f12 > qcVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (qcVar.h - qcVar.f5849g) * ((float) qcVar.f5847e))) {
                if (this.N && qcVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.f6237e = clamp;
                invalidate();
                pc pcVar = this.f6226a;
                if (pcVar != null) {
                    pcVar.h(clamp, z10);
                }
                ai.j jVar = this.f6236d1;
                if (jVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(jVar);
                    this.f6236d1 = null;
                }
                if (z10) {
                    ai.j jVar2 = new ai.j(this, clamp, 7);
                    this.f6236d1 = jVar2;
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
        boolean z11;
        long j11;
        boolean z12;
        boolean z13;
        qc qcVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        uc ucVar = this.M;
        Long l4 = null;
        if (ucVar != null) {
            ucVar.b();
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
            if (getMeasuredWidth() <= 0 || this.M != null || ((qcVar = this.h) != null && qcVar.f5847e < 1)) {
                z11 = false;
                j11 = j12;
                z12 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f6275v1;
                int i11 = this.f6284y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j13 = this.H;
                if (j13 > 2) {
                    l4 = Long.valueOf(j13);
                }
                qc qcVar2 = this.h;
                if (qcVar2 != null) {
                    maxScrollDuration = qcVar2.f5847e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j11 = j12;
                z11 = false;
                z12 = true;
                this.M = new uc(this, false, str2, i12, dp, l4, maxScrollDuration, -1L, -1L, new mc(this, 0));
            }
            if (this.h == null) {
                this.P = z11;
                this.G = z12;
            }
        } else {
            z11 = false;
            j11 = j12;
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
        if (j11 != j3 && this.h == null && this.f6227a0 != null) {
            this.W = z12;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(((float) j3) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f6235d0.f(this.G, z12);
            this.f6241f0.f(this.P, z12);
            this.f6233c0.f(this.E, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f7) {
        String str2;
        qc qcVar = this.h;
        if (qcVar == null) {
            str2 = null;
        } else {
            str2 = qcVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        qc qcVar2 = this.h;
        if (qcVar2 != null) {
            uc ucVar = qcVar2.f5846c;
            if (ucVar != null) {
                ucVar.b();
                this.h.f5846c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f6240f = 0L;
            qc qcVar3 = new qc(this);
            this.h = qcVar3;
            qcVar3.f5845b = z10;
            qcVar3.d = str;
            qcVar3.f5847e = j3;
            qcVar3.f5850i = f7;
            qc.a(qcVar3, false);
        } else {
            this.h = null;
            this.f6240f = 0L;
        }
        if (!this.E) {
            this.G = false;
        }
        this.f6237e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        this.P0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f6284y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f6286z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f6275v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f6278w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f6281x1 = dp4;
        this.f6273u1 = (this.f6275v1 - (dp4 * 2)) - (this.f6284y1 * 2);
        qc qcVar = this.h;
        if (qcVar != null && qcVar.d != null && qcVar.f5846c == null) {
            qc.a(qcVar, false);
        }
        ArrayList arrayList = this.f6267s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                qc qcVar2 = (qc) obj;
                if (qcVar2.d != null && qcVar2.f5846c == null) {
                    qc.a(qcVar2, false);
                    qc.b(qcVar2);
                }
            }
        }
        if (this.O != null && this.f6227a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.wc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f6227a0 == null || this.W) {
                this.f6227a0 = new oc(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f6243g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        qc qcVar;
        a4.d dVar = new a4.d(11);
        ArrayList arrayList = this.f6267s;
        Collections.sort(arrayList, dVar);
        if (arrayList.isEmpty()) {
            qcVar = null;
        } else {
            qcVar = (qc) arrayList.get(0);
        }
        this.v = qcVar;
        if (qcVar != null) {
            long j3 = qcVar.f5848f;
        }
    }

    public void setCollage(ArrayList<l8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        uc ucVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f6267s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            qc qcVar = (qc) arrayList2.get(i10);
            if (qcVar != null && (ucVar = qcVar.f5846c) != null) {
                ucVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f6264r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            oc ocVar = (oc) arrayList3.get(i11);
            if (ocVar != null) {
                ocVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f6245h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                l8 l8Var = arrayList.get(i12);
                if (l8Var.K) {
                    qc qcVar2 = new qc(this);
                    qcVar2.f5844a = i12;
                    qcVar2.f5845b = false;
                    qcVar2.d = l8Var.L.getAbsolutePath();
                    qcVar2.f5847e = l8Var.f5411h0;
                    qcVar2.f5848f = l8Var.X;
                    qcVar2.f5850i = l8Var.P;
                    qcVar2.f5849g = l8Var.V;
                    qcVar2.h = l8Var.W;
                    qc.a(qcVar2, false);
                    qc.b(qcVar2);
                    arrayList2.add(qcVar2);
                }
            }
        }
        q();
        this.f6255n = 0;
    }

    public void setDelegate(pc pcVar) {
        this.f6226a = pcVar;
    }

    public void setMaxCount(int i10) {
        this.f6230b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f6229b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ci.wc.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        qc qcVar = this.h;
        if (qcVar == null) {
            return;
        }
        qcVar.f5849g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        qc qcVar = this.h;
        if (qcVar == null) {
            return;
        }
        qcVar.h = f7;
        invalidate();
    }
}
