package ii;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import gi.f6;
import org.json.JSONObject;
public final class t0 implements SensorEventListener {
    public final int f15235a;
    public long f15236b;
    public float[] f15237c;
    public final w0 d;

    public t0(w0 w0Var, int i3) {
        this.f15235a = i3;
        switch (i3) {
            case 1:
                this.d = w0Var;
                this.f15237c = new float[3];
                return;
            default:
                this.d = w0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f15235a) {
            case 0:
                w0 w0Var = this.d;
                if (w0Var.f15292k != null && this.f15237c != null) {
                    this.f15236b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f15237c[0]);
                        jSONObject.put("y", -this.f15237c[1]);
                        jSONObject.put("z", -this.f15237c[2]);
                        org.telegram.ui.web.t0 t0Var = w0Var.f15292k;
                        t0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f15237c;
                w0 w0Var2 = this.d;
                if (w0Var2.f15292k != null) {
                    this.f15236b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.t0 t0Var2 = w0Var2.f15292k;
                        t0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
    public final void onAccuracyChanged(Sensor sensor, int i3) {
        int i10 = this.f15235a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f15235a) {
            case 0:
                w0 w0Var = this.d;
                f6 f6Var = w0Var.f15294m;
                if (f6Var != null) {
                    org.telegram.messenger.g0.r(f6Var);
                    w0Var.f15294m = null;
                }
                if (!w0Var.f15293l && w0Var.f15292k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f15236b;
                    this.f15237c = sensorEvent.values;
                    long j10 = w0Var.f15286c;
                    if (currentTimeMillis < j10) {
                        f6 f6Var2 = new f6(this, 17);
                        w0Var.f15294m = f6Var2;
                        org.telegram.messenger.g0.i3(f6Var2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.d;
                f6 f6Var3 = w0Var2.f15296o;
                if (f6Var3 != null) {
                    org.telegram.messenger.g0.r(f6Var3);
                    w0Var2.f15296o = null;
                }
                if (!w0Var2.f15293l && w0Var2.f15292k != null) {
                    float[] fArr = this.f15237c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f15236b;
                    long j11 = w0Var2.f15287e;
                    if (currentTimeMillis2 < j11) {
                        f6 f6Var4 = new f6(this, 18);
                        w0Var2.f15296o = f6Var4;
                        org.telegram.messenger.g0.i3(f6Var4, j11 - currentTimeMillis2);
                        return;
                    }
                    c();
                    return;
                }
                return;
        }
    }

    private final void a(Sensor sensor, int i3) {
    }

    private final void b(Sensor sensor, int i3) {
    }
}
