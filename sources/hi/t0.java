package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import fi.h9;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public long f14952a;
    public float[] f14953b;
    public float[] f14954c;
    public final v0 d;

    public t0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        if (this.f14953b != null && this.f14954c != null) {
            v0 v0Var = this.d;
            if (v0Var.f14987k != null) {
                this.f14952a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f14953b, this.f14954c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.u0 u0Var = v0Var.f14987k;
                        u0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.d;
        h9 h9Var = v0Var.f14993q;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            v0Var.f14993q = null;
        }
        if (!v0Var.f14988l && v0Var.f14987k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f14952a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f14953b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f14954c = sensorEvent.values;
            }
            long j3 = v0Var.h;
            if (currentTimeMillis < j3) {
                h9 h9Var2 = new h9(this, 16);
                v0Var.f14993q = h9Var2;
                org.telegram.messenger.g0.i3(h9Var2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
