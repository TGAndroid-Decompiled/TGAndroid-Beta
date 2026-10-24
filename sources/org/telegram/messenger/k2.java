package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class k2 implements Utilities.Callback {
    public final int f18809a;
    public final Object f18810b;
    public final Object f18811c;
    public final Object d;

    public k2(Object obj, Object obj2, Object obj3, int i10) {
        this.f18809a = i10;
        this.f18810b = obj;
        this.f18811c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18809a) {
            case 0:
                ((FactCheckController) this.f18810b).lambda$getFactCheck$0((FactCheckController.Key) this.f18811c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f18810b, (TL_stories.TL_premium_boostsStatus) this.f18811c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f18810b).lambda$requestReferenceFromServer$1((String) this.f18811c, (String) this.d, (ci.r6) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f18810b, (ArrayList[]) this.f18811c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f18810b, (org.telegram.ui.Components.u9) this.f18811c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$502((boolean[]) this.f18810b, (TL_bots.BotInfo[]) this.f18811c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
