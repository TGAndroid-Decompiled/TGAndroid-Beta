package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class s0 implements OnSuccessListener {
    public final int f18828a;
    public final String f18829b;
    public final String f18830c;
    public final CaptchaController.Request d;

    public s0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18828a = i10;
        this.f18829b = str;
        this.f18830c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18828a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18829b, this.f18830c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18829b, this.f18830c, this.d, (String) obj);
                return;
        }
    }
}
