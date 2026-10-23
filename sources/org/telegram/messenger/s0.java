package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnSuccessListener {
    public final int f19546a;
    public final String f19547b;
    public final String f19548c;
    public final CaptchaController.Request d;

    public s0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19546a = i10;
        this.f19547b = str;
        this.f19548c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19546a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19547b, this.f19548c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19547b, this.f19548c, this.d, (String) obj);
                return;
        }
    }
}
