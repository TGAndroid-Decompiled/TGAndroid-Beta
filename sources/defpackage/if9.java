package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
public final class if9 implements ft3, kf9 {
    public final byte a;
    public final xe9 b;

    public if9(xe9 xe9Var, byte b) {
        this.a = b;
        this.b = xe9Var;
    }

    @Override
    public final void a(String str) {
        byte b = this.a;
        xe9 xe9Var = this.b;
        switch (b) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    xe9Var.a(tL_inlineButtonTypeUrl);
                    return;
                }
                return;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    xe9Var.a(tL_inlineButtonTypeCopy);
                    return;
                }
                return;
        }
    }

    @Override
    public final void run(long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        this.b.a(tL_inlineButtonTypeUserProfile);
    }
}
