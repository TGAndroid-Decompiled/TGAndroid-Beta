package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f16044a;
    public final CameraView f16045b;

    public m(CameraView cameraView, int i10) {
        this.f16044a = i10;
        this.f16045b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f16044a) {
            case 0:
                CameraView.k(this.f16045b);
                return;
            case 1:
                CameraView.b(this.f16045b);
                return;
            case 2:
                CameraView.a(this.f16045b);
                return;
            case 3:
                CameraView.m(this.f16045b);
                return;
            case 4:
                CameraView.e(this.f16045b);
                return;
            case 5:
                CameraView.o(this.f16045b);
                return;
            default:
                CameraView.g(this.f16045b);
                return;
        }
    }
}
