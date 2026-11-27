package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class ur0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public final wr0 d;

    public ur0(wr0 wr0Var) {
        this.d = wr0Var;
    }

    public final void a() {
        if (this.b != null && this.c != null) {
            wr0 wr0Var = this.d;
            if (wr0Var.k != null) {
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
                        nv0 nv0Var = wr0Var.k;
                        nv0Var.c("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        wr0 wr0Var = this.d;
        pz pzVar = wr0Var.q;
        if (pzVar != null) {
            hl.r(pzVar);
            wr0Var.q = null;
        }
        if (!wr0Var.l && wr0Var.k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.a;
            if (sensorEvent.sensor.getType() == 1) {
                this.b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.c = sensorEvent.values;
            }
            long j = wr0Var.h;
            if (currentTimeMillis < j) {
                pz pzVar2 = new pz(this, (byte) 27);
                wr0Var.q = pzVar2;
                hl.d3(pzVar2, j - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
