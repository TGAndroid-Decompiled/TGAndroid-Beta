package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class nr0 implements SensorEventListener {
    public long a;
    public float[] b;
    public float[] c;
    public float[] d;
    public final or0 e;

    public nr0(or0 or0Var) {
        this.e = or0Var;
    }

    public final void a() {
        if (this.b != null) {
            or0 or0Var = this.e;
            if (or0Var.k != null) {
                this.a = System.currentTimeMillis();
                float[] fArr = this.c;
                if (fArr == null) {
                    fArr = new float[9];
                    this.c = fArr;
                }
                float[] fArr2 = this.d;
                if (fArr2 == null) {
                    fArr2 = new float[4];
                    this.d = fArr2;
                }
                float[] fArr3 = this.b;
                if (fArr3.length > 4) {
                    System.arraycopy(fArr3, 0, fArr2, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(fArr, fArr3);
                }
                float[] fArr4 = new float[3];
                SensorManager.getOrientation(this.c, fArr4);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr4[0]);
                    jSONObject.put("beta", -fArr4[1]);
                    jSONObject.put("gamma", fArr4[2]);
                    cv0 cv0Var = or0Var.k;
                    cv0Var.c("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        or0 or0Var = this.e;
        oz ozVar = or0Var.s;
        if (ozVar != null) {
            gl.r(ozVar);
            or0Var.s = null;
        }
        if (!or0Var.l && or0Var.k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.a;
            long j = or0Var.j;
            if (currentTimeMillis < j) {
                oz ozVar2 = new oz(this, (byte) 26);
                or0Var.s = ozVar2;
                gl.e3(ozVar2, j - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
