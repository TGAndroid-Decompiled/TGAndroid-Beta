package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f17539a;
    public final CameraView f17540b;

    public m(CameraView cameraView, int i10) {
        this.f17539a = i10;
        this.f17540b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f17539a) {
            case 0:
                CameraView.k(this.f17540b);
                return;
            case 1:
                CameraView.b(this.f17540b);
                return;
            case 2:
                CameraView.a(this.f17540b);
                return;
            case 3:
                CameraView.m(this.f17540b);
                return;
            case 4:
                CameraView.e(this.f17540b);
                return;
            case 5:
                CameraView.o(this.f17540b);
                return;
            default:
                CameraView.g(this.f17540b);
                return;
        }
    }
}
