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
    public final int f3927a;
    public final f2 f3928b;

    public p1(f2 f2Var, int i7) {
        this.f3927a = i7;
        this.f3928b = f2Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        switch (this.f3927a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f3928b.dismiss();
                return;
            case 1:
                ArrayList arrayList = this.f3928b.f3535i2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                f2 f2Var = this.f3928b;
                TLRPC.UserFull d2 = np.u1(f2Var.f30139a).d2(k10.i(f2Var.f30139a).e());
                if (d2 != null) {
                    tL_birthday = d2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (d2 != null) {
                    d2.flags2 |= 32;
                    d2.birthday = tL_birthday2;
                }
                ConnectionsManager.getInstance(f2Var.f30139a).sendRequest(updatebirthday, new q1(f2Var, d2, tL_birthday, 0), 1024);
                np.u1(f2Var.f30139a).o2();
                np.u1(f2Var.f30139a).s4(0L, "BIRTHDAY_SETUP");
                ls.f(f2Var.f30139a).k(107, new Object[0]);
                f2Var.f3536j2.O(true);
                return;
        }
    }
}
