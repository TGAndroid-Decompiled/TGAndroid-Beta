package hg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class n0 implements Runnable {
    public final int f11327a;
    public final u0 f11328b;

    public n0(u0 u0Var, int i10) {
        this.f11327a = i10;
        this.f11328b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f11327a) {
            case 0:
                u0 u0Var = this.f11328b;
                TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                u0Var.f11401c.W2.N(true);
                u0Var.Y(true);
                return;
            case 1:
                u0 u0Var2 = this.f11328b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var2.J;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                u0Var2.f11401c.W2.N(true);
                u0Var2.Y(true);
                return;
            case 2:
                u0 u0Var3 = this.f11328b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var3.J;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                u0Var3.f11401c.W2.N(true);
                u0Var3.Y(true);
                return;
            case 3:
                u0 u0Var4 = this.f11328b;
                u0Var4.f11401c.W2.N(true);
                u0Var4.Y(true);
                return;
            default:
                u0 u0Var5 = this.f11328b;
                String obj = u0Var5.f11403f.getText().toString();
                String str = u0Var5.f11409y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    u0Var5.f11408x = false;
                    if (TextUtils.isEmpty(obj)) {
                        u0Var5.f11409y = null;
                        u0Var5.d.b();
                        u0Var5.f11401c.W2.N(true);
                        return;
                    }
                    gg.b2 b2Var = u0Var5.d;
                    u0Var5.f11409y = obj;
                    int i10 = u0Var5.E;
                    u0Var5.E = i10 + 1;
                    b2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
