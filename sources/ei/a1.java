package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class a1 implements SensorEventListener {
    public long f8907a;
    public float[] f8908b;
    public float[] f8909c;
    public float[] d;
    public final b1 f8910e;

    public a1(b1 b1Var) {
        this.f8910e = b1Var;
    }

    public final void a() {
        if (this.f8908b != null) {
            b1 b1Var = this.f8910e;
            if (b1Var.f8931k != null) {
                this.f8907a = System.currentTimeMillis();
                if (this.f8909c == null) {
                    this.f8909c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f8908b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f8909c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f8909c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f8909c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        b1 b1Var = this.f8910e;
        qc qcVar = b1Var.f8939s;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            b1Var.f8939s = null;
        }
        if (!b1Var.f8932l && b1Var.f8931k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8907a;
            long j3 = b1Var.f8930j;
            if (currentTimeMillis < j3) {
                qc qcVar2 = new qc(this, 12);
                b1Var.f8939s = qcVar2;
                AndroidUtilities.runOnUIThread(qcVar2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f8908b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
