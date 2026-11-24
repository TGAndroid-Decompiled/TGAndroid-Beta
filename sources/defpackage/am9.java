package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class am9 extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final bm9 f;

    public am9(bm9 bm9Var, CameraDevice.StateCallback stateCallback, boolean z) {
        this.f = bm9Var;
        this.a = stateCallback;
        this.b = z;
        bm9Var.w0++;
    }

    public final void a() {
        boolean z = this.b;
        bm9 bm9Var = this.f;
        if (z) {
            if (bm9Var.v0 == this) {
                bm9Var.v0 = null;
            }
        } else if (bm9Var.u0 == this) {
            bm9Var.u0 = null;
        }
    }

    public final boolean b() {
        am9 am9Var;
        if (!this.f.t0) {
            boolean z = this.b;
            bm9 bm9Var = this.f;
            if (z) {
                am9Var = bm9Var.v0;
            } else {
                am9Var = bm9Var.u0;
            }
            if (am9Var == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.c) {
            this.c = true;
            bm9 bm9Var = this.f;
            int i = bm9Var.w0 - 1;
            bm9Var.w0 = i;
            HandlerThread handlerThread = bm9Var.x0;
            if (i <= 0 && handlerThread != null) {
                bm9Var.x0 = null;
                bm9Var.j.b("camera open results settled after release; quitting thread");
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
        fm9 fm9Var = this.f.j;
        fm9Var.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + bm9.e(i) + ", warm=" + this.b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b = b();
        a();
        c();
        if (!b) {
            fm9 fm9Var = this.f.j;
            fm9Var.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.b + ", released=" + this.f.t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.e = true;
        this.f.r0.add(cameraDevice);
        this.a.onOpened(cameraDevice);
    }
}
