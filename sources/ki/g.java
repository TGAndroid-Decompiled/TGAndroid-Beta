package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class g extends CameraCaptureSession.CaptureCallback {
    public final i f13684a;

    public g(i iVar) {
        this.f13684a = iVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        i iVar = this.f13684a;
        m mVar = iVar.f13713j;
        if (iVar.N) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == iVar.R) {
                iVar.O++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                if (!iVar.M ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (iVar.M && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z11 && z12) {
                    mVar.b("torch result confirmed: enabled=" + iVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + iVar.O + ", retries=" + iVar.P);
                    iVar.N = false;
                } else {
                    int i12 = iVar.O;
                    if (i12 == 3 && (i11 = iVar.P) == 0) {
                        iVar.P = i11 + 1;
                        iVar.O = 0;
                        mVar.b("torch result not applied; rebuilding request: enabled=" + iVar.M + ", resultMode=" + num + ", flashState=" + num2);
                        iVar.a();
                    } else if (i12 >= 6) {
                        mVar.b("torch result failed: enabled=" + iVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + iVar.P);
                        iVar.N = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 != null && l4.longValue() > iVar.f13744z0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (iVar.f13742y0 == 0) {
                iVar.f13742y0 = l4.longValue();
                iVar.A0 = 1L;
            } else {
                long longValue = l4.longValue() - iVar.f13744z0;
                iVar.C0++;
                iVar.D0 += longValue;
                double d = longValue;
                iVar.E0 = (d * d) + iVar.E0;
                long j3 = iVar.F0;
                if (j3 == 0 || longValue < j3) {
                    iVar.F0 = longValue;
                }
                iVar.G0 = Math.max(iVar.G0, longValue);
                if (longValue > 50000000) {
                    iVar.H0++;
                }
                if (longValue > 100000000) {
                    iVar.I0++;
                }
                iVar.A0++;
            }
            long j10 = iVar.B0;
            if (j10 != 0) {
                long j11 = elapsedRealtimeNanos - j10;
                iVar.J0++;
                iVar.K0 += j11;
                iVar.L0 = Math.max(iVar.L0, j11);
            }
            iVar.B0 = elapsedRealtimeNanos;
            iVar.f13744z0 = l4.longValue();
            long longValue2 = l4.longValue() - iVar.f13742y0;
            if (longValue2 >= 3000000000L) {
                float f7 = (((float) (iVar.A0 - 1)) * 1.0E9f) / ((float) longValue2);
                n0 n0Var = iVar.G;
                if (n0Var == null) {
                    i10 = 0;
                } else {
                    i10 = n0Var.f13797a;
                }
                StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                sb2.append(f7);
                sb2.append(", requestedFps=");
                sb2.append(iVar.h.f13797a);
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
                sb2.append(iVar.H);
                sb2.append(", sensorIntervalMs={avg=");
                sb2.append(i.c(iVar.D0, iVar.C0));
                sb2.append(", min=");
                sb2.append(((float) iVar.F0) / 1000000.0f);
                sb2.append(", max=");
                sb2.append(((float) iVar.G0) / 1000000.0f);
                sb2.append(", jitter=");
                sb2.append(i.B(iVar.E0, iVar.D0, iVar.C0));
                sb2.append("}, sensorGaps={over50ms=");
                sb2.append(iVar.H0);
                sb2.append(", over100ms=");
                sb2.append(iVar.I0);
                sb2.append("}, callbackIntervalMs={avg=");
                sb2.append(i.c(iVar.K0, iVar.J0));
                sb2.append(", max=");
                sb2.append(((float) iVar.L0) / 1000000.0f);
                sb2.append("}");
                mVar.b(sb2.toString());
                iVar.u();
                iVar.f13742y0 = l4.longValue();
                iVar.f13744z0 = l4.longValue();
                iVar.A0 = 1L;
                iVar.B0 = elapsedRealtimeNanos;
            }
        }
    }
}
