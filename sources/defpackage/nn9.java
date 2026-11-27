package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;
public final class nn9 extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final on9 f;

    public nn9(on9 on9Var, CameraDevice.StateCallback stateCallback, boolean z) {
        this.f = on9Var;
        this.a = stateCallback;
        this.b = z;
        on9Var.w0++;
    }

    public final void a() {
        boolean z = this.b;
        on9 on9Var = this.f;
        if (z) {
            if (on9Var.v0 == this) {
                on9Var.v0 = null;
            }
        } else if (on9Var.u0 == this) {
            on9Var.u0 = null;
        }
    }

    public final boolean b() {
        nn9 nn9Var;
        if (!this.f.t0) {
            boolean z = this.b;
            on9 on9Var = this.f;
            if (z) {
                nn9Var = on9Var.v0;
            } else {
                nn9Var = on9Var.u0;
            }
            if (nn9Var == this) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        if (!this.c) {
            this.c = true;
            on9 on9Var = this.f;
            int i = on9Var.w0 - 1;
            on9Var.w0 = i;
            HandlerThread handlerThread = on9Var.x0;
            if (i <= 0 && handlerThread != null) {
                on9Var.x0 = null;
                on9Var.j.b("camera open results settled after release; quitting thread");
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
        sn9 sn9Var = this.f.j;
        sn9Var.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + on9.e(i) + ", warm=" + this.b);
        cameraDevice.close();
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b = b();
        a();
        c();
        if (!b) {
            sn9 sn9Var = this.f.j;
            sn9Var.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.b + ", released=" + this.f.t0);
            cameraDevice.close();
            return;
        }
        this.d = true;
        this.e = true;
        this.f.r0.add(cameraDevice);
        this.a.onOpened(cameraDevice);
    }
}
