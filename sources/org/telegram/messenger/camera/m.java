package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18063a;
    public final CameraView f18064b;

    public m(CameraView cameraView, int i10) {
        this.f18063a = i10;
        this.f18064b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18063a) {
            case 0:
                CameraView.k(this.f18064b);
                return;
            case 1:
                CameraView.b(this.f18064b);
                return;
            case 2:
                CameraView.a(this.f18064b);
                return;
            case 3:
                CameraView.m(this.f18064b);
                return;
            case 4:
                CameraView.e(this.f18064b);
                return;
            case 5:
                CameraView.o(this.f18064b);
                return;
            default:
                CameraView.g(this.f18064b);
                return;
        }
    }
}
