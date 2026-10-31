package bi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.lt;
public final class q4 implements lt, s4 {
    public final int f3296a;
    public final c4 f3297b;

    public q4(c4 c4Var, int i10) {
        this.f3296a = i10;
        this.f3297b = c4Var;
    }

    @Override
    public void a(String str) {
        switch (this.f3296a) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    this.f3297b.a(tL_inlineButtonTypeUrl);
                    return;
                }
                return;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    this.f3297b.a(tL_inlineButtonTypeCopy);
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        this.f3297b.a(tL_inlineButtonTypeUserProfile);
    }
}
