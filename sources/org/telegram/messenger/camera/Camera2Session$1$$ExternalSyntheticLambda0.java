package org.telegram.messenger.camera;

public final class Camera2Session$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public Camera2Session$1$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((Camera2Session.AnonymousClass1) this.f$0).lambda$onError$0();
                break;
            case 1:
                ((CameraView.VideoRecorder) this.f$0).lambda$handleStopRecording$1();
                break;
            default:
                ((CameraController) this.f$0).lambda$initCamera$1();
                break;
        }
    }
}
