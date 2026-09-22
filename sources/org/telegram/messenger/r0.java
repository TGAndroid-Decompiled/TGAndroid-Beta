package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnFailureListener {
    public final int f17182a;
    public final CaptchaController.Request f17183b;

    public r0(CaptchaController.Request request, int i10) {
        this.f17182a = i10;
        this.f17183b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f17182a) {
            case 0:
                CaptchaController.d(this.f17183b, exc);
                return;
            default:
                CaptchaController.b(this.f17183b, exc);
                return;
        }
    }
}
