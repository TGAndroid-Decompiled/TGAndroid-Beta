package kg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class k0 implements Runnable {
    public final int f17978a;
    public final q0 f17979b;

    public k0(q0 q0Var, int i7) {
        this.f17978a = i7;
        this.f17979b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f17978a) {
            case 0:
                q0 q0Var = this.f17979b;
                TL_account.TL_businessBotRights tL_businessBotRights = q0Var.K;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                q0Var.f18061c.f39892g3.O(true);
                q0Var.d0(true);
                return;
            case 1:
                q0 q0Var2 = this.f17979b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var2.K;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                q0Var2.f18061c.f39892g3.O(true);
                q0Var2.d0(true);
                return;
            case 2:
                q0 q0Var3 = this.f17979b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var3.K;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                q0Var3.f18061c.f39892g3.O(true);
                q0Var3.d0(true);
                return;
            case 3:
                q0 q0Var4 = this.f17979b;
                q0Var4.f18061c.f39892g3.O(true);
                q0Var4.d0(true);
                return;
            default:
                q0 q0Var5 = this.f17979b;
                String obj = q0Var5.f18063f.getText().toString();
                String str = q0Var5.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    q0Var5.f18069y = false;
                    if (TextUtils.isEmpty(obj)) {
                        q0Var5.E = null;
                        q0Var5.d.b();
                        q0Var5.f18061c.f39892g3.O(true);
                        return;
                    }
                    jg.z1 z1Var = q0Var5.d;
                    q0Var5.E = obj;
                    int i7 = q0Var5.F;
                    q0Var5.F = i7 + 1;
                    z1Var.h(obj, true, false, true, false, false, 0L, false, 0, i7, 0L, null);
                    return;
                }
                return;
        }
    }
}
