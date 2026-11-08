package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class j9 implements Runnable {
    public final int f4107a;
    public final TLObject f4108b;
    public final c20 f4109c;

    public j9(TLObject tLObject, c20 c20Var, int i7) {
        this.f4107a = i7;
        this.f4108b = tLObject;
        this.f4109c = c20Var;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f4107a) {
            case 0:
                TLObject tLObject = this.f4108b;
                boolean z10 = tLObject instanceof TL_account.paidMessagesRevenue;
                c20 c20Var = this.f4109c;
                if (z10) {
                    c20Var.a(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    c20Var.a(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f4108b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    z9 = true;
                    ui.b0(p10.f24470s0).I1(tL_messages_stickerSet, true);
                    if (!ui.b0(p10.f24470s0).B0(tL_messages_stickerSet.set.f26983id, true)) {
                        ui.b0(p10.f24470s0).f2(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                } else {
                    z9 = false;
                }
                this.f4109c.a(Boolean.valueOf(z9));
                return;
        }
    }
}
