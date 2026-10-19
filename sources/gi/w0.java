package gi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ei.bc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class w0 implements SensorEventListener {
    public long f11524a;
    public float[] f11525b;
    public float[] f11526c;
    public final y0 d;

    public w0(y0 y0Var) {
        this.d = y0Var;
    }

    public final void a() {
        if (this.f11525b != null && this.f11526c != null) {
            y0 y0Var = this.d;
            if (y0Var.f11557k != null) {
                this.f11524a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f11525b, this.f11526c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.x0 x0Var = y0Var.f11557k;
                        x0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        y0 y0Var = this.d;
        bc bcVar = y0Var.f11563q;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            y0Var.f11563q = null;
        }
        if (!y0Var.f11558l && y0Var.f11557k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f11524a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f11525b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f11526c = sensorEvent.values;
            }
            long j10 = y0Var.h;
            if (currentTimeMillis < j10) {
                bc bcVar2 = new bc(this, 7);
                y0Var.f11563q = bcVar2;
                AndroidUtilities.runOnUIThread(bcVar2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
