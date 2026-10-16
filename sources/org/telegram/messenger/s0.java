package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnSuccessListener {
    public final int f18049a;
    public final String f18050b;
    public final String f18051c;
    public final CaptchaController.Request d;

    public s0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18049a = i10;
        this.f18050b = str;
        this.f18051c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18049a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18050b, this.f18051c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18050b, this.f18051c, this.d, (String) obj);
                return;
        }
    }
}
