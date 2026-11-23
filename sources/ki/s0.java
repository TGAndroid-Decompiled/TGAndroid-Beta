package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
public final class s0 implements SensorEventListener {
    public final int f18888a;
    public long f18889b;
    public float[] f18890c;
    public final v0 d;

    public s0(v0 v0Var, int i7) {
        this.f18888a = i7;
        switch (i7) {
            case 1:
                this.d = v0Var;
                this.f18890c = new float[3];
                return;
            default:
                this.d = v0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f18888a) {
            case 0:
                v0 v0Var = this.d;
                if (v0Var.f18990k != null && this.f18890c != null) {
                    this.f18889b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f18890c[0]);
                        jSONObject.put("y", -this.f18890c[1]);
                        jSONObject.put("z", -this.f18890c[2]);
                        org.telegram.ui.web.s0 s0Var = v0Var.f18990k;
                        s0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f18890c;
                v0 v0Var2 = this.d;
                if (v0Var2.f18990k != null) {
                    this.f18889b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.s0 s0Var2 = v0Var2.f18990k;
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
        int i10 = this.f18888a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f18888a) {
            case 0:
                v0 v0Var = this.d;
                kg.s0 s0Var = v0Var.f18992m;
                if (s0Var != null) {
                    org.telegram.messenger.g0.r(s0Var);
                    v0Var.f18992m = null;
                }
                if (!v0Var.f18991l && v0Var.f18990k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f18889b;
                    this.f18890c = sensorEvent.values;
                    long j3 = v0Var.f18984c;
                    if (currentTimeMillis < j3) {
                        kg.s0 s0Var2 = new kg.s0(this, 8);
                        v0Var.f18992m = s0Var2;
                        org.telegram.messenger.g0.h3(s0Var2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.d;
                kg.s0 s0Var3 = v0Var2.f18994o;
                if (s0Var3 != null) {
                    org.telegram.messenger.g0.r(s0Var3);
                    v0Var2.f18994o = null;
                }
                if (!v0Var2.f18991l && v0Var2.f18990k != null) {
                    float[] fArr = this.f18890c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f18889b;
                    long j10 = v0Var2.f18985e;
                    if (currentTimeMillis2 < j10) {
                        kg.s0 s0Var4 = new kg.s0(this, 9);
                        v0Var2.f18994o = s0Var4;
                        org.telegram.messenger.g0.h3(s0Var4, j10 - currentTimeMillis2);
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
