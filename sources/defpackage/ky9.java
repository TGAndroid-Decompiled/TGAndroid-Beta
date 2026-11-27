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
public final class ky9 extends Dialog {
    public TextView E;
    public final ct3 F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public vnb M;
    public r47 N;
    public jy9 O;
    public wb2 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public p40 W;
    public boolean X;
    public fm1 Y;
    public ue2 Z;
    public final Activity a;
    public final fy9 a0;
    public final d26 b;
    public float b0;
    public final iy9 c;
    public boolean c0;
    public hnb d;
    public id d0;
    public mq5 e;
    public ValueAnimator e0;
    public Bitmap f;
    public ValueAnimator f0;
    public BitmapShader h;
    public Paint n;
    public Matrix r;
    public float s;
    public float w;
    public kfc x;
    public kg5 y;

    public ky9(Activity activity) {
        super(activity, 2131755352);
        this.e = mq5.e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        this.a0 = new fy9(this, (byte) 0);
        this.b0 = 0.0f;
        this.c0 = false;
        this.a = activity;
        hl.S(getWindow());
        d26 d26Var = new d26((byte) 20, activity, this);
        this.b = d26Var;
        d26Var.setOnClickListener(new gy9(this, (byte) 0));
        iy9 iy9Var = new iy9(this, activity);
        this.c = iy9Var;
        iy9Var.setClipToPadding(false);
        d26Var.addView(iy9Var, tre.e(-1, -1, 119));
        hy9 hy9Var = new hy9(this, (byte) 0);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(d26Var, hy9Var);
        if (xea.p0) {
            this.F = new ct3();
        }
    }

    public final void a(boolean z, fy9 fy9Var) {
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
        ofFloat.addUpdateListener(new e20((byte) 8, this, z));
        this.e0.addListener(new rw(this, z, fy9Var, (byte) 12));
        if (!z && this.Z == null) {
            j = 330;
        } else {
            j = 520;
        }
        ValueAnimator valueAnimator3 = this.e0;
        k43 k43Var = k43.h;
        valueAnimator3.setInterpolator(k43Var);
        this.e0.setDuration(j);
        this.e0.start();
        float f4 = this.w;
        if (z) {
            f3 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f4, f3);
        this.f0 = ofFloat2;
        ofFloat2.addUpdateListener(new b49(this, (byte) 17));
        this.f0.addListener(new gf4((byte) 29, this, z));
        this.f0.setDuration(((float) j) * 1.5f);
        this.f0.setInterpolator(k43Var);
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
            d26 d26Var = this.b;
            if (d26Var.getWidth() > 0) {
                wb2 wb2Var = this.P;
                if (wb2Var != null) {
                    int[] iArr = new int[2];
                    wb2Var.getLocationOnScreen(iArr);
                    int width = d26Var.getWidth();
                    mq5 mq5Var = this.e;
                    this.G = (iArr[0] - this.e.a) - ((((width - mq5Var.a) - mq5Var.c) - this.P.getWidth()) / 2.0f);
                    int height = d26Var.getHeight();
                    mq5 mq5Var2 = this.e;
                    this.H = qd4.x(((height - mq5Var2.b) - mq5Var2.d) - this.P.getHeight(), this.L, 2.0f, iArr[1] - this.e.b);
                    if (!this.K) {
                        this.K = true;
                        float i = (Utilities.i((this.P.getHeight() / 2.0f) + iArr[1], d26Var.getHeight() * 0.7f, d26Var.getHeight() * 0.3f) - (this.P.getHeight() / 2.0f)) - ((d26Var.getHeight() - this.P.getHeight()) / 2.0f);
                        this.J = i;
                        if (this.T) {
                            this.J = 0.0f;
                        } else {
                            this.J = hl.R1(0.0f, i, 0.78f);
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
        jy9 jy9Var;
        if (!this.c0) {
            id idVar = this.d0;
            if (idVar != null) {
                idVar.dismiss();
                this.d0 = null;
            }
            this.c0 = true;
            kg5 kg5Var = this.y;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            kfc kfcVar = this.x;
            if (kfcVar != null) {
                kfcVar.f0();
                this.x.l0();
                this.x = null;
            }
            if (!this.T && (jy9Var = this.O) != null && jy9Var.getSeekBarWaveform() != null) {
                xy9 seekBarWaveform = this.O.getSeekBarWaveform();
                seekBarWaveform.L = this.s;
                wb2 wb2Var = seekBarWaveform.n;
                if (wb2Var != null) {
                    wb2Var.invalidate();
                }
            }
            this.I = false;
            d();
            a(false, new fy9(this, (byte) 3));
            d26 d26Var = this.b;
            d26Var.invalidate();
            ue2 ue2Var = this.Z;
            if (ue2Var != null) {
                wb2 wb2Var2 = this.P;
                if (wb2Var2 != null) {
                    wb2Var2.Ab = true;
                }
                hl.c3(ue2Var);
                this.Z = null;
                hnb hnbVar = new hnb(this.a, null);
                this.d = hnbVar;
                d26Var.addView(hnbVar, tre.e(-1, -1, 119));
                hnb hnbVar2 = this.d;
                jy9 jy9Var2 = this.O;
                fy9 fy9Var = new fy9(this, (byte) 1);
                fnb fnbVar = hnbVar2.a;
                if (fnbVar != null) {
                    fnbVar.b(1.5f, jy9Var2, fy9Var);
                    Choreographer.getInstance().postFrameCallback(hnbVar2.b);
                } else {
                    gnb gnbVar = new gnb(jy9Var2, fy9Var);
                    gnbVar.g = 1.5f;
                    hnbVar2.c.add(gnbVar);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            ct3 ct3Var = this.F;
            if (ct3Var != null) {
                PowerManager.WakeLock wakeLock = ct3Var.h;
                SensorManager sensorManager = ct3Var.a;
                if (ct3Var.n) {
                    Sensor sensor = ct3Var.f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(ct3Var, sensor);
                    }
                    Sensor sensor2 = ct3Var.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(ct3Var, sensor2);
                    }
                    Sensor sensor3 = ct3Var.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(ct3Var, sensor3);
                    }
                    sensorManager.unregisterListener(ct3Var, ct3Var.c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    ct3Var.n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.O.setTranslationX(hl.R1(this.G, 0.0f, this.s));
            this.O.setTranslationY(hl.R1(this.H, this.J, this.s));
            kg5 kg5Var = this.y;
            if (kg5Var != null) {
                kg5Var.setTranslationX(hl.R1(this.G, 0.0f, this.s));
                this.y.setTranslationY(hl.R1(this.H, this.J, this.s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        r47 r47Var;
        int i;
        int i2;
        id idVar = this.d0;
        if (idVar != null) {
            idVar.dismiss();
            this.d0 = null;
        } else if (!this.c0 && (r47Var = this.N) != null && !r47Var.O3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.M, getContext());
            if (this.T) {
                i = 2131743247;
            } else {
                i = 2131743169;
            }
            String M0 = ob6.M0(i, null);
            id idVar2 = alertDialog$Builder.a;
            idVar2.S = M0;
            if (this.T) {
                i2 = 2131743248;
            } else {
                i2 = 2131743170;
            }
            idVar2.U = ob6.M0(i2, null);
            alertDialog$Builder.j(ob6.M0(2131751736, null), new hy9(this, (byte) 1));
            alertDialog$Builder.g(ob6.M0(2131751563, null), new hy9(this, (byte) 2));
            this.d0 = idVar2;
            idVar2.show();
            TextView textView = (TextView) this.d0.c(-2);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
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
        d26 d26Var = this.b;
        setContentView(d26Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i;
        boolean z = f11.a;
        attributes.flags = i | (-2013060864);
        hl.f2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        d26Var.setSystemUiVisibility(1284);
        hl.j3(d26Var, !aob.I.o());
    }

    @Override
    public final void show() {
        if (hl.K1(getContext())) {
            super.show();
            wb2 wb2Var = this.P;
            if (wb2Var != null) {
                wb2Var.setVisibility(4);
            }
            hl.j2(new ku9(this, wb2Var), 14.0f);
            this.X = true;
            a(true, null);
            fm1 fm1Var = this.Y;
            if (fm1Var != null) {
                hl.c3(fm1Var);
                this.Y = null;
            }
            ct3 ct3Var = this.F;
            if (ct3Var != null) {
                PowerManager.WakeLock wakeLock = ct3Var.h;
                SensorManager sensorManager = ct3Var.a;
                if (!ct3Var.n) {
                    Sensor sensor = ct3Var.f;
                    if (sensor != null) {
                        sensorManager.registerListener(ct3Var, sensor, 30000);
                    }
                    Sensor sensor2 = ct3Var.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(ct3Var, sensor2, 30000);
                    }
                    Sensor sensor3 = ct3Var.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(ct3Var, sensor3, 30000);
                    }
                    sensorManager.registerListener(ct3Var, ct3Var.c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    ct3Var.n = true;
                }
            }
        }
    }
}
