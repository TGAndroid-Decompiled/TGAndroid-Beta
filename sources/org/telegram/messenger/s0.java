package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f17482a;
    public final CaptchaController.Request f17483b;

    public s0(CaptchaController.Request request, int i10) {
        this.f17482a = i10;
        this.f17483b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f17482a) {
            case 0:
                CaptchaController.d(this.f17483b, exc);
                return;
            default:
                CaptchaController.b(this.f17483b, exc);
                return;
        }
    }
}
