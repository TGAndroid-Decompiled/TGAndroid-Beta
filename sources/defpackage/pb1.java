package defpackage;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
import org.webrtc.SurfaceTextureHelper;
public final class pb1 implements SurfaceTexture.OnFrameAvailableListener {
    public final byte a;
    public final Object b;

    public pb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CameraView.CameraGLThread) obj).updTex(surfaceTexture);
                return;
            case 1:
                ((uf4) obj).b(false, true, true);
                return;
            case 2:
                yn9 yn9Var = (yn9) obj;
                synchronized (yn9Var.b) {
                    yn9Var.m = true;
                    yn9Var.b.notifyAll();
                }
                return;
            default:
                ((SurfaceTextureHelper) obj).lambda$new$0(surfaceTexture);
                return;
        }
    }
}
