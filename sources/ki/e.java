package ki;

import android.hardware.camera2.CameraDevice;
public final class e extends CameraDevice.StateCallback {
    public final int f14915a;
    public final j f14916b;

    public e(j jVar, int i10) {
        this.f14915a = i10;
        this.f14916b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f14915a) {
            case 0:
                if (!j.b(this.f14916b, cameraDevice) && !j.c(this.f14916b, cameraDevice)) {
                    j jVar = this.f14916b;
                    if (cameraDevice == jVar.f14983k0) {
                        jVar.f14983k0 = null;
                        n nVar = jVar.f14979j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.U) {
                        n nVar2 = jVar.f14979j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.u(this.f14916b.f15001t0) + ", switchElapsedMs=" + j.u(this.f14916b.f15012z0));
                        j jVar2 = this.f14916b;
                        jVar2.U = false;
                        if (jVar2.S) {
                            this.f14916b.C();
                            return;
                        }
                        return;
                    } else if (jVar.V) {
                        jVar.V = false;
                        if (jVar.S) {
                            this.f14916b.C();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f14916b;
                if (!j.b(jVar3, cameraDevice) && !j.c(jVar3, cameraDevice) && cameraDevice == jVar3.f14983k0) {
                    jVar3.f14983k0 = null;
                    n nVar3 = jVar3.f14979j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f14915a) {
            case 0:
                j jVar = this.f14916b;
                boolean z10 = false;
                jVar.T = false;
                n nVar = jVar.f14979j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f14916b.A(cameraDevice)) {
                    n nVar2 = this.f14916b.f14979j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f14916b;
                if (cameraDevice == jVar2.f14983k0) {
                    jVar2.f14983k0 = null;
                    jVar2.f14986l0 = cameraDevice;
                    cameraDevice.close();
                    this.f14916b.t("standby device disconnected", null);
                    return;
                }
                if (jVar2.S && !this.f14916b.Y) {
                    j jVar3 = this.f14916b;
                    if (!jVar3.U && !jVar3.V) {
                        z10 = true;
                    }
                }
                j jVar4 = this.f14916b;
                if (jVar4.f15009y == cameraDevice) {
                    jVar4.o();
                    this.f14916b.f15009y = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f14916b.H(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                j jVar5 = this.f14916b;
                if (jVar5.A(cameraDevice)) {
                    n nVar3 = jVar5.f14979j;
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
        switch (this.f14915a) {
            case 0:
                j jVar = this.f14916b;
                jVar.T = false;
                if (jVar.A(cameraDevice)) {
                    jVar.f14979j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.a(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f14983k0) {
                    jVar.f14983k0 = null;
                    jVar.f14986l0 = cameraDevice;
                    cameraDevice.close();
                    jVar.t("standby device error=" + j.a(i10) + " (" + i10 + ")", null);
                    return;
                } else {
                    if (jVar.f15009y == cameraDevice) {
                        jVar.o();
                        jVar.f15009y = null;
                    }
                    cameraDevice.close();
                    jVar.H(new IllegalStateException("Camera device error: " + j.a(i10) + " (" + i10 + ")"));
                    return;
                }
            default:
                j jVar2 = this.f14916b;
                if (jVar2.A(cameraDevice)) {
                    jVar2.f14979j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.a(i10) + " (" + i10 + ")");
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
        switch (this.f14915a) {
            case 0:
                j jVar = this.f14916b;
                jVar.T = false;
                n nVar = jVar.f14979j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.u(this.f14916b.f15008x0));
                if (this.f14916b.W) {
                    str = ", switchElapsedMs=" + j.u(this.f14916b.f15012z0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f14916b.S) {
                    j jVar2 = this.f14916b;
                    if (!jVar2.U) {
                        jVar2.f15009y = cameraDevice;
                        if (jVar2.f14974h0 && jVar2.f14980j0) {
                            jVar2.f14979j.b("active camera opened; waiting for warm camera before session");
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
                j jVar3 = this.f14916b;
                jVar3.f14980j0 = false;
                if (jVar3.S && !this.f14916b.Y) {
                    j jVar4 = this.f14916b;
                    if (!jVar4.f14977i0 && jVar4.f14991o0 != null && cameraDevice.getId().equals(this.f14916b.f14991o0.f14942a)) {
                        j jVar5 = this.f14916b;
                        jVar5.f14983k0 = cameraDevice;
                        jVar5.f14979j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f14916b.f14991o0.f14943b + ", elapsedMs=" + j.u(this.f14916b.f14999s0));
                        j jVar6 = this.f14916b;
                        if (jVar6.f15009y != null && jVar6.f15011z == null && !jVar6.U) {
                            jVar6.f14979j.b("both camera devices opened; configuring active session");
                            this.f14916b.q();
                        }
                        j jVar7 = this.f14916b;
                        m0 m0Var = jVar7.f14993p0;
                        if (m0Var != null && m0Var == jVar7.f14991o0.f14943b) {
                            jVar7.f14993p0 = null;
                            if (!jVar7.V(m0Var)) {
                                this.f14916b.p();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f14916b.f14979j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}
