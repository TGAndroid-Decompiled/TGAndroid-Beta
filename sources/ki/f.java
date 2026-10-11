package ki;

import android.hardware.camera2.CameraDevice;
public final class f extends CameraDevice.StateCallback {
    public final int f14921a;
    public final k f14922b;

    public f(k kVar, int i10) {
        this.f14921a = i10;
        this.f14922b = kVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f14921a) {
            case 0:
                if (!k.d(this.f14922b, cameraDevice) && !k.e(this.f14922b, cameraDevice)) {
                    k kVar = this.f14922b;
                    if (cameraDevice == kVar.f15012s0) {
                        kVar.f15012s0 = null;
                        o oVar = kVar.f14986j;
                        oVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (kVar.X) {
                        o oVar2 = kVar.f14986j;
                        oVar2.b("camera closed for sequential switch: elapsedMs=" + k.z(this.f14922b.B0) + ", switchElapsedMs=" + k.z(this.f14922b.H0));
                        k kVar2 = this.f14922b;
                        kVar2.X = false;
                        if (kVar2.V) {
                            this.f14922b.I();
                            return;
                        }
                        return;
                    } else if (kVar.Y) {
                        kVar.Y = false;
                        if (kVar.V) {
                            this.f14922b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                k kVar3 = this.f14922b;
                if (!k.d(kVar3, cameraDevice) && !k.e(kVar3, cameraDevice) && cameraDevice == kVar3.f15012s0) {
                    kVar3.f15012s0 = null;
                    o oVar3 = kVar3.f14986j;
                    oVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f14921a) {
            case 0:
                k kVar = this.f14922b;
                boolean z10 = false;
                kVar.W = false;
                o oVar = kVar.f14986j;
                oVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f14922b.G(cameraDevice)) {
                    o oVar2 = this.f14922b.f14986j;
                    oVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                k kVar2 = this.f14922b;
                if (cameraDevice == kVar2.f15012s0) {
                    if (kVar2.m0) {
                        k.b(kVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    kVar2.f15012s0 = null;
                    kVar2.f15015t0 = cameraDevice;
                    cameraDevice.close();
                    this.f14922b.y("standby device disconnected", null);
                    return;
                }
                if (kVar2.V && !this.f14922b.f14965b0) {
                    k kVar3 = this.f14922b;
                    if (!kVar3.X && !kVar3.Y) {
                        z10 = true;
                    }
                }
                k kVar4 = this.f14922b;
                if (kVar4.f15026z == cameraDevice) {
                    kVar4.q();
                    this.f14922b.f15026z = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f14922b.N(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                k kVar5 = this.f14922b;
                if (kVar5.G(cameraDevice)) {
                    o oVar3 = kVar5.f14986j;
                    oVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                k.b(kVar5, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f14921a) {
            case 0:
                k kVar = this.f14922b;
                kVar.W = false;
                if (kVar.G(cameraDevice)) {
                    kVar.f14986j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + k.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == kVar.f15012s0) {
                    if (kVar.m0) {
                        k.b(kVar, cameraDevice, "error=" + k.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    kVar.f15012s0 = null;
                    kVar.f15015t0 = cameraDevice;
                    cameraDevice.close();
                    kVar.y("standby device error=" + k.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (kVar.f15026z == cameraDevice) {
                        kVar.q();
                        kVar.f15026z = null;
                    }
                    cameraDevice.close();
                    kVar.N(new IllegalStateException("Camera device error: " + k.c(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                k kVar2 = this.f14922b;
                if (kVar2.G(cameraDevice)) {
                    kVar2.f14986j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + k.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                k.b(kVar2, cameraDevice, "error=" + k.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + k.c(i10) + " (" + i10 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.f14921a) {
            case 0:
                k kVar = this.f14922b;
                kVar.W = false;
                o oVar = kVar.f14986j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.z(this.f14922b.F0));
                if (this.f14922b.Z) {
                    str = ", switchElapsedMs=" + k.z(this.f14922b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.f14922b.V) {
                    k kVar2 = this.f14922b;
                    if (!kVar2.X) {
                        kVar2.f15026z = cameraDevice;
                        if (kVar2.m0) {
                            if (!kVar2.f15009r0 && kVar2.f15012s0 != null) {
                                k.a(kVar2);
                                return;
                            } else {
                                kVar2.f14986j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            }
                        }
                        kVar2.u();
                        return;
                    }
                }
                cameraDevice.close();
                return;
            default:
                k kVar3 = this.f14922b;
                kVar3.f15009r0 = false;
                if (kVar3.V && !this.f14922b.f14965b0) {
                    k kVar4 = this.f14922b;
                    if (!kVar4.f14993l0 && kVar4.f15021w0 != null && cameraDevice.getId().equals(this.f14922b.f15021w0.f14946a)) {
                        k kVar5 = this.f14922b;
                        kVar5.f15012s0 = cameraDevice;
                        kVar5.f14986j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f14922b.f15021w0.f14947b + ", elapsedMs=" + k.z(this.f14922b.A0));
                        k kVar6 = this.f14922b;
                        if (kVar6.f15026z != null && kVar6.A == null && !kVar6.X) {
                            if (kVar6.m0) {
                                kVar6.f14986j.b("both camera devices opened; configuring dual sessions");
                                k.a(this.f14922b);
                            } else {
                                kVar6.f14986j.b("both camera devices opened; configuring active session");
                                this.f14922b.u();
                            }
                        }
                        k kVar7 = this.f14922b;
                        o0 o0Var = kVar7.f15023x0;
                        if (o0Var != null && o0Var == kVar7.f15021w0.f14947b) {
                            kVar7.f15023x0 = null;
                            if (!kVar7.c0(o0Var)) {
                                this.f14922b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f14922b.f14986j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}
