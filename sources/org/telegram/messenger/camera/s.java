package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f16056a;
    public final Object f16057b;
    public final Object f16058c;

    public s(int i10, Object obj, Object obj2) {
        this.f16056a = i10;
        this.f16057b = obj;
        this.f16058c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16056a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16057b).lambda$handleStopRecording$0((CountDownLatch) this.f16058c);
                return;
            case 1:
                ((Camera2Session) this.f16057b).lambda$open$1((SurfaceTexture) this.f16058c);
                return;
            case 2:
                ((CameraController) this.f16057b).lambda$initCamera$2((Runnable) this.f16058c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16057b, (CameraSession) this.f16058c);
                return;
            default:
                ((CameraView) this.f16057b).lambda$enableDualInternal$1((Handler) this.f16058c);
                return;
        }
    }
}
