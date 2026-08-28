package kh;

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
public final class v6 {
    public final w9 f16199c;
    public t6 d;
    public CameraView f16201f;
    public Bitmap f16202g;
    public final AtomicReference f16197a = new AtomicReference();
    public final AtomicBoolean f16198b = new AtomicBoolean(false);
    public final s6 h = new s6(this, 0);
    public final String f16200e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public v6(Context context, w9 w9Var) {
        this.f16199c = w9Var;
        Utilities.globalQueue.postRunnable(new ih.j7(20, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f16201f = cameraView;
        if (this.f16197a.get() != null && !this.f16198b.get()) {
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
        if (this.f16198b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new s6(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
