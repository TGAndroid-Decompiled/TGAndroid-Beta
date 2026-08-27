package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;

public final class s implements Runnable {

    public final int f19942a;

    public final Object f19943b;

    public final Object f19944c;

    public s(int i10, Object obj, Object obj2) {
        this.f19942a = i10;
        this.f19943b = obj;
        this.f19944c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19942a) {
            case 0:
                ((CameraView.VideoRecorder) this.f19943b).lambda$handleStopRecording$0((CountDownLatch) this.f19944c);
                break;
            case 1:
                ((Camera2Session) this.f19943b).lambda$open$1((SurfaceTexture) this.f19944c);
                break;
            case 2:
                ((CameraController) this.f19943b).lambda$initCamera$2((Runnable) this.f19944c);
                break;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f19943b, (CameraSession) this.f19944c);
                break;
            default:
                ((CameraView) this.f19943b).lambda$enableDualInternal$1((Handler) this.f19944c);
                break;
        }
    }
}
