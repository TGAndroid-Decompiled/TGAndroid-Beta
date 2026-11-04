package lg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class l0 implements Runnable {
    public final int f18353a;
    public final r0 f18354b;

    public l0(r0 r0Var, int i3) {
        this.f18353a = i3;
        this.f18354b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f18353a) {
            case 0:
                r0 r0Var = this.f18354b;
                TL_account.TL_businessBotRights tL_businessBotRights = r0Var.K;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
                return;
            case 1:
                r0 r0Var2 = this.f18354b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = r0Var2.K;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                r0Var2.f18440c.f35594g3.O(true);
                r0Var2.d0(true);
                return;
            case 2:
                r0 r0Var3 = this.f18354b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = r0Var3.K;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                r0Var3.f18440c.f35594g3.O(true);
                r0Var3.d0(true);
                return;
            case 3:
                r0 r0Var4 = this.f18354b;
                r0Var4.f18440c.f35594g3.O(true);
                r0Var4.d0(true);
                return;
            default:
                r0 r0Var5 = this.f18354b;
                String obj = r0Var5.f18442f.getText().toString();
                String str = r0Var5.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    r0Var5.f18448y = false;
                    if (TextUtils.isEmpty(obj)) {
                        r0Var5.E = null;
                        r0Var5.d.b();
                        r0Var5.f18440c.f35594g3.O(true);
                        return;
                    }
                    kg.v1 v1Var = r0Var5.d;
                    r0Var5.E = obj;
                    int i3 = r0Var5.F;
                    r0Var5.F = i3 + 1;
                    v1Var.h(obj, true, false, true, false, false, 0L, false, 0, i3, 0L, null);
                    return;
                }
                return;
        }
    }
}
