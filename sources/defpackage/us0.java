package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class us0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final ws0 d;

    public us0(ws0 ws0Var) {
        this.d = ws0Var;
    }

    public final void a() {
        if (this.b != null && this.c != null) {
            ws0 ws0Var = this.d;
            if (ws0Var.k != null) {
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
                        mw0 mw0Var = ws0Var.k;
                        mw0Var.c("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ws0 ws0Var = this.d;
        f00 f00Var = ws0Var.q;
        if (f00Var != null) {
            gm.r(f00Var);
            ws0Var.q = null;
        }
        if (!ws0Var.l && ws0Var.k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.a;
            if (sensorEvent.sensor.getType() == 1) {
                this.b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.c = sensorEvent.values;
            }
            long j = ws0Var.h;
            if (currentTimeMillis < j) {
                f00 f00Var2 = new f00(this, (byte) 28);
                ws0Var.q = f00Var2;
                gm.d3(f00Var2, j - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
