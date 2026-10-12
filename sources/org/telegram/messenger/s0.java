package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnSuccessListener {
    public final int f18343a;
    public final String f18344b;
    public final String f18345c;
    public final CaptchaController.Request d;

    public s0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18343a = i10;
        this.f18344b = str;
        this.f18345c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18343a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18344b, this.f18345c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18344b, this.f18345c, this.d, (String) obj);
                return;
        }
    }
}
