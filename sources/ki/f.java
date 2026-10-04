package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.y0;
import ii.n4;
public final class f extends CameraCaptureSession.StateCallback {
    public final i f14870a;

    public f(i iVar) {
        this.f14870a = iVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        i iVar = this.f14870a;
        if (iVar.f14938z != cameraCaptureSession) {
            return;
        }
        iVar.f14938z = null;
        iVar.A = null;
        iVar.N = false;
        iVar.f14908j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        i iVar = this.f14870a;
        if (iVar.f14938z == cameraCaptureSession) {
            iVar.f14938z = null;
            iVar.A = null;
        }
        if (iVar.S) {
            i iVar2 = this.f14870a;
            if (iVar2.f14936y != null && !iVar2.U && !iVar2.Y) {
                i iVar3 = this.f14870a;
                if (iVar3.G == n0.FPS_60) {
                    iVar3.n("60 fps session configuration failed", null);
                    return;
                } else {
                    iVar3.t(new IllegalStateException("Camera capture session configuration failed"));
                    return;
                }
            }
        }
        this.f14870a.f14908j.b("stale capture session configuration failure ignored");
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.f14870a.S) {
            i iVar = this.f14870a;
            if (iVar.f14936y != null) {
                iVar.f14938z = cameraCaptureSession;
                try {
                    iVar.D = iVar.E;
                    iVar.A = iVar.l(true);
                    q qVar = this.f14870a.v;
                    if (qVar != null) {
                        Handler handler = qVar.f15016m;
                        if (qVar.Z && handler != null) {
                            handler.post(new n(qVar, 1));
                        }
                    }
                    i iVar2 = this.f14870a;
                    boolean z10 = iVar2.W;
                    iVar2.W = false;
                    iVar2.X = z10;
                    i iVar3 = this.f14870a;
                    CameraCaptureSession cameraCaptureSession2 = iVar3.f14938z;
                    CaptureRequest.Builder builder = iVar3.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), iVar3.S0, iVar3.f14915n);
                    }
                    m mVar = this.f14870a.f14908j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f14870a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f14870a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(i.m(this.f14870a.f14905h0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(i.m(this.f14870a.f14902f0));
                    if (z10) {
                        str = ", switchElapsedMs=" + i.m(this.f14870a.f14907i0);
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    mVar.b(sb2.toString());
                    i iVar4 = this.f14870a;
                    iVar4.f14896c.post(new a(iVar4, 7));
                    i iVar5 = this.f14870a;
                    n4 n4Var = iVar5.f14910k;
                    l0 l0Var = iVar5.D;
                    m0 m0Var = iVar5.F;
                    n0 n0Var = iVar5.G;
                    Size size = iVar5.f14921q;
                    Size size2 = iVar5.f14923r;
                    i iVar6 = this.f14870a;
                    ((s0) n4Var.f12543b).f15049i.post(new y0(n4Var, new h(l0Var, m0Var, n0Var, size, size2, iVar6.L, iVar6.q()), z10, 7));
                    l0 l0Var2 = this.f14870a.C;
                    i iVar7 = this.f14870a;
                    if (l0Var2 != iVar7.D) {
                        iVar7.F(iVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    i iVar8 = this.f14870a;
                    if (iVar8.G == n0.FPS_60) {
                        iVar8.n("60 fps request submission rejected", e7);
                        return;
                    } else {
                        iVar8.t(e7);
                        return;
                    }
                }
            }
        }
        cameraCaptureSession.close();
    }
}
