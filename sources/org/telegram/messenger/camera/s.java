package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f16127a;
    public final Object f16128b;
    public final Object f16129c;

    public s(int i10, Object obj, Object obj2) {
        this.f16127a = i10;
        this.f16128b = obj;
        this.f16129c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16127a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16128b).lambda$handleStopRecording$0((CountDownLatch) this.f16129c);
                return;
            case 1:
                ((Camera2Session) this.f16128b).lambda$open$1((SurfaceTexture) this.f16129c);
                return;
            case 2:
                ((CameraController) this.f16128b).lambda$initCamera$2((Runnable) this.f16129c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16128b, (CameraSession) this.f16129c);
                return;
            default:
                ((CameraView) this.f16128b).lambda$enableDualInternal$1((Handler) this.f16129c);
                return;
        }
    }
}
