package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class h extends CameraCaptureSession.CaptureCallback {
    public final k f14931a;

    public h(k kVar) {
        this.f14931a = kVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        k kVar = this.f14931a;
        o oVar = kVar.f14986j;
        if (cameraCaptureSession == kVar.A) {
            if (kVar.Q) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == kVar.U) {
                    kVar.R++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!kVar.P ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (kVar.P && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z11 && z12) {
                        oVar.b("torch result confirmed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + kVar.R + ", retries=" + kVar.S);
                        kVar.Q = false;
                    } else {
                        int i12 = kVar.R;
                        if (i12 == 3 && (i11 = kVar.S) == 0) {
                            kVar.S = i11 + 1;
                            kVar.R = 0;
                            oVar.b("torch result not applied; rebuilding request: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2);
                            kVar.g();
                        } else if (i12 >= 6) {
                            oVar.b("torch result failed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + kVar.S);
                            kVar.Q = false;
                        }
                    }
                }
            }
            Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l4 != null && l4.longValue() > kVar.Y0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (kVar.X0 == 0) {
                    kVar.X0 = l4.longValue();
                    kVar.Z0 = 1L;
                } else {
                    long longValue = l4.longValue() - kVar.Y0;
                    kVar.f14966b1++;
                    kVar.f14969c1 += longValue;
                    double d = longValue;
                    kVar.f14971d1 = (d * d) + kVar.f14971d1;
                    long j3 = kVar.f14974e1;
                    if (j3 == 0 || longValue < j3) {
                        kVar.f14974e1 = longValue;
                    }
                    kVar.f14977f1 = Math.max(kVar.f14977f1, longValue);
                    if (longValue > 50000000) {
                        kVar.f14980g1++;
                    }
                    if (longValue > 100000000) {
                        kVar.f14982h1++;
                    }
                    kVar.Z0++;
                }
                long j10 = kVar.f14963a1;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    kVar.f14985i1++;
                    kVar.f14988j1 += j11;
                    kVar.f14991k1 = Math.max(kVar.f14991k1, j11);
                }
                kVar.f14963a1 = elapsedRealtimeNanos;
                kVar.Y0 = l4.longValue();
                long longValue2 = l4.longValue() - kVar.X0;
                if (longValue2 >= 3000000000L) {
                    float f7 = (((float) (kVar.Z0 - 1)) * 1.0E9f) / ((float) longValue2);
                    q0 q0Var = kVar.J;
                    if (q0Var == null) {
                        i10 = 0;
                    } else {
                        i10 = q0Var.f15091a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f7);
                    sb2.append(", requestedFps=");
                    sb2.append(kVar.h.f15091a);
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
                    sb2.append(kVar.K);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(k.j(kVar.f14969c1, kVar.f14966b1));
                    sb2.append(", min=");
                    sb2.append(((float) kVar.f14974e1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) kVar.f14977f1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(k.W(kVar.f14971d1, kVar.f14969c1, kVar.f14966b1));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(kVar.f14980g1);
                    sb2.append(", over100ms=");
                    sb2.append(kVar.f14982h1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(k.j(kVar.f14988j1, kVar.f14985i1));
                    sb2.append(", max=");
                    sb2.append(((float) kVar.f14991k1) / 1000000.0f);
                    sb2.append("}");
                    oVar.b(sb2.toString());
                    kVar.O();
                    kVar.X0 = l4.longValue();
                    kVar.Y0 = l4.longValue();
                    kVar.Z0 = 1L;
                    kVar.f14963a1 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
