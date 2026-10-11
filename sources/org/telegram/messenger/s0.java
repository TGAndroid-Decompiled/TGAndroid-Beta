package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f19100a;
    public final CaptchaController.Request f19101b;

    public s0(CaptchaController.Request request, int i10) {
        this.f19100a = i10;
        this.f19101b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f19100a) {
            case 0:
                CaptchaController.d(this.f19101b, exc);
                return;
            default:
                CaptchaController.b(this.f19101b, exc);
                return;
        }
    }
}
