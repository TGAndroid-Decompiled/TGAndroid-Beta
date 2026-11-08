package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import fi.h9;
import org.json.JSONObject;
public final class u0 implements SensorEventListener {
    public long f14972a;
    public float[] f14973b;
    public float[] f14974c;
    public float[] d;
    public final v0 f14975e;

    public u0(v0 v0Var) {
        this.f14975e = v0Var;
    }

    public final void a() {
        if (this.f14973b != null) {
            v0 v0Var = this.f14975e;
            if (v0Var.f14990k != null) {
                this.f14972a = System.currentTimeMillis();
                if (this.f14974c == null) {
                    this.f14974c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f14973b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f14974c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f14974c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f14974c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.u0 u0Var = v0Var.f14990k;
                    u0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.f14975e;
        h9 h9Var = v0Var.f14998s;
        if (h9Var != null) {
            org.telegram.messenger.g0.r(h9Var);
            v0Var.f14998s = null;
        }
        if (!v0Var.f14991l && v0Var.f14990k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f14972a;
            long j3 = v0Var.f14989j;
            if (currentTimeMillis < j3) {
                h9 h9Var2 = new h9(this, 17);
                v0Var.f14998s = h9Var2;
                org.telegram.messenger.g0.i3(h9Var2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f14973b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
