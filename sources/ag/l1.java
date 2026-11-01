package ag;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class l1 implements Runnable {
    public final int f622a;
    public final t1 f623b;

    public l1(t1 t1Var, int i10) {
        this.f622a = i10;
        this.f623b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f622a) {
            case 0:
                t1 t1Var = this.f623b;
                TL_account.TL_businessBotRights tL_businessBotRights = t1Var.J;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                t1Var.f729c.f31183f3.O(true);
                t1Var.d0(true);
                return;
            case 1:
                t1 t1Var2 = this.f623b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = t1Var2.J;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                t1Var2.f729c.f31183f3.O(true);
                t1Var2.d0(true);
                return;
            case 2:
                t1 t1Var3 = this.f623b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = t1Var3.J;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                t1Var3.f729c.f31183f3.O(true);
                t1Var3.d0(true);
                return;
            case 3:
                t1 t1Var4 = this.f623b;
                t1Var4.f729c.f31183f3.O(true);
                t1Var4.d0(true);
                return;
            default:
                t1 t1Var5 = this.f623b;
                String obj = t1Var5.f730f.getText().toString();
                String str = t1Var5.D;
                if (str == null || !TextUtils.equals(str, obj)) {
                    t1Var5.f736y = false;
                    if (TextUtils.isEmpty(obj)) {
                        t1Var5.D = null;
                        t1Var5.d.b();
                        t1Var5.f729c.f31183f3.O(true);
                        return;
                    }
                    zf.m1 m1Var = t1Var5.d;
                    t1Var5.D = obj;
                    int i10 = t1Var5.E;
                    t1Var5.E = i10 + 1;
                    m1Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
