package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class g2 implements Utilities.Callback {
    public final int f17895a;
    public final Object f17896b;
    public final Object f17897c;
    public final Object d;

    public g2(Object obj, Object obj2, Object obj3, int i10) {
        this.f17895a = i10;
        this.f17896b = obj;
        this.f17897c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17895a) {
            case 0:
                ((FactCheckController) this.f17896b).lambda$getFactCheck$0((FactCheckController.Key) this.f17897c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f17896b, (TL_stories.TL_premium_boostsStatus) this.f17897c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f17896b).lambda$requestReferenceFromServer$1((String) this.f17897c, (String) this.d, (ai.u8) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f17896b, (ArrayList[]) this.f17897c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f17896b, (org.telegram.ui.Components.y9) this.f17897c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$502((boolean[]) this.f17896b, (TL_bots.BotInfo[]) this.f17897c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
