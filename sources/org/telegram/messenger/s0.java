package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f18329a;
    public final CaptchaController.Request f18330b;

    public s0(CaptchaController.Request request, int i10) {
        this.f18329a = i10;
        this.f18330b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f18329a) {
            case 0:
                CaptchaController.d(this.f18330b, exc);
                return;
            default:
                CaptchaController.b(this.f18330b, exc);
                return;
        }
    }
}
