package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;

public final class CaptchaController$$ExternalSyntheticLambda1 implements OnFailureListener {
    public final int $r8$classId;
    public final CaptchaController.Request f$0;

    public CaptchaController$$ExternalSyntheticLambda1(CaptchaController.Request request, int i) {
        this.$r8$classId = i;
        this.f$0 = request;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.$r8$classId) {
            case 0:
                CaptchaController.lambda$request$3(this.f$0, exc);
                break;
            default:
                CaptchaController.lambda$request$1(this.f$0, exc);
                break;
        }
    }
}
