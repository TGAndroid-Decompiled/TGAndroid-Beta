package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f21780a;
    public final CameraView f21781b;

    public l(CameraView cameraView, int i7) {
        this.f21780a = i7;
        this.f21781b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f21780a) {
            case 0:
                CameraView.k(this.f21781b);
                return;
            case 1:
                CameraView.b(this.f21781b);
                return;
            case 2:
                CameraView.a(this.f21781b);
                return;
            case 3:
                CameraView.m(this.f21781b);
                return;
            case 4:
                CameraView.e(this.f21781b);
                return;
            case 5:
                CameraView.o(this.f21781b);
                return;
            default:
                CameraView.g(this.f21781b);
                return;
        }
    }
}
