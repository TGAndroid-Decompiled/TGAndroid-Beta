package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.nb;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements SensorEventListener {
    public long f10124a;
    public float[] f10125b;
    public float[] f10126c;
    public float[] d;
    public final a1 f10127e;

    public z0(a1 a1Var) {
        this.f10127e = a1Var;
    }

    public final void a() {
        if (this.f10125b != null) {
            a1 a1Var = this.f10127e;
            if (a1Var.f9537k != null) {
                this.f10124a = System.currentTimeMillis();
                if (this.f10126c == null) {
                    this.f10126c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f10125b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f10126c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f10126c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f10126c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.f10127e;
        nb nbVar = a1Var.f9545s;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            a1Var.f9545s = null;
        }
        if (!a1Var.f9538l && a1Var.f9537k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f10124a;
            long j3 = a1Var.f9536j;
            if (currentTimeMillis < j3) {
                nb nbVar2 = new nb(this, 16);
                a1Var.f9545s = nbVar2;
                AndroidUtilities.runOnUIThread(nbVar2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f10125b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
