package ji;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.mu;
public final class i4 implements mu, k4 {
    public final int f13332a;
    public final w3 f13333b;

    public i4(w3 w3Var, int i10) {
        this.f13332a = i10;
        this.f13333b = w3Var;
    }

    @Override
    public void run(String str) {
        switch (this.f13332a) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                tL_inlineButtonTypeUrl.url = str;
                this.f13333b.a(tL_inlineButtonTypeUrl);
                return;
            default:
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                tL_inlineButtonTypeCopy.copy_text = str;
                this.f13333b.a(tL_inlineButtonTypeCopy);
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        this.f13333b.a(tL_inlineButtonTypeUserProfile);
    }
}
