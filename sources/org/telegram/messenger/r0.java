package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f17418a;
    public final String f17419b;
    public final String f17420c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f17418a = i10;
        this.f17419b = str;
        this.f17420c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f17418a) {
            case 0:
                CaptchaController.lambda$request$2(this.f17419b, this.f17420c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f17419b, this.f17420c, this.d, (String) obj);
                return;
        }
    }
}
