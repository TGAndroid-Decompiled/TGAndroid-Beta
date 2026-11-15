package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f22835a;
    public final CameraView f22836b;

    public l(CameraView cameraView, int i7) {
        this.f22835a = i7;
        this.f22836b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f22835a) {
            case 0:
                CameraView.k(this.f22836b);
                return;
            case 1:
                CameraView.b(this.f22836b);
                return;
            case 2:
                CameraView.a(this.f22836b);
                return;
            case 3:
                CameraView.m(this.f22836b);
                return;
            case 4:
                CameraView.e(this.f22836b);
                return;
            case 5:
                CameraView.o(this.f22836b);
                return;
            default:
                CameraView.g(this.f22836b);
                return;
        }
    }
}
