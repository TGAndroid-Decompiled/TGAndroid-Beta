package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class ah2 implements Runnable {
    public final byte a;
    public final hh2 b;

    public ah2(hh2 hh2Var, byte b) {
        this.a = b;
        this.b = hh2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hh2 hh2Var = this.b;
        switch (b) {
            case 0:
                TL_account.TL_businessBotRights tL_businessBotRights = hh2Var.K;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                hh2Var.c.g3.O(true);
                hh2Var.a0(true);
                return;
            case 1:
                TL_account.TL_businessBotRights tL_businessBotRights2 = hh2Var.K;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                hh2Var.c.g3.O(true);
                hh2Var.a0(true);
                return;
            case 2:
                TL_account.TL_businessBotRights tL_businessBotRights3 = hh2Var.K;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                hh2Var.c.g3.O(true);
                hh2Var.a0(true);
                return;
            case 3:
                hh2Var.c.g3.O(true);
                hh2Var.a0(true);
                return;
            default:
                String obj = hh2Var.f.getText().toString();
                String str = hh2Var.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    hh2Var.y = false;
                    if (TextUtils.isEmpty(obj)) {
                        hh2Var.E = null;
                        hh2Var.d.b();
                        hh2Var.c.g3.O(true);
                        return;
                    }
                    bu9 bu9Var = hh2Var.d;
                    hh2Var.E = obj;
                    int i = hh2Var.F;
                    hh2Var.F = i + 1;
                    bu9Var.h(obj, true, false, true, false, false, 0L, false, 0, i, 0L, null);
                    return;
                }
                return;
        }
    }
}
