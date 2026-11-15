package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class u0 implements SensorEventListener {
    public long f18580a;
    public float[] f18581b;
    public float[] f18582c;
    public final w0 d;

    public u0(w0 w0Var) {
        this.d = w0Var;
    }

    public final void a() {
        if (this.f18581b != null && this.f18582c != null) {
            w0 w0Var = this.d;
            if (w0Var.f18622k != null) {
                this.f18580a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f18581b, this.f18582c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.s0 s0Var = w0Var.f18622k;
                        s0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        w0 w0Var = this.d;
        kg.j1 j1Var = w0Var.f18628q;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
            w0Var.f18628q = null;
        }
        if (!w0Var.f18623l && w0Var.f18622k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18580a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f18581b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f18582c = sensorEvent.values;
            }
            long j3 = w0Var.h;
            if (currentTimeMillis < j3) {
                kg.j1 j1Var2 = new kg.j1(this, 7);
                w0Var.f18628q = j1Var2;
                org.telegram.messenger.g0.i3(j1Var2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
