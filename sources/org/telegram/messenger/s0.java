package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f17487a;
    public final CaptchaController.Request f17488b;

    public s0(CaptchaController.Request request, int i10) {
        this.f17487a = i10;
        this.f17488b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f17487a) {
            case 0:
                CaptchaController.d(this.f17488b, exc);
                return;
            default:
                CaptchaController.b(this.f17488b, exc);
                return;
        }
    }
}
