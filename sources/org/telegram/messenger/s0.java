package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f19930a;
    public final CaptchaController.Request f19931b;

    public s0(CaptchaController.Request request, int i10) {
        this.f19930a = i10;
        this.f19931b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19930a) {
            case 0:
                CaptchaController.d(this.f19931b, exc);
                return;
            default:
                CaptchaController.b(this.f19931b, exc);
                return;
        }
    }
}
