package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f18392a;
    public final Object f18393b;
    public final Object f18394c;

    public s(int i10, Object obj, Object obj2) {
        this.f18392a = i10;
        this.f18393b = obj;
        this.f18394c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18392a) {
            case 0:
                ((CameraView.VideoRecorder) this.f18393b).lambda$handleStopRecording$0((CountDownLatch) this.f18394c);
                return;
            case 1:
                ((Camera2Session) this.f18393b).lambda$open$1((SurfaceTexture) this.f18394c);
                return;
            case 2:
                ((CameraController) this.f18393b).lambda$initCamera$2((Runnable) this.f18394c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f18393b, (CameraSession) this.f18394c);
                return;
            default:
                ((CameraView) this.f18393b).lambda$enableDualInternal$1((Handler) this.f18394c);
                return;
        }
    }
}
