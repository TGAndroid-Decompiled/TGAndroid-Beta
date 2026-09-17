package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.nb;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public long f10105a;
    public float[] f10106b;
    public float[] f10107c;
    public final a1 d;

    public y0(a1 a1Var) {
        this.d = a1Var;
    }

    public final void a() {
        if (this.f10106b != null && this.f10107c != null) {
            a1 a1Var = this.d;
            if (a1Var.f9537k != null) {
                this.f10105a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f10106b, this.f10107c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.z0 z0Var = a1Var.f9537k;
                        z0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.d;
        nb nbVar = a1Var.f9543q;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            a1Var.f9543q = null;
        }
        if (!a1Var.f9538l && a1Var.f9537k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f10105a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f10106b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f10107c = sensorEvent.values;
            }
            long j3 = a1Var.h;
            if (currentTimeMillis < j3) {
                nb nbVar2 = new nb(this, 15);
                a1Var.f9543q = nbVar2;
                AndroidUtilities.runOnUIThread(nbVar2, j3 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
