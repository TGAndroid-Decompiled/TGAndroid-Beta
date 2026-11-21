package ci;

import android.content.Context;
import android.graphics.Bitmap;
import c8.ma;
import com.google.android.gms.internal.vision.u2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class x implements Runnable {
    public final int f5860a;
    public final b0 f5861b;

    public x(b0 b0Var, int i7) {
        this.f5860a = i7;
        this.f5861b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f5860a) {
            case 0:
                b0 b0Var = this.f5861b;
                b0Var.g();
                b0Var.f5576a.c(b0Var);
                return;
            case 1:
                b0 b0Var2 = this.f5861b;
                u8.n nVar = b0Var2.f5590j0;
                if (nVar != null) {
                    nVar.X0();
                    b0Var2.f5590j0 = null;
                }
                Bitmap bitmap = b0Var2.f5592l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    b0Var2.f5592l0 = null;
                }
                b0Var2.f5587g0.quitSafely();
                return;
            case 2:
                b0 b0Var3 = this.f5861b;
                try {
                    Context context = org.telegram.messenger.t0.f26941b;
                    ?? obj = new Object();
                    obj.f7358a = 256;
                    b0Var3.f5590j0 = new u8.n(new u2(context, (x1) obj));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                b0Var3.f5591k0 = new d6.i(20);
                return;
            default:
                b0 b0Var4 = this.f5861b;
                if (!b0Var4.W && !b0Var4.V && b0Var4.f5578b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(b0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new ab.g(10, b0Var4, cameraView));
                    b0Var4.f5578b = cameraView;
                    b0Var4.addView(cameraView, 0, ma.c(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}
