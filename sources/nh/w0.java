package nh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

public final class w0 implements SensorEventListener {

    public long f19015a;

    public float[] f19016b;

    public float[] f19017c;
    public float[] d;

    public final x0 f19018e;

    public w0(x0 x0Var) {
        this.f19018e = x0Var;
    }

    public final void a() {
        if (this.f19016b == null) {
            return;
        }
        x0 x0Var = this.f19018e;
        if (x0Var.f19034k == null) {
            return;
        }
        this.f19015a = System.currentTimeMillis();
        if (this.f19017c == null) {
            this.f19017c = new float[9];
        }
        if (this.d == null) {
            this.d = new float[4];
        }
        float[] fArr = this.f19016b;
        if (fArr.length > 4) {
            System.arraycopy(fArr, 0, this.d, 0, 4);
            SensorManager.getRotationMatrixFromVector(this.f19017c, this.d);
        } else {
            SensorManager.getRotationMatrixFromVector(this.f19017c, fArr);
        }
        float[] fArr2 = new float[3];
        SensorManager.getOrientation(this.f19017c, fArr2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("absolute", false);
            jSONObject.put("alpha", -fArr2[0]);
            jSONObject.put("beta", -fArr2[1]);
            jSONObject.put("gamma", fArr2[2]);
            x0Var.f19034k.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
        } catch (Exception unused) {
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        x0 x0Var = this.f19018e;
        f0 f0Var = x0Var.f19042s;
        if (f0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f0Var);
            x0Var.f19042s = null;
        }
        if (x0Var.f19035l || x0Var.f19034k == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f19015a;
        long j10 = x0Var.f19033j;
        if (jCurrentTimeMillis < j10) {
            f0 f0Var2 = new f0(this, 5);
            x0Var.f19042s = f0Var2;
            AndroidUtilities.runOnUIThread(f0Var2, j10 - jCurrentTimeMillis);
        } else {
            if (sensorEvent.sensor.getType() == 15) {
                this.f19016b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
