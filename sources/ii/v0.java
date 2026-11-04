package ii;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import gi.f6;
import org.json.JSONObject;
public final class v0 implements SensorEventListener {
    public long f15265a;
    public float[] f15266b;
    public float[] f15267c;
    public float[] d;
    public final w0 f15268e;

    public v0(w0 w0Var) {
        this.f15268e = w0Var;
    }

    public final void a() {
        if (this.f15266b != null) {
            w0 w0Var = this.f15268e;
            if (w0Var.f15292k != null) {
                this.f15265a = System.currentTimeMillis();
                if (this.f15267c == null) {
                    this.f15267c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f15266b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f15267c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f15267c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f15267c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        w0 w0Var = this.f15268e;
        f6 f6Var = w0Var.f15300s;
        if (f6Var != null) {
            org.telegram.messenger.g0.r(f6Var);
            w0Var.f15300s = null;
        }
        if (!w0Var.f15293l && w0Var.f15292k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f15265a;
            long j10 = w0Var.f15291j;
            if (currentTimeMillis < j10) {
                f6 f6Var2 = new f6(this, 20);
                w0Var.f15300s = f6Var2;
                org.telegram.messenger.g0.i3(f6Var2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f15266b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
