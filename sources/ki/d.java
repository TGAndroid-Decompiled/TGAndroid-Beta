package ki;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.Arrays;
public final class d extends CameraDevice.StateCallback {
    public final g f13666a;

    public d(g gVar) {
        this.f13666a = gVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        g gVar = this.f13666a;
        if (gVar.D) {
            gVar.D = false;
            if (gVar.B) {
                gVar.i();
            }
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        g gVar = this.f13666a;
        gVar.C = false;
        j jVar = gVar.f13680f;
        jVar.b("camera disconnected: id=" + cameraDevice.getId());
        cameraDevice.close();
        if (gVar.f13693t == cameraDevice) {
            gVar.f13693t = null;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i10) {
        String str;
        g gVar = this.f13666a;
        gVar.C = false;
        cameraDevice.close();
        if (gVar.f13693t == cameraDevice) {
            gVar.f13693t = null;
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
        gVar.k(new IllegalStateException(sb2.toString()));
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        g gVar = this.f13666a;
        gVar.C = false;
        j jVar = gVar.f13680f;
        jVar.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + g.g(gVar.J));
        if (gVar.B && !gVar.D) {
            gVar.f13693t = cameraDevice;
            if (gVar.f13689p != null && gVar.f13690q != null) {
                try {
                    gVar.K = SystemClock.elapsedRealtimeNanos();
                    jVar.b("capture session requested: preview=" + gVar.f13686m + ", recording=" + gVar.f13687n);
                    cameraDevice.createCaptureSession(Arrays.asList(gVar.f13689p, gVar.f13690q), gVar.Q, gVar.f13683j);
                    return;
                } catch (CameraAccessException e) {
                    gVar.k(e);
                    return;
                }
            }
            return;
        }
        cameraDevice.close();
    }
}
