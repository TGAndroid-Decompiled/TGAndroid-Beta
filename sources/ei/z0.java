package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements SensorEventListener {
    public long f9502a;
    public float[] f9503b;
    public float[] f9504c;
    public final b1 d;

    public z0(b1 b1Var) {
        this.d = b1Var;
    }

    public final void a() {
        if (this.f9503b != null && this.f9504c != null) {
            b1 b1Var = this.d;
            if (b1Var.f8932k != null) {
                this.f9502a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f9503b, this.f9504c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.z0 z0Var = b1Var.f8932k;
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
        qc qcVar = b1Var.f8938q;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            b1Var.f8938q = null;
        }
        if (!b1Var.f8933l && b1Var.f8932k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9502a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f9503b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f9504c = sensorEvent.values;
            }
            long j3 = b1Var.h;
            if (currentTimeMillis < j3) {
                qc qcVar2 = new qc(this, 11);
                b1Var.f8938q = qcVar2;
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
