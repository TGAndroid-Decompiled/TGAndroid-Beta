package fi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import di.x8;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class w0 implements SensorEventListener {
    public final int f9625a;
    public long f9626b;
    public float[] f9627c;
    public final z0 d;

    public w0(z0 z0Var, int i10) {
        this.f9625a = i10;
        switch (i10) {
            case 1:
                this.d = z0Var;
                this.f9627c = new float[3];
                return;
            default:
                this.d = z0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f9625a) {
            case 0:
                z0 z0Var = this.d;
                if (z0Var.f9691k != null && this.f9627c != null) {
                    this.f9626b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f9627c[0]);
                        jSONObject.put("y", -this.f9627c[1]);
                        jSONObject.put("z", -this.f9627c[2]);
                        org.telegram.ui.web.y0 y0Var = z0Var.f9691k;
                        y0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f9627c;
                z0 z0Var2 = this.d;
                if (z0Var2.f9691k != null) {
                    this.f9626b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.y0 y0Var2 = z0Var2.f9691k;
                        y0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        int i11 = this.f9625a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f9625a) {
            case 0:
                z0 z0Var = this.d;
                x8 x8Var = z0Var.f9693m;
                if (x8Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var);
                    z0Var.f9693m = null;
                }
                if (!z0Var.f9692l && z0Var.f9691k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f9626b;
                    this.f9627c = sensorEvent.values;
                    long j10 = z0Var.f9686c;
                    if (currentTimeMillis < j10) {
                        x8 x8Var2 = new x8(this, 15);
                        z0Var.f9693m = x8Var2;
                        AndroidUtilities.runOnUIThread(x8Var2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                z0 z0Var2 = this.d;
                x8 x8Var3 = z0Var2.f9695o;
                if (x8Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(x8Var3);
                    z0Var2.f9695o = null;
                }
                if (!z0Var2.f9692l && z0Var2.f9691k != null) {
                    float[] fArr = this.f9627c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f9626b;
                    long j11 = z0Var2.e;
                    if (currentTimeMillis2 < j11) {
                        x8 x8Var4 = new x8(this, 16);
                        z0Var2.f9695o = x8Var4;
                        AndroidUtilities.runOnUIThread(x8Var4, j11 - currentTimeMillis2);
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
