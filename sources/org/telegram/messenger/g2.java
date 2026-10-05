package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class g2 implements Utilities.Callback {
    public final int f17907a;
    public final Object f17908b;
    public final Object f17909c;
    public final Object d;

    public g2(Object obj, Object obj2, Object obj3, int i10) {
        this.f17907a = i10;
        this.f17908b = obj;
        this.f17909c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17907a) {
            case 0:
                ((FactCheckController) this.f17908b).lambda$getFactCheck$0((FactCheckController.Key) this.f17909c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f17908b, (TL_stories.TL_premium_boostsStatus) this.f17909c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f17908b).lambda$requestReferenceFromServer$1((String) this.f17909c, (String) this.d, (ai.t8) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f17908b, (ArrayList[]) this.f17909c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f17908b, (org.telegram.ui.Components.w9) this.f17909c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$499((boolean[]) this.f17908b, (TL_bots.BotInfo[]) this.f17909c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
