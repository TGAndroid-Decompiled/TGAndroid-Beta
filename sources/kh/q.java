package kh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
public final class q extends e7 {
    public final s B;

    public q(s sVar, Context context) {
        super(context);
        this.B = sVar;
    }

    @Override
    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f15155c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f15153a.getCameraSessionRecording(), false, false);
        }
        s sVar = this.B;
        if (sVar.K1) {
            sVar.z(true, false);
        }
    }
}
