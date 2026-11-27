package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
public final class in9 extends CameraDevice.StateCallback {
    public final byte a;
    public final on9 b;

    public in9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.F(cameraDevice);
                return;
            default:
                on9Var.F(cameraDevice);
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
                on9 on9Var = this.b;
                if (cameraDevice == on9Var.o0) {
                    on9Var.B(cameraDevice, "disconnected", null);
                    return;
                }
                if (on9Var.U && !this.b.Y && !this.b.V) {
                    z = true;
                } else {
                    z = false;
                }
                on9 on9Var2 = this.b;
                if (on9Var2.y == cameraDevice) {
                    on9Var2.k();
                    on9Var2 = this.b;
                    on9Var2.y = null;
                }
                on9Var2.l(cameraDevice, 1);
                if (z) {
                    this.b.L(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                on9 on9Var3 = this.b;
                sn9 sn9Var = on9Var3.j;
                StringBuilder sb = new StringBuilder("warm camera disconnected: id=");
                sb.append(cameraDevice.getId());
                sb.append(", closing=");
                ArrayList arrayList = on9Var3.s0;
                sb.append(arrayList.contains(cameraDevice));
                sn9Var.b(sb.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else {
                    on9Var3.B(cameraDevice, "disconnected", null);
                    return;
                }
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                sn9 sn9Var = on9Var.j;
                StringBuilder sb = new StringBuilder("camera error: id=");
                sb.append(cameraDevice.getId());
                sb.append(", error=");
                sb.append(on9.e(i));
                sb.append(" (");
                sb.append(i);
                sb.append("), closing=");
                ArrayList arrayList = on9Var.s0;
                sb.append(arrayList.contains(cameraDevice));
                sn9Var.b(sb.toString());
                if (arrayList.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == on9Var.o0) {
                    on9Var.B(cameraDevice, "error=" + on9.e(i) + " (" + i + ")", null);
                    return;
                } else {
                    if (on9Var.y == cameraDevice) {
                        on9Var.k();
                        on9Var.y = null;
                    }
                    on9Var.l(cameraDevice, 1);
                    on9Var.L(new IllegalStateException("Camera device error: " + on9.e(i) + " (" + i + ")"));
                    return;
                }
            default:
                sn9 sn9Var2 = on9Var.j;
                StringBuilder sb2 = new StringBuilder("warm camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(on9.e(i));
                sb2.append(" (");
                sb2.append(i);
                sb2.append("), closing=");
                ArrayList arrayList2 = on9Var.s0;
                sb2.append(arrayList2.contains(cameraDevice));
                sn9Var2.b(sb2.toString());
                if (arrayList2.contains(cameraDevice)) {
                    cameraDevice.close();
                    return;
                }
                on9Var.B(cameraDevice, "error=" + on9.e(i) + " (" + i + ")", new IllegalStateException("Warm camera device error: " + on9.e(i) + " (" + i + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        int i = 1;
        switch (this.a) {
            case 0:
                sn9 sn9Var = this.b.j;
                StringBuilder sb = new StringBuilder("camera opened: id=");
                sb.append(cameraDevice.getId());
                sb.append(", elapsedMs=");
                sb.append(on9.x(this.b.D0));
                if (this.b.W) {
                    str = ", switchElapsedMs=" + on9.x(this.b.F0);
                } else {
                    str = "";
                }
                sb.append(str);
                sn9Var.b(sb.toString());
                if (this.b.U) {
                    on9 on9Var = this.b;
                    if (!on9Var.V) {
                        on9Var.y = cameraDevice;
                        if (on9Var.k0) {
                            if (on9Var.v0 != null || on9Var.o0 == null) {
                                on9Var.j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            } else {
                                on9Var.r();
                                return;
                            }
                        }
                        on9Var.q();
                        return;
                    }
                }
                on9 on9Var2 = this.b;
                if (on9Var2.V) {
                    i = 2;
                }
                on9Var2.l(cameraDevice, i);
                return;
            default:
                if (this.b.U && !this.b.Y) {
                    on9 on9Var3 = this.b;
                    if (on9Var3.k0 && on9Var3.p0 != null && cameraDevice.getId().equals(this.b.p0.a)) {
                        on9 on9Var4 = this.b;
                        on9Var4.o0 = cameraDevice;
                        on9Var4.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.p0.b + ", elapsedMs=" + on9.x(this.b.y0));
                        on9 on9Var5 = this.b;
                        if (on9Var5.y != null && on9Var5.z == null && !on9Var5.V) {
                            on9Var5.j.b("both camera devices opened; configuring dual sessions");
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
