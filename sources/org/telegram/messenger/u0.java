package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class u0 implements OnFailureListener {
    public final int f19625a;
    public final CaptchaController.Request f19626b;

    public u0(CaptchaController.Request request, int i10) {
        this.f19625a = i10;
        this.f19626b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19625a) {
            case 0:
                CaptchaController.d(this.f19626b, exc);
                return;
            default:
                CaptchaController.b(this.f19626b, exc);
                return;
        }
    }
}
