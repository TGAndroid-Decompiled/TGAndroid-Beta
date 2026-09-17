package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f17414a;
    public final Object f17415b;
    public final Object f17416c;

    public s(int i10, Object obj, Object obj2) {
        this.f17414a = i10;
        this.f17415b = obj;
        this.f17416c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17414a) {
            case 0:
                ((CameraView.VideoRecorder) this.f17415b).lambda$handleStopRecording$0((CountDownLatch) this.f17416c);
                return;
            case 1:
                ((Camera2Session) this.f17415b).lambda$open$1((SurfaceTexture) this.f17416c);
                return;
            case 2:
                ((CameraController) this.f17415b).lambda$initCamera$2((Runnable) this.f17416c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f17415b, (CameraSession) this.f17416c);
                return;
            default:
                ((CameraView) this.f17415b).lambda$enableDualInternal$1((Handler) this.f17416c);
                return;
        }
    }
}
