package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements SensorEventListener {
    public long f8742a;
    public float[] f8743b;
    public float[] f8744c;
    public float[] d;
    public final a1 e;

    public z0(a1 a1Var) {
        this.e = a1Var;
    }

    public final void a() {
        if (this.f8743b != null) {
            a1 a1Var = this.e;
            if (a1Var.f8208k != null) {
                this.f8742a = System.currentTimeMillis();
                if (this.f8744c == null) {
                    this.f8744c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f8743b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f8744c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f8744c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f8744c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.e;
        qc qcVar = a1Var.f8216s;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            a1Var.f8216s = null;
        }
        if (!a1Var.f8209l && a1Var.f8208k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8742a;
            long j3 = a1Var.f8207j;
            if (currentTimeMillis < j3) {
                qc qcVar2 = new qc(this, 12);
                a1Var.f8216s = qcVar2;
                AndroidUtilities.runOnUIThread(qcVar2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f8743b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
