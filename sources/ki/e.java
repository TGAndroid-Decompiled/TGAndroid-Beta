package ki;

import android.hardware.camera2.CameraDevice;
public final class e extends CameraDevice.StateCallback {
    public final i f14867a;

    public e(i iVar) {
        this.f14867a = iVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        i iVar = this.f14867a;
        if (iVar.U) {
            iVar.U = false;
            if (iVar.S) {
                this.f14867a.r();
            }
        } else if (iVar.V) {
            iVar.V = false;
            if (iVar.S) {
                this.f14867a.r();
            }
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        i iVar = this.f14867a;
        boolean z10 = false;
        iVar.T = false;
        m mVar = iVar.f14909j;
        mVar.b("camera disconnected: id=" + cameraDevice.getId());
        if (this.f14867a.S && !this.f14867a.Y) {
            i iVar2 = this.f14867a;
            if (!iVar2.U && !iVar2.V) {
                z10 = true;
            }
        }
        i iVar3 = this.f14867a;
        if (iVar3.f14937y == cameraDevice) {
            iVar3.i();
            this.f14867a.f14937y = null;
        }
        cameraDevice.close();
        if (z10) {
            this.f14867a.t(new IllegalStateException("Camera device disconnected"));
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        String str;
        i iVar = this.f14867a;
        iVar.T = false;
        if (iVar.f14937y == cameraDevice) {
            iVar.i();
            iVar.f14937y = null;
        }
        cameraDevice.close();
        StringBuilder sb2 = new StringBuilder("Camera device error: ");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            str = "UNKNOWN";
                        } else {
                            str = "CAMERA_SERVICE";
                        }
                    } else {
                        str = "CAMERA_DEVICE";
                    }
                } else {
                    str = "CAMERA_DISABLED";
                }
            } else {
                str = "MAX_CAMERAS_IN_USE";
            }
        } else {
            str = "CAMERA_IN_USE";
        }
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(")");
        iVar.t(new IllegalStateException(sb2.toString()));
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        i iVar = this.f14867a;
        iVar.T = false;
        m mVar = iVar.f14909j;
        mVar.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + i.m(this.f14867a.f14905g0));
        if (this.f14867a.S) {
            i iVar2 = this.f14867a;
            if (!iVar2.U) {
                iVar2.f14937y = cameraDevice;
                iVar2.j();
                return;
            }
        }
        cameraDevice.close();
    }
}
