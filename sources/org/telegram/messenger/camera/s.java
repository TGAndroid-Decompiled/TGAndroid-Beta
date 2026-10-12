package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f17299a;
    public final Object f17300b;
    public final Object f17301c;

    public s(int i10, Object obj, Object obj2) {
        this.f17299a = i10;
        this.f17300b = obj;
        this.f17301c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17299a) {
            case 0:
                ((CameraView.VideoRecorder) this.f17300b).lambda$handleStopRecording$0((CountDownLatch) this.f17301c);
                return;
            case 1:
                ((Camera2Session) this.f17300b).lambda$open$1((SurfaceTexture) this.f17301c);
                return;
            case 2:
                ((CameraController) this.f17300b).lambda$initCamera$2((Runnable) this.f17301c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f17300b, (CameraSession) this.f17301c);
                return;
            default:
                ((CameraView) this.f17300b).lambda$enableDualInternal$1((Handler) this.f17301c);
                return;
        }
    }
}
