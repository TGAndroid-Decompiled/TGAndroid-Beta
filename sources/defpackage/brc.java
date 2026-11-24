package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
public final class brc implements SensorEventListener {
    public final float[] a = new float[3];
    public final float[] b = new float[3];
    public int c;
    public final WindowManager d;
    public final SensorManager e;
    public final Sensor f;
    public boolean h;
    public arc n;

    public brc(Context context) {
        this.d = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.e = sensorManager;
        this.f = sensorManager.getDefaultSensor(1);
    }

    public static float a(int i, int i2) {
        float f = i;
        float L = gl.L(16.0f) << 1;
        float f2 = (f + L) / f;
        float f3 = i2;
        return Math.max(f2, (L + f3) / f3);
    }

    public final void b(boolean z) {
        if (this.h != z) {
            this.h = z;
            Sensor sensor = this.f;
            if (sensor != null) {
                SensorManager sensorManager = this.e;
                if (z) {
                    sensorManager.registerListener(this, sensor, 1);
                } else {
                    sensorManager.unregisterListener(this);
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brc.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
