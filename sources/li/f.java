package li;

import android.hardware.camera2.CameraDevice;
public final class f extends CameraDevice.StateCallback {
    public final int f12046a;
    public final l f12047b;

    public f(l lVar, int i10) {
        this.f12046a = i10;
        this.f12047b = lVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f12046a) {
            case 0:
                if (!l.d(this.f12047b, cameraDevice) && !l.e(this.f12047b, cameraDevice)) {
                    l lVar = this.f12047b;
                    if (cameraDevice == lVar.f12159t0) {
                        lVar.f12159t0 = null;
                        p pVar = lVar.f12130j;
                        pVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (lVar.X) {
                        p pVar2 = lVar.f12130j;
                        pVar2.b("camera closed for sequential switch: elapsedMs=" + l.z(this.f12047b.C0) + ", switchElapsedMs=" + l.z(this.f12047b.I0));
                        l lVar2 = this.f12047b;
                        lVar2.X = false;
                        if (lVar2.V) {
                            this.f12047b.I();
                            return;
                        }
                        return;
                    } else if (lVar.Y) {
                        lVar.Y = false;
                        if (lVar.V) {
                            this.f12047b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                l lVar3 = this.f12047b;
                if (!l.d(lVar3, cameraDevice) && !l.e(lVar3, cameraDevice) && cameraDevice == lVar3.f12159t0) {
                    lVar3.f12159t0 = null;
                    p pVar3 = lVar3.f12130j;
                    pVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.f12046a) {
            case 0:
                l lVar = this.f12047b;
                boolean z11 = false;
                lVar.W = false;
                p pVar = lVar.f12130j;
                pVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f12047b.G(cameraDevice)) {
                    p pVar2 = this.f12047b.f12130j;
                    pVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                l lVar2 = this.f12047b;
                if (cameraDevice == lVar2.f12159t0) {
                    if (lVar2.f12141n0) {
                        l.b(lVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    lVar2.f12159t0 = null;
                    lVar2.f12162u0 = cameraDevice;
                    cameraDevice.close();
                    this.f12047b.y("standby device disconnected", null);
                    return;
                }
                if (lVar2.V && !this.f12047b.f12110b0) {
                    l lVar3 = this.f12047b;
                    if (!lVar3.X && !lVar3.Y) {
                        z11 = true;
                    }
                }
                l lVar4 = this.f12047b;
                if (lVar4.f12171z == cameraDevice) {
                    lVar4.q();
                    this.f12047b.f12171z = null;
                }
                cameraDevice.close();
                if (z11) {
                    l lVar5 = this.f12047b;
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device disconnected");
                    o oVar = lVar5.f12167x;
                    if (oVar != null) {
                        synchronized (oVar) {
                            z10 = oVar.E;
                        }
                        if (z10) {
                            lVar5.f12130j.a("camera lost while recording", illegalStateException);
                            a4.l lVar6 = lVar5.f12133k;
                            ((x0) lVar6.f279b).f12313i.post(new n0(lVar6, illegalStateException, 0));
                            return;
                        }
                    }
                    lVar5.N(illegalStateException);
                    return;
                }
                return;
            default:
                l lVar7 = this.f12047b;
                if (lVar7.G(cameraDevice)) {
                    p pVar3 = lVar7.f12130j;
                    pVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                l.b(lVar7, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        boolean z10;
        switch (this.f12046a) {
            case 0:
                l lVar = this.f12047b;
                lVar.W = false;
                if (lVar.G(cameraDevice)) {
                    lVar.f12130j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + l.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == lVar.f12159t0) {
                    if (lVar.f12141n0) {
                        l.b(lVar, cameraDevice, "error=" + l.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    lVar.f12159t0 = null;
                    lVar.f12162u0 = cameraDevice;
                    cameraDevice.close();
                    lVar.y("standby device error=" + l.c(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (lVar.f12171z == cameraDevice) {
                        lVar.q();
                        lVar.f12171z = null;
                    }
                    cameraDevice.close();
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device error: " + l.c(i10) + " (" + i10 + ")");
                    o oVar = lVar.f12167x;
                    if (oVar != null) {
                        synchronized (oVar) {
                            z10 = oVar.E;
                        }
                        if (z10) {
                            lVar.f12130j.a("camera lost while recording", illegalStateException);
                            a4.l lVar2 = lVar.f12133k;
                            ((x0) lVar2.f279b).f12313i.post(new n0(lVar2, illegalStateException, 0));
                            return;
                        }
                    }
                    lVar.N(illegalStateException);
                    return;
                }
            default:
                l lVar3 = this.f12047b;
                if (lVar3.G(cameraDevice)) {
                    lVar3.f12130j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + l.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                l.b(lVar3, cameraDevice, "error=" + l.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + l.c(i10) + " (" + i10 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.f12046a) {
            case 0:
                l lVar = this.f12047b;
                lVar.W = false;
                p pVar = lVar.f12130j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(l.z(this.f12047b.G0));
                if (this.f12047b.Z) {
                    str = ", switchElapsedMs=" + l.z(this.f12047b.I0);
                } else {
                    str = "";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                if (this.f12047b.V) {
                    l lVar2 = this.f12047b;
                    if (!lVar2.X) {
                        lVar2.f12171z = cameraDevice;
                        if (lVar2.f12141n0) {
                            if (!lVar2.f12156s0 && lVar2.f12159t0 != null) {
                                l.a(lVar2);
                                return;
                            } else {
                                lVar2.f12130j.b("active camera opened; waiting for dual peer before sessions");
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
                l lVar3 = this.f12047b;
                lVar3.f12156s0 = false;
                if (lVar3.V && !this.f12047b.f12110b0) {
                    l lVar4 = this.f12047b;
                    if (!lVar4.m0 && lVar4.f12168x0 != null && cameraDevice.getId().equals(this.f12047b.f12168x0.f12088a)) {
                        l lVar5 = this.f12047b;
                        lVar5.f12159t0 = cameraDevice;
                        lVar5.f12130j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f12047b.f12168x0.f12089b + ", elapsedMs=" + l.z(this.f12047b.B0));
                        l lVar6 = this.f12047b;
                        if (lVar6.f12171z != null && lVar6.A == null && !lVar6.X) {
                            if (lVar6.f12141n0) {
                                lVar6.f12130j.b("both camera devices opened; configuring dual sessions");
                                l.a(this.f12047b);
                            } else {
                                lVar6.f12130j.b("both camera devices opened; configuring active session");
                                this.f12047b.u();
                            }
                        }
                        l lVar7 = this.f12047b;
                        q0 q0Var = lVar7.f12170y0;
                        if (q0Var != null && q0Var == lVar7.f12168x0.f12089b) {
                            lVar7.f12170y0 = null;
                            if (!lVar7.c0(q0Var)) {
                                this.f12047b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f12047b.f12130j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}
