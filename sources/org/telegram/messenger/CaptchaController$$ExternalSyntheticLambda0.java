package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;

public final class CaptchaController$$ExternalSyntheticLambda0 implements OnSuccessListener {
    public final int $r8$classId;
    public final String f$0;
    public final String f$1;
    public final CaptchaController.Request f$2;

    public CaptchaController$$ExternalSyntheticLambda0(String str, String str2, CaptchaController.Request request, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CaptchaController.lambda$request$2(this.f$0, this.f$1, this.f$2, (RecaptchaTasksClient) obj);
                break;
            default:
                CaptchaController.lambda$request$0(this.f$0, this.f$1, this.f$2, (String) obj);
                break;
        }
    }
}
