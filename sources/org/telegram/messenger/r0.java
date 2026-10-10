package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f18994a;
    public final String f18995b;
    public final String f18996c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18994a = i10;
        this.f18995b = str;
        this.f18996c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18994a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18995b, this.f18996c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18995b, this.f18996c, this.d, (String) obj);
                return;
        }
    }
}
