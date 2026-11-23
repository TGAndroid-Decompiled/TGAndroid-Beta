package oi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.nt;
public final class e4 implements nt, g4 {
    public final int f22081a;
    public final s3 f22082b;

    public e4(s3 s3Var, int i7) {
        this.f22081a = i7;
        this.f22082b = s3Var;
    }

    @Override
    public void a(String str) {
        switch (this.f22081a) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    this.f22082b.a(tL_inlineButtonTypeUrl);
                    return;
                }
                return;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    this.f22082b.a(tL_inlineButtonTypeCopy);
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        this.f22082b.a(tL_inlineButtonTypeUserProfile);
    }
}
