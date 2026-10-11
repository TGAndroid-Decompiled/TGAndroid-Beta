package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class g extends CameraCaptureSession.CaptureCallback {
    public final j f14924a;

    public g(j jVar) {
        this.f14924a = jVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        j jVar = this.f14924a;
        n nVar = jVar.f14979j;
        if (jVar.N) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == jVar.R) {
                jVar.O++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                if (!jVar.M ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (jVar.M && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z11 && z12) {
                    nVar.b("torch result confirmed: enabled=" + jVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + jVar.O + ", retries=" + jVar.P);
                    jVar.N = false;
                } else {
                    int i12 = jVar.O;
                    if (i12 == 3 && (i11 = jVar.P) == 0) {
                        jVar.P = i11 + 1;
                        jVar.O = 0;
                        nVar.b("torch result not applied; rebuilding request: enabled=" + jVar.M + ", resultMode=" + num + ", flashState=" + num2);
                        jVar.e();
                    } else if (i12 >= 6) {
                        nVar.b("torch result failed: enabled=" + jVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + jVar.P);
                        jVar.N = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 != null && l4.longValue() > jVar.Q0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (jVar.P0 == 0) {
                jVar.P0 = l4.longValue();
                jVar.R0 = 1L;
            } else {
                long longValue = l4.longValue() - jVar.Q0;
                jVar.T0++;
                jVar.U0 += longValue;
                double d = longValue;
                jVar.V0 = (d * d) + jVar.V0;
                long j3 = jVar.W0;
                if (j3 == 0 || longValue < j3) {
                    jVar.W0 = longValue;
                }
                jVar.X0 = Math.max(jVar.X0, longValue);
                if (longValue > 50000000) {
                    jVar.Y0++;
                }
                if (longValue > 100000000) {
                    jVar.Z0++;
                }
                jVar.R0++;
            }
            long j10 = jVar.S0;
            if (j10 != 0) {
                long j11 = elapsedRealtimeNanos - j10;
                jVar.f14956a1++;
                jVar.f14959b1 += j11;
                jVar.f14962c1 = Math.max(jVar.f14962c1, j11);
            }
            jVar.S0 = elapsedRealtimeNanos;
            jVar.Q0 = l4.longValue();
            long longValue2 = l4.longValue() - jVar.P0;
            if (longValue2 >= 3000000000L) {
                float f7 = (((float) (jVar.R0 - 1)) * 1.0E9f) / ((float) longValue2);
                o0 o0Var = jVar.G;
                if (o0Var == null) {
                    i10 = 0;
                } else {
                    i10 = o0Var.f15068a;
                }
                StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                sb2.append(f7);
                sb2.append(", requestedFps=");
                sb2.append(jVar.h.f15068a);
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
                sb2.append(jVar.H);
                sb2.append(", sensorIntervalMs={avg=");
                sb2.append(j.h(jVar.U0, jVar.T0));
                sb2.append(", min=");
                sb2.append(((float) jVar.W0) / 1000000.0f);
                sb2.append(", max=");
                sb2.append(((float) jVar.X0) / 1000000.0f);
                sb2.append(", jitter=");
                sb2.append(j.Q(jVar.V0, jVar.U0, jVar.T0));
                sb2.append("}, sensorGaps={over50ms=");
                sb2.append(jVar.Y0);
                sb2.append(", over100ms=");
                sb2.append(jVar.Z0);
                sb2.append("}, callbackIntervalMs={avg=");
                sb2.append(j.h(jVar.f14959b1, jVar.f14956a1));
                sb2.append(", max=");
                sb2.append(((float) jVar.f14962c1) / 1000000.0f);
                sb2.append("}");
                nVar.b(sb2.toString());
                jVar.I();
                jVar.P0 = l4.longValue();
                jVar.Q0 = l4.longValue();
                jVar.R0 = 1L;
                jVar.S0 = elapsedRealtimeNanos;
            }
        }
    }
}
