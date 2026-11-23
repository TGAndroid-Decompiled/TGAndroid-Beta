package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class u0 implements SensorEventListener {
    public long f18998a;
    public float[] f18999b;
    public float[] f19000c;
    public float[] d;
    public final v0 f19001e;

    public u0(v0 v0Var) {
        this.f19001e = v0Var;
    }

    public final void a() {
        if (this.f18999b != null) {
            v0 v0Var = this.f19001e;
            if (v0Var.f19024k != null) {
                this.f18998a = System.currentTimeMillis();
                if (this.f19000c == null) {
                    this.f19000c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f18999b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f19000c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f19000c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f19000c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.s0 s0Var = v0Var.f19024k;
                    s0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.f19001e;
        kg.i0 i0Var = v0Var.f19032s;
        if (i0Var != null) {
            org.telegram.messenger.g0.r(i0Var);
            v0Var.f19032s = null;
        }
        if (!v0Var.f19025l && v0Var.f19024k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18998a;
            long j3 = v0Var.f19023j;
            if (currentTimeMillis < j3) {
                kg.i0 i0Var2 = new kg.i0(this, 12);
                v0Var.f19032s = i0Var2;
                org.telegram.messenger.g0.h3(i0Var2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f18999b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
