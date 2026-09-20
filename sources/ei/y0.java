package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ci.uc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public long f8744a;
    public float[] f8745b;
    public float[] f8746c;
    public final a1 d;

    public y0(a1 a1Var) {
        this.d = a1Var;
    }

    public final void a() {
        if (this.f8745b != null && this.f8746c != null) {
            a1 a1Var = this.d;
            if (a1Var.f8224k != null) {
                this.f8744a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f8745b, this.f8746c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.z0 z0Var = a1Var.f8224k;
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
        uc ucVar = a1Var.f8230q;
        if (ucVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ucVar);
            a1Var.f8230q = null;
        }
        if (!a1Var.f8225l && a1Var.f8224k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8744a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f8745b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f8746c = sensorEvent.values;
            }
            long j3 = a1Var.h;
            if (currentTimeMillis < j3) {
                uc ucVar2 = new uc(this, 11);
                a1Var.f8230q = ucVar2;
                AndroidUtilities.runOnUIThread(ucVar2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
