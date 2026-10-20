package org.telegram.messenger;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.recaptcha.RecaptchaTasksClient;
import org.telegram.messenger.CaptchaController;
public final class t0 implements OnSuccessListener {
    public final int f19559a;
    public final String f19560b;
    public final String f19561c;
    public final CaptchaController.Request d;

    public t0(String str, String str2, CaptchaController.Request request, int i10) {
        this.f19559a = i10;
        this.f19560b = str;
        this.f19561c = str2;
        this.d = request;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f19559a) {
            case 0:
                CaptchaController.lambda$request$2(this.f19560b, this.f19561c, this.d, (RecaptchaTasksClient) obj);
                return;
            default:
                CaptchaController.lambda$request$0(this.f19560b, this.f19561c, this.d, (String) obj);
                return;
        }
    }
}
