package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f17453a;
    public final CaptchaController.Request f17454b;

    public s0(CaptchaController.Request request, int i10) {
        this.f17453a = i10;
        this.f17454b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f17453a) {
            case 0:
                CaptchaController.d(this.f17454b, exc);
                return;
            default:
                CaptchaController.b(this.f17454b, exc);
                return;
        }
    }
}
