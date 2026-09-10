package di;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import bi.wc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class c1 implements SensorEventListener {
    public long f6554a;
    public float[] f6555b;
    public float[] f6556c;
    public float[] d;
    public final d1 e;

    public c1(d1 d1Var) {
        this.e = d1Var;
    }

    public final void a() {
        if (this.f6555b != null) {
            d1 d1Var = this.e;
            if (d1Var.f6579k != null) {
                this.f6554a = System.currentTimeMillis();
                if (this.f6556c == null) {
                    this.f6556c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f6555b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f6556c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f6556c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f6556c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        d1 d1Var = this.e;
        wc wcVar = d1Var.f6587s;
        if (wcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(wcVar);
            d1Var.f6587s = null;
        }
        if (!d1Var.f6580l && d1Var.f6579k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f6554a;
            long j3 = d1Var.f6578j;
            if (currentTimeMillis < j3) {
                wc wcVar2 = new wc(this, 18);
                d1Var.f6587s = wcVar2;
                AndroidUtilities.runOnUIThread(wcVar2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f6555b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
