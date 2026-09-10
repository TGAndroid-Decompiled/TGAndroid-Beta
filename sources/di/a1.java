package di;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import bi.wc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class a1 implements SensorEventListener {
    public final int f6508a;
    public long f6509b;
    public float[] f6510c;
    public final d1 d;

    public a1(d1 d1Var, int i10) {
        this.f6508a = i10;
        switch (i10) {
            case 1:
                this.d = d1Var;
                this.f6510c = new float[3];
                return;
            default:
                this.d = d1Var;
                return;
        }
    }

    public final void c() {
        switch (this.f6508a) {
            case 0:
                d1 d1Var = this.d;
                if (d1Var.f6579k != null && this.f6510c != null) {
                    this.f6509b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f6510c[0]);
                        jSONObject.put("y", -this.f6510c[1]);
                        jSONObject.put("z", -this.f6510c[2]);
                        org.telegram.ui.web.y0 y0Var = d1Var.f6579k;
                        y0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f6510c;
                d1 d1Var2 = this.d;
                if (d1Var2.f6579k != null) {
                    this.f6509b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.y0 y0Var2 = d1Var2.f6579k;
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
        int i11 = this.f6508a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f6508a) {
            case 0:
                d1 d1Var = this.d;
                wc wcVar = d1Var.f6581m;
                if (wcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(wcVar);
                    d1Var.f6581m = null;
                }
                if (!d1Var.f6580l && d1Var.f6579k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f6509b;
                    this.f6510c = sensorEvent.values;
                    long j3 = d1Var.f6574c;
                    if (currentTimeMillis < j3) {
                        wc wcVar2 = new wc(this, 15);
                        d1Var.f6581m = wcVar2;
                        AndroidUtilities.runOnUIThread(wcVar2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                d1 d1Var2 = this.d;
                wc wcVar3 = d1Var2.f6583o;
                if (wcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(wcVar3);
                    d1Var2.f6583o = null;
                }
                if (!d1Var2.f6580l && d1Var2.f6579k != null) {
                    float[] fArr = this.f6510c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f6509b;
                    long j10 = d1Var2.e;
                    if (currentTimeMillis2 < j10) {
                        wc wcVar4 = new wc(this, 16);
                        d1Var2.f6583o = wcVar4;
                        AndroidUtilities.runOnUIThread(wcVar4, j10 - currentTimeMillis2);
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
