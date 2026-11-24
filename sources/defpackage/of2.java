package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class of2 implements Runnable {
    public final byte a;
    public final uf2 b;

    public of2(uf2 uf2Var, byte b) {
        this.a = b;
        this.b = uf2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uf2 uf2Var = this.b;
        switch (b) {
            case 0:
                TL_account.TL_businessBotRights tL_businessBotRights = uf2Var.K;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                uf2Var.c.g3.O(true);
                uf2Var.Z(true);
                return;
            case 1:
                TL_account.TL_businessBotRights tL_businessBotRights2 = uf2Var.K;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                uf2Var.c.g3.O(true);
                uf2Var.Z(true);
                return;
            case 2:
                TL_account.TL_businessBotRights tL_businessBotRights3 = uf2Var.K;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                uf2Var.c.g3.O(true);
                uf2Var.Z(true);
                return;
            case 3:
                uf2Var.c.g3.O(true);
                uf2Var.Z(true);
                return;
            default:
                String obj = uf2Var.f.getText().toString();
                String str = uf2Var.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    uf2Var.y = false;
                    if (TextUtils.isEmpty(obj)) {
                        uf2Var.E = null;
                        uf2Var.d.b();
                        uf2Var.c.g3.O(true);
                        return;
                    }
                    zr9 zr9Var = uf2Var.d;
                    uf2Var.E = obj;
                    int i = uf2Var.F;
                    uf2Var.F = i + 1;
                    zr9Var.h(obj, true, false, true, false, false, 0L, false, 0, i, 0L, null);
                    return;
                }
                return;
        }
    }
}
