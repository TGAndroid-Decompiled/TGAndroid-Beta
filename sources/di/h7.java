package di;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
public final class h7 {
    public final la f7323c;
    public f7 d;
    public CameraView f7325f;
    public Bitmap f7326g;
    public final AtomicReference f7321a = new AtomicReference();
    public final AtomicBoolean f7322b = new AtomicBoolean(false);
    public final e7 h = new e7(this, 0);
    public final String f7324e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public h7(Context context, la laVar) {
        this.f7323c = laVar;
        Utilities.globalQueue.postRunnable(new b7(1, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f7325f = cameraView;
        if (this.f7321a.get() != null && !this.f7322b.get()) {
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.f7322b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new e7(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
