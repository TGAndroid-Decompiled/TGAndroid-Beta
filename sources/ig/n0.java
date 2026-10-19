package ig;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class n0 implements Runnable {
    public final int f12973a;
    public final t0 f12974b;

    public n0(t0 t0Var, int i10) {
        this.f12973a = i10;
        this.f12974b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f12973a) {
            case 0:
                t0 t0Var = this.f12974b;
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.J;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                t0Var.f13032c.W2.N(true);
                t0Var.Y(true);
                return;
            case 1:
                t0 t0Var2 = this.f12974b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var2.J;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                t0Var2.f13032c.W2.N(true);
                t0Var2.Y(true);
                return;
            case 2:
                t0 t0Var3 = this.f12974b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var3.J;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                t0Var3.f13032c.W2.N(true);
                t0Var3.Y(true);
                return;
            case 3:
                t0 t0Var4 = this.f12974b;
                t0Var4.f13032c.W2.N(true);
                t0Var4.Y(true);
                return;
            default:
                t0 t0Var5 = this.f12974b;
                String obj = t0Var5.f13033f.getText().toString();
                String str = t0Var5.f13039y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    t0Var5.f13038x = false;
                    if (TextUtils.isEmpty(obj)) {
                        t0Var5.f13039y = null;
                        t0Var5.d.b();
                        t0Var5.f13032c.W2.N(true);
                        return;
                    }
                    hg.a2 a2Var = t0Var5.d;
                    t0Var5.f13039y = obj;
                    int i10 = t0Var5.E;
                    t0Var5.E = i10 + 1;
                    a2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
