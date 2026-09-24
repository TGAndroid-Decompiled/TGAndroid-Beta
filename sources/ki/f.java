package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class f extends CameraCaptureSession.CaptureCallback {
    public final h f13677a;

    public f(h hVar) {
        this.f13677a = hVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        h hVar = this.f13677a;
        l lVar = hVar.f13707j;
        if (hVar.M) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == hVar.Q) {
                hVar.N++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                if (!hVar.L ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (hVar.L && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z11 && z12) {
                    lVar.b("torch result confirmed: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + hVar.N + ", retries=" + hVar.O);
                    hVar.M = false;
                } else {
                    int i12 = hVar.N;
                    if (i12 == 3 && (i11 = hVar.O) == 0) {
                        hVar.O = i11 + 1;
                        hVar.N = 0;
                        lVar.b("torch result not applied; rebuilding request: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2);
                        hVar.a();
                    } else if (i12 >= 6) {
                        lVar.b("torch result failed: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + hVar.O);
                        hVar.M = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 != null && l4.longValue() > hVar.f13736y0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (hVar.f13734x0 == 0) {
                hVar.f13734x0 = l4.longValue();
                hVar.f13738z0 = 1L;
            } else {
                long longValue = l4.longValue() - hVar.f13736y0;
                hVar.B0++;
                hVar.C0 += longValue;
                double d = longValue;
                hVar.D0 = (d * d) + hVar.D0;
                long j3 = hVar.E0;
                if (j3 == 0 || longValue < j3) {
                    hVar.E0 = longValue;
                }
                hVar.F0 = Math.max(hVar.F0, longValue);
                if (longValue > 50000000) {
                    hVar.G0++;
                }
                if (longValue > 100000000) {
                    hVar.H0++;
                }
                hVar.f13738z0++;
            }
            long j10 = hVar.A0;
            if (j10 != 0) {
                long j11 = elapsedRealtimeNanos - j10;
                hVar.I0++;
                hVar.J0 += j11;
                hVar.K0 = Math.max(hVar.K0, j11);
            }
            hVar.A0 = elapsedRealtimeNanos;
            hVar.f13736y0 = l4.longValue();
            long longValue2 = l4.longValue() - hVar.f13734x0;
            if (longValue2 >= 3000000000L) {
                float f7 = (((float) (hVar.f13738z0 - 1)) * 1.0E9f) / ((float) longValue2);
                m0 m0Var = hVar.F;
                if (m0Var == null) {
                    i10 = 0;
                } else {
                    i10 = m0Var.f13791a;
                }
                StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                sb2.append(f7);
                sb2.append(", requestedFps=");
                sb2.append(hVar.h.f13791a);
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
                sb2.append(hVar.G);
                sb2.append(", sensorIntervalMs={avg=");
                sb2.append(h.c(hVar.C0, hVar.B0));
                sb2.append(", min=");
                sb2.append(((float) hVar.E0) / 1000000.0f);
                sb2.append(", max=");
                sb2.append(((float) hVar.F0) / 1000000.0f);
                sb2.append(", jitter=");
                sb2.append(h.A(hVar.D0, hVar.C0, hVar.B0));
                sb2.append("}, sensorGaps={over50ms=");
                sb2.append(hVar.G0);
                sb2.append(", over100ms=");
                sb2.append(hVar.H0);
                sb2.append("}, callbackIntervalMs={avg=");
                sb2.append(h.c(hVar.J0, hVar.I0));
                sb2.append(", max=");
                sb2.append(((float) hVar.K0) / 1000000.0f);
                sb2.append("}");
                lVar.b(sb2.toString());
                hVar.t();
                hVar.f13734x0 = l4.longValue();
                hVar.f13736y0 = l4.longValue();
                hVar.f13738z0 = 1L;
                hVar.A0 = elapsedRealtimeNanos;
            }
        }
    }
}
