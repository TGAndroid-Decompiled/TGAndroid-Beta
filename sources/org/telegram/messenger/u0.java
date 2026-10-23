package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class u0 implements OnFailureListener {
    public final int f19646a;
    public final CaptchaController.Request f19647b;

    public u0(CaptchaController.Request request, int i10) {
        this.f19646a = i10;
        this.f19647b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19646a) {
            case 0:
                CaptchaController.d(this.f19647b, exc);
                return;
            default:
                CaptchaController.b(this.f19647b, exc);
                return;
        }
    }
}
