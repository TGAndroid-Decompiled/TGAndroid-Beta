package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f23276a;
    public final CameraView f23277b;

    public m(CameraView cameraView, int i7) {
        this.f23276a = i7;
        this.f23277b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f23276a) {
            case 0:
                CameraView.k(this.f23277b);
                return;
            case 1:
                CameraView.b(this.f23277b);
                return;
            case 2:
                CameraView.a(this.f23277b);
                return;
            case 3:
                CameraView.m(this.f23277b);
                return;
            case 4:
                CameraView.e(this.f23277b);
                return;
            case 5:
                CameraView.o(this.f23277b);
                return;
            default:
                CameraView.g(this.f23277b);
                return;
        }
    }
}
