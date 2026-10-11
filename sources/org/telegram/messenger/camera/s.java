package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f17589a;
    public final Object f17590b;
    public final Object f17591c;

    public s(int i10, Object obj, Object obj2) {
        this.f17589a = i10;
        this.f17590b = obj;
        this.f17591c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17589a) {
            case 0:
                ((CameraView.VideoRecorder) this.f17590b).lambda$handleStopRecording$0((CountDownLatch) this.f17591c);
                return;
            case 1:
                ((Camera2Session) this.f17590b).lambda$open$1((SurfaceTexture) this.f17591c);
                return;
            case 2:
                ((CameraController) this.f17590b).lambda$initCamera$2((Runnable) this.f17591c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f17590b, (CameraSession) this.f17591c);
                return;
            default:
                ((CameraView) this.f17590b).lambda$enableDualInternal$1((Handler) this.f17591c);
                return;
        }
    }
}
