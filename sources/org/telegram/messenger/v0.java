package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class v0 implements OnSuccessListener {
    public final int f21469a;
    public final String f21470b;
    public final String f21471c;
    public final CaptchaController.Request d;

    public v0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f21469a = i10;
        this.f21470b = str;
        this.f21471c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f21469a) {
            case 0:
                CaptchaController.lambda$request$2(this.f21470b, this.f21471c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f21470b, this.f21471c, this.d, (String) obj);
                return;
        }
    }
}
