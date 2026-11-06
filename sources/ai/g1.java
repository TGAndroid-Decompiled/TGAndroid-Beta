package ai;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class g1 implements SensorEventListener {
    public final l1 f1201a;

    public g1(l1 l1Var) {
        this.f1201a = l1Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        l1 l1Var = this.f1201a;
        l1Var.H6 = f10;
        float f11 = fArr[1];
        l1Var.I6 = f11;
        float f12 = fArr[2];
        if (!l1Var.L6) {
            l1Var.J6 = f10;
            l1Var.K6 = f11;
            l1Var.L6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
