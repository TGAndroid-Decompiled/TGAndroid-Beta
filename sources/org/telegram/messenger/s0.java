package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f17517a;
    public final CaptchaController.Request f17518b;

    public s0(CaptchaController.Request request, int i10) {
        this.f17517a = i10;
        this.f17518b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f17517a) {
            case 0:
                CaptchaController.d(this.f17518b, exc);
                return;
            default:
                CaptchaController.b(this.f17518b, exc);
                return;
        }
    }
}
