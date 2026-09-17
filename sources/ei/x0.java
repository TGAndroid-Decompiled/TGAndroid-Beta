package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import ci.uc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements SensorEventListener {
    public final int f8719a;
    public long f8720b;
    public float[] f8721c;
    public final a1 d;

    public x0(a1 a1Var, int i10) {
        this.f8719a = i10;
        switch (i10) {
            case 1:
                this.d = a1Var;
                this.f8721c = new float[3];
                return;
            default:
                this.d = a1Var;
                return;
        }
    }

    public final void c() {
        switch (this.f8719a) {
            case 0:
                a1 a1Var = this.d;
                if (a1Var.f8224k != null && this.f8721c != null) {
                    this.f8720b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f8721c[0]);
                        jSONObject.put("y", -this.f8721c[1]);
                        jSONObject.put("z", -this.f8721c[2]);
                        org.telegram.ui.web.z0 z0Var = a1Var.f8224k;
                        z0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f8721c;
                a1 a1Var2 = this.d;
                if (a1Var2.f8224k != null) {
                    this.f8720b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.z0 z0Var2 = a1Var2.f8224k;
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
        int i11 = this.f8719a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f8719a) {
            case 0:
                a1 a1Var = this.d;
                uc ucVar = a1Var.f8226m;
                if (ucVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar);
                    a1Var.f8226m = null;
                }
                if (!a1Var.f8225l && a1Var.f8224k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f8720b;
                    this.f8721c = sensorEvent.values;
                    long j3 = a1Var.f8219c;
                    if (currentTimeMillis < j3) {
                        uc ucVar2 = new uc(this, 9);
                        a1Var.f8226m = ucVar2;
                        AndroidUtilities.runOnUIThread(ucVar2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                a1 a1Var2 = this.d;
                uc ucVar3 = a1Var2.f8228o;
                if (ucVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(ucVar3);
                    a1Var2.f8228o = null;
                }
                if (!a1Var2.f8225l && a1Var2.f8224k != null) {
                    float[] fArr = this.f8721c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f8720b;
                    long j10 = a1Var2.e;
                    if (currentTimeMillis2 < j10) {
                        uc ucVar4 = new uc(this, 10);
                        a1Var2.f8228o = ucVar4;
                        AndroidUtilities.runOnUIThread(ucVar4, j10 - currentTimeMillis2);
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
