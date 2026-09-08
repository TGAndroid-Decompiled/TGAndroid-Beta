package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import di.nb;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class z0 implements SensorEventListener {
    public long f10152a;
    public float[] f10153b;
    public float[] f10154c;
    public float[] d;
    public final a1 f10155e;

    public z0(a1 a1Var) {
        this.f10155e = a1Var;
    }

    public final void a() {
        if (this.f10153b != null) {
            a1 a1Var = this.f10155e;
            if (a1Var.f9565k != null) {
                this.f10152a = System.currentTimeMillis();
                if (this.f10154c == null) {
                    this.f10154c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f10153b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f10154c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f10154c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f10154c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a1 a1Var = this.f10155e;
        nb nbVar = a1Var.f9573s;
        if (nbVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nbVar);
            a1Var.f9573s = null;
        }
        if (!a1Var.f9566l && a1Var.f9565k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f10152a;
            long j3 = a1Var.f9564j;
            if (currentTimeMillis < j3) {
                nb nbVar2 = new nb(this, 16);
                a1Var.f9573s = nbVar2;
                AndroidUtilities.runOnUIThread(nbVar2, j3 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f10153b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
