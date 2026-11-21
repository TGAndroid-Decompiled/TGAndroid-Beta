package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public long f18978a;
    public float[] f18979b;
    public float[] f18980c;
    public final v0 d;

    public t0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        if (this.f18979b != null && this.f18980c != null) {
            v0 v0Var = this.d;
            if (v0Var.f19021k != null) {
                this.f18978a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f18979b, this.f18980c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.s0 s0Var = v0Var.f19021k;
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
        kg.i0 i0Var = v0Var.f19027q;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            v0Var.f19027q = null;
        }
        if (!v0Var.f19022l && v0Var.f19021k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18978a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f18979b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f18980c = sensorEvent.values;
            }
            long j3 = v0Var.h;
            if (currentTimeMillis < j3) {
                kg.i0 i0Var2 = new kg.i0(this, 11);
                v0Var.f19027q = i0Var2;
                org.telegram.messenger.g0.h3(i0Var2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
