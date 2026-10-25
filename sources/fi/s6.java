package fi;

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
public final class s6 {
    public final q9 f11590c;
    public q6 d;
    public CameraView f11591f;
    public Bitmap f11592g;
    public final AtomicReference f11588a = new AtomicReference();
    public final AtomicBoolean f11589b = new AtomicBoolean(false);
    public final p6 h = new p6(this, 0);
    public final String e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public s6(Context context, q9 q9Var) {
        this.f11590c = q9Var;
        Utilities.globalQueue.postRunnable(new e2.q0(12, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f11591f = cameraView;
        if (this.f11588a.get() != null && !this.f11589b.get()) {
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
        if (this.f11589b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new p6(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
