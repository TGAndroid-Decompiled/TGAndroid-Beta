package nh;

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
public final class j6 {
    public final h9 f17960c;
    public h6 d;
    public CameraView f17962f;
    public Bitmap f17963g;
    public final AtomicReference f17958a = new AtomicReference();
    public final AtomicBoolean f17959b = new AtomicBoolean(false);
    public final g6 h = new g6(this, 0);
    public final String f17961e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public j6(Context context, h9 h9Var) {
        this.f17960c = h9Var;
        Utilities.globalQueue.postRunnable(new b6(3, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f17962f = cameraView;
        if (this.f17958a.get() != null && !this.f17959b.get()) {
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
        if (this.f17959b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.globalQueue.cancelRunnable(this.h);
                if (this.d != null) {
                    this.d = null;
                    AndroidUtilities.runOnUIThread(new g6(this, 1));
                    return;
                }
                return;
            }
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
        }
    }
}
