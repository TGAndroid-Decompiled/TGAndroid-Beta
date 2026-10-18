package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnSuccessListener {
    public final int f19464a;
    public final String f19465b;
    public final String f19466c;
    public final CaptchaController.Request d;

    public s0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19464a = i10;
        this.f19465b = str;
        this.f19466c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19464a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19465b, this.f19466c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19465b, this.f19466c, this.d, (String) obj);
                return;
        }
    }
}
