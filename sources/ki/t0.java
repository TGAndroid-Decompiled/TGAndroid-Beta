package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public final int f18565a;
    public long f18566b;
    public float[] f18567c;
    public final w0 d;

    public t0(w0 w0Var, int i7) {
        this.f18565a = i7;
        switch (i7) {
            case 1:
                this.d = w0Var;
                this.f18567c = new float[3];
                return;
            default:
                this.d = w0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f18565a) {
            case 0:
                w0 w0Var = this.d;
                if (w0Var.f18622k != null && this.f18567c != null) {
                    this.f18566b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f18567c[0]);
                        jSONObject.put("y", -this.f18567c[1]);
                        jSONObject.put("z", -this.f18567c[2]);
                        org.telegram.ui.web.s0 s0Var = w0Var.f18622k;
                        s0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f18567c;
                w0 w0Var2 = this.d;
                if (w0Var2.f18622k != null) {
                    this.f18566b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.s0 s0Var2 = w0Var2.f18622k;
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
        int i10 = this.f18565a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f18565a) {
            case 0:
                w0 w0Var = this.d;
                kg.j1 j1Var = w0Var.f18624m;
                if (j1Var != null) {
                    org.telegram.messenger.g0.r(j1Var);
                    w0Var.f18624m = null;
                }
                if (!w0Var.f18623l && w0Var.f18622k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f18566b;
                    this.f18567c = sensorEvent.values;
                    long j3 = w0Var.f18616c;
                    if (currentTimeMillis < j3) {
                        kg.j1 j1Var2 = new kg.j1(this, 5);
                        w0Var.f18624m = j1Var2;
                        org.telegram.messenger.g0.i3(j1Var2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.d;
                kg.j1 j1Var3 = w0Var2.f18626o;
                if (j1Var3 != null) {
                    org.telegram.messenger.g0.r(j1Var3);
                    w0Var2.f18626o = null;
                }
                if (!w0Var2.f18623l && w0Var2.f18622k != null) {
                    float[] fArr = this.f18567c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f18566b;
                    long j10 = w0Var2.f18617e;
                    if (currentTimeMillis2 < j10) {
                        kg.j1 j1Var4 = new kg.j1(this, 6);
                        w0Var2.f18626o = j1Var4;
                        org.telegram.messenger.g0.i3(j1Var4, j10 - currentTimeMillis2);
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
