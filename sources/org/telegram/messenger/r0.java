package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f17416a;
    public final String f17417b;
    public final String f17418c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f17416a = i10;
        this.f17417b = str;
        this.f17418c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f17416a) {
            case 0:
                CaptchaController.lambda$request$2(this.f17417b, this.f17418c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f17417b, this.f17418c, this.d, (String) obj);
                return;
        }
    }
}
