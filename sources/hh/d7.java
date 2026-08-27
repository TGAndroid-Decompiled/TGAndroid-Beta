package hh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class d7 implements Runnable {

    public final int f9134a;

    public final TLObject f9135b;

    public final Utilities.Callback f9136c;

    public d7(TLObject tLObject, Utilities.Callback callback, int i10) {
        this.f9134a = i10;
        this.f9135b = tLObject;
        this.f9136c = callback;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f9134a) {
            case 0:
                TLObject tLObject = this.f9135b;
                boolean z11 = tLObject instanceof TL_account.paidMessagesRevenue;
                Utilities.Callback callback = this.f9136c;
                if (!z11) {
                    callback.run(0L);
                } else {
                    callback.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                }
                break;
            default:
                TLObject tLObject2 = this.f9135b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id)) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9136c.run(Boolean.valueOf(z10));
                break;
        }
    }
}
