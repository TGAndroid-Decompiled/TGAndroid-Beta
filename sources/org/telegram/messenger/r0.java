package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f19017a;
    public final String f19018b;
    public final String f19019c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19017a = i10;
        this.f19018b = str;
        this.f19019c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19017a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19018b, this.f19019c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19018b, this.f19019c, this.d, (String) obj);
                return;
        }
    }
}
