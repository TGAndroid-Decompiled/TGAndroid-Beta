package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraView;
public final class s implements Runnable {
    public final int f16966a;
    public final Object f16967b;
    public final Object f16968c;

    public s(int i10, Object obj, Object obj2) {
        this.f16966a = i10;
        this.f16967b = obj;
        this.f16968c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16966a) {
            case 0:
                ((CameraView.VideoRecorder) this.f16967b).lambda$handleStopRecording$0((CountDownLatch) this.f16968c);
                return;
            case 1:
                ((Camera2Session) this.f16967b).lambda$open$1((SurfaceTexture) this.f16968c);
                return;
            case 2:
                ((CameraController) this.f16967b).lambda$initCamera$2((Runnable) this.f16968c);
                return;
            case 3:
                CameraController.lambda$stopVideoRecording$16((Camera) this.f16967b, (CameraSession) this.f16968c);
                return;
            default:
                ((CameraView) this.f16967b).lambda$enableDualInternal$1((Handler) this.f16968c);
                return;
        }
    }
}
