package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public final int f18909a;
    public long f18910b;
    public float[] f18911c;
    public final w0 d;

    public t0(w0 w0Var, int i7) {
        this.f18909a = i7;
        switch (i7) {
            case 1:
                this.d = w0Var;
                this.f18911c = new float[3];
                return;
            default:
                this.d = w0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f18909a) {
            case 0:
                w0 w0Var = this.d;
                if (w0Var.f19011k != null && this.f18911c != null) {
                    this.f18910b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f18911c[0]);
                        jSONObject.put("y", -this.f18911c[1]);
                        jSONObject.put("z", -this.f18911c[2]);
                        org.telegram.ui.web.s0 s0Var = w0Var.f19011k;
                        s0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f18911c;
                w0 w0Var2 = this.d;
                if (w0Var2.f19011k != null) {
                    this.f18910b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.s0 s0Var2 = w0Var2.f19011k;
                        s0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        int i10 = this.f18909a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f18909a) {
            case 0:
                w0 w0Var = this.d;
                kg.j0 j0Var = w0Var.f19013m;
                if (j0Var != null) {
                    org.telegram.messenger.g0.r(j0Var);
                    w0Var.f19013m = null;
                }
                if (!w0Var.f19012l && w0Var.f19011k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f18910b;
                    this.f18911c = sensorEvent.values;
                    long j3 = w0Var.f19005c;
                    if (currentTimeMillis < j3) {
                        kg.j0 j0Var2 = new kg.j0(this, 9);
                        w0Var.f19013m = j0Var2;
                        org.telegram.messenger.g0.h3(j0Var2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.d;
                kg.j0 j0Var3 = w0Var2.f19015o;
                if (j0Var3 != null) {
                    org.telegram.messenger.g0.r(j0Var3);
                    w0Var2.f19015o = null;
                }
                if (!w0Var2.f19012l && w0Var2.f19011k != null) {
                    float[] fArr = this.f18911c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f18910b;
                    long j10 = w0Var2.f19006e;
                    if (currentTimeMillis2 < j10) {
                        kg.j0 j0Var4 = new kg.j0(this, 10);
                        w0Var2.f19015o = j0Var4;
                        org.telegram.messenger.g0.h3(j0Var4, j10 - currentTimeMillis2);
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
