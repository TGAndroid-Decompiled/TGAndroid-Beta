package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.x0;
public final class f extends CameraCaptureSession.StateCallback {
    public final j f14920a;

    public f(j jVar) {
        this.f14920a = jVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        j jVar = this.f14920a;
        if (jVar.f15011z != cameraCaptureSession) {
            return;
        }
        jVar.f15011z = null;
        jVar.A = null;
        jVar.N = false;
        jVar.f14979j.b("capture session closed");
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        if (this.f14920a.f15009y != null) {
            CameraDevice device = cameraCaptureSession.getDevice();
            j jVar = this.f14920a;
            if (device == jVar.f15009y) {
                if (jVar.f15011z == cameraCaptureSession) {
                    jVar.f15011z = null;
                    jVar.A = null;
                }
                if (jVar.S) {
                    j jVar2 = this.f14920a;
                    if (jVar2.f15009y != null && !jVar2.Y) {
                        j jVar3 = this.f14920a;
                        if (jVar3.f14983k0 != null && !jVar3.f14977i0) {
                            if (jVar3.U && jVar3.f15004v0) {
                                jVar3.F("session configuration failed", null);
                                return;
                            }
                            jVar3.f14979j.b("camera session configuration failed with warm device open");
                            this.f14920a.L("session configuration failed", null);
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
                this.f14920a.f14979j.b("stale capture session configuration failure ignored");
                return;
            }
        }
        n nVar = this.f14920a.f14979j;
        nVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        String str2;
        if (this.f14920a.S && this.f14920a.f15009y != null) {
            CameraDevice device = cameraCaptureSession.getDevice();
            j jVar = this.f14920a;
            if (device == jVar.f15009y) {
                jVar.f15011z = cameraCaptureSession;
                try {
                    jVar.D = jVar.E;
                    jVar.A = jVar.s(true);
                    r rVar = this.f14920a.v;
                    if (rVar != null) {
                        Handler handler = rVar.f15089m;
                        if (rVar.Z && handler != null) {
                            handler.post(new o(rVar, 1));
                        }
                    }
                    j jVar2 = this.f14920a;
                    boolean z10 = jVar2.W;
                    CameraCaptureSession cameraCaptureSession2 = jVar2.f15011z;
                    CaptureRequest.Builder builder = jVar2.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar2.f14984k1, jVar2.f14988n);
                    }
                    j jVar3 = this.f14920a;
                    jVar3.W = false;
                    if (z10) {
                        jVar3.U = false;
                    }
                    jVar3.X = z10;
                    n nVar = this.f14920a.f14979j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.f14920a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.f14920a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(j.u(this.f14920a.f15010y0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(j.u(this.f14920a.f15006w0));
                    if (z10) {
                        StringBuilder sb3 = new StringBuilder(", switchPath=");
                        if (this.f14920a.f15004v0) {
                            str2 = "WARM_DEVICE";
                        } else {
                            str2 = "SEQUENTIAL";
                        }
                        sb3.append(str2);
                        sb3.append(", switchElapsedMs=");
                        sb3.append(j.u(this.f14920a.f15012z0));
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    nVar.b(sb2.toString());
                    j jVar4 = this.f14920a;
                    jVar4.f14960c.post(new a(jVar4, 7));
                    j jVar5 = this.f14920a;
                    xa.c cVar = jVar5.f14982k;
                    m0 m0Var = jVar5.D;
                    n0 n0Var = jVar5.F;
                    o0 o0Var = jVar5.G;
                    Size size = jVar5.f14994q;
                    Size size2 = jVar5.f14996r;
                    j jVar6 = this.f14920a;
                    ((t0) cVar.f51194b).f15122i.post(new x0(cVar, new h(m0Var, n0Var, o0Var, size, size2, jVar6.L, jVar6.z()), z10, 7));
                    m0 m0Var2 = this.f14920a.C;
                    j jVar7 = this.f14920a;
                    if (m0Var2 != jVar7.D) {
                        jVar7.U(jVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    j jVar8 = this.f14920a;
                    if (jVar8.U && jVar8.f15004v0) {
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
        n nVar2 = this.f14920a.f14979j;
        nVar2.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
        cameraCaptureSession.close();
    }
}
