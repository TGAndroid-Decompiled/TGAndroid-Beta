package ii;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.du;
public final class h4 implements du, j4 {
    public final int f12415a;
    public final w3 f12416b;

    public h4(w3 w3Var, int i10) {
        this.f12415a = i10;
        this.f12416b = w3Var;
    }

    @Override
    public void run(String str) {
        switch (this.f12415a) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                tL_inlineButtonTypeUrl.url = str;
                this.f12416b.a(tL_inlineButtonTypeUrl);
                return;
            default:
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                tL_inlineButtonTypeCopy.copy_text = str;
                this.f12416b.a(tL_inlineButtonTypeCopy);
                return;
        }
    }

    @Override
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        this.f12416b.a(tL_inlineButtonTypeUserProfile);
    }
}
