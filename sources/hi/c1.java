package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import fi.ua;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class c1 implements SensorEventListener {
    public final int f12908a;
    public long f12909b;
    public float[] f12910c;
    public final f1 d;

    public c1(f1 f1Var, int i10) {
        this.f12908a = i10;
        switch (i10) {
            case 1:
                this.d = f1Var;
                this.f12910c = new float[3];
                return;
            default:
                this.d = f1Var;
                return;
        }
    }

    public final void c() {
        switch (this.f12908a) {
            case 0:
                f1 f1Var = this.d;
                if (f1Var.f12971k != null && this.f12910c != null) {
                    this.f12909b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f12910c[0]);
                        jSONObject.put("y", -this.f12910c[1]);
                        jSONObject.put("z", -this.f12910c[2]);
                        org.telegram.ui.web.x0 x0Var = f1Var.f12971k;
                        x0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f12910c;
                f1 f1Var2 = this.d;
                if (f1Var2.f12971k != null) {
                    this.f12909b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.x0 x0Var2 = f1Var2.f12971k;
                        x0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        int i11 = this.f12908a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f12908a) {
            case 0:
                f1 f1Var = this.d;
                ua uaVar = f1Var.f12973m;
                if (uaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar);
                    f1Var.f12973m = null;
                }
                if (!f1Var.f12972l && f1Var.f12971k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f12909b;
                    this.f12910c = sensorEvent.values;
                    long j10 = f1Var.f12966c;
                    if (currentTimeMillis < j10) {
                        ua uaVar2 = new ua(this, 10);
                        f1Var.f12973m = uaVar2;
                        AndroidUtilities.runOnUIThread(uaVar2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                f1 f1Var2 = this.d;
                ua uaVar3 = f1Var2.f12975o;
                if (uaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(uaVar3);
                    f1Var2.f12975o = null;
                }
                if (!f1Var2.f12972l && f1Var2.f12971k != null) {
                    float[] fArr = this.f12910c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f12909b;
                    long j11 = f1Var2.e;
                    if (currentTimeMillis2 < j11) {
                        ua uaVar4 = new ua(this, 11);
                        f1Var2.f12975o = uaVar4;
                        AndroidUtilities.runOnUIThread(uaVar4, j11 - currentTimeMillis2);
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
