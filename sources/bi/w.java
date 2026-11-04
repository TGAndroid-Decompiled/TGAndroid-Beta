package bi;

import android.content.Context;
import android.graphics.Bitmap;
import b8.mf;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class w implements Runnable {
    public final int f3878a;
    public final a0 f3879b;

    public w(a0 a0Var, int i3) {
        this.f3878a = i3;
        this.f3879b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f3878a) {
            case 0:
                a0 a0Var = this.f3879b;
                a0Var.g();
                a0Var.f3357a.e(a0Var);
                return;
            case 1:
                a0 a0Var2 = this.f3879b;
                t8.n nVar = a0Var2.f3371j0;
                if (nVar != null) {
                    nVar.X0();
                    a0Var2.f3371j0 = null;
                }
                Bitmap bitmap = a0Var2.f3373l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    a0Var2.f3373l0 = null;
                }
                a0Var2.f3368g0.quitSafely();
                return;
            case 2:
                a0 a0Var3 = this.f3879b;
                try {
                    Context context = org.telegram.messenger.t0.f25457b;
                    ?? obj = new Object();
                    obj.f7715a = 256;
                    a0Var3.f3371j0 = new t8.n(new t2(context, (x1) obj));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                a0Var3.f3372k0 = new c6.i(9);
                return;
            default:
                a0 a0Var4 = this.f3879b;
                if (!a0Var4.W && !a0Var4.V && a0Var4.f3359b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(a0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new ai.n(6, a0Var4, cameraView));
                    a0Var4.f3359b = cameraView;
                    a0Var4.addView(cameraView, 0, mf.c(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}
