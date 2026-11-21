package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p1 implements x10 {
    public final int f3987a;
    public final e2 f3988b;

    public p1(e2 e2Var, int i7) {
        this.f3987a = i7;
        this.f3988b = e2Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        switch (this.f3987a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f3988b.dismiss();
                return;
            case 1:
                ArrayList arrayList = this.f3988b.f3565i2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                e2 e2Var = this.f3988b;
                TLRPC.UserFull d2 = mp.u1(e2Var.f30170a).d2(j10.i(e2Var.f30170a).e());
                if (d2 != null) {
                    tL_birthday = d2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday2;
                }
                ConnectionsManager.getInstance(e2Var.f30170a).sendRequest(updatebirthday, new q1(e2Var, d2, tL_birthday, 0), 1024);
                mp.u1(e2Var.f30170a).o2();
                mp.u1(e2Var.f30170a).s4(0L, "BIRTHDAY_SETUP");
                ks.f(e2Var.f30170a).k(107, new Object[0]);
                e2Var.f3566j2.O(true);
                return;
        }
    }
}
