package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class g2 implements Utilities.Callback {
    public final int f17931a;
    public final Object f17932b;
    public final Object f17933c;
    public final Object d;

    public g2(Object obj, Object obj2, Object obj3, int i10) {
        this.f17931a = i10;
        this.f17932b = obj;
        this.f17933c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17931a) {
            case 0:
                ((FactCheckController) this.f17932b).lambda$getFactCheck$0((FactCheckController.Key) this.f17933c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f17932b, (TL_stories.TL_premium_boostsStatus) this.f17933c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f17932b).lambda$requestReferenceFromServer$1((String) this.f17933c, (String) this.d, (ai.u8) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f17932b, (ArrayList[]) this.f17933c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f17932b, (org.telegram.ui.Components.y9) this.f17933c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$502((boolean[]) this.f17932b, (TL_bots.BotInfo[]) this.f17933c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
