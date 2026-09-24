package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.y0;
public final class e extends CameraCaptureSession.StateCallback {
    public final h f13673a;

    public e(h hVar) {
        this.f13673a = hVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        h hVar = this.f13673a;
        if (hVar.f13735y != cameraCaptureSession) {
            return;
        }
        hVar.f13735y = null;
        hVar.f13737z = null;
        hVar.M = false;
        hVar.f13707j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        h hVar = this.f13673a;
        if (hVar.f13735y == cameraCaptureSession) {
            hVar.f13735y = null;
            hVar.f13737z = null;
        }
        if (hVar.R) {
            h hVar2 = this.f13673a;
            if (hVar2.f13733x != null && !hVar2.T && !hVar2.X) {
                h hVar3 = this.f13673a;
                if (hVar3.F == m0.FPS_60) {
                    hVar3.m("60 fps session configuration failed", null);
                    return;
                } else {
                    hVar3.s(new IllegalStateException("Camera capture session configuration failed"));
                    return;
                }
            }
        }
        this.f13673a.f13707j.b("stale capture session configuration failure ignored");
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.f13673a.R) {
            h hVar = this.f13673a;
            if (hVar.f13733x != null) {
                hVar.f13735y = cameraCaptureSession;
                try {
                    hVar.C = hVar.D;
                    hVar.f13737z = hVar.k(true);
                    q qVar = this.f13673a.v;
                    if (qVar != null) {
                        Handler handler = qVar.f13811l;
                        if (qVar.V && handler != null) {
                            handler.post(new m(qVar, 1));
                        }
                    }
                    h hVar2 = this.f13673a;
                    boolean z10 = hVar2.V;
                    hVar2.V = false;
                    hVar2.W = z10;
                    h hVar3 = this.f13673a;
                    CameraCaptureSession cameraCaptureSession2 = hVar3.f13735y;
                    CaptureRequest.Builder builder = hVar3.f13737z;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), hVar3.Q0, hVar3.f13714n);
                    }
                    l lVar = this.f13673a.f13707j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f13673a.C);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f13673a.G);
                    sb2.append(", elapsedMs=");
                    sb2.append(h.l(this.f13673a.f13703g0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(h.l(this.f13673a.f13699e0));
                    if (z10) {
                        str = ", switchElapsedMs=" + h.l(this.f13673a.f13704h0);
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    lVar.b(sb2.toString());
                    h hVar4 = this.f13673a;
                    hVar4.f13696c.post(new b(hVar4, 6));
                    h hVar5 = this.f13673a;
                    k2.u uVar = hVar5.f13709k;
                    k0 k0Var = hVar5.C;
                    l0 l0Var = hVar5.E;
                    m0 m0Var = hVar5.F;
                    Size size = hVar5.f13720q;
                    Size size2 = hVar5.f13722r;
                    h hVar6 = this.f13673a;
                    ((r0) uVar.f13369b).h.post(new y0(uVar, new g(k0Var, l0Var, m0Var, size, size2, hVar6.K, hVar6.p()), z10, 7));
                    k0 k0Var2 = this.f13673a.B;
                    h hVar7 = this.f13673a;
                    if (k0Var2 != hVar7.C) {
                        hVar7.E(hVar7.B);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    h hVar8 = this.f13673a;
                    if (hVar8.F == m0.FPS_60) {
                        hVar8.m("60 fps request submission rejected", e);
                        return;
                    } else {
                        hVar8.s(e);
                        return;
                    }
                }
            }
        }
        cameraCaptureSession.close();
    }
}
