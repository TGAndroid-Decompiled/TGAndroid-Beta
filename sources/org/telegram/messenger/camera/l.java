package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f21774a;
    public final CameraView f21775b;

    public l(CameraView cameraView, int i7) {
        this.f21774a = i7;
        this.f21775b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f21774a) {
            case 0:
                CameraView.k(this.f21775b);
                return;
            case 1:
                CameraView.b(this.f21775b);
                return;
            case 2:
                CameraView.a(this.f21775b);
                return;
            case 3:
                CameraView.m(this.f21775b);
                return;
            case 4:
                CameraView.e(this.f21775b);
                return;
            case 5:
                CameraView.o(this.f21775b);
                return;
            default:
                CameraView.g(this.f21775b);
                return;
        }
    }
}
