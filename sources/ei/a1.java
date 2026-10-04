package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class a1 implements SensorEventListener {
    public long f8908a;
    public float[] f8909b;
    public float[] f8910c;
    public float[] d;
    public final b1 f8911e;

    public a1(b1 b1Var) {
        this.f8911e = b1Var;
    }

    public final void a() {
        if (this.f8909b != null) {
            b1 b1Var = this.f8911e;
            if (b1Var.f8932k != null) {
                this.f8908a = System.currentTimeMillis();
                if (this.f8910c == null) {
                    this.f8910c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f8909b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f8910c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f8910c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f8910c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        b1 b1Var = this.f8911e;
        qc qcVar = b1Var.f8940s;
        if (qcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qcVar);
            b1Var.f8940s = null;
        }
        if (!b1Var.f8933l && b1Var.f8932k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8908a;
            long j3 = b1Var.f8931j;
            if (currentTimeMillis < j3) {
                qc qcVar2 = new qc(this, 12);
                b1Var.f8940s = qcVar2;
                AndroidUtilities.runOnUIThread(qcVar2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f8909b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
