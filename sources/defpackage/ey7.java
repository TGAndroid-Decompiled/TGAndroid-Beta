package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PasskeysActivity;
public final class ey7 implements jac {
    public final byte a;
    public final PasskeysActivity b;

    public ey7(PasskeysActivity passkeysActivity, byte b) {
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
                l7c l7cVar = (l7c) obj2;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String M0 = jb6.M0(2131747362, null);
                c6c c6cVar = new c6c(2);
                c6cVar.m = M0;
                c6cVar.k = 2131624114;
                arrayList.add(c6cVar);
                for (int i = 0; i < arrayList2.size(); i++) {
                    m67 m67Var = new m67(passkeysActivity, (byte) 8);
                    int i2 = fy7.b;
                    c6c K = c6c.K(fy7.class);
                    K.H = (TL_account.Passkey) arrayList2.get(i);
                    K.E = m67Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().l4.D.f()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    c6c c = c6c.c(-1, 2131231850, jb6.M0(2131747383, null));
                    c.r = true;
                    arrayList.add(c);
                }
                arrayList.add(c6c.C(gm.D2(gm.N2(jb6.M0(2131747368, null), -1, 0, new kl7(passkeysActivity, (byte) 13), null), true)));
                return;
            default:
                passkeysActivity.b0((TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
