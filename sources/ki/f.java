package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
public final class f extends CameraCaptureSession.CaptureCallback {
    public final h f13675a;

    public f(h hVar) {
        this.f13675a = hVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        String str;
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 != null) {
            long longValue = l4.longValue();
            h hVar = this.f13675a;
            if (longValue > hVar.f13699e0) {
                if (hVar.f13698d0 == 0) {
                    hVar.f13698d0 = l4.longValue();
                    hVar.f13701f0 = 1L;
                } else {
                    hVar.f13701f0++;
                }
                hVar.f13699e0 = l4.longValue();
                long longValue2 = l4.longValue() - hVar.f13698d0;
                if (longValue2 >= 3000000000L) {
                    float f7 = (((float) (hVar.f13701f0 - 1)) * 1.0E9f) / ((float) longValue2);
                    j0 j0Var = hVar.F;
                    boolean z10 = false;
                    if (j0Var == null) {
                        i10 = 0;
                    } else {
                        i10 = j0Var.f13758a;
                    }
                    k kVar = hVar.f13707j;
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f7);
                    sb2.append(", requestedFps=");
                    sb2.append(hVar.h.f13758a);
                    sb2.append(", activeFps=");
                    if (i10 == 0) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Integer.valueOf(i10);
                    }
                    sb2.append(valueOf);
                    sb2.append(", targetMet=");
                    sb2.append((i10 == 0 || f7 >= ((float) i10) * 0.85f) ? true : true);
                    sb2.append(", fpsRange=");
                    sb2.append(hVar.G);
                    sb2.append(", mode=");
                    if (hVar.V) {
                        str = "CONSTRAINED_HIGH_SPEED";
                    } else {
                        str = "REGULAR";
                    }
                    sb2.append(str);
                    kVar.b(sb2.toString());
                    hVar.f13698d0 = l4.longValue();
                    hVar.f13701f0 = 1L;
                }
            }
        }
    }
}
