package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18378a;
    public final CameraView f18379b;

    public m(CameraView cameraView, int i10) {
        this.f18378a = i10;
        this.f18379b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18378a) {
            case 0:
                CameraView.k(this.f18379b);
                return;
            case 1:
                CameraView.b(this.f18379b);
                return;
            case 2:
                CameraView.a(this.f18379b);
                return;
            case 3:
                CameraView.m(this.f18379b);
                return;
            case 4:
                CameraView.e(this.f18379b);
                return;
            case 5:
                CameraView.o(this.f18379b);
                return;
            default:
                CameraView.g(this.f18379b);
                return;
        }
    }
}
