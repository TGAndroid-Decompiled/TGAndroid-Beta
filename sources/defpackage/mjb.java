package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
public final class mjb implements SensorEventListener {
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
                bkb.h = 1.0f;
            } else {
                ceil = ((float) Math.ceil((Math.log(f) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
                bkb.h = ceil;
            }
            long j = 1800;
            if (ceil <= bkb.q) {
                MediaController w = MediaController.w();
                if (w.J) {
                    if (!w.E()) {
                        k27 k27Var = w.v0;
                        if (k27Var != null && (k27.Q4(k27Var.k) || w.v0.g4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (bkb.j) {
                    bkb.j = false;
                    gl.r(bkb.l);
                }
                if (!bkb.k) {
                    bkb.k = true;
                    sv svVar = bkb.m;
                    if (Math.abs(bkb.i - SystemClock.elapsedRealtime()) < 12000) {
                        j = 12000;
                    }
                    gl.d3(svVar, j);
                    return;
                }
                return;
            }
            if (bkb.k) {
                bkb.k = false;
                gl.r(bkb.m);
            }
            if (!bkb.j) {
                bkb.j = true;
                sv svVar2 = bkb.l;
                if (Math.abs(bkb.i - SystemClock.elapsedRealtime()) < 12000) {
                    j = 12000;
                }
                gl.d3(svVar2, j);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
