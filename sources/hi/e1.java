package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import fi.ua;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class e1 implements SensorEventListener {
    public long f12952a;
    public float[] f12953b;
    public float[] f12954c;
    public float[] d;
    public final f1 e;

    public e1(f1 f1Var) {
        this.e = f1Var;
    }

    public final void a() {
        if (this.f12953b != null) {
            f1 f1Var = this.e;
            if (f1Var.f12970k != null) {
                this.f12952a = System.currentTimeMillis();
                if (this.f12954c == null) {
                    this.f12954c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f12953b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f12954c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f12954c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f12954c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.x0 x0Var = f1Var.f12970k;
                    x0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        f1 f1Var = this.e;
        ua uaVar = f1Var.f12978s;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            f1Var.f12978s = null;
        }
        if (!f1Var.f12971l && f1Var.f12970k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f12952a;
            long j10 = f1Var.f12969j;
            if (currentTimeMillis < j10) {
                ua uaVar2 = new ua(this, 13);
                f1Var.f12978s = uaVar2;
                AndroidUtilities.runOnUIThread(uaVar2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f12953b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
