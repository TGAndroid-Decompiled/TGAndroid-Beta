package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Build;
import android.os.Handler;
import ci.y0;
public final class e extends CameraCaptureSession.StateCallback {
    public final h f13670a;

    public e(h hVar) {
        this.f13670a = hVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        h hVar = this.f13670a;
        if (hVar.f13732y != cameraCaptureSession) {
            return;
        }
        hVar.f13732y = null;
        hVar.f13734z = null;
        hVar.M = false;
        hVar.f13704j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        h hVar = this.f13670a;
        if (hVar.f13732y == cameraCaptureSession) {
            hVar.f13732y = null;
            hVar.f13734z = null;
        }
        if (hVar.R && hVar.f13730x != null && !hVar.T && !hVar.X) {
            if (hVar.F == k0.FPS_60) {
                hVar.o("60 fps session configuration failed", null);
                return;
            } else {
                hVar.u(new IllegalStateException("Camera capture session configuration failed"));
                return;
            }
        }
        hVar.f13704j.b("stale capture session configuration failure ignored");
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        boolean z10;
        String str;
        String str2;
        h hVar = this.f13670a;
        if (hVar.R && hVar.f13730x != null) {
            hVar.f13732y = cameraCaptureSession;
            try {
                if (Build.VERSION.SDK_INT >= 23 && (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hVar.f13692b0 = z10;
                if (hVar.f13690a0 && !z10) {
                    hVar.o("HAL returned a regular session for a high-speed request", null);
                    return;
                }
                hVar.C = hVar.D;
                hVar.f13734z = hVar.l(true);
                o oVar = this.f13670a.v;
                if (oVar != null) {
                    Handler handler = oVar.f13791k;
                    if (oVar.U && handler != null) {
                        handler.post(new m(oVar, 1));
                    }
                }
                h hVar2 = this.f13670a;
                boolean z11 = hVar2.V;
                hVar2.V = false;
                hVar2.W = z11;
                this.f13670a.F();
                k kVar = this.f13670a.f13704j;
                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                sb2.append(this.f13670a.C);
                sb2.append(", mode=");
                if (this.f13670a.f13692b0) {
                    str = "CONSTRAINED_HIGH_SPEED";
                } else {
                    str = "REGULAR";
                }
                sb2.append(str);
                sb2.append(", fpsRange=");
                sb2.append(this.f13670a.G);
                sb2.append(", elapsedMs=");
                sb2.append(h.n(this.f13670a.f13698f0));
                sb2.append(", segmentElapsedMs=");
                sb2.append(h.n(this.f13670a.f13695d0));
                if (z11) {
                    str2 = ", switchElapsedMs=" + h.n(this.f13670a.f13700g0);
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                kVar.b(sb2.toString());
                h hVar3 = this.f13670a;
                hVar3.f13693c.post(new b(hVar3, 6));
                h hVar4 = this.f13670a;
                e0 e0Var = hVar4.f13706k;
                ((q0) e0Var.f13672b).h.post(new y0(e0Var, new g(hVar4.C, hVar4.E, hVar4.F, hVar4.f13717q, hVar4.f13719r, hVar4.K, hVar4.q()), z11, 7));
                h hVar5 = this.f13670a;
                i0 i0Var = hVar5.B;
                if (i0Var != hVar5.C) {
                    hVar5.G(i0Var);
                    return;
                }
                return;
            } catch (Exception e) {
                h hVar6 = this.f13670a;
                if (hVar6.F == k0.FPS_60) {
                    hVar6.o("60 fps request submission rejected", e);
                    return;
                } else {
                    hVar6.u(e);
                    return;
                }
            }
        }
        cameraCaptureSession.close();
    }
}
