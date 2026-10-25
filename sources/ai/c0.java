package ai;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.gb1;
public final class c0 implements Runnable {
    public final int f1444a;
    public final o0 f1445b;

    public c0(o0 o0Var, int i10) {
        this.f1444a = i10;
        this.f1445b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f1444a) {
            case 0:
                o0 o0Var = this.f1445b;
                o0Var.g();
                o0Var.f1581a.a(o0Var);
                return;
            case 1:
                o0 o0Var2 = this.f1445b;
                s8.n nVar = o0Var2.f1593i0;
                if (nVar != null) {
                    nVar.X0();
                    o0Var2.f1593i0 = null;
                }
                Bitmap bitmap = o0Var2.f1595k0;
                if (bitmap != null) {
                    bitmap.recycle();
                    o0Var2.f1595k0 = null;
                }
                o0Var2.f1590f0.quitSafely();
                return;
            case 2:
                o0 o0Var3 = this.f1445b;
                try {
                    Context context = ApplicationLoader.applicationContext;
                    ?? obj = new Object();
                    obj.f7500a = 256;
                    o0Var3.f1593i0 = new s8.n(new t2(context, (x1) obj));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                o0Var3.f1594j0 = new za.c(28);
                return;
            default:
                o0 o0Var4 = this.f1445b;
                if (!o0Var4.V && !o0Var4.U && o0Var4.f1583b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(o0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new f0(0, o0Var4, cameraView));
                    o0Var4.f1583b = cameraView;
                    o0Var4.addView(cameraView, 0, gb1.g(-1.0f, -1));
                    return;
                }
                return;
        }
    }
}
