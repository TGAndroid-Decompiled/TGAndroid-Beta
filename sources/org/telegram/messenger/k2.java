package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class k2 implements Utilities.Callback {
    public final int f18810a;
    public final Object f18811b;
    public final Object f18812c;
    public final Object d;

    public k2(Object obj, Object obj2, Object obj3, int i10) {
        this.f18810a = i10;
        this.f18811b = obj;
        this.f18812c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18810a) {
            case 0:
                ((FactCheckController) this.f18811b).lambda$getFactCheck$0((FactCheckController.Key) this.f18812c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f18811b, (TL_stories.TL_premium_boostsStatus) this.f18812c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f18811b).lambda$requestReferenceFromServer$1((String) this.f18812c, (String) this.d, (ci.r6) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f18811b, (ArrayList[]) this.f18812c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f18811b, (org.telegram.ui.Components.w9) this.f18812c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$502((boolean[]) this.f18811b, (TL_bots.BotInfo[]) this.f18812c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
