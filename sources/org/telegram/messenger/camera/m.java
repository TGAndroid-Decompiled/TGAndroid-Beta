package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f15118a;
    public final CameraView f15119b;

    public m(CameraView cameraView, int i10) {
        this.f15118a = i10;
        this.f15119b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f15118a) {
            case 0:
                CameraView.k(this.f15119b);
                return;
            case 1:
                CameraView.b(this.f15119b);
                return;
            case 2:
                CameraView.a(this.f15119b);
                return;
            case 3:
                CameraView.m(this.f15119b);
                return;
            case 4:
                CameraView.e(this.f15119b);
                return;
            case 5:
                CameraView.o(this.f15119b);
                return;
            default:
                CameraView.g(this.f15119b);
                return;
        }
    }
}
