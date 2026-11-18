package di;

import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d8 implements Runnable {
    public final int f8663a;
    public final TLObject f8664b;
    public final x10 f8665c;

    public d8(TLObject tLObject, x10 x10Var, int i7) {
        this.f8663a = i7;
        this.f8664b = tLObject;
        this.f8665c = x10Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f8663a) {
            case 0:
                TLObject tLObject = this.f8664b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                x10 x10Var = this.f8665c;
                if (z11) {
                    x10Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    x10Var.a(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f8664b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z10 = true;
                    ri.d0(j10.f24773t0).N1(tL_messages_stickerSet, true);
                    if (!ri.d0(j10.f24773t0).E0(tL_messages_stickerSet.set.f28432id, true)) {
                        ri.d0(j10.f24773t0).k2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.f8665c.a(Boolean.valueOf(z10));
                return;
        }
    }
}
