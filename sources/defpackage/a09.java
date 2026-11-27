package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class a09 implements SensorEventListener {
    public final f09 a;

    public a09(f09 f09Var) {
        this.a = f09Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        f09 f09Var = this.a;
        f09Var.H6 = f;
        float f2 = fArr[1];
        f09Var.I6 = f2;
        float f3 = fArr[2];
        if (!f09Var.L6) {
            f09Var.J6 = f;
            f09Var.K6 = f2;
            f09Var.L6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
