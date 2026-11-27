package defpackage;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraView;
import org.webrtc.SurfaceTextureHelper;
public final class pa1 implements SurfaceTexture.OnFrameAvailableListener {
    public final byte a;
    public final Object b;

    public pa1(Object obj, byte b) {
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
                ((rf4) obj).b(false, true, true);
                return;
            case 2:
                np9 np9Var = (np9) obj;
                synchronized (np9Var.b) {
                    np9Var.m = true;
                    np9Var.b.notifyAll();
                }
                return;
            default:
                SurfaceTextureHelper.d((SurfaceTextureHelper) obj, surfaceTexture);
                return;
        }
    }
}
