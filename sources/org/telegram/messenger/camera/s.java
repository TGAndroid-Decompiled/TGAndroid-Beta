package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f16101a;
    public final Object f16102b;
    public final Object f16103c;

    public s(int i10, Object obj, Object obj2) {
        this.f16101a = i10;
        this.f16102b = obj;
        this.f16103c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16101a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16102b).lambda$handleStopRecording$0((CountDownLatch) this.f16103c);
                return;
            case 1:
                ((Camera2Session) this.f16102b).lambda$open$1((SurfaceTexture) this.f16103c);
                return;
            case 2:
                ((CameraController) this.f16102b).lambda$initCamera$2((Runnable) this.f16103c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16102b, (CameraSession) this.f16103c);
                return;
            default:
                ((CameraView) this.f16102b).lambda$enableDualInternal$1((Handler) this.f16103c);
                return;
        }
    }
}
