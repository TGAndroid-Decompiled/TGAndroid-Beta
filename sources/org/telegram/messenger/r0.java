package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnFailureListener {
    public final int f21390a;
    public final CaptchaController.Request f21391b;

    public r0(CaptchaController.Request request, int i10) {
        this.f21390a = i10;
        this.f21391b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f21390a) {
            case 0:
                CaptchaController.d(this.f21391b, exc);
                return;
            default:
                CaptchaController.b(this.f21391b, exc);
                return;
        }
    }
}
