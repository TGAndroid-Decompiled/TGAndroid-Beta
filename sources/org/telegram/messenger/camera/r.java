package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class r implements Runnable {
    public final int f22847a;
    public final Object f22848b;
    public final Object f22849c;

    public r(int i7, Object obj, Object obj2) {
        this.f22847a = i7;
        this.f22848b = obj;
        this.f22849c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f22847a) {
            case 0:
                ((CameraView.VideoRecorder) this.f22848b).lambda$handleStopRecording$0((CountDownLatch) this.f22849c);
                return;
            case 1:
                ((Camera2Session) this.f22848b).lambda$open$1((SurfaceTexture) this.f22849c);
                return;
            case 2:
                ((CameraController) this.f22848b).lambda$initCamera$2((Runnable) this.f22849c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f22848b, (CameraSession) this.f22849c);
                return;
            default:
                ((CameraView) this.f22848b).lambda$enableDualInternal$1((Handler) this.f22849c);
                return;
        }
    }
}
