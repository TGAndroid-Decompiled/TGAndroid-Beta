package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18073a;
    public final CameraView f18074b;

    public m(CameraView cameraView, int i10) {
        this.f18073a = i10;
        this.f18074b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18073a) {
            case 0:
                CameraView.k(this.f18074b);
                return;
            case 1:
                CameraView.b(this.f18074b);
                return;
            case 2:
                CameraView.a(this.f18074b);
                return;
            case 3:
                CameraView.m(this.f18074b);
                return;
            case 4:
                CameraView.e(this.f18074b);
                return;
            case 5:
                CameraView.o(this.f18074b);
                return;
            default:
                CameraView.g(this.f18074b);
                return;
        }
    }
}
