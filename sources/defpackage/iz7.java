package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PasskeysActivity;
public final class iz7 implements icc {
    public final byte a;
    public final PasskeysActivity b;

    public iz7(PasskeysActivity passkeysActivity, byte b) {
        this.a = b;
        this.b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = ob6.M0(2131747356, null);
                b8c b8cVar = new b8c(2);
                b8cVar.m = M0;
                b8cVar.k = 2131624114;
                arrayList.add(b8cVar);
                for (int i = 0; i < arrayList2.size(); i++) {
                    am7 am7Var = new am7(passkeysActivity, (byte) 7);
                    int i2 = kz7.b;
                    b8c K = b8c.K(kz7.class);
                    K.H = (TL_account.Passkey) arrayList2.get(i);
                    K.E = am7Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().l4.F.f()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    b8c c = b8c.c(-1, 2131231849, ob6.M0(2131747377, null));
                    c.r = true;
                    arrayList.add(c);
                }
                arrayList.add(b8c.C(hl.D2(hl.N2(ob6.M0(2131747362, null), -1, 0, new ge7(passkeysActivity, (byte) 21), null), true)));
                return;
            default:
                passkeysActivity.a0((TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
