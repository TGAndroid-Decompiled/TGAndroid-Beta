package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f21977a;
    public final CameraView f21978b;

    public l(CameraView cameraView, int i3) {
        this.f21977a = i3;
        this.f21978b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f21977a) {
            case 0:
                CameraView.k(this.f21978b);
                return;
            case 1:
                CameraView.b(this.f21978b);
                return;
            case 2:
                CameraView.a(this.f21978b);
                return;
            case 3:
                CameraView.m(this.f21978b);
                return;
            case 4:
                CameraView.e(this.f21978b);
                return;
            case 5:
                CameraView.o(this.f21978b);
                return;
            default:
                CameraView.g(this.f21978b);
                return;
        }
    }
}
