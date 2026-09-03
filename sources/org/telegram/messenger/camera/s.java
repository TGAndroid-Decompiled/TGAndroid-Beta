package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f16951a;
    public final Object f16952b;
    public final Object f16953c;

    public s(int i10, Object obj, Object obj2) {
        this.f16951a = i10;
        this.f16952b = obj;
        this.f16953c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16951a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16952b).lambda$handleStopRecording$0((CountDownLatch) this.f16953c);
                return;
            case 1:
                ((Camera2Session) this.f16952b).lambda$open$1((SurfaceTexture) this.f16953c);
                return;
            case 2:
                ((CameraController) this.f16952b).lambda$initCamera$2((Runnable) this.f16953c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16952b, (CameraSession) this.f16953c);
                return;
            default:
                ((CameraView) this.f16952b).lambda$enableDualInternal$1((Handler) this.f16953c);
                return;
        }
    }
}
