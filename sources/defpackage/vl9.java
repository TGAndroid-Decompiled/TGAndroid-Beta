package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class vl9 extends CameraDevice.StateCallback {
    public final byte a;
    public final bm9 b;

    public vl9(bm9 bm9Var, byte b) {
        this.a = b;
        this.b = bm9Var;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        byte b = this.a;
        bm9 bm9Var = this.b;
        switch (b) {
            case 0:
                bm9Var.F(cameraDevice);
                return;
            default:
                bm9Var.F(cameraDevice);
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
                bm9 bm9Var = this.b;
                if (cameraDevice == bm9Var.o0) {
                    bm9Var.B(cameraDevice, "disconnected", null);
                    return;
                }
                if (bm9Var.U && !this.b.Y && !this.b.V) {
                    z = true;
                } else {
                    z = false;
                }
                bm9 bm9Var2 = this.b;
                if (bm9Var2.y == cameraDevice) {
                    bm9Var2.k();
                    bm9Var2 = this.b;
                    bm9Var2.y = null;
                }
                bm9Var2.l(cameraDevice, 1);
                if (z) {
                    this.b.L(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                bm9 bm9Var3 = this.b;
                fm9 fm9Var = bm9Var3.j;
                StringBuilder sb = new StringBuilder("warm camera disconnected: id=");
                sb.append(cameraDevice.getId());
                sb.append(", closing=");
                ArrayList arrayList = bm9Var3.s0;
                sb.append(arrayList.contains(cameraDevice));
                fm9Var.b(sb.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else {
                    bm9Var3.B(cameraDevice, "disconnected", null);
                    return;
                }
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i) {
        byte b = this.a;
        bm9 bm9Var = this.b;
        switch (b) {
            case 0:
                fm9 fm9Var = bm9Var.j;
                StringBuilder sb = new StringBuilder("camera error: id=");
                sb.append(cameraDevice.getId());
                sb.append(", error=");
                sb.append(bm9.e(i));
                sb.append(" (");
                sb.append(i);
                sb.append("), closing=");
                ArrayList arrayList = bm9Var.s0;
                sb.append(arrayList.contains(cameraDevice));
                fm9Var.b(sb.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == bm9Var.o0) {
                    bm9Var.B(cameraDevice, "error=" + bm9.e(i) + " (" + i + ")", null);
                    return;
                } else {
                    if (bm9Var.y == cameraDevice) {
                        bm9Var.k();
                        bm9Var.y = null;
                    }
                    bm9Var.l(cameraDevice, 1);
                    bm9Var.L(new IllegalStateException("Camera device error: " + bm9.e(i) + " (" + i + ")"));
                    return;
                }
            default:
                fm9 fm9Var2 = bm9Var.j;
                StringBuilder sb2 = new StringBuilder("warm camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(bm9.e(i));
                sb2.append(" (");
                sb2.append(i);
                sb2.append("), closing=");
                ArrayList arrayList2 = bm9Var.s0;
                sb2.append(arrayList2.contains(cameraDevice));
                fm9Var2.b(sb2.toString());
                if (arrayList2.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                bm9Var.B(cameraDevice, "error=" + bm9.e(i) + " (" + i + ")", new IllegalStateException("Warm camera device error: " + bm9.e(i) + " (" + i + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        int i = 1;
        switch (this.a) {
            case 0:
                fm9 fm9Var = this.b.j;
                StringBuilder sb = new StringBuilder("camera opened: id=");
                sb.append(cameraDevice.getId());
                sb.append(", elapsedMs=");
                sb.append(bm9.x(this.b.D0));
                if (this.b.W) {
                    str = ", switchElapsedMs=" + bm9.x(this.b.F0);
                } else {
                    str = "";
                }
                sb.append(str);
                fm9Var.b(sb.toString());
                if (this.b.U) {
                    bm9 bm9Var = this.b;
                    if (!bm9Var.V) {
                        bm9Var.y = cameraDevice;
                        if (bm9Var.k0) {
                            if (bm9Var.v0 != null || bm9Var.o0 == null) {
                                bm9Var.j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            } else {
                                bm9Var.r();
                                return;
                            }
                        }
                        bm9Var.q();
                        return;
                    }
                }
                bm9 bm9Var2 = this.b;
                if (bm9Var2.V) {
                    i = 2;
                }
                bm9Var2.l(cameraDevice, i);
                return;
            default:
                if (this.b.U && !this.b.Y) {
                    bm9 bm9Var3 = this.b;
                    if (bm9Var3.k0 && bm9Var3.p0 != null && cameraDevice.getId().equals(this.b.p0.a)) {
                        bm9 bm9Var4 = this.b;
                        bm9Var4.o0 = cameraDevice;
                        bm9Var4.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.p0.b + ", elapsedMs=" + bm9.x(this.b.y0));
                        bm9 bm9Var5 = this.b;
                        if (bm9Var5.y != null && bm9Var5.z == null && !bm9Var5.V) {
                            bm9Var5.j.b("both camera devices opened; configuring dual sessions");
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
