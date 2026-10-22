package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18060a;
    public final CameraView f18061b;

    public m(CameraView cameraView, int i10) {
        this.f18060a = i10;
        this.f18061b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18060a) {
            case 0:
                CameraView.k(this.f18061b);
                return;
            case 1:
                CameraView.b(this.f18061b);
                return;
            case 2:
                CameraView.a(this.f18061b);
                return;
            case 3:
                CameraView.m(this.f18061b);
                return;
            case 4:
                CameraView.e(this.f18061b);
                return;
            case 5:
                CameraView.o(this.f18061b);
                return;
            default:
                CameraView.g(this.f18061b);
                return;
        }
    }
}
