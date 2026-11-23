package di;

import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e8 implements Runnable {
    public final int f8705a;
    public final TLObject f8706b;
    public final w10 f8707c;

    public e8(TLObject tLObject, w10 w10Var, int i7) {
        this.f8705a = i7;
        this.f8706b = tLObject;
        this.f8707c = w10Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f8705a) {
            case 0:
                TLObject tLObject = this.f8706b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                w10 w10Var = this.f8707c;
                if (z11) {
                    w10Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    w10Var.a(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f8706b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z10 = true;
                    ri.d0(i10.f24637t0).N1(tL_messages_stickerSet, true);
                    if (!ri.d0(i10.f24637t0).E0(tL_messages_stickerSet.set.f28519id, true)) {
                        ri.d0(i10.f24637t0).k2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.f8707c.a(Boolean.valueOf(z10));
                return;
        }
    }
}
