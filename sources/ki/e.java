package ki;

import android.hardware.camera2.CameraDevice;
public final class e extends CameraDevice.StateCallback {
    public final i f14866a;

    public e(i iVar) {
        this.f14866a = iVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        i iVar = this.f14866a;
        if (iVar.U) {
            iVar.U = false;
            if (iVar.S) {
                this.f14866a.r();
            }
        } else if (iVar.V) {
            iVar.V = false;
            if (iVar.S) {
                this.f14866a.r();
            }
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        i iVar = this.f14866a;
        boolean z10 = false;
        iVar.T = false;
        m mVar = iVar.f14908j;
        mVar.b("camera disconnected: id=" + cameraDevice.getId());
        if (this.f14866a.S && !this.f14866a.Y) {
            i iVar2 = this.f14866a;
            if (!iVar2.U && !iVar2.V) {
                z10 = true;
            }
        }
        i iVar3 = this.f14866a;
        if (iVar3.f14936y == cameraDevice) {
            iVar3.i();
            this.f14866a.f14936y = null;
        }
        cameraDevice.close();
        if (z10) {
            this.f14866a.t(new IllegalStateException("Camera device disconnected"));
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        String str;
        i iVar = this.f14866a;
        iVar.T = false;
        if (iVar.f14936y == cameraDevice) {
            iVar.i();
            iVar.f14936y = null;
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
        i iVar = this.f14866a;
        iVar.T = false;
        m mVar = iVar.f14908j;
        mVar.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + i.m(this.f14866a.f14904g0));
        if (this.f14866a.S) {
            i iVar2 = this.f14866a;
            if (!iVar2.U) {
                iVar2.f14936y = cameraDevice;
                iVar2.j();
                return;
            }
        }
        cameraDevice.close();
    }
}
