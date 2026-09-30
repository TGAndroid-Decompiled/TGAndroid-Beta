package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
public final class p extends o7 {
    public final r F;

    public p(r rVar, Context context) {
        super(context);
        this.F = rVar;
    }

    @Override
    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f5245c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f5243a.getCameraSessionRecording(), false, false);
        }
        r rVar = this.F;
        if (rVar.O1) {
            rVar.z(true, false);
        }
    }
}
