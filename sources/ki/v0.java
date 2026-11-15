package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class v0 implements SensorEventListener {
    public long f18597a;
    public float[] f18598b;
    public float[] f18599c;
    public float[] d;
    public final w0 f18600e;

    public v0(w0 w0Var) {
        this.f18600e = w0Var;
    }

    public final void a() {
        if (this.f18598b != null) {
            w0 w0Var = this.f18600e;
            if (w0Var.f18622k != null) {
                this.f18597a = System.currentTimeMillis();
                if (this.f18599c == null) {
                    this.f18599c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f18598b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f18599c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f18599c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f18599c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        w0 w0Var = this.f18600e;
        kg.j1 j1Var = w0Var.f18630s;
        if (j1Var != null) {
            org.telegram.messenger.g0.r(j1Var);
            w0Var.f18630s = null;
        }
        if (!w0Var.f18623l && w0Var.f18622k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18597a;
            long j3 = w0Var.f18621j;
            if (currentTimeMillis < j3) {
                kg.j1 j1Var2 = new kg.j1(this, 8);
                w0Var.f18630s = j1Var2;
                org.telegram.messenger.g0.i3(j1Var2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f18598b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
