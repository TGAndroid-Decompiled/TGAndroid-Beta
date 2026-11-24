package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class uj9 extends CameraDevice.StateCallback {
    public final byte a;
    public final ak9 b;

    public uj9(ak9 ak9Var, byte b) {
        this.a = b;
        this.b = ak9Var;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        byte b = this.a;
        ak9 ak9Var = this.b;
        switch (b) {
            case 0:
                ak9Var.F(cameraDevice);
                return;
            default:
                ak9Var.F(cameraDevice);
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z;
        switch (this.a) {
            case 0:
                this.b.j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.b.s0.contains(cameraDevice));
                if (this.b.s0.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                ak9 ak9Var = this.b;
                if (cameraDevice == ak9Var.o0) {
                    ak9Var.B(cameraDevice, "disconnected", null);
                    return;
                }
                if (ak9Var.U && !this.b.Y && !this.b.V) {
                    z = true;
                } else {
                    z = false;
                }
                ak9 ak9Var2 = this.b;
                if (ak9Var2.y == cameraDevice) {
                    ak9Var2.k();
                    ak9Var2 = this.b;
                    ak9Var2.y = null;
                }
                ak9Var2.l(cameraDevice, 1);
                if (z) {
                    this.b.L(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                ak9 ak9Var3 = this.b;
                ek9 ek9Var = ak9Var3.j;
                StringBuilder sb = new StringBuilder("warm camera disconnected: id=");
                sb.append(cameraDevice.getId());
                sb.append(", closing=");
                ArrayList arrayList = ak9Var3.s0;
                sb.append(arrayList.contains(cameraDevice));
                ek9Var.b(sb.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else {
                    ak9Var3.B(cameraDevice, "disconnected", null);
                    return;
                }
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i) {
        byte b = this.a;
        ak9 ak9Var = this.b;
        switch (b) {
            case 0:
                ek9 ek9Var = ak9Var.j;
                StringBuilder sb = new StringBuilder("camera error: id=");
                sb.append(cameraDevice.getId());
                sb.append(", error=");
                sb.append(ak9.e(i));
                sb.append(" (");
                sb.append(i);
                sb.append("), closing=");
                ArrayList arrayList = ak9Var.s0;
                sb.append(arrayList.contains(cameraDevice));
                ek9Var.b(sb.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == ak9Var.o0) {
                    ak9Var.B(cameraDevice, "error=" + ak9.e(i) + " (" + i + ")", null);
                    return;
                } else {
                    if (ak9Var.y == cameraDevice) {
                        ak9Var.k();
                        ak9Var.y = null;
                    }
                    ak9Var.l(cameraDevice, 1);
                    ak9Var.L(new IllegalStateException("Camera device error: " + ak9.e(i) + " (" + i + ")"));
                    return;
                }
            default:
                ek9 ek9Var2 = ak9Var.j;
                StringBuilder sb2 = new StringBuilder("warm camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(ak9.e(i));
                sb2.append(" (");
                sb2.append(i);
                sb2.append("), closing=");
                ArrayList arrayList2 = ak9Var.s0;
                sb2.append(arrayList2.contains(cameraDevice));
                ek9Var2.b(sb2.toString());
                if (arrayList2.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                ak9Var.B(cameraDevice, "error=" + ak9.e(i) + " (" + i + ")", new IllegalStateException("Warm camera device error: " + ak9.e(i) + " (" + i + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        int i = 1;
        switch (this.a) {
            case 0:
                ek9 ek9Var = this.b.j;
                StringBuilder sb = new StringBuilder("camera opened: id=");
                sb.append(cameraDevice.getId());
                sb.append(", elapsedMs=");
                sb.append(ak9.x(this.b.D0));
                if (this.b.W) {
                    str = ", switchElapsedMs=" + ak9.x(this.b.F0);
                } else {
                    str = "";
                }
                sb.append(str);
                ek9Var.b(sb.toString());
                if (this.b.U) {
                    ak9 ak9Var = this.b;
                    if (!ak9Var.V) {
                        ak9Var.y = cameraDevice;
                        if (ak9Var.k0) {
                            if (ak9Var.v0 != null || ak9Var.o0 == null) {
                                ak9Var.j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            } else {
                                ak9Var.r();
                                return;
                            }
                        }
                        ak9Var.q();
                        return;
                    }
                }
                ak9 ak9Var2 = this.b;
                if (ak9Var2.V) {
                    i = 2;
                }
                ak9Var2.l(cameraDevice, i);
                return;
            default:
                if (this.b.U && !this.b.Y) {
                    ak9 ak9Var3 = this.b;
                    if (ak9Var3.k0 && ak9Var3.p0 != null && cameraDevice.getId().equals(this.b.p0.a)) {
                        ak9 ak9Var4 = this.b;
                        ak9Var4.o0 = cameraDevice;
                        ak9Var4.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.p0.b + ", elapsedMs=" + ak9.x(this.b.y0));
                        ak9 ak9Var5 = this.b;
                        if (ak9Var5.y != null && ak9Var5.z == null && !ak9Var5.V) {
                            ak9Var5.j.b("both camera devices opened; configuring dual sessions");
                            this.b.r();
                            return;
                        }
                        return;
                    }
                }
                this.b.j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.b.l(cameraDevice, 1);
                return;
        }
    }
}
