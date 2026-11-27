package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rw4 implements pcc {
    public final byte a;
    public final bx4 b;

    public rw4(bx4 bx4Var, byte b) {
        this.a = b;
        this.b = bx4Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        byte b = this.a;
        bx4 bx4Var = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                bx4Var.dismiss();
                return;
            case 1:
                ArrayList arrayList = bx4Var.h2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                TLRPC.UserFull Y1 = uc7.s1(bx4Var.a).Y1(yac.h(bx4Var.a).e());
                if (Y1 != null) {
                    tL_birthday = Y1.birthday;
                    Y1.flags2 |= 32;
                    Y1.birthday = tL_birthday2;
                } else {
                    tL_birthday = null;
                }
                ConnectionsManager.getInstance(bx4Var.a).sendRequest(updatebirthday, new fn0(bx4Var, Y1, tL_birthday, (byte) 27), 1024);
                uc7.s1(bx4Var.a).j2();
                uc7.s1(bx4Var.a).v4(0L, "BIRTHDAY_SETUP");
                jn7.f(bx4Var.a).k(108, new Object[0]);
                bx4Var.i2.O(true);
                return;
        }
    }
}
