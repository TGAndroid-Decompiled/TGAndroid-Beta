package ig;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class m0 implements Runnable {
    public final int f12998a;
    public final s0 f12999b;

    public m0(s0 s0Var, int i10) {
        this.f12998a = i10;
        this.f12999b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f12998a) {
            case 0:
                s0 s0Var = this.f12999b;
                TL_account.TL_businessBotRights tL_businessBotRights = s0Var.L;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
                return;
            case 1:
                s0 s0Var2 = this.f12999b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var2.L;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                s0Var2.e.Z2.N(true);
                s0Var2.Y(true);
                return;
            case 2:
                s0 s0Var3 = this.f12999b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var3.L;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                s0Var3.e.Z2.N(true);
                s0Var3.Y(true);
                return;
            case 3:
                s0 s0Var4 = this.f12999b;
                s0Var4.e.Z2.N(true);
                s0Var4.Y(true);
                return;
            default:
                s0 s0Var5 = this.f12999b;
                String obj = s0Var5.f13060n.getText().toString();
                String str = s0Var5.F;
                if (str == null || !TextUtils.equals(str, obj)) {
                    s0Var5.E = false;
                    if (TextUtils.isEmpty(obj)) {
                        s0Var5.F = null;
                        s0Var5.f13059f.b();
                        s0Var5.e.Z2.N(true);
                        return;
                    }
                    hg.a2 a2Var = s0Var5.f13059f;
                    s0Var5.F = obj;
                    int i10 = s0Var5.G;
                    s0Var5.G = i10 + 1;
                    a2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
