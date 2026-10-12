package li;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import di.x0;
import ji.d4;
public final class g extends CameraCaptureSession.StateCallback {
    public final int f14790a;
    public final l f14791b;

    public g(l lVar, int i10) {
        this.f14790a = i10;
        this.f14791b = lVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f14790a) {
            case 0:
                l lVar = this.f14791b;
                if (lVar.B == cameraCaptureSession) {
                    lVar.B = null;
                    lVar.D = null;
                    lVar.f14868p0 = false;
                    return;
                }
                return;
            default:
                l lVar2 = this.f14791b;
                if (lVar2.A == cameraCaptureSession) {
                    lVar2.A = null;
                    lVar2.C = null;
                    lVar2.Q = false;
                    lVar2.f14851j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f14790a) {
            case 0:
                cameraCaptureSession.close();
                l lVar = this.f14791b;
                if (lVar.m0 && lVar.f14877s0 != null && cameraCaptureSession.getDevice() == lVar.f14877s0) {
                    lVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f14791b.f14891z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    l lVar2 = this.f14791b;
                    if (device == lVar2.f14891z) {
                        if (lVar2.A == cameraCaptureSession) {
                            lVar2.A = null;
                            lVar2.C = null;
                        }
                        if (lVar2.V) {
                            l lVar3 = this.f14791b;
                            if (lVar3.f14891z != null && !lVar3.f14831b0) {
                                l lVar4 = this.f14791b;
                                if (lVar4.m0) {
                                    lVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (lVar4.f14877s0 != null && !lVar4.f14858l0) {
                                    if (lVar4.X && lVar4.D0) {
                                        lVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    lVar4.f14851j.b("camera session configuration failed with warm device open");
                                    this.f14791b.R("session configuration failed", null);
                                    return;
                                } else if (lVar4.J == p0.FPS_60) {
                                    lVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    lVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f14791b.f14851j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                p pVar = this.f14791b.f14851j;
                pVar.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
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
        switch (this.f14790a) {
            case 0:
                if (this.f14791b.V) {
                    l lVar = this.f14791b;
                    if (lVar.m0 && lVar.f14877s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        l lVar2 = this.f14791b;
                        CameraDevice cameraDevice = lVar2.f14877s0;
                        if (device == cameraDevice && (surface = lVar2.v) != null && (jVar = lVar2.f14886w0) != null) {
                            try {
                                lVar2.B = cameraCaptureSession;
                                lVar2.D = lVar2.x(cameraDevice, surface, jVar, false, true);
                                CaptureRequest build = this.f14791b.D.build();
                                l lVar3 = this.f14791b;
                                cameraCaptureSession.setRepeatingRequest(build, lVar3.f14881t1, lVar3.f14861n);
                                l lVar4 = this.f14791b;
                                lVar4.f14868p0 = true;
                                lVar4.f14851j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + l.z(this.f14791b.G0));
                                l.f(this.f14791b);
                                return;
                            } catch (Exception e) {
                                this.f14791b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.f14791b.f14851j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f14791b.V && this.f14791b.f14891z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    l lVar5 = this.f14791b;
                    CameraDevice cameraDevice2 = lVar5.f14891z;
                    if (device2 == cameraDevice2) {
                        lVar5.A = cameraCaptureSession;
                        try {
                            lVar5.G = lVar5.H;
                            if (cameraDevice2 != null && lVar5.f14882u != null) {
                                lVar5.C = lVar5.x(cameraDevice2, lVar5.f14882u, lVar5.l(), true, true);
                                u uVar = this.f14791b.f14885w;
                                if (uVar != null) {
                                    Handler handler = uVar.f14997u;
                                    if (uVar.f14992r0 && handler != null) {
                                        handler.post(new q(uVar, 1));
                                    }
                                }
                                l lVar6 = this.f14791b;
                                if (lVar6.m0 && lVar6.f14888x0 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (lVar6.Z && !z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = lVar6.A;
                                CaptureRequest.Builder builder = lVar6.C;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), lVar6.f14881t1, lVar6.f14861n);
                                }
                                l lVar7 = this.f14791b;
                                if (lVar7.m0) {
                                    lVar7.f14865o0 = true;
                                }
                                if (!z10) {
                                    lVar7.Z = false;
                                }
                                if (z11) {
                                    lVar7.X = false;
                                }
                                lVar7.f14828a0 = z11;
                                p pVar = this.f14791b.f14851j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f14791b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f14791b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(l.z(this.f14791b.G0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(l.z(this.f14791b.E0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f14791b.D0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(l.z(this.f14791b.H0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                pVar.b(sb2.toString());
                                l lVar8 = this.f14791b;
                                lVar8.f14833c.post(new a(lVar8, 8));
                                l lVar9 = this.f14791b;
                                d4 d4Var = lVar9.f14854k;
                                n0 n0Var = lVar9.G;
                                o0 o0Var = lVar9.I;
                                p0 p0Var = lVar9.J;
                                Size size = lVar9.f14870q;
                                Size size2 = lVar9.f14873r;
                                l lVar10 = this.f14791b;
                                ((u0) d4Var.f13233b).f15011i.post(new x0(d4Var, new i(n0Var, o0Var, p0Var, size, size2, lVar10.O, lVar10.F()), z11, 8));
                                if (z10) {
                                    l.f(this.f14791b);
                                    return;
                                }
                                n0 n0Var2 = this.f14791b.F;
                                l lVar11 = this.f14791b;
                                if (n0Var2 != lVar11.G) {
                                    lVar11.a0(lVar11.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e7) {
                            l lVar12 = this.f14791b;
                            if (lVar12.m0) {
                                lVar12.A("active request submission failed", e7, false);
                                return;
                            } else if (lVar12.X && lVar12.D0) {
                                lVar12.L("request submission failed", e7);
                                return;
                            } else if (lVar12.J == p0.FPS_60) {
                                lVar12.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                lVar12.N(e7);
                                return;
                            }
                        }
                    }
                }
                this.f14791b.f14851j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}
