package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
public final class wl9 extends CameraCaptureSession.StateCallback {
    public final byte a;
    public final bm9 b;

    public wl9(bm9 bm9Var, byte b) {
        this.a = b;
        this.b = bm9Var;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        byte b = this.a;
        bm9 bm9Var = this.b;
        switch (b) {
            case 0:
                if (bm9Var.A == cameraCaptureSession) {
                    bm9Var.A = null;
                    bm9Var.C = null;
                    bm9Var.m0 = false;
                    return;
                }
                return;
            default:
                if (bm9Var.z == cameraCaptureSession) {
                    bm9Var.z = null;
                    bm9Var.B = null;
                    bm9Var.P = false;
                    bm9Var.j.b("capture session closed");
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
                bm9 bm9Var = this.b;
                if (bm9Var.k0 && bm9Var.o0 != null && cameraCaptureSession.getDevice() == bm9Var.o0) {
                    bm9Var.y("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                bm9 bm9Var2 = this.b;
                if (bm9Var2.y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    bm9 bm9Var3 = this.b;
                    if (device != bm9Var3.y) {
                        bm9Var2 = bm9Var3;
                    } else {
                        if (bm9Var3.z == cameraCaptureSession) {
                            bm9Var3.z = null;
                            bm9Var3.B = null;
                        }
                        if (bm9Var3.U) {
                            bm9 bm9Var4 = this.b;
                            if (bm9Var4.y != null && !bm9Var4.Y) {
                                bm9 bm9Var5 = this.b;
                                if (bm9Var5.k0) {
                                    bm9Var5.y("active session configuration failed", null, false);
                                    return;
                                } else if (bm9Var5.I == pn9.FPS_60) {
                                    bm9Var5.z("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    bm9Var5.M(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.b.j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                fm9 fm9Var = bm9Var2.j;
                fm9Var.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                return;
        }
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        zl9 zl9Var;
        boolean z;
        boolean z2;
        String str;
        switch (this.a) {
            case 0:
                if (this.b.U) {
                    bm9 bm9Var = this.b;
                    if (bm9Var.k0 && bm9Var.o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        bm9 bm9Var2 = this.b;
                        CameraDevice cameraDevice = bm9Var2.o0;
                        if (device == cameraDevice && (surface = bm9Var2.u) != null && (zl9Var = bm9Var2.p0) != null) {
                            try {
                                bm9Var2.A = cameraCaptureSession;
                                bm9Var2.C = bm9Var2.u(cameraDevice, surface, zl9Var, false, true);
                                CaptureRequest build = this.b.C.build();
                                bm9 bm9Var3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, bm9Var3.r1, bm9Var3.n);
                                bm9 bm9Var4 = this.b;
                                bm9Var4.m0 = true;
                                bm9Var4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + bm9.x(this.b.E0));
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
                    bm9 bm9Var5 = this.b;
                    CameraDevice cameraDevice2 = bm9Var5.y;
                    if (device2 == cameraDevice2) {
                        bm9Var5.z = cameraCaptureSession;
                        try {
                            bm9Var5.F = bm9Var5.G;
                            if (cameraDevice2 != null && bm9Var5.t != null) {
                                bm9Var5.B = bm9Var5.u(cameraDevice2, bm9Var5.t, bm9Var5.g(), true, true);
                                km9 km9Var = this.b.v;
                                if (km9Var != null) {
                                    Handler handler = km9Var.u;
                                    if (km9Var.r0 && handler != null) {
                                        handler.post(new hm9(km9Var, (byte) 0));
                                    }
                                }
                                bm9 bm9Var6 = this.b;
                                if (bm9Var6.k0 && bm9Var6.q0 != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (bm9Var6.W && !z) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = bm9Var6.z;
                                CaptureRequest.Builder builder = bm9Var6.B;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), bm9Var6.r1, bm9Var6.n);
                                }
                                bm9 bm9Var7 = this.b;
                                if (bm9Var7.k0) {
                                    bm9Var7.l0 = true;
                                }
                                if (!z) {
                                    bm9Var7.W = false;
                                }
                                if (z2) {
                                    bm9Var7.V = false;
                                }
                                bm9Var7.X = z2;
                                fm9 fm9Var = this.b.j;
                                StringBuilder sb = new StringBuilder("capture session configured: facing=");
                                sb.append(this.b.F);
                                sb.append(", fpsRange=");
                                sb.append(this.b.J);
                                sb.append(", elapsedMs=");
                                sb.append(bm9.x(this.b.E0));
                                sb.append(", segmentElapsedMs=");
                                sb.append(bm9.x(this.b.C0));
                                if (z2) {
                                    str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + bm9.x(this.b.F0);
                                } else {
                                    str = "";
                                }
                                sb.append(str);
                                fm9Var.b(sb.toString());
                                bm9 bm9Var8 = this.b;
                                bm9Var8.c.post(new rl9(bm9Var8, (byte) 9));
                                bm9 bm9Var9 = this.b;
                                et8 et8Var = bm9Var9.k;
                                nn9 nn9Var = bm9Var9.F;
                                on9 on9Var = bm9Var9.H;
                                pn9 pn9Var = bm9Var9.I;
                                Size size = bm9Var9.q;
                                bm9 bm9Var10 = this.b;
                                ((un9) et8Var.b).i.post(new yl6(et8Var, new yl9(nn9Var, on9Var, pn9Var, size, bm9Var10.N, bm9Var10.E()), z2, (byte) 21));
                                bm9 bm9Var11 = this.b;
                                if (z) {
                                    bm9Var11.n();
                                    return;
                                }
                                nn9 nn9Var2 = bm9Var11.E;
                                bm9 bm9Var12 = this.b;
                                if (nn9Var2 != bm9Var12.F) {
                                    bm9Var12.Y(bm9Var12.E);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e2) {
                            bm9 bm9Var13 = this.b;
                            if (bm9Var13.k0) {
                                bm9Var13.y("active request submission failed", e2, false);
                                return;
                            } else if (bm9Var13.I == pn9.FPS_60) {
                                bm9Var13.z("60 fps request submission rejected", e2);
                                return;
                            } else {
                                bm9Var13.M(e2);
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
