package hg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class o0 implements Runnable {
    public final int f10373a;
    public final v0 f10374b;

    public o0(v0 v0Var, int i10) {
        this.f10373a = i10;
        this.f10374b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f10373a) {
            case 0:
                v0 v0Var = this.f10374b;
                TL_account.TL_businessBotRights tL_businessBotRights = v0Var.J;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                v0Var.f10439c.Y2.N(true);
                v0Var.Y(true);
                return;
            case 1:
                v0 v0Var2 = this.f10374b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = v0Var2.J;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                v0Var2.f10439c.Y2.N(true);
                v0Var2.Y(true);
                return;
            case 2:
                v0 v0Var3 = this.f10374b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = v0Var3.J;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                v0Var3.f10439c.Y2.N(true);
                v0Var3.Y(true);
                return;
            case 3:
                v0 v0Var4 = this.f10374b;
                v0Var4.f10439c.Y2.N(true);
                v0Var4.Y(true);
                return;
            default:
                v0 v0Var5 = this.f10374b;
                String obj = v0Var5.f10440f.getText().toString();
                String str = v0Var5.f10446y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    v0Var5.f10445x = false;
                    if (TextUtils.isEmpty(obj)) {
                        v0Var5.f10446y = null;
                        v0Var5.d.b();
                        v0Var5.f10439c.Y2.N(true);
                        return;
                    }
                    gg.c2 c2Var = v0Var5.d;
                    v0Var5.f10446y = obj;
                    int i10 = v0Var5.E;
                    v0Var5.E = i10 + 1;
                    c2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
