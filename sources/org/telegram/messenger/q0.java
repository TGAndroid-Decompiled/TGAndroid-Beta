package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class q0 implements OnSuccessListener {
    public final int f18770a;
    public final String f18771b;
    public final String f18772c;
    public final CaptchaController.Request d;

    public q0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18770a = i10;
        this.f18771b = str;
        this.f18772c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18770a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18771b, this.f18772c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18771b, this.f18772c, this.d, (String) obj);
                return;
        }
    }
}
