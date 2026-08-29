package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f19930a;
    public final Object f19931b;
    public final Object f19932c;

    public s(int i10, Object obj, Object obj2) {
        this.f19930a = i10;
        this.f19931b = obj;
        this.f19932c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19930a) {
            case 0:
                ((CameraView.VideoRecorder) this.f19931b).lambda$handleStopRecording$0((CountDownLatch) this.f19932c);
                return;
            case 1:
                ((Camera2Session) this.f19931b).lambda$open$1((SurfaceTexture) this.f19932c);
                return;
            case 2:
                ((CameraController) this.f19931b).lambda$initCamera$2((Runnable) this.f19932c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f19931b, (CameraSession) this.f19932c);
                return;
            default:
                ((CameraView) this.f19931b).lambda$enableDualInternal$1((Handler) this.f19932c);
                return;
        }
    }
}
