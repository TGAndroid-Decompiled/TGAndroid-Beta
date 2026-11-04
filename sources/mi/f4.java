package mi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ws;
public final class f4 implements ws, h4 {
    public final int f19601a;
    public final s3 f19602b;

    public f4(s3 s3Var, int i3) {
        this.f19601a = i3;
        this.f19602b = s3Var;
    }

    @Override
    public void a(String str) {
        switch (this.f19601a) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    this.f19602b.a(tL_inlineButtonTypeUrl);
                    return;
                }
                return;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    this.f19602b.a(tL_inlineButtonTypeCopy);
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        this.f19602b.a(tL_inlineButtonTypeUserProfile);
    }
}
