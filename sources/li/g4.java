package li;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.iu;
public final class g4 implements iu, i4 {
    public final int f17262a;
    public final u3 f17263b;

    public g4(u3 u3Var, int i10) {
        this.f17262a = i10;
        this.f17263b = u3Var;
    }

    @Override
    public void run(String str) {
        switch (this.f17262a) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                tL_inlineButtonTypeUrl.url = str;
                this.f17263b.a(tL_inlineButtonTypeUrl);
                return;
            default:
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                tL_inlineButtonTypeCopy.copy_text = str;
                this.f17263b.a(tL_inlineButtonTypeCopy);
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        this.f17263b.a(tL_inlineButtonTypeUserProfile);
    }
}
