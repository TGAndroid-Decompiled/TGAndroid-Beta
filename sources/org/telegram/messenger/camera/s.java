package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f16116a;
    public final Object f16117b;
    public final Object f16118c;

    public s(int i10, Object obj, Object obj2) {
        this.f16116a = i10;
        this.f16117b = obj;
        this.f16118c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16116a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16117b).lambda$handleStopRecording$0((CountDownLatch) this.f16118c);
                return;
            case 1:
                ((Camera2Session) this.f16117b).lambda$open$1((SurfaceTexture) this.f16118c);
                return;
            case 2:
                ((CameraController) this.f16117b).lambda$initCamera$2((Runnable) this.f16118c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16117b, (CameraSession) this.f16118c);
                return;
            default:
                ((CameraView) this.f16117b).lambda$enableDualInternal$1((Handler) this.f16118c);
                return;
        }
    }
}
