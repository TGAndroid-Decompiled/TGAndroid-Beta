package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18070a;
    public final CameraView f18071b;

    public m(CameraView cameraView, int i10) {
        this.f18070a = i10;
        this.f18071b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18070a) {
            case 0:
                CameraView.k(this.f18071b);
                return;
            case 1:
                CameraView.b(this.f18071b);
                return;
            case 2:
                CameraView.a(this.f18071b);
                return;
            case 3:
                CameraView.m(this.f18071b);
                return;
            case 4:
                CameraView.e(this.f18071b);
                return;
            case 5:
                CameraView.o(this.f18071b);
                return;
            default:
                CameraView.g(this.f18071b);
                return;
        }
    }
}
