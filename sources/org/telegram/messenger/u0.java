package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class u0 implements OnFailureListener {
    public final int f19641a;
    public final CaptchaController.Request f19642b;

    public u0(CaptchaController.Request request, int i10) {
        this.f19641a = i10;
        this.f19642b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19641a) {
            case 0:
                CaptchaController.d(this.f19642b, exc);
                return;
            default:
                CaptchaController.b(this.f19642b, exc);
                return;
        }
    }
}
