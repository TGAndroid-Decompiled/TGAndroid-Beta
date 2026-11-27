package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class kn9 extends CameraCaptureSession.CaptureCallback {
    public final on9 a;

    public kn9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        byte b;
        Object valueOf;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        on9 on9Var = this.a;
        sn9 sn9Var = on9Var.j;
        if (cameraCaptureSession == on9Var.z) {
            if (on9Var.P) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == on9Var.T) {
                    on9Var.Q++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!on9Var.O ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (on9Var.O && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        sn9Var.b("torch result confirmed: enabled=" + on9Var.O + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + on9Var.Q + ", retries=" + on9Var.R);
                        on9Var.P = false;
                    } else {
                        int i2 = on9Var.Q;
                        if (i2 == 3 && (i = on9Var.R) == 0) {
                            on9Var.R = i + 1;
                            on9Var.Q = 0;
                            sn9Var.b("torch result not applied; rebuilding request: enabled=" + on9Var.O + ", resultMode=" + num + ", flashState=" + num2);
                            on9Var.a();
                        } else if (i2 >= 6) {
                            sn9Var.b("torch result failed: enabled=" + on9Var.O + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + on9Var.R);
                            on9Var.P = false;
                        }
                    }
                }
            }
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && l.longValue() > on9Var.W0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (on9Var.V0 == 0) {
                    on9Var.V0 = l.longValue();
                    on9Var.X0 = 1L;
                } else {
                    long longValue = l.longValue() - on9Var.W0;
                    on9Var.Z0++;
                    on9Var.a1 += longValue;
                    double d = longValue;
                    on9Var.b1 = (d * d) + on9Var.b1;
                    long j = on9Var.c1;
                    if (j == 0 || longValue < j) {
                        on9Var.c1 = longValue;
                    }
                    on9Var.d1 = Math.max(on9Var.d1, longValue);
                    if (longValue > 50000000) {
                        on9Var.e1++;
                    }
                    if (longValue > 100000000) {
                        on9Var.f1++;
                    }
                    on9Var.X0++;
                }
                long j2 = on9Var.Y0;
                if (j2 != 0) {
                    long j3 = elapsedRealtimeNanos - j2;
                    on9Var.g1++;
                    on9Var.h1 += j3;
                    on9Var.i1 = Math.max(on9Var.i1, j3);
                }
                on9Var.Y0 = elapsedRealtimeNanos;
                on9Var.W0 = l.longValue();
                long longValue2 = l.longValue() - on9Var.V0;
                if (longValue2 >= 3000000000L) {
                    float f = (((float) (on9Var.X0 - 1)) * 1.0E9f) / ((float) longValue2);
                    ep9 ep9Var = on9Var.I;
                    if (ep9Var == null) {
                        b = 0;
                    } else {
                        b = ep9Var.a;
                    }
                    StringBuilder sb = new StringBuilder("camera capture rate: measuredFps=");
                    sb.append(f);
                    sb.append(", requestedFps=");
                    sb.append((int) on9Var.h.a);
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
                    sb.append(on9Var.J);
                    sb.append(", sensorIntervalMs={avg=");
                    sb.append(on9.d(on9Var.a1, on9Var.Z0));
                    sb.append(", min=");
                    sb.append(((float) on9Var.c1) / 1000000.0f);
                    sb.append(", max=");
                    sb.append(((float) on9Var.d1) / 1000000.0f);
                    sb.append(", jitter=");
                    sb.append(on9.U(on9Var.b1, on9Var.a1, on9Var.Z0));
                    sb.append("}, sensorGaps={over50ms=");
                    sb.append(on9Var.e1);
                    sb.append(", over100ms=");
                    sb.append(on9Var.f1);
                    sb.append("}, callbackIntervalMs={avg=");
                    sb.append(on9.d(on9Var.h1, on9Var.g1));
                    sb.append(", max=");
                    sb.append(((float) on9Var.i1) / 1000000.0f);
                    sb.append("}");
                    sn9Var.b(sb.toString());
                    on9Var.N();
                    on9Var.V0 = l.longValue();
                    on9Var.W0 = l.longValue();
                    on9Var.X0 = 1L;
                    on9Var.Y0 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
