package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f17407a;
    public final String f17408b;
    public final String f17409c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f17407a = i10;
        this.f17408b = str;
        this.f17409c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f17407a) {
            case 0:
                CaptchaController.lambda$request$2(this.f17408b, this.f17409c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f17408b, this.f17409c, this.d, (String) obj);
                return;
        }
    }
}
