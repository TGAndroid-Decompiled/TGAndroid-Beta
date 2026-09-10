package gg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class r0 implements Runnable {
    public final int f9025a;
    public final y0 f9026b;

    public r0(y0 y0Var, int i10) {
        this.f9025a = i10;
        this.f9026b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f9025a) {
            case 0:
                y0 y0Var = this.f9026b;
                TL_account.TL_businessBotRights tL_businessBotRights = y0Var.J;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
                return;
            case 1:
                y0 y0Var2 = this.f9026b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = y0Var2.J;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                y0Var2.f9092c.Y2.N(true);
                y0Var2.Y(true);
                return;
            case 2:
                y0 y0Var3 = this.f9026b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = y0Var3.J;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                y0Var3.f9092c.Y2.N(true);
                y0Var3.Y(true);
                return;
            case 3:
                y0 y0Var4 = this.f9026b;
                y0Var4.f9092c.Y2.N(true);
                y0Var4.Y(true);
                return;
            default:
                y0 y0Var5 = this.f9026b;
                String obj = y0Var5.f9093f.getText().toString();
                String str = y0Var5.f9099y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    y0Var5.f9098x = false;
                    if (TextUtils.isEmpty(obj)) {
                        y0Var5.f9099y = null;
                        y0Var5.d.b();
                        y0Var5.f9092c.Y2.N(true);
                        return;
                    }
                    fg.d2 d2Var = y0Var5.d;
                    y0Var5.f9099y = obj;
                    int i10 = y0Var5.E;
                    y0Var5.E = i10 + 1;
                    d2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
