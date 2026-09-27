package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public long f8729a;
    public float[] f8730b;
    public float[] f8731c;
    public final a1 d;

    public y0(a1 a1Var) {
        this.d = a1Var;
    }

    public final void a() {
        if (this.f8730b != null && this.f8731c != null) {
            a1 a1Var = this.d;
            if (a1Var.f8208k != null) {
                this.f8729a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f8730b, this.f8731c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.z0 z0Var = a1Var.f8208k;
                        z0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.d;
        qc qcVar = a1Var.f8214q;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            a1Var.f8214q = null;
        }
        if (!a1Var.f8209l && a1Var.f8208k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8729a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f8730b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f8731c = sensorEvent.values;
            }
            long j3 = a1Var.h;
            if (currentTimeMillis < j3) {
                qc qcVar2 = new qc(this, 11);
                a1Var.f8214q = qcVar2;
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
