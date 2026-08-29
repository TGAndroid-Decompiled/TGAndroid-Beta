package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import i7.z5;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.jr;
public final class n0 {
    public static final jr B = new jr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final t1 f592a;
    public boolean f593b;
    public boolean f594c;
    public long d;
    public boolean f595e;
    public boolean f596f;
    public j1 f597g;
    public j1 h;
    public double f598i;
    public boolean f599j;
    public float f600k;
    public boolean f601l;
    public int f603n;
    public int f604o;
    public double f605p;
    public double f606q;
    public ValueAnimator f607r;
    public final d2 f608s;
    public Matrix f609t;
    public long v;
    public float f611w;
    public ValueAnimator f612x;
    public boolean f614z;
    public final j1[] f602m = new j1[3];
    public final float[] f610u = new float[2];
    public final h0 f613y = new h0(this, 1);

    public n0(t1 t1Var) {
        this.f592a = t1Var;
        Context context = t1Var.getContext();
        i0 i0Var = new i0(this, 0);
        final ?? obj = new Object();
        obj.f444b = new ArrayList();
        obj.f445c = new ArrayList();
        obj.f449i = null;
        obj.f450j = new AtomicBoolean(false);
        obj.f451k = new AtomicBoolean(false);
        obj.f452l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ag.x1.run():void");
            }
        };
        obj.f447f = context;
        obj.f446e = i0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f448g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f443a = sharedPreferences.getInt("scoreall", 0);
        d2.f441m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ag.x1.run():void");
            }
        });
        this.f608s = obj;
    }

    public final void a(d dVar, boolean z10, l1 l1Var) {
        Object obj;
        s1 s1Var;
        if (this.f601l) {
            t1 t1Var = this.f592a;
            if (!t1Var.getPainting().G && this.f597g != null) {
                if (dVar == null) {
                    obj = t1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f601l = false;
                if (r42 instanceof d) {
                    t1Var.getPainting().E = false;
                }
                f1 painting = t1Var.getPainting();
                painting.f473f.f(new b1(painting, 1));
                this.f603n = 0;
                this.f604o = 0;
                this.f599j = false;
                this.f593b = false;
                if (z10 && (s1Var = t1Var.f658a) != null) {
                    s1Var.f();
                }
                bv0 bv0Var = t1Var.getPainting().f474g;
                j1 j1Var = this.f597g;
                float a2 = z5.a((float) j1Var.f554a, (float) j1Var.f555b, 0.0f, 0.0f);
                j1 j1Var2 = this.f597g;
                float max = Math.max(a2, z5.a((float) j1Var2.f554a, (float) j1Var2.f555b, bv0Var.f27238a, 0.0f));
                j1 j1Var3 = this.f597g;
                float a10 = z5.a((float) j1Var3.f554a, (float) j1Var3.f555b, 0.0f, bv0Var.f27239b);
                j1 j1Var4 = this.f597g;
                final float max2 = Math.max(max, Math.max(a10, z5.a((float) j1Var4.f554a, (float) j1Var4.f555b, bv0Var.f27238a, bv0Var.f27239b))) / 0.84f;
                ValueAnimator valueAnimator = this.f607r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f607r = null;
                }
                ValueAnimator valueAnimator2 = this.f612x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f612x = null;
                }
                j1 j1Var5 = this.f597g;
                final j1 j1Var6 = new j1(j1Var5.f554a, j1Var5.f555b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f612x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        t1 t1Var2 = n0.this.f592a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        g1 g1Var = new g1(new j1[]{j1Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = t1Var2.getCurrentColor();
                        }
                        g1Var.f502c = currentColor;
                        g1Var.d = floatValue * max2;
                        g1Var.f503e = mVar;
                        f1 painting2 = t1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f473f.f(new z0(painting2, g1Var, true, true, null, 0));
                    }
                });
                this.f612x.addListener(new l0(this, j1Var6, max2, r42, z10, l1Var));
                this.f612x.setDuration(450L);
                this.f612x.setInterpolator(jr.h);
                this.f612x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(g1 g1Var) {
        t1 t1Var = this.f592a;
        int currentColor = t1Var.getCurrentColor();
        float currentWeight = t1Var.getCurrentWeight();
        m currentBrush = t1Var.getCurrentBrush();
        g1Var.f502c = currentColor;
        g1Var.d = currentWeight;
        g1Var.f503e = currentBrush;
        if (this.f596f) {
            this.f598i = 0.0d;
        }
        g1Var.f500a = this.f598i;
        f1 painting = t1Var.getPainting();
        boolean z10 = this.f596f;
        k0 k0Var = new k0(this, g1Var, 0);
        if (painting.L == null) {
            painting.f473f.f(new z0(painting, g1Var, z10, false, k0Var, 0));
        }
        this.f596f = false;
    }

    public final void c(float f9, boolean z10) {
        int i10 = this.f603n;
        j1[] j1VarArr = this.f602m;
        if (i10 > 2) {
            Vector vector = new Vector();
            j1 j1Var = j1VarArr[0];
            j1 j1Var2 = j1VarArr[1];
            j1 j1Var3 = j1VarArr[2];
            if (j1Var3 != null && j1Var2 != null && j1Var != null) {
                j1 b10 = j1Var2.b(j1Var);
                j1 b11 = j1Var3.b(j1Var2);
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
                    double d13 = (b11.f554a * d10) + (j1Var2.f554a * 2.0d * d12 * d) + (b10.f554a * d11);
                    double d14 = (b11.f555b * d10) + (j1Var2.f555b * 2.0d * d12 * d) + (b10.f555b * d11);
                    double lerp = ((((b11.f556c * d10) + ((j1Var2.f556c * ((2.0f * f13) * f12)) + (b10.f556c * pow))) - 1.0d) * AndroidUtilities.lerp(f9, 1.0f, i7.w.a(this.f604o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    j1 j1Var4 = new j1(d13, d14, lerp);
                    if (this.f594c) {
                        j1Var4.d = true;
                        this.f594c = false;
                    }
                    vector.add(j1Var4);
                    this.f605p += lerp;
                    this.f606q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                j1[] j1VarArr2 = new j1[vector.size()];
                vector.toArray(j1VarArr2);
                b(new g1(j1VarArr2));
                System.arraycopy(j1VarArr, 1, j1VarArr, 0, 2);
                if (z10) {
                    this.f603n = 0;
                    return;
                } else {
                    this.f603n = 2;
                    return;
                }
            }
            return;
        }
        j1[] j1VarArr3 = new j1[i10];
        System.arraycopy(j1VarArr, 0, j1VarArr3, 0, i10);
        b(new g1(j1VarArr3));
    }
}
