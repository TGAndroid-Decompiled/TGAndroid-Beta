package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tj6 implements u56 {
    public final ck6 a;

    public tj6(ck6 ck6Var) {
        this.a = ck6Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.i0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        ck6 ck6Var = this.a;
        ArrayList arrayList = ck6Var.j0;
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ck6Var.e0(tL_chatInviteExported2);
            for (int i = 0; i < arrayList.size(); i++) {
                if (((TLRPC.TL_chatInviteExported) arrayList.get(i)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        uj6 k0 = ck6Var.k0();
                        arrayList.remove(i);
                        ck6Var.k0.add(0, tL_chatInviteExported2);
                        ck6Var.m0(k0);
                        return;
                    }
                    arrayList.set(i, tL_chatInviteExported2);
                    ck6Var.n0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            hl.d3(new z56(this, tLObject, (byte) 27), 200L);
        }
    }
}
