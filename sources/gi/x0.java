package gi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ei.bc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements SensorEventListener {
    public long f11538a;
    public float[] f11539b;
    public float[] f11540c;
    public float[] d;
    public final y0 e;

    public x0(y0 y0Var) {
        this.e = y0Var;
    }

    public final void a() {
        if (this.f11539b != null) {
            y0 y0Var = this.e;
            if (y0Var.f11555k != null) {
                this.f11538a = System.currentTimeMillis();
                if (this.f11540c == null) {
                    this.f11540c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f11539b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f11540c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f11540c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f11540c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.x0 x0Var = y0Var.f11555k;
                    x0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        y0 y0Var = this.e;
        bc bcVar = y0Var.f11563s;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            y0Var.f11563s = null;
        }
        if (!y0Var.f11556l && y0Var.f11555k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f11538a;
            long j10 = y0Var.f11554j;
            if (currentTimeMillis < j10) {
                bc bcVar2 = new bc(this, 8);
                y0Var.f11563s = bcVar2;
                AndroidUtilities.runOnUIThread(bcVar2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f11539b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
