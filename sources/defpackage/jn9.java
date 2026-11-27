package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
public final class jn9 extends CameraCaptureSession.StateCallback {
    public final byte a;
    public final on9 b;

    public jn9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                if (on9Var.A == cameraCaptureSession) {
                    on9Var.A = null;
                    on9Var.C = null;
                    on9Var.m0 = false;
                    return;
                }
                return;
            default:
                if (on9Var.z == cameraCaptureSession) {
                    on9Var.z = null;
                    on9Var.B = null;
                    on9Var.P = false;
                    on9Var.j.b("capture session closed");
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
                on9 on9Var = this.b;
                if (on9Var.k0 && on9Var.o0 != null && cameraCaptureSession.getDevice() == on9Var.o0) {
                    on9Var.y("standby session configuration failed", null, true);
                    return;
                }
                return;
            default:
                cameraCaptureSession.close();
                on9 on9Var2 = this.b;
                if (on9Var2.y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    on9 on9Var3 = this.b;
                    if (device != on9Var3.y) {
                        on9Var2 = on9Var3;
                    } else {
                        if (on9Var3.z == cameraCaptureSession) {
                            on9Var3.z = null;
                            on9Var3.B = null;
                        }
                        if (on9Var3.U) {
                            on9 on9Var4 = this.b;
                            if (on9Var4.y != null && !on9Var4.Y) {
                                on9 on9Var5 = this.b;
                                if (on9Var5.k0) {
                                    on9Var5.y("active session configuration failed", null, false);
                                    return;
                                } else if (on9Var5.I == ep9.FPS_60) {
                                    on9Var5.z("60 fps session configuration failed", null);
                                    return;
                                } else {
                                    on9Var5.M(new IllegalStateException("Camera capture session configuration failed"));
                                    return;
                                }
                            }
                        }
                        this.b.j.b("stale capture session configuration failure ignored");
                        return;
                    }
                }
                sn9 sn9Var = on9Var2.j;
                sn9Var.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                return;
        }
    }

    @Override
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        mn9 mn9Var;
        boolean z;
        boolean z2;
        String str;
        switch (this.a) {
            case 0:
                if (this.b.U) {
                    on9 on9Var = this.b;
                    if (on9Var.k0 && on9Var.o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        on9 on9Var2 = this.b;
                        CameraDevice cameraDevice = on9Var2.o0;
                        if (device == cameraDevice && (surface = on9Var2.u) != null && (mn9Var = on9Var2.p0) != null) {
                            try {
                                on9Var2.A = cameraCaptureSession;
                                on9Var2.C = on9Var2.u(cameraDevice, surface, mn9Var, false, true);
                                CaptureRequest build = this.b.C.build();
                                on9 on9Var3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, on9Var3.r1, on9Var3.n);
                                on9 on9Var4 = this.b;
                                on9Var4.m0 = true;
                                on9Var4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + on9.x(this.b.E0));
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
                    on9 on9Var5 = this.b;
                    CameraDevice cameraDevice2 = on9Var5.y;
                    if (device2 == cameraDevice2) {
                        on9Var5.z = cameraCaptureSession;
                        try {
                            on9Var5.F = on9Var5.G;
                            if (cameraDevice2 != null && on9Var5.t != null) {
                                on9Var5.B = on9Var5.u(cameraDevice2, on9Var5.t, on9Var5.g(), true, true);
                                xn9 xn9Var = this.b.v;
                                if (xn9Var != null) {
                                    Handler handler = xn9Var.u;
                                    if (xn9Var.r0 && handler != null) {
                                        handler.post(new un9(xn9Var, (byte) 0));
                                    }
                                }
                                on9 on9Var6 = this.b;
                                if (on9Var6.k0 && on9Var6.q0 != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (on9Var6.W && !z) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                CameraCaptureSession cameraCaptureSession2 = on9Var6.z;
                                CaptureRequest.Builder builder = on9Var6.B;
                                if (cameraCaptureSession2 != null && builder != null) {
                                    cameraCaptureSession2.setRepeatingRequest(builder.build(), on9Var6.r1, on9Var6.n);
                                }
                                on9 on9Var7 = this.b;
                                if (on9Var7.k0) {
                                    on9Var7.l0 = true;
                                }
                                if (!z) {
                                    on9Var7.W = false;
                                }
                                if (z2) {
                                    on9Var7.V = false;
                                }
                                on9Var7.X = z2;
                                sn9 sn9Var = this.b.j;
                                StringBuilder sb = new StringBuilder("capture session configured: facing=");
                                sb.append(this.b.F);
                                sb.append(", fpsRange=");
                                sb.append(this.b.J);
                                sb.append(", elapsedMs=");
                                sb.append(on9.x(this.b.E0));
                                sb.append(", segmentElapsedMs=");
                                sb.append(on9.x(this.b.C0));
                                if (z2) {
                                    str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + on9.x(this.b.F0);
                                } else {
                                    str = "";
                                }
                                sb.append(str);
                                sn9Var.b(sb.toString());
                                on9 on9Var8 = this.b;
                                on9Var8.c.post(new en9(on9Var8, (byte) 4));
                                on9 on9Var9 = this.b;
                                pq8 pq8Var = on9Var9.k;
                                cp9 cp9Var = on9Var9.F;
                                dp9 dp9Var = on9Var9.H;
                                ep9 ep9Var = on9Var9.I;
                                Size size = on9Var9.q;
                                on9 on9Var10 = this.b;
                                ((jp9) pq8Var.b).i.post(new yn6(pq8Var, new ln9(cp9Var, dp9Var, ep9Var, size, on9Var10.N, on9Var10.E()), z2, (byte) 20));
                                on9 on9Var11 = this.b;
                                if (z) {
                                    on9Var11.n();
                                    return;
                                }
                                cp9 cp9Var2 = on9Var11.E;
                                on9 on9Var12 = this.b;
                                if (cp9Var2 != on9Var12.F) {
                                    on9Var12.Y(on9Var12.E);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Camera request surfaces are unavailable");
                        } catch (Exception e2) {
                            on9 on9Var13 = this.b;
                            if (on9Var13.k0) {
                                on9Var13.y("active request submission failed", e2, false);
                                return;
                            } else if (on9Var13.I == ep9.FPS_60) {
                                on9Var13.z("60 fps request submission rejected", e2);
                                return;
                            } else {
                                on9Var13.M(e2);
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
