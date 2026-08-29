package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f19918a;
    public final CameraView f19919b;

    public m(CameraView cameraView, int i10) {
        this.f19918a = i10;
        this.f19919b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f19918a) {
            case 0:
                CameraView.k(this.f19919b);
                return;
            case 1:
                CameraView.b(this.f19919b);
                return;
            case 2:
                CameraView.a(this.f19919b);
                return;
            case 3:
                CameraView.m(this.f19919b);
                return;
            case 4:
                CameraView.e(this.f19919b);
                return;
            case 5:
                CameraView.o(this.f19919b);
                return;
            default:
                CameraView.g(this.f19919b);
                return;
        }
    }
}
