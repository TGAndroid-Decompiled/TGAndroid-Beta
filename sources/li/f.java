package li;

import android.hardware.camera2.CameraDevice;
public final class f extends CameraDevice.StateCallback {
    public final int f14786a;
    public final l f14787b;

    public f(l lVar, int i10) {
        this.f14786a = i10;
        this.f14787b = lVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f14786a) {
            case 0:
                if (!l.d(this.f14787b, cameraDevice) && !l.e(this.f14787b, cameraDevice)) {
                    l lVar = this.f14787b;
                    if (cameraDevice == lVar.f14877s0) {
                        lVar.f14877s0 = null;
                        p pVar = lVar.f14851j;
                        pVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (lVar.X) {
                        p pVar2 = lVar.f14851j;
                        pVar2.b("camera closed for sequential switch: elapsedMs=" + l.z(this.f14787b.B0) + ", switchElapsedMs=" + l.z(this.f14787b.H0));
                        l lVar2 = this.f14787b;
                        lVar2.X = false;
                        if (lVar2.V) {
                            this.f14787b.I();
                            return;
                        }
                        return;
                    } else if (lVar.Y) {
                        lVar.Y = false;
                        if (lVar.V) {
                            this.f14787b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                l lVar3 = this.f14787b;
                if (!l.d(lVar3, cameraDevice) && !l.e(lVar3, cameraDevice) && cameraDevice == lVar3.f14877s0) {
                    lVar3.f14877s0 = null;
                    p pVar3 = lVar3.f14851j;
                    pVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f14786a) {
            case 0:
                l lVar = this.f14787b;
                boolean z10 = false;
                lVar.W = false;
                p pVar = lVar.f14851j;
                pVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f14787b.G(cameraDevice)) {
                    p pVar2 = this.f14787b.f14851j;
                    pVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                l lVar2 = this.f14787b;
                if (cameraDevice == lVar2.f14877s0) {
                    if (lVar2.m0) {
                        l.b(lVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    lVar2.f14877s0 = null;
                    lVar2.f14880t0 = cameraDevice;
                    cameraDevice.close();
                    this.f14787b.y("standby device disconnected", null);
                    return;
                }
                if (lVar2.V && !this.f14787b.f14831b0) {
                    l lVar3 = this.f14787b;
                    if (!lVar3.X && !lVar3.Y) {
                        z10 = true;
                    }
                }
                l lVar4 = this.f14787b;
                if (lVar4.f14891z == cameraDevice) {
                    lVar4.q();
                    this.f14787b.f14891z = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f14787b.N(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                l lVar5 = this.f14787b;
                if (lVar5.G(cameraDevice)) {
                    p pVar3 = lVar5.f14851j;
                    pVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                l.b(lVar5, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f14786a) {
            case 0:
                l lVar = this.f14787b;
                lVar.W = false;
                if (lVar.G(cameraDevice)) {
                    lVar.f14851j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + l.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == lVar.f14877s0) {
                    if (lVar.m0) {
                        l.b(lVar, cameraDevice, "error=" + l.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    lVar.f14877s0 = null;
                    lVar.f14880t0 = cameraDevice;
                    cameraDevice.close();
                    lVar.y("standby device error=" + l.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (lVar.f14891z == cameraDevice) {
                        lVar.q();
                        lVar.f14891z = null;
                    }
                    cameraDevice.close();
                    lVar.N(new IllegalStateException("Camera device error: " + l.c(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                l lVar2 = this.f14787b;
                if (lVar2.G(cameraDevice)) {
                    lVar2.f14851j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + l.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                l.b(lVar2, cameraDevice, "error=" + l.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + l.c(i10) + " (" + i10 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.f14786a) {
            case 0:
                l lVar = this.f14787b;
                lVar.W = false;
                p pVar = lVar.f14851j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(l.z(this.f14787b.F0));
                if (this.f14787b.Z) {
                    str = ", switchElapsedMs=" + l.z(this.f14787b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                if (this.f14787b.V) {
                    l lVar2 = this.f14787b;
                    if (!lVar2.X) {
                        lVar2.f14891z = cameraDevice;
                        if (lVar2.m0) {
                            if (!lVar2.f14874r0 && lVar2.f14877s0 != null) {
                                l.a(lVar2);
                                return;
                            } else {
                                lVar2.f14851j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            }
                        }
                        lVar2.u();
                        return;
                    }
                }
                cameraDevice.close();
                return;
            default:
                l lVar3 = this.f14787b;
                lVar3.f14874r0 = false;
                if (lVar3.V && !this.f14787b.f14831b0) {
                    l lVar4 = this.f14787b;
                    if (!lVar4.f14858l0 && lVar4.f14886w0 != null && cameraDevice.getId().equals(this.f14787b.f14886w0.f14807a)) {
                        l lVar5 = this.f14787b;
                        lVar5.f14877s0 = cameraDevice;
                        lVar5.f14851j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f14787b.f14886w0.f14808b + ", elapsedMs=" + l.z(this.f14787b.A0));
                        l lVar6 = this.f14787b;
                        if (lVar6.f14891z != null && lVar6.A == null && !lVar6.X) {
                            if (lVar6.m0) {
                                lVar6.f14851j.b("both camera devices opened; configuring dual sessions");
                                l.a(this.f14787b);
                            } else {
                                lVar6.f14851j.b("both camera devices opened; configuring active session");
                                this.f14787b.u();
                            }
                        }
                        l lVar7 = this.f14787b;
                        n0 n0Var = lVar7.f14888x0;
                        if (n0Var != null && n0Var == lVar7.f14886w0.f14808b) {
                            lVar7.f14888x0 = null;
                            if (!lVar7.c0(n0Var)) {
                                this.f14787b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f14787b.f14851j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}
