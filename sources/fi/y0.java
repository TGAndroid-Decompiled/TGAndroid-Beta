package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.x8;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public long f9670a;
    public float[] f9671b;
    public float[] f9672c;
    public float[] d;
    public final z0 e;

    public y0(z0 z0Var) {
        this.e = z0Var;
    }

    public final void a() {
        if (this.f9671b != null) {
            z0 z0Var = this.e;
            if (z0Var.f9691k != null) {
                this.f9670a = System.currentTimeMillis();
                if (this.f9672c == null) {
                    this.f9672c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f9671b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f9672c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f9672c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f9672c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.y0 y0Var = z0Var.f9691k;
                    y0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        z0 z0Var = this.e;
        x8 x8Var = z0Var.f9699s;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            z0Var.f9699s = null;
        }
        if (!z0Var.f9692l && z0Var.f9691k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9670a;
            long j10 = z0Var.f9690j;
            if (currentTimeMillis < j10) {
                x8 x8Var2 = new x8(this, 18);
                z0Var.f9699s = x8Var2;
                AndroidUtilities.runOnUIThread(x8Var2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f9671b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
