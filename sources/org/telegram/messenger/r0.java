package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f19033a;
    public final String f19034b;
    public final String f19035c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19033a = i10;
        this.f19034b = str;
        this.f19035c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19033a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19034b, this.f19035c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19034b, this.f19035c, this.d, (String) obj);
                return;
        }
    }
}
