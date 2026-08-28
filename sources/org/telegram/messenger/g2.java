package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class g2 implements Utilities.Callback {
    public final int f20347a;
    public final Object f20348b;
    public final Object f20349c;
    public final Object d;

    public g2(Object obj, Object obj2, Object obj3, int i9) {
        this.f20347a = i9;
        this.f20348b = obj;
        this.f20349c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20347a) {
            case 0:
                ((FactCheckController) this.f20348b).lambda$getFactCheck$0((FactCheckController.Key) this.f20349c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f20348b, (TL_stories.TL_premium_boostsStatus) this.f20349c, (d5.d) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f20348b).lambda$requestReferenceFromServer$1((String) this.f20349c, (String) this.d, (ih.e6) obj);
                return;
            case 3:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f20348b, (org.telegram.ui.Components.o9) this.f20349c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            case 4:
                MediaDataController.lambda$fillWithAnimatedEmoji$226((boolean[]) this.f20348b, (ArrayList[]) this.f20349c, (Runnable) this.d, (ArrayList) obj);
                return;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f20348b, (TL_bots.BotInfo[]) this.f20349c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
