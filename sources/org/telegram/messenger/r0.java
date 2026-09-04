package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnFailureListener {
    public final int f18839a;
    public final CaptchaController.Request f18840b;

    public r0(CaptchaController.Request request, int i10) {
        this.f18839a = i10;
        this.f18840b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f18839a) {
            case 0:
                CaptchaController.d(this.f18840b, exc);
                return;
            default:
                CaptchaController.b(this.f18840b, exc);
                return;
        }
    }
}
