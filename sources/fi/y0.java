package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.nb;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public long f10133a;
    public float[] f10134b;
    public float[] f10135c;
    public final a1 d;

    public y0(a1 a1Var) {
        this.d = a1Var;
    }

    public final void a() {
        if (this.f10134b != null && this.f10135c != null) {
            a1 a1Var = this.d;
            if (a1Var.f9565k != null) {
                this.f10133a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f10134b, this.f10135c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.z0 z0Var = a1Var.f9565k;
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
        nb nbVar = a1Var.f9571q;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            a1Var.f9571q = null;
        }
        if (!a1Var.f9566l && a1Var.f9565k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f10133a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f10134b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f10135c = sensorEvent.values;
            }
            long j3 = a1Var.h;
            if (currentTimeMillis < j3) {
                nb nbVar2 = new nb(this, 15);
                a1Var.f9571q = nbVar2;
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
