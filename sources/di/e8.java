package di;

import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e8 implements Runnable {
    public final int f8744a;
    public final TLObject f8745b;
    public final y10 f8746c;

    public e8(TLObject tLObject, y10 y10Var, int i7) {
        this.f8744a = i7;
        this.f8745b = tLObject;
        this.f8746c = y10Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f8744a) {
            case 0:
                TLObject tLObject = this.f8745b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                y10 y10Var = this.f8746c;
                if (z11) {
                    y10Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    y10Var.a(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f8745b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z10 = true;
                    si.d0(k10.f24968t0).N1(tL_messages_stickerSet, true);
                    if (!si.d0(k10.f24968t0).E0(tL_messages_stickerSet.set.f28461id, true)) {
                        si.d0(k10.f24968t0).k2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.f8746c.a(Boolean.valueOf(z10));
                return;
        }
    }
}
