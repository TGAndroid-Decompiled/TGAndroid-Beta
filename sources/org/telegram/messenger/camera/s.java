package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f23252a;
    public final Object f23253b;
    public final Object f23254c;

    public s(int i7, Object obj, Object obj2) {
        this.f23252a = i7;
        this.f23253b = obj;
        this.f23254c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f23252a) {
            case 0:
                ((CameraView.VideoRecorder) this.f23253b).lambda$handleStopRecording$0((CountDownLatch) this.f23254c);
                return;
            case 1:
                ((Camera2Session) this.f23253b).lambda$open$1((SurfaceTexture) this.f23254c);
                return;
            case 2:
                ((CameraController) this.f23253b).lambda$initCamera$2((Runnable) this.f23254c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f23253b, (CameraSession) this.f23254c);
                return;
            default:
                ((CameraView) this.f23253b).lambda$enableDualInternal$1((Handler) this.f23254c);
                return;
        }
    }
}
