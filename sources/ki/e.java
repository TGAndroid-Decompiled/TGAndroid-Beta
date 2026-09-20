package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import ci.y0;
public final class e extends CameraCaptureSession.StateCallback {
    public final h f13672a;

    public e(h hVar) {
        this.f13672a = hVar;
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        h hVar = this.f13672a;
        if (hVar.F == j0.FPS_60) {
            hVar.m("60 fps session configuration failed", null);
        } else {
            hVar.s(new IllegalStateException("Camera capture session configuration failed"));
        }
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraDevice cameraDevice;
        boolean z10;
        String str;
        String str2;
        h hVar = this.f13672a;
        if (hVar.M && (cameraDevice = hVar.f13723x) != null) {
            hVar.f13724y = cameraCaptureSession;
            try {
                if (Build.VERSION.SDK_INT >= 23 && (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hVar.V = z10;
                int[] iArr = null;
                if (hVar.U && !z10) {
                    hVar.m("HAL returned a regular session for a high-speed request", null);
                    return;
                }
                hVar.C = hVar.D;
                hVar.f13725z = cameraDevice.createCaptureRequest(3);
                h hVar2 = this.f13672a;
                hVar2.f13725z.addTarget(hVar2.f13720t);
                h hVar3 = this.f13672a;
                hVar3.f13725z.addTarget(hVar3.f13721u);
                h hVar4 = this.f13672a;
                CaptureRequest.Builder builder = hVar4.f13725z;
                CameraCharacteristics cameraCharacteristics = hVar4.f13716p;
                if (cameraCharacteristics != null) {
                    iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
                }
                if (h.i(iArr, 3)) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                }
                h hVar5 = this.f13672a;
                CaptureRequest.Builder builder2 = hVar5.f13725z;
                k kVar = hVar5.f13707j;
                Range range = hVar5.G;
                if (range != null) {
                    builder2.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                    kVar.b("capture FPS range selected: " + hVar5.G);
                } else {
                    kVar.b("capture FPS range unavailable; HAL default will be used");
                }
                h hVar6 = this.f13672a;
                hVar6.b(hVar6.f13725z);
                h hVar7 = this.f13672a;
                hVar7.a(hVar7.f13725z);
                o oVar = this.f13672a.v;
                if (oVar != null) {
                    Handler handler = oVar.f13785k;
                    if (oVar.U && handler != null) {
                        handler.post(new m(oVar, 1));
                    }
                }
                h hVar8 = this.f13672a;
                boolean z11 = hVar8.P;
                hVar8.P = false;
                hVar8.Q = z11;
                this.f13672a.A();
                k kVar2 = this.f13672a.f13707j;
                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                sb2.append(this.f13672a.C);
                sb2.append(", mode=");
                if (this.f13672a.V) {
                    str = "CONSTRAINED_HIGH_SPEED";
                } else {
                    str = "REGULAR";
                }
                sb2.append(str);
                sb2.append(", fpsRange=");
                sb2.append(this.f13672a.G);
                sb2.append(", elapsedMs=");
                sb2.append(h.l(this.f13672a.Z));
                sb2.append(", segmentElapsedMs=");
                sb2.append(h.l(this.f13672a.X));
                if (z11) {
                    str2 = ", switchElapsedMs=" + h.l(this.f13672a.f13693a0);
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                kVar2.b(sb2.toString());
                h hVar9 = this.f13672a;
                hVar9.f13696c.post(new b(hVar9, 6));
                h hVar10 = this.f13672a;
                k2.u uVar = hVar10.f13709k;
                ((o0) uVar.f13384b).h.post(new y0(uVar, new g(hVar10.C, hVar10.E, hVar10.F, hVar10.f13717q, hVar10.f13718r, hVar10.K, hVar10.o()), z11, 7));
                h hVar11 = this.f13672a;
                h0 h0Var = hVar11.B;
                if (h0Var != hVar11.C) {
                    hVar11.B(h0Var);
                    return;
                }
                return;
            } catch (Exception e) {
                h hVar12 = this.f13672a;
                if (hVar12.F == j0.FPS_60) {
                    hVar12.m("60 fps request submission rejected", e);
                    return;
                } else {
                    hVar12.s(e);
                    return;
                }
            }
        }
        cameraCaptureSession.close();
    }
}
