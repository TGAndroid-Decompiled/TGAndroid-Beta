package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class u0 implements SensorEventListener {
    public long f18964a;
    public float[] f18965b;
    public float[] f18966c;
    public float[] d;
    public final v0 f18967e;

    public u0(v0 v0Var) {
        this.f18967e = v0Var;
    }

    public final void a() {
        if (this.f18965b != null) {
            v0 v0Var = this.f18967e;
            if (v0Var.f18990k != null) {
                this.f18964a = System.currentTimeMillis();
                if (this.f18966c == null) {
                    this.f18966c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f18965b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f18966c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f18966c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f18966c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.f18967e;
        kg.s0 s0Var = v0Var.f18998s;
        if (s0Var != null) {
            org.telegram.messenger.g0.r(s0Var);
            v0Var.f18998s = null;
        }
        if (!v0Var.f18991l && v0Var.f18990k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18964a;
            long j3 = v0Var.f18989j;
            if (currentTimeMillis < j3) {
                kg.s0 s0Var2 = new kg.s0(this, 11);
                v0Var.f18998s = s0Var2;
                org.telegram.messenger.g0.h3(s0Var2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f18965b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
