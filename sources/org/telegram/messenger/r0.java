package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnFailureListener {
    public final int f17186a;
    public final CaptchaController.Request f17187b;

    public r0(CaptchaController.Request request, int i10) {
        this.f17186a = i10;
        this.f17187b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f17186a) {
            case 0:
                CaptchaController.d(this.f17187b, exc);
                return;
            default:
                CaptchaController.b(this.f17187b, exc);
                return;
        }
    }
}
