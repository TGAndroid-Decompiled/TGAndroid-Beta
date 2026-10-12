package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnFailureListener {
    public final int f18940a;
    public final CaptchaController.Request f18941b;

    public t0(CaptchaController.Request request, int i10) {
        this.f18940a = i10;
        this.f18941b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f18940a) {
            case 0:
                CaptchaController.d(this.f18941b, exc);
                return;
            default:
                CaptchaController.b(this.f18941b, exc);
                return;
        }
    }
}
