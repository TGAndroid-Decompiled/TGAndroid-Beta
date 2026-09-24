package ki;

import android.hardware.camera2.CameraDevice;
public final class d extends CameraDevice.StateCallback {
    public final h f13669a;

    public d(h hVar) {
        this.f13669a = hVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        h hVar = this.f13669a;
        if (hVar.T) {
            hVar.T = false;
            if (hVar.R) {
                this.f13669a.q();
            }
        } else if (hVar.U) {
            hVar.U = false;
            if (hVar.R) {
                this.f13669a.q();
            }
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        h hVar = this.f13669a;
        boolean z10 = false;
        hVar.S = false;
        l lVar = hVar.f13707j;
        lVar.b("camera disconnected: id=" + cameraDevice.getId());
        if (this.f13669a.R && !this.f13669a.X) {
            h hVar2 = this.f13669a;
            if (!hVar2.T && !hVar2.U) {
                z10 = true;
            }
        }
        h hVar3 = this.f13669a;
        if (hVar3.f13733x == cameraDevice) {
            hVar3.h();
            this.f13669a.f13733x = null;
        }
        cameraDevice.close();
        if (z10) {
            this.f13669a.s(new IllegalStateException("Camera device disconnected"));
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        String str;
        h hVar = this.f13669a;
        hVar.S = false;
        if (hVar.f13733x == cameraDevice) {
            hVar.h();
            hVar.f13733x = null;
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
        hVar.s(new IllegalStateException(sb2.toString()));
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        h hVar = this.f13669a;
        hVar.S = false;
        l lVar = hVar.f13707j;
        lVar.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + h.l(this.f13669a.f13701f0));
        if (this.f13669a.R) {
            h hVar2 = this.f13669a;
            if (!hVar2.T) {
                hVar2.f13733x = cameraDevice;
                hVar2.i();
                return;
            }
        }
        cameraDevice.close();
    }
}
