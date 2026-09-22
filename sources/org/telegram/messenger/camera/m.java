package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f15852a;
    public final CameraView f15853b;

    public m(CameraView cameraView, int i10) {
        this.f15852a = i10;
        this.f15853b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f15852a) {
            case 0:
                CameraView.k(this.f15853b);
                return;
            case 1:
                CameraView.b(this.f15853b);
                return;
            case 2:
                CameraView.a(this.f15853b);
                return;
            case 3:
                CameraView.m(this.f15853b);
                return;
            case 4:
                CameraView.e(this.f15853b);
                return;
            case 5:
                CameraView.o(this.f15853b);
                return;
            default:
                CameraView.g(this.f15853b);
                return;
        }
    }
}
