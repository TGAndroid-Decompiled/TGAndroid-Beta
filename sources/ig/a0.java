package ig;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.t2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
import w7.z8;
public final class a0 {
    public static final gr B = new gr(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final c1 f8247a;
    public boolean f8248b;
    public boolean f8249c;
    public long d;
    public boolean e;
    public boolean f8250f;
    public u0 f8251g;
    public u0 h;
    public double f8252i;
    public boolean f8253j;
    public float f8254k;
    public boolean f8255l;
    public int f8257n;
    public int f8258o;
    public double f8259p;
    public double f8260q;
    public ValueAnimator f8261r;
    public final k1 f8262s;
    public Matrix f8263t;
    public long v;
    public float f8265w;
    public ValueAnimator f8266x;
    public boolean f8268z;
    public final u0[] f8256m = new u0[3];
    public final float[] f8264u = new float[2];
    public final w f8267y = new w(this, 1);

    public a0(c1 c1Var) {
        this.f8247a = c1Var;
        Context context = c1Var.getContext();
        ag.l lVar = new ag.l(this, 11);
        final ?? obj = new Object();
        obj.f8347b = new ArrayList();
        obj.f8348c = new ArrayList();
        obj.f8351i = null;
        obj.f8352j = new AtomicBoolean(false);
        obj.f8353k = new AtomicBoolean(false);
        obj.f8354l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ig.g1.run():void");
            }
        };
        obj.f8349f = context;
        obj.e = lVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f8350g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f8346a = sharedPreferences.getInt("scoreall", 0);
        k1.f8344m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ig.g1.run():void");
            }
        });
        this.f8262s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f8255l) {
            c1 c1Var = this.f8247a;
            if (!c1Var.getPainting().G && this.f8251g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f8255l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f8414f.f(new m0(painting, 1));
                this.f8257n = 0;
                this.f8258o = 0;
                this.f8253j = false;
                this.f8248b = false;
                if (z10 && (b1Var = c1Var.f8283a) != null) {
                    b1Var.t();
                }
                qu0 qu0Var = c1Var.getPainting().f8415g;
                u0 u0Var = this.f8251g;
                float a2 = z8.a((float) u0Var.f8481a, (float) u0Var.f8482b, 0.0f, 0.0f);
                u0 u0Var2 = this.f8251g;
                float max = Math.max(a2, z8.a((float) u0Var2.f8481a, (float) u0Var2.f8482b, qu0Var.f29808a, 0.0f));
                u0 u0Var3 = this.f8251g;
                float a10 = z8.a((float) u0Var3.f8481a, (float) u0Var3.f8482b, 0.0f, qu0Var.f29809b);
                u0 u0Var4 = this.f8251g;
                final float max2 = Math.max(max, Math.max(a10, z8.a((float) u0Var4.f8481a, (float) u0Var4.f8482b, qu0Var.f29808a, qu0Var.f29809b))) / 0.84f;
                ValueAnimator valueAnimator = this.f8261r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f8261r = null;
                }
                ValueAnimator valueAnimator2 = this.f8266x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f8266x = null;
                }
                u0 u0Var5 = this.f8251g;
                final u0 u0Var6 = new u0(u0Var5.f8481a, u0Var5.f8482b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f8266x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = a0.this.f8247a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        h hVar = r42;
                        hVar.getClass();
                        if (hVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f8439c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.e = hVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f8414f.f(new k0(painting2, r0Var, true, true, null, 0));
                    }
                });
                this.f8266x.addListener(new z(this, u0Var6, max2, r42, z10, w0Var));
                this.f8266x.setDuration(450L);
                this.f8266x.setInterpolator(gr.h);
                this.f8266x.start();
                if (z10) {
                    t2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f8247a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        h currentBrush = c1Var.getCurrentBrush();
        r0Var.f8439c = currentColor;
        r0Var.d = currentWeight;
        r0Var.e = currentBrush;
        if (this.f8250f) {
            this.f8252i = 0.0d;
        }
        r0Var.f8437a = this.f8252i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f8250f;
        y yVar = new y(this, r0Var, 0);
        if (painting.L == null) {
            painting.f8414f.f(new k0(painting, r0Var, z10, false, yVar, 0));
        }
        this.f8250f = false;
    }

    public final void c(boolean z10, float f7) {
        int i10 = this.f8257n;
        u0[] u0VarArr = this.f8256m;
        if (i10 > 2) {
            Vector vector = new Vector();
            u0 u0Var = u0VarArr[0];
            u0 u0Var2 = u0VarArr[1];
            u0 u0Var3 = u0VarArr[2];
            if (u0Var3 != null && u0Var2 != null && u0Var != null) {
                u0 b10 = u0Var2.b(u0Var);
                u0 b11 = u0Var3.b(u0Var2);
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
                    double d13 = (b11.f8481a * d10) + (u0Var2.f8481a * 2.0d * d12 * d) + (b10.f8481a * d11);
                    double d14 = (b11.f8482b * d10) + (u0Var2.f8482b * 2.0d * d12 * d) + (b10.f8482b * d11);
                    double T1 = ((((b11.f8483c * d10) + ((u0Var2.f8483c * ((2.0f * f13) * f12)) + (b10.f8483c * pow))) - 1.0d) * org.telegram.messenger.i0.T1(f7, 1.0f, w7.u.a(this.f8258o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d13, d14, T1);
                    if (this.f8249c) {
                        u0Var4.d = true;
                        this.f8249c = false;
                    }
                    vector.add(u0Var4);
                    this.f8259p += T1;
                    this.f8260q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                u0[] u0VarArr2 = new u0[vector.size()];
                vector.toArray(u0VarArr2);
                b(new r0(u0VarArr2));
                System.arraycopy(u0VarArr, 1, u0VarArr, 0, 2);
                if (z10) {
                    this.f8257n = 0;
                    return;
                } else {
                    this.f8257n = 2;
                    return;
                }
            }
            return;
        }
        u0[] u0VarArr3 = new u0[i10];
        System.arraycopy(u0VarArr, 0, u0VarArr3, 0, i10);
        b(new r0(u0VarArr3));
    }
}
