package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f21816a;
    public final CameraView f21817b;

    public l(CameraView cameraView, int i7) {
        this.f21816a = i7;
        this.f21817b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f21816a) {
            case 0:
                CameraView.k(this.f21817b);
                return;
            case 1:
                CameraView.b(this.f21817b);
                return;
            case 2:
                CameraView.a(this.f21817b);
                return;
            case 3:
                CameraView.m(this.f21817b);
                return;
            case 4:
                CameraView.e(this.f21817b);
                return;
            case 5:
                CameraView.o(this.f21817b);
                return;
            default:
                CameraView.g(this.f21817b);
                return;
        }
    }
}
