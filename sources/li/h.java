package li;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class h extends CameraCaptureSession.CaptureCallback {
    public final l f12075a;

    public h(l lVar) {
        this.f12075a = lVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        l lVar = this.f12075a;
        p pVar = lVar.f12129j;
        if (cameraCaptureSession == lVar.A) {
            if (lVar.Q) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == lVar.U) {
                    lVar.R++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!lVar.P ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (lVar.P && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z11 && z12) {
                        pVar.b("torch result confirmed: enabled=" + lVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + lVar.R + ", retries=" + lVar.S);
                        lVar.Q = false;
                    } else {
                        int i12 = lVar.R;
                        if (i12 == 3 && (i11 = lVar.S) == 0) {
                            lVar.S = i11 + 1;
                            lVar.R = 0;
                            pVar.b("torch result not applied; rebuilding request: enabled=" + lVar.P + ", resultMode=" + num + ", flashState=" + num2);
                            lVar.g();
                        } else if (i12 >= 6) {
                            pVar.b("torch result failed: enabled=" + lVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + lVar.S);
                            lVar.Q = false;
                        }
                    }
                }
            }
            Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l4 != null && l4.longValue() > lVar.Z0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (lVar.Y0 == 0) {
                    lVar.Y0 = l4.longValue();
                    lVar.f12107a1 = 1L;
                } else {
                    long longValue = l4.longValue() - lVar.Z0;
                    lVar.f12113c1++;
                    lVar.f12115d1 += longValue;
                    double d = longValue;
                    lVar.f12117e1 = (d * d) + lVar.f12117e1;
                    long j10 = lVar.f12120f1;
                    if (j10 == 0 || longValue < j10) {
                        lVar.f12120f1 = longValue;
                    }
                    lVar.f12123g1 = Math.max(lVar.f12123g1, longValue);
                    if (longValue > 50000000) {
                        lVar.f12125h1++;
                    }
                    if (longValue > 100000000) {
                        lVar.f12128i1++;
                    }
                    lVar.f12107a1++;
                }
                long j11 = lVar.f12110b1;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    lVar.f12131j1++;
                    lVar.f12134k1 += j12;
                    lVar.l1 = Math.max(lVar.l1, j12);
                }
                lVar.f12110b1 = elapsedRealtimeNanos;
                lVar.Z0 = l4.longValue();
                long longValue2 = l4.longValue() - lVar.Y0;
                if (longValue2 >= 3000000000L) {
                    float f7 = (((float) (lVar.f12107a1 - 1)) * 1.0E9f) / ((float) longValue2);
                    s0 s0Var = lVar.J;
                    if (s0Var == null) {
                        i10 = 0;
                    } else {
                        i10 = s0Var.f12244a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f7);
                    sb2.append(", requestedFps=");
                    sb2.append(lVar.h.f12244a);
                    sb2.append(", activeFps=");
                    if (i10 == 0) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Integer.valueOf(i10);
                    }
                    sb2.append(valueOf);
                    sb2.append(", targetMet=");
                    if (i10 != 0 && f7 < i10 * 0.85f) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    sb2.append(z10);
                    sb2.append(", fpsRange=");
                    sb2.append(lVar.K);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(l.j(lVar.f12115d1, lVar.f12113c1));
                    sb2.append(", min=");
                    sb2.append(((float) lVar.f12120f1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) lVar.f12123g1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(l.W(lVar.f12117e1, lVar.f12115d1, lVar.f12113c1));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(lVar.f12125h1);
                    sb2.append(", over100ms=");
                    sb2.append(lVar.f12128i1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(l.j(lVar.f12134k1, lVar.f12131j1));
                    sb2.append(", max=");
                    sb2.append(((float) lVar.l1) / 1000000.0f);
                    sb2.append("}");
                    pVar.b(sb2.toString());
                    lVar.O();
                    lVar.Y0 = l4.longValue();
                    lVar.Z0 = l4.longValue();
                    lVar.f12107a1 = 1L;
                    lVar.f12110b1 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
