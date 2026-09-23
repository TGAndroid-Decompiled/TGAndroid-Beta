package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class q0 implements OnSuccessListener {
    public final int f17087a;
    public final String f17088b;
    public final String f17089c;
    public final CaptchaController.Request d;

    public q0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f17087a = i10;
        this.f17088b = str;
        this.f17089c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f17087a) {
            case 0:
                CaptchaController.lambda$request$2(this.f17088b, this.f17089c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f17088b, this.f17089c, this.d, (String) obj);
                return;
        }
    }
}
