package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f16181a;
    public final String f16182b;
    public final String f16183c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f16181a = i10;
        this.f16182b = str;
        this.f16183c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f16181a) {
            case 0:
                CaptchaController.lambda$request$2(this.f16182b, this.f16183c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f16182b, this.f16183c, this.d, (String) obj);
                return;
        }
    }
}
