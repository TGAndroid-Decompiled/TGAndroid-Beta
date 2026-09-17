package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnFailureListener {
    public final int f18858a;
    public final CaptchaController.Request f18859b;

    public r0(CaptchaController.Request request, int i10) {
        this.f18858a = i10;
        this.f18859b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f18858a) {
            case 0:
                CaptchaController.d(this.f18859b, exc);
                return;
            default:
                CaptchaController.b(this.f18859b, exc);
                return;
        }
    }
}
