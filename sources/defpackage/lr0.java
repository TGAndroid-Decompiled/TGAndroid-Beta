package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
public final class lr0 implements SensorEventListener {
    public final byte a;
    public long b;
    public float[] c;
    public final or0 d;

    public lr0(or0 or0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.d = or0Var;
                this.c = new float[3];
                return;
            default:
                this.d = or0Var;
                return;
        }
    }

    public final void c() {
        byte b = this.a;
        or0 or0Var = this.d;
        switch (b) {
            case 0:
                if (or0Var.k != null && this.c != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.c[0]);
                        jSONObject.put("y", -this.c[1]);
                        jSONObject.put("z", -this.c[2]);
                        cv0 cv0Var = or0Var.k;
                        cv0Var.c("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.c;
                if (or0Var.k != null) {
                    this.b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        cv0 cv0Var2 = or0Var.k;
                        cv0Var2.c("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
    public final void onAccuracyChanged(Sensor sensor, int i) {
        byte b = this.a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        byte b = this.a;
        or0 or0Var = this.d;
        switch (b) {
            case 0:
                oz ozVar = or0Var.m;
                if (ozVar != null) {
                    gl.r(ozVar);
                    or0Var.m = null;
                }
                if (!or0Var.l && or0Var.k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.b;
                    this.c = sensorEvent.values;
                    long j = or0Var.c;
                    if (currentTimeMillis < j) {
                        oz ozVar2 = new oz(this, (byte) 23);
                        or0Var.m = ozVar2;
                        gl.e3(ozVar2, j - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                oz ozVar3 = or0Var.o;
                if (ozVar3 != null) {
                    gl.r(ozVar3);
                    or0Var.o = null;
                }
                if (!or0Var.l && or0Var.k != null) {
                    float[] fArr = this.c;
                    float f = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.b;
                    long j2 = or0Var.e;
                    if (currentTimeMillis2 < j2) {
                        oz ozVar4 = new oz(this, (byte) 24);
                        or0Var.o = ozVar4;
                        gl.e3(ozVar4, j2 - currentTimeMillis2);
                        return;
                    }
                    c();
                    return;
                }
                return;
        }
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }
}
