package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tw9 extends Dialog {
    public TextView E;
    public final ut3 F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public ylb M;
    public k47 N;
    public rw9 O;
    public rc2 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public n50 W;
    public boolean X;
    public jm1 Y;
    public of2 Z;
    public final Activity a;
    public final nw9 a0;
    public final ne6 b;
    public float b0;
    public final qw9 c;
    public boolean c0;
    public jlb d;
    public he d0;
    public iq5 e;
    public ValueAnimator e0;
    public Bitmap f;
    public ValueAnimator f0;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float w;
    public ndc x;
    public hg5 y;

    public tw9(Activity activity) {
        super(activity, 2131755352);
        this.e = iq5.e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        this.a0 = new nw9(this, (byte) 0);
        this.b0 = 0.0f;
        this.c0 = false;
        this.a = activity;
        gm.S(getWindow());
        ne6 ne6Var = new ne6((byte) 18, activity, this);
        this.b = ne6Var;
        ne6Var.setOnClickListener(new ow9(this, (byte) 0));
        qw9 qw9Var = new qw9(this, activity);
        this.c = qw9Var;
        qw9Var.setClipToPadding(false);
        ne6Var.addView(qw9Var, qoe.e(-1, -1, 119));
        pw9 pw9Var = new pw9(this, (byte) 0);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(ne6Var, pw9Var);
        if (gda.p0) {
            this.F = new ut3();
        }
    }

    public final void a(boolean z, nw9 nw9Var) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f2 = this.s;
        float f3 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.e0 = ofFloat;
        ofFloat.addUpdateListener(new d30((byte) 8, this, z));
        this.e0.addListener(new qx(this, z, nw9Var, (byte) 12));
        if (!z && this.Z == null) {
            j = 330;
        } else {
            j = 520;
        }
        ValueAnimator valueAnimator3 = this.e0;
        d53 d53Var = d53.h;
        valueAnimator3.setInterpolator(d53Var);
        this.e0.setDuration(j);
        this.e0.start();
        float f4 = this.w;
        if (z) {
            f3 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f4, f3);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new p29(this, (byte) 17));
        this.f0.addListener(new sw9((byte) 0, this, z));
        this.f0.setDuration(((float) j) * 1.5f);
        this.f0.setInterpolator(d53Var);
        this.f0.start();
    }

    public final void b() {
        super.dismiss();
    }

    public final void c() {
        super.dismiss();
    }

    public final void d() {
        if (!this.I) {
            ne6 ne6Var = this.b;
            if (ne6Var.getWidth() > 0) {
                rc2 rc2Var = this.P;
                if (rc2Var != null) {
                    int[] iArr = new int[2];
                    rc2Var.getLocationOnScreen(iArr);
                    int width = ne6Var.getWidth();
                    iq5 iq5Var = this.e;
                    this.G = (iArr[0] - this.e.a) - ((((width - iq5Var.a) - iq5Var.c) - this.P.getWidth()) / 2.0f);
                    int height = ne6Var.getHeight();
                    iq5 iq5Var2 = this.e;
                    this.H = td4.y(((height - iq5Var2.b) - iq5Var2.d) - this.P.getHeight(), this.L, 2.0f, iArr[1] - this.e.b);
                    if (!this.K) {
                        this.K = true;
                        float i = (Utilities.i((this.P.getHeight() / 2.0f) + iArr[1], ne6Var.getHeight() * 0.7f, ne6Var.getHeight() * 0.3f) - (this.P.getHeight() / 2.0f)) - ((ne6Var.getHeight() - this.P.getHeight()) / 2.0f);
                        this.J = i;
                        if (this.T) {
                            this.J = 0.0f;
                        } else {
                            this.J = gm.R1(0.0f, i, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.H = 0.0f;
                    this.G = 0.0f;
                }
                this.I = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        rw9 rw9Var;
        if (!this.c0) {
            he heVar = this.d0;
            if (heVar != null) {
                heVar.dismiss();
                this.d0 = null;
            }
            this.c0 = true;
            hg5 hg5Var = this.y;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            ndc ndcVar = this.x;
            if (ndcVar != null) {
                ndcVar.f0();
                this.x.l0();
                this.x = null;
            }
            if (!this.T && (rw9Var = this.O) != null && rw9Var.getSeekBarWaveform() != null) {
                gx9 seekBarWaveform = this.O.getSeekBarWaveform();
                seekBarWaveform.L = this.s;
                rc2 rc2Var = seekBarWaveform.n;
                if (rc2Var != null) {
                    rc2Var.invalidate();
                }
            }
            this.I = false;
            d();
            a(false, new nw9(this, (byte) 3));
            ne6 ne6Var = this.b;
            ne6Var.invalidate();
            of2 of2Var = this.Z;
            if (of2Var != null) {
                rc2 rc2Var2 = this.P;
                if (rc2Var2 != null) {
                    rc2Var2.Ab = true;
                }
                gm.c3(of2Var);
                this.Z = null;
                jlb jlbVar = new jlb(this.a, null);
                this.d = jlbVar;
                ne6Var.addView(jlbVar, qoe.e(-1, -1, 119));
                jlb jlbVar2 = this.d;
                rw9 rw9Var2 = this.O;
                nw9 nw9Var = new nw9(this, (byte) 1);
                hlb hlbVar = jlbVar2.a;
                if (hlbVar != null) {
                    hlbVar.b(1.5f, rw9Var2, nw9Var);
                    Choreographer.getInstance().postFrameCallback(jlbVar2.b);
                } else {
                    ilb ilbVar = new ilb(rw9Var2, nw9Var);
                    ilbVar.g = 1.5f;
                    jlbVar2.c.add(ilbVar);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            ut3 ut3Var = this.F;
            if (ut3Var != null) {
                PowerManager.WakeLock wakeLock = ut3Var.h;
                SensorManager sensorManager = ut3Var.a;
                if (ut3Var.n) {
                    Sensor sensor = ut3Var.f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(ut3Var, sensor);
                    }
                    Sensor sensor2 = ut3Var.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(ut3Var, sensor2);
                    }
                    Sensor sensor3 = ut3Var.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(ut3Var, sensor3);
                    }
                    sensorManager.unregisterListener(ut3Var, ut3Var.c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    ut3Var.n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.O.setTranslationX(gm.R1(this.G, 0.0f, this.s));
            this.O.setTranslationY(gm.R1(this.H, this.J, this.s));
            hg5 hg5Var = this.y;
            if (hg5Var != null) {
                hg5Var.setTranslationX(gm.R1(this.G, 0.0f, this.s));
                this.y.setTranslationY(gm.R1(this.H, this.J, this.s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        k47 k47Var;
        int i;
        int i2;
        he heVar = this.d0;
        if (heVar != null) {
            heVar.dismiss();
            this.d0 = null;
        } else if (!this.c0 && (k47Var = this.N) != null && !k47Var.O3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.M, getContext());
            if (this.T) {
                i = 2131743279;
            } else {
                i = 2131743201;
            }
            String M0 = jb6.M0(i, null);
            he heVar2 = alertDialog$Builder.a;
            heVar2.S = M0;
            if (this.T) {
                i2 = 2131743280;
            } else {
                i2 = 2131743202;
            }
            heVar2.U = jb6.M0(i2, null);
            alertDialog$Builder.j(jb6.M0(2131751708, null), new pw9(this, (byte) 1));
            alertDialog$Builder.g(jb6.M0(2131751535, null), new pw9(this, (byte) 2));
            this.d0 = heVar2;
            heVar2.show();
            TextView textView = (TextView) this.d0.c(-2);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ne6 ne6Var = this.b;
        setContentView(ne6Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i;
        boolean z = e21.a;
        attributes.flags = i | (-2013060864);
        gm.f2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        ne6Var.setSystemUiVisibility(1284);
        gm.j3(ne6Var, !cmb.I.o());
    }

    @Override
    public final void show() {
        if (gm.K1(getContext())) {
            super.show();
            rc2 rc2Var = this.P;
            if (rc2Var != null) {
                rc2Var.setVisibility(4);
            }
            gm.j2(new ts9(this, rc2Var), 14.0f);
            this.X = true;
            a(true, null);
            jm1 jm1Var = this.Y;
            if (jm1Var != null) {
                gm.c3(jm1Var);
                this.Y = null;
            }
            ut3 ut3Var = this.F;
            if (ut3Var != null) {
                PowerManager.WakeLock wakeLock = ut3Var.h;
                SensorManager sensorManager = ut3Var.a;
                if (!ut3Var.n) {
                    Sensor sensor = ut3Var.f;
                    if (sensor != null) {
                        sensorManager.registerListener(ut3Var, sensor, 30000);
                    }
                    Sensor sensor2 = ut3Var.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(ut3Var, sensor2, 30000);
                    }
                    Sensor sensor3 = ut3Var.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(ut3Var, sensor3, 30000);
                    }
                    sensorManager.registerListener(ut3Var, ut3Var.c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    ut3Var.n = true;
                }
            }
        }
    }
}
