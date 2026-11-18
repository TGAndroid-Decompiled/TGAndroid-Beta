package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class v0 implements SensorEventListener {
    public long f18988a;
    public float[] f18989b;
    public float[] f18990c;
    public float[] d;
    public final w0 f18991e;

    public v0(w0 w0Var) {
        this.f18991e = w0Var;
    }

    public final void a() {
        if (this.f18989b != null) {
            w0 w0Var = this.f18991e;
            if (w0Var.f19014k != null) {
                this.f18988a = System.currentTimeMillis();
                if (this.f18990c == null) {
                    this.f18990c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f18989b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f18990c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f18990c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f18990c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.s0 s0Var = w0Var.f19014k;
                    s0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        w0 w0Var = this.f18991e;
        kg.j0 j0Var = w0Var.f19022s;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            w0Var.f19022s = null;
        }
        if (!w0Var.f19015l && w0Var.f19014k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18988a;
            long j3 = w0Var.f19013j;
            if (currentTimeMillis < j3) {
                kg.j0 j0Var2 = new kg.j0(this, 12);
                w0Var.f19022s = j0Var2;
                org.telegram.messenger.g0.h3(j0Var2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f18989b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
