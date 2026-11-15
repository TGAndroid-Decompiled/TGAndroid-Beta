package ci;

import android.content.Context;
import android.graphics.Bitmap;
import c8.ja;
import com.google.android.gms.internal.vision.u2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class w implements Runnable {
    public final int f5528a;
    public final a0 f5529b;

    public w(a0 a0Var, int i7) {
        this.f5528a = i7;
        this.f5529b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f5528a) {
            case 0:
                a0 a0Var = this.f5529b;
                a0Var.g();
                a0Var.f5258a.g(a0Var);
                return;
            case 1:
                a0 a0Var2 = this.f5529b;
                u8.n nVar = a0Var2.f5272j0;
                if (nVar != null) {
                    nVar.X0();
                    a0Var2.f5272j0 = null;
                }
                Bitmap bitmap = a0Var2.f5274l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    a0Var2.f5274l0 = null;
                }
                a0Var2.f5269g0.quitSafely();
                return;
            case 2:
                a0 a0Var3 = this.f5529b;
                try {
                    Context context = org.telegram.messenger.t0.f26609b;
                    ?? obj = new Object();
                    obj.f7049a = 256;
                    a0Var3.f5272j0 = new u8.n(new u2(context, (x1) obj));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                a0Var3.f5273k0 = new cb.c(24);
                return;
            default:
                a0 a0Var4 = this.f5529b;
                if (!a0Var4.W && !a0Var4.V && a0Var4.f5260b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(a0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new ab.g(11, a0Var4, cameraView));
                    a0Var4.f5260b = cameraView;
                    a0Var4.addView(cameraView, 0, ja.c(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}
