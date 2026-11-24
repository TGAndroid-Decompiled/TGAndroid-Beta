package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;
public final class xj8 implements p8c {
    public final byte a;
    public final yj8 b;

    public xj8(yj8 yj8Var, byte b) {
        this.a = b;
        this.b = yj8Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i;
        int i2;
        byte b = this.a;
        yj8 yj8Var = this.b;
        switch (b) {
            case 0:
                PrivacyControlActivity privacyControlActivity = yj8Var.d;
                privacyControlActivity.N = ((Integer) obj).intValue();
                gl.V3(privacyControlActivity.l0, privacyControlActivity.c);
                privacyControlActivity.N0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                PrivacyControlActivity privacyControlActivity2 = yj8Var.d;
                TLRPC.UserFull W1 = privacyControlActivity2.getMessagesController().W1(privacyControlActivity2.getUserConfig().e());
                if (W1 != null) {
                    tL_birthday = W1.birthday;
                    W1.flags2 |= 32;
                    W1.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().g2(W1, false);
                } else {
                    tL_birthday = null;
                }
                privacyControlActivity2.getMessagesController().h2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new k45(yj8Var, W1, tL_birthday, (byte) 29), 1024);
                i = ((d) privacyControlActivity2).currentAccount;
                na7.q1(i).m4(0L, "BIRTHDAY_SETUP");
                i2 = ((d) privacyControlActivity2).currentAccount;
                kk7.f(i2).k(312, new Object[0]);
                privacyControlActivity2.P0(true);
                return;
        }
    }
}
