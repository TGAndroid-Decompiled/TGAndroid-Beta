package ci;

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
public final class f7 {
    public final ha f5078c;
    public d7 d;
    public CameraView f5080f;
    public Bitmap f5081g;
    public final AtomicReference f5076a = new AtomicReference();
    public final AtomicBoolean f5077b = new AtomicBoolean(false);
    public final c7 h = new c7(this, 0);
    public final String f5079e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public f7(Context context, ha haVar) {
        this.f5078c = haVar;
        Utilities.globalQueue.postRunnable(new ai.ba(22, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f5080f = cameraView;
        if (this.f5076a.get() != null && !this.f5077b.get()) {
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
        if (this.f5077b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new c7(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
