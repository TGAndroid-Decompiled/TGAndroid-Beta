package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class r implements Runnable {
    public final int f19810a;
    public final Object f19811b;
    public final Object f19812c;

    public r(int i10, Object obj, Object obj2) {
        this.f19810a = i10;
        this.f19811b = obj;
        this.f19812c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19810a) {
            case 0:
                ((CameraView.VideoRecorder) this.f19811b).lambda$handleStopRecording$0((CountDownLatch) this.f19812c);
                return;
            case 1:
                ((Camera2Session) this.f19811b).lambda$open$1((SurfaceTexture) this.f19812c);
                return;
            case 2:
                ((CameraController) this.f19811b).lambda$initCamera$2((Runnable) this.f19812c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f19811b, (CameraSession) this.f19812c);
                return;
            default:
                ((CameraView) this.f19811b).lambda$enableDualInternal$1((Handler) this.f19812c);
                return;
        }
    }
}
