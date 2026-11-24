package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import java.util.Random;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_agent;
public final class rc extends View {
    public static final int[] o0 = {-9648385, -13660938, -8758017};
    public static final int[] p0 = {-6650113, -11127568, -9815041};
    public static final d53 q0 = new d53(0.23d, 1.0d, 0.32d, 1.0d);
    public static final d53 r0 = new d53(0.4d, 0.0d, 0.2d, 1.0d);
    public static final d53 s0 = new d53(0.42d, 0.0d, 0.58d, 1.0d);
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public int I;
    public final int J;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public final float[] N;
    public final float[] O;
    public final long P;
    public long Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final ylb a;
    public final Paint a0;
    public final byte b;
    public final Paint b0;
    public final int c;
    public final Paint c0;
    public oc d;
    public final RectF d0;
    public float e;
    public final Path e0;
    public float f;
    public final Path f0;
    public final PathMeasure g0;
    public float h;
    public final float[] h0;
    public qc i0;
    public LinearGradient j0;
    public int k0;
    public int l0;
    public int m0;
    public float n;
    public int n0;
    public boolean r;
    public ValueAnimator s;
    public ValueAnimator w;
    public ValueAnimator x;
    public ValueAnimator y;

    public rc(Context context, ylb ylbVar) {
        super(context);
        this.c = gm.L(14.0f);
        this.K = new float[64];
        this.L = new float[64];
        this.M = new float[64];
        this.N = new float[64];
        this.O = new float[64];
        this.P = System.nanoTime();
        this.U = -1.0f;
        this.a0 = new Paint(1);
        this.b0 = new Paint(1);
        Paint paint = new Paint(1);
        this.c0 = paint;
        this.d0 = new RectF();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new PathMeasure();
        this.h0 = new float[2];
        this.b = (byte) 4;
        this.a = ylbVar;
        this.J = ViewConfiguration.get(context).getScaledTouchSlop();
        paint.setDither(true);
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(BlendMode.PLUS);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        }
        Random random = new Random(27L);
        for (int i = 0; i < 64; i++) {
            this.K[i] = random.nextFloat();
            this.L[i] = (random.nextFloat() * 2.0f) - 1.0f;
            this.M[i] = random.nextFloat() + 0.5f;
            this.N[i] = wi8.e(random, 0.8f, 0.6f);
            this.O[i] = random.nextFloat() * 3.1415927f * 2.0f;
            random.nextFloat();
        }
    }

    public static int b(int i, int i2, float f, int i3) {
        float i4 = Utilities.i(f, 1.0f, 0.0f);
        if (i4 < 0.5f) {
            return g(i4 * 2.0f, i, i2);
        }
        return g((i4 - 0.5f) * 2.0f, i2, i3);
    }

    public static int g(float f, int i, int i2) {
        return on2.f(Utilities.i(f, 1.0f, 0.0f), i, i2);
    }

    private void setPos(float f) {
        boolean z;
        float f2;
        this.e = f;
        if (f > this.b - 1.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.r) {
            this.r = z;
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f3 = this.n;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
            this.y = ofFloat;
            ofFloat.addUpdateListener(new nc(this, (byte) 3));
            this.y.setDuration(420L);
            this.y.setInterpolator(r0);
            this.y.start();
        }
        invalidate();
    }

    public final void a(int i) {
        float f;
        float f2;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, i);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new nc(this, (byte) 1));
        this.s.setDuration(Math.max(180L, Math.abs(f2 - f) * 220.0f));
        this.s.setInterpolator(q0);
        this.s.start();
    }

    public final void c(boolean z) {
        int i;
        int i2;
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (z) {
                if (i3 >= 30) {
                    i2 = 16;
                } else {
                    i2 = 0;
                }
                performHapticFeedback(i2, 1);
                return;
            }
            if (i3 >= 27) {
                i = 9;
            } else {
                i = 3;
            }
            performHapticFeedback(i, 1);
        } catch (Exception unused) {
        }
    }

    public final void d(boolean z) {
        float f;
        long j;
        TimeInterpolator overshootInterpolator;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new nc(this, (byte) 0));
        ValueAnimator valueAnimator2 = this.w;
        if (z) {
            j = 220;
        } else {
            j = 300;
        }
        valueAnimator2.setDuration(j);
        ValueAnimator valueAnimator3 = this.w;
        if (z) {
            overshootInterpolator = q0;
        } else {
            overshootInterpolator = new OvershootInterpolator(1.3f);
        }
        valueAnimator3.setInterpolator(overshootInterpolator);
        this.w.start();
    }

    public final float e(float f) {
        float L = gm.L(40.0f);
        float L2 = gm.L(3.0f);
        return (((((getWidth() - (this.c << 1)) - (L2 * 2.0f)) - L) * f) / (this.b - 1)) + (L / 2.0f) + L2;
    }

    public final void f(ValueAnimator valueAnimator) {
        setPos(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public int getStop() {
        return Math.round(this.e);
    }

    public final void h(int i) {
        boolean z;
        float f = this.e;
        int i2 = this.b - 1;
        if (i == i2 && f < i2 - 0.001f) {
            z = true;
        } else {
            z = false;
        }
        a(i);
        if (!z && i != i2) {
            c(false);
        } else {
            c(true);
            this.S = 0.0f;
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new nc(this, (byte) 2));
            this.x.addListener(new g0(this, (byte) 7));
            this.x.setDuration(460L);
            this.x.start();
        }
        oc ocVar = this.d;
        if (ocVar != null) {
            wc wcVar = (wc) ((l0) ocVar).b;
            wcVar.b(i, true);
            ad adVar = wcVar.s;
            String str = mc.i[i];
            mc mcVar = adVar.y;
            if (!TextUtils.equals(mcVar.b(), str)) {
                TL_agent.settings settingsVar = mcVar.d;
                if (settingsVar != null) {
                    settingsVar.effort = str;
                    mcVar.i();
                }
                TL_agent.setEffort seteffort = new TL_agent.setEffort();
                seteffort.effort = str;
                ConnectionsManager.getInstance(mcVar.a).sendRequestTyped(seteffort, new kc((byte) 0), new lc(mcVar, (byte) 4));
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r76) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(28.0f) + (this.c << 1), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = this.c;
        boolean z = false;
        if (actionMasked != 0) {
            byte b = this.b;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                } else {
                    float x = (motionEvent.getX() - i) - this.G;
                    if (!this.F && Math.abs(x) > this.J) {
                        this.F = true;
                        this.E = true;
                    }
                    if (this.F) {
                        float f = b - 1;
                        float i2 = Utilities.i(((x / Math.max(1.0f, e(f) - e(0.0f))) * f) + this.H, f, 0.0f);
                        setPos(i2);
                        int round = Math.round(i2);
                        if (round != this.I && Math.abs(i2 - round) < 0.12f) {
                            this.I = round;
                            c(false);
                            return true;
                        }
                    }
                }
            }
            d(false);
            boolean z2 = this.F;
            this.E = false;
            this.F = false;
            if (z2) {
                h(Math.round(this.e));
                return true;
            } else if (motionEvent.getActionMasked() == 1) {
                float f2 = this.G;
                float L = gm.L(40.0f);
                float L2 = gm.L(3.0f);
                float max = ((f2 - L2) - (L / 2.0f)) / Math.max(1.0f, ((getWidth() - (i << 1)) - (L2 * 2.0f)) - L);
                float f3 = b - 1;
                h(Math.round(Utilities.i(max * f3, f3, 0.0f)));
                return true;
            }
        } else {
            d(true);
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float x2 = motionEvent.getX() - i;
            this.G = x2;
            float f4 = this.e;
            this.H = f4;
            if (Math.abs(x2 - e(f4)) < gm.L(40.0f)) {
                z = true;
            }
            this.F = z;
            this.E = z;
            this.I = Math.round(this.H);
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    public void setListener(oc ocVar) {
        this.d = ocVar;
    }
}
