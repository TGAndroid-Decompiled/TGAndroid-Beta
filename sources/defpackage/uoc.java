package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import java.util.WeakHashMap;
public final class uoc implements SensorEventListener {
    public static uoc H;
    public float E;
    public float F;
    public final SensorManager a;
    public final Sensor b;
    public final WindowManager c;
    public boolean r;
    public boolean s;
    public float w;
    public float x;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final WeakHashMap e = new WeakHashMap();
    public final float[] f = new float[9];
    public final float[] h = new float[9];
    public final float[] n = new float[3];
    public int y = -1;
    public final toc G = new toc(this);

    public uoc(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        this.c = (WindowManager) context.getSystemService("window");
        if (sensorManager == null) {
            defaultSensor = null;
        } else {
            defaultSensor = sensorManager.getDefaultSensor(15);
        }
        if (defaultSensor == null && sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        this.b = defaultSensor;
    }

    public final void a() {
        if (this.r) {
            this.a.unregisterListener(this);
        }
        this.s = false;
        this.r = false;
        this.d.removeCallbacks(this.G);
        this.F = 0.0f;
        this.E = 0.0f;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.c.getDefaultDisplay().getRotation();
        int i2 = this.y;
        if (i2 != rotation) {
            this.s = false;
            this.y = rotation;
        } else {
            rotation = i2;
        }
        int i3 = 129;
        if (rotation == 1) {
            i = 129;
            i3 = 2;
        } else {
            i = 130;
            if (rotation != 2) {
                if (rotation == 3) {
                    i3 = 130;
                    i = 1;
                } else {
                    i = 2;
                    i3 = 1;
                }
            }
        }
        float[] fArr3 = this.h;
        SensorManager.remapCoordinateSystem(fArr2, i3, i, fArr3);
        float[] fArr4 = this.n;
        SensorManager.getOrientation(fArr3, fArr4);
        if (!Float.isNaN(fArr4[1]) && !Float.isNaN(fArr4[2])) {
            if (!this.s) {
                this.w = fArr4[1];
                this.x = fArr4[2];
                this.s = true;
            }
            float x = kt6.x((float) Math.IEEEremainder(fArr4[2] - this.x, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float x2 = kt6.x((float) Math.IEEEremainder(fArr4[1] - this.w, 6.283185307179586d), 0.45f, 1.0f, -1.0f);
            float f = this.E;
            this.E = td4.A(x, f, 0.12f, f);
            float f2 = this.F;
            this.F = td4.A(x2, f2, 0.12f, f2);
            for (View view : this.e.keySet()) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
