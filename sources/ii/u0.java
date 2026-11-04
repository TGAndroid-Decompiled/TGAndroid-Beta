package ii;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import gi.f6;
import org.json.JSONObject;
public final class u0 implements SensorEventListener {
    public long f15249a;
    public float[] f15250b;
    public float[] f15251c;
    public final w0 d;

    public u0(w0 w0Var) {
        this.d = w0Var;
    }

    public final void a() {
        if (this.f15250b != null && this.f15251c != null) {
            w0 w0Var = this.d;
            if (w0Var.f15292k != null) {
                this.f15249a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f15250b, this.f15251c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.t0 t0Var = w0Var.f15292k;
                        t0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        w0 w0Var = this.d;
        f6 f6Var = w0Var.f15298q;
        if (f6Var != null) {
            org.telegram.messenger.g0.r(f6Var);
            w0Var.f15298q = null;
        }
        if (!w0Var.f15293l && w0Var.f15292k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f15249a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f15250b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f15251c = sensorEvent.values;
            }
            long j10 = w0Var.h;
            if (currentTimeMillis < j10) {
                f6 f6Var2 = new f6(this, 19);
                w0Var.f15298q = f6Var2;
                org.telegram.messenger.g0.i3(f6Var2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
