package di;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import bi.wc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class b1 implements SensorEventListener {
    public long f6536a;
    public float[] f6537b;
    public float[] f6538c;
    public final d1 d;

    public b1(d1 d1Var) {
        this.d = d1Var;
    }

    public final void a() {
        if (this.f6537b != null && this.f6538c != null) {
            d1 d1Var = this.d;
            if (d1Var.f6579k != null) {
                this.f6536a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f6537b, this.f6538c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.y0 y0Var = d1Var.f6579k;
                        y0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        d1 d1Var = this.d;
        wc wcVar = d1Var.f6585q;
        if (wcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wcVar);
            d1Var.f6585q = null;
        }
        if (!d1Var.f6580l && d1Var.f6579k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f6536a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f6537b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f6538c = sensorEvent.values;
            }
            long j3 = d1Var.h;
            if (currentTimeMillis < j3) {
                wc wcVar2 = new wc(this, 17);
                d1Var.f6585q = wcVar2;
                AndroidUtilities.runOnUIThread(wcVar2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
