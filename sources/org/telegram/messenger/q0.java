package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class q0 implements OnSuccessListener {
    public final int f21294a;
    public final String f21295b;
    public final String f21296c;
    public final CaptchaController.Request d;

    public q0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f21294a = i10;
        this.f21295b = str;
        this.f21296c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f21294a) {
            case 0:
                CaptchaController.lambda$request$2(this.f21295b, this.f21296c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f21295b, this.f21296c, this.d, (String) obj);
                return;
        }
    }
}
