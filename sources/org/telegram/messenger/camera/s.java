package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f18078a;
    public final Object f18079b;
    public final Object f18080c;

    public s(int i10, Object obj, Object obj2) {
        this.f18078a = i10;
        this.f18079b = obj;
        this.f18080c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18078a) {
            case 0:
                ((CameraView.VideoRecorder) this.f18079b).lambda$handleStopRecording$0((CountDownLatch) this.f18080c);
                return;
            case 1:
                ((Camera2Session) this.f18079b).lambda$open$1((SurfaceTexture) this.f18080c);
                return;
            case 2:
                ((CameraController) this.f18079b).lambda$initCamera$2((Runnable) this.f18080c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f18079b, (CameraSession) this.f18080c);
                return;
            default:
                ((CameraView) this.f18079b).lambda$enableDualInternal$1((Handler) this.f18080c);
                return;
        }
    }
}
