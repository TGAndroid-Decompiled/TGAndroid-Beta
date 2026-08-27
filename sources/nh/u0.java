package nh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;

public final class u0 implements SensorEventListener {

    public final int f18984a;

    public long f18985b;

    public float[] f18986c;
    public final x0 d;

    public u0(x0 x0Var, int i10) {
        this.f18984a = i10;
        switch (i10) {
            case 1:
                this.d = x0Var;
                this.f18986c = new float[3];
                break;
            default:
                this.d = x0Var;
                break;
        }
    }

    public final void c() {
        switch (this.f18984a) {
            case 0:
                x0 x0Var = this.d;
                if (x0Var.f19034k != null && this.f18986c != null) {
                    this.f18985b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f18986c[0]);
                        jSONObject.put("y", -this.f18986c[1]);
                        jSONObject.put("z", -this.f18986c[2]);
                        x0Var.f19034k.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                float[] fArr = this.f18986c;
                x0 x0Var2 = this.d;
                if (x0Var2.f19034k != null) {
                    this.f18985b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        x0Var2.f19034k.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
                        break;
                    } catch (Exception unused2) {
                    }
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[2] = 0.0f;
                    break;
                }
                break;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        int i11 = this.f18984a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f18984a) {
            case 0:
                x0 x0Var = this.d;
                f0 f0Var = x0Var.f19036m;
                if (f0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(f0Var);
                    x0Var.f19036m = null;
                }
                if (!x0Var.f19035l && x0Var.f19034k != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f18985b;
                    this.f18986c = sensorEvent.values;
                    long j10 = x0Var.f19028c;
                    if (jCurrentTimeMillis >= j10) {
                        c();
                    } else {
                        f0 f0Var2 = new f0(this, 2);
                        x0Var.f19036m = f0Var2;
                        AndroidUtilities.runOnUIThread(f0Var2, j10 - jCurrentTimeMillis);
                    }
                    break;
                }
                break;
            default:
                x0 x0Var2 = this.d;
                f0 f0Var3 = x0Var2.f19038o;
                if (f0Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f0Var3);
                    x0Var2.f19038o = null;
                }
                if (!x0Var2.f19035l && x0Var2.f19034k != null) {
                    float[] fArr = this.f18986c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f18985b;
                    long j11 = x0Var2.f19029e;
                    if (jCurrentTimeMillis2 >= j11) {
                        c();
                    } else {
                        f0 f0Var4 = new f0(this, 3);
                        x0Var2.f19038o = f0Var4;
                        AndroidUtilities.runOnUIThread(f0Var4, j11 - jCurrentTimeMillis2);
                    }
                    break;
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i10) {
    }

    private final void b(Sensor sensor, int i10) {
    }
}
