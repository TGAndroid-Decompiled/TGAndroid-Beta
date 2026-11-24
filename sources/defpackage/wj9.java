package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class wj9 extends CameraCaptureSession.CaptureCallback {
    public final ak9 a;

    public wj9(ak9 ak9Var) {
        this.a = ak9Var;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        byte b;
        Object valueOf;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        ak9 ak9Var = this.a;
        ek9 ek9Var = ak9Var.j;
        if (cameraCaptureSession == ak9Var.z) {
            if (ak9Var.P) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == ak9Var.T) {
                    ak9Var.Q++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!ak9Var.O ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (ak9Var.O && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        ek9Var.b("torch result confirmed: enabled=" + ak9Var.O + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + ak9Var.Q + ", retries=" + ak9Var.R);
                        ak9Var.P = false;
                    } else {
                        int i2 = ak9Var.Q;
                        if (i2 == 3 && (i = ak9Var.R) == 0) {
                            ak9Var.R = i + 1;
                            ak9Var.Q = 0;
                            ek9Var.b("torch result not applied; rebuilding request: enabled=" + ak9Var.O + ", resultMode=" + num + ", flashState=" + num2);
                            ak9Var.a();
                        } else if (i2 >= 6) {
                            ek9Var.b("torch result failed: enabled=" + ak9Var.O + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + ak9Var.R);
                            ak9Var.P = false;
                        }
                    }
                }
            }
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && l.longValue() > ak9Var.W0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (ak9Var.V0 == 0) {
                    ak9Var.V0 = l.longValue();
                    ak9Var.X0 = 1L;
                } else {
                    long longValue = l.longValue() - ak9Var.W0;
                    ak9Var.Z0++;
                    ak9Var.a1 += longValue;
                    double d = longValue;
                    ak9Var.b1 = (d * d) + ak9Var.b1;
                    long j = ak9Var.c1;
                    if (j == 0 || longValue < j) {
                        ak9Var.c1 = longValue;
                    }
                    ak9Var.d1 = Math.max(ak9Var.d1, longValue);
                    if (longValue > 50000000) {
                        ak9Var.e1++;
                    }
                    if (longValue > 100000000) {
                        ak9Var.f1++;
                    }
                    ak9Var.X0++;
                }
                long j2 = ak9Var.Y0;
                if (j2 != 0) {
                    long j3 = elapsedRealtimeNanos - j2;
                    ak9Var.g1++;
                    ak9Var.h1 += j3;
                    ak9Var.i1 = Math.max(ak9Var.i1, j3);
                }
                ak9Var.Y0 = elapsedRealtimeNanos;
                ak9Var.W0 = l.longValue();
                long longValue2 = l.longValue() - ak9Var.V0;
                if (longValue2 >= 3000000000L) {
                    float f = (((float) (ak9Var.X0 - 1)) * 1.0E9f) / ((float) longValue2);
                    pl9 pl9Var = ak9Var.I;
                    if (pl9Var == null) {
                        b = 0;
                    } else {
                        b = pl9Var.a;
                    }
                    StringBuilder sb = new StringBuilder("camera capture rate: measuredFps=");
                    sb.append(f);
                    sb.append(", requestedFps=");
                    sb.append((int) ak9Var.h.a);
                    sb.append(", activeFps=");
                    if (b == 0) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Integer.valueOf(b);
                    }
                    sb.append(valueOf);
                    sb.append(", targetMet=");
                    if (b != 0 && f < b * 0.85f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    sb.append(z);
                    sb.append(", fpsRange=");
                    sb.append(ak9Var.J);
                    sb.append(", sensorIntervalMs={avg=");
                    sb.append(ak9.d(ak9Var.a1, ak9Var.Z0));
                    sb.append(", min=");
                    sb.append(((float) ak9Var.c1) / 1000000.0f);
                    sb.append(", max=");
                    sb.append(((float) ak9Var.d1) / 1000000.0f);
                    sb.append(", jitter=");
                    sb.append(ak9.U(ak9Var.b1, ak9Var.a1, ak9Var.Z0));
                    sb.append("}, sensorGaps={over50ms=");
                    sb.append(ak9Var.e1);
                    sb.append(", over100ms=");
                    sb.append(ak9Var.f1);
                    sb.append("}, callbackIntervalMs={avg=");
                    sb.append(ak9.d(ak9Var.h1, ak9Var.g1));
                    sb.append(", max=");
                    sb.append(((float) ak9Var.i1) / 1000000.0f);
                    sb.append("}");
                    ek9Var.b(sb.toString());
                    ak9Var.N();
                    ak9Var.V0 = l.longValue();
                    ak9Var.W0 = l.longValue();
                    ak9Var.X0 = 1L;
                    ak9Var.Y0 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
