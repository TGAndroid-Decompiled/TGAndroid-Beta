package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f18230a;
    public final String f18231b;
    public final String f18232c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18230a = i10;
        this.f18231b = str;
        this.f18232c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18230a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18231b, this.f18232c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18231b, this.f18232c, this.d, (String) obj);
                return;
        }
    }
}
