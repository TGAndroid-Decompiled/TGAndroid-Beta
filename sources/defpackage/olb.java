package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
public final class olb implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float ceil;
        float f = sensorEvent.values[0];
        if (f <= 0.0f) {
            f = 0.1f;
        }
        if (!a.x && a.w) {
            if (f > 500.0f) {
                ceil = 1.0f;
                cmb.h = 1.0f;
            } else {
                ceil = ((float) Math.ceil((Math.log(f) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
                cmb.h = ceil;
            }
            long j = 1800;
            if (ceil <= cmb.q) {
                MediaController w = MediaController.w();
                if (w.J) {
                    if (!w.E()) {
                        k47 k47Var = w.v0;
                        if (k47Var != null && (k47.Q4(k47Var.k) || w.v0.g4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (cmb.j) {
                    cmb.j = false;
                    gm.r(cmb.l);
                }
                if (!cmb.k) {
                    cmb.k = true;
                    sw swVar = cmb.m;
                    if (Math.abs(cmb.i - SystemClock.elapsedRealtime()) < 12000) {
                        j = 12000;
                    }
                    gm.d3(swVar, j);
                    return;
                }
                return;
            }
            if (cmb.k) {
                cmb.k = false;
                gm.r(cmb.m);
            }
            if (!cmb.j) {
                cmb.j = true;
                sw swVar2 = cmb.l;
                if (Math.abs(cmb.i - SystemClock.elapsedRealtime()) < 12000) {
                    j = 12000;
                }
                gm.d3(swVar2, j);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
