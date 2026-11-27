package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
public final class lnb implements SensorEventListener {
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
                aob.h = 1.0f;
            } else {
                ceil = ((float) Math.ceil((Math.log(f) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
                aob.h = ceil;
            }
            long j = 1800;
            if (ceil <= aob.q) {
                MediaController z = MediaController.z();
                if (z.J) {
                    if (!z.I()) {
                        r47 r47Var = z.v0;
                        if (r47Var != null && (r47.Q4(r47Var.k) || z.v0.g4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (aob.j) {
                    aob.j = false;
                    hl.r(aob.l);
                }
                if (!aob.k) {
                    aob.k = true;
                    tv tvVar = aob.m;
                    if (Math.abs(aob.i - SystemClock.elapsedRealtime()) < 12000) {
                        j = 12000;
                    }
                    hl.d3(tvVar, j);
                    return;
                }
                return;
            }
            if (aob.k) {
                aob.k = false;
                hl.r(aob.m);
            }
            if (!aob.j) {
                aob.j = true;
                tv tvVar2 = aob.l;
                if (Math.abs(aob.i - SystemClock.elapsedRealtime()) < 12000) {
                    j = 12000;
                }
                hl.d3(tvVar2, j);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
