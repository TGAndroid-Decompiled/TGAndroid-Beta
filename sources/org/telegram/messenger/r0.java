package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f18997a;
    public final String f18998b;
    public final String f18999c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18997a = i10;
        this.f18998b = str;
        this.f18999c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18997a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18998b, this.f18999c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18998b, this.f18999c, this.d, (String) obj);
                return;
        }
    }
}
