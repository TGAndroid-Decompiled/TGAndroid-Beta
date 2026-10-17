package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnSuccessListener {
    public final int f19456a;
    public final String f19457b;
    public final String f19458c;
    public final CaptchaController.Request d;

    public s0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19456a = i10;
        this.f19457b = str;
        this.f19458c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19456a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19457b, this.f19458c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19457b, this.f19458c, this.d, (String) obj);
                return;
        }
    }
}
