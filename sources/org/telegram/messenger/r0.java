package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class r0 implements OnSuccessListener {
    public final int f18256a;
    public final String f18257b;
    public final String f18258c;
    public final CaptchaController.Request d;

    public r0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f18256a = i10;
        this.f18257b = str;
        this.f18258c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f18256a) {
            case 0:
                CaptchaController.lambda$request$2(this.f18257b, this.f18258c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f18257b, this.f18258c, this.d, (String) obj);
                return;
        }
    }
}
