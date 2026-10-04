package ei;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import ci.qc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class y0 implements SensorEventListener {
    public final int f9474a;
    public long f9475b;
    public float[] f9476c;
    public final b1 d;

    public y0(b1 b1Var, int i10) {
        this.f9474a = i10;
        switch (i10) {
            case 1:
                this.d = b1Var;
                this.f9476c = new float[3];
                return;
            default:
                this.d = b1Var;
                return;
        }
    }

    public final void c() {
        switch (this.f9474a) {
            case 0:
                b1 b1Var = this.d;
                if (b1Var.f8932k != null && this.f9476c != null) {
                    this.f9475b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f9476c[0]);
                        jSONObject.put("y", -this.f9476c[1]);
                        jSONObject.put("z", -this.f9476c[2]);
                        org.telegram.ui.web.z0 z0Var = b1Var.f8932k;
                        z0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f9476c;
                b1 b1Var2 = this.d;
                if (b1Var2.f8932k != null) {
                    this.f9475b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.z0 z0Var2 = b1Var2.f8932k;
                        z0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        int i11 = this.f9474a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f9474a) {
            case 0:
                b1 b1Var = this.d;
                qc qcVar = b1Var.f8934m;
                if (qcVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar);
                    b1Var.f8934m = null;
                }
                if (!b1Var.f8933l && b1Var.f8932k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f9475b;
                    this.f9476c = sensorEvent.values;
                    long j3 = b1Var.f8926c;
                    if (currentTimeMillis < j3) {
                        qc qcVar2 = new qc(this, 9);
                        b1Var.f8934m = qcVar2;
                        AndroidUtilities.runOnUIThread(qcVar2, j3 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                b1 b1Var2 = this.d;
                qc qcVar3 = b1Var2.f8936o;
                if (qcVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qcVar3);
                    b1Var2.f8936o = null;
                }
                if (!b1Var2.f8933l && b1Var2.f8932k != null) {
                    float[] fArr = this.f9476c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f9475b;
                    long j10 = b1Var2.f8927e;
                    if (currentTimeMillis2 < j10) {
                        qc qcVar4 = new qc(this, 10);
                        b1Var2.f8936o = qcVar4;
                        AndroidUtilities.runOnUIThread(qcVar4, j10 - currentTimeMillis2);
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
