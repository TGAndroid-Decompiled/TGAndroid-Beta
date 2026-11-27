package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class fg2 implements Runnable {
    public final byte a;
    public final mg2 b;

    public fg2(mg2 mg2Var, byte b) {
        this.a = b;
        this.b = mg2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mg2 mg2Var = this.b;
        switch (b) {
            case 0:
                TL_account.TL_businessBotRights tL_businessBotRights = mg2Var.K;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                mg2Var.c.g3.O(true);
                mg2Var.Z(true);
                return;
            case 1:
                TL_account.TL_businessBotRights tL_businessBotRights2 = mg2Var.K;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                mg2Var.c.g3.O(true);
                mg2Var.Z(true);
                return;
            case 2:
                TL_account.TL_businessBotRights tL_businessBotRights3 = mg2Var.K;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                mg2Var.c.g3.O(true);
                mg2Var.Z(true);
                return;
            case 3:
                mg2Var.c.g3.O(true);
                mg2Var.Z(true);
                return;
            default:
                String obj = mg2Var.f.getText().toString();
                String str = mg2Var.E;
                if (str == null || !TextUtils.equals(str, obj)) {
                    mg2Var.y = false;
                    if (TextUtils.isEmpty(obj)) {
                        mg2Var.E = null;
                        mg2Var.d.b();
                        mg2Var.c.g3.O(true);
                        return;
                    }
                    sv9 sv9Var = mg2Var.d;
                    mg2Var.E = obj;
                    int i = mg2Var.F;
                    mg2Var.F = i + 1;
                    sv9Var.h(obj, true, false, true, false, false, 0L, false, 0, i, 0L, null);
                    return;
                }
                return;
        }
    }
}
