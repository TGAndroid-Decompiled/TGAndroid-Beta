package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import fi.ua;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class d1 implements SensorEventListener {
    public long f12937a;
    public float[] f12938b;
    public float[] f12939c;
    public final f1 d;

    public d1(f1 f1Var) {
        this.d = f1Var;
    }

    public final void a() {
        if (this.f12938b != null && this.f12939c != null) {
            f1 f1Var = this.d;
            if (f1Var.f12970k != null) {
                this.f12937a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f12938b, this.f12939c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
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
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        f1 f1Var = this.d;
        ua uaVar = f1Var.f12976q;
        if (uaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uaVar);
            f1Var.f12976q = null;
        }
        if (!f1Var.f12971l && f1Var.f12970k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f12937a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f12938b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f12939c = sensorEvent.values;
            }
            long j10 = f1Var.h;
            if (currentTimeMillis < j10) {
                ua uaVar2 = new ua(this, 12);
                f1Var.f12976q = uaVar2;
                AndroidUtilities.runOnUIThread(uaVar2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
