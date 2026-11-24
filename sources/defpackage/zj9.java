package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class zj9 extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ak9 f;

    public zj9(ak9 ak9Var, CameraDevice.StateCallback stateCallback, boolean z) {
        this.f = ak9Var;
        this.a = stateCallback;
        this.b = z;
        ak9Var.w0++;
    }

    public final void a() {
        boolean z = this.b;
        ak9 ak9Var = this.f;
        if (z) {
            if (ak9Var.v0 == this) {
                ak9Var.v0 = null;
            }
        } else if (ak9Var.u0 == this) {
            ak9Var.u0 = null;
        }
    }

    public final boolean b() {
        zj9 zj9Var;
        if (!this.f.t0) {
            boolean z = this.b;
            ak9 ak9Var = this.f;
            if (z) {
                zj9Var = ak9Var.v0;
            } else {
                zj9Var = ak9Var.u0;
            }
            if (zj9Var == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.c) {
            this.c = true;
            ak9 ak9Var = this.f;
            int i = ak9Var.w0 - 1;
            ak9Var.w0 = i;
            HandlerThread handlerThread = ak9Var.x0;
            if (i <= 0 && handlerThread != null) {
                ak9Var.x0 = null;
                ak9Var.j.b("camera open results settled after release; quitting thread");
                handlerThread.quitSafely();
            }
        }
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        if (this.e && !this.f.t0) {
            this.a.onClosed(cameraDevice);
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b = b();
        c();
        if (!this.f.t0 && (this.d || b)) {
            a();
            this.e = true;
            this.a.onDisconnected(cameraDevice);
            return;
        }
        cameraDevice.close();
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i) {
        boolean b = b();
        c();
        if (!this.f.t0 && (this.d || b)) {
            a();
            this.e = true;
            this.a.onError(cameraDevice, i);
            return;
        }
        ek9 ek9Var = this.f.j;
        ek9Var.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + ak9.e(i) + ", warm=" + this.b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b = b();
        a();
        c();
        if (!b) {
            ek9 ek9Var = this.f.j;
            ek9Var.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.b + ", released=" + this.f.t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.e = true;
        this.f.r0.add(cameraDevice);
        this.a.onOpened(cameraDevice);
    }
}
