package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.rc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public long f8727a;
    public float[] f8728b;
    public float[] f8729c;
    public final a1 d;

    public y0(a1 a1Var) {
        this.d = a1Var;
    }

    public final void a() {
        if (this.f8728b != null && this.f8729c != null) {
            a1 a1Var = this.d;
            if (a1Var.f8207k != null) {
                this.f8727a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f8728b, this.f8729c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.y0 y0Var = a1Var.f8207k;
                        y0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.d;
        rc rcVar = a1Var.f8213q;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            a1Var.f8213q = null;
        }
        if (!a1Var.f8208l && a1Var.f8207k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8727a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f8728b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f8729c = sensorEvent.values;
            }
            long j3 = a1Var.h;
            if (currentTimeMillis < j3) {
                rc rcVar2 = new rc(this, 11);
                a1Var.f8213q = rcVar2;
                AndroidUtilities.runOnUIThread(rcVar2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
