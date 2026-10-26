package jg;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class m0 implements Runnable {
    public final int f15777a;
    public final t0 f15778b;

    public m0(t0 t0Var, int i10) {
        this.f15777a = i10;
        this.f15778b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f15777a) {
            case 0:
                t0 t0Var = this.f15778b;
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.J;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                t0Var.f15849c.f32152g3.O(true);
                t0Var.Z(true);
                return;
            case 1:
                t0 t0Var2 = this.f15778b;
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var2.J;
                tL_businessBotRights2.transfer_stars = true;
                tL_businessBotRights2.transfer_and_upgrade_gifts = true;
                tL_businessBotRights2.change_gift_settings = true;
                tL_businessBotRights2.sell_gifts = true;
                tL_businessBotRights2.view_gifts = true;
                t0Var2.f15849c.f32152g3.O(true);
                t0Var2.Z(true);
                return;
            case 2:
                t0 t0Var3 = this.f15778b;
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var3.J;
                tL_businessBotRights3.edit_username = true;
                tL_businessBotRights3.edit_profile_photo = true;
                tL_businessBotRights3.edit_bio = true;
                tL_businessBotRights3.edit_name = true;
                t0Var3.f15849c.f32152g3.O(true);
                t0Var3.Z(true);
                return;
            case 3:
                t0 t0Var4 = this.f15778b;
                t0Var4.f15849c.f32152g3.O(true);
                t0Var4.Z(true);
                return;
            default:
                t0 t0Var5 = this.f15778b;
                String obj = t0Var5.f15850f.getText().toString();
                String str = t0Var5.f15856y;
                if (str == null || !TextUtils.equals(str, obj)) {
                    t0Var5.f15855x = false;
                    if (TextUtils.isEmpty(obj)) {
                        t0Var5.f15856y = null;
                        t0Var5.d.b();
                        t0Var5.f15849c.f32152g3.O(true);
                        return;
                    }
                    ig.a2 a2Var = t0Var5.d;
                    t0Var5.f15856y = obj;
                    int i10 = t0Var5.E;
                    t0Var5.E = i10 + 1;
                    a2Var.h(obj, true, false, true, false, false, 0L, false, 0, i10, 0L, null);
                    return;
                }
                return;
        }
    }
}
