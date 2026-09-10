package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
public final class t extends r8 {
    public final v F;

    public t(v vVar, Context context) {
        super(context);
        this.F = vVar;
    }

    @Override
    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.f3551c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.f3549a.getCameraSessionRecording(), false, false);
        }
        v vVar = this.F;
        if (vVar.O1) {
            vVar.z(true, false);
        }
    }
}
