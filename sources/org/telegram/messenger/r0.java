package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnFailureListener {
    public final int f18885a;
    public final CaptchaController.Request f18886b;

    public r0(CaptchaController.Request request, int i10) {
        this.f18885a = i10;
        this.f18886b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f18885a) {
            case 0:
                CaptchaController.d(this.f18886b, exc);
                return;
            default:
                CaptchaController.b(this.f18886b, exc);
                return;
        }
    }
}
