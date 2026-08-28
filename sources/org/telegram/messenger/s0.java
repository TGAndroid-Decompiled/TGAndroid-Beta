package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f21432a;
    public final CaptchaController.Request f21433b;

    public s0(CaptchaController.Request request, int i9) {
        this.f21432a = i9;
        this.f21433b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f21432a) {
            case 0:
                CaptchaController.d(this.f21433b, exc);
                return;
            default:
                CaptchaController.b(this.f21433b, exc);
                return;
        }
    }
}
