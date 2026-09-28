package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.y0;
public final class f extends CameraCaptureSession.StateCallback {
    public final i f13679a;

    public f(i iVar) {
        this.f13679a = iVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        i iVar = this.f13679a;
        if (iVar.f13743z != cameraCaptureSession) {
            return;
        }
        iVar.f13743z = null;
        iVar.A = null;
        iVar.N = false;
        iVar.f13713j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        i iVar = this.f13679a;
        if (iVar.f13743z == cameraCaptureSession) {
            iVar.f13743z = null;
            iVar.A = null;
        }
        if (iVar.S) {
            i iVar2 = this.f13679a;
            if (iVar2.f13741y != null && !iVar2.U && !iVar2.Y) {
                i iVar3 = this.f13679a;
                if (iVar3.G == n0.FPS_60) {
                    iVar3.n("60 fps session configuration failed", null);
                    return;
                } else {
                    iVar3.t(new IllegalStateException("Camera capture session configuration failed"));
                    return;
                }
            }
        }
        this.f13679a.f13713j.b("stale capture session configuration failure ignored");
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.f13679a.S) {
            i iVar = this.f13679a;
            if (iVar.f13741y != null) {
                iVar.f13743z = cameraCaptureSession;
                try {
                    iVar.D = iVar.E;
                    iVar.A = iVar.l(true);
                    q qVar = this.f13679a.v;
                    if (qVar != null) {
                        Handler handler = qVar.f13816m;
                        if (qVar.Z && handler != null) {
                            handler.post(new n(qVar, 1));
                        }
                    }
                    i iVar2 = this.f13679a;
                    boolean z10 = iVar2.W;
                    iVar2.W = false;
                    iVar2.X = z10;
                    i iVar3 = this.f13679a;
                    CameraCaptureSession cameraCaptureSession2 = iVar3.f13743z;
                    CaptureRequest.Builder builder = iVar3.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), iVar3.S0, iVar3.f13720n);
                    }
                    m mVar = this.f13679a.f13713j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f13679a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f13679a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(i.m(this.f13679a.f13710h0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(i.m(this.f13679a.f13707f0));
                    if (z10) {
                        str = ", switchElapsedMs=" + i.m(this.f13679a.f13712i0);
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    mVar.b(sb2.toString());
                    i iVar4 = this.f13679a;
                    iVar4.f13702c.post(new a(iVar4, 7));
                    i iVar5 = this.f13679a;
                    k2.u uVar = iVar5.f13715k;
                    l0 l0Var = iVar5.D;
                    m0 m0Var = iVar5.F;
                    n0 n0Var = iVar5.G;
                    Size size = iVar5.f13726q;
                    Size size2 = iVar5.f13728r;
                    i iVar6 = this.f13679a;
                    ((s0) uVar.f13369b).h.post(new y0(uVar, new h(l0Var, m0Var, n0Var, size, size2, iVar6.L, iVar6.q()), z10, 7));
                    l0 l0Var2 = this.f13679a.C;
                    i iVar7 = this.f13679a;
                    if (l0Var2 != iVar7.D) {
                        iVar7.F(iVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    i iVar8 = this.f13679a;
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
