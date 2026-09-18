package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class q0 implements OnSuccessListener {
    public final int f17105a;
    public final String f17106b;
    public final String f17107c;
    public final CaptchaController.Request d;

    public q0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f17105a = i10;
        this.f17106b = str;
        this.f17107c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f17105a) {
            case 0:
                CaptchaController.lambda$request$2(this.f17106b, this.f17107c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f17106b, this.f17107c, this.d, (String) obj);
                return;
        }
    }
}
