package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f17543a;
    public final CameraView f17544b;

    public m(CameraView cameraView, int i10) {
        this.f17543a = i10;
        this.f17544b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f17543a) {
            case 0:
                CameraView.k(this.f17544b);
                return;
            case 1:
                CameraView.b(this.f17544b);
                return;
            case 2:
                CameraView.a(this.f17544b);
                return;
            case 3:
                CameraView.m(this.f17544b);
                return;
            case 4:
                CameraView.e(this.f17544b);
                return;
            case 5:
                CameraView.o(this.f17544b);
                return;
            default:
                CameraView.g(this.f17544b);
                return;
        }
    }
}
