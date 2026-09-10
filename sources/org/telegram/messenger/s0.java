package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f16272a;
    public final CaptchaController.Request f16273b;

    public s0(CaptchaController.Request request, int i10) {
        this.f16272a = i10;
        this.f16273b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f16272a) {
            case 0:
                CaptchaController.d(this.f16273b, exc);
                return;
            default:
                CaptchaController.b(this.f16273b, exc);
                return;
        }
    }
}
