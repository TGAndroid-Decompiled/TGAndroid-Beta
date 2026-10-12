package li;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class h extends CameraCaptureSession.CaptureCallback {
    public final l f14795a;

    public h(l lVar) {
        this.f14795a = lVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        l lVar = this.f14795a;
        p pVar = lVar.f14851j;
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
            if (l4 != null && l4.longValue() > lVar.Y0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (lVar.X0 == 0) {
                    lVar.X0 = l4.longValue();
                    lVar.Z0 = 1L;
                } else {
                    long longValue = l4.longValue() - lVar.Y0;
                    lVar.f14832b1++;
                    lVar.f14835c1 += longValue;
                    double d = longValue;
                    lVar.f14837d1 = (d * d) + lVar.f14837d1;
                    long j10 = lVar.f14839e1;
                    if (j10 == 0 || longValue < j10) {
                        lVar.f14839e1 = longValue;
                    }
                    lVar.f14842f1 = Math.max(lVar.f14842f1, longValue);
                    if (longValue > 50000000) {
                        lVar.f14845g1++;
                    }
                    if (longValue > 100000000) {
                        lVar.f14847h1++;
                    }
                    lVar.Z0++;
                }
                long j11 = lVar.f14829a1;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    lVar.f14850i1++;
                    lVar.f14853j1 += j12;
                    lVar.f14856k1 = Math.max(lVar.f14856k1, j12);
                }
                lVar.f14829a1 = elapsedRealtimeNanos;
                lVar.Y0 = l4.longValue();
                long longValue2 = l4.longValue() - lVar.X0;
                if (longValue2 >= 3000000000L) {
                    float f7 = (((float) (lVar.Z0 - 1)) * 1.0E9f) / ((float) longValue2);
                    p0 p0Var = lVar.J;
                    if (p0Var == null) {
                        i10 = 0;
                    } else {
                        i10 = p0Var.f14942a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f7);
                    sb2.append(", requestedFps=");
                    sb2.append(lVar.h.f14942a);
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
                    sb2.append(l.j(lVar.f14835c1, lVar.f14832b1));
                    sb2.append(", min=");
                    sb2.append(((float) lVar.f14839e1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) lVar.f14842f1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(l.W(lVar.f14837d1, lVar.f14835c1, lVar.f14832b1));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(lVar.f14845g1);
                    sb2.append(", over100ms=");
                    sb2.append(lVar.f14847h1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(l.j(lVar.f14853j1, lVar.f14850i1));
                    sb2.append(", max=");
                    sb2.append(((float) lVar.f14856k1) / 1000000.0f);
                    sb2.append("}");
                    pVar.b(sb2.toString());
                    lVar.O();
                    lVar.X0 = l4.longValue();
                    lVar.Y0 = l4.longValue();
                    lVar.Z0 = 1L;
                    lVar.f14829a1 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
