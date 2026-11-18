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
public final class l1 implements x10 {
    public final int f3832a;
    public final a2 f3833b;

    public l1(a2 a2Var, int i7) {
        this.f3832a = i7;
        this.f3833b = a2Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        switch (this.f3832a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f3833b.dismiss();
                return;
            case 1:
                ArrayList arrayList = this.f3833b.f3387i2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                a2 a2Var = this.f3833b;
                TLRPC.UserFull d2 = mp.u1(a2Var.f30189a).d2(j10.i(a2Var.f30189a).e());
                if (d2 != null) {
                    tL_birthday = d2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday2;
                }
                ConnectionsManager.getInstance(a2Var.f30189a).sendRequest(updatebirthday, new m1(a2Var, d2, tL_birthday, 0), 1024);
                mp.u1(a2Var.f30189a).o2();
                mp.u1(a2Var.f30189a).s4(0L, "BIRTHDAY_SETUP");
                ks.f(a2Var.f30189a).k(107, new Object[0]);
                a2Var.f3388j2.O(true);
                return;
        }
    }
}
