package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f23310a;
    public final CameraView f23311b;

    public m(CameraView cameraView, int i7) {
        this.f23310a = i7;
        this.f23311b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f23310a) {
            case 0:
                CameraView.k(this.f23311b);
                return;
            case 1:
                CameraView.b(this.f23311b);
                return;
            case 2:
                CameraView.a(this.f23311b);
                return;
            case 3:
                CameraView.m(this.f23311b);
                return;
            case 4:
                CameraView.e(this.f23311b);
                return;
            case 5:
                CameraView.o(this.f23311b);
                return;
            default:
                CameraView.g(this.f23311b);
                return;
        }
    }
}
