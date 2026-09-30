package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f17417a;
    public final String f17418b;
    public final String f17419c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f17417a = i10;
        this.f17418b = str;
        this.f17419c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f17417a) {
            case 0:
                CaptchaController.lambda$request$2(this.f17418b, this.f17419c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f17418b, this.f17419c, this.d, (String) obj);
                return;
        }
    }
}
