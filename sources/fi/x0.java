package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.x8;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements SensorEventListener {
    public long f9659a;
    public float[] f9660b;
    public float[] f9661c;
    public final z0 d;

    public x0(z0 z0Var) {
        this.d = z0Var;
    }

    public final void a() {
        if (this.f9660b != null && this.f9661c != null) {
            z0 z0Var = this.d;
            if (z0Var.f9694k != null) {
                this.f9659a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f9660b, this.f9661c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.z0 z0Var2 = z0Var.f9694k;
                        z0Var2.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        z0 z0Var = this.d;
        x8 x8Var = z0Var.f9700q;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            z0Var.f9700q = null;
        }
        if (!z0Var.f9695l && z0Var.f9694k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9659a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f9660b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f9661c = sensorEvent.values;
            }
            long j10 = z0Var.h;
            if (currentTimeMillis < j10) {
                x8 x8Var2 = new x8(this, 17);
                z0Var.f9700q = x8Var2;
                AndroidUtilities.runOnUIThread(x8Var2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
