package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class gz8 implements Runnable {
    public final byte a;
    public final jz8 b;

    public gz8(jz8 jz8Var, byte b) {
        this.a = b;
        this.b = jz8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jz8 jz8Var = this.b;
        switch (b) {
            case 0:
                jz8Var.g();
                jz8Var.a.A(jz8Var);
                return;
            case 1:
                af0 af0Var = jz8Var.j0;
                if (af0Var != null) {
                    af0Var.d();
                    jz8Var.j0 = null;
                }
                Bitmap bitmap = jz8Var.l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    jz8Var.l0 = null;
                }
                jz8Var.g0.quitSafely();
                return;
            case 2:
                try {
                    Context context = a.b;
                    ?? obj = new Object();
                    obj.a = 256;
                    jz8Var.j0 = new af0(new cgd(context, (qwe) obj));
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
                jz8Var.k0 = new aj3((byte) 29);
                return;
            default:
                if (!jz8Var.W && !jz8Var.V && jz8Var.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(jz8Var.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new m88(jz8Var, cameraView, (byte) 17));
                    jz8Var.b = cameraView;
                    jz8Var.addView(cameraView, 0, tre.c(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}
