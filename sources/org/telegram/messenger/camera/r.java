package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class r implements Runnable {
    public final int f16986a;
    public final Object f16987b;
    public final Object f16988c;

    public r(int i10, Object obj, Object obj2) {
        this.f16986a = i10;
        this.f16987b = obj;
        this.f16988c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16986a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16987b).lambda$handleStopRecording$0((CountDownLatch) this.f16988c);
                return;
            case 1:
                ((Camera2Session) this.f16987b).lambda$open$1((SurfaceTexture) this.f16988c);
                return;
            case 2:
                ((CameraController) this.f16987b).lambda$initCamera$2((Runnable) this.f16988c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16987b, (CameraSession) this.f16988c);
                return;
            default:
                ((CameraView) this.f16987b).lambda$enableDualInternal$1((Handler) this.f16988c);
                return;
        }
    }
}
