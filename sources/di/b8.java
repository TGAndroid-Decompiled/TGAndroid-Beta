package di;

import org.telegram.messenger.m10;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class b8 implements Runnable {
    public final int f8254a;
    public final TLObject f8255b;
    public final z10 f8256c;

    public b8(TLObject tLObject, z10 z10Var, int i7) {
        this.f8254a = i7;
        this.f8255b = tLObject;
        this.f8256c = z10Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f8254a) {
            case 0:
                TLObject tLObject = this.f8255b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                z10 z10Var = this.f8256c;
                if (z11) {
                    z10Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    z10Var.a(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f8255b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z10 = true;
                    si.b0(m10.f24934t0).I1(tL_messages_stickerSet, true);
                    if (!si.b0(m10.f24934t0).B0(tL_messages_stickerSet.set.f28078id, true)) {
                        si.b0(m10.f24934t0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z10 = false;
                }
                this.f8256c.a(Boolean.valueOf(z10));
                return;
        }
    }
}
