package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnFailureListener {
    public final int f19621a;
    public final CaptchaController.Request f19622b;

    public t0(CaptchaController.Request request, int i10) {
        this.f19621a = i10;
        this.f19622b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19621a) {
            case 0:
                CaptchaController.d(this.f19622b, exc);
                return;
            default:
                CaptchaController.b(this.f19622b, exc);
                return;
        }
    }
}
