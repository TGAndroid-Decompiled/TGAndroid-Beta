package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnFailureListener {
    public final int f19527a;
    public final CaptchaController.Request f19528b;

    public t0(CaptchaController.Request request, int i10) {
        this.f19527a = i10;
        this.f19528b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19527a) {
            case 0:
                CaptchaController.d(this.f19528b, exc);
                return;
            default:
                CaptchaController.b(this.f19528b, exc);
                return;
        }
    }
}
