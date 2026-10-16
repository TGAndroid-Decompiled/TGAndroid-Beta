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
public final class e7 {
    public final ha f6898c;
    public c7 d;
    public CameraView f6899f;
    public Bitmap f6900g;
    public final AtomicReference f6896a = new AtomicReference();
    public final AtomicBoolean f6897b = new AtomicBoolean(false);
    public final b7 h = new b7(this, 0);
    public final String e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public e7(Context context, ha haVar) {
        this.f6898c = haVar;
        Utilities.globalQueue.postRunnable(new y6(3, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f6899f = cameraView;
        if (this.f6896a.get() != null && !this.f6897b.get()) {
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
        if (this.f6897b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new b7(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
