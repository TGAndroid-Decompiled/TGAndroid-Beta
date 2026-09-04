package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f17369a;
    public final Object f17370b;
    public final Object f17371c;

    public s(int i10, Object obj, Object obj2) {
        this.f17369a = i10;
        this.f17370b = obj;
        this.f17371c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17369a) {
            case 0:
                ((CameraView.VideoRecorder) this.f17370b).lambda$handleStopRecording$0((CountDownLatch) this.f17371c);
                return;
            case 1:
                ((Camera2Session) this.f17370b).lambda$open$1((SurfaceTexture) this.f17371c);
                return;
            case 2:
                ((CameraController) this.f17370b).lambda$initCamera$2((Runnable) this.f17371c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f17370b, (CameraSession) this.f17371c);
                return;
            default:
                ((CameraView) this.f17370b).lambda$enableDualInternal$1((Handler) this.f17371c);
                return;
        }
    }
}
