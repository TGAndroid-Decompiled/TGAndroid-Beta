package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18124a;
    public final CameraView f18125b;

    public m(CameraView cameraView, int i10) {
        this.f18124a = i10;
        this.f18125b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18124a) {
            case 0:
                CameraView.k(this.f18125b);
                return;
            case 1:
                CameraView.b(this.f18125b);
                return;
            case 2:
                CameraView.a(this.f18125b);
                return;
            case 3:
                CameraView.m(this.f18125b);
                return;
            case 4:
                CameraView.e(this.f18125b);
                return;
            case 5:
                CameraView.o(this.f18125b);
                return;
            default:
                CameraView.g(this.f18125b);
                return;
        }
    }
}
