package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class j9 implements Runnable {
    public final int f4104a;
    public final TLObject f4105b;
    public final c20 f4106c;

    public j9(TLObject tLObject, c20 c20Var, int i7) {
        this.f4104a = i7;
        this.f4105b = tLObject;
        this.f4106c = c20Var;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f4104a) {
            case 0:
                TLObject tLObject = this.f4105b;
                boolean z10 = tLObject instanceof TL_account.paidMessagesRevenue;
                c20 c20Var = this.f4106c;
                if (z10) {
                    c20Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    c20Var.a(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f4105b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z9 = true;
                    ui.b0(p10.f24474s0).I1(tL_messages_stickerSet, true);
                    if (!ui.b0(p10.f24474s0).B0(tL_messages_stickerSet.set.f26987id, true)) {
                        ui.b0(p10.f24474s0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z9 = false;
                }
                this.f4106c.a(Boolean.valueOf(z9));
                return;
        }
    }
}
