package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f17412a;
    public final String f17413b;
    public final String f17414c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f17412a = i10;
        this.f17413b = str;
        this.f17414c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f17412a) {
            case 0:
                CaptchaController.lambda$request$2(this.f17413b, this.f17414c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f17413b, this.f17414c, this.d, (String) obj);
                return;
        }
    }
}
