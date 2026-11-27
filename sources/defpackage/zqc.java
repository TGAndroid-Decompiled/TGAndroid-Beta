package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
public final class zqc extends FrameLayout implements SensorEventListener {
    public static final Object o0 = new Object();
    public final boolean E;
    public final float[] F;
    public final float[] G;
    public final irc H;
    public final int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public long W;
    public boolean a;
    public boolean a0;
    public wqc b;
    public boolean b0;
    public int c;
    public ValueAnimator c0;
    public ov8 d;
    public float d0;
    public final pa2 e;
    public float e0;
    public final h8b f;
    public float f0;
    public float g0;
    public final a81 h;
    public float h0;
    public float i0;
    public int j0;
    public int k0;
    public final bva l0;
    public float m0;
    public final yqc n;
    public float n0;
    public final h8b r;
    public final oxb s;
    public final float[] w;
    public final SensorManager x;
    public final Sensor y;

    public zqc(Context context, int i, int i2) {
        super(context);
        this.s = new oxb();
        this.w = new float[8];
        this.F = new float[9];
        this.G = new float[3];
        this.H = new Object();
        this.J = -0.22f;
        this.K = -0.28f;
        this.Q = -1;
        this.f0 = 1.0f;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.l0 = new bva(this, (byte) 15);
        this.c = i;
        boolean z = false;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        setCameraDistance(hl.L(4800.0f));
        iye.b(this, 0.02f, 1.2f);
        pa2 pa2Var = new pa2(this, context);
        this.e = pa2Var;
        addView(pa2Var, tre.e(-1, -1, 17));
        h8b h8bVar = new h8b(context);
        this.f = h8bVar;
        h8bVar.setPadding(2, 2, 2, 2);
        h8bVar.setLayerType(2, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(-2, -2, -2, -2);
        pa2Var.addView(h8bVar, layoutParams);
        a81 a81Var = new a81(this, context);
        this.h = a81Var;
        h8bVar.addView(a81Var, tre.e(-1, -1, 17));
        yqc yqcVar = new yqc(this, context);
        this.n = yqcVar;
        h8bVar.addView(yqcVar, tre.e(-1, -1, 17));
        h8b h8bVar2 = new h8b((byte) 8, context, this);
        this.r = h8bVar2;
        h8bVar2.setClipChildren(false);
        h8bVar2.setClipToPadding(false);
        h8bVar2.setLayerType(2, null);
        h8bVar2.setPivotX(0.0f);
        h8bVar2.setPivotY(0.0f);
        h8bVar.addView(h8bVar2, tre.e(336, 205, 51));
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        defaultSensor = defaultSensor == null ? sensorManager.getDefaultSensor(4) : defaultSensor;
        this.y = defaultSensor;
        if (defaultSensor != null && defaultSensor.getType() != 4) {
            z = true;
        }
        this.E = z;
        xqc xqcVar = new xqc(this, (byte) 1);
        if (wqc.j0 && wqc.p0.get(Integer.valueOf(i)) != null) {
            this.b = new wqc(context.getApplicationContext(), i, i2, xqcVar);
            return;
        }
        pa2Var.setVisibility(4);
        wqc.l0.postRunnable(new rm1(this, context, i, i2, xqcVar));
    }

    public static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
            this.c0 = null;
        }
        float f = this.O;
        float f2 = this.P;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.c0 = ofFloat;
        ofFloat.setDuration(600L);
        c00.o(1.2f, this.c0);
        this.c0.addUpdateListener(new gy1(this, f, f2, (byte) 8));
        this.c0.addListener(new omb(this, (byte) 27));
        this.c0.start();
    }

    public final void b(float f, float f2) {
        boolean z;
        float[] fArr;
        this.d0 = f;
        this.g0 = f2;
        float f3 = f + this.m0;
        float f4 = f2 + this.n0;
        if (Math.cos(Math.toRadians(f4)) * Math.cos(Math.toRadians(f3)) < 0.0d) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.a;
        yqc yqcVar = this.n;
        if (z2 != z) {
            this.a = z;
            this.r.invalidate();
            yqcVar.invalidate();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.h0 == f3 && this.i0 == f4 && this.j0 == width && this.k0 == height) {
            return;
        }
        this.h0 = f3;
        this.i0 = f4;
        this.j0 = width;
        this.k0 = height;
        if (width > 0 && height > 0) {
            this.s.a(width, height, f3, f4, z, this.w);
            wqc wqcVar = this.b;
            if (wqcVar != null) {
                float[] fArr2 = wqcVar.n;
                float[] fArr3 = wqcVar.m;
                float[] fArr4 = wqcVar.k;
                float[] fArr5 = wqcVar.l;
                int[] iArr = wqcVar.o;
                wqcVar.r = z;
                float[] fArr6 = wqcVar.i;
                if (z) {
                    fArr = fArr5;
                } else {
                    fArr = fArr4;
                    fArr4 = fArr5;
                }
                oxb oxbVar = this.s;
                oxbVar.getClass();
                int i = 0;
                while (i < fArr6.length / 2) {
                    int i2 = i << 1;
                    float f5 = (fArr6[i2 + 1] * (-1.212122f)) + 0.618561f;
                    float f6 = ((fArr6[i2] * 2.0f) - 1.0f) * 1.0f;
                    float b = oxbVar.b(-0.0125f, f5, f6, width, height, fArr, i2);
                    float[] fArr7 = fArr;
                    float[] fArr8 = fArr4;
                    fArr3[i] = (b + oxbVar.b(0.0125f, f5, f6, width, height, fArr8, i2)) * 0.5f;
                    i++;
                    oxbVar = oxbVar;
                    fArr4 = fArr8;
                    fArr6 = fArr6;
                    iArr = iArr;
                    fArr = fArr7;
                }
                int[] iArr2 = iArr;
                wqcVar.q = width / 336.0f;
                int i3 = 0;
                while (i3 < 76) {
                    int i4 = i3 + 1;
                    fArr2[i3] = (fArr3[i3] + fArr3[i4 % 76]) * 0.5f;
                    iArr2[i3] = i3;
                    i3 = i4;
                }
                for (int i5 = 1; i5 < 76; i5++) {
                    int i6 = iArr2[i5];
                    int i7 = i5 - 1;
                    while (i7 >= 0) {
                        int i8 = iArr2[i7];
                        if (fArr2[i8] < fArr2[i6]) {
                            iArr2[i7 + 1] = i8;
                            i7--;
                        }
                    }
                    iArr2[i7 + 1] = i6;
                }
            }
            pa2 pa2Var = this.e;
            int width2 = pa2Var.getWidth();
            int height2 = pa2Var.getHeight();
            if (width2 != 0 && height2 != 0) {
                float[] fArr9 = (float[]) pa2Var.b;
                fArr9[0] = 0.0f;
                fArr9[1] = 0.0f;
                float f7 = width2;
                fArr9[2] = f7;
                fArr9[3] = 0.0f;
                fArr9[4] = f7;
                float f8 = height2;
                fArr9[5] = f8;
                fArr9[6] = 0.0f;
                fArr9[7] = f8;
                pa2Var.c = ((Matrix) pa2Var.d).setPolyToPoly(fArr9, 0, this.w, 0, 4);
                pa2Var.invalidate();
            }
        }
        wqc wqcVar2 = this.b;
        if (wqcVar2 != null) {
            wqcVar2.k(f3, f4);
        }
        this.h.invalidate();
        yqcVar.invalidate();
    }

    public final void d(int i, MotionEvent motionEvent) {
        this.Q = motionEvent.getPointerId(i);
        this.R = motionEvent.getX(i);
        this.S = motionEvent.getY(i);
        this.T = this.O;
        this.U = this.P;
    }

    public final void e() {
        boolean z;
        SensorManager sensorManager = this.x;
        if (sensorManager != null) {
            if (this.a0 && isShown() && getWindowVisibility() == 0 && hasWindowFocus()) {
                z = true;
            } else {
                z = false;
            }
            if (this.b0 != z) {
                this.b0 = z;
                bva bvaVar = this.l0;
                removeCallbacks(bvaVar);
                if (z) {
                    this.W = 0L;
                    Sensor sensor = this.y;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 1);
                    }
                    postOnAnimation(bvaVar);
                    return;
                }
                sensorManager.unregisterListener(this);
            }
        }
    }

    public float getCardRotationX() {
        return this.d0;
    }

    public float getCardRotationY() {
        return this.g0;
    }

    public FrameLayout getFrontFace() {
        return this.r;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a0 = true;
        this.W = 0L;
        irc ircVar = this.H;
        ircVar.a = false;
        ircVar.h = 0L;
        ircVar.i = 0L;
        ircVar.j = 0L;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        e();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.a0 = false;
        e();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
            this.c0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(size / 1.64f), 1073741824));
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.E) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.F;
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = this.G;
            SensorManager.getOrientation(fArr2, fArr3);
            if (!Float.isNaN(fArr3[1]) && !Float.isNaN(fArr3[2])) {
                this.J = c((float) Math.sin(fArr3[2]), -0.82f, 0.82f);
                this.K = c(-((float) Math.sin(fArr3[1])), -0.82f, 0.82f);
            } else {
                return;
            }
        } else {
            long j = this.W;
            if (j != 0) {
                float f = ((float) (sensorEvent.timestamp - j)) * 1.0E-9f;
                if (f > 0.0f && f < 0.1f) {
                    this.J = c(bp1.v(sensorEvent.values[1], f, -0.75f, this.J), -0.82f, 0.82f);
                    this.K = c(c00.x(sensorEvent.values[0], f, -0.75f, this.K), -0.82f, 0.82f);
                }
            }
            this.W = sensorEvent.timestamp;
        }
        float f2 = ((-this.K) / 0.82f) * 15.0f;
        float f3 = (this.J / 0.82f) * 15.0f;
        long j2 = sensorEvent.timestamp;
        irc ircVar = this.H;
        ircVar.getClass();
        if (!Float.isNaN(f2) && !Float.isInfinite(f2) && !Float.isNaN(f3) && !Float.isInfinite(f3)) {
            ircVar.b = f2;
            ircVar.c = f3;
            ircVar.i = j2;
            if (!ircVar.a) {
                ircVar.a = true;
                ircVar.d = f2;
                ircVar.e = f3;
                ircVar.f = f2;
                ircVar.g = f3;
                ircVar.h = j2;
                return;
            }
            float f4 = f2 - ircVar.f;
            float f5 = f3 - ircVar.g;
            if ((f5 * f5) + (f4 * f4) > 1.265625f) {
                ircVar.f = f2;
                ircVar.g = f3;
                ircVar.h = j2;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = i / hl.L(336.0f);
        h8b h8bVar = this.r;
        h8bVar.setScaleX(L);
        h8bVar.setScaleY(i2 / hl.L(205.0f));
        b(this.d0, this.g0);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.Q) {
                                for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                                    if (i != motionEvent.getActionIndex()) {
                                        d(i, motionEvent);
                                        return true;
                                    }
                                }
                            }
                        } else {
                            d(motionEvent.getActionIndex(), motionEvent);
                            this.V = true;
                            setPressed(false);
                            return true;
                        }
                    } else {
                        this.Q = -1;
                        getParent().requestDisallowInterceptTouchEvent(false);
                        setPressed(false);
                        if (this.V) {
                            a();
                            return true;
                        }
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.Q);
                    if (findPointerIndex >= 0) {
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs = Math.abs(x - this.R);
                        float f = this.I;
                        if (abs > f || Math.abs(y - this.S) > f) {
                            this.V = true;
                            setPressed(false);
                        }
                        if (this.V) {
                            float f2 = this.U;
                            this.P = c(qu6.B(x, this.R, 0.03f, f2), f2 - 32.0f, f2 + 32.0f);
                            float f3 = this.T;
                            this.O = c(qu6.B(y, this.S, 0.03f, f3), f3 - 22.0f, f3 + 22.0f);
                        }
                    }
                }
                return true;
            }
            this.Q = -1;
            getParent().requestDisallowInterceptTouchEvent(false);
            setPressed(false);
            if (this.V) {
                a();
                return true;
            }
            postDelayed(new xqc(this, (byte) 0), Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
            this.c0 = null;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        d(0, motionEvent);
        this.V = false;
        setPressed(true);
        return true;
    }

    @Override
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        e();
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        e();
    }

    @Override
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        e();
    }

    @Override
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAdditionalTilt(float f) {
        float f2 = this.e0;
        if (f2 == f) {
            return;
        }
        this.e0 = f;
        b((this.d0 + f) - f2, this.g0);
    }

    public void setCardIcon(int i) {
        yqc yqcVar = this.n;
        zqc zqcVar = yqcVar.b;
        zqcVar.c = i;
        wqc wqcVar = zqcVar.b;
        if (wqcVar != null) {
            wqcVar.j(i);
        }
        yqcVar.invalidate();
    }

    public void setHasCardNumber(boolean z) {
        yqc yqcVar = this.n;
        yqcVar.a = z;
        yqcVar.invalidate();
    }

    public void setStickerStyle(float[] fArr) {
        a81 a81Var = this.h;
        a81Var.b = fArr;
        this.e.invalidate();
        a81Var.invalidate();
        this.n.invalidate();
    }

    public void setUseGyroscope(float f) {
        if (this.f0 == f) {
            return;
        }
        this.f0 = f;
        b((this.M * f) + this.O + this.e0, (this.N * f) + this.P);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
