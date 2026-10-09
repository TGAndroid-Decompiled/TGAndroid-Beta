package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f19094a;
    public final CaptchaController.Request f19095b;

    public s0(CaptchaController.Request request, int i10) {
        this.f19094a = i10;
        this.f19095b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19094a) {
            case 0:
                CaptchaController.d(this.f19095b, exc);
                return;
            default:
                CaptchaController.b(this.f19095b, exc);
                return;
        }
    }
}
