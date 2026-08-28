package mh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class w0 implements SensorEventListener {
    public long f18181a;
    public float[] f18182b;
    public float[] f18183c;
    public final y0 d;

    public w0(y0 y0Var) {
        this.d = y0Var;
    }

    public final void a() {
        if (this.f18182b != null && this.f18183c != null) {
            y0 y0Var = this.d;
            if (y0Var.f18219k != null) {
                this.f18181a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f18182b, this.f18183c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.v0 v0Var = y0Var.f18219k;
                        v0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        y0 y0Var = this.d;
        kh.f1 f1Var = y0Var.f18225q;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            y0Var.f18225q = null;
        }
        if (!y0Var.f18220l && y0Var.f18219k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18181a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f18182b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f18183c = sensorEvent.values;
            }
            long j10 = y0Var.h;
            if (currentTimeMillis < j10) {
                kh.f1 f1Var2 = new kh.f1(this, 27);
                y0Var.f18225q = f1Var2;
                AndroidUtilities.runOnUIThread(f1Var2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }
}
