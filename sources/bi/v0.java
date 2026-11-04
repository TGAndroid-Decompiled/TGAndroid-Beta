package bi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class v0 implements SensorEventListener {
    public final a1 f3877a;

    public v0(a1 a1Var) {
        this.f3877a = a1Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        a1 a1Var = this.f3877a;
        a1Var.I6 = f10;
        float f11 = fArr[1];
        a1Var.J6 = f11;
        float f12 = fArr[2];
        if (!a1Var.M6) {
            a1Var.K6 = f10;
            a1Var.L6 = f11;
            a1Var.M6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
