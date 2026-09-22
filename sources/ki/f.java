package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class f extends CameraCaptureSession.CaptureCallback {
    public final h f13673a;

    public f(h hVar) {
        this.f13673a = hVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        int i11;
        h hVar = this.f13673a;
        k kVar = hVar.f13704j;
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
                    kVar.b("torch result confirmed: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + hVar.N + ", retries=" + hVar.O);
                    hVar.M = false;
                } else {
                    int i12 = hVar.N;
                    if (i12 == 3 && (i11 = hVar.O) == 0) {
                        hVar.O = i11 + 1;
                        hVar.N = 0;
                        kVar.b("torch result not applied; rebuilding request: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2);
                        hVar.a();
                    } else if (i12 >= 6) {
                        kVar.b("torch result failed: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + hVar.O);
                        hVar.M = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 != null && l4.longValue() > hVar.f13731x0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (hVar.f13729w0 == 0) {
                hVar.f13729w0 = l4.longValue();
                hVar.f13733y0 = 1L;
            } else {
                long longValue = l4.longValue() - hVar.f13731x0;
                hVar.A0++;
                hVar.B0 += longValue;
                double d = longValue;
                hVar.C0 = (d * d) + hVar.C0;
                long j3 = hVar.D0;
                if (j3 == 0 || longValue < j3) {
                    hVar.D0 = longValue;
                }
                hVar.E0 = Math.max(hVar.E0, longValue);
                if (longValue > 50000000) {
                    hVar.F0++;
                }
                if (longValue > 100000000) {
                    hVar.G0++;
                }
                hVar.f13733y0++;
            }
            long j10 = hVar.f13735z0;
            if (j10 != 0) {
                long j11 = elapsedRealtimeNanos - j10;
                hVar.H0++;
                hVar.I0 += j11;
                hVar.J0 = Math.max(hVar.J0, j11);
            }
            hVar.f13735z0 = elapsedRealtimeNanos;
            hVar.f13731x0 = l4.longValue();
            long longValue2 = l4.longValue() - hVar.f13729w0;
            if (longValue2 >= 3000000000L) {
                float f7 = (((float) (hVar.f13733y0 - 1)) * 1.0E9f) / ((float) longValue2);
                k0 k0Var = hVar.F;
                if (k0Var == null) {
                    i10 = 0;
                } else {
                    i10 = k0Var.f13774a;
                }
                StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                sb2.append(f7);
                sb2.append(", requestedFps=");
                sb2.append(hVar.h.f13774a);
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
                sb2.append(", mode=");
                if (hVar.f13692b0) {
                    str = "CONSTRAINED_HIGH_SPEED";
                } else {
                    str = "REGULAR";
                }
                sb2.append(str);
                sb2.append(", sensorIntervalMs={avg=");
                sb2.append(h.c(hVar.B0, hVar.A0));
                sb2.append(", min=");
                sb2.append(((float) hVar.D0) / 1000000.0f);
                sb2.append(", max=");
                sb2.append(((float) hVar.E0) / 1000000.0f);
                sb2.append(", jitter=");
                sb2.append(h.C(hVar.C0, hVar.B0, hVar.A0));
                sb2.append("}, sensorGaps={over50ms=");
                sb2.append(hVar.F0);
                sb2.append(", over100ms=");
                sb2.append(hVar.G0);
                sb2.append("}, callbackIntervalMs={avg=");
                sb2.append(h.c(hVar.I0, hVar.H0));
                sb2.append(", max=");
                sb2.append(((float) hVar.J0) / 1000000.0f);
                sb2.append("}");
                kVar.b(sb2.toString());
                hVar.v();
                hVar.f13729w0 = l4.longValue();
                hVar.f13731x0 = l4.longValue();
                hVar.f13733y0 = 1L;
                hVar.f13735z0 = elapsedRealtimeNanos;
            }
        }
    }
}
