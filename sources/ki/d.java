package ki;

import android.hardware.camera2.CameraDevice;
public final class d extends CameraDevice.StateCallback {
    public final h f13666a;

    public d(h hVar) {
        this.f13666a = hVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        h hVar = this.f13666a;
        if (hVar.O) {
            hVar.O = false;
            if (hVar.M) {
                hVar.q();
            }
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        h hVar = this.f13666a;
        hVar.N = false;
        k kVar = hVar.f13707j;
        kVar.b("camera disconnected: id=" + cameraDevice.getId());
        cameraDevice.close();
        if (hVar.f13723x == cameraDevice) {
            hVar.f13723x = null;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        String str;
        h hVar = this.f13666a;
        hVar.N = false;
        cameraDevice.close();
        if (hVar.f13723x == cameraDevice) {
            hVar.f13723x = null;
        }
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
        h hVar = this.f13666a;
        hVar.N = false;
        k kVar = hVar.f13707j;
        kVar.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + h.l(hVar.Y));
        if (hVar.M && !hVar.O) {
            hVar.f13723x = cameraDevice;
            hVar.j();
            return;
        }
        cameraDevice.close();
    }
}
