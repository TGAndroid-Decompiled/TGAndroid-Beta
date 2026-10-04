package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f19113a;
    public final CaptchaController.Request f19114b;

    public s0(CaptchaController.Request request, int i10) {
        this.f19113a = i10;
        this.f19114b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19113a) {
            case 0:
                CaptchaController.d(this.f19114b, exc);
                return;
            default:
                CaptchaController.b(this.f19114b, exc);
                return;
        }
    }
}
