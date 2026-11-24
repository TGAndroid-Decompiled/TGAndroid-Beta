package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class mr0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final or0 d;

    public mr0(or0 or0Var) {
        this.d = or0Var;
    }

    public final void a() {
        if (this.b != null && this.c != null) {
            or0 or0Var = this.d;
            if (or0Var.k != null) {
                this.a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.b, this.c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        cv0 cv0Var = or0Var.k;
                        cv0Var.c("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        or0 or0Var = this.d;
        oz ozVar = or0Var.q;
        if (ozVar != null) {
            gl.r(ozVar);
            or0Var.q = null;
        }
        if (!or0Var.l && or0Var.k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.a;
            if (sensorEvent.sensor.getType() == 1) {
                this.b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.c = sensorEvent.values;
            }
            long j = or0Var.h;
            if (currentTimeMillis < j) {
                oz ozVar2 = new oz(this, (byte) 25);
                or0Var.q = ozVar2;
                gl.d3(ozVar2, j - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
