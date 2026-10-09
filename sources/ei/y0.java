package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.rc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public long f9500a;
    public float[] f9501b;
    public float[] f9502c;
    public final a1 d;

    public y0(a1 a1Var) {
        this.d = a1Var;
    }

    public final void a() {
        if (this.f9501b != null && this.f9502c != null) {
            a1 a1Var = this.d;
            if (a1Var.f8930k != null) {
                this.f9500a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f9501b, this.f9502c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.y0 y0Var = a1Var.f8930k;
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
        rc rcVar = a1Var.f8936q;
        if (rcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rcVar);
            a1Var.f8936q = null;
        }
        if (!a1Var.f8931l && a1Var.f8930k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9500a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f9501b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f9502c = sensorEvent.values;
            }
            long j3 = a1Var.h;
            if (currentTimeMillis < j3) {
                rc rcVar2 = new rc(this, 11);
                a1Var.f8936q = rcVar2;
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
