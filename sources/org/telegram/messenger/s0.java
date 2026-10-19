package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnSuccessListener {
    public final int f19467a;
    public final String f19468b;
    public final String f19469c;
    public final CaptchaController.Request d;

    public s0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19467a = i10;
        this.f19468b = str;
        this.f19469c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19467a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19468b, this.f19469c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19468b, this.f19469c, this.d, (String) obj);
                return;
        }
    }
}
