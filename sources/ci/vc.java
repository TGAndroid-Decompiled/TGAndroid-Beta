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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.tr;
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
    public final fn0 W0;
    public boolean X0;
    public final ai.m3 Y0;
    public long Z0;
    public oc f6134a;
    public nc f6135a0;
    public long f6136a1;
    public Runnable f6137b;
    public int f6138b0;
    public final org.telegram.ui.Components.e6 f6139b1;
    public int f6140c;
    public final org.telegram.ui.Components.e6 f6141c0;
    public long f6142c1;
    public Runnable d;
    public final org.telegram.ui.Components.e6 f6143d0;
    public ai.j f6144d1;
    public long f6145e;
    public final org.telegram.ui.Components.e6 f6146e0;
    public long f6147e1;
    public long f6148f;
    public final org.telegram.ui.Components.e6 f6149f0;
    public long f6150f1;
    public final org.telegram.ui.Components.e6 f6151g0;
    public float f6152g1;
    public pc h;
    public final org.telegram.ui.Components.e6 f6153h0;
    public int f6154h1;
    public final org.telegram.ui.Components.e6 f6155i0;
    public int f6156i1;
    public boolean f6157j0;
    public int f6158j1;
    public final org.telegram.ui.Components.ka f6159k0;
    public int f6160k1;
    public final org.telegram.ui.Components.oa f6161l0;
    public boolean l1;
    public final org.telegram.ui.Components.oa m0;
    public boolean f6162m1;
    public int f6163n;
    public final org.telegram.ui.Components.oa f6164n0;
    public float f6165n1;
    public final RectF f6166o0;
    public boolean f6167o1;
    public final Path f6168p0;
    public VelocityTracker f6169p1;
    public final e11 f6170q0;
    public boolean f6171q1;
    public final ArrayList f6172r;
    public final Drawable f6173r0;
    public boolean f6174r1;
    public final ArrayList f6175s;
    public final uc f6176s0;
    public int f6177s1;
    public final RectF f6178t0;
    public final float[] f6179t1;
    public final Paint f6180u0;
    public int f6181u1;
    public pc v;
    public final Path f6182v0;
    public int f6183v1;
    public final Paint f6184w;
    public final Path f6185w0;
    public int f6186w1;
    public final Path f6187x;
    public final RectF f6188x0;
    public int f6189x1;
    public final Path f6190y;
    public final Path f6191y0;
    public int f6192y1;
    public final Paint f6193z0;
    public int f6194z1;

    public vc(Context context, ViewGroup viewGroup, wb wbVar, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ka kaVar) {
        super(context);
        this.f6163n = 0;
        this.f6172r = new ArrayList();
        this.f6175s = new ArrayList();
        this.f6184w = new Paint(3);
        this.f6187x = new Path();
        this.f6190y = new Path();
        this.f6138b0 = 1;
        tr trVar = tr.h;
        this.f6141c0 = new org.telegram.ui.Components.e6(this, 0L, 360L, trVar);
        this.f6143d0 = new org.telegram.ui.Components.e6(this, 360L, trVar);
        this.f6146e0 = new org.telegram.ui.Components.e6(this, 0L, 360L, trVar);
        this.f6149f0 = new org.telegram.ui.Components.e6(this, 360L, trVar);
        this.f6151g0 = new org.telegram.ui.Components.e6(this, 0L, 360L, trVar);
        this.f6153h0 = new org.telegram.ui.Components.e6(this, 0L, 360L, trVar);
        this.f6155i0 = new org.telegram.ui.Components.e6(this, 0L, 320L, trVar);
        this.f6157j0 = true;
        this.f6166o0 = new RectF();
        this.f6168p0 = new Path();
        this.f6176s0 = new uc();
        this.f6178t0 = new RectF();
        this.f6180u0 = new Paint(3);
        this.f6182v0 = new Path();
        this.f6185w0 = new Path();
        this.f6188x0 = new RectF();
        this.f6191y0 = new Path();
        Paint paint = new Paint(1);
        this.f6193z0 = paint;
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
        this.W0 = new fn0(getContext(), null);
        this.Z0 = -1L;
        this.f6136a1 = -1L;
        this.f6139b1 = new org.telegram.ui.Components.e6(0.0f, this, 0L, 340L, trVar);
        this.f6142c1 = -1L;
        this.f6154h1 = -1;
        this.f6156i1 = -1;
        this.f6158j1 = -1;
        this.f6160k1 = -1;
        this.f6165n1 = 1.0f;
        this.f6171q1 = true;
        this.f6174r1 = false;
        this.f6179t1 = new float[8];
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
        this.f6170q0 = new e11(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f6173r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f6159k0 = kaVar;
        this.f6161l0 = new org.telegram.ui.Components.oa(kaVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.oa(kaVar, this, 3, false);
        this.f6164n0 = new org.telegram.ui.Components.oa(kaVar, this, 4, false);
        this.Y0 = new ai.m3(this, viewGroup, d6Var, kaVar, wbVar, 5);
    }

    public static void a(final vc vcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ka kaVar, View view) {
        int i10;
        ArrayList arrayList = vcVar.f6175s;
        int i11 = vcVar.f6158j1;
        try {
            if (i11 == 2 && vcVar.N) {
                e8 e8Var = new e8(vcVar.getContext(), 0);
                e8Var.f5030b = 0.0f;
                e8Var.f5031c = 1.5f;
                e8Var.d(vcVar.V);
                e8Var.h = new Utilities.Callback(vcVar) {
                    public final vc f5585b;

                    {
                        this.f5585b = vcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                vc vcVar2 = this.f5585b;
                                vcVar2.V = floatValue;
                                oc ocVar = vcVar2.f6134a;
                                if (ocVar != null) {
                                    ocVar.k(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                vc vcVar3 = this.f5585b;
                                vcVar3.L = floatValue2;
                                oc ocVar2 = vcVar3.f6134a;
                                if (ocVar2 != null) {
                                    ocVar2.h(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                vc vcVar4 = this.f5585b;
                                vcVar4.h.f5718i = f7.floatValue();
                                oc ocVar3 = vcVar4.f6134a;
                                if (ocVar3 != null) {
                                    ocVar3.L(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(vcVar.getBaseDuration(), vcVar.getMaxScrollDuration());
                int i12 = vcVar.f6183v1;
                int i13 = vcVar.f6192y1;
                int i14 = vcVar.f6189x1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(vcVar.T, 1.0f, vcVar.f6149f0.f25934c) * ((float) vcVar.R)) + ((float) (vcVar.Q - vcVar.f6148f))) / ((float) min)) * vcVar.f6181u1) + i13 + i14);
                b80 F = b80.F(viewGroup, d6Var, vcVar);
                F.q(e8Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new lc(vcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(vcVar.f6183v1 - min2)) + AndroidUtilities.dp(18.0f), vcVar.F0.top);
                F.Z();
                F.R(kaVar, -view.getX(), -view.getY());
                vcVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && vcVar.E) {
                e8 e8Var2 = new e8(vcVar.getContext(), 0);
                e8Var2.f5030b = 0.0f;
                e8Var2.f5031c = 1.5f;
                e8Var2.d(vcVar.L);
                e8Var2.h = new Utilities.Callback(vcVar) {
                    public final vc f5585b;

                    {
                        this.f5585b = vcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                vc vcVar2 = this.f5585b;
                                vcVar2.V = floatValue;
                                oc ocVar = vcVar2.f6134a;
                                if (ocVar != null) {
                                    ocVar.k(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                vc vcVar3 = this.f5585b;
                                vcVar3.L = floatValue2;
                                oc ocVar2 = vcVar3.f6134a;
                                if (ocVar2 != null) {
                                    ocVar2.h(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                vc vcVar4 = this.f5585b;
                                vcVar4.h.f5718i = f7.floatValue();
                                oc ocVar3 = vcVar4.f6134a;
                                if (ocVar3 != null) {
                                    ocVar3.L(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(vcVar.getBaseDuration(), vcVar.getMaxScrollDuration());
                int i15 = vcVar.f6183v1;
                int i16 = vcVar.f6192y1;
                int i17 = vcVar.f6189x1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(vcVar.K, 1.0f, vcVar.f6143d0.f25934c) * ((float) vcVar.H)) + ((float) (vcVar.I - vcVar.f6148f))) / ((float) min3)) * vcVar.f6181u1) + i16 + i17);
                b80 F2 = b80.F(viewGroup, d6Var, vcVar);
                F2.q(e8Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new lc(vcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(vcVar.f6183v1 - min4)) + AndroidUtilities.dp(18.0f), vcVar.f6188x0.top);
                F2.Z();
                F2.R(kaVar, -view.getX(), -view.getY());
                vcVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && vcVar.h != null) {
                e8 e8Var3 = new e8(vcVar.getContext(), 0);
                e8Var3.f5030b = 0.0f;
                e8Var3.f5031c = 1.5f;
                e8Var3.d(vcVar.h.f5718i);
                e8Var3.h = new Utilities.Callback(vcVar) {
                    public final vc f5585b;

                    {
                        this.f5585b = vcVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                vc vcVar2 = this.f5585b;
                                vcVar2.V = floatValue;
                                oc ocVar = vcVar2.f6134a;
                                if (ocVar != null) {
                                    ocVar.k(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                vc vcVar3 = this.f5585b;
                                vcVar3.L = floatValue2;
                                oc ocVar2 = vcVar3.f6134a;
                                if (ocVar2 != null) {
                                    ocVar2.h(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                vc vcVar4 = this.f5585b;
                                vcVar4.h.f5718i = f7.floatValue();
                                oc ocVar3 = vcVar4.f6134a;
                                if (ocVar3 != null) {
                                    ocVar3.L(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                b80 F3 = b80.F(viewGroup, d6Var, vcVar);
                F3.q(e8Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), vcVar.f6178t0.top);
                F3.Z();
                F3.R(kaVar, -view.getX(), -view.getY());
                vcVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = vcVar.f6160k1) >= 0 && i10 < arrayList.size()) {
                pc pcVar = (pc) arrayList.get(vcVar.f6160k1);
                e8 e8Var4 = new e8(vcVar.getContext(), 0);
                e8Var4.f5030b = 0.0f;
                e8Var4.f5031c = 1.5f;
                e8Var4.d(pcVar.f5718i);
                e8Var4.h = new ai.g3(8, vcVar, pcVar);
                b80 F4 = b80.F(viewGroup, d6Var, vcVar);
                F4.q(e8Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), pcVar.f5719j.top);
                F4.Z();
                F4.R(kaVar, -view.getX(), -view.getY());
                vcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f6149f0.e(this.P));
    }

    public long getBaseDuration() {
        pc pcVar = this.h;
        if (pcVar != null) {
            return Math.max(1L, pcVar.f5715e);
        }
        pc pcVar2 = this.v;
        if (pcVar2 != null) {
            return Math.max(1L, pcVar2.f5715e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f6175s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((pc) arrayList.get(i10)).f5720k.f25934c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f6143d0.e(this.G));
    }

    private float getVideoHeight() {
        pc pcVar = this.h;
        if (pcVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), pcVar.f5720k.f25934c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.vc.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        fn0 fn0Var = this.W0;
        if (fn0Var.b()) {
            int i10 = fn0Var.f26526j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f6171q1) {
                this.f6148f = Math.max(0.0f, (((i10 - this.f6192y1) - this.f6189x1) / this.f6181u1) * ((float) min));
            } else if (!this.P) {
                fn0Var.a();
                return;
            } else {
                int i11 = this.f6192y1;
                int i12 = this.f6189x1;
                float f7 = this.f6181u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f6177s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f6177s1 = i10;
        } else if (this.f6174r1) {
            this.f6174r1 = false;
            oc ocVar = this.f6134a;
            if (ocVar != null) {
                ocVar.C(false);
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
            f12 = (pcVar.f5717g * ((float) pcVar.f5715e)) + ((float) pcVar.f5716f);
        } else {
            if (this.h == null) {
                j10 = this.Q;
            } else {
                j10 = 0;
            }
            f12 = (float) j10;
        }
        float f13 = (this.f6181u1 * (((clamp + f12) - ((float) this.f6148f)) / ((float) min))) + this.f6192y1 + this.f6189x1;
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f6183v1, this.f6186w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f6193z0;
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
        float x10 = org.telegram.messenger.f0.x(AndroidUtilities.dp(f15), dp, 2.0f, f11);
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
        rectF.set(A, f20, org.telegram.messenger.f0.a(AndroidUtilities.dp(f18), dp, 2.0f, f12), f21);
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
        return this.f6138b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f6194z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f6175s.isEmpty()) {
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
        return (int) (f15 + f12 + this.f6194z1);
    }

    public int getMaxCount() {
        return this.f6138b0;
    }

    public long getMaxScrollDuration() {
        if (this.f6175s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f6194z1 + this.f6194z1, getContentHeight(), this.f6155i0.f25934c);
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
            oc ocVar2 = this.f6134a;
            if (ocVar2 != null) {
                ocVar2.h0(this.S);
                this.f6134a.c0(this.T);
            }
        } else if (this.P) {
            if (pcVar != null) {
                f10 = pcVar.f5717g;
                j3 = pcVar.f5715e;
            } else {
                f10 = this.J;
                j3 = this.H;
            }
            float f14 = f10 * ((float) j3);
            if (pcVar != null) {
                f11 = pcVar.h;
                j10 = pcVar.f5715e;
            } else {
                f11 = this.K;
                j10 = this.H;
            }
            float f15 = f11 * ((float) j10);
            if (pcVar != null) {
                f12 = (pcVar.h - pcVar.f5717g) * ((float) pcVar.f5715e);
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
                oc ocVar3 = this.f6134a;
                if (ocVar3 != null) {
                    ocVar3.h0(this.S);
                    this.f6134a.c0(this.T);
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
                oc ocVar4 = this.f6134a;
                if (ocVar4 != null) {
                    ocVar4.h0(this.S);
                    this.f6134a.c0(this.T);
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
        oc ocVar5 = this.f6134a;
        if (ocVar5 != null) {
            ocVar5.u0(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f6162m1;
        if (!z10 && (ocVar = this.f6134a) != null) {
            ocVar.C(true);
            pc pcVar2 = this.h;
            if (pcVar2 != null) {
                long j27 = this.Q + (this.S * ((float) this.R));
                float f23 = pcVar2.h;
                float f24 = (float) pcVar2.f5715e;
                clamp = Utilities.clamp(j27, f23 * f24, pcVar2.f5717g * f24);
            } else if (this.E) {
                long j28 = this.Q + (this.S * ((float) this.R));
                float f25 = this.K;
                float f26 = (float) this.H;
                clamp = Utilities.clamp(j28, f25 * f26, this.J * f26);
            } else {
                float f27 = this.S;
                clamp = Utilities.clamp(f27 * ((float) j16), this.R, 0L);
            }
            if (this.h != null && Math.abs(this.f6145e - clamp) > 400) {
                this.f6142c1 = this.f6145e;
                this.f6139b1.d(1.0f, true);
            }
            oc ocVar6 = this.f6134a;
            this.f6145e = clamp;
            ocVar6.l(clamp, false);
        } else if (z10 || this.f6174r1) {
            pc pcVar3 = this.h;
            if (pcVar3 != null) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f28 = pcVar3.h;
                float f29 = (float) pcVar3.f5715e;
                this.f6145e = Utilities.clamp(j29, f28 * f29, pcVar3.f5717g * f29);
            } else if (this.E && pcVar3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) pcVar3.f5715e;
                this.f6145e = Utilities.clamp(j30, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.f6145e = Utilities.clamp(f32 * ((float) j15), this.R, 0L);
            }
            oc ocVar7 = this.f6134a;
            if (ocVar7 != null) {
                ocVar7.l(this.f6145e, false);
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
                if (this.f6163n == this.f6175s.indexOf(pcVar)) {
                    pc pcVar3 = this.v;
                    float f10 = (float) pcVar3.f5715e;
                    float f11 = pcVar.h;
                    float f12 = (float) pcVar.f5715e;
                    float f13 = pcVar.f5717g;
                    long j15 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((pcVar3.h - pcVar3.f5717g) * f10) / f12);
                    long j16 = pcVar.f5716f;
                    long j17 = f7;
                    long j18 = j16 + j17;
                    if (j18 > (f10 * 1.0f) - (f11 * f12)) {
                        pc pcVar4 = this.v;
                        float clamp2 = Utilities.clamp((((pcVar4.h * ((float) pcVar4.f5715e)) - ((float) j16)) - ((float) j17)) / ((float) pcVar.f5715e), 1.0f, min);
                        pcVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        pcVar.f5717g = clamp3;
                        pc pcVar5 = this.v;
                        float f14 = pcVar5.h;
                        float f15 = (float) pcVar5.f5715e;
                        float f16 = pcVar.h;
                        float f17 = (float) pcVar.f5715e;
                        long j19 = (f14 * f15) - (f16 * f17);
                        long j20 = (pcVar5.f5717g * f15) - (clamp3 * f17);
                        if (j19 < j20) {
                            j14 = j20;
                            j13 = j19;
                        } else {
                            j13 = j20;
                            j14 = j19;
                        }
                        pcVar.f5716f = Utilities.clamp(pcVar.f5716f + j17, j14, j13);
                        oc ocVar2 = this.f6134a;
                        if (ocVar2 != null) {
                            ocVar2.b0(pcVar.f5717g, pcVar.f5712a);
                            this.f6134a.k0(pcVar.h, pcVar.f5712a);
                        }
                    } else if (j18 < j15) {
                        pc pcVar6 = this.v;
                        float clamp4 = Utilities.clamp((((pcVar6.f5717g * ((float) pcVar6.f5715e)) - ((float) j16)) - ((float) j17)) / ((float) pcVar.f5715e), 1.0f - min, 0.0f);
                        pcVar.f5717g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        pcVar.h = clamp5;
                        pc pcVar7 = this.v;
                        float f18 = pcVar7.h;
                        float f19 = (float) pcVar7.f5715e;
                        float f20 = (float) pcVar.f5715e;
                        long j21 = (f18 * f19) - (clamp5 * f20);
                        long j22 = (pcVar7.f5717g * f19) - (pcVar.f5717g * f20);
                        if (j21 < j22) {
                            j12 = j22;
                            j11 = j21;
                        } else {
                            j11 = j22;
                            j12 = j21;
                        }
                        pcVar.f5716f = Utilities.clamp(pcVar.f5716f + j17, j12, j11);
                        oc ocVar3 = this.f6134a;
                        if (ocVar3 != null) {
                            ocVar3.b0(pcVar.f5717g, pcVar.f5712a);
                            this.f6134a.k0(pcVar.h, pcVar.f5712a);
                        }
                    } else {
                        pcVar.f5716f = j18;
                    }
                } else {
                    long j23 = pcVar.f5716f + f7;
                    float f21 = (float) pcVar.f5715e;
                    pcVar.f5716f = Utilities.clamp(j23, ((float) getBaseDuration()) - (pcVar.h * f21), (-pcVar.f5717g) * f21);
                }
            }
            invalidate();
            oc ocVar4 = this.f6134a;
            if (ocVar4 != null) {
                ocVar4.t0(pcVar.f5712a, pcVar.f5716f);
            }
            boolean z10 = this.f6162m1;
            if (!z10 && (ocVar = this.f6134a) != null) {
                ocVar.C(true);
                pc pcVar8 = this.v;
                if (pcVar8 != pcVar && pcVar8 != null) {
                    long j24 = pcVar.f5716f + (pcVar.f5717g * ((float) pcVar.f5715e));
                    float f22 = pcVar8.h;
                    float f23 = (float) pcVar8.f5715e;
                    clamp = Utilities.clamp(j24, f22 * f23, pcVar8.f5717g * f23);
                } else {
                    float f24 = pcVar.f5717g;
                    clamp = Utilities.clamp(f24 * ((float) j10), pcVar.f5715e, 0L);
                }
                pc pcVar9 = this.v;
                if (pcVar9 != pcVar && pcVar9 != null && Math.abs(this.f6145e - clamp) > 400) {
                    this.f6142c1 = this.f6145e;
                    this.f6139b1.d(1.0f, true);
                }
                oc ocVar5 = this.f6134a;
                this.f6145e = clamp;
                ocVar5.l(clamp, false);
            } else if (z10 || this.f6174r1) {
                pc pcVar10 = this.v;
                if (pcVar10 != pcVar && pcVar10 != null) {
                    long j25 = pcVar.f5716f + (pcVar.f5717g * ((float) pcVar.f5715e));
                    float f25 = pcVar10.h;
                    float f26 = (float) pcVar10.f5715e;
                    this.f6145e = Utilities.clamp(j25, f25 * f26, pcVar10.f5717g * f26);
                } else {
                    float f27 = pcVar.f5717g;
                    this.f6145e = Utilities.clamp(f27 * ((float) j3), pcVar.f5715e, 0L);
                }
                oc ocVar6 = this.f6134a;
                if (ocVar6 != null) {
                    ocVar6.l(this.f6145e, false);
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
            oc ocVar2 = this.f6134a;
            if (ocVar2 != null) {
                ocVar2.A(this.J);
                this.f6134a.s0(this.K);
            }
        } else if (this.G) {
            float f11 = pcVar.h;
            float f12 = (float) pcVar.f5715e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j16 = (f11 * f12) - (f13 * f14);
            float f15 = pcVar.f5717g;
            float f16 = this.J;
            long j17 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j18 = this.I;
            long j19 = f7;
            long j20 = j18 + j19;
            if (j20 > j16) {
                pc pcVar2 = this.h;
                float clamp3 = Utilities.clamp((((pcVar2.h * ((float) pcVar2.f5715e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                pc pcVar3 = this.h;
                float f17 = pcVar3.h;
                float f18 = (float) pcVar3.f5715e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j21 = (f17 * f18) - (f19 * f20);
                long j22 = (pcVar3.f5717g * f18) - (clamp4 * f20);
                if (j21 < j22) {
                    j12 = j22;
                    j11 = j21;
                } else {
                    j11 = j22;
                    j12 = j21;
                }
                this.I = Utilities.clamp(this.I + j19, j12, j11);
                oc ocVar3 = this.f6134a;
                if (ocVar3 != null) {
                    ocVar3.A(this.J);
                    this.f6134a.s0(this.K);
                }
            } else if (j20 < j17) {
                pc pcVar4 = this.h;
                float clamp5 = Utilities.clamp((((pcVar4.f5717g * ((float) pcVar4.f5715e)) - ((float) j18)) - ((float) j19)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                pc pcVar5 = this.h;
                float f21 = pcVar5.h;
                float f22 = (float) pcVar5.f5715e;
                float f23 = (float) this.H;
                long j23 = (f21 * f22) - (clamp6 * f23);
                long j24 = (pcVar5.f5717g * f22) - (this.J * f23);
                if (j23 < j24) {
                    j10 = j24;
                    j3 = j23;
                } else {
                    j3 = j24;
                    j10 = j23;
                }
                this.I = Utilities.clamp(this.I + j19, j10, j3);
                oc ocVar4 = this.f6134a;
                if (ocVar4 != null) {
                    ocVar4.A(this.J);
                    this.f6134a.s0(this.K);
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
        oc ocVar5 = this.f6134a;
        if (ocVar5 != null) {
            ocVar5.U(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f6162m1;
        if (!z10 && (ocVar = this.f6134a) != null) {
            ocVar.C(true);
            pc pcVar6 = this.h;
            if (pcVar6 != null) {
                long j26 = this.I + (this.J * ((float) this.H));
                float f25 = pcVar6.h;
                float f26 = (float) pcVar6.f5715e;
                clamp = Utilities.clamp(j26, f25 * f26, pcVar6.f5717g * f26);
            } else {
                float f27 = this.J;
                clamp = Utilities.clamp(f27 * ((float) j14), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.f6145e - clamp) > 400) {
                this.f6142c1 = this.f6145e;
                this.f6139b1.d(1.0f, true);
            }
            oc ocVar6 = this.f6134a;
            this.f6145e = clamp;
            ocVar6.l(clamp, false);
        } else if (z10 || this.f6174r1) {
            pc pcVar7 = this.h;
            if (pcVar7 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f28 = pcVar7.h;
                float f29 = (float) pcVar7.f5715e;
                this.f6145e = Utilities.clamp(j27, f28 * f29, pcVar7.f5717g * f29);
            } else {
                float f30 = this.J;
                this.f6145e = Utilities.clamp(f30 * ((float) j13), this.H, 0L);
            }
            oc ocVar7 = this.f6134a;
            if (ocVar7 != null) {
                ocVar7.l(this.f6145e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        pc pcVar = this.h;
        long j3 = pcVar.f5715e;
        this.f6148f = Utilities.clamp((((pcVar.h + pcVar.f5717g) / 2.0f) * ((float) j3)) - (((float) min) / 2.0f), j3 - min, 0L);
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
        ArrayList arrayList = this.f6175s;
        if (pcVar2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f6192y1) - this.f6189x1) / this.f6181u1;
            pc pcVar3 = this.v;
            if (pcVar3 != null) {
                j3 = (pcVar3.f5717g * ((float) pcVar3.f5715e)) + ((float) pcVar3.f5716f);
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
            long clamp = Utilities.clamp((f11 - ((float) j3)) + ((float) this.f6148f), (float) getBaseDuration(), 0.0f);
            pc pcVar4 = this.h;
            if (pcVar4 != null) {
                float f12 = ((float) clamp) / ((float) pcVar4.f5715e);
                if (f12 < pcVar4.f5717g || f12 > pcVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (pcVar.h - pcVar.f5717g) * ((float) pcVar.f5715e))) {
                if (this.N && pcVar4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) clamp) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.f6145e = clamp;
                invalidate();
                oc ocVar = this.f6134a;
                if (ocVar != null) {
                    ocVar.l(clamp, z10);
                }
                ai.j jVar = this.f6144d1;
                if (jVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(jVar);
                    this.f6144d1 = null;
                }
                if (z10) {
                    ai.j jVar2 = new ai.j(this, clamp, 7);
                    this.f6144d1 = jVar2;
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
            if (getMeasuredWidth() <= 0 || this.M != null || ((pcVar = this.h) != null && pcVar.f5715e < 1)) {
                j11 = j12;
                z13 = false;
                z11 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f6183v1;
                int i11 = this.f6192y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j13 = this.H;
                if (j13 > 2) {
                    l4 = Long.valueOf(j13);
                }
                pc pcVar2 = this.h;
                if (pcVar2 != null) {
                    maxScrollDuration = pcVar2.f5715e;
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
        if (j11 != j3 && this.h == null && this.f6135a0 != null) {
            this.W = z11;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(((float) j3) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f6143d0.f(this.G, z11);
            this.f6149f0.f(this.P, z11);
            this.f6141c0.f(this.E, z11);
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
            tc tcVar = pcVar2.f5714c;
            if (tcVar != null) {
                tcVar.b();
                this.h.f5714c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f6148f = 0L;
            pc pcVar3 = new pc(this);
            this.h = pcVar3;
            pcVar3.f5713b = z10;
            pcVar3.d = str;
            pcVar3.f5715e = j3;
            pcVar3.f5718i = f7;
            pc.a(pcVar3, false);
        } else {
            this.h = null;
            this.f6148f = 0L;
        }
        if (!this.E) {
            this.G = false;
        }
        this.f6145e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        this.P0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f6192y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f6194z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f6183v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f6186w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f6189x1 = dp4;
        this.f6181u1 = (this.f6183v1 - (dp4 * 2)) - (this.f6192y1 * 2);
        pc pcVar = this.h;
        if (pcVar != null && pcVar.d != null && pcVar.f5714c == null) {
            pc.a(pcVar, false);
        }
        ArrayList arrayList = this.f6175s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                pc pcVar2 = (pc) obj;
                if (pcVar2.d != null && pcVar2.f5714c == null) {
                    pc.a(pcVar2, false);
                    pc.b(pcVar2);
                }
            }
        }
        if (this.O != null && this.f6135a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: ci.vc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f6135a0 == null || this.W) {
                this.f6135a0 = new nc(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f6151g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        pc pcVar;
        a4.e eVar = new a4.e(11);
        ArrayList arrayList = this.f6175s;
        Collections.sort(arrayList, eVar);
        if (arrayList.isEmpty()) {
            pcVar = null;
        } else {
            pcVar = (pc) arrayList.get(0);
        }
        this.v = pcVar;
        if (pcVar != null) {
            long j3 = pcVar.f5716f;
        }
    }

    public void setCollage(ArrayList<k8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        tc tcVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f6175s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            pc pcVar = (pc) arrayList2.get(i10);
            if (pcVar != null && (tcVar = pcVar.f5714c) != null) {
                tcVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f6172r;
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
        this.f6153h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                k8 k8Var = arrayList.get(i12);
                if (k8Var.K) {
                    pc pcVar2 = new pc(this);
                    pcVar2.f5712a = i12;
                    pcVar2.f5713b = false;
                    pcVar2.d = k8Var.L.getAbsolutePath();
                    pcVar2.f5715e = k8Var.f5327h0;
                    pcVar2.f5716f = k8Var.X;
                    pcVar2.f5718i = k8Var.P;
                    pcVar2.f5717g = k8Var.V;
                    pcVar2.h = k8Var.W;
                    pc.a(pcVar2, false);
                    pc.b(pcVar2);
                    arrayList2.add(pcVar2);
                }
            }
        }
        q();
        this.f6163n = 0;
    }

    public void setDelegate(oc ocVar) {
        this.f6134a = ocVar;
    }

    public void setMaxCount(int i10) {
        this.f6138b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f6137b = runnable;
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
        pcVar.f5717g = f7;
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
