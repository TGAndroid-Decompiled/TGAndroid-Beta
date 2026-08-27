package lh;

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

public final class u6 {

    public final t9 f16909c;
    public s6 d;

    public CameraView f16911f;

    public Bitmap f16912g;

    public final AtomicReference f16907a = new AtomicReference();

    public final AtomicBoolean f16908b = new AtomicBoolean(false);
    public final r6 h = new r6(this, 0);

    public final String f16910e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public u6(Context context, t9 t9Var) {
        this.f16909c = t9Var;
        Utilities.globalQueue.postRunnable(new jh.p6(26, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f16911f = cameraView;
        if (this.f16907a.get() == null || this.f16908b.get()) {
            return;
        }
        Utilities.globalQueue.cancelRunnable(this.h);
        Utilities.globalQueue.postRunnable(this.h, b());
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 800L : 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.f16908b.getAndSet(z10) == z10) {
            return;
        }
        if (!z10) {
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
            return;
        }
        Utilities.globalQueue.cancelRunnable(this.h);
        if (this.d != null) {
            this.d = null;
            AndroidUtilities.runOnUIThread(new r6(this, 1));
        }
    }
}
