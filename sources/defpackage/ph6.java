package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph6 implements r36 {
    public final yh6 a;

    public ph6(yh6 yh6Var) {
        this.a = yh6Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.a.i0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        yh6 yh6Var = this.a;
        ArrayList arrayList = yh6Var.j0;
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            yh6Var.e0(tL_chatInviteExported2);
            for (int i = 0; i < arrayList.size(); i++) {
                if (((TLRPC.TL_chatInviteExported) arrayList.get(i)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        qh6 k0 = yh6Var.k0();
                        arrayList.remove(i);
                        yh6Var.k0.add(0, tL_chatInviteExported2);
                        yh6Var.m0(k0);
                        return;
                    }
                    arrayList.set(i, tL_chatInviteExported2);
                    yh6Var.n0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            gl.e3(new oh6(this, tLObject, (byte) 0), 200L);
        }
    }
}
