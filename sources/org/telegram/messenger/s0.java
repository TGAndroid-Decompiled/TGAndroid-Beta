package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f19119a;
    public final CaptchaController.Request f19120b;

    public s0(CaptchaController.Request request, int i10) {
        this.f19119a = i10;
        this.f19120b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19119a) {
            case 0:
                CaptchaController.d(this.f19120b, exc);
                return;
            default:
                CaptchaController.b(this.f19120b, exc);
                return;
        }
    }
}
