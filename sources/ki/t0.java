package ki;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public final int f18912a;
    public long f18913b;
    public float[] f18914c;
    public final w0 d;

    public t0(w0 w0Var, int i7) {
        this.f18912a = i7;
        switch (i7) {
            case 1:
                this.d = w0Var;
                this.f18914c = new float[3];
                return;
            default:
                this.d = w0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f18912a) {
            case 0:
                w0 w0Var = this.d;
                if (w0Var.f19014k != null && this.f18914c != null) {
                    this.f18913b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f18914c[0]);
                        jSONObject.put("y", -this.f18914c[1]);
                        jSONObject.put("z", -this.f18914c[2]);
                        org.telegram.ui.web.s0 s0Var = w0Var.f19014k;
                        s0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f18914c;
                w0 w0Var2 = this.d;
                if (w0Var2.f19014k != null) {
                    this.f18913b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.s0 s0Var2 = w0Var2.f19014k;
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
        int i10 = this.f18912a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f18912a) {
            case 0:
                w0 w0Var = this.d;
                kg.j0 j0Var = w0Var.f19016m;
                if (j0Var != null) {
                    org.telegram.messenger.g0.r(j0Var);
                    w0Var.f19016m = null;
                }
                if (!w0Var.f19015l && w0Var.f19014k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f18913b;
                    this.f18914c = sensorEvent.values;
                    long j3 = w0Var.f19008c;
                    if (currentTimeMillis < j3) {
                        kg.j0 j0Var2 = new kg.j0(this, 9);
                        w0Var.f19016m = j0Var2;
                        org.telegram.messenger.g0.h3(j0Var2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.d;
                kg.j0 j0Var3 = w0Var2.f19018o;
                if (j0Var3 != null) {
                    org.telegram.messenger.g0.r(j0Var3);
                    w0Var2.f19018o = null;
                }
                if (!w0Var2.f19015l && w0Var2.f19014k != null) {
                    float[] fArr = this.f18914c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f18913b;
                    long j10 = w0Var2.f19009e;
                    if (currentTimeMillis2 < j10) {
                        kg.j0 j0Var4 = new kg.j0(this, 10);
                        w0Var2.f19018o = j0Var4;
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
