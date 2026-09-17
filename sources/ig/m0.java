package ig;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class m0 implements Runnable {
    public final int f12150a;
    public final u0 f12151b;

    public m0(u0 u0Var, int i10) {
        this.f12150a = i10;
        this.f12151b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f12150a) {
            case 0:
                u0 u0Var = this.f12151b;
                TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                u0Var.f12229c.Y2.N(true);
                u0Var.Y(true);
                return;
            case 1:
                u0 u0Var2 = this.f12151b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var2.J;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                u0Var2.f12229c.Y2.N(true);
                u0Var2.Y(true);
                return;
            case 2:
                u0 u0Var3 = this.f12151b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var3.J;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                u0Var3.f12229c.Y2.N(true);
                u0Var3.Y(true);
                return;
            case 3:
                u0 u0Var4 = this.f12151b;
                u0Var4.f12229c.Y2.N(true);
                u0Var4.Y(true);
                return;
            default:
                u0 u0Var5 = this.f12151b;
                String obj = u0Var5.f12231f.getText().toString();
                String str = u0Var5.f12237y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    u0Var5.f12236x = false;
                    if (TextUtils.isEmpty(obj)) {
                        u0Var5.f12237y = null;
                        u0Var5.d.b();
                        u0Var5.f12229c.Y2.N(true);
                        return;
                    }
                    hg.b2 b2Var = u0Var5.d;
                    u0Var5.f12237y = obj;
                    int i10 = u0Var5.E;
                    u0Var5.E = i10 + 1;
                    b2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
