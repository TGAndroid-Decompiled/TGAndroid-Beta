package mh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class v0 implements SensorEventListener {
    public final int f18164a;
    public long f18165b;
    public float[] f18166c;
    public final y0 d;

    public v0(y0 y0Var, int i9) {
        this.f18164a = i9;
        switch (i9) {
            case 1:
                this.d = y0Var;
                this.f18166c = new float[3];
                return;
            default:
                this.d = y0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f18164a) {
            case 0:
                y0 y0Var = this.d;
                if (y0Var.f18219k != null && this.f18166c != null) {
                    this.f18165b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f18166c[0]);
                        jSONObject.put("y", -this.f18166c[1]);
                        jSONObject.put("z", -this.f18166c[2]);
                        org.telegram.ui.web.v0 v0Var = y0Var.f18219k;
                        v0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f18166c;
                y0 y0Var2 = this.d;
                if (y0Var2.f18219k != null) {
                    this.f18165b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.v0 v0Var2 = y0Var2.f18219k;
                        v0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
    public final void onAccuracyChanged(Sensor sensor, int i9) {
        int i10 = this.f18164a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f18164a) {
            case 0:
                y0 y0Var = this.d;
                kh.f1 f1Var = y0Var.f18221m;
                if (f1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var);
                    y0Var.f18221m = null;
                }
                if (!y0Var.f18220l && y0Var.f18219k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f18165b;
                    this.f18166c = sensorEvent.values;
                    long j10 = y0Var.f18213c;
                    if (currentTimeMillis < j10) {
                        kh.f1 f1Var2 = new kh.f1(this, 25);
                        y0Var.f18221m = f1Var2;
                        AndroidUtilities.runOnUIThread(f1Var2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                y0 y0Var2 = this.d;
                kh.f1 f1Var3 = y0Var2.f18223o;
                if (f1Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f1Var3);
                    y0Var2.f18223o = null;
                }
                if (!y0Var2.f18220l && y0Var2.f18219k != null) {
                    float[] fArr = this.f18166c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f18165b;
                    long j11 = y0Var2.f18214e;
                    if (currentTimeMillis2 < j11) {
                        kh.f1 f1Var4 = new kh.f1(this, 26);
                        y0Var2.f18223o = f1Var4;
                        AndroidUtilities.runOnUIThread(f1Var4, j11 - currentTimeMillis2);
                        return;
                    }
                    c();
                    return;
                }
                return;
        }
    }

    private final void a(Sensor sensor, int i9) {
    }

    private final void b(Sensor sensor, int i9) {
    }
}
