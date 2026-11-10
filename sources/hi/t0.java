package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import fi.v9;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public long f14957a;
    public float[] f14958b;
    public float[] f14959c;
    public final v0 d;

    public t0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        if (this.f14958b != null && this.f14959c != null) {
            v0 v0Var = this.d;
            if (v0Var.f14992k != null) {
                this.f14957a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f14958b, this.f14959c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.u0 u0Var = v0Var.f14992k;
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
        v9 v9Var = v0Var.f14998q;
        if (v9Var != null) {
            org.telegram.messenger.g0.r(v9Var);
            v0Var.f14998q = null;
        }
        if (!v0Var.f14993l && v0Var.f14992k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f14957a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f14958b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f14959c = sensorEvent.values;
            }
            long j3 = v0Var.h;
            if (currentTimeMillis < j3) {
                v9 v9Var2 = new v9(this, 15);
                v0Var.f14998q = v9Var2;
                org.telegram.messenger.g0.i3(v9Var2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
