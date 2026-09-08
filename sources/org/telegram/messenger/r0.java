package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnFailureListener {
    public final int f18866a;
    public final CaptchaController.Request f18867b;

    public r0(CaptchaController.Request request, int i10) {
        this.f18866a = i10;
        this.f18867b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f18866a) {
            case 0:
                CaptchaController.d(this.f18867b, exc);
                return;
            default:
                CaptchaController.b(this.f18867b, exc);
                return;
        }
    }
}
