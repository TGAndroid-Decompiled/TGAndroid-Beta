package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class u0 implements OnFailureListener {
    public final int f19623a;
    public final CaptchaController.Request f19624b;

    public u0(CaptchaController.Request request, int i10) {
        this.f19623a = i10;
        this.f19624b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19623a) {
            case 0:
                CaptchaController.d(this.f19624b, exc);
                return;
            default:
                CaptchaController.b(this.f19624b, exc);
                return;
        }
    }
}
