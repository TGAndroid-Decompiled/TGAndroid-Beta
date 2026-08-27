package org.telegram.messenger.camera;

public final class c implements Runnable {

    public final int f19908a;

    public final Object f19909b;

    public c(Object obj, int i10) {
        this.f19908a = i10;
        this.f19909b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19908a) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f19909b).lambda$onError$0();
                break;
            case 1:
                ((CameraView.VideoRecorder) this.f19909b).lambda$handleStopRecording$1();
                break;
            default:
                ((CameraController) this.f19909b).lambda$initCamera$1();
                break;
        }
    }
}
