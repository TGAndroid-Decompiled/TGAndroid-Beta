package og;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import v7.a7;
public final class g0 {
    public static final wr B = new wr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final h1 f14364a;
    public boolean f14365b;
    public boolean f14366c;
    public long d;
    public boolean e;
    public boolean f14367f;
    public z0 f14368g;
    public z0 h;
    public double f14369i;
    public boolean f14370j;
    public float f14371k;
    public boolean f14372l;
    public int f14374n;
    public int f14375o;
    public double f14376p;
    public double f14377q;
    public ValueAnimator f14378r;
    public final p1 f14379s;
    public Matrix f14380t;
    public long v;
    public float f14382w;
    public ValueAnimator f14383x;
    public boolean f14385z;
    public final z0[] f14373m = new z0[3];
    public final float[] f14381u = new float[2];
    public final c0 f14384y = new c0(this, 1);

    public g0(h1 h1Var) {
        this.f14364a = h1Var;
        Context context = h1Var.getContext();
        ai.b bVar = new ai.b(this, 25);
        final ?? obj = new Object();
        obj.f14453b = new ArrayList();
        obj.f14454c = new ArrayList();
        obj.f14457i = null;
        obj.f14458j = new AtomicBoolean(false);
        obj.f14459k = new AtomicBoolean(false);
        obj.f14460l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: og.l1.run():void");
            }
        };
        obj.f14455f = context;
        obj.e = bVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f14456g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f14452a = sharedPreferences.getInt("scoreall", 0);
        p1.f14450m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: og.l1.run():void");
            }
        });
        this.f14379s = obj;
    }

    public final void a(d dVar, boolean z10, b1 b1Var) {
        Object obj;
        g1 g1Var;
        if (this.f14372l) {
            h1 h1Var = this.f14364a;
            if (!h1Var.getPainting().G && this.f14368g != null) {
                if (dVar == null) {
                    obj = h1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f14372l = false;
                if (r42 instanceof d) {
                    h1Var.getPainting().E = false;
                }
                v0 painting = h1Var.getPainting();
                painting.f14515f.f(new r0(painting, 1));
                this.f14374n = 0;
                this.f14375o = 0;
                this.f14370j = false;
                this.f14365b = false;
                if (z10 && (g1Var = h1Var.f14388a) != null) {
                    g1Var.f();
                }
                tv0 tv0Var = h1Var.getPainting().f14516g;
                z0 z0Var = this.f14368g;
                float a2 = a7.a((float) z0Var.f14577a, (float) z0Var.f14578b, 0.0f, 0.0f);
                z0 z0Var2 = this.f14368g;
                float max = Math.max(a2, a7.a((float) z0Var2.f14577a, (float) z0Var2.f14578b, tv0Var.f27499a, 0.0f));
                z0 z0Var3 = this.f14368g;
                float a10 = a7.a((float) z0Var3.f14577a, (float) z0Var3.f14578b, 0.0f, tv0Var.f27500b);
                z0 z0Var4 = this.f14368g;
                final float max2 = Math.max(max, Math.max(a10, a7.a((float) z0Var4.f14577a, (float) z0Var4.f14578b, tv0Var.f27499a, tv0Var.f27500b))) / 0.84f;
                ValueAnimator valueAnimator = this.f14378r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f14378r = null;
                }
                ValueAnimator valueAnimator2 = this.f14383x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f14383x = null;
                }
                z0 z0Var5 = this.f14368g;
                final z0 z0Var6 = new z0(z0Var5.f14577a, z0Var5.f14578b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f14383x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        h1 h1Var2 = g0.this.f14364a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        w0 w0Var = new w0(new z0[]{z0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = h1Var2.getCurrentColor();
                        }
                        w0Var.f14540c = currentColor;
                        w0Var.d = floatValue * max2;
                        w0Var.e = mVar;
                        v0 painting2 = h1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f14515f.f(new p0(0, painting2, w0Var, null, true, true));
                    }
                });
                this.f14383x.addListener(new f0(this, z0Var6, max2, r42, z10, b1Var));
                this.f14383x.setDuration(450L);
                this.f14383x.setInterpolator(wr.h);
                this.f14383x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(w0 w0Var) {
        h1 h1Var = this.f14364a;
        int currentColor = h1Var.getCurrentColor();
        float currentWeight = h1Var.getCurrentWeight();
        m currentBrush = h1Var.getCurrentBrush();
        w0Var.f14540c = currentColor;
        w0Var.d = currentWeight;
        w0Var.e = currentBrush;
        if (this.f14367f) {
            this.f14369i = 0.0d;
        }
        w0Var.f14538a = this.f14369i;
        v0 painting = h1Var.getPainting();
        boolean z10 = this.f14367f;
        e0 e0Var = new e0(this, w0Var, 0);
        if (painting.L == null) {
            painting.f14515f.f(new p0(0, painting, w0Var, e0Var, z10, false));
        }
        this.f14367f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f14374n;
        z0[] z0VarArr = this.f14373m;
        if (i10 > 2) {
            Vector vector = new Vector();
            z0 z0Var = z0VarArr[0];
            z0 z0Var2 = z0VarArr[1];
            z0 z0Var3 = z0VarArr[2];
            if (z0Var3 != null && z0Var2 != null && z0Var != null) {
                z0 b10 = z0Var2.b(z0Var);
                z0 b11 = z0Var3.b(z0Var2);
                int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
                float f10 = 1.0f;
                float f11 = 1.0f / min;
                int i11 = 0;
                float f12 = 0.0f;
                while (i11 < min) {
                    float f13 = f10 - f12;
                    double d = f13;
                    double pow = Math.pow(d, 2.0d);
                    double d10 = f12 * f12;
                    double d11 = f13 * f13;
                    double d12 = f12;
                    double d13 = (b11.f14577a * d10) + (z0Var2.f14577a * 2.0d * d12 * d) + (b10.f14577a * d11);
                    double d14 = (b11.f14578b * d10) + (z0Var2.f14578b * 2.0d * d12 * d) + (b10.f14578b * d11);
                    double lerp = ((((b11.f14579c * d10) + ((z0Var2.f14579c * ((2.0f * f13) * f12)) + (b10.f14579c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f14375o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    z0 z0Var4 = new z0(d13, d14, lerp);
                    if (this.f14366c) {
                        z0Var4.d = true;
                        this.f14366c = false;
                    }
                    vector.add(z0Var4);
                    this.f14376p += lerp;
                    this.f14377q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                z0[] z0VarArr2 = new z0[vector.size()];
                vector.toArray(z0VarArr2);
                b(new w0(z0VarArr2));
                System.arraycopy(z0VarArr, 1, z0VarArr, 0, 2);
                if (z10) {
                    this.f14374n = 0;
                    return;
                } else {
                    this.f14374n = 2;
                    return;
                }
            }
            return;
        }
        z0[] z0VarArr3 = new z0[i10];
        System.arraycopy(z0VarArr, 0, z0VarArr3, 0, i10);
        b(new w0(z0VarArr3));
    }
}
