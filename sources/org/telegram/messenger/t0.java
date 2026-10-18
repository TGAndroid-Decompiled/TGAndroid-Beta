package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnFailureListener {
    public final int f19535a;
    public final CaptchaController.Request f19536b;

    public t0(CaptchaController.Request request, int i10) {
        this.f19535a = i10;
        this.f19536b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19535a) {
            case 0:
                CaptchaController.d(this.f19536b, exc);
                return;
            default:
                CaptchaController.b(this.f19536b, exc);
                return;
        }
    }
}
