package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import di.nb;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements SensorEventListener {
    public final int f10077a;
    public long f10078b;
    public float[] f10079c;
    public final a1 d;

    public x0(a1 a1Var, int i10) {
        this.f10077a = i10;
        switch (i10) {
            case 1:
                this.d = a1Var;
                this.f10079c = new float[3];
                return;
            default:
                this.d = a1Var;
                return;
        }
    }

    public final void c() {
        switch (this.f10077a) {
            case 0:
                a1 a1Var = this.d;
                if (a1Var.f9537k != null && this.f10079c != null) {
                    this.f10078b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f10079c[0]);
                        jSONObject.put("y", -this.f10079c[1]);
                        jSONObject.put("z", -this.f10079c[2]);
                        org.telegram.ui.web.z0 z0Var = a1Var.f9537k;
                        z0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f10079c;
                a1 a1Var2 = this.d;
                if (a1Var2.f9537k != null) {
                    this.f10078b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.z0 z0Var2 = a1Var2.f9537k;
                        z0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
                    } catch (Exception unused2) {
                    }
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[2] = 0.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        int i11 = this.f10077a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f10077a) {
            case 0:
                a1 a1Var = this.d;
                nb nbVar = a1Var.f9539m;
                if (nbVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar);
                    a1Var.f9539m = null;
                }
                if (!a1Var.f9538l && a1Var.f9537k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f10078b;
                    this.f10079c = sensorEvent.values;
                    long j3 = a1Var.f9531c;
                    if (currentTimeMillis < j3) {
                        nb nbVar2 = new nb(this, 13);
                        a1Var.f9539m = nbVar2;
                        AndroidUtilities.runOnUIThread(nbVar2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                a1 a1Var2 = this.d;
                nb nbVar3 = a1Var2.f9541o;
                if (nbVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(nbVar3);
                    a1Var2.f9541o = null;
                }
                if (!a1Var2.f9538l && a1Var2.f9537k != null) {
                    float[] fArr = this.f10079c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f10078b;
                    long j10 = a1Var2.f9532e;
                    if (currentTimeMillis2 < j10) {
                        nb nbVar4 = new nb(this, 14);
                        a1Var2.f9541o = nbVar4;
                        AndroidUtilities.runOnUIThread(nbVar4, j10 - currentTimeMillis2);
                        return;
                    }
                    c();
                    return;
                }
                return;
        }
    }

    private final void a(Sensor sensor, int i10) {
    }

    private final void b(Sensor sensor, int i10) {
    }
}
