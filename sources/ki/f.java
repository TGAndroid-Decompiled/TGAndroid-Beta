package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.x0;
public final class f extends CameraCaptureSession.StateCallback {
    public final j f14921a;

    public f(j jVar) {
        this.f14921a = jVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        j jVar = this.f14921a;
        if (jVar.f15008z != cameraCaptureSession) {
            return;
        }
        jVar.f15008z = null;
        jVar.A = null;
        jVar.N = false;
        jVar.f14978j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        if (this.f14921a.f15006y != null) {
            CameraDevice device = cameraCaptureSession.getDevice();
            j jVar = this.f14921a;
            if (device == jVar.f15006y) {
                if (jVar.f15008z == cameraCaptureSession) {
                    jVar.f15008z = null;
                    jVar.A = null;
                }
                if (jVar.S) {
                    j jVar2 = this.f14921a;
                    if (jVar2.f15006y != null && !jVar2.Y) {
                        j jVar3 = this.f14921a;
                        if (jVar3.f14981k0 != null && !jVar3.f14977i0) {
                            jVar3.f14978j.b("camera session configuration failed with warm device open; retrying with standby device closed");
                            j jVar4 = this.f14921a;
                            if (jVar4.U) {
                                jVar4.f14994r0 = false;
                            }
                            jVar4.r("session configuration failed", null);
                            this.f14921a.o();
                            return;
                        } else if (jVar3.G == o0.FPS_60) {
                            jVar3.t("60 fps session configuration failed", null);
                            return;
                        } else {
                            jVar3.C(new IllegalStateException("Camera capture session configuration failed"));
                            return;
                        }
                    }
                }
                this.f14921a.f14978j.b("stale capture session configuration failure ignored");
                return;
            }
        }
        n nVar = this.f14921a.f14978j;
        nVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        String str2;
        if (this.f14921a.S && this.f14921a.f15006y != null) {
            CameraDevice device = cameraCaptureSession.getDevice();
            j jVar = this.f14921a;
            if (device == jVar.f15006y) {
                jVar.f15008z = cameraCaptureSession;
                try {
                    jVar.D = jVar.E;
                    jVar.A = jVar.q(true);
                    r rVar = this.f14921a.v;
                    if (rVar != null) {
                        Handler handler = rVar.f15086m;
                        if (rVar.Z && handler != null) {
                            handler.post(new o(rVar, 1));
                        }
                    }
                    j jVar2 = this.f14921a;
                    boolean z10 = jVar2.W;
                    jVar2.W = false;
                    if (z10) {
                        jVar2.U = false;
                    }
                    jVar2.X = z10;
                    j jVar3 = this.f14921a;
                    CameraCaptureSession cameraCaptureSession2 = jVar3.f15008z;
                    CaptureRequest.Builder builder = jVar3.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar3.f14974g1, jVar3.f14985n);
                    }
                    n nVar = this.f14921a.f14978j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f14921a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f14921a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(j.s(this.f14921a.f15000u0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(j.s(this.f14921a.f14996s0));
                    if (z10) {
                        StringBuilder sb3 = new StringBuilder(", switchPath=");
                        if (this.f14921a.f14994r0) {
                            str2 = "WARM_DEVICE";
                        } else {
                            str2 = "SEQUENTIAL";
                        }
                        sb3.append(str2);
                        sb3.append(", switchElapsedMs=");
                        sb3.append(j.s(this.f14921a.f15001v0));
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    nVar.b(sb2.toString());
                    j jVar4 = this.f14921a;
                    jVar4.f14961c.post(new a(jVar4, 7));
                    j jVar5 = this.f14921a;
                    xa.d dVar = jVar5.f14980k;
                    m0 m0Var = jVar5.D;
                    n0 n0Var = jVar5.F;
                    o0 o0Var = jVar5.G;
                    Size size = jVar5.f14991q;
                    Size size2 = jVar5.f14993r;
                    j jVar6 = this.f14921a;
                    ((t0) dVar.f51105b).f15119i.post(new x0(dVar, new h(m0Var, n0Var, o0Var, size, size2, jVar6.L, jVar6.x()), z10, 7));
                    m0 m0Var2 = this.f14921a.C;
                    j jVar7 = this.f14921a;
                    if (m0Var2 != jVar7.D) {
                        jVar7.O(jVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    j jVar8 = this.f14921a;
                    if (jVar8.G == o0.FPS_60) {
                        jVar8.t("60 fps request submission rejected", e7);
                        return;
                    } else {
                        jVar8.C(e7);
                        return;
                    }
                }
            }
        }
        n nVar2 = this.f14921a.f14978j;
        nVar2.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
        cameraCaptureSession.close();
    }
}
