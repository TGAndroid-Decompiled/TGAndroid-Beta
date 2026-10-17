package ai;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class m9 implements Runnable {
    public final int f1861a;
    public final TLObject f1862b;
    public final Utilities.Callback f1863c;

    public m9(TLObject tLObject, Utilities.Callback callback, int i10) {
        this.f1861a = i10;
        this.f1862b = tLObject;
        this.f1863c = callback;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f1861a) {
            case 0:
                TLObject tLObject = this.f1862b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                Utilities.Callback callback = this.f1863c;
                if (z11) {
                    callback.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    callback.run(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f1862b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1863c.run(Boolean.valueOf(z10));
                return;
        }
    }
}
