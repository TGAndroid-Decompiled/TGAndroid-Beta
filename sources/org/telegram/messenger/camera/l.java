package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f23422a;
    public final CameraView f23423b;

    public l(CameraView cameraView, int i7) {
        this.f23422a = i7;
        this.f23423b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f23422a) {
            case 0:
                CameraView.k(this.f23423b);
                return;
            case 1:
                CameraView.b(this.f23423b);
                return;
            case 2:
                CameraView.a(this.f23423b);
                return;
            case 3:
                CameraView.m(this.f23423b);
                return;
            case 4:
                CameraView.e(this.f23423b);
                return;
            case 5:
                CameraView.o(this.f23423b);
                return;
            default:
                CameraView.g(this.f23423b);
                return;
        }
    }
}
