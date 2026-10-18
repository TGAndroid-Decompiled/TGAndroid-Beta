package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f18072a;
    public final Object f18073b;
    public final Object f18074c;

    public s(int i10, Object obj, Object obj2) {
        this.f18072a = i10;
        this.f18073b = obj;
        this.f18074c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18072a) {
            case 0:
                ((CameraView.VideoRecorder) this.f18073b).lambda$handleStopRecording$0((CountDownLatch) this.f18074c);
                return;
            case 1:
                ((Camera2Session) this.f18073b).lambda$open$1((SurfaceTexture) this.f18074c);
                return;
            case 2:
                ((CameraController) this.f18073b).lambda$initCamera$2((Runnable) this.f18074c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f18073b, (CameraSession) this.f18074c);
                return;
            default:
                ((CameraView) this.f18073b).lambda$enableDualInternal$1((Handler) this.f18074c);
                return;
        }
    }
}
