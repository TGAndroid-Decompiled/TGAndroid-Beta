package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f19820a;
    public final String f19821b;
    public final String f19822c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19820a = i10;
        this.f19821b = str;
        this.f19822c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19820a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19821b, this.f19822c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19821b, this.f19822c, this.d, (String) obj);
                return;
        }
    }
}
