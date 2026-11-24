package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class xl9 extends CameraCaptureSession.CaptureCallback {
    public final bm9 a;

    public xl9(bm9 bm9Var) {
        this.a = bm9Var;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        byte b;
        Object valueOf;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        bm9 bm9Var = this.a;
        fm9 fm9Var = bm9Var.j;
        if (cameraCaptureSession == bm9Var.z) {
            if (bm9Var.P) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == bm9Var.T) {
                    bm9Var.Q++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!bm9Var.O ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (bm9Var.O && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        fm9Var.b("torch result confirmed: enabled=" + bm9Var.O + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + bm9Var.Q + ", retries=" + bm9Var.R);
                        bm9Var.P = false;
                    } else {
                        int i2 = bm9Var.Q;
                        if (i2 == 3 && (i = bm9Var.R) == 0) {
                            bm9Var.R = i + 1;
                            bm9Var.Q = 0;
                            fm9Var.b("torch result not applied; rebuilding request: enabled=" + bm9Var.O + ", resultMode=" + num + ", flashState=" + num2);
                            bm9Var.a();
                        } else if (i2 >= 6) {
                            fm9Var.b("torch result failed: enabled=" + bm9Var.O + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + bm9Var.R);
                            bm9Var.P = false;
                        }
                    }
                }
            }
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && l.longValue() > bm9Var.W0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (bm9Var.V0 == 0) {
                    bm9Var.V0 = l.longValue();
                    bm9Var.X0 = 1L;
                } else {
                    long longValue = l.longValue() - bm9Var.W0;
                    bm9Var.Z0++;
                    bm9Var.a1 += longValue;
                    double d = longValue;
                    bm9Var.b1 = (d * d) + bm9Var.b1;
                    long j = bm9Var.c1;
                    if (j == 0 || longValue < j) {
                        bm9Var.c1 = longValue;
                    }
                    bm9Var.d1 = Math.max(bm9Var.d1, longValue);
                    if (longValue > 50000000) {
                        bm9Var.e1++;
                    }
                    if (longValue > 100000000) {
                        bm9Var.f1++;
                    }
                    bm9Var.X0++;
                }
                long j2 = bm9Var.Y0;
                if (j2 != 0) {
                    long j3 = elapsedRealtimeNanos - j2;
                    bm9Var.g1++;
                    bm9Var.h1 += j3;
                    bm9Var.i1 = Math.max(bm9Var.i1, j3);
                }
                bm9Var.Y0 = elapsedRealtimeNanos;
                bm9Var.W0 = l.longValue();
                long longValue2 = l.longValue() - bm9Var.V0;
                if (longValue2 >= 3000000000L) {
                    float f = (((float) (bm9Var.X0 - 1)) * 1.0E9f) / ((float) longValue2);
                    pn9 pn9Var = bm9Var.I;
                    if (pn9Var == null) {
                        b = 0;
                    } else {
                        b = pn9Var.a;
                    }
                    StringBuilder sb = new StringBuilder("camera capture rate: measuredFps=");
                    sb.append(f);
                    sb.append(", requestedFps=");
                    sb.append((int) bm9Var.h.a);
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
                    sb.append(bm9Var.J);
                    sb.append(", sensorIntervalMs={avg=");
                    sb.append(bm9.d(bm9Var.a1, bm9Var.Z0));
                    sb.append(", min=");
                    sb.append(((float) bm9Var.c1) / 1000000.0f);
                    sb.append(", max=");
                    sb.append(((float) bm9Var.d1) / 1000000.0f);
                    sb.append(", jitter=");
                    sb.append(bm9.U(bm9Var.b1, bm9Var.a1, bm9Var.Z0));
                    sb.append("}, sensorGaps={over50ms=");
                    sb.append(bm9Var.e1);
                    sb.append(", over100ms=");
                    sb.append(bm9Var.f1);
                    sb.append("}, callbackIntervalMs={avg=");
                    sb.append(bm9.d(bm9Var.h1, bm9Var.g1));
                    sb.append(", max=");
                    sb.append(((float) bm9Var.i1) / 1000000.0f);
                    sb.append("}");
                    fm9Var.b(sb.toString());
                    bm9Var.N();
                    bm9Var.V0 = l.longValue();
                    bm9Var.W0 = l.longValue();
                    bm9Var.X0 = 1L;
                    bm9Var.Y0 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
