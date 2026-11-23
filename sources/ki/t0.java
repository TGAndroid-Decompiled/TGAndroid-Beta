package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public long f18947a;
    public float[] f18948b;
    public float[] f18949c;
    public final v0 d;

    public t0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        if (this.f18948b != null && this.f18949c != null) {
            v0 v0Var = this.d;
            if (v0Var.f18990k != null) {
                this.f18947a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f18948b, this.f18949c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.s0 s0Var = v0Var.f18990k;
                        s0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.d;
        kg.s0 s0Var = v0Var.f18996q;
        if (s0Var != null) {
            org.telegram.messenger.g0.r(s0Var);
            v0Var.f18996q = null;
        }
        if (!v0Var.f18991l && v0Var.f18990k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18947a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f18948b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f18949c = sensorEvent.values;
            }
            long j3 = v0Var.h;
            if (currentTimeMillis < j3) {
                kg.s0 s0Var2 = new kg.s0(this, 10);
                v0Var.f18996q = s0Var2;
                org.telegram.messenger.g0.h3(s0Var2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
