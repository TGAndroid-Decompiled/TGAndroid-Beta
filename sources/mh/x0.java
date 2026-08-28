package mh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements SensorEventListener {
    public long f18193a;
    public float[] f18194b;
    public float[] f18195c;
    public float[] d;
    public final y0 f18196e;

    public x0(y0 y0Var) {
        this.f18196e = y0Var;
    }

    public final void a() {
        if (this.f18194b != null) {
            y0 y0Var = this.f18196e;
            if (y0Var.f18219k != null) {
                this.f18193a = System.currentTimeMillis();
                if (this.f18195c == null) {
                    this.f18195c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f18194b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f18195c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f18195c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f18195c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        y0 y0Var = this.f18196e;
        kh.f1 f1Var = y0Var.f18227s;
        if (f1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f1Var);
            y0Var.f18227s = null;
        }
        if (!y0Var.f18220l && y0Var.f18219k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f18193a;
            long j10 = y0Var.f18218j;
            if (currentTimeMillis < j10) {
                kh.f1 f1Var2 = new kh.f1(this, 28);
                y0Var.f18227s = f1Var2;
                AndroidUtilities.runOnUIThread(f1Var2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f18194b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }
}
