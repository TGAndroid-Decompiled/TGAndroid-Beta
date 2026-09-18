package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.uc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements SensorEventListener {
    public long f8756a;
    public float[] f8757b;
    public float[] f8758c;
    public float[] d;
    public final a1 e;

    public z0(a1 a1Var) {
        this.e = a1Var;
    }

    public final void a() {
        if (this.f8757b != null) {
            a1 a1Var = this.e;
            if (a1Var.f8223k != null) {
                this.f8756a = System.currentTimeMillis();
                if (this.f8758c == null) {
                    this.f8758c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f8757b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f8758c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f8758c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f8758c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.z0 z0Var = a1Var.f8223k;
                    z0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.e;
        uc ucVar = a1Var.f8231s;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            a1Var.f8231s = null;
        }
        if (!a1Var.f8224l && a1Var.f8223k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8756a;
            long j3 = a1Var.f8222j;
            if (currentTimeMillis < j3) {
                uc ucVar2 = new uc(this, 12);
                a1Var.f8231s = ucVar2;
                AndroidUtilities.runOnUIThread(ucVar2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f8757b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
