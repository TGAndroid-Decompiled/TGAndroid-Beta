package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class w0 implements OnFailureListener {
    public final int f21720a;
    public final CaptchaController.Request f21721b;

    public w0(CaptchaController.Request request, int i10) {
        this.f21720a = i10;
        this.f21721b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f21720a) {
            case 0:
                CaptchaController.d(this.f21721b, exc);
                return;
            default:
                CaptchaController.b(this.f21721b, exc);
                return;
        }
    }
}
