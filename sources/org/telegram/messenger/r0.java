package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;

public final class r0 implements OnFailureListener {

    public final int f21392a;

    public final CaptchaController.Request f21393b;

    public r0(CaptchaController.Request request, int i10) {
        this.f21392a = i10;
        this.f21393b = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.f21392a) {
            case 0:
                CaptchaController.lambda$request$3(this.f21393b, exc);
                break;
            default:
                CaptchaController.lambda$request$1(this.f21393b, exc);
                break;
        }
    }
}
