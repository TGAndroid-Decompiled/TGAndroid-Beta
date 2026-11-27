package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PrivacyControlActivity;
public final class ln8 implements pcc {
    public final byte a;
    public final mn8 b;

    public ln8(mn8 mn8Var, byte b) {
        this.a = b;
        this.b = mn8Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i;
        int i2;
        byte b = this.a;
        mn8 mn8Var = this.b;
        switch (b) {
            case 0:
                PrivacyControlActivity privacyControlActivity = mn8Var.d;
                privacyControlActivity.N = ((Integer) obj).intValue();
                hl.U3(privacyControlActivity.l0, privacyControlActivity.c);
                privacyControlActivity.O0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                PrivacyControlActivity privacyControlActivity2 = mn8Var.d;
                TLRPC.UserFull Y1 = privacyControlActivity2.getMessagesController().Y1(privacyControlActivity2.getUserConfig().e());
                if (Y1 != null) {
                    tL_birthday = Y1.birthday;
                    Y1.flags2 |= 32;
                    Y1.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().g2(Y1, false);
                } else {
                    tL_birthday = null;
                }
                privacyControlActivity2.getMessagesController().j2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new m65(mn8Var, Y1, tL_birthday, (byte) 29), 1024);
                i = ((e) privacyControlActivity2).currentAccount;
                uc7.s1(i).v4(0L, "BIRTHDAY_SETUP");
                i2 = ((e) privacyControlActivity2).currentAccount;
                jn7.f(i2).k(313, new Object[0]);
                privacyControlActivity2.Q0(true);
                return;
        }
    }
}
