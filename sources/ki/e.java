package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import ci.y0;
import hg.k0;
public final class e extends CameraCaptureSession.StateCallback {
    public final g f13669a;

    public e(g gVar) {
        this.f13669a = gVar;
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        this.f13669a.k(new IllegalStateException("Camera capture session configuration failed"));
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraDevice cameraDevice;
        int[] iArr;
        int i10;
        String str;
        g gVar = this.f13669a;
        if (gVar.B && (cameraDevice = gVar.f13693t) != null) {
            gVar.f13694u = cameraCaptureSession;
            try {
                gVar.v = cameraDevice.createCaptureRequest(3);
                g gVar2 = this.f13669a;
                gVar2.v.addTarget(gVar2.f13689p);
                g gVar3 = this.f13669a;
                gVar3.v.addTarget(gVar3.f13690q);
                g gVar4 = this.f13669a;
                CaptureRequest.Builder builder = gVar4.v;
                CameraCharacteristics cameraCharacteristics = gVar4.f13685l;
                if (cameraCharacteristics == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
                }
                if (iArr != null) {
                    int length = iArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        } else if (iArr[i11] == 3) {
                            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                g gVar5 = this.f13669a;
                g.a(gVar5, gVar5.v);
                g gVar6 = this.f13669a;
                gVar6.b(gVar6.v);
                g gVar7 = this.f13669a;
                CaptureRequest.Builder builder2 = gVar7.v;
                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                if (gVar7.A && gVar7.h()) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                builder2.set(key, Integer.valueOf(i10));
                m mVar = this.f13669a.f13691r;
                if (mVar != null) {
                    Handler handler = mVar.f13761j;
                    if (mVar.T && handler != null) {
                        handler.post(new k(mVar, 1));
                    }
                }
                cameraCaptureSession.setRepeatingRequest(this.f13669a.v.build(), null, this.f13669a.f13683j);
                g gVar8 = this.f13669a;
                boolean z10 = gVar8.E;
                gVar8.E = false;
                gVar8.U = gVar8.V;
                j jVar = gVar8.f13680f;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("capture session configured: facing=");
                sb2.append(k0.z(this.f13669a.U));
                sb2.append(", elapsedMs=");
                sb2.append(g.g(this.f13669a.K));
                sb2.append(", segmentElapsedMs=");
                sb2.append(g.g(this.f13669a.I));
                if (z10) {
                    str = ", switchElapsedMs=" + g.g(this.f13669a.L);
                } else {
                    str = "";
                }
                sb2.append(str);
                jVar.b(sb2.toString());
                g gVar9 = this.f13669a;
                gVar9.f13679c.post(new a(gVar9, 5));
                g gVar10 = this.f13669a;
                k2.u uVar = gVar10.f13681g;
                ((h0) uVar.f13383b).h.post(new y0(uVar, new f(gVar10.U, gVar10.W, gVar10.f13686m, gVar10.f13687n, gVar10.f13698z, gVar10.h()), z10, 7));
                g gVar11 = this.f13669a;
                int i12 = gVar11.T;
                if (i12 != gVar11.U) {
                    gVar11.r(i12);
                    return;
                }
                return;
            } catch (Exception e) {
                this.f13669a.k(e);
                return;
            }
        }
        cameraCaptureSession.close();
    }
}
