package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f16110a;
    public final Object f16111b;
    public final Object f16112c;

    public s(int i10, Object obj, Object obj2) {
        this.f16110a = i10;
        this.f16111b = obj;
        this.f16112c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16110a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16111b).lambda$handleStopRecording$0((CountDownLatch) this.f16112c);
                return;
            case 1:
                ((Camera2Session) this.f16111b).lambda$open$1((SurfaceTexture) this.f16112c);
                return;
            case 2:
                ((CameraController) this.f16111b).lambda$initCamera$2((Runnable) this.f16112c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16111b, (CameraSession) this.f16112c);
                return;
            default:
                ((CameraView) this.f16111b).lambda$enableDualInternal$1((Handler) this.f16112c);
                return;
        }
    }
}
