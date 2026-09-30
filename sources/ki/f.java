package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.y0;
public final class f extends CameraCaptureSession.StateCallback {
    public final i f13694a;

    public f(i iVar) {
        this.f13694a = iVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        i iVar = this.f13694a;
        if (iVar.f13758z != cameraCaptureSession) {
            return;
        }
        iVar.f13758z = null;
        iVar.A = null;
        iVar.N = false;
        iVar.f13728j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        i iVar = this.f13694a;
        if (iVar.f13758z == cameraCaptureSession) {
            iVar.f13758z = null;
            iVar.A = null;
        }
        if (iVar.S) {
            i iVar2 = this.f13694a;
            if (iVar2.f13756y != null && !iVar2.U && !iVar2.Y) {
                i iVar3 = this.f13694a;
                if (iVar3.G == n0.FPS_60) {
                    iVar3.n("60 fps session configuration failed", null);
                    return;
                } else {
                    iVar3.t(new IllegalStateException("Camera capture session configuration failed"));
                    return;
                }
            }
        }
        this.f13694a.f13728j.b("stale capture session configuration failure ignored");
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.f13694a.S) {
            i iVar = this.f13694a;
            if (iVar.f13756y != null) {
                iVar.f13758z = cameraCaptureSession;
                try {
                    iVar.D = iVar.E;
                    iVar.A = iVar.l(true);
                    q qVar = this.f13694a.v;
                    if (qVar != null) {
                        Handler handler = qVar.f13832m;
                        if (qVar.Z && handler != null) {
                            handler.post(new n(qVar, 1));
                        }
                    }
                    i iVar2 = this.f13694a;
                    boolean z10 = iVar2.W;
                    iVar2.W = false;
                    iVar2.X = z10;
                    i iVar3 = this.f13694a;
                    CameraCaptureSession cameraCaptureSession2 = iVar3.f13758z;
                    CaptureRequest.Builder builder = iVar3.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), iVar3.S0, iVar3.f13735n);
                    }
                    m mVar = this.f13694a.f13728j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f13694a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f13694a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(i.m(this.f13694a.f13725h0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(i.m(this.f13694a.f13722f0));
                    if (z10) {
                        str = ", switchElapsedMs=" + i.m(this.f13694a.f13727i0);
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    mVar.b(sb2.toString());
                    i iVar4 = this.f13694a;
                    iVar4.f13717c.post(new a(iVar4, 7));
                    i iVar5 = this.f13694a;
                    k2.u uVar = iVar5.f13730k;
                    l0 l0Var = iVar5.D;
                    m0 m0Var = iVar5.F;
                    n0 n0Var = iVar5.G;
                    Size size = iVar5.f13741q;
                    Size size2 = iVar5.f13743r;
                    i iVar6 = this.f13694a;
                    ((s0) uVar.f13384b).f13863i.post(new y0(uVar, new h(l0Var, m0Var, n0Var, size, size2, iVar6.L, iVar6.q()), z10, 7));
                    l0 l0Var2 = this.f13694a.C;
                    i iVar7 = this.f13694a;
                    if (l0Var2 != iVar7.D) {
                        iVar7.F(iVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    i iVar8 = this.f13694a;
                    if (iVar8.G == n0.FPS_60) {
                        iVar8.n("60 fps request submission rejected", e);
                        return;
                    } else {
                        iVar8.t(e);
                        return;
                    }
                }
            }
        }
        cameraCaptureSession.close();
    }
}
