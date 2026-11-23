package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public long f19008a;
    public float[] f19009b;
    public float[] f19010c;
    public final v0 d;

    public t0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        if (this.f19009b != null && this.f19010c != null) {
            v0 v0Var = this.d;
            if (v0Var.f19087k != null) {
                this.f19008a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f19009b, this.f19010c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.s0 s0Var = v0Var.f19087k;
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
        kg.i0 i0Var = v0Var.f19093q;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            v0Var.f19093q = null;
        }
        if (!v0Var.f19088l && v0Var.f19087k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f19008a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f19009b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f19010c = sensorEvent.values;
            }
            long j3 = v0Var.h;
            if (currentTimeMillis < j3) {
                kg.i0 i0Var2 = new kg.i0(this, 11);
                v0Var.f19093q = i0Var2;
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
