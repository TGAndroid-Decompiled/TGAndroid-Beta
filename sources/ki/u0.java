package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class u0 implements SensorEventListener {
    public long f18968a;
    public float[] f18969b;
    public float[] f18970c;
    public final w0 d;

    public u0(w0 w0Var) {
        this.d = w0Var;
    }

    public final void a() {
        if (this.f18969b != null && this.f18970c != null) {
            w0 w0Var = this.d;
            if (w0Var.f19011k != null) {
                this.f18968a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f18969b, this.f18970c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.s0 s0Var = w0Var.f19011k;
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
        kg.j0 j0Var = w0Var.f19017q;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            w0Var.f19017q = null;
        }
        if (!w0Var.f19012l && w0Var.f19011k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18968a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f18969b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f18970c = sensorEvent.values;
            }
            long j3 = w0Var.h;
            if (currentTimeMillis < j3) {
                kg.j0 j0Var2 = new kg.j0(this, 11);
                w0Var.f19017q = j0Var2;
                org.telegram.messenger.g0.h3(j0Var2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
