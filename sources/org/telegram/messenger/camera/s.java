package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f19974a;
    public final Object f19975b;
    public final Object f19976c;

    public s(int i9, Object obj, Object obj2) {
        this.f19974a = i9;
        this.f19975b = obj;
        this.f19976c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19974a) {
            case 0:
                ((CameraView.VideoRecorder) this.f19975b).lambda$handleStopRecording$0((CountDownLatch) this.f19976c);
                return;
            case 1:
                ((Camera2Session) this.f19975b).lambda$open$1((SurfaceTexture) this.f19976c);
                return;
            case 2:
                ((CameraController) this.f19975b).lambda$initCamera$2((Runnable) this.f19976c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f19975b, (CameraSession) this.f19976c);
                return;
            default:
                ((CameraView) this.f19975b).lambda$enableDualInternal$1((Handler) this.f19976c);
                return;
        }
    }
}
