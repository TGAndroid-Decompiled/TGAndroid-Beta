package mh;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class c7 implements Runnable {
    public final int f13838a;
    public final TLObject f13839b;
    public final Utilities.Callback f13840c;

    public c7(TLObject tLObject, Utilities.Callback callback, int i10) {
        this.f13838a = i10;
        this.f13839b = tLObject;
        this.f13840c = callback;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f13838a) {
            case 0:
                TLObject tLObject = this.f13839b;
                boolean z10 = tLObject instanceof TL_account.paidMessagesRevenue;
                Utilities.Callback callback = this.f13840c;
                if (z10) {
                    callback.run(Long.valueOf(((TL_account.paidMessagesRevenue) tLObject).stars_amount));
                    return;
                } else {
                    callback.run(0L);
                    return;
                }
            default:
                TLObject tLObject2 = this.f13839b;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f13840c.run(Boolean.valueOf(z4));
                return;
        }
    }
}
