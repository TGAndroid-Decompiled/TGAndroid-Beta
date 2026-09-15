package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class q0 implements OnSuccessListener {
    public final int f17096a;
    public final String f17097b;
    public final String f17098c;
    public final CaptchaController.Request d;

    public q0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f17096a = i10;
        this.f17097b = str;
        this.f17098c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f17096a) {
            case 0:
                CaptchaController.lambda$request$2(this.f17097b, this.f17098c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f17097b, this.f17098c, this.d, (String) obj);
                return;
        }
    }
}
