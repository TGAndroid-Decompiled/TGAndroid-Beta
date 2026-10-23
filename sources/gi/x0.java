package gi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ei.bc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements SensorEventListener {
    public long f11565a;
    public float[] f11566b;
    public float[] f11567c;
    public float[] d;
    public final y0 e;

    public x0(y0 y0Var) {
        this.e = y0Var;
    }

    public final void a() {
        if (this.f11566b != null) {
            y0 y0Var = this.e;
            if (y0Var.f11582k != null) {
                this.f11565a = System.currentTimeMillis();
                if (this.f11567c == null) {
                    this.f11567c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f11566b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f11567c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f11567c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f11567c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.y0 y0Var2 = y0Var.f11582k;
                    y0Var2.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        y0 y0Var = this.e;
        bc bcVar = y0Var.f11590s;
        if (bcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bcVar);
            y0Var.f11590s = null;
        }
        if (!y0Var.f11583l && y0Var.f11582k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f11565a;
            long j10 = y0Var.f11581j;
            if (currentTimeMillis < j10) {
                bc bcVar2 = new bc(this, 8);
                y0Var.f11590s = bcVar2;
                AndroidUtilities.runOnUIThread(bcVar2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f11566b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
