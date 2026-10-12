package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.x8;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements SensorEventListener {
    public long f9656a;
    public float[] f9657b;
    public float[] f9658c;
    public final z0 d;

    public x0(z0 z0Var) {
        this.d = z0Var;
    }

    public final void a() {
        if (this.f9657b != null && this.f9658c != null) {
            z0 z0Var = this.d;
            if (z0Var.f9691k != null) {
                this.f9656a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f9657b, this.f9658c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
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
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        z0 z0Var = this.d;
        x8 x8Var = z0Var.f9697q;
        if (x8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x8Var);
            z0Var.f9697q = null;
        }
        if (!z0Var.f9692l && z0Var.f9691k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9656a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f9657b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f9658c = sensorEvent.values;
            }
            long j10 = z0Var.h;
            if (currentTimeMillis < j10) {
                x8 x8Var2 = new x8(this, 17);
                z0Var.f9697q = x8Var2;
                AndroidUtilities.runOnUIThread(x8Var2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
