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
        if (jVar.f15012z != cameraCaptureSession) {
            return;
        }
        jVar.f15012z = null;
        jVar.A = null;
        jVar.N = false;
        jVar.f14980j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        if (this.f14921a.f15010y != null) {
            CameraDevice device = cameraCaptureSession.getDevice();
            j jVar = this.f14921a;
            if (device == jVar.f15010y) {
                if (jVar.f15012z == cameraCaptureSession) {
                    jVar.f15012z = null;
                    jVar.A = null;
                }
                if (jVar.S) {
                    j jVar2 = this.f14921a;
                    if (jVar2.f15010y != null && !jVar2.Y) {
                        j jVar3 = this.f14921a;
                        if (jVar3.f14984k0 != null && !jVar3.f14978i0) {
                            if (jVar3.U && jVar3.f15005v0) {
                                jVar3.F("session configuration failed", null);
                                return;
                            }
                            jVar3.f14980j.b("camera session configuration failed with warm device open");
                            this.f14921a.L("session configuration failed", null);
                            return;
                        } else if (jVar3.G == o0.FPS_60) {
                            jVar3.v("60 fps session configuration failed", null);
                            return;
                        } else {
                            jVar3.H(new IllegalStateException("Camera capture session configuration failed"));
                            return;
                        }
                    }
                }
                this.f14921a.f14980j.b("stale capture session configuration failure ignored");
                return;
            }
        }
        n nVar = this.f14921a.f14980j;
        nVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        String str2;
        if (this.f14921a.S && this.f14921a.f15010y != null) {
            CameraDevice device = cameraCaptureSession.getDevice();
            j jVar = this.f14921a;
            if (device == jVar.f15010y) {
                jVar.f15012z = cameraCaptureSession;
                try {
                    jVar.D = jVar.E;
                    jVar.A = jVar.s(true);
                    r rVar = this.f14921a.v;
                    if (rVar != null) {
                        Handler handler = rVar.f15090m;
                        if (rVar.Z && handler != null) {
                            handler.post(new o(rVar, 1));
                        }
                    }
                    j jVar2 = this.f14921a;
                    boolean z10 = jVar2.W;
                    CameraCaptureSession cameraCaptureSession2 = jVar2.f15012z;
                    CaptureRequest.Builder builder = jVar2.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar2.f14985k1, jVar2.f14989n);
                    }
                    j jVar3 = this.f14921a;
                    jVar3.W = false;
                    if (z10) {
                        jVar3.U = false;
                    }
                    jVar3.X = z10;
                    n nVar = this.f14921a.f14980j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f14921a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f14921a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(j.u(this.f14921a.f15011y0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(j.u(this.f14921a.f15007w0));
                    if (z10) {
                        StringBuilder sb3 = new StringBuilder(", switchPath=");
                        if (this.f14921a.f15005v0) {
                            str2 = "WARM_DEVICE";
                        } else {
                            str2 = "SEQUENTIAL";
                        }
                        sb3.append(str2);
                        sb3.append(", switchElapsedMs=");
                        sb3.append(j.u(this.f14921a.f15013z0));
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    nVar.b(sb2.toString());
                    j jVar4 = this.f14921a;
                    jVar4.f14961c.post(new a(jVar4, 7));
                    j jVar5 = this.f14921a;
                    xa.d dVar = jVar5.f14983k;
                    m0 m0Var = jVar5.D;
                    n0 n0Var = jVar5.F;
                    o0 o0Var = jVar5.G;
                    Size size = jVar5.f14995q;
                    Size size2 = jVar5.f14997r;
                    j jVar6 = this.f14921a;
                    ((t0) dVar.f51151b).f15123i.post(new x0(dVar, new h(m0Var, n0Var, o0Var, size, size2, jVar6.L, jVar6.z()), z10, 7));
                    m0 m0Var2 = this.f14921a.C;
                    j jVar7 = this.f14921a;
                    if (m0Var2 != jVar7.D) {
                        jVar7.U(jVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    j jVar8 = this.f14921a;
                    if (jVar8.U && jVar8.f15005v0) {
                        jVar8.F("request submission failed", e7);
                        return;
                    } else if (jVar8.G == o0.FPS_60) {
                        jVar8.v("60 fps request submission rejected", e7);
                        return;
                    } else {
                        jVar8.H(e7);
                        return;
                    }
                }
            }
        }
        n nVar2 = this.f14921a.f14980j;
        nVar2.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
        cameraCaptureSession.close();
    }
}
