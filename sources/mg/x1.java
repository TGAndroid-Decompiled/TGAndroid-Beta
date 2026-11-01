package mg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x1 implements r20 {
    public final int f13288a;
    public final i2 f13289b;

    public x1(i2 i2Var, int i10) {
        this.f13288a = i10;
        this.f13289b = i2Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        switch (this.f13288a) {
            case 0:
                i2 i2Var = this.f13289b;
                ArrayList arrayList = i2Var.f13147j2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                g2 g2Var = i2Var.Q1;
                if (g2Var.Q) {
                    g2Var.setLoading(false);
                    if (i2Var.f26724k1.G) {
                        i2Var.k1();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f13289b.dismiss();
                return;
            case 2:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                i2 i2Var2 = this.f13289b;
                TLRPC.UserFull a2 = wp.r1(i2Var2.f21584a).a2(e20.i(i2Var2.f21584a).e());
                if (a2 != null) {
                    tL_birthday = a2.birthday;
                } else {
                    tL_birthday = null;
                }
                if (a2 != null) {
                    a2.flags2 |= 32;
                    a2.birthday = tL_birthday2;
                }
                ConnectionsManager.getInstance(i2Var2.f21584a).sendRequest(updatebirthday, new ag.p0(i2Var2, a2, tL_birthday, 7), 1024);
                wp.r1(i2Var2.f21584a).l2();
                wp.r1(i2Var2.f21584a).h4(0L, "BIRTHDAY_SETUP");
                at.f(i2Var2.f21584a).k(107, new Object[0]);
                i2Var2.o1(true, true);
                return;
            default:
                i2 i2Var3 = this.f13289b;
                i2Var3.f13144g2 = (String) obj;
                c2 c2Var = i2Var3.f13152o2;
                org.telegram.messenger.i0.r(c2Var);
                org.telegram.messenger.i0.h3(c2Var, 350L);
                return;
        }
    }
}
