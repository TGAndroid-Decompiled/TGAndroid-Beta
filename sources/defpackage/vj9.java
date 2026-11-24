package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
public final class vj9 extends CameraCaptureSession.StateCallback {
    public final byte a;
    public final ak9 b;

    public vj9(ak9 ak9Var, byte b) {
        this.a = b;
        this.b = ak9Var;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        byte b = this.a;
        ak9 ak9Var = this.b;
        switch (b) {
            case 0:
                if (ak9Var.A == cameraCaptureSession) {
                    ak9Var.A = null;
                    ak9Var.C = null;
                    ak9Var.m0 = false;
                    return;
                }
                return;
            default:
                if (ak9Var.z == cameraCaptureSession) {
                    ak9Var.z = null;
                    ak9Var.B = null;
                    ak9Var.P = false;
                    ak9Var.j.b("capture session closed");
                    return;
                }
                return;
        }
    }

    @Override
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                cameraCaptureSession.close();
                ak9 ak9Var = this.b;
                if (ak9Var.k0 && ak9Var.o0 != null && cameraCaptureSession.getDevice() == ak9Var.o0) {
                    ak9Var.y("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                ak9 ak9Var2 = this.b;
                if (ak9Var2.y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    ak9 ak9Var3 = this.b;
                    if (device != ak9Var3.y) {
                        ak9Var2 = ak9Var3;
                    } else {
                        if (ak9Var3.z == cameraCaptureSession) {
                            ak9Var3.z = null;
                            ak9Var3.B = null;
                        }
                        if (ak9Var3.U) {
                            ak9 ak9Var4 = this.b;
                            if (ak9Var4.y != null && !ak9Var4.Y) {
                                ak9 ak9Var5 = this.b;
                                if (ak9Var5.k0) {
                                    ak9Var5.y("active session configuration failed", null, false);
                                    return;
                                } else if (ak9Var5.I == pl9.FPS_60) {
                                    ak9Var5.z("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    ak9Var5.M(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.b.j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                ek9 ek9Var = ak9Var2.j;
                ek9Var.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                return;
        }
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        yj9 yj9Var;
        boolean z;
        boolean z2;
        String str;
        switch (this.a) {
            case 0:
                if (this.b.U) {
                    ak9 ak9Var = this.b;
                    if (ak9Var.k0 && ak9Var.o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        ak9 ak9Var2 = this.b;
                        CameraDevice cameraDevice = ak9Var2.o0;
                        if (device == cameraDevice && (surface = ak9Var2.u) != null && (yj9Var = ak9Var2.p0) != null) {
                            try {
                                ak9Var2.A = cameraCaptureSession;
                                ak9Var2.C = ak9Var2.u(cameraDevice, surface, yj9Var, false, true);
                                CaptureRequest build = this.b.C.build();
                                ak9 ak9Var3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, ak9Var3.r1, ak9Var3.n);
                                ak9 ak9Var4 = this.b;
                                ak9Var4.m0 = true;
                                ak9Var4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + ak9.x(this.b.E0));
                                this.b.n();
                                return;
                            } catch (Exception e) {
                                this.b.y("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.b.j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.b.U && this.b.y != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    ak9 ak9Var5 = this.b;
                    CameraDevice cameraDevice2 = ak9Var5.y;
                    if (device2 == cameraDevice2) {
                        ak9Var5.z = cameraCaptureSession;
                        try {
                            ak9Var5.F = ak9Var5.G;
                            if (cameraDevice2 != null && ak9Var5.t != null) {
                                ak9Var5.B = ak9Var5.u(cameraDevice2, ak9Var5.t, ak9Var5.g(), true, true);
                                jk9 jk9Var = this.b.v;
                                if (jk9Var != null) {
                                    Handler handler = jk9Var.u;
                                    if (jk9Var.r0 && handler != null) {
                                        handler.post(new gk9(jk9Var, (byte) 0));
                                    }
                                }
                                ak9 ak9Var6 = this.b;
                                if (ak9Var6.k0 && ak9Var6.q0 != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (ak9Var6.W && !z) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = ak9Var6.z;
                                CaptureRequest.Builder builder = ak9Var6.B;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), ak9Var6.r1, ak9Var6.n);
                                }
                                ak9 ak9Var7 = this.b;
                                if (ak9Var7.k0) {
                                    ak9Var7.l0 = true;
                                }
                                if (!z) {
                                    ak9Var7.W = false;
                                }
                                if (z2) {
                                    ak9Var7.V = false;
                                }
                                ak9Var7.X = z2;
                                ek9 ek9Var = this.b.j;
                                StringBuilder sb = new StringBuilder("capture session configured: facing=");
                                sb.append(this.b.F);
                                sb.append(", fpsRange=");
                                sb.append(this.b.J);
                                sb.append(", elapsedMs=");
                                sb.append(ak9.x(this.b.E0));
                                sb.append(", segmentElapsedMs=");
                                sb.append(ak9.x(this.b.C0));
                                if (z2) {
                                    str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + ak9.x(this.b.F0);
                                } else {
                                    str = "";
                                }
                                sb.append(str);
                                ek9Var.b(sb.toString());
                                ak9 ak9Var8 = this.b;
                                ak9Var8.c.post(new pj9(ak9Var8, (byte) 9));
                                ak9 ak9Var9 = this.b;
                                g29 g29Var = ak9Var9.k;
                                nl9 nl9Var = ak9Var9.F;
                                ol9 ol9Var = ak9Var9.H;
                                pl9 pl9Var = ak9Var9.I;
                                Size size = ak9Var9.q;
                                ak9 ak9Var10 = this.b;
                                ((ul9) g29Var.b).i.post(new vj6(g29Var, new xj9(nl9Var, ol9Var, pl9Var, size, ak9Var10.N, ak9Var10.E()), z2, (byte) 21));
                                ak9 ak9Var11 = this.b;
                                if (z) {
                                    ak9Var11.n();
                                    return;
                                }
                                nl9 nl9Var2 = ak9Var11.E;
                                ak9 ak9Var12 = this.b;
                                if (nl9Var2 != ak9Var12.F) {
                                    ak9Var12.Y(ak9Var12.E);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e2) {
                            ak9 ak9Var13 = this.b;
                            if (ak9Var13.k0) {
                                ak9Var13.y("active request submission failed", e2, false);
                                return;
                            } else if (ak9Var13.I == pl9.FPS_60) {
                                ak9Var13.z("60 fps request submission rejected", e2);
                                return;
                            } else {
                                ak9Var13.M(e2);
                                return;
                            }
                        }
                    }
                }
                this.b.j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}
