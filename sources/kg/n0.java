package kg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class n0 implements Runnable {
    public final int f18397a;
    public final t0 f18398b;

    public n0(t0 t0Var, int i7) {
        this.f18397a = i7;
        this.f18398b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f18397a) {
            case 0:
                t0 t0Var = this.f18398b;
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.K;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                t0Var.f18479c.f34607g3.O(true);
                t0Var.d0(true);
                return;
            case 1:
                t0 t0Var2 = this.f18398b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var2.K;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                t0Var2.f18479c.f34607g3.O(true);
                t0Var2.d0(true);
                return;
            case 2:
                t0 t0Var3 = this.f18398b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var3.K;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                t0Var3.f18479c.f34607g3.O(true);
                t0Var3.d0(true);
                return;
            case 3:
                t0 t0Var4 = this.f18398b;
                t0Var4.f18479c.f34607g3.O(true);
                t0Var4.d0(true);
                return;
            default:
                t0 t0Var5 = this.f18398b;
                String obj = t0Var5.f18481f.getText().toString();
                String str = t0Var5.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    t0Var5.f18487y = false;
                    if (TextUtils.isEmpty(obj)) {
                        t0Var5.E = null;
                        t0Var5.d.b();
                        t0Var5.f18479c.f34607g3.O(true);
                        return;
                    }
                    jg.z1 z1Var = t0Var5.d;
                    t0Var5.E = obj;
                    int i7 = t0Var5.F;
                    t0Var5.F = i7 + 1;
                    z1Var.h(obj, true, false, true, false, false, 0L, false, 0, i7, 0L, null);
                    return;
                }
                return;
        }
    }
}
