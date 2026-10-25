package ai;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class o1 implements SensorEventListener {
    public final t1 f1615a;

    public o1(t1 t1Var) {
        this.f1615a = t1Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        t1 t1Var = this.f1615a;
        t1Var.I6 = f7;
        float f10 = fArr[1];
        t1Var.J6 = f10;
        float f11 = fArr[2];
        if (!t1Var.M6) {
            t1Var.K6 = f7;
            t1Var.L6 = f10;
            t1Var.M6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
