package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;
public final class am8 implements qac {
    public final byte a;
    public final bm8 b;

    public am8(bm8 bm8Var, byte b) {
        this.a = b;
        this.b = bm8Var;
    }

    @Override
    public final void a(Object obj) {
        TL_account.TL_birthday tL_birthday;
        int i;
        int i2;
        byte b = this.a;
        bm8 bm8Var = this.b;
        switch (b) {
            case 0:
                PrivacyControlActivity privacyControlActivity = bm8Var.d;
                privacyControlActivity.N = ((Integer) obj).intValue();
                gm.U3(privacyControlActivity.l0, privacyControlActivity.c);
                privacyControlActivity.O0();
                return;
            default:
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
                PrivacyControlActivity privacyControlActivity2 = bm8Var.d;
                TLRPC.UserFull X1 = privacyControlActivity2.getMessagesController().X1(privacyControlActivity2.getUserConfig().e());
                if (X1 != null) {
                    tL_birthday = X1.birthday;
                    X1.flags2 |= 32;
                    X1.birthday = tL_birthday2;
                    privacyControlActivity2.getMessagesStorage().g2(X1, false);
                } else {
                    tL_birthday = null;
                }
                privacyControlActivity2.getMessagesController().i2();
                privacyControlActivity2.getConnectionsManager().sendRequest(updatebirthday, new i65(bm8Var, X1, tL_birthday, (byte) 29), 1024);
                i = ((d) privacyControlActivity2).currentAccount;
                oc7.r1(i).p4(0L, "BIRTHDAY_SETUP");
                i2 = ((d) privacyControlActivity2).currentAccount;
                nm7.f(i2).k(314, new Object[0]);
                privacyControlActivity2.Q0(true);
                return;
        }
    }
}
