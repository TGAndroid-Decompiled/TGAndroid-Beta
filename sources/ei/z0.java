package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements SensorEventListener {
    public long f9501a;
    public float[] f9502b;
    public float[] f9503c;
    public final b1 d;

    public z0(b1 b1Var) {
        this.d = b1Var;
    }

    public final void a() {
        if (this.f9502b != null && this.f9503c != null) {
            b1 b1Var = this.d;
            if (b1Var.f8931k != null) {
                this.f9501a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f9502b, this.f9503c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.z0 z0Var = b1Var.f8931k;
                        z0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        b1 b1Var = this.d;
        qc qcVar = b1Var.f8937q;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            b1Var.f8937q = null;
        }
        if (!b1Var.f8932l && b1Var.f8931k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9501a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f9502b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f9503c = sensorEvent.values;
            }
            long j3 = b1Var.h;
            if (currentTimeMillis < j3) {
                qc qcVar2 = new qc(this, 11);
                b1Var.f8937q = qcVar2;
                AndroidUtilities.runOnUIThread(qcVar2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
