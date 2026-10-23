package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnSuccessListener {
    public final int f19567a;
    public final String f19568b;
    public final String f19569c;
    public final CaptchaController.Request d;

    public t0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19567a = i10;
        this.f19568b = str;
        this.f19569c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19567a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19568b, this.f19569c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19568b, this.f19569c, this.d, (String) obj);
                return;
        }
    }
}
