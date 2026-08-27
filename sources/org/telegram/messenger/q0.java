package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;

public final class q0 implements OnSuccessListener {

    public final int f21305a;

    public final String f21306b;

    public final String f21307c;
    public final CaptchaController.Request d;

    public q0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f21305a = i10;
        this.f21306b = str;
        this.f21307c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f21305a) {
            case 0:
                CaptchaController.lambda$request$2(this.f21306b, this.f21307c, this.d, (RecaptchaTasksClient) obj);
                break;
            default:
                CaptchaController.lambda$request$0(this.f21306b, this.f21307c, this.d, (String) obj);
                break;
        }
    }
}
