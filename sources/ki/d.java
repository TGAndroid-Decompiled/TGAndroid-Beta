package ki;

import android.hardware.camera2.CameraDevice;
public final class d extends CameraDevice.StateCallback {
    public final h f13664a;

    public d(h hVar) {
        this.f13664a = hVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        h hVar = this.f13664a;
        if (hVar.T) {
            hVar.T = false;
            if (hVar.R) {
                hVar.s();
            }
        } else if (hVar.U) {
            hVar.U = false;
            if (hVar.R) {
                hVar.s();
            }
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        h hVar = this.f13664a;
        hVar.S = false;
        k kVar = hVar.f13704j;
        kVar.b("camera disconnected: id=" + cameraDevice.getId());
        if (hVar.f13730x == cameraDevice) {
            hVar.i();
            hVar.f13730x = null;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        String str;
        h hVar = this.f13664a;
        hVar.S = false;
        if (hVar.f13730x == cameraDevice) {
            hVar.i();
            hVar.f13730x = null;
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
        hVar.u(new IllegalStateException(sb2.toString()));
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        h hVar = this.f13664a;
        hVar.S = false;
        k kVar = hVar.f13704j;
        kVar.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + h.n(hVar.f13696e0));
        if (hVar.R && !hVar.T) {
            hVar.f13730x = cameraDevice;
            hVar.k();
            return;
        }
        cameraDevice.close();
    }
}
