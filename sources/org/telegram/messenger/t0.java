package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnSuccessListener {
    public final int f19557a;
    public final String f19558b;
    public final String f19559c;
    public final CaptchaController.Request d;

    public t0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19557a = i10;
        this.f19558b = str;
        this.f19559c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19557a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19558b, this.f19559c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19558b, this.f19559c, this.d, (String) obj);
                return;
        }
    }
}
