package kg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class m0 implements Runnable {
    public final int f18411a;
    public final s0 f18412b;

    public m0(s0 s0Var, int i7) {
        this.f18411a = i7;
        this.f18412b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f18411a) {
            case 0:
                s0 s0Var = this.f18412b;
                TL_account.TL_businessBotRights tL_businessBotRights = s0Var.K;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                s0Var.f18496c.f35796g3.O(true);
                s0Var.d0(true);
                return;
            case 1:
                s0 s0Var2 = this.f18412b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var2.K;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                s0Var2.f18496c.f35796g3.O(true);
                s0Var2.d0(true);
                return;
            case 2:
                s0 s0Var3 = this.f18412b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var3.K;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                s0Var3.f18496c.f35796g3.O(true);
                s0Var3.d0(true);
                return;
            case 3:
                s0 s0Var4 = this.f18412b;
                s0Var4.f18496c.f35796g3.O(true);
                s0Var4.d0(true);
                return;
            default:
                s0 s0Var5 = this.f18412b;
                String obj = s0Var5.f18498f.getText().toString();
                String str = s0Var5.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    s0Var5.f18504y = false;
                    if (TextUtils.isEmpty(obj)) {
                        s0Var5.E = null;
                        s0Var5.d.b();
                        s0Var5.f18496c.f35796g3.O(true);
                        return;
                    }
                    jg.z1 z1Var = s0Var5.d;
                    s0Var5.E = obj;
                    int i7 = s0Var5.F;
                    s0Var5.F = i7 + 1;
                    z1Var.h(obj, true, false, true, false, false, 0L, false, 0, i7, 0L, null);
                    return;
                }
                return;
        }
    }
}
