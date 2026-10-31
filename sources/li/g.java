package li;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
public final class g extends CameraCaptureSession.StateCallback {
    public final int f12051a;
    public final l f12052b;

    public g(l lVar, int i10) {
        this.f12051a = i10;
        this.f12052b = lVar;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f12051a) {
            case 0:
                l lVar = this.f12052b;
                if (lVar.B == cameraCaptureSession) {
                    lVar.B = null;
                    lVar.D = null;
                    lVar.f12149q0 = false;
                    return;
                }
                return;
            default:
                l lVar2 = this.f12052b;
                if (lVar2.A == cameraCaptureSession) {
                    lVar2.A = null;
                    lVar2.C = null;
                    lVar2.Q = false;
                    lVar2.f12129j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f12051a) {
            case 0:
                cameraCaptureSession.close();
                l lVar = this.f12052b;
                if (lVar.f12140n0 && lVar.f12158t0 != null && cameraCaptureSession.getDevice() == lVar.f12158t0) {
                    lVar.A("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                if (this.f12052b.f12170z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    l lVar2 = this.f12052b;
                    if (device == lVar2.f12170z) {
                        if (lVar2.A == cameraCaptureSession) {
                            lVar2.A = null;
                            lVar2.C = null;
                        }
                        if (lVar2.V) {
                            l lVar3 = this.f12052b;
                            if (lVar3.f12170z != null && !lVar3.f12109b0) {
                                l lVar4 = this.f12052b;
                                if (lVar4.f12140n0) {
                                    lVar4.A("active session configuration failed", null, false);
                                    return;
                                } else if (lVar4.f12158t0 != null && !lVar4.m0) {
                                    if (lVar4.X && lVar4.E0) {
                                        lVar4.L("session configuration failed", null);
                                        return;
                                    }
                                    lVar4.f12129j.b("camera session configuration failed with warm device open");
                                    this.f12052b.R("session configuration failed", null);
                                    return;
                                } else if (lVar4.J == s0.FPS_60) {
                                    lVar4.B("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    lVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.f12052b.f12129j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                p pVar = this.f12052b.f12129j;
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
        switch (this.f12051a) {
            case 0:
                if (this.f12052b.V) {
                    l lVar = this.f12052b;
                    if (lVar.f12140n0 && lVar.f12158t0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        l lVar2 = this.f12052b;
                        CameraDevice cameraDevice = lVar2.f12158t0;
                        if (device == cameraDevice && (surface = lVar2.v) != null && (jVar = lVar2.f12167x0) != null) {
                            try {
                                lVar2.B = cameraCaptureSession;
                                lVar2.D = lVar2.x(cameraDevice, surface, jVar, false, true);
                                CaptureRequest build = this.f12052b.D.build();
                                l lVar3 = this.f12052b;
                                cameraCaptureSession.setRepeatingRequest(build, lVar3.f12162u1, lVar3.f12139n);
                                l lVar4 = this.f12052b;
                                lVar4.f12149q0 = true;
                                lVar4.f12129j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + l.z(this.f12052b.H0));
                                l.f(this.f12052b);
                                return;
                            } catch (Exception e) {
                                this.f12052b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.f12052b.f12129j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.f12052b.V && this.f12052b.f12170z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    l lVar5 = this.f12052b;
                    CameraDevice cameraDevice2 = lVar5.f12170z;
                    if (device2 == cameraDevice2) {
                        lVar5.A = cameraCaptureSession;
                        try {
                            lVar5.G = lVar5.H;
                            if (cameraDevice2 != null && lVar5.f12160u != null) {
                                lVar5.C = lVar5.x(cameraDevice2, lVar5.f12160u, lVar5.l(), true, true);
                                v vVar = this.f12052b.f12164w;
                                if (vVar != null) {
                                    Handler handler = vVar.f12286u;
                                    if (vVar.f12281r0 && handler != null) {
                                        handler.post(new q(vVar, 0));
                                    }
                                }
                                l lVar6 = this.f12052b;
                                if (lVar6.f12140n0 && lVar6.f12169y0 != null) {
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
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), lVar6.f12162u1, lVar6.f12139n);
                                }
                                l lVar7 = this.f12052b;
                                if (lVar7.f12140n0) {
                                    lVar7.f12146p0 = true;
                                }
                                if (!z10) {
                                    lVar7.Z = false;
                                }
                                if (z11) {
                                    lVar7.X = false;
                                }
                                lVar7.f12106a0 = z11;
                                p pVar = this.f12052b.f12129j;
                                StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                                sb2.append(this.f12052b.G);
                                sb2.append(", fpsRange=");
                                sb2.append(this.f12052b.K);
                                sb2.append(", elapsedMs=");
                                sb2.append(l.z(this.f12052b.H0));
                                sb2.append(", segmentElapsedMs=");
                                sb2.append(l.z(this.f12052b.F0));
                                if (z11) {
                                    StringBuilder sb3 = new StringBuilder(", switchPath=");
                                    if (this.f12052b.E0) {
                                        str2 = "WARM_DEVICE";
                                    } else {
                                        str2 = "SEQUENTIAL";
                                    }
                                    sb3.append(str2);
                                    sb3.append(", switchElapsedMs=");
                                    sb3.append(l.z(this.f12052b.I0));
                                    str = sb3.toString();
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                pVar.b(sb2.toString());
                                l lVar8 = this.f12052b;
                                lVar8.f12111c.post(new a(lVar8, 8));
                                l lVar9 = this.f12052b;
                                a4.l lVar10 = lVar9.f12132k;
                                q0 q0Var = lVar9.G;
                                r0 r0Var = lVar9.I;
                                s0 s0Var = lVar9.J;
                                Size size = lVar9.f12148q;
                                Size size2 = lVar9.f12151r;
                                l lVar11 = this.f12052b;
                                ((x0) lVar10.f279b).f12312i.post(new ag.j0(lVar10, new i(q0Var, r0Var, s0Var, size, size2, lVar11.O, lVar11.F()), z11, 6));
                                if (z10) {
                                    l.f(this.f12052b);
                                    return;
                                }
                                q0 q0Var2 = this.f12052b.F;
                                l lVar12 = this.f12052b;
                                if (q0Var2 != lVar12.G) {
                                    lVar12.a0(lVar12.F);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e7) {
                            l lVar13 = this.f12052b;
                            if (lVar13.f12140n0) {
                                lVar13.A("active request submission failed", e7, false);
                                return;
                            } else if (lVar13.X && lVar13.E0) {
                                lVar13.L("request submission failed", e7);
                                return;
                            } else if (lVar13.J == s0.FPS_60) {
                                lVar13.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                lVar13.N(e7);
                                return;
                            }
                        }
                    }
                }
                this.f12052b.f12129j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}
