package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.x8;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public long f9673a;
    public float[] f9674b;
    public float[] f9675c;
    public float[] d;
    public final z0 e;

    public y0(z0 z0Var) {
        this.e = z0Var;
    }

    public final void a() {
        if (this.f9674b != null) {
            z0 z0Var = this.e;
            if (z0Var.f9694k != null) {
                this.f9673a = System.currentTimeMillis();
                if (this.f9675c == null) {
                    this.f9675c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f9674b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f9675c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f9675c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f9675c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.z0 z0Var2 = z0Var.f9694k;
                    z0Var2.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        z0 z0Var = this.e;
        x8 x8Var = z0Var.f9702s;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            z0Var.f9702s = null;
        }
        if (!z0Var.f9695l && z0Var.f9694k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9673a;
            long j10 = z0Var.f9693j;
            if (currentTimeMillis < j10) {
                x8 x8Var2 = new x8(this, 18);
                z0Var.f9702s = x8Var2;
                AndroidUtilities.runOnUIThread(x8Var2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f9674b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
