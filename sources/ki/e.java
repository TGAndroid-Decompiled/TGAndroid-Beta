package ki;

import android.hardware.camera2.CameraDevice;
public final class e extends CameraDevice.StateCallback {
    public final int f14916a;
    public final j f14917b;

    public e(j jVar, int i10) {
        this.f14916a = i10;
        this.f14917b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f14916a) {
            case 0:
                if (!j.b(this.f14917b, cameraDevice) && !j.c(this.f14917b, cameraDevice)) {
                    j jVar = this.f14917b;
                    if (cameraDevice == jVar.f14984k0) {
                        jVar.f14984k0 = null;
                        n nVar = jVar.f14980j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.U) {
                        n nVar2 = jVar.f14980j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.u(this.f14917b.f15002t0) + ", switchElapsedMs=" + j.u(this.f14917b.f15013z0));
                        j jVar2 = this.f14917b;
                        jVar2.U = false;
                        if (jVar2.S) {
                            this.f14917b.C();
                            return;
                        }
                        return;
                    } else if (jVar.V) {
                        jVar.V = false;
                        if (jVar.S) {
                            this.f14917b.C();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f14917b;
                if (!j.b(jVar3, cameraDevice) && !j.c(jVar3, cameraDevice) && cameraDevice == jVar3.f14984k0) {
                    jVar3.f14984k0 = null;
                    n nVar3 = jVar3.f14980j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f14916a) {
            case 0:
                j jVar = this.f14917b;
                boolean z10 = false;
                jVar.T = false;
                n nVar = jVar.f14980j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f14917b.A(cameraDevice)) {
                    n nVar2 = this.f14917b.f14980j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f14917b;
                if (cameraDevice == jVar2.f14984k0) {
                    jVar2.f14984k0 = null;
                    jVar2.f14987l0 = cameraDevice;
                    cameraDevice.close();
                    this.f14917b.t("standby device disconnected", null);
                    return;
                }
                if (jVar2.S && !this.f14917b.Y) {
                    j jVar3 = this.f14917b;
                    if (!jVar3.U && !jVar3.V) {
                        z10 = true;
                    }
                }
                j jVar4 = this.f14917b;
                if (jVar4.f15010y == cameraDevice) {
                    jVar4.o();
                    this.f14917b.f15010y = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f14917b.H(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                j jVar5 = this.f14917b;
                if (jVar5.A(cameraDevice)) {
                    n nVar3 = jVar5.f14980j;
                    nVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j.d(jVar5, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f14916a) {
            case 0:
                j jVar = this.f14917b;
                jVar.T = false;
                if (jVar.A(cameraDevice)) {
                    jVar.f14980j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.a(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f14984k0) {
                    jVar.f14984k0 = null;
                    jVar.f14987l0 = cameraDevice;
                    cameraDevice.close();
                    jVar.t("standby device error=" + j.a(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (jVar.f15010y == cameraDevice) {
                        jVar.o();
                        jVar.f15010y = null;
                    }
                    cameraDevice.close();
                    jVar.H(new IllegalStateException("Camera device error: " + j.a(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                j jVar2 = this.f14917b;
                if (jVar2.A(cameraDevice)) {
                    jVar2.f14980j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.a(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                j.d(jVar2, cameraDevice, "error=" + j.a(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + j.a(i10) + " (" + i10 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.f14916a) {
            case 0:
                j jVar = this.f14917b;
                jVar.T = false;
                n nVar = jVar.f14980j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.u(this.f14917b.f15009x0));
                if (this.f14917b.W) {
                    str = ", switchElapsedMs=" + j.u(this.f14917b.f15013z0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f14917b.S) {
                    j jVar2 = this.f14917b;
                    if (!jVar2.U) {
                        jVar2.f15010y = cameraDevice;
                        if (jVar2.f14975h0 && jVar2.f14981j0) {
                            jVar2.f14980j.b("active camera opened; waiting for warm camera before session");
                            return;
                        } else {
                            jVar2.q();
                            return;
                        }
                    }
                }
                cameraDevice.close();
                return;
            default:
                j jVar3 = this.f14917b;
                jVar3.f14981j0 = false;
                if (jVar3.S && !this.f14917b.Y) {
                    j jVar4 = this.f14917b;
                    if (!jVar4.f14978i0 && jVar4.f14992o0 != null && cameraDevice.getId().equals(this.f14917b.f14992o0.f14943a)) {
                        j jVar5 = this.f14917b;
                        jVar5.f14984k0 = cameraDevice;
                        jVar5.f14980j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f14917b.f14992o0.f14944b + ", elapsedMs=" + j.u(this.f14917b.f15000s0));
                        j jVar6 = this.f14917b;
                        if (jVar6.f15010y != null && jVar6.f15012z == null && !jVar6.U) {
                            jVar6.f14980j.b("both camera devices opened; configuring active session");
                            this.f14917b.q();
                        }
                        j jVar7 = this.f14917b;
                        m0 m0Var = jVar7.f14994p0;
                        if (m0Var != null && m0Var == jVar7.f14992o0.f14944b) {
                            jVar7.f14994p0 = null;
                            if (!jVar7.V(m0Var)) {
                                this.f14917b.p();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f14917b.f14980j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}
