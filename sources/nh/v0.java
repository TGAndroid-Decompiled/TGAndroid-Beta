package nh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

public final class v0 implements SensorEventListener {

    public long f18998a;

    public float[] f18999b;

    public float[] f19000c;
    public final x0 d;

    public v0(x0 x0Var) {
        this.d = x0Var;
    }

    public final void a() {
        if (this.f18999b == null || this.f19000c == null) {
            return;
        }
        x0 x0Var = this.d;
        if (x0Var.f19034k == null) {
            return;
        }
        this.f18998a = System.currentTimeMillis();
        float[] fArr = new float[9];
        if (SensorManager.getRotationMatrix(fArr, new float[9], this.f18999b, this.f19000c)) {
            float[] fArr2 = new float[3];
            SensorManager.getOrientation(fArr, fArr2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("absolute", true);
                jSONObject.put("alpha", -fArr2[0]);
                jSONObject.put("beta", -fArr2[1]);
                jSONObject.put("gamma", fArr2[2]);
                x0Var.f19034k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        x0 x0Var = this.d;
        f0 f0Var = x0Var.f19040q;
        if (f0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f0Var);
            x0Var.f19040q = null;
        }
        if (x0Var.f19035l || x0Var.f19034k == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f18998a;
        if (sensorEvent.sensor.getType() == 1) {
            this.f18999b = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.f19000c = sensorEvent.values;
        }
        long j10 = x0Var.h;
        if (jCurrentTimeMillis >= j10) {
            a();
            return;
        }
        f0 f0Var2 = new f0(this, 4);
        x0Var.f19040q = f0Var2;
        AndroidUtilities.runOnUIThread(f0Var2, j10 - jCurrentTimeMillis);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
