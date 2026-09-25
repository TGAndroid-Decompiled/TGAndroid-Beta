package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnFailureListener {
    public final int f17497a;
    public final CaptchaController.Request f17498b;

    public s0(CaptchaController.Request request, int i10) {
        this.f17497a = i10;
        this.f17498b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f17497a) {
            case 0:
                CaptchaController.d(this.f17498b, exc);
                return;
            default:
                CaptchaController.b(this.f17498b, exc);
                return;
        }
    }
}
