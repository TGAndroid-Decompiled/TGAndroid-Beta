package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class q0 implements OnSuccessListener {
    public final int f18743a;
    public final String f18744b;
    public final String f18745c;
    public final CaptchaController.Request d;

    public q0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18743a = i10;
        this.f18744b = str;
        this.f18745c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18743a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18744b, this.f18745c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18744b, this.f18745c, this.d, (String) obj);
                return;
        }
    }
}
