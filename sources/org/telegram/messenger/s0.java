package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f19932a;
    public final CaptchaController.Request f19933b;

    public s0(CaptchaController.Request request, int i10) {
        this.f19932a = i10;
        this.f19933b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19932a) {
            case 0:
                CaptchaController.d(this.f19933b, exc);
                return;
            default:
                CaptchaController.b(this.f19933b, exc);
                return;
        }
    }
}
