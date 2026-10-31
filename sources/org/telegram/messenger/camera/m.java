package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f14954a;
    public final CameraView f14955b;

    public m(CameraView cameraView, int i10) {
        this.f14954a = i10;
        this.f14955b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f14954a) {
            case 0:
                CameraView.k(this.f14955b);
                return;
            case 1:
                CameraView.b(this.f14955b);
                return;
            case 2:
                CameraView.a(this.f14955b);
                return;
            case 3:
                CameraView.m(this.f14955b);
                return;
            case 4:
                CameraView.e(this.f14955b);
                return;
            case 5:
                CameraView.o(this.f14955b);
                return;
            default:
                CameraView.g(this.f14955b);
                return;
        }
    }
}
