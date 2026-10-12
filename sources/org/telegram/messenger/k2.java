package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class k2 implements Utilities.Callback {
    public final int f18026a;
    public final Object f18027b;
    public final Object f18028c;
    public final Object d;

    public k2(Object obj, Object obj2, Object obj3, int i10) {
        this.f18026a = i10;
        this.f18027b = obj;
        this.f18028c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18026a) {
            case 0:
                ((FactCheckController) this.f18027b).lambda$getFactCheck$0((FactCheckController.Key) this.f18028c, (MessageObject) this.d, (TLRPC.TL_factCheck) obj);
                return;
            case 1:
                ChannelBoostsController.lambda$userCanBoostChannel$2((ChannelBoostsController.CanApplyBoost) this.f18027b, (TL_stories.TL_premium_boostsStatus) this.f18028c, (Utilities.Callback) this.d, (TL_stories.TL_premium_myBoosts) obj);
                return;
            case 2:
                ((FileRefController) this.f18027b).lambda$requestReferenceFromServer$1((String) this.f18028c, (String) this.d, (ai.u8) obj);
                return;
            case 3:
                MediaDataController.lambda$fillWithAnimatedEmoji$227((boolean[]) this.f18027b, (ArrayList[]) this.f18028c, (Runnable) this.d, (ArrayList) obj);
                return;
            case 4:
                MediaDataController.lambda$setPlaceholderImage$31((String) this.f18027b, (org.telegram.ui.Components.y9) this.f18028c, (String) this.d, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                MessagesController.lambda$openApp$502((boolean[]) this.f18027b, (TL_bots.BotInfo[]) this.f18028c, (Runnable) this.d, (TLRPC.UserFull) obj);
                return;
        }
    }
}
