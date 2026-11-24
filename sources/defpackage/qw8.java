package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class qw8 implements SensorEventListener {
    public final vw8 a;

    public qw8(vw8 vw8Var) {
        this.a = vw8Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        vw8 vw8Var = this.a;
        vw8Var.H6 = f;
        float f2 = fArr[1];
        vw8Var.I6 = f2;
        float f3 = fArr[2];
        if (!vw8Var.L6) {
            vw8Var.J6 = f;
            vw8Var.K6 = f2;
            vw8Var.L6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
