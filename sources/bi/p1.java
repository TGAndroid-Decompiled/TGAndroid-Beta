package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p1 implements y10 {
    public final int f3992a;
    public final e2 f3993b;

    public p1(e2 e2Var, int i7) {
        this.f3992a = i7;
        this.f3993b = e2Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        switch (this.f3992a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f3993b.dismiss();
                return;
            case 1:
                ArrayList arrayList = this.f3993b.f3583i2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                e2 e2Var = this.f3993b;
                TLRPC.UserFull d2 = np.u1(e2Var.f30173a).d2(k10.i(e2Var.f30173a).e());
                if (d2 != null) {
                    tL_birthday = d2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday2;
                }
                ConnectionsManager.getInstance(e2Var.f30173a).sendRequest(updatebirthday, new q1(e2Var, d2, tL_birthday, 0), 1024);
                np.u1(e2Var.f30173a).o2();
                np.u1(e2Var.f30173a).s4(0L, "BIRTHDAY_SETUP");
                ls.f(e2Var.f30173a).k(107, new Object[0]);
                e2Var.f3584j2.O(true);
                return;
        }
    }
}
