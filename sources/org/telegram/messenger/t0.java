package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnFailureListener {
    public final int f18144a;
    public final CaptchaController.Request f18145b;

    public t0(CaptchaController.Request request, int i10) {
        this.f18144a = i10;
        this.f18145b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f18144a) {
            case 0:
                CaptchaController.d(this.f18145b, exc);
                return;
            default:
                CaptchaController.b(this.f18145b, exc);
                return;
        }
    }
}
