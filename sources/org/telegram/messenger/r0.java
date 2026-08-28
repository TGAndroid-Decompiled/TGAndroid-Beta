package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f21359a;
    public final String f21360b;
    public final String f21361c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i9) {
        this.f21359a = i9;
        this.f21360b = str;
        this.f21361c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f21359a) {
            case 0:
                CaptchaController.lambda$request$2(this.f21360b, this.f21361c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f21360b, this.f21361c, this.d, (String) obj);
                return;
        }
    }
}
