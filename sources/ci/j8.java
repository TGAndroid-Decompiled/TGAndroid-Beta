package ci;

import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class j8 implements Runnable {
    public final int f5344a;
    public final TLObject f5345b;
    public final u10 f5346c;

    public j8(TLObject tLObject, u10 u10Var, int i3) {
        this.f5344a = i3;
        this.f5345b = tLObject;
        this.f5346c = u10Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f5344a) {
            case 0:
                TLObject tLObject = this.f5345b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                u10 u10Var = this.f5346c;
                if (z11) {
                    u10Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    u10Var.a(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f5345b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z10 = true;
                    li.b0(h10.f22829t0).I1(tL_messages_stickerSet, true);
                    if (!li.b0(h10.f22829t0).B0(tL_messages_stickerSet.set.f27028id, true)) {
                        li.b0(h10.f22829t0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.f5346c.a(Boolean.valueOf(z10));
                return;
        }
    }
}
