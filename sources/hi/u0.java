package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import fi.v9;
import org.json.JSONObject;
public final class u0 implements SensorEventListener {
    public long f14974a;
    public float[] f14975b;
    public float[] f14976c;
    public float[] d;
    public final v0 f14977e;

    public u0(v0 v0Var) {
        this.f14977e = v0Var;
    }

    public final void a() {
        if (this.f14975b != null) {
            v0 v0Var = this.f14977e;
            if (v0Var.f14992k != null) {
                this.f14974a = System.currentTimeMillis();
                if (this.f14976c == null) {
                    this.f14976c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f14975b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f14976c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f14976c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f14976c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.f14977e;
        v9 v9Var = v0Var.f15000s;
        if (v9Var != null) {
            org.telegram.messenger.g0.r(v9Var);
            v0Var.f15000s = null;
        }
        if (!v0Var.f14993l && v0Var.f14992k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f14974a;
            long j3 = v0Var.f14991j;
            if (currentTimeMillis < j3) {
                v9 v9Var2 = new v9(this, 16);
                v0Var.f15000s = v9Var2;
                org.telegram.messenger.g0.i3(v9Var2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f14975b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
