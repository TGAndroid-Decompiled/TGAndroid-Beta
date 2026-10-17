package gi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import ei.bc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class v0 implements SensorEventListener {
    public final int f11510a;
    public long f11511b;
    public float[] f11512c;
    public final y0 d;

    public v0(y0 y0Var, int i10) {
        this.f11510a = i10;
        switch (i10) {
            case 1:
                this.d = y0Var;
                this.f11512c = new float[3];
                return;
            default:
                this.d = y0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f11510a) {
            case 0:
                y0 y0Var = this.d;
                if (y0Var.f11556k != null && this.f11512c != null) {
                    this.f11511b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f11512c[0]);
                        jSONObject.put("y", -this.f11512c[1]);
                        jSONObject.put("z", -this.f11512c[2]);
                        org.telegram.ui.web.x0 x0Var = y0Var.f11556k;
                        x0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f11512c;
                y0 y0Var2 = this.d;
                if (y0Var2.f11556k != null) {
                    this.f11511b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.x0 x0Var2 = y0Var2.f11556k;
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
        int i11 = this.f11510a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f11510a) {
            case 0:
                y0 y0Var = this.d;
                bc bcVar = y0Var.f11558m;
                if (bcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar);
                    y0Var.f11558m = null;
                }
                if (!y0Var.f11557l && y0Var.f11556k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f11511b;
                    this.f11512c = sensorEvent.values;
                    long j10 = y0Var.f11551c;
                    if (currentTimeMillis < j10) {
                        bc bcVar2 = new bc(this, 5);
                        y0Var.f11558m = bcVar2;
                        AndroidUtilities.runOnUIThread(bcVar2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                y0 y0Var2 = this.d;
                bc bcVar3 = y0Var2.f11560o;
                if (bcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bcVar3);
                    y0Var2.f11560o = null;
                }
                if (!y0Var2.f11557l && y0Var2.f11556k != null) {
                    float[] fArr = this.f11512c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f11511b;
                    long j11 = y0Var2.e;
                    if (currentTimeMillis2 < j11) {
                        bc bcVar4 = new bc(this, 6);
                        y0Var2.f11560o = bcVar4;
                        AndroidUtilities.runOnUIThread(bcVar4, j11 - currentTimeMillis2);
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
