package ci;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class u0 implements SensorEventListener {
    public final z0 f5826a;

    public u0(z0 z0Var) {
        this.f5826a = z0Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        z0 z0Var = this.f5826a;
        z0Var.I6 = f10;
        float f11 = fArr[1];
        z0Var.J6 = f11;
        float f12 = fArr[2];
        if (!z0Var.M6) {
            z0Var.K6 = f10;
            z0Var.L6 = f11;
            z0Var.M6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
