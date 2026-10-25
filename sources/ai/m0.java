package ai;

import android.graphics.Bitmap;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraView;
public final class m0 implements Runnable {
    public final o0 f1572a;

    public m0(o0 o0Var) {
        this.f1572a = o0Var;
    }

    @Override
    public final void run() {
        o0 o0Var = this.f1572a;
        CameraView cameraView = o0Var.f1583b;
        if (o0Var.f1592h0 && cameraView != null) {
            TextureView textureView = cameraView.getTextureView();
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            if (width > 0 && height > 0) {
                if (width > 720 || height > 720) {
                    float f7 = width;
                    float f10 = height;
                    float min = Math.min(720.0f / f7, 720.0f / f10);
                    width = Math.max(1, (int) (f7 * min));
                    height = Math.max(1, (int) (f10 * min));
                }
                Bitmap bitmap = this.f1572a.f1595k0;
                if (bitmap == null || bitmap.getWidth() != width || this.f1572a.f1595k0.getHeight() != height) {
                    this.f1572a.f1595k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                }
                try {
                    textureView.getBitmap(this.f1572a.f1595k0);
                    o0 o0Var2 = this.f1572a;
                    rf.b f11 = o0.f(o0Var2.f1595k0, o0Var2.f1593i0, o0Var2.f1594j0, o0Var2.O);
                    if (f11 != null) {
                        AndroidUtilities.runOnUIThread(new a1.f(11, this, f11));
                        return;
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            if (this.f1572a.f1592h0) {
                this.f1572a.f1591g0.postDelayed(this, 150L);
            }
        }
    }
}
