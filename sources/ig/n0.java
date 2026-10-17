package ig;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class n0 implements Runnable {
    public final int f12971a;
    public final r0 f12972b;

    public n0(r0 r0Var, int i10) {
        this.f12971a = i10;
        this.f12972b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f12971a) {
            case 0:
                r0 r0Var = this.f12972b;
                TL_account.TL_businessBotRights tL_businessBotRights = r0Var.J;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                r0Var.f13012c.W2.N(true);
                r0Var.Y(true);
                return;
            case 1:
                r0 r0Var2 = this.f12972b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = r0Var2.J;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                r0Var2.f13012c.W2.N(true);
                r0Var2.Y(true);
                return;
            case 2:
                r0 r0Var3 = this.f12972b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = r0Var3.J;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                r0Var3.f13012c.W2.N(true);
                r0Var3.Y(true);
                return;
            case 3:
                r0 r0Var4 = this.f12972b;
                r0Var4.f13012c.W2.N(true);
                r0Var4.Y(true);
                return;
            default:
                r0 r0Var5 = this.f12972b;
                String obj = r0Var5.f13013f.getText().toString();
                String str = r0Var5.f13019y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    r0Var5.f13018x = false;
                    if (TextUtils.isEmpty(obj)) {
                        r0Var5.f13019y = null;
                        r0Var5.d.b();
                        r0Var5.f13012c.W2.N(true);
                        return;
                    }
                    hg.a2 a2Var = r0Var5.d;
                    r0Var5.f13019y = obj;
                    int i10 = r0Var5.E;
                    r0Var5.E = i10 + 1;
                    a2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
