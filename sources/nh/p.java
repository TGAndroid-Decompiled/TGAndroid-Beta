package nh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
public final class p extends t6 {
    public final r B;

    public p(r rVar, Context context) {
        super(context);
        this.B = rVar;
    }

    @Override
    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f18674c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f18672a.getCameraSessionRecording(), false, false);
        }
        r rVar = this.B;
        if (rVar.K1) {
            rVar.z(true, false);
        }
    }
}
