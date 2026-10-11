package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import ci.x0;
public final class g extends CameraCaptureSession.StateCallback {
    public final int f14926a;
    public final k f14927b;

    public g(k kVar, int i10) {
        this.f14926a = i10;
        this.f14927b = kVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f14926a) {
            case 0:
                k kVar = this.f14927b;
                if (kVar.B == cameraCaptureSession) {
                    kVar.B = null;
                    kVar.D = null;
                    kVar.f15003p0 = false;
                    return;
                }
                return;
            default:
                k kVar2 = this.f14927b;
                if (kVar2.A == cameraCaptureSession) {
                    kVar2.A = null;
                    kVar2.C = null;
                    kVar2.Q = false;
                    kVar2.f14986j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f14926a) {
            case 0:
                cameraCaptureSession.close();
                k kVar = this.f14927b;
                if (kVar.m0 && kVar.f15012s0 != null && cameraCaptureSession.getDevice() == kVar.f15012s0) {
                    kVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f14927b.f15026z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    k kVar2 = this.f14927b;
                    if (device == kVar2.f15026z) {
                        if (kVar2.A == cameraCaptureSession) {
                            kVar2.A = null;
                            kVar2.C = null;
                        }
                        if (kVar2.V) {
                            k kVar3 = this.f14927b;
                            if (kVar3.f15026z != null && !kVar3.f14965b0) {
                                k kVar4 = this.f14927b;
                                if (kVar4.m0) {
                                    kVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (kVar4.f15012s0 != null && !kVar4.f14993l0) {
                                    if (kVar4.X && kVar4.D0) {
                                        kVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    kVar4.f14986j.b("camera session configuration failed with warm device open");
                                    this.f14927b.R("session configuration failed", null);
                                    return;
                                } else if (kVar4.J == q0.FPS_60) {
                                    kVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    kVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f14927b.f14986j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                o oVar = this.f14927b.f14986j;
                oVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                return;
        }
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        j jVar;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        switch (this.f14926a) {
            case 0:
                if (this.f14927b.V) {
                    k kVar = this.f14927b;
                    if (kVar.m0 && kVar.f15012s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.f14927b;
                        CameraDevice cameraDevice = kVar2.f15012s0;
                        if (device == cameraDevice && (surface = kVar2.v) != null && (jVar = kVar2.f15021w0) != null) {
                            try {
                                kVar2.B = cameraCaptureSession;
                                kVar2.D = kVar2.x(cameraDevice, surface, jVar, false, true);
                                CaptureRequest build = this.f14927b.D.build();
                                k kVar3 = this.f14927b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.f15016t1, kVar3.f14996n);
                                k kVar4 = this.f14927b;
                                kVar4.f15003p0 = true;
                                kVar4.f14986j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.z(this.f14927b.G0));
                                k.f(this.f14927b);
                                return;
                            } catch (Exception e7) {
                                this.f14927b.A("standby request submission failed", e7, true);
                                return;
                            }
                        }
                    }
                }
                this.f14927b.f14986j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f14927b.V && this.f14927b.f15026z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    k kVar5 = this.f14927b;
                    CameraDevice cameraDevice2 = kVar5.f15026z;
                    if (device2 == cameraDevice2) {
                        kVar5.A = cameraCaptureSession;
                        try {
                            kVar5.G = kVar5.H;
                            if (cameraDevice2 != null && kVar5.f15017u != null) {
                                kVar5.C = kVar5.x(cameraDevice2, kVar5.f15017u, kVar5.l(), true, true);
                                t tVar = this.f14927b.f15020w;
                                if (tVar != null) {
                                    Handler handler = tVar.f15135u;
                                    if (tVar.f15130r0 && handler != null) {
                                        handler.post(new p(tVar, 1));
                                    }
                                }
                                k kVar6 = this.f14927b;
                                if (kVar6.m0 && kVar6.f15023x0 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (kVar6.Z && !z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = kVar6.A;
                                CaptureRequest.Builder builder = kVar6.C;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.f15016t1, kVar6.f14996n);
                                }
                                k kVar7 = this.f14927b;
                                if (kVar7.m0) {
                                    kVar7.f15000o0 = true;
                                }
                                if (!z10) {
                                    kVar7.Z = false;
                                }
                                if (z11) {
                                    kVar7.X = false;
                                }
                                kVar7.f14962a0 = z11;
                                o oVar = this.f14927b.f14986j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f14927b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f14927b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(k.z(this.f14927b.G0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(k.z(this.f14927b.E0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f14927b.D0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(k.z(this.f14927b.H0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                oVar.b(sb2.toString());
                                k kVar8 = this.f14927b;
                                kVar8.f14967c.post(new a(kVar8, 8));
                                k kVar9 = this.f14927b;
                                xa.c cVar = kVar9.f14989k;
                                o0 o0Var = kVar9.G;
                                p0 p0Var = kVar9.I;
                                q0 q0Var = kVar9.J;
                                Size size = kVar9.f15005q;
                                Size size2 = kVar9.f15008r;
                                k kVar10 = this.f14927b;
                                ((v0) cVar.f51228b).f15164i.post(new x0(cVar, new i(o0Var, p0Var, q0Var, size, size2, kVar10.O, kVar10.F()), z11, 8));
                                if (z10) {
                                    k.f(this.f14927b);
                                    return;
                                }
                                o0 o0Var2 = this.f14927b.F;
                                k kVar11 = this.f14927b;
                                if (o0Var2 != kVar11.G) {
                                    kVar11.a0(kVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e10) {
                            k kVar12 = this.f14927b;
                            if (kVar12.m0) {
                                kVar12.A("active request submission failed", e10, false);
                                return;
                            } else if (kVar12.X && kVar12.D0) {
                                kVar12.L("request submission failed", e10);
                                return;
                            } else if (kVar12.J == q0.FPS_60) {
                                kVar12.B("60 fps request submission rejected", e10);
                                return;
                            } else {
                                kVar12.N(e10);
                                return;
                            }
                        }
                    }
                }
                this.f14927b.f14986j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}
