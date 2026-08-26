package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;

public final class CameraView$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public CameraView$$ExternalSyntheticLambda14(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((CameraView) this.f$0).lambda$enableDualInternal$1((Handler) this.f$1);
                break;
            case 1:
                ((CameraView.VideoRecorder) this.f$0).lambda$handleStopRecording$0((CountDownLatch) this.f$1);
                break;
            case 2:
                ((Camera2Session) this.f$0).lambda$open$1((SurfaceTexture) this.f$1);
                break;
            case 3:
                ((CameraController) this.f$0).lambda$initCamera$2((Runnable) this.f$1);
                break;
            default:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f$0, (CameraSession) this.f$1);
                break;
        }
    }
}
