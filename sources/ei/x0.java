package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import ci.rc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements SensorEventListener {
    public final int f8702a;
    public long f8703b;
    public float[] f8704c;
    public final a1 d;

    public x0(a1 a1Var, int i10) {
        this.f8702a = i10;
        switch (i10) {
            case 1:
                this.d = a1Var;
                this.f8704c = new float[3];
                return;
            default:
                this.d = a1Var;
                return;
        }
    }

    public final void c() {
        switch (this.f8702a) {
            case 0:
                a1 a1Var = this.d;
                if (a1Var.f8207k != null && this.f8704c != null) {
                    this.f8703b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f8704c[0]);
                        jSONObject.put("y", -this.f8704c[1]);
                        jSONObject.put("z", -this.f8704c[2]);
                        org.telegram.ui.web.y0 y0Var = a1Var.f8207k;
                        y0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f8704c;
                a1 a1Var2 = this.d;
                if (a1Var2.f8207k != null) {
                    this.f8703b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.y0 y0Var2 = a1Var2.f8207k;
                        y0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        int i11 = this.f8702a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f8702a) {
            case 0:
                a1 a1Var = this.d;
                rc rcVar = a1Var.f8209m;
                if (rcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar);
                    a1Var.f8209m = null;
                }
                if (!a1Var.f8208l && a1Var.f8207k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f8703b;
                    this.f8704c = sensorEvent.values;
                    long j3 = a1Var.f8202c;
                    if (currentTimeMillis < j3) {
                        rc rcVar2 = new rc(this, 9);
                        a1Var.f8209m = rcVar2;
                        AndroidUtilities.runOnUIThread(rcVar2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                a1 a1Var2 = this.d;
                rc rcVar3 = a1Var2.f8211o;
                if (rcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(rcVar3);
                    a1Var2.f8211o = null;
                }
                if (!a1Var2.f8208l && a1Var2.f8207k != null) {
                    float[] fArr = this.f8704c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f8703b;
                    long j10 = a1Var2.e;
                    if (currentTimeMillis2 < j10) {
                        rc rcVar4 = new rc(this, 10);
                        a1Var2.f8211o = rcVar4;
                        AndroidUtilities.runOnUIThread(rcVar4, j10 - currentTimeMillis2);
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
