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
                j jVar = this.f14917b;
                if (cameraDevice == jVar.f14983l0) {
                    jVar.f14983l0 = null;
                    n nVar = jVar.f14978j;
                    nVar.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                } else if (cameraDevice == jVar.f14981k0) {
                    jVar.f14981k0 = null;
                    n nVar2 = jVar.f14978j;
                    nVar2.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                } else if (jVar.U) {
                    n nVar3 = jVar.f14978j;
                    nVar3.b("camera closed for sequential switch: elapsedMs=" + j.s(this.f14917b.f14990p0) + ", switchElapsedMs=" + j.s(this.f14917b.f15001v0));
                    j jVar2 = this.f14917b;
                    jVar2.U = false;
                    if (jVar2.S) {
                        this.f14917b.y();
                        return;
                    }
                    return;
                } else if (jVar.V) {
                    jVar.V = false;
                    if (jVar.S) {
                        this.f14917b.y();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                j jVar3 = this.f14917b;
                if (cameraDevice == jVar3.f14983l0) {
                    jVar3.f14983l0 = null;
                    n nVar4 = jVar3.f14978j;
                    nVar4.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                } else if (cameraDevice == jVar3.f14981k0) {
                    jVar3.f14981k0 = null;
                    n nVar5 = jVar3.f14978j;
                    nVar5.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f14916a) {
            case 0:
                j jVar = this.f14917b;
                boolean z10 = false;
                jVar.T = false;
                n nVar = jVar.f14978j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                j jVar2 = this.f14917b;
                if (cameraDevice == jVar2.f14981k0) {
                    jVar2.f14981k0 = null;
                    jVar2.f14983l0 = cameraDevice;
                    cameraDevice.close();
                    this.f14917b.r("standby device disconnected", null);
                    return;
                }
                if (jVar2.S && !this.f14917b.Y) {
                    j jVar3 = this.f14917b;
                    if (!jVar3.U && !jVar3.V) {
                        z10 = true;
                    }
                }
                j jVar4 = this.f14917b;
                if (jVar4.f15006y == cameraDevice) {
                    jVar4.m();
                    this.f14917b.f15006y = null;
                }
                cameraDevice.close();
                if (z10) {
                    this.f14917b.C(new IllegalStateException("Camera device disconnected"));
                    return;
                }
                return;
            default:
                j.b(this.f14917b, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f14916a) {
            case 0:
                j jVar = this.f14917b;
                jVar.T = false;
                if (cameraDevice == jVar.f14981k0) {
                    jVar.f14981k0 = null;
                    jVar.f14983l0 = cameraDevice;
                    cameraDevice.close();
                    jVar.r("standby device error=" + j.a(i10) + " (" + i10 + ")", null);
                    return;
                }
                if (jVar.f15006y == cameraDevice) {
                    jVar.m();
                    jVar.f15006y = null;
                }
                cameraDevice.close();
                jVar.C(new IllegalStateException("Camera device error: " + j.a(i10) + " (" + i10 + ")"));
                return;
            default:
                j.b(this.f14917b, cameraDevice, "error=" + j.a(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + j.a(i10) + " (" + i10 + ")"));
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
                n nVar = jVar.f14978j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.s(this.f14917b.f14998t0));
                if (this.f14917b.W) {
                    str = ", switchElapsedMs=" + j.s(this.f14917b.f15001v0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f14917b.S) {
                    j jVar2 = this.f14917b;
                    if (!jVar2.U) {
                        jVar2.f15006y = cameraDevice;
                        if (jVar2.f14975h0 && jVar2.f14979j0) {
                            jVar2.f14978j.b("active camera opened; waiting for warm camera before session");
                            return;
                        } else {
                            jVar2.o();
                            return;
                        }
                    }
                }
                cameraDevice.close();
                return;
            default:
                j jVar3 = this.f14917b;
                jVar3.f14979j0 = false;
                if (jVar3.S && !this.f14917b.Y) {
                    j jVar4 = this.f14917b;
                    if (!jVar4.f14977i0 && jVar4.m0 != null && cameraDevice.getId().equals(this.f14917b.m0.f14943a)) {
                        j jVar5 = this.f14917b;
                        jVar5.f14981k0 = cameraDevice;
                        jVar5.f14978j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f14917b.m0.f14944b + ", elapsedMs=" + j.s(this.f14917b.f14988o0));
                        j jVar6 = this.f14917b;
                        if (jVar6.f15006y != null && jVar6.f15008z == null && !jVar6.U) {
                            jVar6.f14978j.b("both camera devices opened; configuring active session");
                            this.f14917b.o();
                        }
                        j jVar7 = this.f14917b;
                        m0 m0Var = jVar7.f14986n0;
                        if (m0Var != null && m0Var == jVar7.m0.f14944b) {
                            jVar7.f14986n0 = null;
                            if (!jVar7.P(m0Var)) {
                                this.f14917b.n();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f14917b.f14978j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}
