package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.rc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements SensorEventListener {
    public long f9513a;
    public float[] f9514b;
    public float[] f9515c;
    public float[] d;
    public final a1 f9516e;

    public z0(a1 a1Var) {
        this.f9516e = a1Var;
    }

    public final void a() {
        if (this.f9514b != null) {
            a1 a1Var = this.f9516e;
            if (a1Var.f8929k != null) {
                this.f9513a = System.currentTimeMillis();
                if (this.f9515c == null) {
                    this.f9515c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f9514b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f9515c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f9515c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f9515c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.y0 y0Var = a1Var.f8929k;
                    y0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.f9516e;
        rc rcVar = a1Var.f8937s;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            a1Var.f8937s = null;
        }
        if (!a1Var.f8930l && a1Var.f8929k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9513a;
            long j3 = a1Var.f8928j;
            if (currentTimeMillis < j3) {
                rc rcVar2 = new rc(this, 12);
                a1Var.f8937s = rcVar2;
                AndroidUtilities.runOnUIThread(rcVar2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f9514b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
