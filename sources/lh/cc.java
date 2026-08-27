package lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

public final class cc extends View {
    public boolean A;
    public final TextPaint A0;
    public String B;
    public final RectF B0;
    public boolean C;
    public final Path C0;
    public long D;
    public final Paint D0;
    public long E;
    public final bc E0;
    public float F;
    public final Paint F0;
    public float G;
    public final Drawable G0;
    public float H;
    public final TextPaint H0;
    public ac I;
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
    public final bm0 S0;
    public vb T;
    public boolean T0;
    public int U;
    public final cg.k0 U0;
    public final org.telegram.ui.Components.y5 V;
    public long V0;
    public final org.telegram.ui.Components.y5 W;
    public long W0;
    public final org.telegram.ui.Components.y5 X0;
    public long Y0;
    public cg.b2 Z0;

    public wb f15764a;

    public final org.telegram.ui.Components.y5 f15765a0;

    public long f15766a1;

    public Runnable f15767b;

    public final org.telegram.ui.Components.y5 f15768b0;

    public long f15769b1;

    public int f15770c;

    public final org.telegram.ui.Components.y5 f15771c0;

    public float f15772c1;
    public Runnable d;

    public final org.telegram.ui.Components.y5 f15773d0;

    public int f15774d1;

    public long f15775e;

    public final org.telegram.ui.Components.y5 f15776e0;

    public int f15777e1;

    public long f15778f;

    public boolean f15779f0;

    public int f15780f1;

    public final org.telegram.ui.Components.z9 f15781g0;

    public int f15782g1;
    public xb h;

    public final org.telegram.ui.Components.da f15783h0;

    public boolean f15784h1;

    public final org.telegram.ui.Components.da f15785i0;

    public boolean f15786i1;

    public final org.telegram.ui.Components.da f15787j0;

    public float f15788j1;

    public final RectF f15789k0;

    public boolean f15790k1;

    public final Path f15791l0;
    public VelocityTracker l1;
    public final pz0 m0;

    public boolean f15792m1;

    public int f15793n;

    public final Drawable f15794n0;

    public boolean f15795n1;

    public final bc f15796o0;

    public int f15797o1;

    public final RectF f15798p0;

    public final float[] f15799p1;

    public final Paint f15800q0;

    public int f15801q1;

    public final ArrayList f15802r;

    public final Path f15803r0;

    public int f15804r1;

    public final ArrayList f15805s;

    public final Path f15806s0;

    public int f15807s1;

    public final RectF f15808t0;

    public int f15809t1;

    public final Path f15810u0;

    public int f15811u1;
    public xb v;

    public final Paint f15812v0;

    public int f15813v1;

    public final Paint f15814w;

    public final Paint f15815w0;

    public final Path f15816x;

    public final Paint f15817x0;

    public final Path f15818y;

    public final Paint f15819y0;

    public final Paint f15820z0;

    public cc(Context context, ViewGroup viewGroup, fb fbVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var) {
        super(context);
        this.f15793n = 0;
        this.f15802r = new ArrayList();
        this.f15805s = new ArrayList();
        this.f15814w = new Paint(3);
        this.f15816x = new Path();
        this.f15818y = new Path();
        this.U = 1;
        er erVar = er.h;
        this.V = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.W = new org.telegram.ui.Components.y5(this, 360L, erVar);
        this.f15765a0 = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.f15768b0 = new org.telegram.ui.Components.y5(this, 360L, erVar);
        this.f15771c0 = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.f15773d0 = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.f15776e0 = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.f15779f0 = true;
        this.f15789k0 = new RectF();
        this.f15791l0 = new Path();
        this.f15796o0 = new bc();
        this.f15798p0 = new RectF();
        this.f15800q0 = new Paint(3);
        this.f15803r0 = new Path();
        this.f15806s0 = new Path();
        this.f15808t0 = new RectF();
        this.f15810u0 = new Path();
        Paint paint = new Paint(1);
        this.f15812v0 = paint;
        Paint paint2 = new Paint(1);
        this.f15815w0 = paint2;
        Paint paint3 = new Paint(1);
        this.f15817x0 = paint3;
        Paint paint4 = new Paint(1);
        this.f15819y0 = paint4;
        Paint paint5 = new Paint(1);
        this.f15820z0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.A0 = textPaint;
        this.B0 = new RectF();
        this.C0 = new Path();
        Paint paint6 = new Paint(1);
        this.D0 = paint6;
        this.E0 = new bc();
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
        this.S0 = new bm0(getContext(), null);
        this.V0 = -1L;
        this.W0 = -1L;
        this.X0 = new org.telegram.ui.Components.y5(0.0f, this, 0L, 340L, erVar);
        this.Y0 = -1L;
        this.f15774d1 = -1;
        this.f15777e1 = -1;
        this.f15780f1 = -1;
        this.f15782g1 = -1;
        this.f15788j1 = 1.0f;
        this.f15792m1 = true;
        this.f15795n1 = false;
        this.f15799p1 = new float[8];
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
        this.m0 = new pz0(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f15794n0 = drawableMutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.G0 = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f15781g0 = z9Var;
        this.f15783h0 = new org.telegram.ui.Components.da(z9Var, this, 0, false);
        this.f15785i0 = new org.telegram.ui.Components.da(z9Var, this, 3, false);
        this.f15787j0 = new org.telegram.ui.Components.da(z9Var, this, 4, false);
        this.U0 = new cg.k0(this, viewGroup, c6Var, z9Var, fbVar, 18);
    }

    public static void a(final cc ccVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var, View view) {
        int i10;
        ArrayList arrayList = ccVar.f15805s;
        int i11 = ccVar.f15780f1;
        try {
            if (i11 == 2 && ccVar.J) {
                t7 t7Var = new t7(ccVar.getContext(), 0);
                t7Var.f16862b = 0.0f;
                t7Var.f16863c = 1.5f;
                t7Var.d(ccVar.R);
                final int i12 = 0;
                t7Var.h = new Utilities.Callback(ccVar) {

                    public final cc f16921b;

                    {
                        this.f16921b = ccVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float fFloatValue = f10.floatValue();
                                cc ccVar2 = this.f16921b;
                                ccVar2.R = fFloatValue;
                                wb wbVar = ccVar2.f15764a;
                                if (wbVar != null) {
                                    wbVar.I(f10.floatValue());
                                }
                                break;
                            case 1:
                                float fFloatValue2 = f10.floatValue();
                                cc ccVar3 = this.f16921b;
                                ccVar3.H = fFloatValue2;
                                wb wbVar2 = ccVar3.f15764a;
                                if (wbVar2 != null) {
                                    wbVar2.y(f10.floatValue());
                                }
                                break;
                            default:
                                cc ccVar4 = this.f16921b;
                                ccVar4.h.f17062i = f10.floatValue();
                                wb wbVar3 = ccVar4.f15764a;
                                if (wbVar3 != null) {
                                    wbVar3.X0(f10.floatValue());
                                }
                                break;
                        }
                    }
                };
                long jMin = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
                int i13 = ccVar.f15804r1;
                int i14 = ccVar.f15811u1;
                int i15 = ccVar.f15809t1;
                float fMin = Math.min((i13 - i14) - i15, ((((AndroidUtilities.lerp(ccVar.P, 1.0f, ccVar.f15768b0.f34812c) * ccVar.N) + (ccVar.M - ccVar.f15778f)) / jMin) * ccVar.f15801q1) + i14 + i15);
                b70 b70VarF = b70.F(viewGroup, c6Var, ccVar);
                b70VarF.q(t7Var);
                b70VarF.o();
                b70VarF.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new tb(ccVar, 1), false);
                b70VarF.V(5);
                b70VarF.U = true;
                b70VarF.a0((-(ccVar.f15804r1 - fMin)) + AndroidUtilities.dp(18.0f), ccVar.B0.top);
                b70VarF.Z();
                b70VarF.R(z9Var, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && ccVar.A) {
                t7 t7Var2 = new t7(ccVar.getContext(), 0);
                t7Var2.f16862b = 0.0f;
                t7Var2.f16863c = 1.5f;
                t7Var2.d(ccVar.H);
                final int i16 = 1;
                t7Var2.h = new Utilities.Callback(ccVar) {

                    public final cc f16921b;

                    {
                        this.f16921b = ccVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i16) {
                            case 0:
                                float fFloatValue = f10.floatValue();
                                cc ccVar2 = this.f16921b;
                                ccVar2.R = fFloatValue;
                                wb wbVar = ccVar2.f15764a;
                                if (wbVar != null) {
                                    wbVar.I(f10.floatValue());
                                }
                                break;
                            case 1:
                                float fFloatValue2 = f10.floatValue();
                                cc ccVar3 = this.f16921b;
                                ccVar3.H = fFloatValue2;
                                wb wbVar2 = ccVar3.f15764a;
                                if (wbVar2 != null) {
                                    wbVar2.y(f10.floatValue());
                                }
                                break;
                            default:
                                cc ccVar4 = this.f16921b;
                                ccVar4.h.f17062i = f10.floatValue();
                                wb wbVar3 = ccVar4.f15764a;
                                if (wbVar3 != null) {
                                    wbVar3.X0(f10.floatValue());
                                }
                                break;
                        }
                    }
                };
                long jMin2 = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
                int i17 = ccVar.f15804r1;
                int i18 = ccVar.f15811u1;
                int i19 = ccVar.f15809t1;
                float fMin2 = Math.min((i17 - i18) - i19, ((((AndroidUtilities.lerp(ccVar.G, 1.0f, ccVar.W.f34812c) * ccVar.D) + (ccVar.E - ccVar.f15778f)) / jMin2) * ccVar.f15801q1) + i18 + i19);
                b70 b70VarF2 = b70.F(viewGroup, c6Var, ccVar);
                b70VarF2.q(t7Var2);
                b70VarF2.o();
                b70VarF2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new tb(ccVar, 2), false);
                b70VarF2.V(5);
                b70VarF2.U = true;
                b70VarF2.a0((-(ccVar.f15804r1 - fMin2)) + AndroidUtilities.dp(18.0f), ccVar.f15808t0.top);
                b70VarF2.Z();
                b70VarF2.R(z9Var, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && ccVar.h != null) {
                t7 t7Var3 = new t7(ccVar.getContext(), 0);
                t7Var3.f16862b = 0.0f;
                t7Var3.f16863c = 1.5f;
                t7Var3.d(ccVar.h.f17062i);
                final int i20 = 2;
                t7Var3.h = new Utilities.Callback(ccVar) {

                    public final cc f16921b;

                    {
                        this.f16921b = ccVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i20) {
                            case 0:
                                float fFloatValue = f10.floatValue();
                                cc ccVar2 = this.f16921b;
                                ccVar2.R = fFloatValue;
                                wb wbVar = ccVar2.f15764a;
                                if (wbVar != null) {
                                    wbVar.I(f10.floatValue());
                                }
                                break;
                            case 1:
                                float fFloatValue2 = f10.floatValue();
                                cc ccVar3 = this.f16921b;
                                ccVar3.H = fFloatValue2;
                                wb wbVar2 = ccVar3.f15764a;
                                if (wbVar2 != null) {
                                    wbVar2.y(f10.floatValue());
                                }
                                break;
                            default:
                                cc ccVar4 = this.f16921b;
                                ccVar4.h.f17062i = f10.floatValue();
                                wb wbVar3 = ccVar4.f15764a;
                                if (wbVar3 != null) {
                                    wbVar3.X0(f10.floatValue());
                                }
                                break;
                        }
                    }
                };
                b70 b70VarF3 = b70.F(viewGroup, c6Var, ccVar);
                b70VarF3.q(t7Var3);
                b70VarF3.V(5);
                b70VarF3.U = true;
                b70VarF3.a0(AndroidUtilities.dp(18.0f), ccVar.f15798p0.top);
                b70VarF3.Z();
                b70VarF3.R(z9Var, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else {
                if (i11 != 3 || (i10 = ccVar.f15782g1) < 0 || i10 >= arrayList.size()) {
                    return;
                }
                xb xbVar = (xb) arrayList.get(ccVar.f15782g1);
                t7 t7Var4 = new t7(ccVar.getContext(), 0);
                t7Var4.f16862b = 0.0f;
                t7Var4.f16863c = 1.5f;
                t7Var4.d(xbVar.f17062i);
                t7Var4.h = new gh.d1(16, ccVar, xbVar);
                b70 b70VarF4 = b70.F(viewGroup, c6Var, ccVar);
                b70VarF4.q(t7Var4);
                b70VarF4.V(5);
                b70VarF4.U = true;
                b70VarF4.a0(AndroidUtilities.dp(18.0f), xbVar.f17063j.top);
                b70VarF4.Z();
                b70VarF4.R(z9Var, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f15768b0.e(this.L));
    }

    public long getBaseDuration() {
        xb xbVar = this.h;
        if (xbVar != null) {
            return Math.max(1L, xbVar.f17059e);
        }
        xb xbVar2 = this.v;
        if (xbVar2 != null) {
            return Math.max(1L, xbVar2.f17059e);
        }
        return this.A ? Math.max(1L, this.D) : Math.max(1L, this.N);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f15805s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float fLerp = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (fLerp > 0.0f) {
                fLerp += AndroidUtilities.dp(4.0f);
            }
            fLerp += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((xb) arrayList.get(i10)).f17064k.f34812c);
        }
        return fLerp;
    }

    private float getRoundHeight() {
        if (!this.A) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.W.e(this.C));
    }

    private float getVideoHeight() {
        xb xbVar = this.h;
        if (xbVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), xbVar.f17064k.f34812c);
    }

    public final int c(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float fClamp = Utilities.clamp(this.f15775e, getBaseDuration(), 0L);
        xb xbVar = this.v;
        float f10 = jMin;
        float f11 = (this.f15801q1 * (((fClamp + (xbVar != null ? (xbVar.f17061g * xbVar.f17059e) + xbVar.f17060f : this.h == null ? this.M : 0L)) - this.f15778f) / f10)) + this.f15811u1 + this.f15809t1;
        if (!this.T0 && x8 >= f11 - AndroidUtilities.dp(12.0f) && x8 <= f11 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z11 = this.h != null && y10 > (((float) (this.f15807s1 - this.f15813v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        ArrayList arrayList = this.f15805s;
        boolean z12 = !arrayList.isEmpty() && y10 > ((((((float) (this.f15807s1 - this.f15813v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y10 < (((float) (this.f15807s1 - this.f15813v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (!this.A) {
            z10 = false;
        } else if (y10 <= (((((((this.f15807s1 - this.f15813v1) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
            z10 = false;
        } else if (y10 < ((((this.f15807s1 - this.f15813v1) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                xb xbVar2 = (xb) arrayList.get(i11);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(xbVar2.f17063j);
                rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                if (rectF.contains(x8, y10)) {
                    float f12 = this.f15811u1 + this.f15809t1;
                    long j10 = xbVar2.f17060f;
                    float f13 = j10;
                    float f14 = this.f15801q1;
                    float f15 = ((f13 / f10) * f14) + f12;
                    float f16 = xbVar2.f17061g;
                    long j11 = xbVar2.f17059e;
                    float f17 = j11;
                    float f18 = ((((f16 * f17) + f13) / f10) * f14) + f12;
                    float f19 = ((((xbVar2.h * f17) + f13) / f10) * f14) + f12;
                    float fC = s3.c.c(j10 + j11, f10, f14, f12);
                    this.f15777e1 = i11;
                    if (x8 >= f18 - AndroidUtilities.dp(15.0f) && x8 <= AndroidUtilities.dp(5.0f) + f18) {
                        return 13;
                    }
                    if (x8 >= f19 - AndroidUtilities.dp(5.0f) && x8 <= AndroidUtilities.dp(15.0f) + f19) {
                        return 14;
                    }
                    if (x8 < f18 || x8 > f19 || (xbVar2.f17061g <= 0.01f && xbVar2.h >= 0.99f)) {
                        return (x8 < f15 || x8 > fC) ? -1 : 16;
                    }
                    return 15;
                }
            }
            i10 = 1;
        } else {
            i10 = 1;
            if (z11) {
                float f20 = this.f15811u1 + this.f15809t1;
                xb xbVar3 = this.h;
                float f21 = xbVar3.f17061g;
                float f22 = xbVar3.f17059e;
                float f23 = this.f15778f;
                float f24 = this.f15801q1;
                float f25 = ((((f21 * f22) - f23) / f10) * f24) + f20;
                float f26 = ((((xbVar3.h * f22) - f23) / f10) * f24) + f20;
                if (this.T0) {
                    if (getBaseDuration() < getMaxScrollDuration()) {
                        return 4;
                    }
                    if (x8 >= f25 - AndroidUtilities.dp(15.0f) && x8 <= f26 + AndroidUtilities.dp(15.0f)) {
                        return 4;
                    }
                } else {
                    if (x8 >= f25 - AndroidUtilities.dp(15.0f) && x8 <= AndroidUtilities.dp(5.0f) + f25) {
                        return 2;
                    }
                    if (x8 >= f26 - AndroidUtilities.dp(5.0f) && x8 <= AndroidUtilities.dp(15.0f) + f26) {
                        return 3;
                    }
                    if (x8 >= f25 && x8 <= f26) {
                        xb xbVar4 = this.h;
                        if (xbVar4.f17061g > 0.01f || xbVar4.h < 0.99f) {
                            return 4;
                        }
                    }
                }
                return i10;
            }
            if (z10) {
                float f27 = this.f15811u1 + this.f15809t1;
                float f28 = this.E;
                float f29 = this.F;
                float f30 = this.D;
                float f31 = this.f15778f;
                float f32 = this.f15801q1;
                float f33 = (((((f29 * f30) + f28) - f31) / f10) * f32) + f27;
                float fC2 = (((((this.G * f30) + f28) - f31) / f10) * f32) + f27;
                if (this.C || this.h == null) {
                    if (x8 >= f33 - AndroidUtilities.dp(15.0f) && x8 <= AndroidUtilities.dp(5.0f) + f33) {
                        return 10;
                    }
                    if (x8 >= fC2 - AndroidUtilities.dp(5.0f) && x8 <= AndroidUtilities.dp(15.0f) + fC2) {
                        return 11;
                    }
                    if (x8 >= f33 && x8 <= fC2) {
                        return this.h == null ? 12 : 9;
                    }
                    float f34 = this.f15811u1 + this.f15809t1;
                    long j12 = this.E;
                    long j13 = this.f15778f;
                    float f35 = this.f15801q1;
                    float f36 = (((j12 - j13) / f10) * f35) + f34;
                    fC2 = s3.c.c((j12 + this.D) - j13, f10, f35, f34);
                    f33 = f36;
                }
                if (x8 >= f33 && x8 <= fC2) {
                    return 9;
                }
            } else if (this.J) {
                float f37 = this.f15811u1 + this.f15809t1;
                float f38 = this.M;
                float f39 = this.O;
                float f40 = this.N;
                float f41 = this.f15778f;
                float f42 = this.f15801q1;
                float f43 = (((((f39 * f40) + f38) - f41) / f10) * f42) + f37;
                float fC3 = (((((this.P * f40) + f38) - f41) / f10) * f42) + f37;
                if (this.L || (this.h == null && !this.A)) {
                    if (x8 >= f43 - AndroidUtilities.dp(15.0f) && x8 <= AndroidUtilities.dp(5.0f) + f43) {
                        return 6;
                    }
                    if (x8 >= fC3 - AndroidUtilities.dp(5.0f) && x8 <= AndroidUtilities.dp(15.0f) + fC3) {
                        return 7;
                    }
                    if (x8 >= f43 && x8 <= fC3) {
                        return this.h == null ? 8 : 5;
                    }
                    float f44 = this.f15811u1 + this.f15809t1;
                    long j14 = this.M;
                    long j15 = this.f15778f;
                    float f45 = this.f15801q1;
                    float f46 = (((j14 - j15) / f10) * f45) + f44;
                    fC3 = s3.c.c((j14 + this.N) - j15, f10, f45, f44);
                    f43 = f46;
                }
                if (x8 >= f43 && x8 <= fC3) {
                    return 5;
                }
            }
        }
        xb xbVar5 = this.h;
        if (xbVar5 == null || xbVar5.f17059e <= getMaxScrollDuration() || !z11) {
            return -1;
        }
        return i10;
    }

    @Override
    public final void computeScroll() {
        bm0 bm0Var = this.S0;
        if (!bm0Var.b()) {
            if (this.f15795n1) {
                this.f15795n1 = false;
                wb wbVar = this.f15764a;
                if (wbVar != null) {
                    wbVar.I0(false);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = bm0Var.f27171j;
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.f15792m1) {
            this.f15778f = (long) Math.max(0.0f, (((i10 - this.f15811u1) - this.f15809t1) / this.f15801q1) * jMin);
        } else {
            if (!this.L) {
                bm0Var.a();
                return;
            }
            int i11 = this.f15811u1;
            int i12 = this.f15809t1;
            float f10 = this.f15801q1;
            float f11 = jMin;
            h(((((i10 - i11) - i12) / f10) * f11) - ((((this.f15797o1 - i11) - i12) / f10) * f11));
        }
        invalidate();
        this.f15797o1 = i10;
    }

    public final void d(Canvas canvas, float f10, float f11, long j10, float f12) {
        float f13;
        if (this.T0) {
            return;
        }
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float fClamp = Utilities.clamp(j10, getBaseDuration(), 0L);
        xb xbVar = this.v;
        if (xbVar != null) {
            f13 = (xbVar.f17061g * xbVar.f17059e) + xbVar.f17060f;
        } else {
            f13 = this.h == null ? this.M : 0L;
        }
        float f14 = (this.f15801q1 * (((fClamp + f13) - this.f15778f) / jMin)) + this.f15811u1 + this.f15809t1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.f15819y0;
        paint.setAlpha((int) (38.0f * f12));
        int i10 = (int) (f12 * 255.0f);
        Paint paint2 = this.f15820z0;
        paint2.setAlpha(i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        long j10;
        Paint paint;
        float f10;
        org.telegram.ui.Components.da daVar;
        long j11;
        int i10;
        xb xbVar;
        xb xbVar2;
        int i11;
        float f11;
        float fMax;
        Canvas canvas2;
        long j12;
        float f12;
        boolean z10;
        float f13;
        long j13;
        float f14;
        float f15;
        float fX;
        float f16;
        float f17;
        ArrayList arrayList;
        float f18;
        float f19;
        float f20;
        float f21;
        float fMax2;
        double d;
        float f22;
        float f23;
        float f24;
        float fLerp;
        Canvas canvas3;
        float f25;
        float f26;
        xb xbVar3;
        float f27;
        float fLerp2;
        float fY;
        float f28;
        RectF rectF2;
        float fCenterY;
        float fMax3;
        float f29;
        float fDpf2;
        float f30;
        boolean z11;
        float f31;
        float f32;
        float fDpf3;
        float fMin;
        float fDpf4;
        float fC;
        float f33;
        int i12;
        boolean z12;
        int i13;
        zb zbVar;
        int i14;
        float f34;
        float fLerp3;
        float fC2;
        float f35;
        float f36;
        boolean z13;
        float f37;
        float f38;
        Paint paint2;
        Paint paint3;
        org.telegram.ui.Components.da daVar2;
        cc ccVar = this;
        RectF rectF3 = ccVar.f15798p0;
        RectF rectF4 = ccVar.f15808t0;
        Path path = ccVar.f15806s0;
        ArrayList arrayList2 = ccVar.f15802r;
        Drawable drawable = ccVar.f15794n0;
        org.telegram.ui.Components.z9 z9Var = ccVar.f15781g0;
        RectF rectF5 = ccVar.B0;
        ArrayList arrayList3 = ccVar.f15805s;
        RectF rectF6 = ccVar.f15789k0;
        org.telegram.ui.Components.da daVar3 = ccVar.f15783h0;
        Paint paintC = daVar3.c(1.0f);
        float fE = ccVar.f15776e0.e(ccVar.f15779f0);
        long jMin = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
        ArrayList arrayList4 = arrayList3;
        if (fE < 1.0f) {
            rectF6.set(ccVar.f15811u1, (ccVar.f15807s1 - ccVar.f15813v1) - AndroidUtilities.dp(28.0f), ccVar.f15804r1 - ccVar.f15811u1, ccVar.f15807s1 - ccVar.f15813v1);
            ccVar.f15791l0.rewind();
            ccVar.f15791l0.addRoundRect(rectF6, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF6, (int) ((1.0f - fE) * 255.0f), 31);
            canvas.clipPath(ccVar.f15791l0);
            if (z9Var.c()) {
                daVar3.a(canvas);
                canvas.drawColor(855638016);
                paint2 = paintC;
            } else if (paintC == null) {
                canvas.drawColor(1073741824);
                paint2 = paintC;
            } else {
                paint2 = paintC;
                canvas.drawRect(rectF6, paint2);
                canvas.drawColor(855638016);
            }
            if (arrayList2.isEmpty() || !z9Var.c()) {
                paint3 = paint2;
                rectF = rectF3;
                daVar2 = daVar3;
                j10 = jMin;
                if (!arrayList2.isEmpty()) {
                    Paint paintC2 = ccVar.f15787j0.c(0.4f);
                    if (paintC2 == null) {
                        paintC2 = ccVar.D0;
                        paintC2.setAlpha(64);
                    }
                    ccVar.f15796o0.a((((ccVar.M - ccVar.f15778f) / j10) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1, rectF6.left, rectF6.right, AndroidUtilities.dp(28.0f), ccVar.f15773d0.d(bc.c(arrayList2), false), rectF6.bottom, arrayList2);
                    canvas.drawPath(ccVar.f15796o0, paintC2);
                }
                float fH = ((ccVar.m0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                int iCenterX = (int) (rectF6.centerX() - fH);
                int iCenterY = (int) rectF6.centerY();
                drawable.setBounds(iCenterX, rl.e(2, iCenterY, drawable), drawable.getIntrinsicWidth() + iCenterX, rl.y(2, iCenterY, drawable));
                drawable.setAlpha(191);
                drawable.draw(canvas);
                paint = paint3;
                daVar = daVar2;
                f10 = 0.4f;
                ccVar.m0.c((rectF6.centerX() - fH) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), iCenterY, 0.75f, -1, canvas);
                canvas.restore();
            } else {
                float fD = ccVar.f15773d0.d(bc.c(arrayList2), false);
                rectF6 = rectF6;
                paint3 = paint2;
                rectF = rectF3;
                j10 = jMin;
                daVar2 = daVar3;
                ccVar.f15796o0.a((((ccVar.M - ccVar.f15778f) / jMin) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1, rectF6.left, rectF6.right, AndroidUtilities.dp(28.0f), fD, rectF6.bottom, arrayList2);
                canvas.saveLayerAlpha(rectF6, 102, 31);
                canvas.clipPath(ccVar.f15796o0);
                ccVar.f15787j0.a(canvas);
                canvas.restore();
            }
            float fH2 = ((ccVar.m0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int iCenterX2 = (int) (rectF6.centerX() - fH2);
            int iCenterY2 = (int) rectF6.centerY();
            drawable.setBounds(iCenterX2, rl.e(2, iCenterY2, drawable), drawable.getIntrinsicWidth() + iCenterX2, rl.y(2, iCenterY2, drawable));
            drawable.setAlpha(191);
            drawable.draw(canvas);
            paint = paint3;
            daVar = daVar2;
            f10 = 0.4f;
            ccVar.m0.c((rectF6.centerX() - fH2) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), iCenterY2, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF3;
            j10 = jMin;
            paint = paintC;
            f10 = 0.4f;
            daVar = daVar3;
        }
        if (fE > 0.0f) {
            if (fE < 1.0f) {
                canvas2 = canvas;
                j12 = j10;
                f12 = 0.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, ccVar.getWidth(), ccVar.getHeight(), (int) (fE * 255.0f), 31);
                z10 = true;
            } else {
                canvas2 = canvas;
                j12 = j10;
                f12 = 0.0f;
                z10 = false;
            }
            xb xbVar4 = ccVar.h;
            float f39 = xbVar4 != null ? 1.0f : 0.0f;
            float fE2 = xbVar4 != null ? xbVar4.f17064k.e((ccVar.L || ccVar.C) ? false : true) : 0.0f;
            float f40 = ccVar.f15807s1 - ccVar.f15813v1;
            float fDp = AndroidUtilities.dp(4.0f);
            if (ccVar.h != null) {
                canvas2.save();
                float videoHeight = ccVar.getVideoHeight();
                xb xbVar5 = ccVar.h;
                float f41 = xbVar5.f17061g;
                long j14 = xbVar5.f17059e;
                float f42 = j14;
                float fX2 = com.google.android.recaptcha.internal.a.x(f41, f42, fE2, f12);
                fX = com.google.android.recaptcha.internal.a.x(xbVar5.h, f42, fE2, f12);
                if (j14 <= 0) {
                    j13 = j12;
                    f38 = 0.0f;
                    f37 = 0.0f;
                } else {
                    f37 = 0.0f;
                    j13 = j12;
                    f38 = (ccVar.f15811u1 + ccVar.f15809t1) - (ccVar.f15801q1 * (ccVar.f15778f / j13));
                }
                int i15 = ccVar.f15809t1;
                f16 = fX2;
                float f43 = i15;
                float f44 = f38 - f43;
                float f45 = (j14 <= 0 ? 0.0f : (((j14 - ccVar.f15778f) / j13) * ccVar.f15801q1) + ccVar.f15811u1 + i15) + f43;
                RectF rectF7 = rectF;
                rectF7.set(f44, f40 - videoHeight, f45, f40);
                float f46 = f40 - ((fDp * f39) + videoHeight);
                float f47 = (rectF7.top * fE2) + f37;
                f15 = (rectF7.bottom * fE2) + f37;
                ccVar.f15803r0.rewind();
                ccVar.f15803r0.addRoundRect(rectF7, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(ccVar.f15803r0);
                ac acVar = ccVar.h.f17058c;
                if (acVar != null) {
                    int i16 = acVar.f15661f;
                    float f48 = i16;
                    f17 = f47;
                    int iMax = (int) Math.max(0.0d, Math.floor((f44 - ccVar.f15811u1) / f48));
                    f13 = f39;
                    int iMin = (int) Math.min(ccVar.h.f17058c.f15659c, Math.ceil(((f45 - f44) - ccVar.f15811u1) / f48) + 1.0d);
                    int i17 = (int) rectF7.top;
                    boolean z14 = ccVar.h.f17058c.d.size() >= iMin;
                    boolean z15 = (i16 == 0 || !z14 || ccVar.h.f17057b) ? false : true;
                    if (z15) {
                        for (int i18 = iMax; i18 < Math.min(ccVar.h.f17058c.d.size(), iMin); i18++) {
                            if (((zb) ccVar.h.f17058c.d.get(i18)).f17255a == null) {
                                z15 = false;
                                break;
                            }
                        }
                    }
                    if (!z15) {
                        if (z9Var.c()) {
                            daVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(1073741824);
                        } else {
                            canvas2.drawRect(rectF7, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i16 != 0) {
                        float f49 = f44;
                        int i19 = iMax;
                        while (i19 < Math.min(ccVar.h.f17058c.d.size(), iMin)) {
                            zb zbVar2 = (zb) ccVar.h.f17058c.d.get(i19);
                            if (zbVar2.f17255a != null) {
                                ccVar.f15800q0.setAlpha((int) (zbVar2.f17256b.d(1.0f, false) * 255.0f));
                                Bitmap bitmap = zbVar2.f17255a;
                                canvas2.drawBitmap(bitmap, f49, i17 - ((int) ((bitmap.getHeight() - videoHeight) / 2.0f)), ccVar.f15800q0);
                            }
                            f49 += f48;
                            i19++;
                            z14 = z14;
                            iMin = iMin;
                        }
                    }
                    if (!z14) {
                        ccVar.h.f17058c.c();
                    }
                } else {
                    f17 = f47;
                    f13 = f39;
                }
                path.rewind();
                if (!ccVar.T0) {
                    RectF rectF8 = AndroidUtilities.rectTmp;
                    int i20 = ccVar.f15811u1;
                    int i21 = ccVar.f15809t1;
                    float f50 = i20 + i21;
                    xb xbVar6 = ccVar.h;
                    float f51 = xbVar6.f17061g;
                    int i22 = i21;
                    float f52 = xbVar6.f17059e;
                    float f53 = ccVar.f15778f;
                    float f54 = (f51 * f52) - f53;
                    float f55 = j13;
                    float f56 = ccVar.f15801q1;
                    float f57 = (((f54 / f55) * f56) + f50) - (f51 <= f37 ? i22 : 0);
                    float f58 = ccVar.f15807s1 - ccVar.f15813v1;
                    float f59 = f58 - videoHeight;
                    float f60 = xbVar6.h;
                    float f61 = ((((f52 * f60) - f53) / f55) * f56) + f50;
                    if (f60 < 1.0f) {
                        i22 = 0;
                    }
                    rectF8.set(f57, f59, f61 + i22, f58);
                    path.addRoundRect(rectF8, ccVar.f15799p1, Path.Direction.CW);
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f40 = f46;
                f14 = videoHeight;
            } else {
                fE2 = fE2;
                f13 = f39;
                j13 = j12;
                fDp = fDp;
                f14 = 0.0f;
                f15 = 0.0f;
                fX = 0.0f;
                f16 = 0.0f;
                f17 = 0.0f;
            }
            if (arrayList4.isEmpty()) {
                arrayList = arrayList4;
                f18 = f14;
                f19 = 0.0f;
            } else {
                ccVar.getCollageHeight();
                float f62 = f40;
                int i23 = 0;
                while (i23 < arrayList4.size()) {
                    ArrayList arrayList5 = arrayList4;
                    xb xbVar7 = (xb) arrayList5.get(i23);
                    org.telegram.ui.Components.y5 y5Var = xbVar7.f17064k;
                    RectF rectF9 = xbVar7.f17063j;
                    float f63 = f14;
                    float fE3 = y5Var.e((ccVar.L || ccVar.C || ccVar.f15793n != i23) ? false : true);
                    if (xbVar7 != ccVar.v) {
                        float f64 = j13;
                        f34 = f15;
                        fLerp3 = ((((AndroidUtilities.lerp(xbVar7.f17061g, 0.0f, fE3) * xbVar7.f17059e) + (xbVar7.f17060f - ccVar.f15778f)) / f64) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1;
                        fC2 = (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(xbVar7.h, 1.0f, fE3), xbVar7.f17059e, xbVar7.f17060f - ccVar.f15778f, f64) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1;
                    } else {
                        f34 = f15;
                        float f65 = ccVar.f15811u1 + ccVar.f15809t1;
                        long j15 = xbVar7.f17060f - ccVar.f15778f;
                        float f66 = j13;
                        float f67 = j15 / f66;
                        float f68 = ccVar.f15801q1;
                        fLerp3 = (f67 * f68) + f65;
                        fC2 = s3.c.c(j15 + xbVar7.f17059e, f66, f68, f65);
                    }
                    float f69 = fLerp3;
                    canvas2.save();
                    float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), fE3);
                    float f70 = ccVar.f15809t1;
                    rectF9.set(f69 - f70, f62 - fLerp4, fC2 + f70, f62);
                    f17 = (rectF9.top * fE3) + f17;
                    f15 = (rectF9.bottom * fE3) + f34;
                    float f71 = xbVar7.f17060f;
                    float f72 = xbVar7.f17061g;
                    float f73 = f62;
                    float f74 = xbVar7.f17059e;
                    f16 = (((f72 * f74) + f71) * fE3) + f16;
                    fX = (((xbVar7.h * f74) + f71) * fE3) + fX;
                    ccVar.f15816x.rewind();
                    ccVar.f15816x.addRoundRect(rectF9, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(ccVar.f15816x);
                    ac acVar2 = xbVar7.f17058c;
                    if (acVar2 != null) {
                        long j16 = xbVar7.f17059e;
                        f35 = fLerp4;
                        float f75 = j16 <= 0 ? 0.0f : ccVar.f15811u1 + ccVar.f15809t1 + (((xbVar7.f17060f - ccVar.f15778f) / j13) * ccVar.f15801q1);
                        int i24 = ccVar.f15809t1;
                        float f76 = i24;
                        float f77 = f75 - f76;
                        float f78 = (j16 <= 0 ? 0.0f : ((((xbVar7.f17060f + j16) - ccVar.f15778f) / j13) * ccVar.f15801q1) + ccVar.f15811u1 + i24) + f76;
                        int i25 = acVar2.f15661f;
                        float f79 = i25;
                        int iMax2 = (int) Math.max(0.0d, Math.floor((f77 - ((((xbVar7.f17060f - ccVar.f15778f) / j13) * ccVar.f15801q1) + (ccVar.f15811u1 + ccVar.f15809t1))) / f79));
                        int iMin2 = (int) Math.min(xbVar7.f17058c.f15659c, Math.ceil((f78 - f77) / f79) + 1.0d);
                        int i26 = (int) rectF9.top;
                        boolean z16 = xbVar7.f17058c.d.size() >= iMin2;
                        if (!z16) {
                            z13 = z16;
                            break;
                        }
                        int i27 = iMax2;
                        while (true) {
                            if (i27 >= Math.min(xbVar7.f17058c.d.size(), iMin2)) {
                                z13 = z16;
                                break;
                            } else {
                                if (((zb) xbVar7.f17058c.d.get(i27)).f17255a == null) {
                                    z13 = false;
                                    break;
                                }
                                i27++;
                            }
                        }
                        if (!z13) {
                            if (z9Var.c()) {
                                daVar.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(1073741824);
                            } else {
                                canvas2.drawRect(rectF9, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i25 != 0) {
                            float f80 = f77;
                            while (iMax2 < Math.min(xbVar7.f17058c.d.size(), iMin2)) {
                                zb zbVar3 = (zb) xbVar7.f17058c.d.get(iMax2);
                                int i28 = iMin2;
                                if (zbVar3.f17255a != null) {
                                    ccVar.f15814w.setAlpha((int) (zbVar3.f17256b.d(1.0f, false) * 255.0f));
                                    Bitmap bitmap2 = zbVar3.f17255a;
                                    canvas2.drawBitmap(bitmap2, f80, i26 - ((int) ((bitmap2.getHeight() - f35) / 2.0f)), ccVar.f15814w);
                                }
                                f80 += f79;
                                iMax2++;
                                iMin2 = i28;
                                z16 = z16;
                                f73 = f73;
                            }
                        }
                        f36 = f73;
                        if (!z16) {
                            xbVar7.f17058c.c();
                        }
                    } else {
                        f35 = fLerp4;
                        f36 = f73;
                    }
                    ccVar.f15818y.rewind();
                    if (!ccVar.T0) {
                        RectF rectF10 = AndroidUtilities.rectTmp;
                        int i29 = ccVar.f15811u1;
                        int i30 = ccVar.f15809t1;
                        float f81 = i29 + i30;
                        float f82 = xbVar7.f17061g;
                        float f83 = xbVar7.f17059e;
                        float f84 = ccVar.f15778f;
                        float f85 = (f82 * f83) - f84;
                        float f86 = xbVar7.f17060f;
                        float f87 = j13;
                        float f88 = ccVar.f15801q1;
                        float f89 = ((((f85 + f86) / f87) * f88) + f81) - (f82 <= 0.0f ? i30 : 0);
                        float f90 = rectF9.top;
                        float f91 = xbVar7.h;
                        rectF10.set(f89, f90, (((((f83 * f91) - f84) + f86) / f87) * f88) + f81 + (f91 >= 1.0f ? i30 : 0), rectF9.bottom);
                        ccVar.f15818y.addRoundRect(rectF10, ccVar.f15799p1, Path.Direction.CW);
                        canvas2.clipPath(ccVar.f15818y, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f62 = f36 - ((fDp * 1.0f) + f35);
                    i23++;
                    path = path;
                    f14 = f63;
                    arrayList4 = arrayList5;
                    rectF4 = rectF4;
                }
                arrayList = arrayList4;
                f18 = f14;
                f40 = f62;
                f19 = 1.0f;
            }
            RectF rectF11 = rectF4;
            Path path2 = path;
            float fE4 = ccVar.V.e(ccVar.A);
            float fE5 = ccVar.W.e(ccVar.A && ccVar.C);
            float roundHeight = ccVar.getRoundHeight() * fE4;
            float f92 = ((ccVar.h == null && !ccVar.J && arrayList.isEmpty()) ? 1.0f : fE5) * fE4;
            if (fE4 > 0.0f) {
                long j17 = ccVar.E;
                float f93 = j17;
                float f94 = ccVar.F;
                long j18 = ccVar.D;
                float f95 = j18;
                f16 = (((f94 * f95) + f93) * f92) + f16;
                fX = (((ccVar.G * f95) + f93) * f92) + fX;
                if (ccVar.h != null) {
                    float f96 = j13;
                    float fLerp5 = ((((ccVar.D * AndroidUtilities.lerp(f94, 0.0f, fE5)) + (j17 - ccVar.f15778f)) / f96) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1;
                    fC = (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(ccVar.G, 1.0f, fE5), ccVar.D, ccVar.E - ccVar.f15778f, f96) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1;
                    f33 = fLerp5;
                } else {
                    float f97 = ccVar.f15811u1 + ccVar.f15809t1;
                    long j19 = j17 - ccVar.f15778f;
                    float f98 = j13;
                    float f99 = ccVar.f15801q1;
                    float f100 = ((j19 / f98) * f99) + f97;
                    fC = s3.c.c(j19 + j18, f98, f99, f97);
                    f33 = f100;
                }
                float f101 = ccVar.f15809t1;
                rectF11.set(f33 - f101, f40 - roundHeight, fC + f101, f40);
                float f102 = f40 - ((fDp * fE4) + roundHeight);
                f17 = (rectF11.top * f92) + f17;
                f15 = (rectF11.bottom * f92) + f15;
                ccVar.f15810u0.rewind();
                ccVar.f15810u0.addRoundRect(rectF11, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(ccVar.f15810u0);
                ac acVar3 = ccVar.I;
                if (acVar3 != null) {
                    float f103 = fE5;
                    long j20 = ccVar.D;
                    float f104 = j20 <= 0 ? 0.0f : ccVar.f15811u1 + ccVar.f15809t1 + (((ccVar.E - ccVar.f15778f) / j13) * ccVar.f15801q1);
                    int i31 = ccVar.f15809t1;
                    float f105 = i31;
                    float f106 = f104 - f105;
                    float f107 = (j20 <= 0 ? 0.0f : ccVar.f15811u1 + i31 + ((((ccVar.E + j20) - ccVar.f15778f) / j13) * ccVar.f15801q1)) + f105;
                    int i32 = acVar3.f15661f;
                    float f108 = i32;
                    float f109 = f106;
                    int iMax3 = (int) Math.max(0.0d, Math.floor((f106 - (ccVar.h != null ? (((ccVar.E - ccVar.f15778f) / j13) * ccVar.f15801q1) + (ccVar.f15811u1 + ccVar.f15809t1) : ccVar.f15811u1)) / f108));
                    int iMin3 = (int) Math.min(ccVar.I.f15659c, Math.ceil((f107 - f109) / f108) + 1.0d);
                    int i33 = (int) rectF11.top;
                    boolean z17 = ccVar.I.d.size() >= iMin3;
                    if (z17) {
                        int i34 = iMax3;
                        i12 = i34;
                        while (true) {
                            if (i34 < Math.min(ccVar.I.d.size(), iMin3)) {
                                if (((zb) ccVar.I.d.get(i34)).f17255a == null) {
                                    z12 = false;
                                    break;
                                }
                                i34++;
                            }
                        }
                        if (!z12) {
                            if (z9Var.c()) {
                                daVar.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(1073741824);
                            } else {
                                canvas2.drawRect(rectF11, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i32 != 0) {
                            i13 = i12;
                            while (i13 < Math.min(ccVar.I.d.size(), iMin3)) {
                                zbVar = (zb) ccVar.I.d.get(i13);
                                int i35 = i13;
                                if (zbVar.f17255a != null) {
                                    i14 = i33;
                                    ccVar.f15800q0.setAlpha((int) (zbVar.f17256b.d(1.0f, false) * 255.0f));
                                    Bitmap bitmap3 = zbVar.f17255a;
                                    canvas2.drawBitmap(bitmap3, f109, i14 - ((int) ((bitmap3.getHeight() - roundHeight) / 2.0f)), ccVar.f15800q0);
                                } else {
                                    i14 = i33;
                                }
                                f109 += f108;
                                i13 = i35 + 1;
                                iMin3 = iMin3;
                                i33 = i14;
                                f103 = f103;
                            }
                        }
                        f20 = f103;
                        if (!z17) {
                            ccVar.I.c();
                        }
                    } else {
                        i12 = iMax3;
                    }
                    z12 = z17;
                    if (!z12) {
                        if (z9Var.c()) {
                            daVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(1073741824);
                        } else {
                            canvas2.drawRect(rectF11, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i32 != 0) {
                        i13 = i12;
                        while (i13 < Math.min(ccVar.I.d.size(), iMin3)) {
                            zbVar = (zb) ccVar.I.d.get(i13);
                            int i36 = i13;
                            if (zbVar.f17255a != null) {
                                i14 = i33;
                                ccVar.f15800q0.setAlpha((int) (zbVar.f17256b.d(1.0f, false) * 255.0f));
                                Bitmap bitmap4 = zbVar.f17255a;
                                canvas2.drawBitmap(bitmap4, f109, i14 - ((int) ((bitmap4.getHeight() - roundHeight) / 2.0f)), ccVar.f15800q0);
                            } else {
                                i14 = i33;
                            }
                            f109 += f108;
                            i13 = i36 + 1;
                            iMin3 = iMin3;
                            i33 = i14;
                            f103 = f103;
                        }
                    }
                    f20 = f103;
                    if (!z17) {
                        ccVar.I.c();
                    }
                } else {
                    f102 = f102;
                    f20 = fE5;
                }
                path2.rewind();
                RectF rectF12 = AndroidUtilities.rectTmp;
                int i37 = ccVar.f15811u1;
                int i38 = ccVar.f15809t1;
                float f110 = i37 + i38;
                float f111 = ccVar.F;
                float f112 = ccVar.D;
                float f113 = f111 * f112;
                float f114 = ccVar.f15778f;
                float f115 = f113 - f114;
                float f116 = ccVar.E;
                float f117 = j13;
                float f118 = (f115 + f116) / f117;
                float f119 = ccVar.f15801q1;
                float f120 = (1.0f - f20) * i38;
                float f121 = (((f118 * f119) + f110) - (f111 <= 0.0f ? i38 : 0)) - f120;
                float f122 = rectF11.top;
                float f123 = ccVar.G;
                float f124 = (((((f112 * f123) - f114) + f116) / f117) * f119) + f110;
                if (f123 < 1.0f) {
                    i38 = 0;
                }
                rectF12.set(f121, f122, f124 + i38 + f120, rectF11.bottom);
                path2.addRoundRect(rectF12, ccVar.f15799p1, Path.Direction.CW);
                canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f40 = f102;
            } else {
                f19 = f19;
                f20 = fE5;
            }
            float fE6 = ccVar.f15765a0.e(ccVar.J);
            float fE7 = ccVar.f15768b0.e(ccVar.J && ccVar.L);
            float audioHeight = ccVar.getAudioHeight() * fE6;
            float f125 = ((ccVar.h == null && !ccVar.A && arrayList.isEmpty()) ? 1.0f : fE7) * fE6;
            if (fE6 > 0.0f) {
                float f126 = ccVar.M;
                float f127 = ccVar.O;
                float f128 = ccVar.N;
                f16 = (((f127 * f128) + f126) * f125) + f16;
                fX = (((ccVar.P * f128) + f126) * f125) + fX;
                Paint paintC3 = ccVar.f15785i0.c(fE6);
                canvas2.save();
                if (ccVar.h == null && !ccVar.A && arrayList.isEmpty()) {
                    float f129 = ccVar.f15811u1 + ccVar.f15809t1;
                    long j21 = ccVar.M - ccVar.f15778f;
                    float f130 = j21;
                    float f131 = j13;
                    float f132 = ccVar.f15801q1;
                    float f133 = ((f130 / f131) * f132) + f129;
                    f27 = f125;
                    fY = s3.c.c(j21 + ccVar.N, f131, f132, f129);
                    fLerp2 = f133;
                } else {
                    f27 = f125;
                    float f134 = j13;
                    fLerp2 = ((((AndroidUtilities.lerp(ccVar.O, 0.0f, fE7) * ccVar.N) + (ccVar.M - ccVar.f15778f)) / f134) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1;
                    fY = ccVar.f15811u1 + ccVar.f15809t1 + (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(ccVar.P, 1.0f, fE7), ccVar.N, ccVar.M - ccVar.f15778f, f134) * ccVar.f15801q1);
                }
                float f135 = fY;
                float f136 = ccVar.f15809t1;
                rectF5.set(fLerp2 - f136, f40 - audioHeight, f135 + f136, f40);
                f17 = (rectF5.top * f27) + f17;
                float f137 = (rectF5.bottom * f27) + f15;
                ccVar.C0.rewind();
                ccVar.C0.addRoundRect(rectF5, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(ccVar.C0);
                if (z9Var != null && z9Var.c()) {
                    daVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(fE6, 855638016));
                } else if (paintC3 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(fE6, 1073741824));
                } else {
                    canvas2.drawRect(rectF5, paintC3);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(fE6, 855638016));
                }
                if (ccVar.T == null || z9Var == null || !z9Var.c()) {
                    f28 = fE7;
                    rectF2 = rectF5;
                    if (ccVar.T != null && paintC3 != null) {
                        Paint paintC4 = ccVar.f15787j0.c(fE6 * f10);
                        if (paintC4 == null) {
                            paintC4 = ccVar.D0;
                            paintC4.setAlpha((int) (64.0f * fE6));
                        }
                        float fD2 = ccVar.f15771c0.d(ccVar.T.f16958e, !ccVar.Q);
                        vb vbVar = ccVar.T;
                        ccVar.Q = vbVar.f16957c > 0;
                        long j22 = j13;
                        ccVar.E0.b((((ccVar.M - ccVar.f15778f) / j13) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1, fLerp2, f135, f28, j22, audioHeight, fD2, rectF2.bottom, vbVar);
                        f21 = f28;
                        j11 = j22;
                        canvas2.drawPath(ccVar.E0, paintC4);
                    }
                    if (f21 < 1.0f) {
                        int i39 = ccVar.f15811u1;
                        float f138 = ccVar.f15809t1 + i39;
                        float f139 = ccVar.M - ccVar.f15778f;
                        float f140 = ccVar.O;
                        float f141 = ccVar.N;
                        float f142 = j11;
                        float f143 = ccVar.f15801q1;
                        float f144 = ((((f140 * f141) + f139) / f142) * f143) + f138;
                        float f145 = ((((ccVar.P * f141) + f139) / f142) * f143) + f138;
                        float fMin2 = (Math.min(ccVar.f15804r1 - ccVar.f15811u1, f145) + Math.max(i39, f144)) / 2.0f;
                        fCenterY = rectF2.centerY();
                        fMax3 = Math.max(0.0f, (Math.min(ccVar.f15804r1 - ccVar.f15811u1, f145) - Math.max(ccVar.f15811u1, f144)) - AndroidUtilities.dp(24.0f));
                        float fDpf5 = AndroidUtilities.dpf2(13.0f);
                        if (ccVar.I0 == null || ccVar.M0 != null) {
                            f29 = 13.0f;
                            fDpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + ccVar.J0 + ccVar.N0;
                        } else {
                            fDpf2 = 0.0f;
                            f29 = 13.0f;
                        }
                        f30 = fDpf5 + fDpf2;
                        if (f30 < fMax3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float fMin3 = fMin2 - (Math.min(f30, fMax3) / 2.0f);
                        ccVar.G0.setBounds((int) fMin3, (int) (fCenterY - (AndroidUtilities.dp(f29) / 2.0f)), (int) (AndroidUtilities.dp(f29) + fMin3), (int) ((AndroidUtilities.dp(f29) / 2.0f) + fCenterY));
                        f31 = 1.0f - f21;
                        f32 = f31 * 255.0f;
                        ccVar.G0.setAlpha((int) f32);
                        ccVar.G0.draw(canvas2);
                        fDpf3 = AndroidUtilities.dpf2(16.11f) + fMin3;
                        fMax2 = fE6;
                        d = 0.0d;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, ccVar.f15804r1, ccVar.f15807s1, 255, 31);
                        fMin = Math.min(f145, ccVar.f15804r1) - AndroidUtilities.dp(12.0f);
                        canvas2.clipRect(fDpf3, 0.0f, fMin, ccVar.f15807s1);
                        if (ccVar.I0 != null) {
                            canvas2.save();
                            canvas2.translate(fDpf3 - ccVar.K0, fCenterY - (ccVar.I0.getHeight() / 2.0f));
                            ccVar.H0.setAlpha((int) (f32 * fMax2));
                            ccVar.I0.draw(canvas2);
                            canvas2.restore();
                            fDpf4 = ccVar.J0 + fDpf3;
                        } else {
                            fDpf4 = fDpf3;
                        }
                        if (ccVar.I0 != null && ccVar.M0 != null) {
                            float fDpf6 = AndroidUtilities.dpf2(3.66f) + fDpf4;
                            int alpha = ccVar.F0.getAlpha();
                            ccVar.F0.setAlpha((int) (alpha * f31));
                            canvas2.drawCircle(AndroidUtilities.dp(1.0f) + fDpf6, fCenterY, AndroidUtilities.dp(1.0f), ccVar.F0);
                            ccVar.F0.setAlpha(alpha);
                            fDpf4 = AndroidUtilities.dpf2(2.0f) + fDpf6 + AndroidUtilities.dpf2(4.0f);
                        }
                        if (ccVar.M0 != null) {
                            canvas2.save();
                            canvas2.translate(fDpf4 - ccVar.O0, fCenterY - (ccVar.M0.getHeight() / 2.0f));
                            ccVar.L0.setAlpha((int) (f32 * fMax2));
                            ccVar.M0.draw(canvas2);
                            canvas2.restore();
                        }
                        if (!z11) {
                            ccVar.Q0.reset();
                            ccVar.Q0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                            ccVar.Q0.postTranslate(fMin - AndroidUtilities.dp(8.0f), 0.0f);
                            ccVar.P0.setLocalMatrix(ccVar.Q0);
                            canvas2.drawRect(fMin - AndroidUtilities.dp(8.0f), rectF2.top, fMin, rectF2.bottom, ccVar.R0);
                        }
                        canvas.restore();
                    } else {
                        fMax2 = fE6;
                        d = 0.0d;
                    }
                    canvas.restore();
                    f22 = f137;
                } else {
                    float fD3 = ccVar.f15771c0.d(ccVar.T.f16958e, !ccVar.Q);
                    vb vbVar2 = ccVar.T;
                    ccVar.Q = vbVar2.f16957c > 0;
                    rectF2 = rectF5;
                    f28 = fE7;
                    ccVar.E0.b((((ccVar.M - ccVar.f15778f) / j13) * ccVar.f15801q1) + ccVar.f15811u1 + ccVar.f15809t1, fLerp2, f135, f28, j13, audioHeight, fD3, rectF2.bottom, vbVar2);
                    canvas2.saveLayerAlpha(rectF2, 102, 31);
                    canvas2.clipPath(ccVar.E0);
                    ccVar.f15787j0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
                f21 = f28;
                if (f21 < 1.0f) {
                    int i310 = ccVar.f15811u1;
                    float f1310 = ccVar.f15809t1 + i310;
                    float f1311 = ccVar.M - ccVar.f15778f;
                    float f146 = ccVar.O;
                    float f147 = ccVar.N;
                    float f148 = j11;
                    float f149 = ccVar.f15801q1;
                    float f1410 = ((((f146 * f147) + f1311) / f148) * f149) + f1310;
                    float f1411 = ((((ccVar.P * f147) + f1311) / f148) * f149) + f1310;
                    float fMin4 = (Math.min(ccVar.f15804r1 - ccVar.f15811u1, f1411) + Math.max(i310, f1410)) / 2.0f;
                    fCenterY = rectF2.centerY();
                    fMax3 = Math.max(0.0f, (Math.min(ccVar.f15804r1 - ccVar.f15811u1, f1411) - Math.max(ccVar.f15811u1, f1410)) - AndroidUtilities.dp(24.0f));
                    float fDpf7 = AndroidUtilities.dpf2(13.0f);
                    if (ccVar.I0 == null) {
                        f29 = 13.0f;
                        fDpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + ccVar.J0 + ccVar.N0;
                    } else {
                        f29 = 13.0f;
                        fDpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + ccVar.J0 + ccVar.N0;
                    }
                    f30 = fDpf7 + fDpf2;
                    if (f30 < fMax3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    float fMin5 = fMin4 - (Math.min(f30, fMax3) / 2.0f);
                    ccVar.G0.setBounds((int) fMin5, (int) (fCenterY - (AndroidUtilities.dp(f29) / 2.0f)), (int) (AndroidUtilities.dp(f29) + fMin5), (int) ((AndroidUtilities.dp(f29) / 2.0f) + fCenterY));
                    f31 = 1.0f - f21;
                    f32 = f31 * 255.0f;
                    ccVar.G0.setAlpha((int) f32);
                    ccVar.G0.draw(canvas2);
                    fDpf3 = AndroidUtilities.dpf2(16.11f) + fMin5;
                    fMax2 = fE6;
                    d = 0.0d;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, ccVar.f15804r1, ccVar.f15807s1, 255, 31);
                    fMin = Math.min(f1411, ccVar.f15804r1) - AndroidUtilities.dp(12.0f);
                    canvas2.clipRect(fDpf3, 0.0f, fMin, ccVar.f15807s1);
                    if (ccVar.I0 != null) {
                        canvas2.save();
                        canvas2.translate(fDpf3 - ccVar.K0, fCenterY - (ccVar.I0.getHeight() / 2.0f));
                        ccVar.H0.setAlpha((int) (f32 * fMax2));
                        ccVar.I0.draw(canvas2);
                        canvas2.restore();
                        fDpf4 = ccVar.J0 + fDpf3;
                    } else {
                        fDpf4 = fDpf3;
                    }
                    if (ccVar.I0 != null) {
                        float fDpf8 = AndroidUtilities.dpf2(3.66f) + fDpf4;
                        int alpha2 = ccVar.F0.getAlpha();
                        ccVar.F0.setAlpha((int) (alpha2 * f31));
                        canvas2.drawCircle(AndroidUtilities.dp(1.0f) + fDpf8, fCenterY, AndroidUtilities.dp(1.0f), ccVar.F0);
                        ccVar.F0.setAlpha(alpha2);
                        fDpf4 = AndroidUtilities.dpf2(2.0f) + fDpf8 + AndroidUtilities.dpf2(4.0f);
                    }
                    if (ccVar.M0 != null) {
                        canvas2.save();
                        canvas2.translate(fDpf4 - ccVar.O0, fCenterY - (ccVar.M0.getHeight() / 2.0f));
                        ccVar.L0.setAlpha((int) (f32 * fMax2));
                        ccVar.M0.draw(canvas2);
                        canvas2.restore();
                    }
                    if (!z11) {
                        ccVar.Q0.reset();
                        ccVar.Q0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                        ccVar.Q0.postTranslate(fMin - AndroidUtilities.dp(8.0f), 0.0f);
                        ccVar.P0.setLocalMatrix(ccVar.Q0);
                        canvas2.drawRect(fMin - AndroidUtilities.dp(8.0f), rectF2.top, fMin, rectF2.bottom, ccVar.R0);
                    }
                    canvas.restore();
                } else {
                    fMax2 = fE6;
                    d = 0.0d;
                }
                canvas.restore();
                f22 = f137;
            } else {
                f21 = fE7;
                fMax2 = fE6;
                float f150 = f15;
                paint = paint;
                fE2 = fE2;
                f13 = f13;
                d = 0.0d;
                j11 = j13;
                f22 = f150;
            }
            float f151 = f17;
            float f152 = ccVar.f15811u1 + ccVar.f15809t1;
            float f153 = ccVar.f15778f;
            float f154 = j11;
            float f155 = ccVar.f15801q1;
            float f156 = (((f16 - f153) / f154) * f155) + f152;
            float f157 = (((fX - f153) / f154) * f155) + f152;
            if (!arrayList.isEmpty()) {
                f23 = fMax2;
                fMax2 = f19;
            } else if (ccVar.J && ccVar.h == null) {
                f23 = fMax2;
            } else {
                float f158 = fMax2;
                fMax2 = Math.max(f13, fE4);
                f23 = f158;
            }
            if (f23 > d || fE4 > d || f13 > d || f19 > d) {
                if (ccVar.h == null && !ccVar.A && arrayList.isEmpty()) {
                    f24 = f21;
                    fLerp = f23 * AndroidUtilities.lerp(0.6f, 1.0f, f24);
                } else {
                    f24 = f21;
                    fLerp = 1.0f;
                }
                Paint paint4 = paint;
                ccVar.e(canvas, paint4, f151, f22, f156, f157, fLerp * fMax2);
                xb xbVar8 = ccVar.h;
                if (xbVar8 != null && ((ccVar.J || ccVar.A) && (f24 > 0.0f || f20 > 0.0f))) {
                    float f159 = ccVar.f15807s1 - ccVar.f15813v1;
                    float f160 = ccVar.f15809t1 + ccVar.f15811u1;
                    float f161 = xbVar8.f17061g;
                    float f162 = xbVar8.f17059e;
                    float f163 = ccVar.f15778f;
                    float f164 = ccVar.f15801q1;
                    float f165 = ((((xbVar8.h * f162) - f163) / f154) * f164) + f160;
                    canvas3 = canvas;
                    ccVar.e(canvas3, paint4, f159 - f18, f159, ((((f161 * f162) - f163) / f154) * f164) + f160, f165, 0.8f);
                } else if (ccVar.v == null || arrayList.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    xb xbVar9 = ccVar.v;
                    RectF rectF13 = xbVar9.f17063j;
                    float f166 = rectF13.top;
                    float f167 = rectF13.bottom;
                    float f168 = ccVar.f15809t1 + ccVar.f15811u1;
                    float f169 = xbVar9.f17060f;
                    float f170 = xbVar9.f17061g;
                    float f171 = xbVar9.f17059e;
                    float f172 = ccVar.f15778f;
                    float f173 = ccVar.f15801q1;
                    float f174 = (((((f170 * f171) + f169) - f172) / f154) * f173) + f168;
                    float f175 = (((((xbVar9.h * f171) + f169) - f172) / f154) * f173) + f168;
                    canvas3 = canvas;
                    ccVar.e(canvas3, paint4, f166, f167, f174, f175, 0.8f);
                }
                if (ccVar.U > 1 && (xbVar3 = ccVar.h) != null) {
                    float f176 = xbVar3.f17059e;
                    float f177 = xbVar3.h;
                    float f178 = xbVar3.f17061g;
                    long j23 = (long) ((f177 - f178) * f176);
                    if (j23 > 68999) {
                        float f179 = ccVar.f15811u1 + ccVar.f15809t1;
                        float f180 = ccVar.f15778f;
                        float f181 = ccVar.f15801q1;
                        float f182 = ((((f178 * f176) - f180) / f154) * f181) + f179;
                        float f183 = ((((f177 * f176) - f180) / f154) * f181) + f179;
                        canvas3.save();
                        float f184 = ccVar.f15807s1 - ccVar.f15813v1;
                        canvas3.clipRect(f182, f184 - f18, f183, f184);
                        ccVar.f15812v0.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, fE2) * 255.0f));
                        long j24 = 59000;
                        int iMin4 = (int) Math.min(ccVar.U - 1, j23 / 59000);
                        int i40 = 1;
                        while (i40 <= iMin4) {
                            long j25 = ((long) i40) * j24;
                            if (Math.min(j24, j23 - j25) < 1000) {
                                break;
                            }
                            float f185 = ccVar.f15811u1 + ccVar.f15809t1;
                            xb xbVar10 = ccVar.h;
                            float f186 = ((((((long) (xbVar10.f17059e * xbVar10.f17061g)) + j25) - ccVar.f15778f) / f154) * ccVar.f15801q1) + f185;
                            float f187 = (ccVar.f15807s1 - ccVar.f15813v1) - f18;
                            float fDp2 = AndroidUtilities.dp(1.0f) + f186;
                            float f188 = ccVar.f15807s1 - ccVar.f15813v1;
                            Paint paint5 = ccVar.f15812v0;
                            Canvas canvas4 = canvas3;
                            canvas4.drawRect(f186, f187, fDp2, f188, paint5);
                            canvas3 = canvas4;
                            StringBuilder sb2 = new StringBuilder("#");
                            i40++;
                            sb2.append(i40);
                            canvas3.drawText(sb2.toString(), f186 + AndroidUtilities.dp(2.0f), ((ccVar.f15807s1 - ccVar.f15813v1) - f18) + AndroidUtilities.dp(14.0f), ccVar.A0);
                            j24 = 59000;
                        }
                        canvas3.restore();
                    }
                }
                float fD4 = ccVar.X0.d(0.0f, false);
                float contentHeight = ((ccVar.f15807s1 - ccVar.getContentHeight()) + ccVar.f15813v1) - AndroidUtilities.dpf2(2.3f);
                float fDpf9 = AndroidUtilities.dpf2(4.3f) + (ccVar.f15807s1 - ccVar.f15813v1);
                if (fD4 > 0.0f) {
                    long j26 = ccVar.Y0;
                    if (j26 == -1) {
                        xb xbVar11 = ccVar.h;
                        if (xbVar11 != null) {
                            j26 = (long) (xbVar11.f17059e * xbVar11.h);
                        } else {
                            xb xbVar12 = ccVar.v;
                            if (xbVar12 != null) {
                                j26 = (long) ((xbVar12.h - xbVar12.f17061g) * xbVar12.f17059e);
                            } else {
                                if (ccVar.A) {
                                    f25 = ccVar.D;
                                    f26 = ccVar.G;
                                } else {
                                    f25 = ccVar.N;
                                    f26 = ccVar.P;
                                }
                                j26 = (long) (f25 * f26);
                            }
                        }
                    }
                    ccVar = this;
                    ccVar.d(canvas3, contentHeight, fDpf9, j26, fD4 * fMax2);
                } else {
                    ccVar = ccVar;
                }
                ccVar.d(canvas, contentHeight, fDpf9, ccVar.f15775e, (1.0f - fD4) * fMax2);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            j11 = j10;
        }
        if (ccVar.f15786i1) {
            float f189 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float fDp3 = (AndroidUtilities.dp(32.0f) / ccVar.f15801q1) * j11 * f189;
            float f190 = ccVar.f15788j1;
            long j27 = (long) (fDp3 * f190);
            if (ccVar.T0) {
                ccVar.f15788j1 = (f189 * 0.25f) + f190;
            }
            int i41 = ccVar.f15774d1;
            if (i41 == 4 && (xbVar2 = ccVar.h) != null) {
                float f191 = xbVar2.f17061g;
                long j28 = ccVar.f15778f;
                long j29 = xbVar2.f17059e;
                float f192 = j29;
                if (f191 < j28 / f192) {
                    i11 = -1;
                } else if (xbVar2.h > (j28 + j11) / f192) {
                    i11 = 1;
                } else {
                    ccVar.f15788j1 = 1.0f;
                    i11 = 0;
                }
                long j30 = ((long) i11) * j27;
                long jClamp = Utilities.clamp(j28 + j30, j29 - j11, 0L);
                ccVar.f15778f = jClamp;
                ccVar.f15775e += j30;
                xb xbVar13 = ccVar.h;
                float f193 = (jClamp - j28) / xbVar13.f17059e;
                if (f193 > 0.0f) {
                    f11 = 1.0f;
                    fMax = Math.min(1.0f - xbVar13.h, f193);
                } else {
                    f11 = 1.0f;
                    fMax = Math.max(0.0f - xbVar13.f17061g, f193);
                }
                xb xbVar14 = ccVar.h;
                xbVar14.f17061g = Utilities.clamp(xbVar14.f17061g + fMax, f11, 0.0f);
                xb xbVar15 = ccVar.h;
                xbVar15.h = Utilities.clamp(xbVar15.h + fMax, f11, 0.0f);
                wb wbVar = ccVar.f15764a;
                if (wbVar != null) {
                    wbVar.Z0(ccVar.h.f17061g, false);
                    ccVar.f15764a.X1(ccVar.h.h);
                }
                ccVar.invalidate();
            } else if (i41 == 8) {
                float f194 = ccVar.O;
                long j31 = ccVar.M;
                long j32 = -j31;
                float f195 = j32 + 100;
                long j33 = ccVar.N;
                float f196 = j33;
                if (f194 < f195 / f196) {
                    i10 = -1;
                } else if (ccVar.P >= ((j32 + j11) - 100) / f196) {
                    i10 = 1;
                } else {
                    ccVar.f15788j1 = 1.0f;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (ccVar.L && (xbVar = ccVar.h) != null) {
                        long j34 = j31 - (((long) i10) * j27);
                        float f197 = xbVar.h;
                        float f198 = xbVar.f17059e;
                        ccVar.M = Utilities.clamp(j34, (long) ((f197 * f198) - (f194 * f196)), (long) ((xbVar.f17061g * f198) - (ccVar.P * f196)));
                    } else if (ccVar.C && ccVar.A) {
                        long j35 = j31 - (((long) i10) * j27);
                        float f199 = ccVar.G;
                        float f200 = ccVar.D;
                        ccVar.M = Utilities.clamp(j35, (long) ((f199 * f200) - (f194 * f196)), (long) ((ccVar.F * f200) - (ccVar.P * f196)));
                    } else {
                        ccVar.M = Utilities.clamp(j31 - (((long) i10) * j27), 0L, -(j33 - Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration())));
                    }
                    float f201 = (-(ccVar.M - j31)) / ccVar.N;
                    float fMin6 = f201 > 0.0f ? Math.min(1.0f - ccVar.P, f201) : Math.max(0.0f - ccVar.O, f201);
                    if (ccVar.h == null) {
                        float f202 = ccVar.f15775e;
                        float f203 = ccVar.N;
                        ccVar.f15775e = (long) Utilities.clamp((fMin6 * f203) + f202, f203, 0.0f);
                    }
                    ccVar.O = Utilities.clamp(ccVar.O + fMin6, 1.0f, 0.0f);
                    ccVar.P = Utilities.clamp(ccVar.P + fMin6, 1.0f, 0.0f);
                    wb wbVar2 = ccVar.f15764a;
                    if (wbVar2 != null) {
                        wbVar2.C1(ccVar.O);
                        ccVar.f15764a.p1(ccVar.P);
                        ccVar.f15764a.P(ccVar.f15775e, false);
                    }
                    ccVar.invalidate();
                } else {
                    ccVar.f15788j1 = 1.0f;
                }
            } else {
                ccVar.f15788j1 = 1.0f;
            }
        } else {
            ccVar.f15788j1 = 1.0f;
        }
        int contentHeight2 = ccVar.getContentHeight();
        if (ccVar.f15770c != contentHeight2) {
            ccVar.f15770c = contentHeight2;
            Runnable runnable = ccVar.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(Canvas canvas, Paint paint, float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f12 - AndroidUtilities.dp(10.0f), f10, AndroidUtilities.dp(10.0f) + f13, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f15804r1, this.f15807s1, 255, 31);
        int i10 = (int) (255.0f * f14);
        Paint paint2 = this.f15812v0;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.inset(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), AndroidUtilities.dp(2.0f));
        boolean z10 = this.T0;
        Paint paint3 = this.f15815w0;
        if (z10) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(10.0f);
        Paint paint4 = this.f15817x0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(255);
        paint5.setAlpha(i10);
        float f15 = f10 + f11;
        float f16 = (f15 - fDp2) / 2.0f;
        float f17 = (f15 + fDp2) / 2.0f;
        rectF.set(org.telegram.messenger.y1.a(AndroidUtilities.dp(this.T0 ? 2.0f : 10.0f), fDp, 2.0f, f12), f16, f12 - ((AndroidUtilities.dp(this.T0 ? 2.0f : 10.0f) + fDp) / 2.0f), f17);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.T0) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(com.google.android.recaptcha.internal.a.A(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), fDp, 2.0f, f13), f16, i0.a.c(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), fDp, 2.0f, f13), f17);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return ((long) this.U) * 59000;
    }

    public final long g() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    public int getContentHeight() {
        float fDp = 0.0f;
        float videoHeight = this.f15813v1 + (this.h != null ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.f15805s.isEmpty() ? 0.0f : getCollageHeight() + AndroidUtilities.dp(4.0f)) + (this.A ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f);
        if (this.J) {
            fDp = AndroidUtilities.dp(4.0f) + getAudioHeight();
        }
        return (int) (videoHeight + fDp + this.f15813v1);
    }

    public int getMaxCount() {
        return this.U;
    }

    public long getMaxScrollDuration() {
        if (this.f15805s.isEmpty()) {
            return Math.max(120000L, (long) (f() * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f15813v1 + this.f15813v1, getContentHeight(), this.f15776e0.f34812c);
    }

    public final void h(float f10) {
        float f11;
        long j10;
        float f12;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        wb wbVar;
        long jClamp;
        xb xbVar = this.h;
        if (xbVar == null && !this.A) {
            long j16 = this.M;
            long jClamp2 = Utilities.clamp(j16 + ((long) f10), 0L, -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.M = jClamp2;
            float f13 = jClamp2 - j16;
            this.O = Utilities.clamp(this.O - (f13 / this.N), 1.0f, 0.0f);
            this.P = Utilities.clamp(this.P - (f13 / this.N), 1.0f, 0.0f);
            wb wbVar2 = this.f15764a;
            if (wbVar2 != null) {
                wbVar2.C1(this.O);
                this.f15764a.p1(this.P);
            }
        } else if (this.L) {
            if (xbVar != null) {
                f11 = xbVar.f17061g;
                j10 = xbVar.f17059e;
            } else {
                f11 = this.F;
                j10 = this.D;
            }
            float f14 = f11 * j10;
            if (xbVar != null) {
                f12 = xbVar.h;
                j11 = xbVar.f17059e;
            } else {
                f12 = this.G;
                j11 = this.D;
            }
            float f15 = f12 * j11;
            float f16 = xbVar != null ? (xbVar.h - xbVar.f17061g) * xbVar.f17059e : this.D * (this.G - this.F);
            float f17 = this.P;
            float f18 = this.N;
            long j17 = (long) (f15 - (f17 * f18));
            float f19 = this.O;
            long j18 = (long) (f14 - (f19 * f18));
            float fMin = Math.min(f17 - f19, f16 / f18);
            long j19 = this.M;
            long j20 = (long) f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                float fClamp = Utilities.clamp(((f15 - j19) - j20) / this.N, 1.0f, fMin);
                this.P = fClamp;
                float fClamp2 = Utilities.clamp(fClamp - fMin, 1.0f, 0.0f);
                this.O = fClamp2;
                float f20 = this.P;
                float f21 = this.N;
                long j22 = (long) (f15 - (f20 * f21));
                long j23 = (long) (f14 - (fClamp2 * f21));
                if (j22 < j23) {
                    j15 = j23;
                    j14 = j22;
                } else {
                    j14 = j23;
                    j15 = j22;
                }
                this.M = Utilities.clamp(this.M + j20, j15, j14);
                wb wbVar3 = this.f15764a;
                if (wbVar3 != null) {
                    wbVar3.C1(this.O);
                    this.f15764a.p1(this.P);
                }
            } else if (j21 < j18) {
                float fClamp3 = Utilities.clamp(((f14 - j19) - j20) / this.N, 1.0f - fMin, 0.0f);
                this.O = fClamp3;
                float fClamp4 = Utilities.clamp(fClamp3 + fMin, 1.0f, 0.0f);
                this.P = fClamp4;
                float f22 = this.N;
                long j24 = (long) (f15 - (fClamp4 * f22));
                long j25 = (long) (f14 - (this.O * f22));
                if (j24 < j25) {
                    j13 = j25;
                    j12 = j24;
                } else {
                    j12 = j25;
                    j13 = j24;
                }
                this.M = Utilities.clamp(this.M + j20, j13, j12);
                wb wbVar4 = this.f15764a;
                if (wbVar4 != null) {
                    wbVar4.C1(this.O);
                    this.f15764a.p1(this.P);
                }
            } else {
                this.M = j21;
            }
        } else {
            long j26 = this.M + ((long) f10);
            float baseDuration = getBaseDuration();
            float f23 = this.N;
            this.M = Utilities.clamp(j26, (long) (baseDuration - (this.P * f23)), (long) ((-this.O) * f23));
        }
        invalidate();
        wb wbVar5 = this.f15764a;
        if (wbVar5 != null) {
            wbVar5.j2(this.M + ((long) (this.O * this.N)));
        }
        boolean z10 = this.f15786i1;
        if (z10 || (wbVar = this.f15764a) == null) {
            if (z10 || this.f15795n1) {
                xb xbVar2 = this.h;
                if (xbVar2 != null) {
                    long j27 = this.M + ((long) (this.O * this.N));
                    float f24 = xbVar2.h;
                    float f25 = xbVar2.f17059e;
                    this.f15775e = Utilities.clamp(j27, (long) (f24 * f25), (long) (xbVar2.f17061g * f25));
                } else if (!this.A || xbVar2 == null) {
                    float f26 = this.O;
                    long j28 = this.N;
                    this.f15775e = Utilities.clamp((long) (f26 * j28), j28, 0L);
                } else {
                    long j29 = this.M + ((long) (this.O * this.N));
                    float f27 = this.G;
                    float f28 = xbVar2.f17059e;
                    this.f15775e = Utilities.clamp(j29, (long) (f27 * f28), (long) (this.F * f28));
                }
                wb wbVar6 = this.f15764a;
                if (wbVar6 != null) {
                    wbVar6.P(this.f15775e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.I0(true);
        xb xbVar3 = this.h;
        if (xbVar3 != null) {
            long j30 = this.M + ((long) (this.O * this.N));
            float f29 = xbVar3.h;
            float f30 = xbVar3.f17059e;
            jClamp = Utilities.clamp(j30, (long) (f29 * f30), (long) (xbVar3.f17061g * f30));
        } else if (this.A) {
            long j31 = this.M + ((long) (this.O * this.N));
            float f31 = this.G;
            float f32 = this.D;
            jClamp = Utilities.clamp(j31, (long) (f31 * f32), (long) (this.F * f32));
        } else {
            float f33 = this.O;
            long j32 = this.N;
            jClamp = Utilities.clamp((long) (f33 * j32), j32, 0L);
        }
        if (this.h != null && Math.abs(this.f15775e - jClamp) > 400) {
            this.Y0 = this.f15775e;
            this.X0.d(1.0f, true);
        }
        wb wbVar7 = this.f15764a;
        this.f15775e = jClamp;
        wbVar7.P(jClamp, false);
    }

    public final void i(xb xbVar, float f10) {
        wb wbVar;
        long jClamp;
        long j10;
        long j11;
        long j12;
        long j13;
        if (xbVar == null) {
            return;
        }
        xb xbVar2 = this.v;
        if (xbVar2 != xbVar && xbVar2 != null) {
            if (this.f15793n == this.f15805s.indexOf(xbVar)) {
                xb xbVar3 = this.v;
                float f11 = xbVar3.f17059e;
                float f12 = xbVar.h;
                float f13 = xbVar.f17059e;
                long j14 = (long) ((f11 * 1.0f) - (f12 * f13));
                float f14 = xbVar.f17061g;
                long j15 = (long) ((f11 * 0.0f) - (f14 * f13));
                float fMin = Math.min(f12 - f14, ((xbVar3.h - xbVar3.f17061g) * f11) / f13);
                long j16 = xbVar.f17060f;
                long j17 = (long) f10;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    xb xbVar4 = this.v;
                    float fClamp = Utilities.clamp((((xbVar4.h * xbVar4.f17059e) - j16) - j17) / xbVar.f17059e, 1.0f, fMin);
                    xbVar.h = fClamp;
                    float fClamp2 = Utilities.clamp(fClamp - fMin, 1.0f, 0.0f);
                    xbVar.f17061g = fClamp2;
                    xb xbVar5 = this.v;
                    float f15 = xbVar5.h;
                    float f16 = xbVar5.f17059e;
                    float f17 = xbVar.h;
                    float f18 = xbVar.f17059e;
                    long j19 = (long) ((f15 * f16) - (f17 * f18));
                    long j20 = (long) ((xbVar5.f17061g * f16) - (fClamp2 * f18));
                    if (j19 < j20) {
                        j13 = j20;
                        j12 = j19;
                    } else {
                        j12 = j20;
                        j13 = j19;
                    }
                    xbVar.f17060f = Utilities.clamp(xbVar.f17060f + j17, j13, j12);
                    wb wbVar2 = this.f15764a;
                    if (wbVar2 != null) {
                        wbVar2.n1(xbVar.f17061g, xbVar.f17056a);
                        this.f15764a.W1(xbVar.h, xbVar.f17056a);
                    }
                } else if (j18 < j15) {
                    xb xbVar6 = this.v;
                    float fClamp3 = Utilities.clamp((((xbVar6.f17061g * xbVar6.f17059e) - j16) - j17) / xbVar.f17059e, 1.0f - fMin, 0.0f);
                    xbVar.f17061g = fClamp3;
                    float fClamp4 = Utilities.clamp(fClamp3 + fMin, 1.0f, 0.0f);
                    xbVar.h = fClamp4;
                    xb xbVar7 = this.v;
                    float f19 = xbVar7.h;
                    float f20 = xbVar7.f17059e;
                    float f21 = xbVar.f17059e;
                    long j21 = (long) ((f19 * f20) - (fClamp4 * f21));
                    long j22 = (long) ((xbVar7.f17061g * f20) - (xbVar.f17061g * f21));
                    if (j21 < j22) {
                        j11 = j22;
                        j10 = j21;
                    } else {
                        j10 = j22;
                        j11 = j21;
                    }
                    xbVar.f17060f = Utilities.clamp(xbVar.f17060f + j17, j11, j10);
                    wb wbVar3 = this.f15764a;
                    if (wbVar3 != null) {
                        wbVar3.n1(xbVar.f17061g, xbVar.f17056a);
                        this.f15764a.W1(xbVar.h, xbVar.f17056a);
                    }
                } else {
                    xbVar.f17060f = j18;
                }
            } else {
                long j23 = xbVar.f17060f + ((long) f10);
                float baseDuration = getBaseDuration();
                float f22 = xbVar.f17059e;
                xbVar.f17060f = Utilities.clamp(j23, (long) (baseDuration - (xbVar.h * f22)), (long) ((-xbVar.f17061g) * f22));
            }
        }
        invalidate();
        wb wbVar4 = this.f15764a;
        if (wbVar4 != null) {
            wbVar4.g2(xbVar.f17056a, xbVar.f17060f);
        }
        boolean z10 = this.f15786i1;
        if (z10 || (wbVar = this.f15764a) == null) {
            if (z10 || this.f15795n1) {
                xb xbVar8 = this.v;
                if (xbVar8 == xbVar || xbVar8 == null) {
                    float f23 = xbVar.f17061g;
                    long j24 = xbVar.f17059e;
                    this.f15775e = Utilities.clamp((long) (f23 * j24), j24, 0L);
                } else {
                    long j25 = xbVar.f17060f + ((long) (xbVar.f17061g * xbVar.f17059e));
                    float f24 = xbVar8.h;
                    float f25 = xbVar8.f17059e;
                    this.f15775e = Utilities.clamp(j25, (long) (f24 * f25), (long) (xbVar8.f17061g * f25));
                }
                wb wbVar5 = this.f15764a;
                if (wbVar5 != null) {
                    wbVar5.P(this.f15775e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.I0(true);
        xb xbVar9 = this.v;
        if (xbVar9 == xbVar || xbVar9 == null) {
            float f26 = xbVar.f17061g;
            long j26 = xbVar.f17059e;
            jClamp = Utilities.clamp((long) (f26 * j26), j26, 0L);
        } else {
            long j27 = xbVar.f17060f + ((long) (xbVar.f17061g * xbVar.f17059e));
            float f27 = xbVar9.h;
            float f28 = xbVar9.f17059e;
            jClamp = Utilities.clamp(j27, (long) (f27 * f28), (long) (xbVar9.f17061g * f28));
        }
        xb xbVar10 = this.v;
        if (xbVar10 != xbVar && xbVar10 != null && Math.abs(this.f15775e - jClamp) > 400) {
            this.Y0 = this.f15775e;
            this.X0.d(1.0f, true);
        }
        wb wbVar6 = this.f15764a;
        this.f15775e = jClamp;
        wbVar6.P(jClamp, false);
    }

    public final void j(float f10) {
        long j10;
        long j11;
        long j12;
        long j13;
        wb wbVar;
        long jClamp;
        xb xbVar = this.h;
        if (xbVar == null) {
            long j14 = this.E;
            long jClamp2 = Utilities.clamp(j14 + ((long) f10), 0L, -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.E = jClamp2;
            float f11 = jClamp2 - j14;
            this.F = Utilities.clamp(this.F - (f11 / this.D), 1.0f, 0.0f);
            this.G = Utilities.clamp(this.G - (f11 / this.D), 1.0f, 0.0f);
            wb wbVar2 = this.f15764a;
            if (wbVar2 != null) {
                wbVar2.w0(this.F);
                this.f15764a.e2(this.G);
            }
        } else if (this.C) {
            float f12 = xbVar.h;
            float f13 = xbVar.f17059e;
            float f14 = this.G;
            float f15 = this.D;
            long j15 = (long) ((f12 * f13) - (f14 * f15));
            float f16 = xbVar.f17061g;
            float f17 = this.F;
            long j16 = (long) ((f16 * f13) - (f17 * f15));
            float fMin = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j17 = this.E;
            long j18 = (long) f10;
            long j19 = j17 + j18;
            if (j19 > j15) {
                xb xbVar2 = this.h;
                float fClamp = Utilities.clamp((((xbVar2.h * xbVar2.f17059e) - j17) - j18) / this.D, 1.0f, fMin);
                this.G = fClamp;
                float fClamp2 = Utilities.clamp(fClamp - fMin, 1.0f, 0.0f);
                this.F = fClamp2;
                xb xbVar3 = this.h;
                float f18 = xbVar3.h;
                float f19 = xbVar3.f17059e;
                float f20 = this.G;
                float f21 = this.D;
                long j20 = (long) ((f18 * f19) - (f20 * f21));
                long j21 = (long) ((xbVar3.f17061g * f19) - (fClamp2 * f21));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.E = Utilities.clamp(this.E + j18, j13, j12);
                wb wbVar3 = this.f15764a;
                if (wbVar3 != null) {
                    wbVar3.w0(this.F);
                    this.f15764a.e2(this.G);
                }
            } else if (j19 < j16) {
                xb xbVar4 = this.h;
                float fClamp3 = Utilities.clamp((((xbVar4.f17061g * xbVar4.f17059e) - j17) - j18) / this.D, 1.0f - fMin, 0.0f);
                this.F = fClamp3;
                float fClamp4 = Utilities.clamp(fClamp3 + fMin, 1.0f, 0.0f);
                this.G = fClamp4;
                xb xbVar5 = this.h;
                float f22 = xbVar5.h;
                float f23 = xbVar5.f17059e;
                float f24 = this.D;
                long j22 = (long) ((f22 * f23) - (fClamp4 * f24));
                long j23 = (long) ((xbVar5.f17061g * f23) - (this.F * f24));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.E = Utilities.clamp(this.E + j18, j11, j10);
                wb wbVar4 = this.f15764a;
                if (wbVar4 != null) {
                    wbVar4.w0(this.F);
                    this.f15764a.e2(this.G);
                }
            } else {
                this.E = j19;
            }
        } else {
            long j24 = this.E + ((long) f10);
            float baseDuration = getBaseDuration();
            float f25 = this.D;
            this.E = Utilities.clamp(j24, (long) (baseDuration - (this.G * f25)), (long) ((-this.F) * f25));
        }
        invalidate();
        wb wbVar5 = this.f15764a;
        if (wbVar5 != null) {
            wbVar5.i1(this.E + ((long) (this.F * this.D)));
        }
        boolean z10 = this.f15786i1;
        if (z10 || (wbVar = this.f15764a) == null) {
            if (z10 || this.f15795n1) {
                xb xbVar6 = this.h;
                if (xbVar6 != null) {
                    long j25 = this.E + ((long) (this.F * this.D));
                    float f26 = xbVar6.h;
                    float f27 = xbVar6.f17059e;
                    this.f15775e = Utilities.clamp(j25, (long) (f26 * f27), (long) (xbVar6.f17061g * f27));
                } else {
                    float f28 = this.F;
                    long j26 = this.D;
                    this.f15775e = Utilities.clamp((long) (f28 * j26), j26, 0L);
                }
                wb wbVar6 = this.f15764a;
                if (wbVar6 != null) {
                    wbVar6.P(this.f15775e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.I0(true);
        xb xbVar7 = this.h;
        if (xbVar7 != null) {
            long j27 = this.E + ((long) (this.F * this.D));
            float f29 = xbVar7.h;
            float f30 = xbVar7.f17059e;
            jClamp = Utilities.clamp(j27, (long) (f29 * f30), (long) (xbVar7.f17061g * f30));
        } else {
            float f31 = this.F;
            long j28 = this.D;
            jClamp = Utilities.clamp((long) (f31 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.f15775e - jClamp) > 400) {
            this.Y0 = this.f15775e;
            this.X0.d(1.0f, true);
        }
        wb wbVar7 = this.f15764a;
        this.f15775e = jClamp;
        wbVar7.P(jClamp, false);
    }

    public final void k() {
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        xb xbVar = this.h;
        float f10 = (xbVar.h + xbVar.f17061g) / 2.0f;
        long j10 = xbVar.f17059e;
        this.f15778f = Utilities.clamp((long) ((f10 * j10) - (jMin / 2.0f)), j10 - jMin, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        if (z10 && this.A) {
            this.C = true;
            this.L = false;
        } else {
            this.C = false;
            this.L = this.J && this.h == null;
        }
        invalidate();
    }

    public final boolean m(float f10, boolean z10) {
        long j10;
        xb xbVar = this.h;
        ArrayList arrayList = this.f15805s;
        if (xbVar == null && !this.J && arrayList.isEmpty()) {
            return false;
        }
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f11 = ((f10 - this.f15811u1) - this.f15809t1) / this.f15801q1;
        xb xbVar2 = this.v;
        if (xbVar2 != null) {
            j10 = (long) ((xbVar2.f17061g * xbVar2.f17059e) + xbVar2.f17060f);
        } else {
            j10 = 0;
        }
        float f12 = f11 * jMin;
        if (xbVar2 == null) {
            j10 = this.h == null ? this.M : 0L;
        }
        long jClamp = (long) Utilities.clamp((f12 - j10) + this.f15778f, getBaseDuration(), 0.0f);
        xb xbVar3 = this.h;
        if (xbVar3 != null) {
            float f13 = jClamp / xbVar3.f17059e;
            if (f13 < xbVar3.f17061g || f13 > xbVar3.h) {
                return false;
            }
        }
        xb xbVar4 = this.v;
        if (xbVar4 != null && (jClamp < 0 || jClamp >= ((long) ((xbVar4.h - xbVar4.f17061g) * xbVar4.f17059e)))) {
            return false;
        }
        if (this.J && xbVar3 == null && arrayList.isEmpty()) {
            float f14 = jClamp / this.N;
            if (f14 < this.O || f14 > this.P) {
                return false;
            }
        }
        this.f15775e = jClamp;
        invalidate();
        wb wbVar = this.f15764a;
        if (wbVar != null) {
            wbVar.P(jClamp, z10);
        }
        cg.b2 b2Var = this.Z0;
        if (b2Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b2Var);
            this.Z0 = null;
        }
        if (!z10) {
            return true;
        }
        cg.b2 b2Var2 = new cg.b2(this, jClamp, 11);
        this.Z0 = b2Var2;
        AndroidUtilities.runOnUIThread(b2Var2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f10, float f11, float f12, boolean z10) {
        boolean z11;
        boolean z12;
        xb xbVar;
        if (TextUtils.equals(this.B, str)) {
            return;
        }
        ac acVar = this.I;
        if (acVar != null) {
            acVar.b();
            this.I = null;
        }
        long j12 = this.D;
        if (str != null) {
            this.B = str;
            this.D = j10;
            this.E = j11 - ((long) (j10 * f10));
            this.F = f10;
            this.G = f11;
            this.H = f12;
            if (getMeasuredWidth() <= 0 || this.I != null || ((xbVar = this.h) != null && xbVar.f17059e < 1)) {
                z12 = false;
                z11 = true;
            } else {
                String str2 = this.B;
                int i10 = this.f15804r1;
                int i11 = this.f15811u1;
                int i12 = (i10 - i11) - i11;
                int iDp = AndroidUtilities.dp(38.0f);
                long j13 = this.D;
                Long lValueOf = j13 > 2 ? Long.valueOf(j13) : null;
                xb xbVar2 = this.h;
                z12 = false;
                z11 = true;
                this.I = new ac(this, false, str2, i12, iDp, lValueOf, xbVar2 != null ? xbVar2.f17059e : getMaxScrollDuration(), -1L, -1L, new tb(this, 0));
            }
            if (this.h == null) {
                this.L = z12;
                this.C = z11;
            }
        } else {
            j12 = j12;
            z11 = true;
            this.B = null;
            this.D = 1L;
            this.C = false;
        }
        this.A = this.B != null;
        if (j12 != j10 && this.h == null && this.T != null) {
            this.S = z11;
            p();
        }
        if (this.J && this.A && this.h == null) {
            this.O = 0.0f;
            this.P = Utilities.clamp(j10 / this.N, 1.0f, 0.0f);
        }
        if (!z10) {
            this.W.f(this.C, z11);
            this.f15768b0.f(this.L, z11);
            this.V.f(this.A, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f10) {
        xb xbVar = this.h;
        if (TextUtils.equals(xbVar == null ? null : xbVar.d, str)) {
            return;
        }
        xb xbVar2 = this.h;
        if (xbVar2 != null) {
            ac acVar = xbVar2.f17058c;
            if (acVar != null) {
                acVar.b();
                this.h.f17058c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f15778f = 0L;
            xb xbVar3 = new xb(this);
            this.h = xbVar3;
            xbVar3.f17057b = z10;
            xbVar3.d = str;
            xbVar3.f17059e = j10;
            xbVar3.f17062i = f10;
            xb.a(xbVar3, false);
        } else {
            this.h = null;
            this.f15778f = 0L;
        }
        if (!this.A) {
            this.C = false;
        }
        this.f15775e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.H0.setTextSize(AndroidUtilities.dp(12.0f));
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        int iDp = AndroidUtilities.dp(12.0f);
        this.f15811u1 = iDp;
        int iDp2 = AndroidUtilities.dp(5.0f);
        this.f15813v1 = iDp2;
        setPadding(iDp, iDp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f15804r1 = size;
        int iDp3 = AndroidUtilities.dp(388);
        this.f15807s1 = iDp3;
        setMeasuredDimension(size, iDp3);
        int iDp4 = AndroidUtilities.dp(10.0f);
        this.f15809t1 = iDp4;
        this.f15801q1 = (this.f15804r1 - (iDp4 * 2)) - (this.f15811u1 * 2);
        xb xbVar = this.h;
        if (xbVar != null && xbVar.d != null && xbVar.f17058c == null) {
            xb.a(xbVar, false);
        }
        ArrayList arrayList = this.f15805s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                xb xbVar2 = (xb) obj;
                if (xbVar2.d != null && xbVar2.f17058c == null) {
                    xb.a(xbVar2, false);
                    xb.b(xbVar2);
                }
            }
        }
        if (this.K == null || this.T != null) {
            return;
        }
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        wb wbVar;
        VelocityTracker velocityTracker;
        long j10;
        boolean z12;
        long j11;
        long j12;
        long j13;
        float f10;
        VelocityTracker velocityTracker2;
        long j14;
        long j15;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        long j16;
        Runnable runnable;
        VelocityTracker velocityTracker5;
        float fMin;
        float fMax;
        float fMin2;
        boolean z13;
        float fMax2;
        boolean z14;
        wb wbVar2;
        int i10;
        float f11;
        float f12;
        boolean z15;
        float f13;
        float fClamp;
        wb wbVar3;
        wb wbVar4;
        int i11;
        float f14;
        float f15;
        xb xbVar = this.h;
        ArrayList arrayList = this.f15805s;
        if (xbVar != null || !arrayList.isEmpty() || this.J || this.A) {
            float timelineHeight = this.f15807s1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                bm0 bm0Var = this.S0;
                cg.k0 k0Var = this.U0;
                if (action == 0) {
                    cg.b2 b2Var = this.Z0;
                    if (b2Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(b2Var);
                        this.Z0 = null;
                    }
                    bm0Var.a();
                    this.f15777e1 = -1;
                    this.f15774d1 = c(motionEvent);
                    this.f15780f1 = -1;
                    this.f15782g1 = -1;
                    int roundHeight = this.f15807s1 - this.f15813v1;
                    if (!this.f15779f0) {
                        if (this.f15789k0.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f15780f1 = 10;
                            this.f15774d1 = -1;
                        }
                    }
                    if (this.f15780f1 != -1 || this.h == null) {
                        f14 = 4.0f;
                    } else {
                        float f16 = roundHeight;
                        if (motionEvent.getY() < f16) {
                            f14 = 4.0f;
                            if (motionEvent.getY() > (f16 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                                this.f15780f1 = 0;
                            }
                        } else {
                            f14 = 4.0f;
                        }
                        roundHeight = (int) (f16 - (getVideoHeight() + AndroidUtilities.dp(f14)));
                    }
                    if (this.f15780f1 == -1 && !arrayList.isEmpty()) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList.size()) {
                                f15 = 2.0f;
                                break;
                            }
                            f15 = 2.0f;
                            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((xb) arrayList.get(i12)).f17064k.f34812c);
                            float f17 = roundHeight;
                            if (motionEvent.getY() < f17 && motionEvent.getY() > (f17 - fLerp) - AndroidUtilities.dp(2.0f)) {
                                this.f15780f1 = 3;
                                this.f15782g1 = i12;
                                break;
                            }
                            roundHeight = (int) (f17 - (fLerp + AndroidUtilities.dp(f14)));
                            i12++;
                        }
                    } else {
                        f15 = 2.0f;
                        break;
                    }
                    if (this.f15780f1 == -1 && this.A) {
                        float f18 = roundHeight;
                        if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - getRoundHeight()) - AndroidUtilities.dp(f15)) {
                            this.f15780f1 = 1;
                        }
                        roundHeight = (int) (f18 - (getRoundHeight() + AndroidUtilities.dp(f14)));
                    }
                    if (this.f15780f1 == -1 && this.J) {
                        float f19 = roundHeight;
                        if (motionEvent.getY() < f19 && motionEvent.getY() > (f19 - getAudioHeight()) - AndroidUtilities.dp(f15)) {
                            this.f15780f1 = 2;
                        }
                        getAudioHeight();
                        AndroidUtilities.dp(f14);
                    }
                    this.f15769b1 = System.currentTimeMillis();
                    int i13 = this.f15774d1;
                    this.f15784h1 = i13 == 0 || i13 == -1 || i13 == 1;
                    this.f15790k1 = false;
                    if (i13 == 1 || i13 == 5 || i13 == 8) {
                        this.l1 = VelocityTracker.obtain();
                    } else {
                        VelocityTracker velocityTracker6 = this.l1;
                        if (velocityTracker6 != null) {
                            velocityTracker6.recycle();
                            this.l1 = null;
                        }
                    }
                    this.f15788j1 = 1.0f;
                    this.f15786i1 = false;
                    this.f15772c1 = motionEvent.getX();
                    if (!this.T0) {
                        AndroidUtilities.cancelRunOnUIThread(k0Var);
                        AndroidUtilities.runOnUIThread(k0Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x8 = motionEvent.getX() - this.f15772c1;
                    if (this.f15779f0 && (this.f15786i1 || Math.abs(x8) > AndroidUtilities.touchSlop)) {
                        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
                        xb xbVar2 = this.h;
                        if (xbVar2 != null && this.f15774d1 == 1) {
                            this.f15778f = (long) Utilities.clamp(this.f15778f - ((x8 / this.f15801q1) * jMin), xbVar2.f17059e - jMin, 0.0f);
                            invalidate();
                            if (!this.f15786i1) {
                                this.f15788j1 = 1.0f;
                            }
                            this.f15786i1 = true;
                            this.f15784h1 = false;
                        } else if (xbVar2 == null || !((i11 = this.f15774d1) == 2 || i11 == 3 || i11 == 4)) {
                            int i14 = this.f15774d1;
                            if (i14 == 6 || i14 == 7 || i14 == 8) {
                                float f20 = (jMin / this.N) * (x8 / this.f15801q1);
                                if (i14 == 6) {
                                    float fG = this.P - (g() / this.N);
                                    float fMax3 = Math.max(0L, this.f15778f - this.M);
                                    float f21 = this.N;
                                    float f22 = fMax3 / f21;
                                    xb xbVar3 = this.h;
                                    if (xbVar3 != null) {
                                        fMax = Math.max(f22, (((xbVar3.f17061g * xbVar3.f17059e) + this.f15778f) - this.M) / f21);
                                    } else {
                                        xb xbVar4 = this.v;
                                        if (xbVar4 != null) {
                                            fMax = Math.max(f22, (((xbVar4.f17061g * xbVar4.f17059e) + this.f15778f) - this.M) / f21);
                                        } else if (this.A) {
                                            fMax = Math.max(f22, (((this.F * this.D) + this.f15778f) - this.M) / f21);
                                        } else {
                                            fMax = Math.max(f22, this.P - (f() / this.N));
                                            if (!this.f15790k1 && f20 < 0.0f && this.O <= this.P - (f() / this.N)) {
                                                this.f15774d1 = 8;
                                            }
                                        }
                                    }
                                    float f23 = this.O;
                                    float fClamp2 = Utilities.clamp(f23 + f20, fG, fMax);
                                    this.O = fClamp2;
                                    if (Math.abs(f23 - fClamp2) > 0.01f) {
                                        this.f15790k1 = true;
                                    }
                                    wb wbVar5 = this.f15764a;
                                    if (wbVar5 != null) {
                                        wbVar5.j2(this.M + ((long) (this.O * this.N)));
                                    }
                                    wb wbVar6 = this.f15764a;
                                    if (wbVar6 != null) {
                                        wbVar6.C1(this.O);
                                    }
                                } else if (i14 == 7) {
                                    float fMin3 = Math.min(1.0f, Math.max(0L, (this.f15778f - this.M) + jMin) / this.N);
                                    float f24 = this.O;
                                    float fG2 = g();
                                    float f25 = this.N;
                                    float f26 = (fG2 / f25) + f24;
                                    xb xbVar5 = this.h;
                                    if (xbVar5 != null) {
                                        fMin = Math.min(fMin3, (((xbVar5.h * xbVar5.f17059e) + this.f15778f) - this.M) / f25);
                                    } else {
                                        xb xbVar6 = this.v;
                                        if (xbVar6 != null) {
                                            fMin = Math.min(fMin3, (((xbVar6.h * xbVar6.f17059e) + this.f15778f) - this.M) / f25);
                                        } else if (this.A) {
                                            fMin = Math.min(fMin3, (((this.G * this.D) + this.f15778f) - this.M) / f25);
                                        } else {
                                            fMin = Math.min(fMin3, (f() / this.N) + this.O);
                                            if (!this.f15790k1 && f20 > 0.0f) {
                                                if (this.P >= (f() / this.N) + this.O) {
                                                    this.f15774d1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f27 = this.P;
                                    float fClamp3 = Utilities.clamp(f27 + f20, fMin, f26);
                                    this.P = fClamp3;
                                    if (Math.abs(f27 - fClamp3) > 0.01f) {
                                        this.f15790k1 = true;
                                    }
                                    wb wbVar7 = this.f15764a;
                                    if (wbVar7 != null) {
                                        wbVar7.p1(this.P);
                                    }
                                }
                                if (this.f15774d1 == 8) {
                                    float fMin4 = f20 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f15778f - this.M) + jMin) / this.N) - this.P), f20) : Math.max(Math.min(0.0f, (Math.max(0L, this.f15778f - this.M) / this.N) - this.O), f20);
                                    float f28 = this.O + fMin4;
                                    this.O = f28;
                                    this.P += fMin4;
                                    wb wbVar8 = this.f15764a;
                                    if (wbVar8 != null) {
                                        wbVar8.C1(f28);
                                        this.f15764a.j2(this.M + ((long) (this.O * this.N)));
                                        this.f15764a.p1(this.P);
                                    }
                                    wb wbVar9 = this.f15764a;
                                    if (wbVar9 != null) {
                                        wbVar9.I0(true);
                                    }
                                }
                                if (this.h == null && !this.A) {
                                    this.f15775e = (long) (this.O * this.N);
                                    wb wbVar10 = this.f15764a;
                                    if (wbVar10 != null) {
                                        wbVar10.I0(true);
                                        this.f15764a.P(this.f15775e, false);
                                    }
                                }
                                invalidate();
                                if (!this.f15786i1) {
                                    this.f15788j1 = 1.0f;
                                }
                                this.f15786i1 = true;
                                this.f15784h1 = false;
                            } else if (i14 == 10 || i14 == 11 || i14 == 12) {
                                float f29 = (jMin / this.D) * (x8 / this.f15801q1);
                                if (i14 == 10) {
                                    float fG3 = this.G - (g() / this.D);
                                    float fMax4 = Math.max(0L, this.f15778f - this.E);
                                    float f30 = this.D;
                                    float f31 = fMax4 / f30;
                                    xb xbVar7 = this.h;
                                    if (xbVar7 != null) {
                                        fMax2 = Math.max(f31, (((xbVar7.f17061g * xbVar7.f17059e) + this.f15778f) - this.E) / f30);
                                    } else {
                                        xb xbVar8 = this.v;
                                        if (xbVar8 != null) {
                                            fMax2 = Math.max(f31, (((xbVar8.f17061g * xbVar8.f17059e) + this.f15778f) - this.E) / f30);
                                        } else {
                                            fMax2 = Math.max(f31, this.G - (f() / this.D));
                                            if (!this.f15790k1 && f29 < 0.0f && this.F <= this.G - (f() / this.D)) {
                                                this.f15774d1 = 8;
                                            }
                                        }
                                    }
                                    float f32 = this.F;
                                    float fClamp4 = Utilities.clamp(f32 + f29, fG3, fMax2);
                                    this.F = fClamp4;
                                    if (Math.abs(f32 - fClamp4) > 0.01f) {
                                        this.f15790k1 = true;
                                    }
                                    wb wbVar11 = this.f15764a;
                                    if (wbVar11 != null) {
                                        wbVar11.i1(this.E + ((long) (this.F * this.D)));
                                    }
                                    wb wbVar12 = this.f15764a;
                                    if (wbVar12 != null) {
                                        wbVar12.w0(this.F);
                                    }
                                } else if (i14 == 11) {
                                    float fMin5 = Math.min(1.0f, Math.max(0L, (this.f15778f - this.E) + jMin) / this.D);
                                    float f33 = this.F;
                                    float fG4 = g();
                                    float f34 = this.D;
                                    float f35 = (fG4 / f34) + f33;
                                    xb xbVar9 = this.h;
                                    if (xbVar9 != null) {
                                        fMin5 = Math.min(fMin5, (((xbVar9.h * xbVar9.f17059e) + this.f15778f) - this.E) / f34);
                                    }
                                    xb xbVar10 = this.v;
                                    if (xbVar10 != null) {
                                        fMin2 = Math.min(fMin5, (((xbVar10.h * xbVar10.f17059e) + this.f15778f) - this.E) / this.D);
                                    } else {
                                        fMin2 = Math.min(fMin5, (f() / this.D) + this.F);
                                        if (!this.f15790k1 && f29 > 0.0f) {
                                            if (this.G >= (f() / this.D) + this.F) {
                                                this.f15774d1 = 8;
                                            }
                                        }
                                    }
                                    float f36 = this.G;
                                    float fClamp5 = Utilities.clamp(f36 + f29, fMin2, f35);
                                    this.G = fClamp5;
                                    if (Math.abs(f36 - fClamp5) > 0.01f) {
                                        this.f15790k1 = true;
                                    }
                                    wb wbVar13 = this.f15764a;
                                    if (wbVar13 != null) {
                                        wbVar13.e2(this.G);
                                    }
                                }
                                if (this.f15774d1 == 12) {
                                    float fMin6 = f29 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f15778f - this.E) + jMin) / this.D) - this.G, f29) : Math.max((Math.max(0L, this.f15778f - this.E) / this.D) - this.F, f29);
                                    float f37 = this.F + fMin6;
                                    this.F = f37;
                                    this.G += fMin6;
                                    wb wbVar14 = this.f15764a;
                                    if (wbVar14 != null) {
                                        wbVar14.w0(f37);
                                        this.f15764a.i1(this.E + ((long) (this.F * this.D)));
                                        this.f15764a.e2(this.G);
                                    }
                                    wb wbVar15 = this.f15764a;
                                    if (wbVar15 != null) {
                                        wbVar15.I0(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.f15775e = (long) (this.F * this.D);
                                    wb wbVar16 = this.f15764a;
                                    if (wbVar16 != null) {
                                        wbVar16.I0(true);
                                        z13 = false;
                                        this.f15764a.P(this.f15775e, false);
                                    } else {
                                        z13 = false;
                                    }
                                } else {
                                    z13 = false;
                                }
                                invalidate();
                                if (!this.f15786i1) {
                                    this.f15788j1 = 1.0f;
                                }
                                this.f15786i1 = true;
                                this.f15784h1 = z13;
                            } else {
                                int i15 = this.f15777e1;
                                if (i15 < 0 || i15 >= arrayList.size() || !((i10 = this.f15774d1) == 13 || i10 == 14 || i10 == 15)) {
                                    int i16 = this.f15774d1;
                                    if (i16 == 5) {
                                        h((x8 / this.f15801q1) * jMin);
                                        if (!this.f15786i1) {
                                            this.f15788j1 = 1.0f;
                                        }
                                        this.f15786i1 = true;
                                        this.f15784h1 = false;
                                    } else if (i16 == 9) {
                                        j((x8 / this.f15801q1) * jMin);
                                        if (!this.f15786i1) {
                                            this.f15788j1 = 1.0f;
                                        }
                                        this.f15786i1 = true;
                                        this.f15784h1 = false;
                                    } else {
                                        int i17 = this.f15777e1;
                                        if (i17 >= 0 && i17 < arrayList.size() && this.f15774d1 == 16) {
                                            i((xb) arrayList.get(this.f15777e1), (x8 / this.f15801q1) * jMin);
                                            if (!this.f15786i1) {
                                                this.f15788j1 = 1.0f;
                                            }
                                            this.f15786i1 = true;
                                            this.f15784h1 = false;
                                        } else if (this.f15784h1) {
                                            m(motionEvent.getX(), jCurrentTimeMillis - this.f15766a1 < 350);
                                            if (this.f15786i1 || (wbVar2 = this.f15764a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                wbVar2.I0(true);
                                            }
                                            if (!this.f15786i1) {
                                                this.f15788j1 = 1.0f;
                                            }
                                            this.f15786i1 = z14;
                                        }
                                    }
                                } else {
                                    xb xbVar11 = (xb) arrayList.get(this.f15777e1);
                                    float f38 = (jMin / xbVar11.f17059e) * (x8 / this.f15801q1);
                                    int i18 = this.f15774d1;
                                    if (i18 == 13) {
                                        float fG5 = xbVar11.h - (g() / xbVar11.f17059e);
                                        float fMax5 = Math.max(0L, this.f15778f - xbVar11.f17060f) / xbVar11.f17059e;
                                        if (xbVar11 == this.v) {
                                            f11 = f38;
                                            fMax5 = Math.max(fMax5, xbVar11.h - (f() / xbVar11.f17059e));
                                            if (!this.f15790k1 && f11 < 0.0f) {
                                                f12 = 0.0f;
                                                if (xbVar11.f17061g <= xbVar11.h - (f() / xbVar11.f17059e)) {
                                                    this.f15774d1 = 15;
                                                }
                                            }
                                            f13 = xbVar11.f17061g;
                                            fClamp = Utilities.clamp(f13 + f11, fG5, fMax5);
                                            xbVar11.f17061g = fClamp;
                                            if (Math.abs(f13 - fClamp) > 0.01f) {
                                                this.f15790k1 = true;
                                            }
                                            wbVar3 = this.f15764a;
                                            if (wbVar3 != null) {
                                                wbVar3.g2(xbVar11.f17056a, xbVar11.f17060f);
                                            }
                                            wbVar4 = this.f15764a;
                                            if (wbVar4 != null) {
                                                wbVar4.n1(xbVar11.f17061g, xbVar11.f17056a);
                                            }
                                        } else {
                                            f11 = f38;
                                        }
                                        f12 = 0.0f;
                                        f13 = xbVar11.f17061g;
                                        fClamp = Utilities.clamp(f13 + f11, fG5, fMax5);
                                        xbVar11.f17061g = fClamp;
                                        if (Math.abs(f13 - fClamp) > 0.01f) {
                                            this.f15790k1 = true;
                                        }
                                        wbVar3 = this.f15764a;
                                        if (wbVar3 != null) {
                                            wbVar3.g2(xbVar11.f17056a, xbVar11.f17060f);
                                        }
                                        wbVar4 = this.f15764a;
                                        if (wbVar4 != null) {
                                            wbVar4.n1(xbVar11.f17061g, xbVar11.f17056a);
                                        }
                                    } else {
                                        f11 = f38;
                                        f12 = 0.0f;
                                        if (i18 == 14) {
                                            float fMin7 = Math.min(1.0f, Math.max(0L, (this.f15778f - xbVar11.f17060f) + jMin) / xbVar11.f17059e);
                                            float fG6 = (g() / xbVar11.f17059e) + xbVar11.f17061g;
                                            if (xbVar11 == this.v) {
                                                fMin7 = Math.min(fMin7, (f() / xbVar11.f17059e) + xbVar11.f17061g);
                                                if (!this.f15790k1 && f11 > 0.0f) {
                                                    if (xbVar11.h >= (f() / xbVar11.f17059e) + xbVar11.f17061g) {
                                                        this.f15774d1 = 15;
                                                    }
                                                }
                                            }
                                            float f39 = xbVar11.h;
                                            float fClamp6 = Utilities.clamp(f39 + f11, fMin7, fG6);
                                            xbVar11.h = fClamp6;
                                            if (Math.abs(f39 - fClamp6) > 0.01f) {
                                                this.f15790k1 = true;
                                            }
                                            wb wbVar17 = this.f15764a;
                                            if (wbVar17 != null) {
                                                wbVar17.W1(xbVar11.h, xbVar11.f17056a);
                                            }
                                        }
                                    }
                                    if (this.f15774d1 == 15) {
                                        float fMin8 = f11 > f12 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f15778f - xbVar11.f17060f) + jMin) / xbVar11.f17059e) - xbVar11.h, f11) : Math.max((Math.max(0L, this.f15778f - xbVar11.f17060f) / xbVar11.f17059e) - xbVar11.f17061g, f11);
                                        float f40 = xbVar11.f17061g + fMin8;
                                        xbVar11.f17061g = f40;
                                        xbVar11.h += fMin8;
                                        wb wbVar18 = this.f15764a;
                                        if (wbVar18 != null) {
                                            wbVar18.n1(f40, xbVar11.f17056a);
                                            this.f15764a.g2(xbVar11.f17056a, xbVar11.f17060f);
                                            this.f15764a.W1(xbVar11.h, xbVar11.f17056a);
                                        }
                                        wb wbVar19 = this.f15764a;
                                        if (wbVar19 != null) {
                                            z15 = true;
                                            wbVar19.I0(true);
                                        } else {
                                            z15 = true;
                                        }
                                    } else {
                                        z15 = true;
                                    }
                                    invalidate();
                                    if (!this.f15786i1) {
                                        this.f15788j1 = 1.0f;
                                    }
                                    this.f15786i1 = z15;
                                    this.f15784h1 = false;
                                }
                            }
                        } else {
                            float f41 = x8 / this.f15801q1;
                            float f42 = xbVar2.f17059e;
                            float f43 = (jMin / f42) * f41;
                            if (i11 == 2) {
                                xbVar2.f17061g = Utilities.clamp(xbVar2.f17061g + f43, xbVar2.h - (1000.0f / f42), 0.0f);
                                wb wbVar20 = this.f15764a;
                                if (wbVar20 != null) {
                                    wbVar20.Z0(this.h.f17061g, false);
                                }
                                xb xbVar12 = this.h;
                                float f44 = xbVar12.h - xbVar12.f17061g;
                                float f45 = f();
                                xb xbVar13 = this.h;
                                if (f44 > f45 / xbVar13.f17059e) {
                                    xbVar13.h = Math.min(1.0f, (f() / this.h.f17059e) + xbVar13.f17061g);
                                    wb wbVar21 = this.f15764a;
                                    if (wbVar21 != null) {
                                        wbVar21.X1(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                xbVar2.h = Utilities.clamp(xbVar2.h + f43, 1.0f, (1000.0f / f42) + xbVar2.f17061g);
                                wb wbVar22 = this.f15764a;
                                if (wbVar22 != null) {
                                    wbVar22.X1(this.h.h);
                                }
                                xb xbVar14 = this.h;
                                float f46 = xbVar14.h - xbVar14.f17061g;
                                float f47 = f();
                                xb xbVar15 = this.h;
                                if (f46 > f47 / xbVar15.f17059e) {
                                    xbVar15.f17061g = Math.max(0.0f, xbVar15.h - (f() / this.h.f17059e));
                                    wb wbVar23 = this.f15764a;
                                    if (wbVar23 != null) {
                                        wbVar23.Z0(this.h.f17061g, false);
                                    }
                                }
                            } else if (i11 == 4) {
                                float fMin9 = f43 > 0.0f ? Math.min(1.0f - xbVar2.h, f43) : Math.max(-xbVar2.f17061g, f43);
                                xb xbVar16 = this.h;
                                float f48 = xbVar16.f17061g + fMin9;
                                xbVar16.f17061g = f48;
                                xbVar16.h += fMin9;
                                wb wbVar24 = this.f15764a;
                                if (wbVar24 != null) {
                                    wbVar24.Z0(f48, false);
                                    this.f15764a.X1(this.h.h);
                                }
                            }
                            float f49 = this.f15775e;
                            xb xbVar17 = this.h;
                            float f50 = xbVar17.f17059e;
                            float f51 = f49 / f50;
                            float f52 = xbVar17.f17061g;
                            if (f51 < f52 || f51 > xbVar17.h) {
                                long j17 = (long) (f52 * f50);
                                this.f15775e = j17;
                                wb wbVar25 = this.f15764a;
                                if (wbVar25 != null) {
                                    wbVar25.P(j17, false);
                                }
                            }
                            invalidate();
                            if (!this.f15786i1) {
                                this.f15788j1 = 1.0f;
                            }
                            this.f15786i1 = true;
                            this.f15784h1 = false;
                        }
                        this.f15772c1 = motionEvent.getX();
                    }
                    if (this.f15786i1) {
                        AndroidUtilities.cancelRunOnUIThread(k0Var);
                    }
                    int i19 = this.f15774d1;
                    if ((i19 == 1 || i19 == 5 || i19 == 8) && (velocityTracker5 = this.l1) != null) {
                        velocityTracker5.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(k0Var);
                    bm0Var.a();
                    if (motionEvent.getAction() != 1) {
                        z10 = true;
                    } else {
                        if ((System.currentTimeMillis() - this.f15769b1 > ViewConfiguration.getTapTimeout() || this.f15786i1) && this.f15779f0) {
                            int i20 = this.f15774d1;
                            if (i20 == 16 && (velocityTracker4 = this.l1) != null) {
                                velocityTracker4.computeCurrentVelocity(1000);
                                int xVelocity = (int) this.l1.getXVelocity();
                                this.f15792m1 = true;
                                if (this.h != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                    long jMin2 = Math.min(this.h.f17059e, getMaxScrollDuration());
                                    int i21 = this.f15811u1;
                                    float f53 = i21;
                                    float f54 = jMin2;
                                    float f55 = this.f15778f / f54;
                                    float f56 = this.f15801q1;
                                    int i22 = (int) ((f55 * f56) + f53);
                                    int iC = (int) s3.c.c(this.h.f17059e - jMin2, f54, f56, f53);
                                    this.f15795n1 = true;
                                    this.f15797o1 = i22;
                                    this.S0.c(i22, 0, -xVelocity, 0, i21, iC, 0, 0);
                                    z10 = false;
                                }
                            } else if (i20 == 1 && (velocityTracker3 = this.l1) != null) {
                                velocityTracker3.computeCurrentVelocity(1000);
                                int xVelocity2 = (int) this.l1.getXVelocity();
                                this.f15792m1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long jMin3 = Math.min(this.h.f17059e, getMaxScrollDuration());
                                    int i23 = this.f15811u1;
                                    float f57 = i23;
                                    float f58 = jMin3;
                                    float f59 = this.f15778f / f58;
                                    float f60 = this.f15801q1;
                                    int i24 = (int) ((f59 * f60) + f57);
                                    int iC2 = (int) s3.c.c(this.h.f17059e - jMin3, f58, f60, f57);
                                    this.f15795n1 = true;
                                    this.f15797o1 = i24;
                                    this.S0.c(i24, 0, -xVelocity2, 0, i23, iC2, 0, 0);
                                    z10 = false;
                                }
                            } else if ((i20 == 5 || (i20 == 8 && !this.f15786i1)) && this.L && (velocityTracker = this.l1) != null) {
                                velocityTracker.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.l1.getXVelocity();
                                this.f15792m1 = false;
                                if (Math.abs(xVelocity3) > AndroidUtilities.dp(100.0f)) {
                                    float fMin10 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i25 = (int) (((this.M / fMin10) * this.f15801q1) + this.f15811u1 + this.f15809t1);
                                    xb xbVar18 = this.h;
                                    if (xbVar18 != null) {
                                        float f61 = xbVar18.h;
                                        float f62 = xbVar18.f17059e;
                                        j12 = this.N;
                                        j13 = (long) ((f61 * f62) - 0);
                                        f10 = xbVar18.f17061g * f62;
                                    } else {
                                        if (this.A) {
                                            float f63 = this.G;
                                            float f64 = this.D;
                                            j12 = this.N;
                                            j13 = (long) ((f63 * f64) - 0);
                                            f10 = this.F * f64;
                                        } else {
                                            j10 = -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                            z12 = true;
                                            j11 = 0;
                                        }
                                        this.f15795n1 = z12;
                                        this.f15797o1 = i25;
                                        float f65 = this.f15811u1 + this.f15809t1;
                                        float f66 = this.f15801q1;
                                        this.S0.c(i25, 0, xVelocity3, 0, (int) (((j10 / fMin10) * f66) + f65), (int) s3.c.c(j11, fMin10, f66, f65), 0, 0);
                                        z10 = false;
                                    }
                                    j10 = (long) (f10 - j12);
                                    j11 = j13;
                                    z12 = true;
                                    this.f15795n1 = z12;
                                    this.f15797o1 = i25;
                                    float f67 = this.f15811u1 + this.f15809t1;
                                    float f68 = this.f15801q1;
                                    this.S0.c(i25, 0, xVelocity3, 0, (int) (((j10 / fMin10) * f68) + f67), (int) s3.c.c(j11, fMin10, f68, f67), 0, 0);
                                    z10 = false;
                                }
                            } else if ((i20 == 9 || (i20 == 12 && !this.f15786i1)) && this.C && (velocityTracker2 = this.l1) != null) {
                                velocityTracker2.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.l1.getXVelocity();
                                this.f15792m1 = false;
                                if (Math.abs(xVelocity4) > AndroidUtilities.dp(100.0f)) {
                                    float fMin11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i26 = (int) (((this.E / fMin11) * this.f15801q1) + this.f15811u1 + this.f15809t1);
                                    xb xbVar19 = this.h;
                                    if (xbVar19 != null) {
                                        float f69 = xbVar19.h;
                                        float f70 = xbVar19.f17059e;
                                        j14 = (long) ((xbVar19.f17061g * f70) - this.D);
                                        j15 = (long) ((f69 * f70) - 0);
                                    } else {
                                        j14 = -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.f15795n1 = true;
                                    this.f15797o1 = i26;
                                    float f71 = this.f15811u1 + this.f15809t1;
                                    float f72 = this.f15801q1;
                                    this.S0.c(i26, 0, xVelocity4, 0, (int) (((j14 / fMin11) * f72) + f71), (int) s3.c.c(j15, fMin11, f72, f71), 0, 0);
                                    z10 = false;
                                }
                            }
                        } else if (this.f15779f0) {
                            if (!this.T0 || this.h == null) {
                                int i27 = this.f15780f1;
                                if (i27 == 3) {
                                    int i28 = (this.L || this.C) ? -1 : this.f15793n;
                                    int i29 = this.f15782g1;
                                    if (i28 != i29) {
                                        this.L = false;
                                        this.C = false;
                                        this.f15793n = i29;
                                        if (this.f15764a != null && i29 >= 0 && i29 < arrayList.size()) {
                                            this.f15764a.e(((xb) arrayList.get(this.f15782g1)).f17056a);
                                        }
                                        invalidate();
                                    } else if (i27 != 2) {
                                        if (i27 != 1) {
                                            if (i27 == 2) {
                                                if (i27 == 1) {
                                                    j16 = this.f15775e;
                                                    if (m(motionEvent.getX(), false)) {
                                                        this.Y0 = j16;
                                                        this.X0.d(1.0f, true);
                                                        invalidate();
                                                    }
                                                } else {
                                                    j16 = this.f15775e;
                                                    if (m(motionEvent.getX(), false)) {
                                                        this.Y0 = j16;
                                                        this.X0.d(1.0f, true);
                                                        invalidate();
                                                    }
                                                }
                                            } else if (i27 == 1) {
                                                j16 = this.f15775e;
                                                if (m(motionEvent.getX(), false)) {
                                                    this.Y0 = j16;
                                                    this.X0.d(1.0f, true);
                                                    invalidate();
                                                }
                                            } else {
                                                j16 = this.f15775e;
                                                if (m(motionEvent.getX(), false)) {
                                                    this.Y0 = j16;
                                                    this.X0.d(1.0f, true);
                                                    invalidate();
                                                }
                                            }
                                        } else if (i27 == 2) {
                                            if (i27 == 1) {
                                                j16 = this.f15775e;
                                                if (m(motionEvent.getX(), false)) {
                                                    this.Y0 = j16;
                                                    this.X0.d(1.0f, true);
                                                    invalidate();
                                                }
                                            } else {
                                                j16 = this.f15775e;
                                                if (m(motionEvent.getX(), false)) {
                                                    this.Y0 = j16;
                                                    this.X0.d(1.0f, true);
                                                    invalidate();
                                                }
                                            }
                                        } else if (i27 == 1) {
                                            j16 = this.f15775e;
                                            if (m(motionEvent.getX(), false)) {
                                                this.Y0 = j16;
                                                this.X0.d(1.0f, true);
                                                invalidate();
                                            }
                                        } else {
                                            j16 = this.f15775e;
                                            if (m(motionEvent.getX(), false)) {
                                                this.Y0 = j16;
                                                this.X0.d(1.0f, true);
                                                invalidate();
                                            }
                                        }
                                    } else if (i27 != 1) {
                                        if (i27 == 2) {
                                            if (i27 == 1) {
                                                j16 = this.f15775e;
                                                if (m(motionEvent.getX(), false)) {
                                                    this.Y0 = j16;
                                                    this.X0.d(1.0f, true);
                                                    invalidate();
                                                }
                                            } else {
                                                j16 = this.f15775e;
                                                if (m(motionEvent.getX(), false)) {
                                                    this.Y0 = j16;
                                                    this.X0.d(1.0f, true);
                                                    invalidate();
                                                }
                                            }
                                        } else if (i27 == 1) {
                                            j16 = this.f15775e;
                                            if (m(motionEvent.getX(), false)) {
                                                this.Y0 = j16;
                                                this.X0.d(1.0f, true);
                                                invalidate();
                                            }
                                        } else {
                                            j16 = this.f15775e;
                                            if (m(motionEvent.getX(), false)) {
                                                this.Y0 = j16;
                                                this.X0.d(1.0f, true);
                                                invalidate();
                                            }
                                        }
                                    } else if (i27 == 2) {
                                        if (i27 == 1) {
                                            j16 = this.f15775e;
                                            if (m(motionEvent.getX(), false)) {
                                                this.Y0 = j16;
                                                this.X0.d(1.0f, true);
                                                invalidate();
                                            }
                                        } else {
                                            j16 = this.f15775e;
                                            if (m(motionEvent.getX(), false)) {
                                                this.Y0 = j16;
                                                this.X0.d(1.0f, true);
                                                invalidate();
                                            }
                                        }
                                    } else if (i27 == 1) {
                                        j16 = this.f15775e;
                                        if (m(motionEvent.getX(), false)) {
                                            this.Y0 = j16;
                                            this.X0.d(1.0f, true);
                                            invalidate();
                                        }
                                    } else {
                                        j16 = this.f15775e;
                                        if (m(motionEvent.getX(), false)) {
                                            this.Y0 = j16;
                                            this.X0.d(1.0f, true);
                                            invalidate();
                                        }
                                    }
                                } else if (i27 != 2 && !this.L) {
                                    this.L = true;
                                    this.C = false;
                                    wb wbVar26 = this.f15764a;
                                    if (wbVar26 != null) {
                                        wbVar26.j1(false);
                                    }
                                    invalidate();
                                } else if (i27 != 1 && !this.C) {
                                    this.L = false;
                                    this.C = true;
                                    wb wbVar27 = this.f15764a;
                                    if (wbVar27 != null) {
                                        wbVar27.j1(true);
                                    }
                                    invalidate();
                                } else if (i27 == 2 && this.L) {
                                    this.L = false;
                                    this.C = false;
                                    wb wbVar28 = this.f15764a;
                                    if (wbVar28 != null) {
                                        wbVar28.j1(false);
                                    }
                                    invalidate();
                                } else if (i27 == 1 && this.C) {
                                    this.L = false;
                                    this.C = false;
                                    wb wbVar29 = this.f15764a;
                                    if (wbVar29 != null) {
                                        wbVar29.j1(false);
                                    }
                                    invalidate();
                                } else {
                                    j16 = this.f15775e;
                                    if (m(motionEvent.getX(), false) && Math.abs(this.f15775e - j16) > 400) {
                                        this.Y0 = j16;
                                        this.X0.d(1.0f, true);
                                        invalidate();
                                    }
                                }
                            } else {
                                long jClamp = (long) Utilities.clamp(((((motionEvent.getX() - this.f15811u1) - this.f15809t1) / this.f15801q1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f15778f, getBaseDuration(), 0.0f);
                                xb xbVar20 = this.h;
                                float f73 = xbVar20.h - xbVar20.f17061g;
                                xbVar20.f17061g = (1.0f - f73) * (jClamp / getBaseDuration());
                                xb xbVar21 = this.h;
                                float f74 = xbVar21.f17061g;
                                xbVar21.h = f73 + f74;
                                wb wbVar30 = this.f15764a;
                                if (wbVar30 != null) {
                                    wbVar30.Z0(f74, true);
                                    this.f15764a.X1(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.f15780f1 == 10 && (runnable = this.f15767b) != null) {
                            runnable.run();
                        }
                        z10 = true;
                    }
                    cg.b2 b2Var2 = this.Z0;
                    if (b2Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(b2Var2);
                        this.Z0 = null;
                    }
                    if (this.f15786i1 && z10 && (wbVar = this.f15764a) != null) {
                        z11 = false;
                        wbVar.I0(false);
                    } else {
                        z11 = false;
                    }
                    this.f15788j1 = 1.0f;
                    this.f15786i1 = z11;
                    this.f15784h1 = z11;
                    this.f15769b1 = -1L;
                    this.f15774d1 = -1;
                    VelocityTracker velocityTracker7 = this.l1;
                    if (velocityTracker7 != null) {
                        velocityTracker7.recycle();
                        this.l1 = null;
                    }
                }
                this.f15766a1 = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.T == null || this.S) {
                this.T = new vb(this, this.K, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.Q = false;
                this.f15771c0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        k9.a aVar = new k9.a(3);
        ArrayList arrayList = this.f15805s;
        Collections.sort(arrayList, aVar);
        xb xbVar = arrayList.isEmpty() ? null : (xb) arrayList.get(0);
        this.v = xbVar;
        if (xbVar != null) {
            long j10 = xbVar.f17060f;
        }
    }

    public void setCollage(ArrayList<z7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ac acVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f15805s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            xb xbVar = (xb) arrayList2.get(i10);
            if (xbVar != null && (acVar = xbVar.f17058c) != null) {
                acVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f15802r;
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
        this.f15773d0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                z7 z7Var = arrayList.get(i12);
                if (z7Var.K) {
                    xb xbVar2 = new xb(this);
                    xbVar2.f17056a = i12;
                    xbVar2.f17057b = false;
                    xbVar2.d = z7Var.L.getAbsolutePath();
                    xbVar2.f17059e = z7Var.f17211h0;
                    xbVar2.f17060f = z7Var.X;
                    xbVar2.f17062i = z7Var.P;
                    xbVar2.f17061g = z7Var.V;
                    xbVar2.h = z7Var.W;
                    xb.a(xbVar2, false);
                    xb.b(xbVar2);
                    arrayList2.add(xbVar2);
                }
            }
        }
        q();
        this.f15793n = 0;
    }

    public void setDelegate(wb wbVar) {
        this.f15764a = wbVar;
    }

    public void setMaxCount(int i10) {
        this.U = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f15767b = runnable;
    }

    public void setProgress(long j10) {
        long j11;
        float f10;
        long j12;
        xb xbVar = this.h;
        if (xbVar != null) {
            long j13 = this.f15775e;
            if (j10 < j13) {
                float f11 = j10;
                long j14 = xbVar.f17059e;
                if (f11 <= (j14 * xbVar.f17061g) + 240.0f && j13 + 240 >= j14 * xbVar.h) {
                    this.Y0 = -1L;
                    this.X0.d(1.0f, true);
                } else if (!this.J && !this.A && xbVar == null) {
                    long j15 = this.f15775e;
                    if (j10 < j15) {
                        float f12 = j10;
                        long j16 = this.N;
                        if (f12 <= (j16 * this.O) + 240.0f && j15 + 240 >= j16 * this.P) {
                            this.Y0 = -1L;
                            this.X0.d(1.0f, true);
                        } else if (this.A) {
                            j11 = this.f15775e;
                            if (j10 < j11) {
                                f10 = j10;
                                j12 = this.D;
                                if (f10 <= (j12 * this.O) + 240.0f) {
                                    this.Y0 = -1L;
                                    this.X0.d(1.0f, true);
                                }
                            }
                        }
                    } else if (this.A) {
                        j11 = this.f15775e;
                        if (j10 < j11) {
                            f10 = j10;
                            j12 = this.D;
                            if (f10 <= (j12 * this.O) + 240.0f) {
                                this.Y0 = -1L;
                                this.X0.d(1.0f, true);
                            }
                        }
                    }
                } else if (this.A && xbVar == null) {
                    j11 = this.f15775e;
                    if (j10 < j11) {
                        f10 = j10;
                        j12 = this.D;
                        if (f10 <= (j12 * this.O) + 240.0f && j11 + 240 >= j12 * this.P) {
                            this.Y0 = -1L;
                            this.X0.d(1.0f, true);
                        }
                    }
                }
            } else if (!this.J) {
                if (this.A) {
                    j11 = this.f15775e;
                    if (j10 < j11) {
                        f10 = j10;
                        j12 = this.D;
                        if (f10 <= (j12 * this.O) + 240.0f) {
                            this.Y0 = -1L;
                            this.X0.d(1.0f, true);
                        }
                    }
                }
            } else if (this.A) {
                j11 = this.f15775e;
                if (j10 < j11) {
                    f10 = j10;
                    j12 = this.D;
                    if (f10 <= (j12 * this.O) + 240.0f) {
                        this.Y0 = -1L;
                        this.X0.d(1.0f, true);
                    }
                }
            }
        } else if (!this.J) {
            if (this.A) {
                j11 = this.f15775e;
                if (j10 < j11) {
                    f10 = j10;
                    j12 = this.D;
                    if (f10 <= (j12 * this.O) + 240.0f) {
                        this.Y0 = -1L;
                        this.X0.d(1.0f, true);
                    }
                }
            }
        } else if (this.A) {
            j11 = this.f15775e;
            if (j10 < j11) {
                f10 = j10;
                j12 = this.D;
                if (f10 <= (j12 * this.O) + 240.0f) {
                    this.Y0 = -1L;
                    this.X0.d(1.0f, true);
                }
            }
        }
        this.f15775e = j10;
        invalidate();
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f10) {
        xb xbVar = this.h;
        if (xbVar == null) {
            return;
        }
        xbVar.f17061g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        xb xbVar = this.h;
        if (xbVar == null) {
            return;
        }
        xbVar.h = f10;
        invalidate();
    }
}
