package ai;

import android.content.Context;
import android.graphics.Bitmap;
import c8.ha;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class b0 implements Runnable {
    public final int f1127a;
    public final i0 f1128b;

    public b0(i0 i0Var, int i7) {
        this.f1127a = i7;
        this.f1128b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f1127a) {
            case 0:
                i0 i0Var = this.f1128b;
                i0Var.g();
                i0Var.f1239a.l(i0Var);
                return;
            case 1:
                i0 i0Var2 = this.f1128b;
                u8.n nVar = i0Var2.f1252i0;
                if (nVar != null) {
                    nVar.X0();
                    i0Var2.f1252i0 = null;
                }
                Bitmap bitmap = i0Var2.f1254k0;
                if (bitmap != null) {
                    bitmap.recycle();
                    i0Var2.f1254k0 = null;
                }
                i0Var2.f1249f0.quitSafely();
                return;
            case 2:
                i0 i0Var3 = this.f1128b;
                try {
                    Context context = org.telegram.messenger.t0.f25555b;
                    ?? obj = new Object();
                    obj.f7660a = 256;
                    i0Var3.f1252i0 = new u8.n(new t2(context, (x1) obj));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                i0Var3.f1253j0 = new aa.n(20);
                return;
            default:
                i0 i0Var4 = this.f1128b;
                if (!i0Var4.V && !i0Var4.U && i0Var4.f1241b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(i0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new ab.g(2, i0Var4, cameraView));
                    i0Var4.f1241b = cameraView;
                    i0Var4.addView(cameraView, 0, ha.c(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}
