package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnFailureListener {
    public final int f18941a;
    public final CaptchaController.Request f18942b;

    public t0(CaptchaController.Request request, int i10) {
        this.f18941a = i10;
        this.f18942b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f18941a) {
            case 0:
                CaptchaController.d(this.f18942b, exc);
                return;
            default:
                CaptchaController.b(this.f18942b, exc);
                return;
        }
    }
}
