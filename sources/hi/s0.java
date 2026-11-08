package hi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import fi.h9;
import org.json.JSONObject;
public final class s0 implements SensorEventListener {
    public final int f14943a;
    public long f14944b;
    public float[] f14945c;
    public final v0 d;

    public s0(v0 v0Var, int i7) {
        this.f14943a = i7;
        switch (i7) {
            case 1:
                this.d = v0Var;
                this.f14945c = new float[3];
                return;
            default:
                this.d = v0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f14943a) {
            case 0:
                v0 v0Var = this.d;
                if (v0Var.f14990k != null && this.f14945c != null) {
                    this.f14944b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f14945c[0]);
                        jSONObject.put("y", -this.f14945c[1]);
                        jSONObject.put("z", -this.f14945c[2]);
                        org.telegram.ui.web.u0 u0Var = v0Var.f14990k;
                        u0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f14945c;
                v0 v0Var2 = this.d;
                if (v0Var2.f14990k != null) {
                    this.f14944b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.u0 u0Var2 = v0Var2.f14990k;
                        u0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
    public final void onAccuracyChanged(Sensor sensor, int i7) {
        int i10 = this.f14943a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f14943a) {
            case 0:
                v0 v0Var = this.d;
                h9 h9Var = v0Var.f14992m;
                if (h9Var != null) {
                    org.telegram.messenger.g0.r(h9Var);
                    v0Var.f14992m = null;
                }
                if (!v0Var.f14991l && v0Var.f14990k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f14944b;
                    this.f14945c = sensorEvent.values;
                    long j3 = v0Var.f14984c;
                    if (currentTimeMillis < j3) {
                        h9 h9Var2 = new h9(this, 14);
                        v0Var.f14992m = h9Var2;
                        org.telegram.messenger.g0.i3(h9Var2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.d;
                h9 h9Var3 = v0Var2.f14994o;
                if (h9Var3 != null) {
                    org.telegram.messenger.g0.r(h9Var3);
                    v0Var2.f14994o = null;
                }
                if (!v0Var2.f14991l && v0Var2.f14990k != null) {
                    float[] fArr = this.f14945c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f14944b;
                    long j10 = v0Var2.f14985e;
                    if (currentTimeMillis2 < j10) {
                        h9 h9Var4 = new h9(this, 15);
                        v0Var2.f14994o = h9Var4;
                        org.telegram.messenger.g0.i3(h9Var4, j10 - currentTimeMillis2);
                        return;
                    }
                    c();
                    return;
                }
                return;
        }
    }

    private final void a(Sensor sensor, int i7) {
    }

    private final void b(Sensor sensor, int i7) {
    }
}
