package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj6 implements r56 {
    public final ak6 a;

    public rj6(ak6 ak6Var) {
        this.a = ak6Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.j0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        ak6 ak6Var = this.a;
        ArrayList arrayList = ak6Var.j0;
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ak6Var.f0(tL_chatInviteExported2);
            for (int i = 0; i < arrayList.size(); i++) {
                if (((TLRPC.TL_chatInviteExported) arrayList.get(i)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        sj6 l0 = ak6Var.l0();
                        arrayList.remove(i);
                        ak6Var.k0.add(0, tL_chatInviteExported2);
                        ak6Var.n0(l0);
                        return;
                    }
                    arrayList.set(i, tL_chatInviteExported2);
                    ak6Var.o0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            gm.d3(new lj6(this, tLObject, (byte) 1), 200L);
        }
    }
}
